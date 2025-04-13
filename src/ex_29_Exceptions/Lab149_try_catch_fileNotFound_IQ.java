package ex_29_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab149_try_catch_fileNotFound_IQ {
    public static void main(String[] args)  {
        try {
            FileReader fr = new FileReader(new File("abcd.txt"));
        } catch (FileNotFoundException e) { //FileNotFoundException
            throw new RuntimeException(e);

           // System.out.println(e.getMessage());
        }

        String ip=null;

        try {
            ip=args[0];
        } catch (Exception e) { //RuntimeException
            throw new RuntimeException(e);
        }

        int a =0;
        try{
            a=Integer.parseInt(ip);
        }
        catch(NumberFormatException e){ //NumberFormatException
            throw new RuntimeException(e);
        }

    }
}
