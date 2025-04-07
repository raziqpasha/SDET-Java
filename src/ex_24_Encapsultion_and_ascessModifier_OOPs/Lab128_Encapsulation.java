package ex_24_Encapsultion_and_ascessModifier_OOPs;

public class Lab128_Encapsulation {
    public static void main(String[] args) {
        //these is private , and use setter and getter to accese private data
        GoodVWOlogin vwo = new GoodVWOlogin("raziq","raziq@124");
        System.out.println(vwo.getUsername());
        System.out.println(vwo.getPassword());

        vwo.setUsername("pasha","pasha@124");
        System.out.println(vwo.getUsername());
        System.out.println(vwo.getPassword());

        vwo.setAgainNewPassword("12345",false);
        System.out.println(vwo.getPassword());


        vwo.setAgainNewPassword("12345",true);
        System.out.println(vwo.getPassword());

        //these is public , and dont use setter and getter to accese public data
        badVWOLogin bvwo = new badVWOLogin("rp","rp124");
        System.out.println(bvwo.username);
        System.out.println(bvwo.password);
    }
}

class GoodVWOlogin{
    private String username;
    private String password;


    GoodVWOlogin(String username, String password){
        this.username = username;
        this.password =password;
    }

    public String getUsername() {
        return username;

    }

    public String getPassword() {
        return password;

    }


    public void setUsername(String username,String password) {
        this.username = username;
        this.password = password;

    }

    public void setAgainNewPassword(String password, boolean isAdmin){
        {
            if(isAdmin) {
                this.password = password;
            }
            else{
                System.out.println("if he is not a admin then he cannot changed the password");
            }
        }
    }

}

class badVWOLogin{
    public String username;
    public String password;

    badVWOLogin(String username , String password){
        this.username=username;
        this.password=password;
    }
}