package afisha;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class ManagerMovies {
    private Movies[] films = new Movies[0];
    private int limit = 10;


    public ManagerMovies(int limit) {
        this.setLimit(limit);
    }

    public Movies[] getFilms() {
        return this.films;
    }

    public int getLimit() {
        return limit;
    }

    public void add(Movies film) {
        Movies[] tmp = new Movies[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }

        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public Movies[] findAll() {
        return getFilms();
    }

    public Movies[] findLast() {
        int arraySize;

        if (films.length >= this.getLimit()) {
            arraySize = this.getLimit();
        } else {
            arraySize = films.length;
        }

        Movies[] result = new Movies[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
