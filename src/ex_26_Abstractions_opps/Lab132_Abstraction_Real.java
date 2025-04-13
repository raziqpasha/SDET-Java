package ex_26_Abstractions_opps;

public class Lab132_Abstraction_Real {
    public static void main(String[] args) {

        Company c1 = new Company();
        c1.name="raziq";
        c1.id =124;
        c1.address="21/1b p & t";
        c1.pay();
     Double Company_pay=  c1.Compute_pay();
        System.out.println(Company_pay);

    }
}
abstract class Employee{
    String name;
    Integer id;
    String address;
    Employee(){
        System.out.println("default constructour");
    }
    Employee(String name,Integer id,String address){
        this.name =name;
        this.id =id;
        this.address=address;
    }

    abstract Double Compute_pay();

    void pay(){
        System.out.println("name:"+this.name + "  id:"+ this.id + "  address:"+address);
    }
}

class Company extends Employee{
    @Override
    Double Compute_pay(){
        return 100.00;
    }
}