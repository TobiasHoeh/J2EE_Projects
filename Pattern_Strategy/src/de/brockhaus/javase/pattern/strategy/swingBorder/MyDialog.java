package de.brockhaus.javase.pattern.strategy.swingBorder;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MyDialog extends JFrame
{
	private static MyDialog frame;
	
	public static void main(String[] args)
	{
		frame = new MyDialog();
		frame.init();
		
	    frame.setVisible(true);

	}
	
	private void init()
	{
	    frame.setTitle("Swing borders");
	    frame.setSize(500, 400);
	    frame.setLocation(400, 200);
	    
	    frame.getContentPane().setLayout(new BorderLayout());
	    frame.getContentPane().add(BorderLayout.NORTH, this.initInputPanel());
	    frame.getContentPane().add(BorderLayout.SOUTH, this.initButtonPanel());    
	}
	
	private JPanel initInputPanel()
	{
		JPanel panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    JLabel label = new JLabel("Your input here: "); 
	    JTextField text = new JTextField(20);
	    
	    panel.add(BorderLayout.WEST, label);
	    panel.add(BorderLayout.EAST, text);
	    
	    panel.setBorder(new TitledBorder("Type here"));
	    
	    return panel;
	}
	
	private JPanel initButtonPanel()
	{
		JPanel panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    JButton cancelBtn = new JButton("Cancel"); 
	    cancelBtn.addActionListener(new ExitAction());
	    panel.add(BorderLayout.CENTER, cancelBtn);
	    panel.setBorder(new EtchedBorder());
	    
	    return panel;
	}
	
	
	class ExitAction extends AbstractAction
	{
		public ExitAction()
		{
			super("exit");
		}
	
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

}
