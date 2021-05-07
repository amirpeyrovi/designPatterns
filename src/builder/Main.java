package builder;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person.PersonBuilder("Amir", "Peyrovi")
                .setAddress("tehran")
                .setPhoneNumber("123456")
                .build();
        System.out.println(person1);

        System.out.println("----------------------");

        Person person2 = new Person.PersonBuilder("mohammad", "rahmani")
                .setAge(25)
                .setEmail("mohammad@rahmani.com")
                .build();
        System.out.println(person2);
    }
}
