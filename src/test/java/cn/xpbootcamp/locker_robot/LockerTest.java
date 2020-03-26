package cn.xpbootcamp.locker_robot;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log
public class LockerTest {

    @Test
    public void should_return_fail_when_saving_given_available_is_zero() {
        Locker locker = new Locker();
        locker.setAvailable(0);
        assertNull(locker.save());
    }

    @Test
    public void should_return_true_when_saving_given_available_is_one() {
        Locker locker = new Locker();
        locker.setAvailable(1);
        assertNotNull(locker.save());
    }
    @Test
    public void should_return_ture_when_saving_given_available_is_five() {
        Locker locker = new Locker();
        locker.setAvailable(5);
        assertNotNull(locker.save());
    }

//    @Test
//    public void should_return_true_when_fetching_given_ticket_is_valid() {
//        Locker locker = new Locker();
//
//
//        locker.validTicket("ticket-0");
//        assertTrue(locker.fetch("ticket-0"));
//    }


}
