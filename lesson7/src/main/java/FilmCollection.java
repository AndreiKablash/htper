public class FilmCollection {
    public static void main(String[] args) {
        Film director = new Film();
        director.setFirstDirector("Christopher Nolan"); //set director
        //the creation of director's filmography
        Film.FilmInfo filmInfo = new Film().new FilmInfo();
        filmInfo.addfilm(director, "Inception", "Science fiction", "148");
        filmInfo.addfilm(director, "Insomnia", "Psychological thriller", "118");
        filmInfo.addfilm(director, "The Dark Knight", "Thriller", "152");

        //test for two directors in common inner class
        Film directorS = new Film();
        directorS.setFirstDirector("Quentin Tarantino");
        directorS.setSecondDirector("Robert Rodriguez");
        filmInfo.addfilm(directorS, "Sin City", "Neo-noir", "124/142");

        //output of film collection
        filmInfo.display();
    }
}
