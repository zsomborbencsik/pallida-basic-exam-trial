import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UrlFromHandles{

  public static void main(String[] args){
    ArrayList<String> handles = new ArrayList<>();
    handles.add("ghand");
    System.out.println(url(handles.get(0)));

  }

  static ArrayList<String> url (List<String> input) {
    for (int i = 0; i < input.size(); i++) {
      return input.set(i,String"Asd");

    }
  }
}


// Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
// GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

// example:
// input: ["ghhandle1", "ghhandle2"]
// output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]

