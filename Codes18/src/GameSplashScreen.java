import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class GameSplashScreen extends JWindow {
	JLabel gamelbl = new JLabel("");
	JLabel gameMsg = new JLabel("Game-2017");
	private JPanel contentPane;
	JProgressBar progressBar = new JProgressBar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			
					GameSplashScreen frame = new GameSplashScreen();
					frame.setVisible(true);
					frame.doProgress();
				
	}
	Timer timer;
	int progressStart = 0;
	private boolean isVisible = false;
	int x = 148;
	int y = 317;
	int speed = 1;
	private void doProgress(){
		timer = new Timer(50, (e)->{
			if(gameMsg.getX()>=300){
				speed =-4;
				
			}
			else
			if(gameMsg.getX()<=0){
				speed = 4;
			}
			x = x + speed;
				gameMsg.setLocation(x, y);
				gameMsg.setVisible(isVisible);
			isVisible = !isVisible;
			if(progressStart<100){
				progressStart++;
			}
			else
			{
				timer.stop();
				GameMainMenu mainMenu = new GameMainMenu();
				mainMenu.setVisible(true);
				GameSplashScreen.this.setVisible(false);
				GameSplashScreen.this.dispose();
			}
			progressBar.setValue(progressStart);
		});
		timer.start();
	}

	/**
	 * Create the frame.
	 */
	public GameSplashScreen() {
		Icon icon = new ImageIcon(GameSplashScreen.class.getResource("game.gif"));
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 374);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//gamelbl.setIcon(new ImageIcon("/Users/amit/Documents/JavaBatch1230WS/GUIDemos/src/game.gif"));
		gamelbl.setIcon(icon);
		//gamelbl.setLocation(x, y);
		gamelbl.setBounds(22, 16, 410, 256);
		contentPane.add(gamelbl);
		
		
		progressBar.setBackground(Color.GREEN);
		progressBar.setForeground(Color.RED);
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		progressBar.setStringPainted(true);
		progressBar.setBounds(22, 284, 395, 33);
		contentPane.add(progressBar);
		
		
		gameMsg.setHorizontalAlignment(SwingConstants.CENTER);
		gameMsg.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		gameMsg.setBounds(x, y, 134, 39);
		contentPane.add(gameMsg);
	}
}
