import domain.Example;
import util.Performer;

public class Main {

    public static void main(String[] args) {
        Performer performer = new Performer();

        //TASK 1
        //Call method to read example of file.java like file.txt and replace all words "public" to "private"
        //parameter: fileName (in this case some string with file path).
        //as a result: file.txt -  javaExample.txt (path:lesson12/results)
        String pathToJavaFile = "lesson12/src/main/java/domain/Example.java";
        performer.readAndReplace(pathToJavaFile);

        //TASK 2
        //Call method to create file with random sorted integer numbers
        //first parameter: bound - is bound for random number generator (from 0 to bound)
        //second parameter: numberAmount - is amount of numbers that should be created
        //as a result: file with sorted numbers - fileWithNumbers.txt (path:lesson12/results)
        performer.getSortedRandomNumbersFile(100, 10);


        //Call the method to sort existing file.txt with random integer numbers
        //parameter: some file (instance of File class)
        //As a parameter for method performer.getSortedRandomNumbersFile(File fileName) - method call
        // performer.getRandomNumbersFile(int bound, int numberAmount) - create a file.txt and fill the file
        // with random integer numbers some (parameters: bound - is bound for random number generator (from 0 to bound),
        // numberAmount - is amount of numbers that should be created; returns some file (instance of File class)).
        //as a result of main method: file with sorted numbers - newFileWithNumbers.txt (path:lesson12/results)
        performer.getSortedRandomNumbersFile(performer.getRandomNumbersFile(100, 10));

        //TASK 3
        //Call the method to read line of text from some file and swap first and last word in each line
        //parameter: fileName (some file with text)
        //ar a result: file with swapped letters editedTextFile.txt (path:lesson12/results)
        String pathToFileWithText = "lesson12/src/main/java/resources/someTextFile";
        performer.readAndReplaceInText(pathToFileWithText);
    }
}
