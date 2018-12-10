import java.util.Scanner;
import java.text.DecimalFormat;

public class TIS_Main {
  static DecimalFormat precision = new DecimalFormat("#0.00");

  private void printWelcome(TIS_Tickets[] ticketList){

   System.out.println("\n       Welcome to our ticket machine!        ");

   for (int i=0; i < ticketList.length; i++){
     System.out.println( (i+1) + " " + ticketList[i].getType() + " " +
     ticketList[i].getAge() + " " + precision.format(ticketList[i].getPrice()) + " kr.");
   }

  }
   public void printReceipt(){
     System.out.println("Type" + type + "Age" + age + "Price" + price);
   
   }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while(true) {
      String choice = "";
      System.out.println("What ticket do you want to buy? \n1. Child \n2. Young Adult \n3. Adult \n4. Senior \n5. Family Ticket \n6. Cancel");

      while(true) {
        choice = scan.nextLine();
        if(choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5") || choice.equals("6"));
          break;
      }
      //implementing the chosen ticket type

      System.out.println(" Register accountnumber: ");
      accountNr = scan.nextLine();
    }
  } //main
}
