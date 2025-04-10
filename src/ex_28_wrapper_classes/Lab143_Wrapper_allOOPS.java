package ex_28_wrapper_classes;

public class Lab143_Wrapper_allOOPS {
    public static void main(String[] args) {
        Samsung s = new Samsung(14000,"SAMSUN R&D");
        s.setCred(15000,"samsungSemiconductordevice");
        System.out.println(s.getCompanyNetworth());
        System.out.println(s.getCompany());

    }
}

class Samsung{
    private Integer networth;
    private String companyName;
    Samsung(Integer networth,   String companyName){
        this.networth =networth;
        this.companyName = companyName;
    }
   public void setCred(Integer networth,String companyName){
        this.networth =networth;
       this.companyName = companyName;

   }
   public Integer getCompanyNetworth(){
        return networth;
   }

   public String getCompany(){
        return companyName;
   }



}
class Proiphone{

   public void CommonPhone(){
       System.out.println("common desirable and shortent with high featured");
   }
}
class iphone extends Proiphone {


    @Override
    public void CommonPhone(){
        System.out.println("common desirable and shortent with high featured");
    }



}