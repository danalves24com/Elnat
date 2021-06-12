package elnat.velo.human_interface;

import javax.swing.JFrame;

import elnat.velo.human_interface.configurations.WindowConfiguration;

public class Window extends JFrame {

	
	
	public Window(String title, WindowConfiguration conf) {
		super(conf.getTitle());
		add(new Panel());		
		setSize(conf.getxDimension(), conf.getyDimension());
		setDefaultCloseOperation(conf.getOncloseOperation());
		setVisible(true);
	}
	
}
