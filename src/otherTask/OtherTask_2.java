package otherTask;

public class OtherTask_2 {

    private int k =1;
    private int n = 1;
    private int quantityLines = 1;

    public OtherTask_2(int k, int n) {
        this.k = k;
        this.n = n;
    }

    public void start(){
        showMatrix(createMatrix(k, n));
    }

    private int[][] createMatrix(int k, int n){
        int number = 1;
quantityLines = (k/n)+1;
        int[][] mass = new int[quantityLines][n];
        for (int i = 0; i < quantityLines ; i++) {
            for (int j = 0; j <n ; j++) {
                mass[i][j] = number;
                number++;
                if (number > k){
                    return mass;
                }
            }
        }
        return mass;
    }

    private void showMatrix(int[][] mass)
    {
        stop :for (int i = 0; i < quantityLines; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" +mass[i][j]+ "]");
                if (mass[i][j] == k){
                   break stop;
                }
            }
            System.out.println();
        }
    }

}
