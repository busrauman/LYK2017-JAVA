package tr.org.kamp.linux.windowbuilder;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import tr.org.kamp.linux.agarioclone.logic.GameLogic;
import tr.org.kamp.linux.agarioclone.model.Difficulty;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class FirstPanel extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	
	private ButtonGroup buttonGroup;

	/**
	 * Create the panel.
	 */
	public FirstPanel() {
		setLayout(new MigLayout("", "[][grow]", "[][][][][][][][]"));
		
		JLabel lblUserName = new JLabel("User Name:");
		add(lblUserName, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		add(lblPassword, "cell 0 1,alignx trailing");
		
		passwordField = new JPasswordField();
		add(passwordField, "cell 1 1,growx");
		
		JLabel lblSelectColor = new JLabel("Select Color:");
		add(lblSelectColor, "cell 0 2,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("RED");
		comboBox.addItem("BLUE");
		comboBox.addItem("GREEN");
		comboBox.addItem("MAGENTA");
		comboBox.addItem("ORANGE");
		add(comboBox, "cell 1 2,growx");
		
		JLabel lblDifficulty = new JLabel("Difficulty:");
		add(lblDifficulty, "cell 0 3");
		
		JRadioButton rdbtnEasy = new JRadioButton("Easy");
		rdbtnEasy.setSelected(true);
		add(rdbtnEasy, "cell 1 3");
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		add(rdbtnMedium, "cell 1 4");
		
		JRadioButton rdbtnHard = new JRadioButton("Hard");
		add(rdbtnHard, "cell 1 5");
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnEasy);
		buttonGroup.add(rdbtnMedium);
		buttonGroup.add(rdbtnHard);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Color selectedColor = Color.BLACK;
				switch (comboBox.getSelectedItem().toString()) {
				case "RED":
					selectedColor = Color.RED;
					break;
				case "BLUE":
					selectedColor = Color.BLUE;
					break;
				case "GREEN":
					selectedColor = Color.GREEN;
					break;
				case "MAGENTA":
					selectedColor = Color.MAGENTA;
					break;
				case "ORANGE":
					selectedColor = Color.ORANGE;
					break;
				default:
					break;
				}
				
				Difficulty difficulty = Difficulty.EASY;
				
				if(rdbtnEasy.isSelected()) {
					// EASY
					difficulty = Difficulty.EASY;
				} else if(rdbtnMedium.isSelected()) {
					// MEDIUM
					difficulty = Difficulty.NORMAL;
				} else if(rdbtnHard.isSelected()) {
					// HARD
					difficulty = Difficulty.HARD;
				}

				GameLogic gameLogic = new GameLogic(textField.getText(), selectedColor, difficulty);
				gameLogic.startApplication();
			}
		});
		add(btnStart, "cell 1 6");
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(FirstPanel.this, "Bu yazilim GPL altindadır, \nOzgur bir ortamda \nOzgur yazilimlar kullanilarak "
						+ "\nOzgur bireyler tarafindan gelistirilmistir."
						+ "\n LKD 2017 #Java", "About", JOptionPane.DEFAULT_OPTION);
			}
		});
		add(btnAbout, "cell 1 7");

	}

}
