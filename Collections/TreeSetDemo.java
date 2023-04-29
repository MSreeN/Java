package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Point implements Comparable{
  int x,y;
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  @Override
  public int compareTo(Object o) {
    Point p = (Point)o;
    if(this.x < p.x) 
      return -1;
    else if(this.x > p.x)
      return 1;
    else{
      if(this.y > p.y)
        return 1;
      else if(this.y < p.y)
        return 1;
      else
        return 0;
    }
  }

  public String toString(){
    return "x : "+x + " y : "+y;
  }
}


public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<Point> ts = new TreeSet<>();
    ts.add(new Point(8, 8));
    ts.add(new Point(0, 0));
    ts.add(new Point(5,6));
    ts.add(new Point(1, 8));
    ts.add(new Point(9, 0));
    ts.add(new Point(0, 9));
    // System.out.println(ts);
    // Iterator<Point> li = ts.iterator();
    // while(li.hasNext()){
    //   Point p = li.next();
    //   System.out.println(p.x + " " + p.y);
    // }
    TreeSet<Integer> intTs = new TreeSet<>(Comparator.reverseOrder());
    intTs.add(5);
    intTs.add(65);
    intTs.add(44);
    intTs.add(3);
    intTs.add(6);

    // Iterator<Integer> itr = intTs.iterator();
    // while(itr.hasNext()){
    //   System.out.println(itr.next());
    
    TreeSet<String> tst = new TreeSet<>(new SortEle());
    tst.add("b");
    tst.add("a");
    tst.add("d");
    tst.add("c");

    System.out.println(tst);

  }

}



