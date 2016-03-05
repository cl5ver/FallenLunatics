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
	
	public ImagePanel(String filepath) {
		super();
		try {
			img = ImageIO.read(new File(filepath));
			Dimension imgDim = new Dimension();
			imgDim.setSize(img.getWidth(), img.getHeight());
			this.setPreferredSize(imgDim);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ImagePanel(File file) {
		super();
		try {
			img = ImageIO.read(file);
			Dimension imgDim = new Dimension();
			imgDim.setSize(img.getWidth(), img.getHeight());
			this.setPreferredSize(imgDim);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img,  0, 0, null);
	}


}
