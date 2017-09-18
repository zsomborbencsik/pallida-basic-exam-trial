import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddFilter {

  public static void main(String[] args) {
    List<Integer> mainList = new ArrayList<>();
    mainList.add(1);
    mainList.add(2);
    mainList.add(3);
    mainList.add(4);
    mainList.add(5);
    mainList.add(6);

    System.out.println(oddlist(mainList));


  }

  static List<Integer> oddlist (List<Integer> input) {
    List<Integer> oddElements = new ArrayList<>();
    for (int i = 0; i < input.size(); i++) {
      if ((i % 2) != 0) {
        oddElements.add(i);
      }

    }
    return oddElements;
  }
}


// Create a function that takes a list as a parameter,
// and returns a new list with every odd element from the orignal list

// should print [1, 3, 5]
