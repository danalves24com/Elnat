package elnat.velo.human_interface;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class Panel extends JPanel {
	public Panel(Component[] components) {
		super();
		setLayout(new GridBagLayout());
        
		for(Component c : components) {		
			add(c.getComponent());
		}
        
	}
}
