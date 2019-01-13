import java.util.Arrays;

public class Lesson8 {
    private static final String VOWELS = "aeiouy";
    private static final String QUESTION_MARK = "?";
    private static final char SYMBOL[] = {',', '.', ':', ';', '!', '?'};
    private static final String SPLIT = " ";

    //method for task #1
    public static String capitalLetter(String s) {
        String modS = "";
        String[] texts = s.split(" ");
        for (String text : texts) {
            String firstText = text.substring(0, 1).toUpperCase();
            String allText = text.substring(1);
            modS += firstText + allText + SPLIT;
        }
        return "Edited text: " + '\n' + modS;
    }

    //Task#2
    public static void numberOf(String s) {
        int numberOfSymbols = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < SYMBOL.length; j++) {
                if (SYMBOL[j] == s.charAt(i))
                    numberOfSymbols++;
            }
        }
        System.out.println("The number of punctuation marks in the text: " + numberOfSymbols);
    }

    //Task#3
    public static void numbersSum(String s) {
        String sTemp = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sTemp += s.charAt(i);
            } else {
                if (!sTemp.equals("")) {
                    sum += Integer.parseInt(sTemp);
                    sTemp = "";
                }
            }
        }
        System.out.println("Sum of numbers in the   string s: " + sum);
    }

    //Task#4
    public static void replaceK(String s, int k, String replace) {
        StringBuilder builder = new StringBuilder();
        String newText = "";
        String[] texts = s.split(" ");
        for (String text : texts) {
            if (text.length() > k) {
                newText = text.substring(0, k - 1) + replace + text.substring(2);
            } else {
                newText = text;
            }
            builder.append(newText + SPLIT);
        }
        System.out.println(builder.toString());
    }

    //Task#5
    public static String partDelete(String s, String fromChar, String toChar) {
        return s.substring(0, s.indexOf(fromChar)) + s.substring((s.lastIndexOf(toChar)) + 1);
    }

    //Task#6
    public static void wordsCount(String s) {
        String[] words = s.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
        String s1 = "";
        int count = 1;
        Arrays.sort(words);
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i + 1]) == 0) {
                count++;
            } else {
                System.out.println(words[i] + " - " + count);
                count = 1;
            }
        }
    }

    //Task#7
    public static void lettersCount(String s) {
        String sentences[] = s.toLowerCase().split("[.!?]\\s*");
        int charCount = 0;
        int vowelsCount = 0;
        for (String sentenceForChar : sentences) {
            for (char charSentence : sentenceForChar.toCharArray()) {
                if (Character.isLetter(charSentence)) {
                    charCount++;
                    if (VOWELS.indexOf(charSentence) != -1)
                        vowelsCount++;
                }
            }
            System.out.println(sentenceForChar);
            System.out.println("Number of vowels: " + vowelsCount);
            System.out.println("Number of consonants: " + (charCount - vowelsCount));
        }
    }

    //Task#8
    public static void wordsPrintMethod(String s, int wordsLength) {
        System.out.println(" Specified Length=" + wordsLength);
        System.out.println();
        //replace all question marks with symbol '?~' to save the question mark '?' after splitting a text.
        String stringA = s.replaceAll("[?]", "?~");
        //split the text into sentences
        String sentencesArr[] = stringA.split("[!.~]");
        String wordss[][] = new String[sentencesArr.length][];
        for (int i = 0; i < sentencesArr.length; i++) {
            if (sentencesArr[i].endsWith(QUESTION_MARK)) {
                System.out.println(sentencesArr[i]);
                wordss[i] = sentencesArr[i].toLowerCase().replaceAll("[-.?!)(,:\\d]", "").split("\\s");
                for (int j = 0; j < wordss[i].length; ++j) {
                    if (wordss[i][j].length() == wordsLength)
                        System.out.println(wordss[i][j]);
                }
            }
        }
    }
}






