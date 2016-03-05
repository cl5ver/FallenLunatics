package fallen.lunatics.photo;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Fallen Lunatics Photoshop");
		/*
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		*/
		
		String filepath = "C:\\UsersPublic\\Pictures\\Sample Pictures\\1.jpg";
		JImagePanel newImage = new JImagePanel(filepath);
		f.add(newImage);
		f.pack();
		f.setVisible(true);
	}

}
