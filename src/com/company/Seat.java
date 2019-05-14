package com.company;

public abstract class Seat {

    private int seatId;
    private int seatRow;
    private int seatColumn;
    private boolean isAvailable;
    private Ticket ticket;

    public Seat(int seatId, int seatRow, int seatColumn) {
        this.seatId = seatId;
        this.seatRow = seatRow;
        this.seatColumn = seatColumn;
        isAvailable = true;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatColumn() {
        return seatColumn;
    }

    public void setSeatColumn(int seatColumn) {
        this.seatColumn = seatColumn;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
