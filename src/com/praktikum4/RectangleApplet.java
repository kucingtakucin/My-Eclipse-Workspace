/**
 * 
 */
package com.praktikum4;

import java.applet.Applet;
import java.awt.*;


/**
 * @author adam
 *
 */
public class RectangleApplet extends Applet{
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		Rectangle test = new Rectangle(5,10,20,30);
		g2.draw(test);
	}
}
