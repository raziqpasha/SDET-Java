package ex_29_Exceptions;

public class Lab153_Bank {
    private Integer amount;
    private String currency;
    Lab153_Bank(Integer amount,String currency){
        this.amount =amount;
        this.currency=currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    Integer add(Lab153_Bank bankname){
        if(bankname.currency.equals("INR")){
            return bankname.amount + this.amount;
        }
else{
            try {
                throw new currencyMismatchException("currency mismatch ");
              //  System.out.println("currency mismatch ");
            } catch (Exception e) {
                System.out.println(e.getMessage());            }
        }
return 0;
    }

}


class currencyMismatchException extends Exception{
    currencyMismatchException(String s){
        super(s);
    }
}

class NotValidAgeException extends Exception{
    NotValidAgeException(String e){
        super(e);
    }
}