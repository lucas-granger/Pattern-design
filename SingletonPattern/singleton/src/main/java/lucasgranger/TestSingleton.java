package lucasgranger ;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance("Hello");
        Singleton secondInstance = Singleton.getInstance("World");

        System.out.println("First instance value: " + firstInstance.value);
        System.out.println("Second instance value: " + secondInstance.value);

        System.out.println("Are both instances the same? " + (firstInstance == secondInstance));
    }
}
