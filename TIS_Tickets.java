public class TIS_Tickets {

  public static TIS_Ticket[] getTickets(){
    TIS_Ticket[] ticketList = {
      new TIS_Ticket("Child", "Between 1-10 years", 10.00),
      new TIS_Ticket("Young Adult", "Between 11-17 years", 15.50),
      new TIS_Ticket("Adult", "Between 18-64 years", 22.50),
      new TIS_Ticket("Senior", "64+ years", 15.00),
      new TIS_Ticket("Family Ticket", "Min 1 Adult/Senior, max 2 Adult/Senior, min 1 Child, max 3 Child", 40.50)
                  };
    return ticketList;
  }
}
