//Emma ko
//5.7.2020

package murach.ui;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.lang.reflect.Field;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

@SuppressWarnings("serial")
public class AreaAndPerimeterFrame extends JFrame {

	// TODO: Add instance variables for text fields and buttons

	public AreaAndPerimeterFrame() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println(e);
		}
		initComponents();
		setTitle("Area and Perimeter Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setVisible(true);
	}

	private void initComponents() {
		// TODO: Implement code

		// Four text fields

		JTextField codeField1 = new JTextField(20);
		Field.setText("Field 1");

		codeField.setEditiable(false);
		JTextField codeField2 = new JTextField(20);
		field.setText("Field 2");

		codeField.setEditiable(false);
		JTextField codeField3 = new JTextField(20);
		field.setText("Field 3");

		codeField.setEditiable(false);
		JTextField codeField4 = new JTextField(20);
		field.setText("Field 4");

		codeField.setEditiable(false);
	}
//GridBagLayout

	JPanel panel = new JPanel();frame.add(panel);frame.setLayout(new GridBagLayout);

	// Helper method to return GridBagConstraints objects
	private GridBagConstraints getConstraints(int x, int y, int anchor) {
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5, 5, 0, 5);
		c.gridx = x;
		c.gridy = y;
		c.anchor = anchor;
		return c;
	}
//four lables

	JLable codeLabel = newJLabel("Lable 1");panel.add(codeLabel);

	JLable codeLabel = newJLabel("Lable 2");panel.add(codeLabel);

	JLable codeLabel = newJLabel("Lable 3");panel.add(codeLabel);

	JLable codeLabel = newJLabel("Lable 4");panel.add(codeLabel);

	// Text fields

	JTextField codeField1 = new JTextField(20);Field.setText("Field 1b");

	codeField.setEditiable(false);
	JTextField codeField2 = new JTextField(20);field.setText("Field 2b");

	codeField.setEditiable(false);
	JTextField codeField3 = new JTextField(20);field.setText("Field 3b");

	codeField.setEditiable(false);
	JTextField codeField4 = new JTextField(20);field.setText("Field 4b");

	// Flow Layout
	JPanel panel = new JPanel();frame.setLayout(new FlowLayout());frame.add(new JButton("Button 1"));frame.add(new JButton("Button 2"));

	private void computeButtonClicked () {
		
		button1.addActionListerner(new ActionListener()) 
	
	}

	// I couldn't figure out how to center the panels

	// TODO: Implement code

	private void resetButtonClicked() {
		// TODO: Implement code
		button2.addActionListerner(new ActionListener())

	}
}
