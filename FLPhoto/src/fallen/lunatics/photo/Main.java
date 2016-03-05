package fallen.lunatics.photo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class Main {

/*	
	public void actionOpenFile(ActionEvent e) {
		if (e.getSource() == openButton)
	}
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame = new JFrame("Fallen Lunatics Photoshop");
		//JFileChooser fileChooser = new JFileChooser();
		
		//openButton = new JButton();
		
		//int returnVal = fileChooser.showOpenDialog(arg0);
		
		
		
		String filepath = "1.jpg";
		
		
		ImagePanel newImage = new ImagePanel(filepath);
		mainFrame.add(newImage);
		mainFrame.pack();
		mainFrame.setSize(newImage.getWidth(), newImage.getHeight());

		mainFrame.setVisible(true);
		
		
		mainFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}

}
