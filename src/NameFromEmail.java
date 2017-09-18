import java.util.Scanner;

public class NameFromEmail{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Your Email: ");
    String user_input = scan.next();

    System.out.println(emailToName(user_input));


  }

  static String emailToName (String input) {
      int index = input.indexOf('@');
      int indexdot = input.indexOf('.');
      String name = input.substring(0,index);
      name = name.replace("."," ");
      name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
      String myArray[] = name.split(" ");
      myArray[1] = myArray[1].substring(0,1).toUpperCase() + myArray[1].substring(1).toLowerCase();
      String newString = myArray[1] + " " + myArray[0];


      return newString;



  }
}



// Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
//and returns a string that represents the user name in the following format: lastName firstName
//example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
//accents does not matter
