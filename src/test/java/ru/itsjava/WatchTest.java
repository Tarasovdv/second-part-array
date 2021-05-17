package ru.itsjava;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.practice.Watch;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Watch должен: ")
public class WatchTest {

    public static final String DEFAULT_FIRM = "Seiko";
    public static final String DEFAULT_AUTHOR = "Vova";
    public static final int DEFAULT_PRICE = 10_000;
    public static final String NEW_AUTHOR = "Masha";

    @DisplayName(" корректно создаваться конструктором  ")
    @Test
    public void shouldHaveCorrectConstructor() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);

//        assertEquals(DEFAUT_FIRM, actualWatch.getFirm());
//        assertEquals(DEFAULT_AUTHOR, actualWatch.getAuthor());
//        assertEquals(DEFAULT_PRICE, actualWatch.getPrice());

        assertAll("actualWatch",
                () -> assertEquals(DEFAULT_FIRM, actualWatch.getFirm()),
                () -> assertEquals(DEFAULT_AUTHOR, actualWatch.getAuthor()),
                () -> assertEquals(DEFAULT_PRICE, actualWatch.getPrice()));
    }

    @DisplayName(" корректно меняет автора")
    @Test
    public void shouldHaveCorrectUpdateWatch() {

        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);
        actualWatch.setAuthor(NEW_AUTHOR);

        assertEquals(NEW_AUTHOR, actualWatch.getAuthor());
    }
}
