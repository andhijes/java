package flappyBird;

import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class ImageBackground{
	public static void main(String[] args) {
		JFrame F = new JFrame ("Flappy Bird");
		try {
			F.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:/BG.png")))));
		}
		catch(IOException e)
		{
			System.out.println("Image Doesn't exist");
		}
		F.setResizable(false);
		F.setSize(750, 700);
		F.setVisible(true);
	}
}