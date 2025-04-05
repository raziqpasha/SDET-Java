package ex_22_Hybrid_Inheritance;

public class Lab124_hybird_inheritance {
    public static void main(String[] args) {


        //in java multiple inheritance is not possible , due it will have daimond problem
        // to over come these multiple inheritance we apprach for interface
    /*
        grand father
                |
                 |
           ____________
           |           |
           father      mother
               \           /
                \          /
                     son


     */

    }
}

class grandfather{

}

class father extends grandfather{

}

class mother extends grandfather{

}

/*
class son extends father , mother{
  // these is not possible in both hybird and multiple inheritance case
  // daimond problems occur

}

 */

// class son extends mother{} // not possible
// class son extends father{} // not possible

