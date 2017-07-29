package tr.org.kamp.linux.userinterface;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WhiteLabel extends JLabel{
	
	public WhiteLabel(String text) {
		super(text);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.WHITE));
		setHorizontalTextPosition(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);
	}

}
