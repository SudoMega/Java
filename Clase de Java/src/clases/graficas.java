package clases;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class graficas extends Canvas {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Drawing");
		Canvas canvas = new graficas();
		canvas.setBackground(Color.white);
		canvas.setSize(600, 400);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
		}
		public void paint(Graphics g) {
			g.setColor(Color.red);
		    g.fillOval(200, 100, 200, 200);
		
		}
	
	
}
