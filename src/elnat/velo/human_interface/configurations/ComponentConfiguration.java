package elnat.velo.human_interface.configurations;

import java.awt.Color;
import java.awt.Font;

public class ComponentConfiguration {
	Font font;
	Color bgColor, fgColor, textColor;
	public Font getFont() {
		return font;
	}
	public ComponentConfiguration setTextColor(Color color) {
		this.textColor = color;
		return this;
	}
	public Color getTextColor( ) {
		return this.textColor;
	}
	public ComponentConfiguration setFont(Font font) {
		this.font = font;
		return this;
	}
	public Color getBgColor() {
		return bgColor;
	}
	public ComponentConfiguration setBgColor(Color bgColor) {
		this.bgColor = bgColor;
		return this;
	}
	public Color getFgColor() {
		return fgColor;
	}
	public ComponentConfiguration setFgColor(Color fgColor) {
		this.fgColor = fgColor;
		return this;
	}
	
}
