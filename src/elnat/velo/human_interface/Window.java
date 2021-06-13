package elnat.velo.human_interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import elnat.velo.human_interface.components.Colors;
import elnat.velo.human_interface.configurations.WindowConfiguration;

public class Window extends JFrame {

	
	
	public Window(String title, WindowConfiguration conf, Panel panel) {
		super(conf.getTitle());
		panel.setBackground(Colors.primary());
		add(panel);
		setSize(conf.getxDimension(), conf.getyDimension());
		setUndecorated(true);		
		setDefaultCloseOperation(conf.getOncloseOperation());
		JFrame frame = this; // ease
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int button = e.getButton();
				switch(button) {
				case 2:
					frame.dispose();
					break;
				}
				
			}
		});
		setVisible(true);
	}
	
}
