enum Dept {
  CS("sam"), IT("ram"), ECE("mounica"), ME("vijay"), AG("sandeep");

  private Dept(String s) {
    System.out.println(s);
  }

  private Dept() {
    // System.out.println(this.name());
    System.out.println("htllo");
  }

  public void display() {
    System.out.println(this.name() + " " + this.ordinal());
  }
}

public class EnumClass {
  public static void main(String[] args) {
    Dept a = Dept.AG;
    // System.out.println(a);
    a.display();
  }

}
