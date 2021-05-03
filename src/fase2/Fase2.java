package fase2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dados.Pontuacao;
import fase2.Fase2;
import fase2.Fase2Pergunta1;
import fase2.Fase2Pergunta10;
import fase2.Fase2Pergunta2;
import fase2.Fase2Pergunta3;
import fase2.Fase2Pergunta4;
import fase2.Fase2Pergunta5;
import fase2.Fase2Pergunta6;
import fase2.Fase2Pergunta7;
import fase2.Fase2Pergunta8;
import fase2.Fase2Pergunta9;
import iftm.edu.ImgFundo;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fase2 extends JFrame {

	private JPanel contentPane;
	private static Pontuacao pont;
	private JButton btnPerg1, btnPerg2, btnPerg3, btnPerg4, btnPerg5, btnPerg6, btnPerg7, btnPerg8, btnPerg9, btnPerg10; 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase2 frame = new Fase2(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fase2(Pontuacao p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 488);
		contentPane = new ImgFundo("Fase 2");
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.pont = p;
		criaComponente();
		criaAcao();
	}
	
	public void criaComponente(){
		btnPerg1 = new JButton("");
		btnPerg1.setBorderPainted( false );
		btnPerg1.setIcon(new ImageIcon("imgs\\fase2Perg1.png"));
		btnPerg1.setBounds(0, 0, 213, 130);
		contentPane.add(btnPerg1);
		
		btnPerg2 = new JButton("");
		btnPerg2.setBorderPainted( false );
		btnPerg2.setIcon(new ImageIcon("imgs\\fase2Perg2.png"));
		btnPerg2.setBounds(213, 0, 216, 91);
		contentPane.add(btnPerg2);
		
		btnPerg3 = new JButton("");
		btnPerg3.setBorderPainted( false );
		btnPerg3.setIcon(new ImageIcon("imgs\\fase2Perg3.png"));
		btnPerg3.setBounds(430, 14, 212, 79);
		contentPane.add(btnPerg3);
		
		btnPerg4 = new JButton("");
		btnPerg4.setBorderPainted( false );
		btnPerg4.setIcon(new ImageIcon("imgs\\fase2Perg4.png"));
		btnPerg4.setBounds(642, 1, 177, 118);
		contentPane.add(btnPerg4);
		
		btnPerg5 = new JButton("");
		btnPerg5.setBorderPainted( false );
		btnPerg5.setIcon(new ImageIcon("imgs\\fase2Perg5.png"));
		btnPerg5.setBounds(20, 170, 220, 126);
		contentPane.add(btnPerg5);
		
		btnPerg6 = new JButton("");
		btnPerg6.setBorderPainted( false );
		btnPerg6.setIcon(new ImageIcon("imgs\\fase2Perg6.png"));
		btnPerg6.setBounds(299, 109, 218, 100);
		contentPane.add(btnPerg6);
		
		btnPerg7 = new JButton("");
		btnPerg7.setBorderPainted( false );
		btnPerg7.setIcon(new ImageIcon("imgs\\fase2Perg7.png"));
		btnPerg7.setBounds(607, 164, 212, 114);
		contentPane.add(btnPerg7);
		
		btnPerg8 = new JButton("");
		btnPerg8.setBorderPainted( false );
		btnPerg8.setIcon(new ImageIcon("imgs\\fase2Perg8.png"));
		btnPerg8.setBounds(54, 343, 222, 111);
		contentPane.add(btnPerg8);
		
		btnPerg9 = new JButton("");
		btnPerg9.setBorderPainted( false );
		btnPerg9.setIcon(new ImageIcon("imgs\\fase2Perg9.png"));
		btnPerg9.setBounds(301, 355, 229, 123);
		contentPane.add(btnPerg9);
		
		btnPerg10 = new JButton("");
		btnPerg10.setBorderPainted( false );
		btnPerg10.setIcon(new ImageIcon("imgs\\fase2Perg10.png"));
		btnPerg10.setBounds(612, 316, 207, 122);
		contentPane.add(btnPerg10);
	}
	
	public void criaAcao(){	
		btnPerg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(verifica(1) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta1 perg1 = new Fase2Pergunta1(pont);
					perg1.setVisible(true);
					Fase2.this.dispose();
					pont.setPerg(1);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnPerg2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(2) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta2 perg2 = new Fase2Pergunta2(pont);
					perg2.setVisible(true);
					Fase2.this.dispose();
					pont.setPerg(2);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnPerg3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(3) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta3 perg3 = new Fase2Pergunta3(pont);
					perg3.setVisible(true);
					Fase2.this.dispose();
					pont.setPerg(3);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnPerg4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(4) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta4 perg4 = new Fase2Pergunta4(pont);
					perg4.setVisible(true);
					Fase2.this.dispose();
					pont.setPerg(4);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnPerg5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(5) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta5 perg5 = new Fase2Pergunta5(pont);
					perg5.setVisible(true);
					Fase2.this.dispose();
					pont.setPerg(5);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnPerg6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(6) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta6 perg6 = new Fase2Pergunta6(pont);
					perg6.setVisible(true);
					Fase2.this.dispose();
					pont.setPerg(6);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnPerg7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(7) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta7 perg7 = new Fase2Pergunta7(pont);
					perg7.setVisible(true);
					Fase2.this.dispose();
					pont.setPerg(7);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnPerg8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(8) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta8 perg8 = new Fase2Pergunta8(pont);
					perg8.setVisible(true);
					Fase2.this.dispose();
					pont.setPerg(8);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnPerg9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(9) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta9 perg9 = new Fase2Pergunta9(pont);
					perg9.setVisible(true);
					Fase2.this.dispose();
					pont.setPerg(9);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta já respondida");
				}
			}
		});

		btnPerg10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifica(10) == true){
					pont.setQuestaoRespondida();
					Fase2Pergunta10 perg10 = new Fase2Pergunta10(pont);
					perg10.setVisible(true);
					Fase2.this.dispose();
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
