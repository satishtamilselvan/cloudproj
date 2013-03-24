//package com.jpg;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class LoginDialog extends JDialog implements ActionListener {
 
 
  public LoginDialog() {

    this.getContentPane().setLayout(null);
    this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    this.setModal(true);
    this.setResizable(false);
    this.setTitle("Ensuring Data Storage Security in Cloud Computing");
    
    jLabel1.setText("Enter Login ID:");
   jLabel1.setBounds(new Rectangle(300, 150, 110, 20));
  jLabel1.setForeground(new Color(0, 0, 0));
    
    jtxtID.setText("admin");
    jtxtID.setBounds(new Rectangle(400, 150, 95, 20));
    
    jpwd.setBounds(new Rectangle(400, 200, 95, 20));
   // jpwd.setText();
    jButEnter.setBounds(new Rectangle(310, 240, 70, 25));
  
    jButEnter.setText("Enter");
    
    jButEnter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButEnter_actionPerformed(e);
      }
    });
    jLabel2.setBounds(new Rectangle(300, 200, 120, 20));
	jLabel2.setForeground(new Color(0, 0, 0));
    jLabel2.setText("Enter Password:");
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel3.setForeground(new Color(0, 0, 243));
    jLabel3.setText("Cloud Infrastructure Admin");
    jLabel3.setBounds(new Rectangle(280, 100, 250, 25));
    
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jtxtID, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jpwd, null);
    this.getContentPane().add(jButEnter, null);
    
        
  }

  public void setConfirm(boolean a){
        open = a;
  }
  public boolean getConfirm(){
        return open;
  }

  public void actionPerformed(ActionEvent e){}

  void jButEnter_actionPerformed(ActionEvent e) {

      String id = jtxtID.getText();
      char[] pwd1 = jpwd.getPassword();
      String pwd = new String(pwd1);
      if(id.equals("admin")&& pwd.equals("admin")){
          
                   setConfirm(true);
	  dispose();
      }
      else
          JOptionPane.showMessageDialog(this,"Please enter the correct details", "Login Failure", JOptionPane.ERROR_MESSAGE);
  }

  void jButClear_actionPerformed(ActionEvent e) {
            jtxtID.setText("");
            jpwd.setText("");
  }

  public void showDialog() {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();
    if (frameSize.height > screenSize.height) {
      frameSize.height = screenSize.height;
    }
    if (frameSize.width > screenSize.width) {
      frameSize.width = screenSize.width;
    }
    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    this.setVisible(true);
  }

   protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(1);
    }
  }

 public static boolean open = false;
  JLabel jLabel1 = new JLabel();
  JTextField jtxtID = new JTextField();
  JPasswordField jpwd = new JPasswordField();
  JButton jButEnter = new JButton();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JButton jButClear = new JButton();
  JLabel jlabImage1 = new JLabel();
  ImageIcon image1;
  ImageIcon image2;
  ImageIcon image3;
  ImageIcon image4;
  ImageIcon image5;
  ImageIcon applicationIcon;
  JLabel jlabImage2 = new JLabel();
  private transient Vector actionListeners;
}
