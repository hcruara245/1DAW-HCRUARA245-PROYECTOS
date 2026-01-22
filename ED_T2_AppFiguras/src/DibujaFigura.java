import figuras.Circulo;
import figuras.Figura;
import javax.swing.*;
import java.awt.*;

public class DibujaFigura extends JFrame {
	public DibujaFigura(Figura fig) {
		// Definici�n de ventana
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		// Dibujado de la figura
		paint(this.getGraphics(), fig);
	}

	public void paint(Graphics g, Figura fig) {
		super.paintComponents(g);
		g.setColor(Color.RED);
		((Graphics2D) g).setStroke(new BasicStroke(5));
		fig.paint(g, this.getWidth(), this.getHeight());
	}

	public static void main(String params[]) {
		String radio = JOptionPane.showInputDialog("Introduce radio (entre 0-300): ");
		Figura circulo = new Circulo(Integer.parseInt(radio)) {};
		new DibujaFigura(circulo);
	}
}
