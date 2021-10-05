package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.repository.Repository;

import java.util.Arrays;

public class Manager {
    private Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public void add(Ticket tickets) {
        repository.save(tickets);
    }

    public Ticket[] searchAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket tickets : repository.getAll()) {
            if (tickets.getDepartureAirport().equals(from) && tickets.getArrivalAirport().equals(to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = tickets;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }
}

