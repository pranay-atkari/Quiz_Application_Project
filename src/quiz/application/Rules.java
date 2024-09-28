
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Rules extends JFrame implements ActionListener{
    
      String name;
      JButton start, back;
    
    Rules(String name){
        this.name = name;
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
         
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
          
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Time Rule:- Each quiz is limited to 15 minutes. If the time runs out, the quiz is auto-submitted." + "<br><br>" +
                "2. Attempt Rule:- Users can only attempt a quiz once." + "<br><br>" +
                "3. Score Rule:- 1 point for each correct answer; no negative points for wrong answers." + "<br><br>" +
                "4. Randomization Rule:- Questions are presented in random order for each user." + "<br><br>" +
                "5. Answer Rule:- Only one answer per question is allowed. No backtracking to previous questions." + "<br><br>" +
                "6.Quiz Availability:- A quiz can only be taken between specific dates set by the admin." + "<br><br>" +
               // "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
              //  "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
         back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
          setSize(800, 650);
          setLocation(350, 100);
           setVisible(true);

}
     public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
             setVisible(false);
            new Quiz(name);
        }else {
            setVisible(false);
            new Login();
        }
     
     }
    
    public static void main(String[] args) {
        
        new Rules("User");
        
    }

   
}
