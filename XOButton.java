package project5;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class XOButton extends JButton {
	ImageIcon X,O;
		
	public XOButton() 
	{
		X = new ImageIcon("112662-glowing-purple-neon-icon-alphanumeric-letter-xx.png");
		O = new ImageIcon("112643-glowing-purple-neon-icon-alphanumeric-letter-o.png");
	}
	
	public void setPicture(char x)
	{
		if (x == 'x')
			setIcon(X);
		else if(x == 'o')
			setIcon(O);
		else
			setIcon(null);
	}
}

