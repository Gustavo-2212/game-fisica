package fase3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import dados.Perguntas;
import dados.Pontuacao;
import fase2.Fase2Pergunta10;
import fase3.Fase3Pergunta1;
import fase3.Fase3Pergunta1.Movimento;
import fase4.Fase4;
import iftm.edu.Instrucoes;
import iftm.edu.TelaPontuacao;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Fase3Pergunta10 extends JFrame {

	private JPanel contentPane;
	private static Pontuacao pont;
	private String[][] teste;
	private JLabel lblFundo, lblA, lblB, lblC, lblD, lblE, lblVoltar, lblInstr;
	private JTextArea txtPerg1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase3Pergunta10 frame = new Fase3Pergunta10(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fase3Pergunta10(Pontuacao p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 458);
		contentPane = new JPanel();
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.pont = p;
		carregaQuestao();
		criaComponente();
		criaAcao();
	}

	public void criaComponente() {
		lblVoltar = new JLabel("");
		lblVoltar.setBounds(16, 5, 48, 47);
		contentPane.add(lblVoltar);
		
		lblInstr = new JLabel("");
		lblInstr.setBounds(762, 0, 57, 58);
		contentPane.add(lblInstr);

		lblA = new JLabel("  " + teste[0][1]);
		lblA.setBounds(207, 150, 212, 27);
		contentPane.add(lblA);

		lblB = new JLabel("  " + teste[0][2]);
		lblB.setBounds(207, 201, 212, 27);
		contentPane.add(lblB);

		lblC = new JLabel("  " + teste[0][3]);
		lblC.setBounds(207, 250, 212, 27);
		contentPane.add(lblC);

		lblD = new JLabel("  " + teste[0][4]);
		lblD.setBounds(207, 300, 212, 27);
		contentPane.add(lblD);

		lblE = new JLabel("  " + teste[0][5]);
		lblE.setBounds(207, 350, 212, 27);
		contentPane.add(lblE);

		txtPerg1 = new JTextArea(teste[0][0]);
		txtPerg1.setBounds(76, 28, 489, 80);
		txtPerg1.setBorder(new LineBorder(Color.BLACK));
		txtPerg1.setEditable(false);
		txtPerg1.setLineWrap(true);
		txtPerg1.setWrapStyleWord(true);
		txtPerg1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtPerg1.setForeground(Color.BLACK);
		contentPane.add(txtPerg1);

		lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("imgs\\imgPerg1Fase3.png"));
		lblFundo.setBounds(0, 0, 819, 458);
		contentPane.add(lblFundo);
	}

	public void criaAcao() {
		lblInstr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Instrucoes inst = new Instrucoes(pont, "fase3Perg10");
				inst.setVisible(true);
				Fase3Pergunta10.this.dispose();
			}
		});
		
		lblVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Fase3 fase3 = new Fase3(pont);
				pont.setTiraQuestaoResp();
				pont.setDelPerg(10);
				fase3.setVisible(true);
				Fase3Pergunta10.this.dispose();
			}
		});
		
		lblA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pont.pont(1.0);
				lblA.setOpaque(true);
				lblA.setBackground(Color.GREEN);
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
		teste = perg.carregaPergunta(10, 3);
	}

	public class Movimento extends Thread {
		public void run() {
			try{Thread.sleep(500);}catch(Exception e) {}
			if(pont.getQuestaoRespondida() == 30){
				pont.delPerg();
				Fase4 fase4 = new Fase4(pont);
				fase4.setVisible(true);
				Fase3Pergunta10.this.dispose();
			}else{
				proximaQuestao();
			}
		}
	}

	public void proximaQuestao() {
		Fase3 fase3 = new Fase3(pont);
		fase3.setVisible(true);
		Fase3Pergunta10.this.dispose();
	}
}
