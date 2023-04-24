// Task_5
// import java.util.Deque;

// public class Task_5 {

//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

// public static void main(String[] args) {

// }

// public boolean validate(Deque<Integer> deque){

//     return false;
// }
// }
import java.util.Deque;
import java.util.*;

public class task_3 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>(Arrays.asList("(", ")", "[", "]"));
        // Deque<String> deque = new ArrayDeque<>(Arrays.asList("[","(", ")","]"));
        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i ++) {
            String f = deque.pollFirst();
            String l = deque.pollLast();
                if (f.equals("(")) {
                    if (l.equals(")")){
                    res = true;}
                else{
                    res = false;
                    break;
                }}
                if (f.equals("{")) {
                    if (l.equals("}")){
                    res = true;}
                else{
                    res = false;
                    break;
                }}
                if (f.equals("[")) {
                    if (l.equals("]")){
                    res = true;}
                else{
                    res = false;
                    break;
                }}
        }
        System.out.println(res ? "True" : "False");
    }    
}