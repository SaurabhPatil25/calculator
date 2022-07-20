import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.util.*;

public class calci {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 384, 648);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn = new JButton(".");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn.setFocusPainted(false);
		btn.setBackground(Color.BLACK);
		btn.setBounds(10, 523, 80, 80);
		frame.getContentPane().add(btn);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn1.setFocusPainted(false);
		btn1.setBackground(Color.BLACK);
		btn1.setBounds(10, 433, 80, 80);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn4.setFocusPainted(false);
		btn4.setBackground(Color.BLACK);
		btn4.setBounds(10, 343, 80, 80);
		frame.getContentPane().add(btn4);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn0.setFocusPainted(false);
		btn0.setBackground(Color.BLACK);
		btn0.setBounds(100, 523, 80, 80);
		frame.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn2.setFocusPainted(false);
		btn2.setBackground(Color.BLACK);
		btn2.setBounds(100, 433, 80, 80);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn5.setFocusPainted(false);
		btn5.setBackground(Color.BLACK);
		btn5.setBounds(100, 343, 80, 80);
		frame.getContentPane().add(btn5);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				int n = s.length();
				
				Queue<Double> q1= new LinkedList<>();
				Queue<Character> q2= new LinkedList<>();
				String s1="";
				for(int i=0;i<n;i++){
				    
				    char a=s.charAt(i);
				    if(a=='+' || a=='-' || a=='*' || a=='/' ){
				        
				        
						
				        if(q2.isEmpty()){
				            q2.add(a);
				        }else{
				            q2.add(a);
				        }
				        double num =Double.parseDouble(s1);
				         if(q1.isEmpty()){
				            q1.add(num);
				        }else{
				            q1.add(num);
				        }
				        s1="";
				        
				    }else{
				        s1+=a;
				    }
				   
				}
				if(s1!=""){
				    double num =Double.parseDouble(s1);
				         if(q1.isEmpty()){
				            q1.add(num);
				        }else{
				            q1.add(num);
				        }  
				    
				}
				
				   double ans= q1.poll();
				while(!q1.isEmpty() || !q2.isEmpty()){
				 
				    if(!q2.isEmpty()){
				       char b= q2.poll();
				       if(b=='+'){
				          ans+=q1.poll();
				       }else if(b=='-'){
				           ans-=q1.poll();
				       } else if(b=='*'){
				          ans*=q1.poll();
				       }else if(b=='/'){
				           ans/=q1.poll();
				       }
				           
				       }
				    }
				 
				
				textField.setText(Double.toString(ans));
				    
				   }
				
				
			
			        
			    
			 
			
		});
		btnequal.setForeground(Color.WHITE);
		btnequal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnequal.setFocusPainted(false);
		btnequal.setBackground(Color.BLACK);
		btnequal.setBounds(190, 523, 170, 80);
		frame.getContentPane().add(btnequal);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn3.setFocusPainted(false);
		btn3.setBackground(Color.BLACK);
		btn3.setBounds(190, 433, 80, 80);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn6.setFocusPainted(false);
		btn6.setBackground(Color.BLACK);
		btn6.setBounds(190, 343, 80, 80);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn7.setFocusPainted(false);
		btn7.setBackground(Color.BLACK);
		btn7.setBounds(10, 253, 80, 80);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn8.setFocusPainted(false);
		btn8.setBackground(Color.BLACK);
		btn8.setBounds(100, 253, 80, 80);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn9.setFocusPainted(false);
		btn9.setBackground(Color.BLACK);
		btn9.setBounds(190, 253, 80, 80);
		frame.getContentPane().add(btn9);
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnAC.setForeground(Color.WHITE);
		btnAC.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAC.setFocusPainted(false);
		btnAC.setBackground(Color.BLACK);
		btnAC.setBounds(10, 163, 170, 80);
		frame.getContentPane().add(btnAC);
		
		JButton btnback = new JButton("<");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s= textField.getText();
				int n = s.length();
				String s1="";
				if(n>0) {
					for(int i=0;i<n-1;i++) {
						s1+=s.charAt(i);
					}
				}
				textField.setText(s1);
				
			}
		});
		btnback.setForeground(Color.WHITE);
		btnback.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnback.setFocusPainted(false);
		btnback.setBackground(Color.BLACK);
		btnback.setBounds(190, 163, 80, 80);
		frame.getContentPane().add(btnback);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});
		btndiv.setForeground(Color.WHITE);
		btndiv.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btndiv.setFocusPainted(false);
		btndiv.setBackground(Color.BLACK);
		btndiv.setBounds(280, 163, 80, 80);
		frame.getContentPane().add(btndiv);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");
			}
		});
		btnadd.setForeground(Color.WHITE);
		btnadd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnadd.setFocusPainted(false);
		btnadd.setBackground(Color.BLACK);
		btnadd.setBounds(280, 433, 80, 80);
		frame.getContentPane().add(btnadd);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
			}
		});
		btnsub.setForeground(Color.WHITE);
		btnsub.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnsub.setFocusPainted(false);
		btnsub.setBackground(Color.BLACK);
		btnsub.setBounds(280, 343, 80, 80);
		frame.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}
		});
		btnmul.setForeground(Color.WHITE);
		btnmul.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnmul.setFocusPainted(false);
		btnmul.setBackground(Color.BLACK);
		btnmul.setBounds(280, 253, 80, 80);
		frame.getContentPane().add(btnmul);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(10, 73, 350, 80);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("MINICALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 10, 260, 53);
		frame.getContentPane().add(lblNewLabel);
	}
}
