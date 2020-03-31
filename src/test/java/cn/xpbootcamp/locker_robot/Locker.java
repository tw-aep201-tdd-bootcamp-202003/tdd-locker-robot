package cn.xpbootcamp.locker_robot;

import lombok.Data;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

@Data
@Log
public class Locker {
    int available;
    List ticketList = new ArrayList();

    public Ticket save() {
        if (available >= 1) {
            Ticket ticket = new Ticket();
            ticketList.add(ticket);
            log.info("print ticket...... ");
            available--;
            return ticket;
        } else {
            return null;
        }
    }

    public boolean validTicket(Ticket ticket) {
        if (ticketList.contains(ticket)) {
            available++;
            ticketList.remove(ticket);
            return true;
        } else {
            return false;
        }
    }

    public boolean fetch(Ticket ticket) {
        return validTicket(ticket);
    }
}
