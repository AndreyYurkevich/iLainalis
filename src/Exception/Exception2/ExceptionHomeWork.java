package Exception.Exception2;

public  class ExceptionHomeWork {
    int a = 10;

    public static void main(String[] args) throws MyException, MyException2 {
     ExceptionHomeWork exceptionHomeWork = new ExceptionHomeWork2();
     exceptionHomeWork.myMethod(10);
    }

    public void myMethod(Integer integer) throws MyException, MyException2 {
         if (integer == 0) throw new MyException("Не хочу делить на 0");
         System.out.println(a / integer);
     }

}
