package basicCalc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tall1;
	private JTextField tall2;
	private JButton button;
	private JTextField sumFelt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 235, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// input1
		tall1 = new JTextField();
		tall1.setBounds(35, 16, 146, 26);
		contentPane.add(tall1);
		tall1.setColumns(10);

		// input2
		tall2 = new JTextField();
		tall2.setBounds(35, 58, 146, 26);
		contentPane.add(tall2);
		tall2.setColumns(10);

		// Knapp+
		button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					int sum = Integer.parseInt(tall1.getText()) + Integer.parseInt(tall2.getText());
					sumFelt.setText(sum + "");
				} catch (NumberFormatException e) {
					System.out.println("FAIL");
				}

			}
		});
		button.setBounds(45, 100, 115, 29);
		contentPane.add(button);

		//output
		sumFelt = new JTextField();
		sumFelt.setBounds(35, 145, 146, 26);
		contentPane.add(sumFelt);
		sumFelt.setColumns(10);

	}
}
