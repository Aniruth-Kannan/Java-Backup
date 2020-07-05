package javaAssignment;

public class topic2_As2_CreditCardPayment extends topic2_As4_Payment{
    String nameOnCard,ExpDate,CardNo;

    public topic2_As2_CreditCardPayment(String nameOnCard1, String ExpDate1, String cardNo1){
        nameOnCard = nameOnCard1;
        ExpDate = ExpDate1;
        CardNo = cardNo1;
    }

    public void paymentDetails(){
        System.out.println("Name: " + nameOnCard + " ExpDate: " + ExpDate + " CardNo: " + CardNo);
    }
}
