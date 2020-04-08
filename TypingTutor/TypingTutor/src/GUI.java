import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;



public class GUI extends JFrame implements KeyListener  {
    
    
    
    
    
   
    JFrame frame = new JFrame("Typing Tuitor");
    JTextField textField = new JTextField();
    
    
    String str = new String("jfjf jfjf jfjf jfjf jfjf jfjf fjfj fjfj fjfj fjfj fjfj");
    JLabel textLabel = new JLabel(str);
    JLabel words = new JLabel("Total Words: ");
    JLabel correct = new JLabel("Correct: ");
    JLabel wrong = new JLabel("Wrong: ");
    JLabel time =  new JLabel();
    
    
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel time2 =  new JLabel(); 
    JButton start = new JButton("Start");
    
    MyPanel myPanel;
    Keybroad keybroad = new Keybroad();
    
    
    
    Timer timer ;
    int total = str.length();
    int correct_word = 0;
    int wrong_word = 0 ;
    int i = 0;
    int count = 0 ;
    
    public GUI(){
        DesignGUI();
        
    }
    
    public void DesignGUI()
    {
        
        frame.setSize(1218, 720);       
        textField.setBounds(400,290,300,50);
        textField.addKeyListener(this);
        
        
        words.setBounds(10,30,80,85);
        correct.setBounds(10,60,50,85);
        wrong.setBounds(10,90,50,85);
        time.setBounds(800,30,80,85);
        
        
        label4.setBounds(900, 30, 80, 85);
        label3.setBounds( 100 ,108, 80, 50);
        label2.setBounds( 100 ,78, 80, 50);
        time2.setBounds(890,60,100,30);
        
        
        time2.setText(String.valueOf(count));
        label2.setText(String.valueOf(correct_word));
        label3.setText(String.valueOf(wrong_word));
        label1.setText(String.valueOf(total));
        
        label1.setBounds( 100 ,48, 80, 50);
        
        start.setBounds(480 ,350, 100, 30);
        
        frame.add(label2);
        frame.add(label3);
        frame.add(label1);
        frame.add(label4);
        frame.add(textField);
        frame.add(textLabel);
        frame.add(words);
        frame.add(correct);
        frame.add(wrong);
        //frame.add(time);
        //frame.add(time2);
        frame.add(start);
        
        start.addActionListener( new Action());
       
        myPanel = new MyPanel();
        keybroad = new Keybroad();
        keybroad.setBounds(-60, 400, 1200, 380);
        frame.add(keybroad);
        
        frame.add(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
    }
    
    

    @Override
    public void keyTyped(KeyEvent ke) {
       

       try {
           
           count++ ;
           //timer.start();
          
         String st = myPanel.ch.get(i++).str;
            if ( i == str.length())
                timer.stop();
         if(String.valueOf(ke.getKeyChar()).equals(st))
            {
                correct_word++;
                this.label2.setText(String.valueOf(correct_word));
                label2.repaint();
                
                myPanel.ch.get(i-1).clr = Color.GREEN ;
                myPanel.repaint();
                
                
            }
         else{
             wrong_word++;
              label3.setText(String.valueOf(wrong_word));
              label3.repaint();
              myPanel.ch.get(i-1).clr = Color.red;
              myPanel.repaint();

         }
         } catch (IndexOutOfBoundsException e) {
            

     System.err.println("IndexOutOfBoundsException: " + e.getMessage());
     
    }
       try {
            
            
            for(int i=0;i<6;i++)
        {
            
            
            for(int j=0;j<20;j++)
            {
                
                if(keybroad.button[i][j].getText().charAt(i)==ke.getKeyChar())
                {
                    
                    keybroad.button[i][j].setBackground(Color.red);
                    keybroad.repaint();
                }
                
                
            }
        }
        } catch (Exception e) {
            System.out.println("ex");
        }
       
       
    }
    

    @Override
    public void keyPressed(KeyEvent ke) {
        
}

    @Override
    public void keyReleased(KeyEvent ke) {
        
       
    }
   
   

   

//    public class evt implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            
//            try {
//               int count =  (int)(Double.parseDouble(time2.getText())) ;
//            count++;
//           time2.setText("Time : " + count);
//           System.out.println(count);
//                   
//           TimerClass tc = new TimerClass(count);
//           timer = new Timer ( 1000, tc );
//           timer.start();
//            }   catch (IndexOutOfBoundsException e) {
//                System.out.println("vjn");
//            }       
//           
//        }
        
//    }
    

   
}
