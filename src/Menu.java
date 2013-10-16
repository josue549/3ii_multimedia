import java.awt.FlowLayout;

import javax.swing.JPanel;


public class Menu extends JPanel {
	BoutonMenu b1,b2;
	public Menu(){
		this.setVisible(true);
		b1=new BoutonMenu(0);
		b2=new BoutonMenu(1);
		this.setLayout(new FlowLayout());
		this.add(b1);
		this.add(b2);
	}
}


