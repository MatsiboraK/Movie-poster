import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;
import ru.netology.domain.MoviePosterManager;

public class MoviePosterManagerTest {
    MoviePoster movie1 = new MoviePoster(1, "Бладшот", "боевик");
    MoviePoster movie2 = new MoviePoster(2, "Вперёд", "мультфильм");
    MoviePoster movie3 = new MoviePoster(3, "Отель 'Белград'", "комедия");
    MoviePoster movie4 = new MoviePoster(4, "Джентельмены", "боевик");
    MoviePoster movie5 = new MoviePoster(5, "Человек-невидимка", "ужасы");
    MoviePoster movie6 = new MoviePoster(6, "Тролли.Мировой тур", "мультфильм");
    MoviePoster movie7 = new MoviePoster(7, "Номер один", "комедия");
    MoviePoster movie8 = new MoviePoster(8, "Стрела", "фантастика");
    MoviePoster movie9 = new MoviePoster(9, "Засланец из космоса", "фантастика");
    MoviePoster movie10 = new MoviePoster(10, "Чисто английские убийства", "драма");

    @Test
    public void shouldNotFindMovies() {
        MoviePosterManager poster = new MoviePosterManager();

        MoviePoster[] expected = {};
        MoviePoster[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOneMovie() {
        MoviePosterManager poster = new MoviePosterManager();
        poster.add(movie5);

        MoviePoster[] expected = {movie5};
        MoviePoster[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTwoMovies() {
        MoviePosterManager poster = new MoviePosterManager();
        poster.add(movie3);
        poster.add(movie7);

        MoviePoster[] expected = {movie3, movie7};
        MoviePoster[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNineMovies() {
        MoviePosterManager poster = new MoviePosterManager();
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);
        poster.add(movie9);

        MoviePoster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9};
        MoviePoster[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTenMovies() {
        MoviePosterManager poster = new MoviePosterManager();
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);
        poster.add(movie9);
        poster.add(movie10);

        MoviePoster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        MoviePoster[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        MoviePosterManager poster = new MoviePosterManager();
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);

        MoviePoster[] expected = {movie1, movie2, movie3, movie4, movie5};
        MoviePoster[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddedMovie() {
        MoviePosterManager poster = new MoviePosterManager(1);
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);
        poster.add(movie9);
        poster.add(movie10);

        MoviePoster[] expected = {movie10};
        MoviePoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTwoAddedMovies() {
        MoviePosterManager poster = new MoviePosterManager(2);
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);
        poster.add(movie9);
        poster.add(movie10);

        MoviePoster[] expected = {movie10, movie9};
        MoviePoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastNineAddedMovies() {
        MoviePosterManager poster = new MoviePosterManager(9);
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);
        poster.add(movie9);
        poster.add(movie10);

        MoviePoster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        MoviePoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTenAddedMovies() {
        MoviePosterManager poster = new MoviePosterManager(10);
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);
        poster.add(movie9);
        poster.add(movie10);

        MoviePoster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MoviePoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddedMovies() {
        MoviePosterManager poster = new MoviePosterManager();
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);
        poster.add(movie9);
        poster.add(movie10);

        MoviePoster[] expected = {movie10, movie9, movie8, movie7, movie6};
        MoviePoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFourAddedMovies() {
        MoviePosterManager poster = new MoviePosterManager();
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);


        MoviePoster[] expected = {movie4, movie3, movie2, movie1};
        MoviePoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
