package fallen.lunatics.photo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class Main {
	
	private static BufferedImage getImage(File file) throws IOException {
		BufferedImage img = ImageIO.read(file);
		if (img == null) {
			throw new IllegalArgumentException();
		}
		return img;
	}
	
	@SuppressWarnings("unused")
	private static BufferedImage getImage(String filepath) throws IOException {
		return getImage(new File(filepath));
	}

	public static void main(String[] args) {

		JFileChooser fileChooser = new JFileChooser();
		
		int returnVal = fileChooser.showOpenDialog(null);
		if(returnVal != JFileChooser.APPROVE_OPTION) {
			if (returnVal == JFileChooser.CANCEL_OPTION) {
				System.out.println("You canceled.");
			} else {
				System.out.println("File chooser error occurred.");
			}
			return;
		}
		
		File imgFile = fileChooser.getSelectedFile();
		BufferedImage img;
		try {
			img = getImage(imgFile);
		} catch (IOException e) {
			System.out.println("IO exception on the file.");
			return;
		} catch (IllegalArgumentException e) {
			System.out.println("Your file is not an image file.");
			return;
		}
		
		ImagePanel newImage = new ImagePanel(img);
		JFrame mainFrame = new JFrame("Fallen Lunatics Photoshop");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(newImage);
		mainFrame.pack();
		mainFrame.setVisible(true);
		
	}

}
