package H_W_6.HW5;

/*
 Пусть дан список сотрудников:Иван Иванов Светлана Петрова Кристина Белова Анна Мусина 
 Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова 
 Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности.
 */

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 
 public class task_2 {
     public static void main(String[] args) {
         List<String> people = new ArrayList<>();
         people.add("Иван Иванов");
         people.add("Светлана Петрова");
         people.add("Кристина Белова");
         people.add("Анна Мусина");
         people.add("Анна Крутова");
         people.add("Иван Юрин");
         people.add("Петр Лыков");
         people.add("Павел Чернов");
         people.add("Петр Чернышов");
         people.add("Мария Федорова");
         people.add("Марина Светлова");
         people.add("Мария Савин");
         people.add("Мария Рыкова");
         people.add("Марина Лугова");
         people.add("Анна Владимирова");
         people.add("Иван Мечников");
         people.add("Петр Петин");
         people.add("Иван Ежов");
 
         Map<String, Integer> nameList = new HashMap<>();
 
         for (int i = 0; i < people.size(); i++) {
             String temp = people.get(i).replace(" ", "_");
             String[] arr = temp.split("_");
             if (nameList.containsKey(arr[0])) {
                 nameList.put(arr[0], nameList.get(arr[0]) + 1);
             } else {
                 nameList.put(arr[0], 1);
             }
         }
         System.out.print("Список повторяющихся имен: \n");
         nameList.entrySet().stream()
         .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
         .forEach(System.out::println);
     }
 }