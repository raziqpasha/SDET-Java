package ex_24_Encapsultion_and_ascessModifier_OOPs;

public class thief {
    public static void main(String[] args) {
        cop c1 = new cop(100);
     //  c1.jrcop(); //these the private and cannot access outside the class
         c1.srcop(); //proceted is only acces with the folder
        c1.Commoncop();//public can be aceesible fom anywere
    }
}
