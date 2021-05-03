package iftm.edu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dados.Pontuacao;
import fase1.Fase1;
import fase1.Fase1Pergunta1;
import fase1.Fase1Pergunta10;
import fase1.Fase1Pergunta2;
import fase1.Fase1Pergunta3;
import fase1.Fase1Pergunta4;
import fase1.Fase1Pergunta5;
import fase1.Fase1Pergunta6;
import fase1.Fase1Pergunta7;
import fase1.Fase1Pergunta8;
import fase1.Fase1Pergunta9;
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
import fase3.Fase3Pergunta1;
import fase3.Fase3Pergunta10;
import fase3.Fase3Pergunta2;
import fase3.Fase3Pergunta3;
import fase3.Fase3Pergunta4;
import fase3.Fase3Pergunta5;
import fase3.Fase3Pergunta6;
import fase3.Fase3Pergunta7;
import fase3.Fase3Pergunta8;
import fase3.Fase3Pergunta9;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class Instrucoes extends JFrame {

	private JPanel contentPane;
	private static Pontuacao pont;
	private JButton btnCont;
	private String inst;
	private ArrayList<Integer> perg = new ArrayList<Integer>();

	public static void main(String[] args) {

	}

	public Instrucoes(Pontuacao p, String janela) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 485);
		contentPane = new ImgFundo("Inst");
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.pont = p;
		this.inst = janela;
		Componente();
		criaAcao();
	}
	
	public ArrayList<Integer> mistura(ArrayList<Integer> a){
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.addAll(a);
		Collections.shuffle(b);
		return b;
	}
	
	public ArrayList<Integer> aleatorio(){
		return perg;
	}
	
	public void Componente(){
		btnCont = new JButton("");
		btnCont.setIcon(new ImageIcon("imgs\\btnContinuar.png"));
		btnCont.setBounds(756, 432, 58, 51);
		btnCont.setBorderPainted(false);
		btnCont.setContentAreaFilled(false);
		btnCont.setFocusPainted(false);
		contentPane.add(btnCont);
	}
	
	public void criaAcao(){
		btnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(inst.equals("menu")){
					Menu menu = new Menu();
					menu.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg1")){
					Fase1Pergunta1 fase1Perg1 = new Fase1Pergunta1(pont);
					fase1Perg1.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg2")){
					Fase1Pergunta2 fase1Perg2 = new Fase1Pergunta2(pont);
					fase1Perg2.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg3")){
					Fase1Pergunta3 fase1Perg3 = new Fase1Pergunta3(pont);
					fase1Perg3.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg4")){
					Fase1Pergunta4 fase1Perg4 = new Fase1Pergunta4(pont);
					fase1Perg4.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg5")){
					Fase1Pergunta5 fase1Perg5 = new Fase1Pergunta5(pont);
					fase1Perg5.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg6")){
					Fase1Pergunta6 fase1Perg6 = new Fase1Pergunta6(pont);
					fase1Perg6.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg7")){
					Fase1Pergunta7 fase1Perg7 = new Fase1Pergunta7(pont);
					fase1Perg7.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg8")){
					Fase1Pergunta8 fase1Perg8 = new Fase1Pergunta8(pont);
					fase1Perg8.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg9")){
					Fase1Pergunta9 fase1Perg9 = new Fase1Pergunta9(pont);
					fase1Perg9.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase1Perg10")){
					Fase1Pergunta10 fase1Perg10 = new Fase1Pergunta10(pont);
					fase1Perg10.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg1")){
					Fase2Pergunta1 fase2Perg1 = new Fase2Pergunta1(pont);
					fase2Perg1.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg2")){
					Fase2Pergunta2 fase2Perg2 = new Fase2Pergunta2(pont);
					fase2Perg2.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg3")){
					Fase2Pergunta3 fase2Perg3 = new Fase2Pergunta3(pont);
					fase2Perg3.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg4")){
					Fase2Pergunta4 fase2Perg4 = new Fase2Pergunta4(pont);
					fase2Perg4.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg5")){
					Fase2Pergunta5 fase2Perg5 = new Fase2Pergunta5(pont);
					fase2Perg5.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg6")){
					Fase2Pergunta6 fase2Perg6 = new Fase2Pergunta6(pont);
					fase2Perg6.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg7")){
					Fase2Pergunta7 fase2Perg7 = new Fase2Pergunta7(pont);
					fase2Perg7.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg8")){
					Fase2Pergunta8 fase2Perg8 = new Fase2Pergunta8(pont);
					fase2Perg8.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg9")){
					Fase2Pergunta9 fase2Perg9 = new Fase2Pergunta9(pont);
					fase2Perg9.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase2Perg10")){
					Fase2Pergunta10 fase2Perg10 = new Fase2Pergunta10(pont);
					fase2Perg10.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg1")){
					Fase3Pergunta1 fase3Perg1 = new Fase3Pergunta1(pont);
					fase3Perg1.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg2")){
					Fase3Pergunta2 fase3Perg2 = new Fase3Pergunta2(pont);
					fase3Perg2.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg3")){
					Fase3Pergunta3 fase3Perg3 = new Fase3Pergunta3(pont);
					fase3Perg3.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg4")){
					Fase3Pergunta4 fase3Perg4 = new Fase3Pergunta4(pont);
					fase3Perg4.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg5")){
					Fase3Pergunta5 fase3Perg5 = new Fase3Pergunta5(pont);
					fase3Perg5.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg6")){
					Fase3Pergunta6 fase3Perg6 = new Fase3Pergunta6(pont);
					fase3Perg6.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg7")){
					Fase3Pergunta7 fase3Perg7 = new Fase3Pergunta7(pont);
					fase3Perg7.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg8")){
					Fase3Pergunta8 fase3Perg8 = new Fase3Pergunta8(pont);
					fase3Perg8.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg9")){
					Fase3Pergunta9 fase3Perg9 = new Fase3Pergunta9(pont);
					fase3Perg9.setVisible(true);
					Instrucoes.this.dispose();
				}else if(inst.equals("fase3Perg10")){
					Fase3Pergunta10 fase3Perg10 = new Fase3Pergunta10(pont);
					fase3Perg10.setVisible(true);
					Instrucoes.this.dispose();
				}
			}
		});
	}
}
