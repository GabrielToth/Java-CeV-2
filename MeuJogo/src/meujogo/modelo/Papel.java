package meujogo.modelo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Papel {

	private Image imagem;
	private int x, y, dx, dy;
	private int largura, altura;
	private boolean isVisivel;

	//private static final int LARGURA = 938;
	private static int VELOCIDADE = 2;

	public Papel(int x, int y) {
		this.x = x;
		this.y = y;
		isVisivel = true;
	}

	public void load() {
		ImageIcon referencia = new ImageIcon("res\\papelHigienico2.png");
		imagem = referencia.getImage();

		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
	}

	public void update() {
		this.y += VELOCIDADE;
		//if (this.x > LARGURA) {
			//isVisivel = false;
		//}
	}
	
	public Rectangle getBounds() {
		return new Rectangle (x, y, largura, altura);
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public static int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public static void setVELOCIDADE(int vELOCIDADE) {
		VELOCIDADE = vELOCIDADE;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	
	
	
	
	
	
}
