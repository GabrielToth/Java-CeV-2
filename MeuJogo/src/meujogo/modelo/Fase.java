package meujogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener {

	private Image fundo;
	private Player player;
	private Timer timer;
	private List<Lixo1> lixo1;
	private List<Papel> papel;
	private boolean emJogo;

	public Fase() {
		setFocusable(true);
		setDoubleBuffered(true);

		ImageIcon referencia = new ImageIcon("res\\minecraft1024x768.jpg");
		fundo = referencia.getImage();

		player = new Player();
		player.load();

		addKeyListener(new TecladoAdapter());

		timer = new Timer(5, this);
		timer.start();

		inicializaLixos();
		inicializaPapel();
		emJogo = true;
	}

	public void inicializaLixos() {
		int coordenadas[] = new int[10];
		lixo1 = new ArrayList<Lixo1>();

		for (int i = 0; i < coordenadas.length; i++) {
			int x = (int) (Math.random() * 640 + 10);
			int y = (int) (Math.random() * 1500 - 2000);
			lixo1.add(new Lixo1(x, y));

		}
	}
	
	public void inicializaPapel() {
		int coordenadas[] = new int[25];
		papel = new ArrayList<Papel>();
		
		for (int i = 0; i < coordenadas.length; i++) {
			int x = (int) (Math.random() * 1024 + 10);
			int y = (int) (Math.random() * 768 - 1500);
			papel.add(new Papel(x, y));
			
		}
		
	}
	

	public void paint(Graphics g) {
		Graphics2D graficos = (Graphics2D) g;
		if (emJogo == true) {
			graficos.drawImage(fundo, 0, 0, null);
			
			for (int p = 0; p < papel.size(); p++) {
				Papel q = papel.get(p);
				q.load();
				graficos.drawImage(q.getImagem(), q.getX(), q.getY(), this);
			}
			
			
			graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this);

			List<Tiro> tiros = player.getTiros();
			for (int i = 0; i < tiros.size(); i++) {
				Tiro m = tiros.get(i);
				m.load();
				graficos.drawImage(m.getImagem(), m.getX(), m.getY(), this);
			}

			for (int o = 0; o < lixo1.size(); o++) {
				Lixo1 in = lixo1.get(o);
				in.load();
				graficos.drawImage(in.getImagem(), in.getX(), in.getY(), this);
			}

		}else {
			ImageIcon fimJogo = new ImageIcon("res\\FIM DE JOGO.jpg");
			graficos.drawImage(fimJogo.getImage(), 0, 0, null);
		}

		g.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		player.update();
		
		for (int p = 0; p < papel.size(); p++) {
			Papel on = papel.get(p);
				if(on.isVisivel()) {
					on.update();
				} else {
					papel.remove(p);
				}
			
		}

		List<Tiro> tiros = player.getTiros();
		for (int i = 0; i < tiros.size(); i++) {
			Tiro m = tiros.get(i);
			if (m.isVisivel()) {
				m.update();
			} else {
				tiros.remove(i);
			}
		}

		for (int o = 0; o < lixo1.size(); o++) {
			Lixo1 in = lixo1.get(o);
			if (in.isVisivel()) {
				in.update();
			} else {
				lixo1.remove(o);
			}
		}

		checarColisoes();
		repaint();
		

	}

	public void checarColisoes() {
		Rectangle formaLixoEcologico = player.getBounds();
		Rectangle formaLixo1;
		Rectangle formaPapel;
		

		for (int i = 0; i < lixo1.size(); i++) {
			Lixo1 tempLixo1 = lixo1.get(i);	
			formaLixo1 = tempLixo1.getBounds();
			if (formaLixoEcologico.intersects(formaLixo1)) {
				player.setVisivel(false);
				tempLixo1.setVisivel(false);
				emJogo = false;
			}
			
		for (int q = 0; q < papel.size(); q++) {
			Papel tempPapel = papel.get(q);
			formaPapel = tempPapel.getBounds();
			if (formaLixoEcologico.intersects(formaPapel)) {
				player.setVisivel(true);
				tempPapel.setVisivel(false);
				
			}
			
		}

		}
		
	}

	private class TecladoAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			player.keyRelease(e);
		}
	}

}
