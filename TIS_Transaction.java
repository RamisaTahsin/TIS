public class TIS_Transaction {

  public static TIS_TransactionStatus  makeTransaction(String accountNr, double price){
    //String result = MHS_Main.purchaseTicket(accountNr, price);
    String result = "SEB";

    if(result.equals("Wrong accountNr")){
      return new TIS_TransactionStatus(false, "");
    }else if(result.equals("Insufficient Funds")){
      return new TIS_TransactionStatus(false, "");
    }else if(result.equals("Nordea") || result.equals("Handelsbanken") ||
            result.equals("SEB") || result.equals("Swedbank")){
      return new TIS_TransactionStatus(true, result);
    } else {
      return new TIS_TransactionStatus(false, "");
    }
  }
}
