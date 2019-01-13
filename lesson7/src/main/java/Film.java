import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Film {
    private String firstDirector;
    private String secondDirector;

    public Film() {
    }

    public Film(String firstDirector) {
        this.firstDirector = firstDirector;
    }

    public Film(String firstDirector, String secondDirector) {
        this.firstDirector = firstDirector;
        this.secondDirector = secondDirector;
    }

    public String getFirstDirector() {
        return firstDirector;
    }

    public void setFirstDirector(String firstDirector) {
        this.firstDirector = firstDirector;
    }

    public String getSecondDirector() {
        return secondDirector;
    }

    public void setSecondDirector(String secondDirector) {
        this.secondDirector = secondDirector;
    }

    class FilmInfo {
        List<FilmInfo> filmInfos = new LinkedList<>();
        private Film directors;
        private String filmName;
        private String typeOfMovie;
        private String runningTime;

        public FilmInfo() {
        }

        public FilmInfo(Film directors, String filmName, String typeOfMovie, String runningTime) {
            this.directors = directors;
            this.filmName = filmName;
            this.typeOfMovie = typeOfMovie;
            this.runningTime = runningTime;
        }

        public void addfilm(Film directors, String filmName, String typeOfMovie, String runningTime) {
            filmInfos.add(new FilmInfo(directors, filmName, typeOfMovie, runningTime));
        }

        public void display() {
            filmInfos.forEach(System.out::println);
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FilmInfo filmInfo = (FilmInfo) o;
            return Objects.equals(filmInfos, filmInfo.filmInfos) &&
                    Objects.equals(directors, filmInfo.directors) &&
                    Objects.equals(filmName, filmInfo.filmName) &&
                    Objects.equals(typeOfMovie, filmInfo.typeOfMovie) &&
                    Objects.equals(runningTime, filmInfo.runningTime);
        }

        @Override
        public int hashCode() {
            return Objects.hash(filmInfos, directors, filmName, typeOfMovie, runningTime);
        }

        @Override
        public String toString() {
            String s = "";
            if (directors.secondDirector != null) {
                s = " and " + directors.secondDirector;
            }
            return "FilmInfo{" +
                    "directors: " + directors.firstDirector
                    + s + ", filmName='" + filmName + '\'' +
                    ", typeOfMovie='" + typeOfMovie + '\'' +
                    ", runningTime='" + runningTime + '\'' +
                    '}';
        }
    }
}
