public class TIS_Tickets {

  private String type;
  private String age;
  private double price;

  public TIS_Tickets(){
    
  }

  public TIS_Tickets(String type, String age, double price){
    this.type = type;
    this.age = age;
    this.price = price;
  }

  public String getType(){
    return type;
  }
  public String getAge(){
    return age;
  }
  public double getPrice(){
    return price;
  }

  public TIS_Tickets[] createTicket(){
    TIS_Tickets[] ticketList = {
       new TIS_Tickets("Child", "Between 1-10 years ", 10.00),
       new TIS_Tickets("Young Adult", "Between 11-17 years ", 15.50),
       new TIS_Tickets("Adult", "Between 18-64 years ", 22.50),
       new TIS_Tickets("Senior", "64+ years", 15.00),
       new TIS_Tickets("Family Ticket", "Min 1 Adult/Senior, max 2 Adult/Senior, min 1 Child, max 3 Child", 40.50)
                    };
     return ticketList;
   }
}
