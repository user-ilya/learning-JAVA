package org.example;
import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<>();
        array.add(34.6);
        array.add(0, 34.0);
        array.add(1, 34.2);
        array.add(1, 34.5);
        array.add(Double.parseDouble("123"));
        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            Double maxValue = 0.0;
            if (maxValue < array.get(i)) maxValue = array.get(i);
            System.out.println("Максимальное значение: " + maxValue);
            double avgValue = 0.0;
            for (Double value : array) {
                avgValue += value / 2;
            }
            System.out.println("Среднее значение: " + avgValue);
        }

        System.out.println("Наша семья: ");

        ArrayList<String> arrayName = new ArrayList<>();
        arrayName.add("Светлана");
        arrayName.add("Матвей");
        arrayName.add("Алексей");
        arrayName.add("Илюша");
        System.out.println(arrayName.get(0));

        HashMap<String, String> statesCapitals = new HashMap<>();
        statesCapitals.put("Canada", "Toronto");
        statesCapitals.put("Russian", "Moscow");
        statesCapitals.put("Irak", "Bagdad");
        statesCapitals.put("Canada", "Ottava");
        System.out.println(statesCapitals.get("Russian") + statesCapitals.get("Canada"));


    }
}