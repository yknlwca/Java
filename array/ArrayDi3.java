package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2X3 차원 배열을 만든다.
        int[][] arr = new int[10][4];

        int i = 1;
        for (int row = 0; row <arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();

        }
    }
}
