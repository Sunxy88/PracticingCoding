package Algorithm.Solutions.LeetCode;

public class LeetCode1603 {
}


class ParkingSystem {

    private int bigSize, mediumSize, smallSize;
    private final int SMALL = 3, MEDIUM = 2, BIG = 1;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSize = big;
        this.mediumSize = medium;
        this.smallSize = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case SMALL:
                if (smallSize > 0) {
                    smallSize--;
                    return true;
                } else {
                    return false;
                }
            case MEDIUM:
                if (mediumSize > 0) {
                    mediumSize--;
                    return true;
                } else {
                    return false;
                }
            case BIG:
                if (bigSize > 0) {
                    bigSize--;
                    return true;
                } else {
                    return false;
                }
            default: return false;
        }
    }
}