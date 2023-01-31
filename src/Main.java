public class Main {


    public static void main(String[] args) {
        System.out.println(sumOFDigits(sumOFDigits(233)));
        sumOfCharacters("Hi", "Gene");
        sumOfCharacters("Hi", "Gene", "Telepov");
        compareNumber(5);
    }


    static int sumOFDigits(int i) {
        int sumOfNumbers = i % 10 + (i / 10) % 10 + i / 100;
        return sumOfNumbers;
    }

    static void sumOfCharacters(String word1, String word2) {
        String concatStrings = word1 + word2;
        int lengthOfTwoWords = concatStrings.length();
        System.out.println("The sum of characters for provided 2 words: " + lengthOfTwoWords);
    }

    static void sumOfCharacters(String word1, String word2, String word3) {
        String concatStrings = word1 + word2 + word3;
        int lengthOfThreeWords = concatStrings.length();
        System.out.println("The sum of characters for provided 3 words: " + lengthOfThreeWords);
    }

    static boolean compareNumber(int number) {
        if (number > 0) {
            System.out.println("Your number is larger than 0");
            return true;
        } else {
            System.out.println("Your number is not larger than 0");
            return false;
        }


    }
}
