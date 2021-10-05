package ru.netology.repository;

import ru.netology.domain.Ticket;

public class Repository {
    private Ticket[] tickets = new Ticket[0];

    public void save(Ticket ticket) {
        int lenght = tickets.length + 1;
        Ticket[] tmp = new Ticket[lenght];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = ticket;
        tickets = tmp;
    }

    public Ticket[] getAll() {
        return tickets;
    }

}
