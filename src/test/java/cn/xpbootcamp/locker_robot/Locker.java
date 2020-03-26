package cn.xpbootcamp.locker_robot;

import lombok.Data;

@Data
public class Locker {
    int available;

    public boolean save() {
        return false;
    }
}
