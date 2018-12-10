public class TIS_TransactionStatus{
  boolean successful;
  String bank;
  public boolean getSuccessful(){
    return successful;
  }

  public String getBank(){
    return bank;
  }
  public TIS_TransactionStatus(boolean successful, String bank){
    this.successful = successful;
    this.bank = bank;
  }
}
