import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

class myFrame implements ActionListener{
  String num1 = "";
  String num2 = "";
  String operator = "";
  double result;
  double convertedNum1;
  double convertedNum2;
  boolean continuenum1 = true;
  boolean continuenum2 = false;
  
  JLabel label = new JLabel();

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
  JButton buttonAdd;
  JButton buttonSubtract;
  JButton buttonMultiply;
  JButton buttonDivide;
  JButton buttonEqual;
  JButton buttonDot;
  JButton buttonAC;

  myFrame(){
    JFrame frame = new JFrame();
    label.setBounds(5, 20, 388, 50);
    label.setOpaque(true);
    label.setBackground(new Color(115, 147, 179));

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

    buttonAdd = new JButton("+");
    buttonAdd.setBounds(320, 313, 73, 50);
    buttonAdd.addActionListener(this);

    buttonSubtract = new JButton("-");
    buttonSubtract.setBounds(320, 258, 73, 50);
    buttonSubtract.addActionListener(this);

    buttonMultiply = new JButton("x");
    buttonMultiply.setBounds(320, 203, 73, 50);
    buttonMultiply.addActionListener(this);

    buttonDivide = new JButton("/");
    buttonDivide.setBounds(320, 148, 73, 50);
    buttonDivide.addActionListener(this);

    buttonEqual = new JButton("=");
    buttonEqual.setBounds(215, 313, 100, 50);
    buttonEqual.addActionListener(this);

    buttonDot = new JButton(".");
    buttonDot.setBounds(110, 313, 100, 50);
    buttonDot.addActionListener(this);

    buttonAC = new JButton("AC");
    buttonAC.setBounds(320, 93, 73, 50);
    buttonAC.addActionListener(this);

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
    frame.add(buttonAdd);
    frame.add(buttonSubtract);
    frame.add(buttonMultiply);
    frame.add(buttonDivide);
    frame.add(buttonEqual);
    frame.add(buttonDot);
    frame.add(buttonAC);
    frame.add(label);
  }
  public void actionPerformed(ActionEvent e){
    if (e.getSource() == button0){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "0";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "0";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == button1){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "1";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "1";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == button2){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "2";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "2";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == button3){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "3";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "3";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == button4){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "4";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "4";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == button5){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "5";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "5";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == button6){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "6";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "6";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == button7){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "7";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "7";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == button8){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "8";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "8";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == button9){
      if(num1 == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if(continuenum1){
        num1 += "9";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else if (continuenum2){
        num2 += "9";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == buttonDot){
      if(continuenum1){
        if (!num1.contains(".")){
          num1 += ".";
          label.setText(" " + num1 + " " + operator + " " + num2);
        }
      }else if (continuenum2){
        if(!num2.contains(".")){
          num2 += ".";
          label.setText(" " + num1 + " " + operator + " " + num2);
        }
      }
    }
    if (e.getSource() == buttonAdd){
      if(continuenum1 == false && continuenum2 == false){
        num1 = String.valueOf(result);
        operator = "+";
        continuenum1 = false;
        continuenum2 = true;
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else{
        result = 0;
        continuenum1 = false;
        continuenum2 = true;
        operator = "+";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == buttonSubtract){
      if(continuenum1 == false && continuenum2 == false){
        num1 = String.valueOf(result);
        operator = "-";
        continuenum1 = false;
        continuenum2 = true;
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else{
        result = 0;
        continuenum1 = false;
        continuenum2 = true;
        operator = "-";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == buttonMultiply){
      if(continuenum1 == false && continuenum2 == false){
        num1 = String.valueOf(result);
        operator = "*";
        continuenum1 = false;
        continuenum2 = true;
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else{
        result = 0;
        continuenum1 = false;
        continuenum2 = true;
        operator = "*";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if (e.getSource() == buttonDivide){
      if(continuenum1 == false && continuenum2 == false){
        num1 = String.valueOf(result);
        operator = "/";
        continuenum1 = false;
        continuenum2 = true;
        label.setText(" " + num1 + " " + operator + " " + num2);
      }else{
        result = 0;
        continuenum1 = false;
        continuenum2 = true;
        operator = "/";
        label.setText(" " + num1 + " " + operator + " " + num2);
      }
    }
    if(e.getSource() == buttonEqual){
      continuenum1 = false;
      continuenum2 = false;
      convertedNum1 = Double.parseDouble(num1);
      convertedNum2 = Double.parseDouble(num2);  
      if (operator.equals("+")){
        result = convertedNum1 + convertedNum2;
      }
      else if (operator.equals("-")){
        result = convertedNum1 - convertedNum2;
      }
      else if (operator.equals("*")){
        result = convertedNum1 * convertedNum2;
      }
      else if (operator.equals("/")){
        result = convertedNum1 / convertedNum2;
      }
      label.setText(" " + num1 + " " + operator + " " + num2 + " = " + result);
      num1 = "";
      num2 = "";
      operator = "";
      convertedNum1 = 0;
      convertedNum2 = 0;
      continuenum1 = false;
      continuenum2 = false;
    }
    if (e.getSource() == buttonAC){
      num1 = "";
      num2 = "";
      operator = "";
      convertedNum1 = 0;
      convertedNum2 = 0;
      result = 0;
      continuenum1 = true;
      continuenum2 = false;
      label.setText(" " + num1 + " " + operator + " " + num2);
    }
  }
}
