package Collections;


public class SortEle implements Comparable<Object>{
    String s1;
    SortEle(String s){
      this.s1 = s;
    }

    @Override
    public String toString() {
      return this.s1;
    }
  // @Override  
  // public int compare(Object o1, Object o2) {
  //   String s1 = (String)o1;
  //   String s2 = (String)o2;
  //   if(s1.compareTo(s2)>0) return -1;
  //   else if(s1.compareTo(s2)<0) return 1;
  //   else return 0;
  // }
  @Override
  public int compareTo(Object o2) {
    SortEle s2 = (SortEle)o2;
    if(this.s1.compareTo(s2.s1)>0) return -1;
    else if(this.s1.compareTo(s2.s1) < 0) return 1;
    else return 0;
    
  }
  
}
