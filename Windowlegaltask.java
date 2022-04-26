package com.swimap.omc.dcctool.view;

//import java.sql.*;
//import com.microsoft.sqlserver.jdbc.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Windowlegaltask {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windowlegaltask window = new Windowlegaltask();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Windowlegaltask() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(176, 40, 246, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setBounds(98, 86, 68, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(176, 83, 246, 19);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(98, 43, 68, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(86, 21, 401, 100);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(86, 153, 401, 100);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Street");
		lblNewLabel_1.setBounds(10, 10, 45, 13);
		panel_1.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 7, 250, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("City");
		lblNewLabel_1_2.setBounds(10, 43, 45, 13);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Country");
		lblNewLabel_1_3.setBounds(10, 77, 45, 13);
		panel_1.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(89, 40, 250, 19);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("ZIP");
		lblNewLabel_1_3_1.setBounds(219, 77, 45, 13);
		panel_1.add(lblNewLabel_1_3_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(253, 74, 86, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(89, 74, 105, 19);
		panel_1.add(textField_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(86, 278, 401, 74);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Phone");
		lblNewLabel_2.setBounds(10, 10, 73, 13);
		panel_2.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(89, 7, 250, 19);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(89, 45, 250, 19);
		panel_2.add(textField_7);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email");
		lblNewLabel_2_1.setBounds(10, 48, 73, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JButton btnApply = new JButton("Apply");
		/*button.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String connectionUrl = "jdbc:sqlserver://localhost:3306; " + 
				"databaseName=Connectlegaltask;integratedSecurity=true;";

				// Declare the JDBC objects.

				Connection con = null;

				Statement stmt = null;

				ResultSet rs = null;

					try {

						// Establish the connection.

						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDiver");

							con = DriverManager.getConnection(connectionUrl);

							// Create and execute an SQL statement that returns

							String SQL = INET INTO [dbo].[Contacts]([First Name],[Last Name],[Phone],[Email]) 
							VALUES ('test','test','test','test','test')"";
							stmt = con.createStatement ();
							rs = stmt.executeQuery (SQL);

							// Iterate through the data in the result set and d:

							while (rs.next()){

								System.out.println(rs.getString(4) + "" + rs.getString(6));

							}

					}

					// Handle my errors that have occurred.

					catch (Exception e) {
						e.printStackTrace();
					
					}
				
				
				
				}
			}
	*/	
		btnApply.setBounds(402, 390, 85, 21);
		frame.getContentPane().add(btnApply);
	}
}
