package ru.netology.domain;

public class ManagerRepo {
    private int countMovie;
    private MovieItem[] items = new MovieItem[0];

    public ManagerRepo(int countMovie) {
        this.countMovie = countMovie;
    }

    public ManagerRepo() {
        this.countMovie = items.length;
    }

    public void addMovie(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public MovieItem[] findAll() {
        return items;
    }

    public MovieItem[] findLast() {
        MovieItem[] result = new MovieItem[countMovie];
        for (int i = 0; i < countMovie; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}

