public class Bank {
    String name;
    int Balance;
    int IFSC_code;
    int password=1234;
    int uppin=9876;
    Bank(String name,int Balance,int IFSC_code,int password,int uppin){
        this.name=name;
        this.Balance=Balance;
        this.IFSC_code=IFSC_code;
        this.password=password;
        this.uppin=uppin;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Balance: "+Balance);
        System.out.println("IFSC Code: "+IFSC_code);
        System.out.println("Password: "+password);
        System.out.println("Uppin: "+uppin);
    }
    public static void main(String[] args) {
        Bank b1=new Bank("SBI",50000,123456,1234,9876);
        b1.display();
    }
    
}
