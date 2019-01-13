public class TextEdit {
    public static void main(String[] args) {
        String s = "Superman is a fictional superhero created by writer Jerry Siegel and artist Joe Shuster. " +
                "He first appeared in Action Comics #1, a comic book published on April 18 (1938)? " +
                "He appears regularly in American comic book published by DC Comics," +
                " and has been adapted to radio shows, newspaper strips, television shows, movies, and video games?";
        //Task #1
        System.out.println("Task 1");
        System.out.println(Lesson8.capitalLetter(s));
        //Task #2
        System.out.println("Task 2");
        Lesson8.numberOf(s);
        //Task #3
        System.out.println("Task 3");
        Lesson8.numbersSum(s);
        //Task #4
        System.out.println("Task 4");
        Lesson8.replaceK(s, 2, "3");
        //Task #5
        System.out.println("Task 5");
        System.out.println(Lesson8.partDelete(s, "(", ")"));
        //Task #6
        System.out.println("Task 6");
        Lesson8.wordsCount(s);
        //Task #7
        System.out.println("Task 7");
        Lesson8.lettersCount(s);
        //Task #8
        System.out.println("Task 8");
        Lesson8.wordsPrintMethod(s, 4);
    }
}
