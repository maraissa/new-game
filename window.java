package newGame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class window  implements ActionListener{
	JFrame frame ;
	JLabel L1,L2;
	JPanel button,titree,button1 ,button2,button3 ; 
	JButton start,b1,b2,b3;
	Container con ;
	JTextArea titre ;
	Font titlef = new Font("Times New Roman",Font.PLAIN ,  25);
	Font startFont = new Font("No Continue", Font.PLAIN , 25);
	choice choice = new choice();
	
	public window() {
		
		
		frame = new JFrame();
		frame.setTitle("CONNECT-FOUR");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		
		
		frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\myrai\\OneDrive\\Bureau\\cours\\projet\\page2.jpg")));
		L1=new JLabel();
		frame.add(L1);
		frame.setSize(750, 650);
		frame.setLocationRelativeTo(null);
		con = frame.getContentPane();
		 button = new JPanel();
	     button.setBounds(300, 300, 120, 50);
	     button.setBackground(null);
	     con.add(button );
	     start = new JButton("PLAY");
	     start.setBackground(Color.white);
	     start.setForeground(Color.black);
	     button.add(start);
	     start.setFont(startFont);
	     start.setActionCommand("c1");
	     start.addActionListener(this);
	     
	     button3 = new JPanel();
		 button3.setVisible(true);
	     button3.setBounds(300, 390,120, 50);
	     button3.setBackground(null);
	     con.add(button3 );
	     b3= new JButton("QUIT");
	     b3.setBackground(Color.white);
	     b3.setForeground(Color.black);
	     button3.add(b3);
	     b3.addActionListener(this);
		 b3.setActionCommand("c2");
	     b3.setFont(startFont);
	     
	     button2 = new JPanel();
		 button2.setVisible(true);
	     button2.setBounds(110, 470, 50, 50);
	     button2.setBackground(null);
	     con.add(button2 );
	     b2= new JButton("♪");
	     b2.setBackground(Color.white);
	     b2.setForeground(Color.black);
	     button2.add(b2);
	     b2.addActionListener(this);
		 b2.setActionCommand("c3");
	     b2.setFont(startFont);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String choice1 = e.getActionCommand();
		if (choice1.equals("c1"))
			{frame.dispose();
			new GameLoop();
			}
		else if (choice1.equals("c2")) 
			
			frame.dispose();
			
			
			
							
		else if (choice1.equals("c3"))
			{
			soundhandler.runmusic("resources/music.wav");
			b2.setText("ON");
			}
	}
	
	public class choice extends JFrame implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				
			
		}
		
	}

}