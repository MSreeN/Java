public class StuChallThread1 {
    public static void main(String[] args) {

        Atm a = new Atm();
        Customer c1 = new Customer("Thread1", 100, a);
        Customer c2 = new Customer("Thread2", 500, a);
        Customer c3 = new Customer("Thread33", 300, a);
        c1.start();
        c2.start();
        c3.start();
    }

}

class Atm{
        synchronized public void checkBalance(String name) {
            System.out.println(name + " is checking");

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {

            }
            System.out.print(" balance");
            System.out.println();
        }

        synchronized public void withdraw(String name, int amount) {
            System.out.println(name + " is withdrawing ");
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {

            }
            System.out.print(" " + amount + " rupees");
            System.out.println();

        }
}

class Customer extends Thread
{
    String name;
    int amount;
    Atm atm;
    
    Customer(String n,int amt,Atm a)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    { 
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}

// class ATM
// {
    
//     synchronized public void checkBalance(String name)
//     {
//        System.out.print(name + " Checking ");
       
//        try{Thread.sleep(1000);}catch(Exception e){}
       
//        System.out.println("Balance");
//     }
    
//     synchronized public void withdraw(String name,int amount)
//     {
//         System.out.print(name + " withdrawing "); 
        
//         try{Thread.sleep(1000);}catch(Exception e){}
        
//         System.out.println(amount);
        
//     }
// }

// class Customer extends Thread
// {
//     String name;
//     int amount;
//     ATM atm;
    
//     Customer(String n,ATM a,int amt)
//     {
//         name=n;
//         atm=a;
//         amount=amt;
//     }
//     public void useATM()
//     { 
//         atm.checkBalance(name);
//         atm.withdraw(name, amount);
//     }
//     public void run()
//     {
//         useATM();
//     }
// }

// public class StuChallThread1
// {
//     public static void main(String[] args) 
//     {
//         ATM atm=new ATM();
//         Customer c1=new Customer("Smith",atm,100);
//         Customer c2=new Customer("John",atm,200);
//         Customer c3=new Customer("sree",atm,600);
//         c1.start();
//         c2.start();
//         c3.start();
        
        
//     }   
// }
