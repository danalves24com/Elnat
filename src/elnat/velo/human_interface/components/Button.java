package elnat.velo.human_interface.components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import elnat.velo.human_interface.Component;
import elnat.velo.human_interface.configurations.ComponentConfiguration;

public class Button extends Component{
	public Button(String text) {
		super(new JButton(text), new ComponentConfiguration().setBgColor(Colors.secondary()).setFgColor(Color.WHITE).setFont(new Font("Robot", 0, 14)));
		paint();
	}
}
