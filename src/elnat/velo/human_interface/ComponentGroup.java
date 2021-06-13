package elnat.velo.human_interface;

import java.awt.LayoutManager;

import javax.swing.JPanel;

public class ComponentGroup extends JPanel { 
	public ComponentGroup(Component[] components, LayoutManager layout) {
		setLayout(layout);
		for(Component c : components) {
			add(c.getComponent());
		}
	}
}
