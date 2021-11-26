package lesson9;

public class Lesson9 {

    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "1", "1", "Х"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};

        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("НЕ ПРАВИЛЬНЫЕ РАЗМЕРЫ МАССИВА!");
            }
        }

        catch (MyArrayDataException e) {

            System.out.println("НЕПРАВИЛЬНОЕ ЗНАЧЕНИЕ МАССИВА: ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int mean = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }

            for (int j = 0; j < arr[i].length; j++) {
                try {
                    mean = mean + Integer.parseInt(arr[i][j]);
                }

                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return mean;
    }

}