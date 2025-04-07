package ex_24_Encapsultion_and_ascessModifier_OOPs;

public class Lab129_Access_Modifier {
    public static void main(String[] args) {

    }
}
class cop{
    private int gun;
    String iCard;

    cop(int bullet){
        this.gun=bullet;
    }

    private void jrcop(){
        System.out.println("cannot shoot jr cop");
    }

    protected void srcop() {
        System.out.println("can shoot sr cop");
    }
    public void Commoncop() {
        System.out.println("cannot shootto jr and  sr cop");
    }
}