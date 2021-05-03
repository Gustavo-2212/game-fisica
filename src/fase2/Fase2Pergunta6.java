package fase2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import dados.Perguntas;
import dados.Pontuacao;
import fase2.Fase2Pergunta1.Movimento;
import fase3.Fase3;
import iftm.edu.ImgFundo;
import iftm.edu.Instrucoes;

import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Fase2Pergunta6 extends JFrame {

	private static Pontuacao pont;
	private JPanel contentPane;
	private JTextArea txtPerg1;
	private JLabel lblA, lblB, lblC, lblD, lblE, lblVoltar, lblInstr;
	private String[][] teste;
	private JLabel label;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase2Pergunta6 frame = new Fase2Pergunta6(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fase2Pergunta6(Pontuacao p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 476);
		contentPane = new ImgFundo("16");
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.pont = p;
		
		carregaQuestao();
		criaComponente();
		criaAcao();
	}
	
	public void criaComponente(){
		lblVoltar = new JLabel("");
		lblVoltar.setBounds(0, 0, 48, 47);
		contentPane.add(lblVoltar);
		
		lblInstr = new JLabel("");
		lblInstr.setBounds(766, 0, 53, 48);
		contentPane.add(lblInstr);
		
		txtPerg1 = new JTextArea(teste[0][0]);
		txtPerg1.setBounds(278, 25, 488, 110);
		txtPerg1.setBorder(new LineBorder(Color.BLACK));
		txtPerg1.setEditable(false);
		txtPerg1.setLineWrap(true);
		txtPerg1.setWrapStyleWord(true);
		txtPerg1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtPerg1.setForeground(Color.BLACK);
		contentPane.add(txtPerg1);
		
		lblA = new JLabel(teste[0][1]);
		lblA.setBounds(407, 159, 336, 29);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblA);
		
		lblB = new JLabel(teste[0][2]);
		lblB.setBounds(407, 214, 336, 29);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblB);
		
		lblC = new JLabel(teste[0][3]);
		lblC.setBounds(407, 261, 337, 29);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblC);
		
		lblD = new JLabel(teste[0][4]);
		lblD.setBounds(407, 316, 336, 29);
		lblD.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblD);
		
		lblE = new JLabel(teste[0][5]);
		lblE.setBounds(407, 370, 337, 29);
		lblE.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblE);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("imgs\\fase2-6.png"));
		label.setBounds(0, 0, 819, 484);
		contentPane.add(label);
	}
	
	public void carregaQuestao(){
		Perguntas perg = new Perguntas();
		teste = perg.carregaPergunta(6, 2);
	}
	
	public void criaAcao(){
		lblInstr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Instrucoes inst = new Instrucoes(pont, "fase2Perg6");
				inst.setVisible(true);
				Fase2Pergunta6.this.dispose();
			}
		});
		
		lblVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Fase2 fase2 = new Fase2(pont);
				pont.setTiraQuestaoResp();
				pont.setDelPerg(6);
				fase2.setVisible(true);
				Fase2Pergunta6.this.dispose();
			}
		});
		
		lblA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pont.pont(-0.3);
				lblA.setOpaque(true);
				lblA.setBackground(Color.RED);
				new Movimento().start();
			}
		});

		lblB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pont.pont(-0.3);
				lblB.setOpaque(true);
				lblB.setBackground(Color.RED);
				new Movimento().start();
			}
		});

		lblC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pont.pont(1.0);
				lblC.setOpaque(true);
				lblC.setBackground(Color.GREEN);
				new Movimento().start();
			}
		});

		lblD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pont.pont(-0.3);
				lblD.setOpaque(true);
				lblD.setBackground(Color.RED);
				new Movimento().start();
			}
		});

		lblE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pont.pont(-0.3);
				lblE.setOpaque(true);
				lblE.setBackground(Color.RED);
				new Movimento().start();
			}
		});
	}
	
	public class Movimento extends Thread {
		public void run() {
			try{Thread.sleep(500);}catch(Exception e) {}
			if(pont.getQuestaoRespondida() == 20){
				pont.delPerg();
				Fase3 fase3 = new Fase3(pont);
				fase3.setVisible(true);
				Fase2Pergunta6.this.dispose();
			}else{
				proximaQuestao();
			}
		}
	}
	
	public void proximaQuestao() {
		Fase2 fase2 = new Fase2(pont);
		fase2.setVisible(true);
		Fase2Pergunta6.this.dispose();
	}
}
