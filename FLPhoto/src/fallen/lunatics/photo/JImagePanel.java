package fallen.lunatics.photo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class JImagePanel extends JPanel {

private BufferedImage img = null;
	
	public JImagePanel(String filepath){
		try {
			img = ImageIO.read(new File(filepath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(img,  0, 0, null);
		super.paintComponents(g);
	}


}
