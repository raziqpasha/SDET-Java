package ex_30_Generics;

public class Lab155_Generic_Encapsulation_Example {
    public static void main(String[] args) {
        //        GnericClass intObject = new GnericClass();
        GnericClass<Integer> intObject = new GnericClass<>(90);
          intObject.setData(100);
        System.out.println(intObject.getData());
    }
}

// T -> is only placeholder , not datatype
class GnericClass<T>{
    private T data1;
  //  private T data2;

    GnericClass(T data1){
        this.data1 =data1;
      //  this.data2 =data2;

    }

    public void setData(T data1){
        this.data1 =data1;
    //    this.data2 =data2;

    }
    public T getData(){
      return this.data1;
     // return this.data2;
    }
}
