package elnat.velo.main;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import elnat.velo.human_interface.Component;
import elnat.velo.human_interface.ComponentGroup;
import elnat.velo.human_interface.Panel;
import elnat.velo.human_interface.Window;
import elnat.velo.human_interface.configurations.WindowConfiguration;

public class Main {

	public static void main(String[] args) {
		Window window = new Window("Elnat", new WindowConfiguration("Home", 400, 300), new Panel(new Component[] {

				new Component(new ComponentGroup(new Component[] {

						new Component(new JButton("hello"), BorderLayout.CENTER),
						new Component(new JLabel("Hello"), BorderLayout.CENTER)

				}, new GridLayout()), "position")

		})

		);

	}

}
