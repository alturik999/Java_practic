// Task_3
// import java.util.ArrayDeque;
// import java.util.Arrays;
// import java.util.Deque;

// public class Task_3 {

// // Дан Deque состоящий из последовательности цифр.
// // Необходимо проверить, что последовательность цифр является палиндромом
// public static void main(String[] args) {
//     Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

// }


// public boolean checkOn(Deque<Integer> deque){

//     return false;
// }
// }

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task_1 {

// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6,5,4,3,4,5,6));

boolean res = true;
for (int i = 0; i < deque.size() / 2; i ++) {
int f = deque.pollFirst();
int l = deque.pollLast();
if (f != l) {
res = false;
break;
}
}

System.out.println(res ? "Палиндром" : "Не палиндром");
}
}