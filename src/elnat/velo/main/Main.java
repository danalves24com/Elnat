package elnat.velo.main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

import elnat.velo.human_interface.Component;
import elnat.velo.human_interface.ComponentGroup;
import elnat.velo.human_interface.Panel;
import elnat.velo.human_interface.Window;
import elnat.velo.human_interface.components.Button;
import elnat.velo.human_interface.configurations.ComponentConfiguration;
import elnat.velo.human_interface.configurations.WindowConfiguration;

public class Main {

	public static void main(String[] args) {
		Window window = new Window("Elnat", new WindowConfiguration("Home", 400, 300), new Panel(new Component[] {

				new Component(new ComponentGroup(new Component[] {

						new Button("Start"),
						new Component(new JLabel("Hello"), new ComponentConfiguration())

				}, new GridLayout(2, 1)), new ComponentConfiguration())

		})

		);

	}

}
