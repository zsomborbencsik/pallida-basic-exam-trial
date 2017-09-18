import java.util.HashMap;

public class Dictionary{
  static HashMap<String,String> map;

  public static void main(String[] args) {

    HashMap<String,String>map = new HashMap<String,String>();
    map.put("alma", "apple");
    map.put("fa", "tree");
    String something = "alma";
    System.out.println(translateToHun(map.get("alma")));


  }

  // Implement this method. It should add the given key-value pair to the the map
  public static void addWord(String hunWord, String engWord) {
    map.put(hunWord, engWord);

  }

  // Implement this method. It should remove the key-value pair by the given key from the map
  public static void removeWord(String hunWord) {
    map.remove(hunWord);

  }

  // Implement these methods. They should return the translation of the given word from the map
  public static String translateToHun(String engWord) {
  return null;

  }

  public static String translateToEng(HashMap<String, String> hunWord) {

    return map.get(hunWord);
  }
}
