public class TIS_Ticket{
  private String type;
  private String age;
  private double price;

  //Defines single ticket.
  public TIS_Ticket(String type, String age, double price){
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
}
