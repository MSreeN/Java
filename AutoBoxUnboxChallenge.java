import java.util.ArrayList;

public class AutoBoxUnboxChallenge {
  public static void main(String[] args) {
    Customer customer = new Customer("sree", 5000.0);
    System.out.println(customer);
    Bank bank= new Bank("Chase");
    bank.addNewCustomer("sree", 500.0);
    System.out.println(bank);
    bank.addTransaction("sree", 1000.0);
    bank.addTransaction("seree", 1000.0);
    System.out.println(bank);
    bank.printStatement("sree");
    bank.printStatement("sreee");
  }
}

class Customer{
  public String customerName;
  ArrayList<Double> transactions = new ArrayList<>(500);
  public Customer(String name, double deposit){
    this.customerName = name.toUpperCase();
    transactions.add(deposit);
  }
  @Override
  public String toString() {
    return "Customer [customerName=" + customerName + ", transactions=" + transactions + "]";
  }
  
}

class Bank{
  String name;
  ArrayList<Customer> customers = new ArrayList<>();
  public Bank(String name){
    this.name  = name;
  }
  private Customer getCustomer(String customerName){
    for(Customer customer: customers){
      if(customer.customerName.equalsIgnoreCase(customerName)){
        return customer;   
      }
      
    }
    return null;
  }
  public void addNewCustomer(String customerName, double deposit){
    if(getCustomer(customerName) == (null)){
      Customer customer = new Customer(customerName, deposit);
      customers.add(customer);
    }
  }

  public void addTransaction(String name, double transaction){
    Customer customer = getCustomer(name);
    if(customer != null){
      customer.transactions.add(transaction);
    }
    else{
      System.out.println("Customer with name "+ name+ " wasn't found");
    }
  }
  
  public void printStatement(String customerName){
    Customer customer = getCustomer(customerName);
    if(customer == null){
      System.out.println("Customer with name "+ customerName+ " wasn't found");
      return;
    }
    System.out.println(customer.transactions);
  }
  @Override
  public String toString() {
    return "Bank [name=" + name + ", customers=" + customers + "]";
  }

}