package ex_03_Literals;

public class Lab21_Escape_Char {
    public static void main(String[] args) {
        char new_line='\n'; //It moves the cursor to the next line.
        System.out.print("new line" + new_line);
        char tab_line='\t'; //  It gives a little space between words.
        System.out.print("tab line" + tab_line);
        char back_space='\b'; // It removes one character just before it.
        System.out.print("back space" + back_space);
        char carriage_return='\r'; // It brings the cursor to the beginning of the line
        //  → It may overwrite what was printed earlier in some consoles.
        System.out.print("carriage return" + carriage_return);
    }
}
