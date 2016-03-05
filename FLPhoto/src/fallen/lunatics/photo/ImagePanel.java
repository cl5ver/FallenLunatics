package fallen.lunatics.photo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImagePanel extends JPanel {

	private BufferedImage img = null;

	public ImagePanel(BufferedImage image) {
		super();
		img = image;
		
		Dimension imgDim = new Dimension();
		imgDim.setSize(img.getWidth(), img.getHeight());
		this.setPreferredSize(imgDim);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img, 0, 0, null);
	}

}
