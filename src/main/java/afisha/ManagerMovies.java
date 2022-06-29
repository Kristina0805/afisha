package afisha;


public class ManagerMovies {
    private Movies[] films = new Movies[0];
    private int limit;


    public ManagerMovies() {
        limit = 10;
    }

    public ManagerMovies(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {


    }
}
