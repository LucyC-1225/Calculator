import java.util.Scanner;
class Main {
  static Scanner x = new Scanner(System.in);
  static Scanner y = new Scanner(System.in);
  static Scanner z = new Scanner(System.in);

  static double num1;
  static double num2;
  static String operator;

  public static void main(String[] args) {
    getNum1();
    getNum2();
    getOperator();
    calcResult();
  }

  public static void getNum1(){
    System.out.println("Enter the first number: ");
    while(!x.hasNextDouble()){
      x.next();
      System.out.println("Invalid number. Please try again.");
      System.out.println("Enter the first number: ");
    }
      num1 = x.nextDouble();
    
  }

  public static void getNum2(){
    System.out.println("Enter the second number: ");
    while(!y.hasNextDouble()){
      y.next();
      System.out.println("Invalid number. Please try again.");
      System.out.println("Enter the second number: ");
    }
    num2 = y.nextDouble();
  }

  public static void getOperator(){
    System.out.println("Enter the operation. Enter + for addition, - for subtraction, * for multiplication, and / for division: ");
    while(!(z.hasNext("[+\\-*/]"))){
      System.out.println("Invalid operator. Please try again.");
      System.out.println("Enter the operation. Enter + for addition, - for subtraction, * for multiplication, and / for division: ");
      z.next();
    }
    operator = z.next();  
  }
  public static void calcResult(){
    if (operator.equals("+")){
      System.out.println("Result: " + (num1 + num2));
    }
    else if (operator.equals("-")){
      System.out.println("Result: " + (num1 - num2));
    }
    else if (operator.equals("*")){
      System.out.println("Result: " + (num1 * num2));
    }
    else if (operator.equals("/")){
      System.out.println("Result: " + (num1 / num2));
    }
  }
}