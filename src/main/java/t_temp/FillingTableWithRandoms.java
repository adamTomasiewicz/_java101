package t_temp;

public class FillingTableWithRandoms {
    public static void main(String[] args) {
        int n = 15;
        int[][] tabResult;

        do {
            tabResult = tableFill(n);
        }
        while (!isCorrectTableResult(tabResult));


        for (int i = 0; i < tabResult.length; i++) {
            for (int j = 0; j < tabResult.length; j++) {
                System.out.print(tabResult[i][j] + ", ");
            }
            System.out.println(" ");
        }
    }


    private static int randomResult() {
        int result = (int) (Math.random() * 2);
        return result;
    }

    private static int[][] tableFill(int n) {
        int[][] tab1 = new int[n][n];

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1.length; j++) {
                tab1[i][j] = randomResult();
            }
        }
        return tab1;
    }

    private static boolean isCorrectTableResult(int[][] tabResult) {

        int counter = 0;
        for (int i = 0; i < tabResult.length; i++) {
            counter = 0;

            for (int j = 0; j < tabResult.length; j++) {
                if (tabResult[i][j] == 0) {
                    counter++;
                    if (counter == tabResult.length) {
                        System.out.println("znalazlem");
                        return true;
                    }
                }

            }
        }
        return false;
    }


}


