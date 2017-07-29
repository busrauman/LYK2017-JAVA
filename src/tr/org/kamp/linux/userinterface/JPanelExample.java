package tr.org.kamp.linux.userinterface;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample extends JPanel{

	private WhiteLabel centerLabel;
	private WhiteLabel northLabel;
	private WhiteLabel southLabel;
	private WhiteLabel eastLabel;
	private WhiteLabel westLabel;
	
	public JPanelExample() {
		setLayout(new BorderLayout());
		setBackground(Color.DARK_GRAY);
		
		centerLabel = new WhiteLabel("Center");
		northLabel = new WhiteLabel("Sinif Tahtasi");
		southLabel = new WhiteLabel("South");
		eastLabel = new WhiteLabel("East");
		westLabel = new WhiteLabel("Wild Wild West");
		
		add(centerLabel, BorderLayout.CENTER);
		add(northLabel, BorderLayout.NORTH);
		add(southLabel, BorderLayout.SOUTH);
		add(eastLabel, BorderLayout.EAST);
		add(westLabel, BorderLayout.WEST);
	}
	
}
