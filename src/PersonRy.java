public class PersonRy {

    private String name;

    public PersonRy(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + this.name);
    }

} // end PersonReview class
