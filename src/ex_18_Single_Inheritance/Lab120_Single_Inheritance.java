package ex_18_Single_Inheritance;

public class Lab120_Single_Inheritance {
    public static void main(String[] args) {
        Ancester_Common_To_Alll a1 = new Father_Sons();
        a1.closeBrowser();
    }
}

class Ancester_Common_To_Alll {
    Ancester_Common_To_Alll(){

    }
    void startBrowser(){
        System.out.println("starting browser");
    }

    void closeBrowser(){
        System.out.println("closing browser");
    }

    void readExcelFile(){
        System.out.println("read data from excel sheet");
    }

    void readDatabaseFile(){
        System.out.println("read data from database file");
    }

}

class Grand_Fathers extends Ancester_Common_To_Alll {

}

class Grand_Father_Sons extends Grand_Fathers {
}


class Father_Sons extends Grand_Father_Sons {
}
