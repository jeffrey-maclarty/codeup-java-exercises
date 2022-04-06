public class SyntaxTypesVariables {


    public static void main(String[] args) {

        // DATATYPE -> NAME = VALUE

        byte myByte = 127;
        byte daysOfMonth = 31;

        short employees = 10000;

        int userID = 1000000;

        // end long with L - java interprets as int initially
        long circumferanceOfMilkyWay = 100000000000000L;

        // end float with F - java interprets as double initially
        float roundedPI = 3.14F;

        double someBigDecimal = 3.141599879799;

        char yesNo = 'Y';

        boolean trueFalse = true;

        Boolean falseTrue = false;

        // strings are objects, declare them as String
        String myString = "Some string.";

        // "\"" // => "
        // "\\" // => \
        // "\n" // => the newline character
        // "\t" // => the tab character

        String someQuote = "\"Some cliche quote.\"";
//        System.out.println(someQuote);

        String backSlashes = "I can do backslashes \\, double backslash \\\\, and more \\\\\\";
//        System.out.println(backSlashes);

        System.out.println(someQuote + "\n" + backSlashes);

        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";

    }

}