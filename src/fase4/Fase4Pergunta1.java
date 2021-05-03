package fase4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import dados.Perguntas;
import dados.Pontuacao;
import fase3.Fase3;
import fase3.Fase3Pergunta10;
import fase3.Fase3Pergunta9;
import fase4.Fase4Pergunta1;
import fase4.Fase4Pergunta1.Movimento;
import fase5.Fase5;
import iftm.edu.Instrucoes;
import iftm.edu.TelaPontuacao;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Fase4Pergunta1 extends JFrame {

	private JPanel contentPane;
	private static Pontuacao pont;
	private String[][] teste;
	private JLabel lblFundo, lblA, lblB, lblC, lblD, lblE;
	private JTextArea txtPerg1;
	private JLabel lblVoltar;
	private JLabel lblInstr;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase4Pergunta1 frame = new Fase4Pergunta1(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fase4Pergunta1(Pontuacao p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 445);
		contentPane = new JPanel();
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		this.pont = p;
		carregaQuestao();
		criaComponente();
		criaAcao();
	}

	public void criaComponente() {
		//Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		lblA = new JLabel("  " + teste[0][1]);
		lblA.setBounds(183, 176, 221, 29);
		//lblA.setBorder(border);
		//lblA.setOpaque(true);
		//lblA.setBackground(Color.white);
		contentPane.add(lblA);

		lblB = new JLabel("  " + teste[0][2]);
		lblB.setBounds(183, 228, 221, 29);
		//lblB.setBorder(border);
		//lblB.setOpaque(true);
		//lblB.setBackground(Color.white);
		contentPane.add(lblB);

		lblC = new JLabel("  " + teste[0][3]);
		lblC.setBounds(183, 278, 221, 29);
		//lblC.setBorder(border);
		//lblC.setOpaque(true);
		//lblC.setBackground(Color.white);
		contentPane.add(lblC);

		lblD = new JLabel("  " + teste[0][4]);
		lblD.setBounds(183, 328, 221, 29);
		//lblD.setBorder(border);
		//lblD.setOpaque(true);
		//lblD.setBackground(Color.white);
		contentPane.add(lblD);

		lblE = new JLabel("  " + teste[0][5]);
		lblE.setBounds(183, 378, 221, 29);
		//lblE.setBorder(border);
		//lblE.setOpaque(true);
		//lblE.setBackground(Color.white);
		contentPane.add(lblE);

		txtPerg1 = new JTextArea(teste[0][0]);
		txtPerg1.setBounds(70, 60, 460, 70);
		txtPerg1.setEditable(false);
		txtPerg1.setLineWrap(true);
		txtPerg1.setWrapStyleWord(true);
		txtPerg1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtPerg1.setForeground(Color.BLACK);
		contentPane.add(txtPerg1);
		
		lblVoltar = new JLabel("");
		lblVoltar.setBounds(16, 5, 48, 47);
		contentPane.add(lblVoltar);
		
		lblInstr = new JLabel("");
		lblInstr.setBounds(752, 11, 57, 58);
		contentPane.add(lblInstr);

		lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("imgs\\mundo4perg.png"));
		lblFundo.setBounds(0, 0, 809, 445);
		contentPane.add(lblFundo);
	}

	public void criaAcao() {
		lblInstr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Instrucoes inst = new Instrucoes(pont, "mundo4perg");
				inst.setVisible(true);
				Fase4Pergunta1.this.dispose();
			}
		});
		
		lblVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Fase4 fase4 = new Fase4(pont);
				pont.setTiraQuestaoResp();
				pont.setDelPerg(1);
				fase4.setVisible(true);
				Fase4Pergunta1.this.dispose();
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
				pont.pont(1.0);
				lblB.setOpaque(true);
				lblB.setBackground(Color.GREEN);
				new Movimento().start();
			}
		});

		lblC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pont.pont(-0.3);
				lblC.setOpaque(true);
				lblC.setBackground(Color.RED);
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

	public void carregaQuestao() {
		Perguntas perg = new Perguntas();
		teste = perg.carregaPergunta(1, 4);
	}

	public class Movimento extends Thread {
		public void run() {
			try{Thread.sleep(500);}catch(Exception e) {}
			if(pont.getQuestaoRespondida() == 40){
				pont.delPerg();
				Fase5 fase5 = new Fase5(pont);
				fase5.setVisible(true);
				Fase4Pergunta1.this.dispose();
			}else{
				proximaQuestao();
			}
		}
	}

	public void proximaQuestao() {
		Fase4 fase4 = new Fase4(pont);
		fase4.setVisible(true);
		Fase4Pergunta1.this.dispose();
	}
}

