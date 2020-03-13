package Exception;

public class Delene1 {
    int a = 4;
    int b = 0;

    public static void main(String[] args) {
        new Delene1().someMethod();
        System.out.println("Этот текст тоже не напечатается!!!1  ");
    }
    void someMethod(){
        try {
            int result  = a/b;
            System.out.println("Ошибка");
        }catch (ArithmeticException E){
            System.out.println("Деление на нуль");
        }
        finally {
            System.out.println("Балуемся с finally");
            System.exit(0);           //Преррывание выполнения программы!!!!
            System.out.println("Этот текст не напечатается!!!!");
        }
    }
}
