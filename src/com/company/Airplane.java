package com.company;


public class Airplane {

    private int airplaneID;
    private int rows;
    private int columns;
    private int businessClassRows;
    private String airplaneDescription;

    public String getAirplaneDescription() {
        return airplaneDescription;
    }

    public void setAirplaneDescription(String airplaneDescription) {
        this.airplaneDescription = airplaneDescription;
    }

    public int getAirplaneID() {
        return airplaneID;
    }

    public void setAirplaneID(int airplaneID) {
        this.airplaneID = airplaneID;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getBusinessClassRows() {
        return businessClassRows;
    }

    public void setBusinessClassRows(int businessClassRows) {
        this.businessClassRows = businessClassRows;
    }

    public Airplane(int airplaneID, int rows, int columns, int businessClassRows, String airplaneDescription) {
        this.airplaneID = airplaneID;
        this.rows = rows;
        this.columns = columns;
        this.businessClassRows = businessClassRows;
        this.airplaneDescription = airplaneDescription;
    }
}
