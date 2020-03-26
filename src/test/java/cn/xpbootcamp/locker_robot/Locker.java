package cn.xpbootcamp.locker_robot;

import lombok.Data;

@Data
public class Locker {
    int available;

    public boolean save() {
        if (available >= 1) {
            System.out.println("print ticket......");
            available--;
            return true;
        } else {
            return false;
        }
    }
}
