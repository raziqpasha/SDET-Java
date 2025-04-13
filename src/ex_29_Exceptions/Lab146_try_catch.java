package ex_29_Exceptions;

public class Lab146_try_catch {
    public static void main(String[] args) {
        try {
            int a=10/0;
        }
        catch(Exception e){ //catch after finally is not allowed.
            System.out.println(e.getMessage());
            throw new RuntimeException("iam father of all exception");
     //       System.out.println("iam father of all exception");
        }
   /*     //these can be used , but not possible big exception is used below arithmetic exxception
        catch(ArithmeticException e) {
            throw new RuntimeException("are u fool it is an error");
        }
*/
        finally {
            System.out.println("i will exceute if exception ocurrs or dont ocuurs");
        }
     /*  catch(Exception e){ //catch after finally is not allowed.
                e.getMessage();
        }

      */
    }
}
