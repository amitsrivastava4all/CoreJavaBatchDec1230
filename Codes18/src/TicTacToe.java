import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	JButton one = new JButton("");
	JButton two = new JButton("");
	JButton three = new JButton("");
	JButton four = new JButton("");
	JButton five = new JButton("");
	JButton six = new JButton("");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				
	}
	private boolean isDraw(){
		return counter==6?true:false;
	}
	
	private void reset(){
		one.setText("");
		two.setText("");
		three.setText("");
		four.setText("");
		five.setText("");
		six.setText("");
		counter=0;
		one.requestFocus();
		
	}
	
	int counter;
	boolean isXorZero = false;
	private void printXorZero(JButton buttonObject){
		if(!isNotBlank(buttonObject)){
		buttonObject.setText(isXorZero?"X":"0");
		counter++;
		if(isGameOver()){
			JOptionPane.showMessageDialog(this, "Game Over...");
			reset();
			//this.dispose();
			
		}
		if(isDraw()){
			JOptionPane.showMessageDialog(this, "Game Draw...");
			reset();
		}
		
		isXorZero = !isXorZero;
		//buttonObject.setEnabled(false);
		}
	}
	private boolean isNotBlank(JButton button){
		if(button.getText().trim().length()==0){
			return false;
		}
		else
		{
			return true;
		}
	}
	private boolean isRowBlank(JButton one, JButton two , JButton three){
		return (isNotBlank(one) && isNotBlank(two) 
				&& isNotBlank(three));
	}
	
	private boolean isRowCompare(JButton one, JButton two, JButton three){
		return isRowBlank(one,two,three)?
				(one.getText().equals(two.getText()) && 
						one.getText().equals(three.getText())):
							false;
	}
	
	private boolean isGameOver(){
	if(isRowCompare(one, two, three))	{
		return true;
	}
	else
	if(isRowCompare(four, five, six)){
		return true;
	}
	return false;
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Icon icon  = new ImageIcon(TicTacToe.class.getResource("logo.jpg"));
				int choice = JOptionPane.showConfirmDialog(TicTacToe.this,
						"Do u really want to exit this game","BMPL"
						,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,icon);
			if(choice == JOptionPane.YES_OPTION){
				TicTacToe.this.setVisible(false);
				TicTacToe.this.dispose();
			}
			else
			{
				return ;
			}
			}
		});
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("TicTacToe");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(one);
				
			}
		});
		one.setBounds(20, 30, 117, 65);
		contentPane.add(one);
		
		
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(two);
			}
		});
		two.setBounds(163, 30, 117, 65);
		contentPane.add(two);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(three);
			}
		});
		
		
		three.setBounds(305, 30, 117, 65);
		contentPane.add(three);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(four);
			}
		});
		
		
		four.setBounds(20, 137, 117, 65);
		contentPane.add(four);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(five);
			}
		});
		
		
		five.setBounds(163, 137, 117, 65);
		contentPane.add(five);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(six);
			}
		});
		
		
		six.setBounds(305, 137, 117, 65);
		contentPane.add(six);
	}

}
