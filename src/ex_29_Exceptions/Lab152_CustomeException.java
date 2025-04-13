package ex_29_Exceptions;

public class Lab152_CustomeException {

    public static void main(String[] args) {
        Lab153_Bank sbi = new Lab153_Bank(123,"INR");
        Lab153_Bank icic = new Lab153_Bank(49,"INR");
        Lab153_Bank jp_chase = new Lab153_Bank(49,"Dollor");



        int total = sbi.add(jp_chase);
        System.out.println(total);

    }
}
