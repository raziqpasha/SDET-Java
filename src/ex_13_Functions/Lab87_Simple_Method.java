package ex_13_Functions;

public class Lab87_Simple_Method {
    public static void main(String[] args) {
int r1= return_int();
        System.out.println(r1);
boolean r2=return_boolean();
        System.out.println(r2);

float r3=return_float_pi_value();
        System.out.println(r3);

byte r4=return_byte();
        System.out.println(r4);

long r5=return_long();
        System.out.println(r5);

String r6=return_string();
        System.out.println(r6);

    }

    public static void rp_ff1() {
        System.out.println("hi, RP");
    }

    static int return_int() {
        return 10;
    }

    static boolean return_boolean() {
        return true;
    }

    static float return_float_pi_value() {
    return 3.14f;
}

static byte return_byte(){
        return 100;
}

static long return_long(){
        return 100l;
}
    static String return_string(){
        return "rp";
    }




}
