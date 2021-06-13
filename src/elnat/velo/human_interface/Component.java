package elnat.velo.human_interface;

public class Component {

	private java.awt.Component component;
	private String position;
	
	public Component(java.awt.Component component, String center) {
		super();
		this.component = component;
		this.position = center;
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
