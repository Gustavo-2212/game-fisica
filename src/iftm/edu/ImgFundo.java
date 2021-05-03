package iftm.edu;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImgFundo extends javax.swing.JPanel {

	BufferedImage imagemFundo;

	public ImgFundo(String valor) {
		try {
			if(valor.equals("1")){
				imagemFundo = ImageIO.read(new File("imgs/img4.png"));
			}else if(valor.equals("2")){
				imagemFundo = ImageIO.read(new File("imgs/img5.png"));
			}else if(valor.equals("3")){
				imagemFundo = ImageIO.read(new File("imgs/img6.png"));
			}else if(valor.equals("4")){
				imagemFundo = ImageIO.read(new File("imgs/img7.png"));
			}else if(valor.equals("5")){
				imagemFundo = ImageIO.read(new File("imgs/img8.png"));
			}else if(valor.equals("6")){
				imagemFundo = ImageIO.read(new File("imgs/img9.png"));
			}else if(valor.equals("7")){
				imagemFundo = ImageIO.read(new File("imgs/img10.png"));
			}else if(valor.equals("8")){
				imagemFundo = ImageIO.read(new File("imgs/img11.png"));
			}else if(valor.equals("9")){
				imagemFundo = ImageIO.read(new File("imgs/img12.png"));
			}else if(valor.equals("10")){
				imagemFundo = ImageIO.read(new File("imgs/img13.png"));
			}else if(valor.equals("Menu")){
				imagemFundo = ImageIO.read(new File("imgs/Tela_inicial.png"));
			}else if(valor.equals("Inst")){
				imagemFundo = ImageIO.read(new File("imgs/img2.png"));
			}else if(valor.equals("Fase 1")){
				imagemFundo = ImageIO.read(new File("imgs/img3.png"));
			}else if(valor.equals("Fase 2")){
				imagemFundo = ImageIO.read(new File("imgs/imgFase2.png"));
			}else if(valor.equals("11")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-1.png"));
			}else if(valor.equals("12")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-2.png"));
			}else if(valor.equals("13")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-3.png"));
			}else if(valor.equals("14")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-4.png"));
			}else if(valor.equals("15")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-5.png"));
			}else if(valor.equals("16")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-6.png"));
			}else if(valor.equals("17")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-7.png"));
			}else if(valor.equals("18")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-8.png"));
			}else if(valor.equals("19")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-9.png"));
			}else if(valor.equals("20")){
				imagemFundo = ImageIO.read(new File("imgs/fase2-10.png"));
			}else if(valor.equals("Fase 3")){
				imagemFundo = ImageIO.read(new File("imgs/imgFase3.png"));
			}else if(valor.equals("Fase 4")) {
				imagemFundo = ImageIO.read(new File("imgs/Mundo_4.png"));
			}else if(valor.equals("Fase 5")) {
				imagemFundo = ImageIO.read(new File("imgs/mundo_5.png"));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawImage(imagemFundo, 0, 0, null);
	}
}
