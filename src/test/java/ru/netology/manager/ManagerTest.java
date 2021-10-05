package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.repository.Repository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerTest {
    private Repository repository = new Repository();
    private Manager manager = new Manager(repository);
    private Ticket first = new Ticket(1, 1000, 180, "UFA", "OSW");
    private Ticket second = new Ticket(2, 1500, 90, "CSY", "MOW");
    private Ticket third = new Ticket(3, 1250, 60, "MOW", "UFA");
    private Ticket fourth = new Ticket(4, 1800, 200, "OSW", "REN");
    private Ticket fifth = new Ticket(5, 1300, 95, "REN", "CSY");
    private Ticket sixth = new Ticket(6, 1200, 60, "MOW", "UFA");


    @BeforeEach
    public void data() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
    }

    @Test
    public void sholdFindAll() {
        Ticket[] actual = manager.searchAll("MOW", "UFA");
        Ticket[] expected = new Ticket[]{third, sixth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAllWithFlightOutAndWithoutFlightIn() {
        Ticket[] actual = manager.searchAll("UFA", "DME");
        Ticket[] expected = new Ticket[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindTickets() {
        Ticket[] actual = manager.searchAll("KZN", "DME");
        Ticket[] expected = new Ticket[]{};
        assertArrayEquals(expected, actual);
    }


}