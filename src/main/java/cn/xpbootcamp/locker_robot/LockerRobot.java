package cn.xpbootcamp.locker_robot;

import java.util.ArrayList;
import java.util.List;

public class LockerRobot {
    private static int CAPACITY_OF_LOCKER = 5;
    List<Locker> lockerList = new ArrayList<>();
    public LockerRobot(int lockers) {
        for (int i = 0; i < lockers; i++) {
            lockerList.add(new Locker(CAPACITY_OF_LOCKER));
        }
    }

    public Ticket save() {
        Ticket ticket = new Ticket();
        if (lockerList.size() > 0) {
            for (Locker locker : lockerList) {
                ticket = locker.save();
                if (ticket != null) {
                    break;
                }
            }
        }
        return ticket;
    }
}
