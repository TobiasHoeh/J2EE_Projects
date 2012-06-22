package de.brockhaus.javase.pattern.command.swing;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class DialogFrame extends JFrame
{
	public static void main(String args[])
	{
	        DialogFrame frame = new DialogFrame();
	        frame.setTitle("Using Actions");
	        frame.setSize(500, 400);
	        frame.setLocation(400, 200);
	        frame.setVisible(true);
	}

	public DialogFrame()
	{
		// the menubar itself
		JMenuBar mb = new JMenuBar();
		// a menu on menubar
		JMenu fileMenu = new JMenu("Menu");
		// a menu item
		fileMenu.add(new ShowDialogAction());
		fileMenu.add(new ExitAction());

		// sticking together
		mb.add(fileMenu);
		setJMenuBar(mb);
	}


	//inner classes
	class ShowDialogAction extends AbstractAction
	{
		public ShowDialogAction()
		{
			super("show dialog");
		}
	
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog((Component) e.getSource(), "An action generated this dialog");
		}
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
