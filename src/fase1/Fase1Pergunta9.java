package fase1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import dados.Perguntas;
import dados.Pontuacao;
import fase1.Fase1Pergunta8.Movimento;
import fase2.Fase2;
import iftm.edu.ImgFundo;
import iftm.edu.Instrucoes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fase1Pergunta9 extends JFrame {
	private static Pontuacao pont;
	private JPanel contentPane;
	private String[][] teste;
	private JLabel lblA, lblB, lblC, lblD, lblE, lblVoltar, lblIntr;
	private JTextArea txtPerg1;
	int num = 0;
	private JLabel label;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase1Pergunta9 frame = new Fase1Pergunta9(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fase1Pergunta9(Pontuacao p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 450);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		contentPane = new ImgFundo("9");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.pont = p;
		carregaQuestao();
		componente();
		criaAcao();
	}

	public void componente() {
		lblVoltar = new JLabel("");
		lblVoltar.setBounds(0, 0, 48, 47);
		contentPane.add(lblVoltar);
		
		lblIntr = new JLabel("");
		lblIntr.setBounds(758, 6, 55, 54);
		contentPane.add(lblIntr);
		
		txtPerg1 = new JTextArea(teste[0][0]);
		txtPerg1.setEditable(false);
		txtPerg1.setLineWrap(true);
		txtPerg1.setWrapStyleWord(true);
		txtPerg1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtPerg1.setForeground(Color.BLACK);
		txtPerg1.setBounds(165, 54, 473, 73);
		contentPane.add(txtPerg1);

		lblA = new JLabel(" " + teste[0][1]);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblA.setBounds(223, 158, 219, 29);
		contentPane.add(lblA);

		lblB = new JLabel(" " + teste[0][2]);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblB.setBounds(223, 198, 219, 29);
		contentPane.add(lblB);

		lblC = new JLabel(" " + teste[0][3]);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblC.setBounds(223, 243, 219, 29);
		contentPane.add(lblC);

		lblD = new JLabel(" " + teste[0][4]);
		lblD.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblD.setBounds(223, 283, 219, 29);
		contentPane.add(lblD);

		lblE = new JLabel(" " + teste[0][5]);
		lblE.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblE.setBounds(223, 323, 219, 29);
		contentPane.add(lblE);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("imgs\\imgPergunta9.png"));
		label.setBounds(2, 0, 817, 454);
		contentPane.add(label);
	}

	public void criaAcao() {
		lblIntr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Instrucoes inst = new Instrucoes(pont, "fase1Perg9");
				inst.setVisible(true);
				Fase1Pergunta9.this.dispose();
			}
		});
		
		lblVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Fase1 fase1 = new Fase1(pont);
				pont.setTiraQuestaoResp();
				pont.setDelPerg(9);
				fase1.setVisible(true);
				Fase1Pergunta9.this.dispose();
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
	
	public void carregaQuestao() {
		Perguntas perg = new Perguntas();
		teste = perg.carregaPergunta(9, 1);
	}

	public class Movimento extends Thread {
		public void run() {
			try{Thread.sleep(500);}catch(Exception e) {}
			if(pont.getQuestaoRespondida() == 10){
				pont.delPerg();
				Fase2 fase2 = new Fase2(pont);
				fase2.setVisible(true);
				Fase1Pergunta9.this.dispose();
			}else{
				proximaQuestao();
			}
		}
	}

	public void proximaQuestao() {
		Fase1 fase1 = new Fase1(pont);
		fase1.setVisible(true);
		Fase1Pergunta9.this.dispose();
	}
}
