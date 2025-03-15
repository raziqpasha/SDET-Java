package Daily_Java_Task_2025;

public class Task_14Mar_PrePost_Increment_Operator {
    public static void main(String[] args) {
            int a = 10;
            System.out.println(++a + a++ + a++); // 11(pre) + 11(post) + 12(post) =34
            System.out.println(a); // last value of a is 12 so o/p ->13
        // After the last post-increment (a++), a becomes 13.



    }
}
