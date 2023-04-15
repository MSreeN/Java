package Collections;


import java.util.TreeSet;

public class PointComparable {
  public static void main(String[] args) {
    TreeSet<Point> ts = new TreeSet();
    ts.add(new Point(3,5));
    ts.add(new Point(1,1));
    ts.add(new Point(4, 9));
    System.out.println(ts);
  }
}

class Point implements Comparable<Object>{
  int x, y;
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  @Override
  public int compareTo(Object o){
    Point p = (Point)o;
    if(this.x > this.y){
      return 1;
    }
    else if(this.x < this.y){
      return -1;
    }
    else{
      if(this.y > p.y){
        return 1;
      }
      else if(this.y < p.y){
        return -1;
      }
      else{
        return 0;
      }
    }
  }
}