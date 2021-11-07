/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        HashTable<Object, Object> stringIntegerHashTable = new HashTable<>();
        stringIntegerHashTable.add("Naim", 1000);
        stringIntegerHashTable.add("Qusai", 1500);
        stringIntegerHashTable.add("Deyaa", 10000);
        stringIntegerHashTable.add("John", 300);
        stringIntegerHashTable.add("ammar", 400);
        stringIntegerHashTable.add("Toms", 200);
        stringIntegerHashTable.add("Jade", 100);
        stringIntegerHashTable.add("Doa", 6000);
        stringIntegerHashTable.add("Farah", 800);
        stringIntegerHashTable.add("Jason", 90000);
        stringIntegerHashTable.add("adham", 700);


        System.out.println("The Integer is => " + stringIntegerHashTable.get("ammar"));
        System.out.println("The index is => " + stringIntegerHashTable.hash("Toms"));
        System.out.println("Is contain ? => " + stringIntegerHashTable.contains("ali"));
        System.out.println("Is contain ? => " + stringIntegerHashTable.contains("Jason"));

    }
}
