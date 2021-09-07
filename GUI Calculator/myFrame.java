import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

class myFrame implements ActionListener{
  String num1 = "";
  String num2 = "";
  boolean continuenum1 = true;
  boolean continuenum2 = false;
  JButton button0;
  JButton button1;
  JButton button2;
  JButton button3;
  JButton button4;
  JButton button5;
  JButton button6;
  JButton button7;
  JButton button8;
  JButton button9;

  myFrame(){
    JFrame frame = new JFrame();
    button0 = new JButton("0");
    button0.setBounds(5, 313, 100, 50);//around 318 seems to the the max x and y
    button0.addActionListener(this);

    button1 = new JButton("1");
    button1.setBounds(5, 258, 100, 50);
    button1.addActionListener(this);

    button2 = new JButton("2");
    button2.setBounds(110, 258, 100, 50);
    button2.addActionListener(this);

    button3 = new JButton("3");
    button3.setBounds(215, 258, 100, 50);
    button3.addActionListener(this);

    button4 = new JButton("4");
    button4.setBounds(5, 203, 100, 50);
    button4.addActionListener(this);

    button5 = new JButton("5");
    button5.setBounds(110, 203, 100, 50);
    button5.addActionListener(this);

    button6 = new JButton("6");
    button6.setBounds(215, 203, 100, 50);
    button6.addActionListener(this);

    button7 = new JButton("7");
    button7.setBounds(5, 148, 100, 50);
    button7.addActionListener(this);

    button8 = new JButton("8");
    button8.setBounds(110, 148, 100, 50);
    button8.addActionListener(this);

    button9 = new JButton("9");
    button9.setBounds(215, 148, 100, 50);
    button9.addActionListener(this);

    frame.setTitle("GUI Calculator");
    frame.setSize(400,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.add(button0);
    frame.add(button1);
    frame.add(button2);
    frame.add(button3);
    frame.add(button4);
    frame.add(button5);
    frame.add(button6);
    frame.add(button7);
    frame.add(button8);
    frame.add(button9);
  }
  public void actionPerformed(ActionEvent e){
    if (e.getSource() == button0){
      if(continuenum1){
        num1 += "0";
      }else if (continuenum2){
        num2 += "0";
      }
    }
    if (e.getSource() == button1){
      if(continuenum1){
        num1 += "1";
      }else if (continuenum2){
        num2 += "1";
      }
    }
    if (e.getSource() == button2){
      if(continuenum1){
        num1 += "2";
      }else if (continuenum2){
        num2 += "2";
      }
    }
    if (e.getSource() == button3){
      if(continuenum1){
        num1 += "3";
      }else if (continuenum2){
        num2 += "3";
      }
    }
    if (e.getSource() == button4){
      if(continuenum1){
        num1 += "4";
      }else if (continuenum2){
        num2 += "4";
      }
    }
    if (e.getSource() == button5){
      if(continuenum1){
        num1 += "5";
      }else if (continuenum2){
        num2 += "5";
      }
    }
    if (e.getSource() == button6){
      if(continuenum1){
        num1 += "6";
      }else if (continuenum2){
        num2 += "6";
      }
    }
    if (e.getSource() == button7){
      if(continuenum1){
        num1 += "7";
      }else if (continuenum2){
        num2 += "7";
      }
    }
    if (e.getSource() == button8){
      if(continuenum1){
        num1 += "8";
      }else if (continuenum2){
        num2 += "8";
      }
    }
    if (e.getSource() == button9){
      if(continuenum1){
        num1 += "9";
      }else if (continuenum2){
        num2 += "9";
      }
    }
  }
}
