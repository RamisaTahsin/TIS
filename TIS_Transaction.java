public class TIS_Transaction {
  TIS_Transaction newBuy = new TIS_Transaction();

  //newBuy.purchaseTicket();
  //I am not sure here how to get the object from the MHS file

  public boolean returnResponseFromBank(){
    get.response();
    if (response = "Wrong accountNr" || response = "Insufficient Funds"){
      return false;
    }
    else{
      return true;
    }
}
