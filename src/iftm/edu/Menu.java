package iftm.edu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dados.Pontuacao;
import fase1.Fase1;
import fase2.Fase2;
import fase3.Fase3;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {
	private JPanel contentPane;
	private JButton btnPlay;
	private JLabel lblInfo;
	private JPanel panel;
	private Pontuacao pont;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 488);
		contentPane = new ImgFundo("Menu");
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		pont = new Pontuacao();
		componente();
		criaAcao();
	}
	
	public void componente(){
		btnPlay = new JButton("");
		btnPlay.setBackground(Color.WHITE);
		btnPlay.setContentAreaFilled(true);
		btnPlay.setFocusPainted(true);
		btnPlay.setIcon(new ImageIcon("imgs\\imgPlay.png"));
		btnPlay.setBounds(614, 33, 170, 60);
		contentPane.add(btnPlay);
		
		lblInfo = new JLabel("");
		lblInfo.setBounds(29, 24, 55, 41);
		contentPane.add(lblInfo);
	}
	
	public void criaAcao(){
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fase1 fase1 = new Fase1(pont);
				fase1.setVisible(true);
				Menu.this.dispose();
			}
		});
		
		lblInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Instrucoes inst = new Instrucoes(pont, "menu");
				inst.setVisible(true);
				Menu.this.dispose();
			}
		});
	}
}