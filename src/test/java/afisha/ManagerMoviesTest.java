package afisha;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class ManagerMoviesTest {

    Movies movie1 = new Movies(1, "Астрал", "Ужасы");
    Movies movie2 = new Movies(2, "Поворот не туда", "Ужасы");
    Movies movie3 = new Movies(3, "Звездные войны. Эпизод 1.", "Научная фантастика/Боевик");
    Movies movie4 = new Movies(4,"Американский пирог", "Комедия");
    Movies movie5 = new Movies(5, "Король лев","Мультфильм");
    Movies movie6 = new Movies(6, "Джентельмены", "Боевик");
    Movies movie7 = new Movies(7, "Валли", "Мультфильм");
    Movies movie8 = new Movies(8,"Багровый пик","Ужасы");
    Movies movie9 = new Movies(9,"Бладшот","Боевик");
    Movies movie10 = new Movies(10,"Звездные войны. Хан Соло", "Научная фантастика/Боевик");
    Movies movie11 = new Movies(11,"Балто", "Мультфильм");


     @Test
    void addTest(){
        ManagerMovies manager = new ManagerMovies();
        manager.add(movie1);

        Movies[] actual = {movie1};
        Movies[] expected = manager.getFilms();

         Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void addTwoTest(){
        ManagerMovies manager = new ManagerMovies();
        manager.add(movie1);
        manager.add(movie2);

        Movies[] actual = {movie1,movie2};
        Movies[] expected = manager.getFilms();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void findAllTest(){
        ManagerMovies manager = new ManagerMovies();

        Movies[] expected = {};

        Assertions.assertArrayEquals(expected, manager.findAll());
    }




}
