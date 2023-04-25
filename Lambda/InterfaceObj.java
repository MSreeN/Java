package Lambda;

public class InterfaceObj {
  public static void main(String[] args) {
    OverrideAbsClass obc = new OverrideAbsClass();
    obc.methodCall();
  }
}

interface AbsClass{
  public abstract void sample();
  public abstract void display();
}

class OverrideAbsClass{
  AbsClass ac = new AbsClass(){
    public void sample(){
      System.out.println("sample class");
    }

    public void display(){
      System.out.println("display class");
    }
  };

  public void methodCall(){
    ac.display();
    ac.sample();
  }
}
