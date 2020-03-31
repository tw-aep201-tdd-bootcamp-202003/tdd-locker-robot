package cn.xpbootcamp.locker_robot;

import lombok.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Locker {
    int available;
    List ticketList = new ArrayList();

    public Long save() {
        if (available >= 1) {
            long ticketNo = new Date().getTime();
            ticketList.add(ticketNo);
            System.out.println("print ticket...... "+ticketNo);
            available--;
            return ticketNo;
        } else {
            return null;
        }
    }

    public boolean validTicket(long ticket) {
        if (ticketList.contains(ticket)) {
            available++;
            return true;
        } else {
            return false;
        }
    }

    public boolean fetch(long ticket) {
        return validTicket(ticket);
    }
}
