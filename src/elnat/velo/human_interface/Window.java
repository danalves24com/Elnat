package elnat.velo.human_interface;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import elnat.velo.human_interface.configurations.WindowConfiguration;

public class Window extends JFrame {

	
	
	public Window(String title, WindowConfiguration conf, Panel panel) {
		super(conf.getTitle());
		add(panel);
		setSize(conf.getxDimension(), conf.getyDimension());
		setDefaultCloseOperation(conf.getOncloseOperation());
		setVisible(true);
	}
	
}
