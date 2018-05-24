import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

public class AssistenteSwing {

	private JFrame frmAssistant;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssistenteSwing window = new AssistenteSwing();
					window.frmAssistant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AssistenteSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAssistant = new JFrame();
		frmAssistant.setTitle("Assistant");
		frmAssistant.setResizable(false);
		frmAssistant.getContentPane().setForeground(new Color(0, 0, 0));
		frmAssistant.getContentPane().setBackground(new Color(255, 105, 180));
		frmAssistant.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(336, 378, 291, 28);
		frmAssistant.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(336, 417, 89, 44);
		frmAssistant.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(435, 417, 89, 44);
		frmAssistant.getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(538, 417, 89, 44);
		frmAssistant.getContentPane().add(button_1);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		list.setToolTipText("");
		list.setBounds(20, 39, 275, 137);
		frmAssistant.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"asd", "asd", "asdsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "asd", "asd", "asd", "asd", "asd", "asd", "asd", "asd", "asd", "asd"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		list_1.setBounds(20, 212, 275, 155);
		frmAssistant.getContentPane().add(list_1);
		
		JLabel lblNewLabel = new JLabel("Llamadas Perdidas\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 14, 291, 14);
		frmAssistant.getContentPane().add(lblNewLabel);
		
		JLabel lblCalls = new JLabel("Llamadas Del Dia");
		lblCalls.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCalls.setBounds(20, 187, 291, 14);
		frmAssistant.getContentPane().add(lblCalls);
		
		JList list_2 = new JList();
		list_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		list_2.setBounds(336, 39, 275, 137);
		frmAssistant.getContentPane().add(list_2);
		
		JList list_3 = new JList();
		list_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		list_3.setBounds(336, 212, 275, 155);
		frmAssistant.getContentPane().add(list_3);
		
		JLabel lblTareas = new JLabel("Tareas");
		lblTareas.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTareas.setBounds(336, 187, 291, 14);
		frmAssistant.getContentPane().add(lblTareas);
		
		JLabel lblNoticias = new JLabel("Noticias");
		lblNoticias.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNoticias.setBounds(336, 14, 291, 14);
		frmAssistant.getContentPane().add(lblNoticias);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(294, 213, 17, 154);
		frmAssistant.getContentPane().add(scrollBar);
		frmAssistant.setBounds(100, 100, 660, 500);
		frmAssistant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
