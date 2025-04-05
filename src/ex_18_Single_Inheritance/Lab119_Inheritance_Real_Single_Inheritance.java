package ex_18_Single_Inheritance;

public class Lab119_Inheritance_Real_Single_Inheritance {
    public static void main(String[] args) {
        Ancester_Common_To_All t1 = new Grand_Father();
            t1.startBrowser();
            t1.closeBrowser();
            t1.readDatabaseFile();
            t1.readExcelFile();

        System.out.println("-----------------");
        Ancester_Common_To_All t2 = new Grand_Father_Son();
        t2.startBrowser();
        t2.closeBrowser();
        t2.readDatabaseFile();
        t2.readExcelFile();

        System.out.println("-----------------");
        Ancester_Common_To_All t4 = new Father_Son();
        t4.startBrowser();
        t4.closeBrowser();
        t4.readDatabaseFile();
        t4.readExcelFile();


    }
}
