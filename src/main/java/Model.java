import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Model {
    public List<String> readFile(){
        List<String> listFruit = new ArrayList<String>();

        try {
            String path = "src/main/java/input.txt";
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] fruit = line.split(" ");
                for (int i = 0; i < fruit.length; i++) {
                    if (fruit[i].length() > 1) {
                        listFruit.add(fruit[i]);
                    }
                }
                line = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Ошибка чтения");
        } finally {
            return listFruit;
        }

    }

    public int totalFruit(List<String> listFruit){
        return listFruit.size();
    }

    public String maxLengthNameFruit(List<String> listFruit){
        String maxNameFr = null;
        int maxLengthFr = 1;
        for (String fruit : listFruit){
            if(maxLengthFr < fruit.length()){
                maxNameFr = fruit;
                maxLengthFr = fruit.length();
            }
        }
        return maxNameFr;
    }

    public HashMap<String, Integer> MapCreate(List<String> listFruit){
        HashMap<String, Integer> fruitMap = new HashMap<>();
        int total = 1;
        for (String fruit : listFruit) {
            if(fruitMap.containsKey(fruit)){
                int value = fruitMap.get(fruit) + 1;
                fruitMap.put(fruit, value);
            }else{
                fruitMap.put(fruit, total);
            }

        }
        return fruitMap;
    }
    public String popularFruit(HashMap<String, Integer> fruitMap){
        int maxValue = 0;
        String nameMaxValue = null;
        for (String fruit: fruitMap.keySet()){
            if(maxValue < fruitMap.get(fruit)){
                maxValue = fruitMap.get(fruit);
                nameMaxValue = fruit;
            }
        }
        return nameMaxValue;
    }

}
