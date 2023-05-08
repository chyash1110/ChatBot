import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Bot extends JFrame 
{    
    private JTextField chatbox = new JTextField(); // instance of JTextField 
    private JTextArea Chatarea = new JTextArea(); // instance of JTextArea
    public Bot()
    {
        JFrame frame  = new JFrame(); // instance of Jframe
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(600,600);
        frame.setTitle("ChatterBox");
        frame.add(chatbox);
        frame.add(Chatarea);
        Chatarea.setSize(700,500);
        Chatarea.setLocation(2,2);
        chatbox.setSize(540,30);
        chatbox.setLocation(2,400);
        chatbox.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String text = chatbox.getText().toLowerCase();
                Chatarea.append("You: "+ text+ "\n");
                chatbox.setText("");
                if(text.contains("hi") || text.contains("hey") || text.contains("hello"))
                {
                    bot("Hey !! I'm your Chatter-Box, Developed by Yash Chauhan.");
                }
                else if(text.contains("how"))
                {
                    bot("Everything is Good!!");
                }
                else if(text.contains("where"))
                {
                    bot("Dehradun, India");
                }
                else if(text.contains("developer")||text.contains("developed"))
                {
                    bot("Yash Chauhan");
                }
                else if(text.contains("your")&&text.contains("name"))
                {
                    bot("ChatterBox");
                }
                else if(text.contains("good"))
                {
                    bot("Thank You!! I'm glad to hear that.");
                }
                else
                {
                    int rand = (int)(Math.random() *3 +1);
                    if(rand == 1)
                    {
                        bot("I don't understand...");
                    }
                    else if(rand == 2)
                    {
                        bot("Can't tell ..Confidential!!!");
                    }
                    else
                    {
                        bot("Try again please.Can't understand ..");
                    }
                }
            }
        });
    }
    private void bot(String string)
    {
        Chatarea.append("Bot: "+string+"\n\n");
    }
    public static void main(String[] args) {
        new Bot();
    }
}