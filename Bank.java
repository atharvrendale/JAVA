

class Account{
    public String name;
    protected String email;
    private int pincode;

    // getters and setters 
    public int getPincode(){
        return this.pincode;
    }
    public void setPincode( int pin){
        this.pincode= pin;
    }
}


public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name =" Atharv Rendale";
        account1.email= "atharvrendale0718@gmail.com";
        account1.setPincode(1234);
        System.out.println(account1.getPincode());
            }
}
