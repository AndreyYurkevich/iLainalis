package Exception;

public   class Delenie2 {
    private int a = 4;
    private int b = 0;

    public static void main(String[] args) {
        new Delenie2().someMethod();
        System.out.println(" Напечатется? ");
    }
    void  someMethod (){
            try {
                int result = a / b;
                System.out.println("Делим на ноль что ли,но эта надписть не появиться ");

            } catch (ArithmeticException E) {
                System.out.println("Удачно поделили на нуль:)");

            }

    }
}





