public class HelloWorld {

    public static void main(String[] args) {
        // sout
//        System.out.println("Hello, World!");

        // 1
//        int myFavoriteNumber = 42;
//        System.out.println(myFavoriteNumber);

        // 2
//        String myString = "JMM";
//        System.out.println(myString);

        // 3
//        String myString = 'J';
//        System.out.println(myString);
        // wrong type

        // 4
//        String myString = 3.14159;
//        System.out.println(myString);
        // wrong type

        // 5
//        long myNumber;
//        System.out.println(myNumber);
        // variable myNumber might not have been initialized

        // 6
//        long myNumber = 3.14;
//        System.out.println(myNumber);
        // error, suggests double type

        // 7
//        long myNumber = 123L;
//        System.out.println(myNumber);

        // 8
//        long myNumber = 123;
//        System.out.println(myNumber);
        // 3.14 requires assignation of float or double

        // 9
//        float myNumber = 3.14;
        // 1 - change variable name
        // 2 - round it

        // 10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // one increments like a normal person, the other doesn't

        // 11
//        int class = 43545435;
        // will not let you use 'class' as a variable name

        // 12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

        // 13
//        int x = 4;
//        x = x + 5;
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y);

//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);

        // 14
//        short maxPlus = 32767 + 1;
//        System.out.println(maxPlus);
        // error

        int maxPlusInt = Integer.MAX_VALUE + 1;
        System.out.println(maxPlusInt);
        // result: -2147483648


    }

}
