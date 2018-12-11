import java.util.Scanner;
import java.text.DecimalFormat;

public class TIS_Main {
  private static DecimalFormat precision = new DecimalFormat("#0.00");

  public static void main(String[] args) {
    TIS_Main main = new TIS_Main();
    Scanner scan = new Scanner(System.in);

    main.printWelcome();

    while(true) {
      int choice;

      main.printActions(TIS_Tickets.getTickets());
      while(true) {
        try{
          choice = scan.nextInt();
          scan.nextLine(); //remove newline

          if(choice >= 1 && choice <= 6)
            break;

          System.out.println("  Invalid choice, try again.");
        }
        catch(Exception e){
          System.out.println(scan.nextLine() + " is not valid choice.");
        }
      }

      if(choice == 6)
        break;

      //implementing the chosen ticket type
      TIS_Ticket chosenTicket = TIS_Tickets.getTickets()[choice -1];
      System.out.println("  Chosen Ticket: " + chosenTicket.getType() + ", " + chosenTicket.getPrice() + " SEK");

      System.out.println(" Register accountnumber: ");
      String accountNr = scan.nextLine();

      accountNr = accountNr.replace("-", "").replace(" ", ""); //Remove all - and spaces from the accountNr


      TIS_TransactionStatus result = TIS_Transaction.makeTransaction(accountNr, chosenTicket.getPrice());
      if(result.getSuccessful()){
        main.printReceipt(chosenTicket.getType(), chosenTicket.getPrice(), result.getBank());
      } else {
        System.out.println("Try again.");
      }
    }
  } //main

  private void printWelcome(){
    System.out.println("\n    Welcome to our ticket machine!");

  }
  private void printActions(TIS_Ticket[] ticketList){
    System.out.println("*   Select your ticket:   *");
    for (int i=0; i < ticketList.length; i++){
      System.out.println( (i+1) + ". Add " + ticketList[i].getType() + " " +
      ticketList[i].getAge() + " " + precision.format(ticketList[i].getPrice()) + " SEK.");
    }
    System.out.println("6. Exit ticket machine.    ");

  }
   public void printReceipt(String type, double price, String bank){
     System.out.println("===== Recepipt======");
     System.out.println("Ticket: " + type);
     System.out.println("Price:  " + precision.format(price) + " SEK");
     System.out.println("Bank:   " + bank);
     System.out.println("====================");
   }

}
