package com.company;

public class BusinessSeat extends Seat {

   private Menu menu;

    public BusinessSeat(int seatId, int seatRow, int seatColumn) {
        super(seatId, seatRow, seatColumn);
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        if(isAvailable()) {
            return "[[ ]]";
        }

        return  "[[X]]";
    }
}
