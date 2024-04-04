import java.util.HashMap;
import java.util.List;


public class Controller {
    Model model = new Model();
    List<String> fruitList = model.readFile();
    int totalFruit = model.totalFruit(fruitList);
    String maxLengthName = model.maxLengthNameFruit(fruitList);
    HashMap<String, Integer> fruitMap = model.MapCreate(fruitList);
    public void printFruit(HashMap<String, Integer> fruitMap){
        for (String fruit: fruitMap.keySet()) {
            String value = fruitMap.get(fruit).toString();
            System.out.println(fruit + " " + value);
        }
    }
    String popularFruit = model.popularFruit(fruitMap);






}
