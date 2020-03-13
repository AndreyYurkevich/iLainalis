package Exception.Exception2;

public class ExceptionHomeWork2 extends ExceptionHomeWork {

    public static void main(String[] args) throws MyException2 {
        new ExceptionHomeWork2().myMethod(4);
    }

    public  void  myMethod(Integer integer) throws MyException2 {
        if (integer>3) throw  new MyException2("Число должно быть не больше 3");
        else {
            System.out.println(a/integer);
        }
    }
}
