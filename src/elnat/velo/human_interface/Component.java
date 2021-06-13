package elnat.velo.human_interface;

import elnat.velo.human_interface.configurations.ComponentConfiguration;

public class Component {

	private java.awt.Component component;
	private String position;
	private ComponentConfiguration config;
	
	public Component(java.awt.Component component, ComponentConfiguration config) {
		super();
		this.component = component;
		this.config = config;		
	}
	public void paint() {
		component.setFont(config.getFont());
		component.setBackground(config.getBgColor());
		component.setForeground(config.getFgColor());		
	}
	public java.awt.Component getComponent() {
		return component;
	}
	public void setComponent(java.awt.Component component) {
		this.component = component;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
