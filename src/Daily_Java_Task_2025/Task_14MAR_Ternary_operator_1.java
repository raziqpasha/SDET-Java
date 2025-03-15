package Daily_Java_Task_2025;

//Take a user input 2 numbers from the arguments and
// calculate the maximum in between with ternary operator.

public class Task_14MAR_Ternary_operator_1 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]); //65
        int b=Integer.parseInt(args[1]); //20

        //String format is method in java is basically give
        // output in formatted string ex : My age is 25 years.
        String result = (a>b) ? String.format("%d is greater",a) : String.format(" %d is smaller",b);
        System.out.println(result);

    }

}
