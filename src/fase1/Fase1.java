package fase1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dados.Pontuacao;
import fase2.Fase2;
import iftm.edu.ImgFundo;
import iftm.edu.Instrucoes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Fase1 extends JFrame {

	private JPanel contentPane;
	private JButton btnMaca1, btnMaca2, btnMaca3, btnMaca4, btnMaca5, btnMaca6, btnMaca7, btnMaca8, btnMaca9, btnMaca10;
	private static Pontuacao pont;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase1 frame = new Fase1(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fase1(Pontuacao p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 790, 400);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		contentPane = new ImgFundo("Fase 1");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.pont = p;
		Componente();
		criaAcao();
	}

	public void Componente() {
		btnMaca1 = new JButton("");
		btnMaca1.setBorderPainted( false );
		//btnMaca1.setIcon(new ImageIcon("imgs\\btnSeta1.png"));
		btnMaca1.setBounds(467, 117, 38, 36);
		btnMaca1.setContentAreaFilled(false);
		btnMaca1.setFocusPainted(false);
		contentPane.add(btnMaca1);

		btnMaca2 = new JButton("");
		btnMaca2.setBorderPainted( false );
		//btnMaca2.setIcon(new ImageIcon("imgs\\btnSeta2.png"));
		btnMaca2.setBounds(500, 57, 38, 36);
		btnMaca2.setContentAreaFilled(false);
		btnMaca2.setFocusPainted(false);
		contentPane.add(btnMaca2);

		btnMaca3 = new JButton("");
		btnMaca3.setBorderPainted( false );
		//btnMaca3.setIcon(new ImageIcon("imgs\\btnSeta3.png"));
		btnMaca3.setBounds(537, 119, 38, 36);
		btnMaca3.setContentAreaFilled(false);
		btnMaca3.setFocusPainted(false);
		contentPane.add(btnMaca3);

		btnMaca4 = new JButton("");
		btnMaca4.setBorderPainted( false );
		//btnMaca4.setIcon(new ImageIcon("imgs\\btnSeta4.png"));
		btnMaca4.setBounds(572, 30, 38, 36);
		btnMaca4.setContentAreaFilled(false);
		btnMaca4.setFocusPainted(false);
		contentPane.add(btnMaca4);

		btnMaca5 = new JButton("");
		btnMaca5.setBorderPainted( false );
		//btnMaca5.setIcon(new ImageIcon("imgs\\btnSeta5.png"));
		btnMaca5.setBounds(627, 42, 38, 36);
		btnMaca5.setContentAreaFilled(false);
		btnMaca5.setFocusPainted(false);
		contentPane.add(btnMaca5);

		btnMaca6 = new JButton("");
		btnMaca6.setBorderPainted( false );
		//btnMaca6.setIcon(new ImageIcon("imgs\\btnSeta6.png"));
		btnMaca6.setBounds(585, 84, 38, 36);
		btnMaca6.setContentAreaFilled(false);
		btnMaca6.setFocusPainted(false);
		contentPane.add(btnMaca6);

		btnMaca7 = new JButton("");
		btnMaca7.setBorderPainted( false );
		//btnMaca7.setIcon(new ImageIcon("imgs\\btnSeta7.png"));
		btnMaca7.setBounds(614, 128, 38, 36);
		btnMaca7.setContentAreaFilled(false);
		btnMaca7.setFocusPainted(false);
		contentPane.add(btnMaca7);

		btnMaca8 = new JButton("");
		btnMaca8.setBorderPainted( false );
		//btnMaca8.setIcon(new ImageIcon("imgs\\btnSeta8.png"));
		btnMaca8.setBounds(652, 98, 38, 36);
		btnMaca8.setContentAreaFilled(false);
		btnMaca8.setFocusPainted(false);
		contentPane.add(btnMaca8);

		btnMaca9 = new JButton("");
		btnMaca9.setBorderPainted( false );
		//btnMaca9.setIcon(new ImageIcon("imgs\\btnSeta9.png"));
		btnMaca9.setBounds(690, 63, 38, 36);
		btnMaca9.setContentAreaFilled(false);
		btnMaca9.setFocusPainted(false);
		contentPane.add(btnMaca9);

		btnMaca10 = new JButton("");
		btnMaca10.setBorderPainted( false );
		//btnMaca10.setIcon(new ImageIcon("imgs\\btnSeta10.png"));
		btnMaca10.setBounds(707, 119, 38, 36);
		btnMaca10.setContentAreaFilled(false);
		btnMaca10.setFocusPainted(false);
		contentPane.add(btnMaca10);
	}
	
	public void criaAcao() {
		btnMaca1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(verifica(1) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta1 perg1 = new Fase1Pergunta1(pont);
					perg1.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(1);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnMaca2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(verifica(2) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta2 perg2 = new Fase1Pergunta2(pont);
					perg2.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(2);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnMaca3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(3) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta3 perg3 = new Fase1Pergunta3(pont);
					perg3.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(3);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnMaca4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(4) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta4 perg4 = new Fase1Pergunta4(pont);
					perg4.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(4);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnMaca5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(5) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta5 perg5 = new Fase1Pergunta5(pont);
					perg5.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(5);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnMaca6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(6) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta6 perg6 = new Fase1Pergunta6(pont);
					perg6.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(6);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnMaca7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(7) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta7 perg7 = new Fase1Pergunta7(pont);
					perg7.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(7);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnMaca8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(8) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta8 perg8 = new Fase1Pergunta8(pont);
					perg8.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(8);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnMaca9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(9) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta9 perg9 = new Fase1Pergunta9(pont);
					perg9.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(9);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnMaca10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(10) == true){
					pont.setQuestaoRespondida();
					Fase1Pergunta10 perg10 = new Fase1Pergunta10(pont);
					perg10.setVisible(true);
					Fase1.this.dispose();
					pont.setPerg(10);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});
	}
	
	//Verifiva se a pergunta já foi respondida
	public boolean verifica(int num){
		boolean a = true;
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.addAll(pont.getPerg());
		for(int i = 0; i < x.size(); i++){
			if(num == x.get(i)){
				a = false;
				break;
			}else{
				a = true;
			}
		}
		return a;
	}
}
