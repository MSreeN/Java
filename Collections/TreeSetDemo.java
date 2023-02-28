package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
    ts.add(new Point(5,6));
    ts.add(new Point(1, 8));
    ts.add(new Point(9, 0));
    ts.add(new Point(0, 9));
    // System.out.println(ts);
    Iterator<Point> li = ts.iterator();
    while(li.hasNext()){
      System.out.println(li.next());
    }
  }

}



