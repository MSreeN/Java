enum Dept {
  CS("sam"), IT("ram"), ECE("mounica"), ME("vijay"), AG("sandeep");
  public String value;
  private Dept(String s) {
    // System.out.println(s);
    value = s;
  }

  // private Dept() {
  //   // System.out.println(this.name());
  //   System.out.println(");
  // }

  // public void display() {
  //   System.out.println(this.name() + " " + this.ordinal());
  // }
}

public class EnumClass {
  public static void main(String[] args) {
    for (Dept dept : Dept.values()) {
      System.out.println(dept +" "+ dept.value);
    }
  }

}
