import java.awt.CardLayout;

import javax.swing.JFrame;


public class Gui extends JFrame {
Menu menu;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui gui = new Gui();
	}

	public Gui(){
		this.menu=new Menu();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new CardLayout());
		this.setExtendedState(MAXIMIZED_BOTH);
		this.add(this.menu);
	}
	
}
