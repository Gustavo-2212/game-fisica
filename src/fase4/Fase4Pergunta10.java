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

public class Fase4Pergunta10 extends JFrame {

	private JPanel contentPane;
	private static Pontuacao pont;
	private String[][] teste;
	private JLabel lblFundo, lblA, lblB, lblC, lblD, lblE, lblVoltar, lblInstr;
	private JTextArea txtPerg1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase4Pergunta10 frame = new Fase4Pergunta10(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fase4Pergunta10(Pontuacao p) {
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
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		lblVoltar = new JLabel("");
		lblVoltar.setBounds(16, 5, 48, 47);
		contentPane.add(lblVoltar);
		
		lblInstr = new JLabel("");
		lblInstr.setBounds(762, 0, 57, 58);
		contentPane.add(lblInstr);

		lblA = new JLabel("  " + teste[0][1]);
		lblA.setBounds(183, 182, 221, 30);	
		contentPane.add(lblA);

		lblB = new JLabel("  " + teste[0][2]);
		lblB.setBounds(183, 234, 221, 30);
		contentPane.add(lblB);

		lblC = new JLabel("  " + teste[0][3]);
		lblC.setBounds(183, 284, 221, 30);
		contentPane.add(lblC);

		lblD = new JLabel("  " + teste[0][4]);
		lblD.setBounds(183, 334, 221, 30);
		contentPane.add(lblD);

		lblE = new JLabel("  " + teste[0][5]);
		lblE.setBounds(183, 384, 221, 30);
		contentPane.add(lblE);

		txtPerg1 = new JTextArea(teste[0][0]);
		txtPerg1.setBounds(70, 67, 470, 70);
		//txtPerg1.setBorder(new LineBorder(Color.BLACK));
		txtPerg1.setEditable(false);
		txtPerg1.setLineWrap(true);
		txtPerg1.setWrapStyleWord(true);
		txtPerg1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtPerg1.setForeground(Color.BLACK);
		contentPane.add(txtPerg1);

		lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("imgs\\mundo4perg.png"));
		lblFundo.setBounds(0, 0, 819, 458);
		contentPane.add(lblFundo);
	}

	public void criaAcao() {
		lblInstr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Instrucoes inst = new Instrucoes(pont, "mundo4perg");
				inst.setVisible(true);
				Fase4Pergunta10.this.dispose();
			}
		});
		
		lblVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Fase4 fase4 = new Fase4(pont);
				pont.setTiraQuestaoResp();
				pont.setDelPerg(10);
				fase4.setVisible(true);
				Fase4Pergunta10.this.dispose();
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
		teste = perg.carregaPergunta(10, 4);
	}

	public class Movimento extends Thread {
		public void run() {
			try{Thread.sleep(500);}catch(Exception e) {}
			if(pont.getQuestaoRespondida() == 40){
				pont.delPerg();
				Fase5 fase5 = new Fase5(pont);
				fase5.setVisible(true);
				Fase4Pergunta10.this.dispose();
			}else{
				proximaQuestao();
			}
		}
	}

	public void proximaQuestao() {
		Fase4 fase4 = new Fase4(pont);
		fase4.setVisible(true);
		Fase4Pergunta10.this.dispose();
	}
}

