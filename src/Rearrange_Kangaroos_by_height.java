public class Rearrange_Kangaroos_by_height {
    public static void main(String[] args) {
        int[][] array= {
                {1, 5},
                {13, 1},
                {12, 100},
                {12, 85} };

        java.util.Arrays.sort(array, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Double.compare(a[0], b[0]);
            }
        });

            for(int i = 0; i < 4; i++)
            {
                for(int j = 0; j < 2; j++)
                {
                    System.out.printf("%d ", array[i][j]);
                }
                System.out.println();
            }


    }
}
