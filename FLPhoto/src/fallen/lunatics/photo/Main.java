package fallen.lunatics.photo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFileChooser;
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
		JFileChooser fileChooser = new JFileChooser();
		File imgFile;
		
		//openButton = new JButton();
		
		int returnVal = fileChooser.showOpenDialog(mainFrame);
		if(returnVal != fileChooser.APPROVE_OPTION) {
			System.out.println(String.format("File chooser Error with %d", returnVal));
			System.exit(0);
		}
		imgFile = fileChooser.getSelectedFile();
		
		
		ImagePanel newImage = new ImagePanel(imgFile);
		mainFrame.add(newImage);
		mainFrame.pack();
		mainFrame.setVisible(true);
		
		
		mainFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}

}
