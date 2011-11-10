package me.ttwj.ircdbeans;

public class Utils {

    public static long getEpochTime() {
        long epoch = 0;
        try {
            // Getting the current epoch time
            epoch = System.currentTimeMillis() / 1000;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return epoch;
    }
}
