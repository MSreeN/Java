import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Practice {
  public static void main(String[] args) {
    List<List<Integer>> list = new ArrayList<>();
    list.add(new ArrayList<>(List.of(1,2,100)));
    list.add(new ArrayList<>(List.of(2,5,100)));
    list.add(new ArrayList<>(List.of(3,4,100)));
    arrayManipulation(5, list);
  }

  public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
    List<Long> finalList = new ArrayList<>(Collections.nCopies(n, 0L));
    for (int i = 0; i < queries.size(); i++) {
      List<Integer> innerList = queries.get(i);
      // for(int j = 0; j< innerList.size(); j++){
      int start = innerList.get(0);
      int end = innerList.get(1);
      int value = innerList.get(2);
      for (int k = start - 1; k < end; k++) {
        finalList.set(k, finalList.get(k) + value);
      }
      // }
      finalList.sort(Comparator.naturalOrder());
    }
    Collections.max(finalList);
    return finalList.get(finalList.size() - 1);
  }

  public static List<Integer> sparseArrays(List<String> stringList, List<String> queries) {
    List<Integer> result = new ArrayList<>();
    ListIterator<String> li = stringList.listIterator();
    for (int i = 0; i < queries.size(); i++) {
      int count = 0;
      while (li.hasNext()) {
        if (queries.get(i).equals(li.next()))
          count++;
      }
    }
    return result;
  }
}
