package Collections;
import java.util.*;

public class Methods {
    //№1_________________
    public static int countOccurance(List<String> list, String word) {
        int count = 0;
        for (String a : list) {
            if (a.equals(word)) {
                count++;
            }
        }
        return count;
    }

    //№2_________________
    public static List<String> toList(String[] array) {
        List<String> list = Arrays.asList(array);
        return list;
    }

    //№3_________________
    public static HashSet<Integer> findUnique(List<Integer> list) {
        return new HashSet<>(list);
    }

    //№4.1_________________
    public static void calcOccurance(List<String> list) {
        Map<String, Integer> Words = new HashMap<>();
        for (String word : list) {
            Words.put(word, Words.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> EntryMap : Words.entrySet()) {
            System.out.println(EntryMap.getKey() + "' quantity: " + EntryMap.getValue());
        }
    }

    //№4.2________________
     static class Car {
        private String brend;
        private int occurance;

        public Car(String brend, int occurance) {
            this.brend = brend;
            this.occurance = occurance;
        }
        @Override
        public String toString() {
            return "{brend= " + brend + ", occurance: " + occurance + "}";
        }
    }
        public static List<Car> findOccurance(List<String> list) {
            Map<String, Integer> Words = new HashMap<>();
            for (String word : list) {
                Words.put(word, Words.getOrDefault(word, 0) + 1);
            }
            List<Car> ResultList = new ArrayList<>();
            for (Map.Entry<String, Integer> EntryMap : Words.entrySet()) {
                ResultList.add(new Car(EntryMap.getKey(), (EntryMap.getValue())));
            }
            return ResultList;
        }

        //_____________________________________________________________
        public static void main(String[] args) {
            //№1___________
            String Steak ;
            List<String> Menu = new ArrayList<>();
            Menu.add("Salad");
            Menu.add("Soup");
            Menu.add("Steak");
            Menu.add("Potato");
            Menu.add("Tea");
            Menu.add("Coffee");
            Menu.add("Steak");
            System.out.print("numb. of coincidences: " +countOccurance(Menu,"Steak"));
            System.out.println();
            System.out.println();

            //№2___________
            String[] a = {"java", "the ", "best "};
            System.out.print(Methods.toList(a));
            System.out.println();
            System.out.println();

            //№3___________
            List<Integer> NumbList = new ArrayList<>();
            NumbList.add(2);
            NumbList.add(5);
            NumbList.add(7);
            NumbList.add(11);
            NumbList.add(3);
            NumbList.add(9);
            NumbList.add(11);
            NumbList.add(11);
            NumbList.add(2);
            HashSet<Integer> NumbSet = findUnique(NumbList);
            System.out.print(NumbSet + ", ");
            System.out.println();
            System.out.println();

            //№4.1_____________
            List<String> WordList = new ArrayList<>();
            WordList.add("Tree");
            WordList.add("Clock");
            WordList.add("Animals");
            WordList.add("Tree");
            WordList.add("Home");
            WordList.add("Table");
            WordList.add("Clock");
            WordList.add("Car");
            WordList.add("Tree");
            calcOccurance(WordList);
            System.out.println();
            System.out.println();

            //№4.2_____________
            List<String> CarList = new ArrayList<>();
            CarList.add("BMW");
            CarList.add("Tesla");
            CarList.add("Mercedes");
            CarList.add("BMW");
            CarList.add("Mitsubishi");
            CarList.add("Tesla");
            CarList.add("Chevrolet");
            CarList.add("Jaguar");
            CarList.add("BMW");
            System.out.print(findOccurance(CarList));
            System.out.println();

        }
    }








