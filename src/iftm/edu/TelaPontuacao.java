package iftm.edu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dados.Pontuacao;
import fase1.Fase1;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;

public class TelaPontuacao extends JFrame {

	private JPanel contentPane;
	private JLabel lblPontuacao, lblFundo;
	private static Pontuacao pont;
	private JLabel lblJogarNovamente, lblVoltarMenu;
	private NumberFormat doubleformat;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPontuacao frame = new TelaPontuacao(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaPontuacao(Pontuacao p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 470);
		contentPane = new JPanel();
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.pont = p;
		criaComponente();
		criaAcao();
	}
	
	public void criaComponente(){
		doubleformat = NumberFormat.getInstance();
		doubleformat.setMinimumFractionDigits(2);
		doubleformat.setMaximumFractionDigits(1);
		double p = pont.valorTotal();
		lblPontuacao = new JLabel( doubleformat.format(p) + " pontos");
		lblPontuacao.setForeground(Color.WHITE);
		lblPontuacao.setFont(new Font("Arial Black", Font.PLAIN, 21));
		lblPontuacao.setBounds(348, 121, 178, 54);
		contentPane.add(lblPontuacao);
		
		lblJogarNovamente = new JLabel("");
		lblJogarNovamente.setBounds(10, 11, 99, 54);
		contentPane.add(lblJogarNovamente);
		
		lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("imgs\\pontuacao1.png"));
		lblFundo.setBounds(0, 0, 780, 470);
		contentPane.add(lblFundo);
	}
	
	public void criaAcao(){
		lblJogarNovamente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pont.zeraPontuacao();
				pont.zeraQuestao();
				Fase1 fase1 = new Fase1(pont);
				fase1.setVisible(true);
				TelaPontuacao.this.dispose();
			}
		});
	}
}
