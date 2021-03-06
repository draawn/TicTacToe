package ui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import ui.Image;

@SuppressWarnings("serial")
public class MenuMain extends Menu {

	/**
	 * Default constructor for adding buttons and label to the frame.
	 */
	public MenuMain() {
		// title of the frame
		setTitle("Tic-Tac-Toe");

		JLabel ticTacToeLabel = new JLabel("");
		panel.add(ticTacToeLabel);
		ticTacToeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ticTacToeLabel.setBounds(38, 11, 220, 80);
		ticTacToeLabel.setIcon(new ImageIcon(Image.getTTTMain()));

		JButton singlePlayer = new JButton("");
		panel.add(singlePlayer);
		singlePlayer.setBounds(38, 91, 220, 80);
		singlePlayer.setIcon(new ImageIcon(Image.getSinglePlayer()));
		singlePlayer.setPressedIcon(new ImageIcon(Image.getSingleplayerPressed()));
		singlePlayer.setRolloverIcon(new ImageIcon(Image.getSinglePlayerHover()));
		singlePlayer.setContentAreaFilled(false); // remove def img
		singlePlayer.setBorderPainted(false); // remove borders of the button
		singlePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				JFrame f = new MenuSingle();
				f.setVisible(true);
			}
		});

		JButton multiplayer = new JButton("");
		panel.add(multiplayer);
		multiplayer.setBounds(38, 182, 220, 80);
		multiplayer.setIcon(new ImageIcon(Image.getMultiPlayer()));
		multiplayer.setPressedIcon(new ImageIcon(Image.getMultiPlayerPressed()));
		multiplayer.setRolloverIcon(new ImageIcon(Image.getMultiPlayerHover()));
		multiplayer.setContentAreaFilled(false); // remove def img
		multiplayer.setBorderPainted(false); // remove borders of the button
		multiplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();
				JFrame f = new MenuMulti();
				f.setVisible(true);
			}
		});

		JButton couchCoop = new JButton("");
		panel.add(couchCoop);
		couchCoop.setBounds(38, 273, 220, 80);
		couchCoop.setIcon(new ImageIcon(Image.getCouchCoOp()));
		couchCoop.setPressedIcon(new ImageIcon(Image.getCouchCoOpPressed()));
		couchCoop.setRolloverIcon(new ImageIcon(Image.getCouchCoOpHover()));
		couchCoop.setContentAreaFilled(false); // remove def img
		couchCoop.setBorderPainted(false); // remove borders of the button
		couchCoop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				JFrame f = new MenuCouch();
				f.setVisible(true);
			}
		});
	}
}
