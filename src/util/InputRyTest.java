package util;

public class InputRyTest {

    public static void main(String[] args) {
        InputRy inputRy = new InputRy();

        System.out.println(inputRy.getString("Enter a string: "));

        System.out.println(inputRy.getDouble(5.9999, 10.59999));
    }


}
