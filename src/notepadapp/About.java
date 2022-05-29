package notepadapp; 

import java.awt.Font;

import javax.swing.*;

public class About extends JFrame
{
  About()
  {
    setTitle("About Notepad Application");
    setBounds(100,100,800,600);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    ImageIcon icon= new ImageIcon(getClass().getResource("Notepad.png"));
    setIconImage(icon.getImage());

    setLayout(null);

    JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("Notepad.png")));
    iconLabel.setBounds(200,50,200,250);
    add(iconLabel); 

    JLabel textLabel = new JLabel("<HTML> Welcome to Notepad ! <br/> Notepad is a text editor, i.e., an app specialized in editing plain text. <br/> It can edit text files (bearing the . txt filename extension) and compatible formats, such as batch files, INI files, and log files. <br/> Notepad can read and write plain texts encoded in ASCII, UTF-8, and UTF-16. </html>");
    textLabel.setBounds(200,200,500,500);
    textLabel.setFont(new Font(Font.MONOSPACED,Font.PLAIN,20));
    add(textLabel);

 
  } 
  
  public static void main(String [] args){
      new About().setVisible(true);
  }
}
