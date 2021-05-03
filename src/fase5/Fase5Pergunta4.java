package fase5;

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
import fase5.Fase5Pergunta1;
import fase5.Fase5Pergunta1.Movimento;
import iftm.edu.Instrucoes;
import iftm.edu.TelaPontuacao;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Fase5Pergunta4 extends JFrame {

	private JPanel contentPane;
	private static Pontuacao pont;
	private String[][] teste;
	private JLabel lblFundo, lblA, lblB, lblC, lblD, lblE, lblVoltar, lblInstr;
	private JTextArea txtPerg1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase5Pergunta4 frame = new Fase5Pergunta4(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fase5Pergunta4(Pontuacao p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 420);
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
		lblVoltar = new JLabel("");
		lblVoltar.setBounds(16, 5, 48, 47);
		contentPane.add(lblVoltar);
		
		lblInstr = new JLabel("");
		lblInstr.setBounds(752, 11, 57, 58);
		contentPane.add(lblInstr);
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		lblA = new JLabel("  " + teste[0][1]);
		lblA.setBounds(15, 160, 780, 40);
		lblA.setBorder(border);
		lblA.setOpaque(true);
		lblA.setBackground(Color.white);
		contentPane.add(lblA);

		lblB = new JLabel("  " + teste[0][2]);
		lblB.setBounds(15, 215, 780, 40);
		lblB.setBorder(border);
		lblB.setOpaque(true);
		lblB.setBackground(Color.white);
		contentPane.add(lblB);

		lblC = new JLabel("  " + teste[0][3]);
		lblC.setBounds(15, 265, 780, 40);
		lblC.setBorder(border);
		lblC.setOpaque(true);
		lblC.setBackground(Color.white);
		contentPane.add(lblC);

		lblD = new JLabel("  " + teste[0][4]);
		lblD.setBounds(15, 320, 780, 40);
		lblD.setBorder(border);
		lblD.setOpaque(true);
		lblD.setBackground(Color.white);
		contentPane.add(lblD);

		lblE = new JLabel("  " + teste[0][5]);
		lblE.setBounds(15, 373, 780, 40);
		lblE.setBorder(border);
		lblE.setOpaque(true);
		lblE.setBackground(Color.white);
		contentPane.add(lblE);

		txtPerg1 = new JTextArea(teste[0][0]);
		txtPerg1.setBounds(87, 60, 500, 70);
		//txtPerg1.setBorder(new LineBorder(Color.BLACK));
		txtPerg1.setEditable(false);
		txtPerg1.setLineWrap(true);
		txtPerg1.setWrapStyleWord(true);
		txtPerg1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		txtPerg1.setForeground(Color.BLACK);
		contentPane.add(txtPerg1);

		lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("imgs\\mundo5perg.png"));
		lblFundo.setBounds(0, 0, 819, 454);
		contentPane.add(lblFundo);
	}

	public void criaAcao() {
		lblInstr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Instrucoes inst = new Instrucoes(pont, "mundo5perg");
				inst.setVisible(true);
				Fase5Pergunta4.this.dispose();
			}
		});
		
		lblVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Fase5 fase5 = new Fase5(pont);
				pont.setTiraQuestaoResp();
				pont.setDelPerg(4);
				fase5.setVisible(true);
				Fase5Pergunta4.this.dispose();
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
		teste = perg.carregaPergunta(4, 5);
	}

	public class Movimento extends Thread {
		public void run() {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
	
			if (pont.getQuestaoRespondida() == 50) {
				pont.delPerg();
				TelaPontuacao telaPont = new TelaPontuacao(pont);
				telaPont.setVisible(true);
				Fase5Pergunta4.this.dispose();
			} else {
				proximaQuestao();
			}
		}
	}

	public void proximaQuestao() {
		Fase5 fase5 = new Fase5(pont);
		fase5.setVisible(true);
		Fase5Pergunta4.this.dispose();
	}
}


