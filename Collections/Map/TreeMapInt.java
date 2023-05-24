package Collections.Map;

public class TreeMapInt implements Comparable<Object> {
  int a;
  TreeMapInt(int a){
    this.a =a ;
  }
  public int compareTo(Object object){
    TreeMapInt treeMapInt = (TreeMapInt)object;
    if(this.a > treeMapInt.a) return 1;
    if(this.a < treeMapInt.a) return -1;
    else return 0;
  }

  public String toString(){
    return ""+a;
  }
}
