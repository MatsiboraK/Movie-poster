import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;

public class MoviePosterTest {
//    MoviePoster movie1 = new MoviePoster(1, "Бладшот", "боевик");
//    MoviePoster movie2 = new MoviePoster(2, "Вперёд", "мультфильм");
//    MoviePoster movie3 = new MoviePoster(3, "Отель 'Белград'", "комедия");
//    MoviePoster movie4 = new MoviePoster(4, "Джентельмены", "боевик");
//    MoviePoster movie5 = new MoviePoster(5, "Человек-невидимка", "ужасы");
//    MoviePoster movie6 = new MoviePoster(6, "Тролли.Мировой тур", "мультфильм");
//    MoviePoster movie7 = new MoviePoster(7, "Номер один", "комедия");
//    MoviePoster movie8 = new MoviePoster(8, "Стрела", "фантастика");
//    MoviePoster movie9 = new MoviePoster(9, "Засланец из космоса", "фантастика");
//    MoviePoster movie10 = new MoviePoster(10, "Чисто английские убийства", "драма");

    @Test
    public void shouldAddNewIdToMovie() {
        MoviePoster movie1 = new MoviePoster(1, "Бладшот", "боевик");

        movie1.setId(2);

        Assertions.assertEquals(2, movie1.getId());
    }

    @Test
    public void shouldAddAnotherNameForMovie() {
        MoviePoster movie2 = new MoviePoster(2, "Вперёд", "мультфильм");

        movie2.setMovie("Вверх");

        Assertions.assertEquals("Вверх", movie2.getMovie());
    }

    @Test
    public void shouldAddAnotherMovieGenre() {
        MoviePoster movie3 = new MoviePoster(3, "Отель 'Белград'", "комедия");

        movie3.setFilmGenre("скример");

        Assertions.assertEquals("скример", movie3.getFilmGenre());
    }
}
