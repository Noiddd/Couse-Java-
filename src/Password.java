import java.util.Random;

public class Password {
    public static void main(String[] args) {
        System.out.println(generatePassword());
    }

    public static String generatePassword(){
        int passwordLength = 8;
        StringBuilder password = new StringBuilder(8);

        final String upperLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
        final String number = "0123456789";
        final String symbol = "!@#$%^&*";


         for(int i = 0 ; i < (passwordLength/4); i++) {
             Random random = new Random();

             int randomUpperletterIndex = random.nextInt(upperLetter.length());
             int randomLowerLetterIndex = random.nextInt(lowerLetter.length());
             int randomNumberIndex = random.nextInt(number.length());
             int randomSymbolIndex = random.nextInt(symbol.length());


             char randomUpperLetter = upperLetter.charAt(randomUpperletterIndex);
             char randomLowerLetter = lowerLetter.charAt(randomLowerLetterIndex);
             char randomNumber = number.charAt(randomNumberIndex);
             char randomSymbol = symbol.charAt(randomSymbolIndex);

             password.append(randomUpperLetter);
             password.append(randomLowerLetter);
             password.append(randomNumber);
             password.append(randomSymbol);
         }


        return password.toString();
    }
}
