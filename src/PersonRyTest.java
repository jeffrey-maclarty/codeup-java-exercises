public class PersonRyTest {

    public static void main(String[] args) {
        PersonRy personRy = new PersonRy("J");

        System.out.println(personRy.getName());

        personRy.setName("Casey");

        System.out.println(personRy.getName());

        personRy.sayHello();

//        PersonRy personRy1 = new PersonRy("John");
//        PersonRy personRy2 = new PersonRy("John");
//        System.out.println(personRy1.getName().equals(personRy2.getName()));
//        System.out.println(personRy1 == personRy2);

//        PersonRy personRy1 = new PersonRy("John");
//        PersonRy personRy2 = personRy1;
//        System.out.println(personRy1 == personRy2);

        PersonRy personRy1 = new PersonRy("John");
        PersonRy personRy2 = personRy1;
        System.out.println(personRy1.getName());
        System.out.println(personRy2.getName());
        personRy2.setName("Jane");
        System.out.println(personRy1.getName());
        System.out.println(personRy2.getName());


    }
}
