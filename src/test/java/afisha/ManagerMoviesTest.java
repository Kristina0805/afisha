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

    @Test
    void findAllTwoTest() {
        ManagerMovies manager = new ManagerMovies(5);
        Movies[] expected = {};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void findAllThreeTest() {
        ManagerMovies manager = new ManagerMovies();
        manager.add(movie4);

        Movies[] expected = {movie4};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }
    @Test
    void findAllFourTest(){
         ManagerMovies manager = new ManagerMovies(11);
         manager.add(movie7);

         Movies[] expected = {movie7};
         Assertions.assertArrayEquals(expected, manager.findAll());

    }
     @Test
    void FindAllFiveTest(){
         ManagerMovies manager = new ManagerMovies();

         manager.add(movie1);
         manager.add(movie2);
         manager.add(movie3);
         manager.add(movie4);
         manager.add(movie5);
         manager.add(movie6);
         manager.add(movie7);
         manager.add(movie8);
         manager.add(movie9);
         manager.add(movie10);

         Movies[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
         Assertions.assertArrayEquals(expected, manager.findAll());
     }


    @Test
    void findLastTest() {
        ManagerMovies manager = new ManagerMovies();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);

        Movies [] expected = {movie9,movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void findLastTwoTest() {
        ManagerMovies manager = new ManagerMovies(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);

        Movies [] expected = {movie9,movie8, movie7, movie6, movie5};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
}
