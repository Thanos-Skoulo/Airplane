package com.company;

public class EconomySeat extends Seat {


    public EconomySeat(int seatId, int seatRow, int seatColumn) {
        super(seatId, seatRow, seatColumn);
    }



    @Override
    public String toString() {
        if(isAvailable()) {
            return " [ ] ";
        }

        return  " [X] ";
    }
}
