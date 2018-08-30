package ru.geekbrains.JavaCore2HW;

public class MyDataArrayExeption extends MyArrayExiption {
    private int row;
    private int colum;
    public MyDataArrayExeption(String s, int i, int i1) {
        super(s);
    }

    @Override
    public String toString() {
        return "Invalid array data at " +
                "row=" + row +
                ", colum=" + colum;
    }
}
