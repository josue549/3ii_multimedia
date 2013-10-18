import javax.swing.ImageIcon;
import javax.swing.JButton;


public class BoutonMenu extends JButton{
	public static final int PLAYER=1;
	public static final int CAR = 0;
	public BoutonMenu(int btn){
		this.setFocusPainted(false);
		this.changerIcon(btn);
		}
	private void changerIcon(int btn) {
		if (btn==0)
			this.setIcon(new ImageIcon("image/play_icon.png"));
		if (btn==1)
			this.setIcon(new ImageIcon("image/game_icon.png"));
		}
	}
	

