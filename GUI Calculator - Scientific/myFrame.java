import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.lang.Math;

class myFrame implements ActionListener{
  String num1 = "";
  String num2 = "";
  String scientificnum = "";
  String operator = "";
  double result;
  double convertedNum1;
  double convertedNum2;
  double convertedScientificNum;
  boolean continuenum1 = true;
  boolean continuenum2 = false;
  boolean continuescientificnum = false;
  
  JLabel label = new JLabel();

  JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEqual, buttonDot, buttonAC, buttonSin, buttonCos, buttonTan, buttonLog, buttonLn, buttonSqrt, buttonExponent, buttonEXP;

  myFrame(){
    JFrame frame = new JFrame();
    label.setBounds(5, 20, 498, 50);
    label.setOpaque(true);
    label.setBackground(new Color(115, 147, 179));

    button0 = new JButton("0");
    button0.setBounds(115, 313, 100, 50);
    button0.addActionListener(this);

    button1 = new JButton("1");
    button1.setBounds(115, 258, 100, 50);
    button1.addActionListener(this);

    button2 = new JButton("2");
    button2.setBounds(220, 258, 100, 50);
    button2.addActionListener(this);

    button3 = new JButton("3");
    button3.setBounds(325, 258, 100, 50);
    button3.addActionListener(this);

    button4 = new JButton("4");
    button4.setBounds(115, 203, 100, 50);
    button4.addActionListener(this);

    button5 = new JButton("5");
    button5.setBounds(220, 203, 100, 50);
    button5.addActionListener(this);

    button6 = new JButton("6");
    button6.setBounds(325, 203, 100, 50);
    button6.addActionListener(this);

    button7 = new JButton("7");
    button7.setBounds(115, 148, 100, 50);
    button7.addActionListener(this);

    button8 = new JButton("8");
    button8.setBounds(220, 148, 100, 50);
    button8.addActionListener(this);

    button9 = new JButton("9");
    button9.setBounds(325, 148, 100, 50);
    button9.addActionListener(this);

    buttonAdd = new JButton("+");
    buttonAdd.setBounds(430, 313, 73, 50);
    buttonAdd.addActionListener(this);

    buttonSubtract = new JButton("-");
    buttonSubtract.setBounds(430, 258, 73, 50);
    buttonSubtract.addActionListener(this);

    buttonMultiply = new JButton("x");
    buttonMultiply.setBounds(430, 203, 73, 50);
    buttonMultiply.addActionListener(this);

    buttonDivide = new JButton("/");
    buttonDivide.setBounds(430, 148, 73, 50);
    buttonDivide.addActionListener(this);

    buttonEqual = new JButton("=");
    buttonEqual.setBounds(325, 313, 100, 50);
    buttonEqual.addActionListener(this);

    buttonDot = new JButton(".");
    buttonDot.setBounds(220, 313, 100, 50);
    buttonDot.addActionListener(this);

    buttonAC = new JButton("AC");
    buttonAC.setBounds(430, 93, 73, 50);
    buttonAC.addActionListener(this);

    buttonSin = new JButton("sin");
    buttonSin.setBounds(115, 93, 100, 50);
    buttonSin.addActionListener(this);

    buttonCos = new JButton("cos");
    buttonCos.setBounds(220, 93, 100, 50);
    buttonCos.addActionListener(this);

    buttonTan = new JButton("tan");
    buttonTan.setBounds(325, 93, 100, 50);
    buttonTan.addActionListener(this);

    buttonLog = new JButton("log");
    buttonLog.setBounds(10, 148, 100, 50);
    buttonLog.addActionListener(this);

    buttonLn = new JButton("ln");
    buttonLn.setBounds(10, 203, 100, 50);
    buttonLn.addActionListener(this);

    buttonSqrt = new JButton("\u221A");
    buttonSqrt.setBounds(10, 258, 100, 50);
    buttonSqrt.addActionListener(this);

    buttonExponent = new JButton("x^y");
    buttonExponent.setBounds(10, 93, 100, 50);
    buttonExponent.addActionListener(this);

    buttonEXP = new JButton("EXP");
    buttonEXP.setBounds(10, 313, 100, 50);
    buttonEXP.addActionListener(this);

    frame.setTitle("GUI Calculator");
    frame.setSize(540,400);
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
    frame.add(buttonSin);
    frame.add(buttonCos);
    frame.add(buttonTan);
    frame.add(buttonLog);
    frame.add(buttonLn);
    frame.add(buttonSqrt);
    frame.add(buttonExponent);
    frame.add(buttonEXP);
  }
  public void numOutput(String num){
    if(num1 == "" && scientificnum == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
    if (continuescientificnum){
      scientificnum += num;
      label.setText(" " + operator + " " + scientificnum);
    }
    else if(continuenum1){
      num1 += num;
      label.setText(" " + num1 + " " + operator + " " + num2);
    }else if (continuenum2){
      num2 += num;
      label.setText(" " + num1 + " " + operator + " " + num2);
    }
  }
  public void operatorOutput(String op){
    if(continuenum1 == false && continuenum2 == false){
      num1 = String.valueOf(result);
      operator = op;
      continuenum1 = false;
      continuenum2 = true;
      label.setText(" " + num1 + " " + operator + " " + num2);
    }
    else if (scientificnum != ""){
      result = 0;
      num1 = scientificnum;
      operator = op;
      continuenum1 = false;
      continuenum2 = true;
      label.setText(" " + num1 + " " + operator + " " + num2);
    }
    else{
      result = 0;
      operator = op;
      continuenum1 = false;
      continuenum2 = true;
      label.setText(" " + num1 + " " + operator + " " + num2);
    }
  }
  public void scientificOutput(String sciOp){
    if (continuescientificnum == false && !(result == 0.0)){
      scientificnum = String.valueOf(result);
      operator = sciOp;
      continuescientificnum = true;
      label.setText(" " + operator + " " + scientificnum);
    } else {
      result = 0;
      operator = sciOp;
      continuescientificnum = true;
      label.setText(operator);
    }
  }
  public void actionPerformed(ActionEvent e){
    //numbers
    if (e.getSource() == button0){
      numOutput("0");
    }
    if (e.getSource() == button1){
      numOutput("1");
    }
    if (e.getSource() == button2){
      numOutput("2");
    }
    if (e.getSource() == button3){
      numOutput("3");
    }
    if (e.getSource() == button4){
      numOutput("4");
    }
    if (e.getSource() == button5){
      numOutput("5");
    }
    if (e.getSource() == button6){
      numOutput("6");
    }
    if (e.getSource() == button7){
      numOutput("7");
    }
    if (e.getSource() == button8){
      numOutput("8");
    }
    if (e.getSource() == button9){
      numOutput("9");
    }
    if (e.getSource() == buttonDot){
      if(num1 == "" && scientificnum == ""){
        continuenum1 = true;
        continuenum2 = false;
      }
      if (continuescientificnum){
        if (!scientificnum.contains(".")){
          scientificnum += ".";
          label.setText(" " + operator + " " + scientificnum);
        }
      }
      else if(continuenum1){
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

    //operators
    if (e.getSource() == buttonAdd){
      operatorOutput("+");
    }
    if (e.getSource() == buttonSubtract){
      operatorOutput("-");
    }
    if (e.getSource() == buttonMultiply){
      operatorOutput("*");
    }
    if (e.getSource() == buttonDivide){
      operatorOutput("/");
    }
    if (e.getSource() == buttonExponent){
      operatorOutput("^");
    }
    if (e.getSource() == buttonEXP){
      operatorOutput("E");
    }

    //Scientific calculations
    if (e.getSource() == buttonSin){
      scientificOutput("sin");
    }
    if (e.getSource() == buttonCos){
      scientificOutput("cos");
    }
    if (e.getSource() == buttonTan){
      scientificOutput("tan");
    }
    if (e.getSource() == buttonLog){
      scientificOutput("log");
    }
    if (e.getSource() == buttonLn){
      scientificOutput("ln");
    }
    if (e.getSource() == buttonSqrt){
      scientificOutput("\u221A");
    }

    //calculate
    if(e.getSource() == buttonEqual){
      continuenum1 = false;
      continuenum2 = false;
      continuescientificnum = false;
      if (!(num1 == "") && !(num2 == "")){
        convertedNum1 = Double.parseDouble(num1);
        convertedNum2 = Double.parseDouble(num2);  
      }
      if (!(scientificnum == "")){
        convertedScientificNum = Double.parseDouble(scientificnum);
      }
      if (operator.equals("sin")){
        result = Math.sin(Math.toRadians(convertedScientificNum));
        label.setText(" " + operator + " " + scientificnum + " = " + result);
      }
      else if (operator.equals("cos")){
        result = Math.cos(Math.toRadians(convertedScientificNum));
        label.setText(" " + operator + " " + scientificnum + " = " + result);
      }
      else if (operator.equals("tan")){
        result = Math.tan(Math.toRadians(convertedScientificNum));
        label.setText(" " + operator + " " + scientificnum + " = " + result);
      }
      else if (operator.equals("log")){
        result = Math.log10(convertedScientificNum);
        label.setText(" " + operator + " " + scientificnum + " = " + result);
      }
      else if (operator.equals("ln")){
        result = Math.log(convertedScientificNum);
        label.setText(" " + operator + " " + scientificnum + " = " + result);
      }
      else if (operator.equals("\u221A")){
        result = Math.sqrt(convertedScientificNum);
        label.setText(" " + operator + " " + scientificnum + " = " + result);
      }
      else if (operator.equals("+")){
        result = convertedNum1 + convertedNum2;
        label.setText(" " + num1 + " " + operator + " " + num2 + " = " + result);
      }
      else if (operator.equals("-")){
        result = convertedNum1 - convertedNum2;
        label.setText(" " + num1 + " " + operator + " " + num2 + " = " + result);
      }
      else if (operator.equals("*")){
        result = convertedNum1 * convertedNum2;
        label.setText(" " + num1 + " " + operator + " " + num2 + " = " + result);
      }
      else if (operator.equals("/")){
        result = convertedNum1 / convertedNum2;
        label.setText(" " + num1 + " " + operator + " " + num2 + " = " + result);
      }
      else if (operator.equals("^")){
        result = Math.pow(convertedNum1, convertedNum2);
        label.setText(" " + num1 + " " + operator + " " + num2 + " = " + result);
      }
      else if (operator.equals("E")){
        result = convertedNum1 * Math.pow(10, convertedNum2);
        label.setText(" " + num1 + " " + operator + " " + num2 + " = " + result);
      }
      num1 = "";
      num2 = "";
      scientificnum = "";
      operator = "";
      convertedNum1 = 0;
      convertedNum2 = 0;
      convertedScientificNum = 0;
      continuenum1 = false;
      continuenum2 = false;
      continuescientificnum = false;
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
      continuescientificnum = false;
      scientificnum = "";
      label.setText(" " + num1 + " " + operator + " " + num2);
    }
  }
}
