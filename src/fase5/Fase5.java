package fase5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import dados.Pontuacao;
import fase5.Fase5Pergunta1;
import iftm.edu.ImgFundo;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Fase5 extends JFrame {

	private JPanel contentPane;
	private JButton btnPerg1;
	private JLabel lblFundo, lblPerg1, lblPerg2, lblPerg3, lblPerg4, lblPerg5, lblPerg6, lblPerg7, lblPerg8, lblPerg9, lblPerg10;
	private static Pontuacao pont;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase5 frame = new Fase5(pont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fase5(Pontuacao p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 462);
		contentPane = new ImgFundo("Fase 4");
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		this.pont = p;
		criaComponente();
		criaAcao();
	}
	
	public void criaComponente(){
		//Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		
		lblPerg1 = new JLabel("");
		lblPerg1.setBounds(45, 47, 55, 55);
		//lblPerg1.setBorder(border);
		contentPane.add(lblPerg1);
		
		lblPerg2 = new JLabel("");
		lblPerg2.setBounds(178, 140, 55, 55);
		//lblPerg2.setBorder(border);
		contentPane.add(lblPerg2);
		
		lblPerg3 = new JLabel("");
		lblPerg3.setBounds(45, 200, 55, 55);
		//lblPerg3.setBorder(border);
		contentPane.add(lblPerg3);
		
		lblPerg4 = new JLabel("");
		lblPerg4.setBounds(178, 295, 55, 55);
		//lblPerg4.setBorder(border);
		contentPane.add(lblPerg4);
		
		lblPerg5 = new JLabel("");
		lblPerg5.setBounds(45, 376, 55, 55);
		//lblPerg5.setBorder(border);
		contentPane.add(lblPerg5);
		
		lblPerg6 = new JLabel("");
		lblPerg6.setBounds(740, 55, 55, 55);
		//lblPerg6.setBorder(border);
		contentPane.add(lblPerg6);
		
		lblPerg7 = new JLabel("");
		lblPerg7.setBounds(646, 133, 55, 55);
		//lblPerg7.setBorder(border);
		contentPane.add(lblPerg7);
		
		lblPerg8 = new JLabel("");
		lblPerg8.setBounds(744, 200, 55, 55);
		//lblPerg8.setBorder(border);
		contentPane.add(lblPerg8);
		
		lblPerg9 = new JLabel("");
		lblPerg9.setBounds(644, 290, 50, 50);
		//lblPerg9.setBorder(border);
		contentPane.add(lblPerg9);
		
		lblPerg10 = new JLabel("");
		lblPerg10.setBounds(746, 374, 55, 55);
		//lblPerg10.setBorder(border);
		contentPane.add(lblPerg10);
		
		lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("imgs\\mundo_5.png"));
		lblFundo.setBounds(-2, -1, 818, 462);
		contentPane.add(lblFundo);
	}
	
	public void criaAcao(){
		lblPerg1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(1) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta1 perg1 = new Fase5Pergunta1(pont);
					perg1.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(1);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
		
		lblPerg2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(2) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta2 perg2 = new Fase5Pergunta2(pont);
					perg2.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(2);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
		
		lblPerg3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(3) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta3 perg3 = new Fase5Pergunta3(pont);
					perg3.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(3);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
		
		lblPerg4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(4) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta4 perg4 = new Fase5Pergunta4(pont);
					perg4.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(4);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
		
		lblPerg5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(5) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta5 perg5 = new Fase5Pergunta5(pont);
					perg5.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(5);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
		
		lblPerg6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(6) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta6 perg6 = new Fase5Pergunta6(pont);
					perg6.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(6);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
		
		lblPerg7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(7) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta7 perg7 = new Fase5Pergunta7(pont);
					perg7.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(7);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
		
		lblPerg8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(8) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta8 perg8 = new Fase5Pergunta8(pont);
					perg8.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(8);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
		
		lblPerg9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(9) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta9 perg9 = new Fase5Pergunta9(pont);
					perg9.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(9);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
		
		lblPerg10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verifica(10) == true){
					pont.setQuestaoRespondida();
					Fase5Pergunta10 perg10 = new Fase5Pergunta10(pont);
					perg10.setVisible(true);
					Fase5.this.dispose();
					pont.setPerg(10);
				}else{
					JOptionPane.showMessageDialog(null, "Pergunta j� respondida");
				}
			}
		});
	}
	
	//Verifiva se a pergunta j� foi respondida
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


