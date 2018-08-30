package ru.geekbrains.JavaCore2HW;

public class JavaCoreHW2 {
    private static final int SIZE = 4;
    private static String[][] data = new String[][] {
            {"34","18","2","14"},
            {"11","24","67","57"},
            {"10","21","34","98"},
            {"23","26","42","89"}};
    public static void main(String[] args) {
        int value = calculateArraySum(data);
    }

    private static int calculateArraySum(String[][] data) {
        int result = 0;
        try {
            if (data.length != SIZE)
                throw new MyArraySizeExeption("Invalid array size");
            for (int i = 0; i < data.length; i++) {
                if (data[i].length != SIZE)
                    throw new MyArraySizeExeption("Invalid array size");
                for (int j = 0; j < data.length; j++) {
                    try {
                        result += Integer.parseInt(data[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyDataArrayExeption("Invalid value = " + data[i][j],i,j);
                    }
                }
            }
        } catch (MyArrayExiption e) {
            System.out.println(e.toString());
        }
        return result;
    }
}
