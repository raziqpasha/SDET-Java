package ex_09_Switch_Statement;

public class Lab65_Interview_Switch_1 {
    public static void main(String[] args) {
        /*
        ✅ What will be the output?
➡️ There will be no output at all.

✅ Why?
The switch(a) statement is syntactically correct, but since there are no case or default blocks inside, nothing will be executed.
The compiler does not throw an error, as an empty switch block is allowed.
The program runs successfully, but nothing is printed to the console.

         */
        int a=10;
        switch(a){

        }
    }
}
