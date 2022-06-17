package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    MovieItem firstMovie = new MovieItem(111, "Бладшот", "боевик");
    MovieItem secondMovie = new MovieItem(112, "Вперед", "мультфильм");
    MovieItem thirdMovie = new MovieItem(113, "Отель Белград", "комедия");
    MovieItem fourthMovie = new MovieItem(114, "Джентельмены", "боевик");
    MovieItem fifthMovie = new MovieItem(115, "Человек-невидимка", "ужасы");
    MovieItem sixthMovie = new MovieItem(116, "Тролли. Мировой тур", "мультфильм");
    MovieItem seventhMovie = new MovieItem(117, "Номер один", "комедия");


    @Test
    public void shouldFindAll() {
        ManagerRepo manager = new ManagerRepo();
        manager.addMovie(firstMovie);
        manager.addMovie(secondMovie);
        manager.addMovie(thirdMovie);
        manager.addMovie(fourthMovie);
        manager.addMovie(fifthMovie);
        manager.addMovie(sixthMovie);
        manager.addMovie(seventhMovie);

        MovieItem[] actual = manager.findAll();
        MovieItem[] expected = {firstMovie, secondMovie, thirdMovie, fourthMovie, fifthMovie, sixthMovie, seventhMovie};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        ManagerRepo manager1 = new ManagerRepo(5);
        manager1.addMovie(firstMovie);
        manager1.addMovie(secondMovie);
        manager1.addMovie(thirdMovie);
        manager1.addMovie(fourthMovie);
        manager1.addMovie(fifthMovie);
        manager1.addMovie(sixthMovie);
        manager1.addMovie(seventhMovie);

        MovieItem[] actual = manager1.findLast();
        MovieItem[] expected = {seventhMovie, sixthMovie, fifthMovie, fourthMovie, thirdMovie};

        Assertions.assertArrayEquals(expected, actual);
    }
}
