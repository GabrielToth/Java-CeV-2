package meujogo.modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Player {

	private int x,y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	private List <Tiro> tiros;
	private boolean isVisivel;
	
	
	public Player() {
		this.x = 100;
		this.y = 100;
		isVisivel = true;
		
		tiros = new ArrayList<Tiro>();
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\lixoECOLOGICO2.png");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	
	public void tiroLixo() {
		this.tiros.add(new Tiro(x + largura, y + (altura/6)));
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle (x, y, altura, largura);
	}
	
	
	public void	keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_A) {
			tiroLixo();
		}
		
		if (codigo == KeyEvent.VK_UP) {
			dy=-7;
		}
		
		if (codigo == KeyEvent.VK_DOWN) {
			dy=7;
		}
		
		if (codigo == KeyEvent.VK_LEFT) {
			dx=-7;
		}
		
		if (codigo == KeyEvent.VK_RIGHT) {
			dx=7;
		}
		
	}
	
	public void	keyRelease(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_UP) {
			dy=0;
		}
		
		if (codigo == KeyEvent.VK_DOWN) {
			dy=0;
		}
		
		if (codigo == KeyEvent.VK_LEFT) {
			dx=0;
		}
		
		if (codigo == KeyEvent.VK_RIGHT) {
			dx=0;
		}
	
	
	}

	
	
	
	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
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
	

	public List<Tiro> getTiros() {
		return tiros;
	}
	
	
	
	
	
	
}
