import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameMainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMainMenu frame = new GameMainMenu();
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
	public GameMainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGaming = new JMenu("Gaming");
		menuBar.add(mnGaming);
		
		JMenuItem mntmTictactoe = new JMenuItem("TicTacToe");
		mntmTictactoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			TicTacToe ticTacToe = new TicTacToe();
			ticTacToe.setVisible(true);
			}
		});
		mnGaming.add(mntmTictactoe);
		
		JMenuItem mntmFlappybird = new JMenuItem("HurdleGame");
		mnGaming.add(mntmFlappybird);
		
		JMenuItem mntmSkywar = new JMenuItem("SkyWar");
		mnGaming.add(mntmSkywar);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnGaming.add(mntmExit);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
