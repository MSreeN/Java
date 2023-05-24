package Collections.Map;

public class TreeMapInt implements Comparable {
  int a;
  TreeMapInt(int a){
    this.a =a ;
  }
  public int compareTo(Object object){
    Integer s1 = (Integer)object;
    if(this.a > s1) return -1;
    if(this.a < s1) return 1;
    else return 0;
  }
}
