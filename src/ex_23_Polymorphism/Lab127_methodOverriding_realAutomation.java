package ex_23_Polymorphism;

public class Lab127_methodOverriding_realAutomation {
    public static void main(String[] args) {
        chromeTC c1 = new chromeTC();
        c1.openBrowser();

        Firefox f2 = new Firefox();
        f2.openBrowser();

        commonToAll a1 = new commonToAll();
        a1.openBrowser();

        //Dynamic Dispatch Concept
        commonToAll cta = new chromeTC();
        cta.openBrowser();

        commonToAll cta1 = new Firefox();
        cta1.openBrowser();

       // Firefox ff = new chromeTC(); // not related
    }
}

class commonToAll{
    void openBrowser(){
        System.out.println("open IE Browser");
    }
}

class chromeTC extends commonToAll{
    @Override
    void openBrowser(){
        System.out.println("chrome will open now");
    }

    int openBrowser(int a){
        return 10;
    }
}

class Firefox extends commonToAll{
    @Override
    void openBrowser(){
        System.out.println("firefox will start");
    }
}