import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// Button Action Listener
class MyAction implements ActionListener{
	private Demo1 demo;
	MyAction(Demo1 demo){
		this.demo = demo;
	}
	public void actionPerformed(ActionEvent e){
		JButton ref = (JButton)e.getSource();
		if(ref ==Demo1.ok){
			
		}
		String message  ="";
		if(e.getActionCommand().equals("Ok")){
			message = "U Click on OK";
		}
		else
		if(e.getActionCommand().equals("Cancel")){
			message = "U Click on Cancel";
		}
		else
			if(e.getActionCommand().equals("yes")){
				message = "U Click on yes";
			}
			else
				if(e.getActionCommand().equals("no")){
					message = "U Click on no";
				}
		
		JOptionPane.showMessageDialog(demo, message);
	}
}
// GUI Design Code
public class Demo1 extends JFrame  {
	
	static JButton ok = new JButton();
	static JButton cancel = new JButton();
	JButton yes = new JButton("yes");
	JButton no = new JButton("no");
	
	
	public Demo1(){
		// GUI Design
		ok.setText("Ok");
		cancel.setText("Cancel");
	
		this.getContentPane().setLayout(new GridLayout(2,2));
		this.getContentPane().add(ok);
		this.getContentPane().add(cancel);
		this.getContentPane().add(yes);
		this.getContentPane().add(no);
//		MyAction action  = new MyAction(this);
//		ok.addActionListener(action);
//		cancel.addActionListener(action);
//		yes.addActionListener(action);
//		no.addActionListener(action);
		ActionListener l= new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(Demo1.this, "U Click on OK");
				this.doStuff();
			}
			public void doStuff(){
				
			}
		};
		//l.actionPerformed(e);
		ok.addActionListener(l);
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(Demo1.this, "U Click on Cancel");
			}
		});
		
		yes.addActionListener((e)->
		JOptionPane.showMessageDialog(Demo1.this, "U Click on YES"));
		setTitle("My Frame-2017");
		setSize(500,500);
		setLocationRelativeTo(null);
		//setLocation(100,100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 obj = new Demo1();

	}

}
