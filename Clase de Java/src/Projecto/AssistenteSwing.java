package Projecto;

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

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;

public class AssistenteSwing {

	private JFrame frmAssistant;
	private JTextField txtHola;

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
		CallList listaLlamadas = new CallList();
		TaskList listaTareas = new TaskList();
		frmAssistant = new JFrame();
		frmAssistant.setTitle("Assistant");
		frmAssistant.setResizable(false);
		frmAssistant.getContentPane().setForeground(new Color(0, 0, 0));
		frmAssistant.getContentPane().setBackground(new Color(255, 140, 0));
		frmAssistant.getContentPane().setLayout(null);
		
	    txtHola = new JTextField();
		txtHola.setText("Ingrese una Tarea");
		txtHola.setBounds(336, 378, 275, 28);
		frmAssistant.getContentPane().add(txtHola);
		txtHola.setColumns(10);
		
		JButton btnAddTask = new JButton("AddTask");
		btnAddTask.setBackground(Color.LIGHT_GRAY);

		btnAddTask.setBounds(336, 417, 120, 44);
		frmAssistant.getContentPane().add(btnAddTask);
		
		JButton btnRandcall = new JButton("RandCall");

		btnRandcall.setBackground(Color.LIGHT_GRAY);
		btnRandcall.setBounds(491, 417, 120, 44);
		frmAssistant.getContentPane().add(btnRandcall);
		
		JList list = new JList();

		list.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		list.setToolTipText("");
		list.setBounds(20, 39, 275, 137);
		frmAssistant.getContentPane().add(list);
		
		JList list_1 = new JList();

		list_1.setValueIsAdjusting(true);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setModel(new AbstractListModel() {
			
			String[] values = listaTareas.getLista();
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
		
		JButton btnCheckCalls = new JButton("CheckCall");
		btnCheckCalls.setForeground(new Color(0, 0, 0));
		btnCheckCalls.setBackground(Color.LIGHT_GRAY);
		btnCheckCalls.setBounds(174, 378, 120, 28);
		frmAssistant.getContentPane().add(btnCheckCalls);
		
		JLabel lblNewLabel_1 = new JLabel("Mensaje");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(30, 379, 265, 21);
		frmAssistant.getContentPane().add(lblNewLabel_1);
		
		JLabel MensajeCalls = new JLabel("oh yeah");
		MensajeCalls.setFont(new Font("Segoe Script", Font.PLAIN, 25));
		MensajeCalls.setBounds(30, 415, 265, 44);
		frmAssistant.getContentPane().add(MensajeCalls);
		frmAssistant.setBounds(100, 100, 660, 500);
		frmAssistant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAddTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			Task task = new Task(0, txtHola.getText(), "0");
				listaTareas.AddTask(task);
				list_3.setModel(new AbstractListModel() {
					
					String[] values = listaTareas.getLista();
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				
			}
		});
		
		btnRandcall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Call call = new Call(0, txtHola.getText());
				listaLlamadas.AddCall(call);
				
            list.setModel(new AbstractListModel() {
					
					String[] values = listaLlamadas.getLostCalls();
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});	
			}
		});
		
		btnCheckCalls.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				listaLlamadas.CheckAllCalls();
				
	            list_1.setModel(new AbstractListModel() {
					
						String[] values = listaLlamadas.getCallsOfTheDay();
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
						}
					});
	            list.setModel(new AbstractListModel() {
					
						String[] values = listaLlamadas.getLostCalls();
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
						}
					});
			}
		});
		
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MensajeCalls.setText(listaLlamadas.getLostCallsMessege(list.getSelectedIndex()));
			}
		});
		
		list_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MensajeCalls.setText(listaLlamadas.getCallsOfTheDayMessege(list_1.getSelectedIndex()));
			}
		});
	}
}
