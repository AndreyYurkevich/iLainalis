package Exception;

public class Delenie {
 private    int a = 4;
 private    int b = 0;

    public static void main(String[] args) {
        new Delenie().someMethod();
    }
    void  someMethod(){
        try {int result = b/a;
            System.out.println("Ошибка");
        }
        finally {
            System.out.println("Правильно ли я делаю? ");

        }
    }
}
