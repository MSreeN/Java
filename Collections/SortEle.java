package Collections;

import java.util.Comparator;

public class SortEle implements Comparator<Object>{

  @Override
  public int compare(Object o1, Object o2) {
    String s1 = (String)o1;
    String s2 = (String)o2;
    if(s1.compareTo(s2)>0) return -1;
    else if(s1.compareTo(s2)<0) return 1;
    else return 0;

  }
  
}
