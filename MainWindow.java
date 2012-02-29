import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainWindow {

	  BufferedImage pic;
      
      public MainWindow() {
              try {
                      pic = ImageIO.read(new File("totoro.png"));
              } catch (IOException e) {
                      System.out.println("Something happened. Ohnoes. D:");
              }
      }
     
      public Dimension getSize() {
              if (pic==null) {
                      return new Dimension(200, 200);
              } else {
                      return new Dimension(pic.getWidth(), pic.getHeight());
              }
      }
      
	public static void main(String[] args) {
		MainWindow lul = new MainWindow();
		JFrame frame = new JFrame("lawlpic");
		
		frame.setSize(lul.getSize());
			
		
	}

	
}
