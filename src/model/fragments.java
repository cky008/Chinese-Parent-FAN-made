package model;

public class fragments {
    int level;
    double bonus;
    int[][] fra;

    private fragments(){
        this.level = 1;
        this.bonus = calBonus(this.level);
        this.fra = newRanFra(10);
    }

    public fragments(int l){
        this.level = l;
        this.bonus = calBonus(l);
        this.fra = newRanFra(10);
    }

    public int getLevel() {
        return level;
    }

    public double getBonus() {
        return bonus;
    }

    public int[][] getFra() {
        return fra;
    }

    private double calBonus(int level) {
        if (this.level <= 1) {
            return 1;
        }
        this.bonus = level*0.1+1;
        return this.bonus;
    }

    private int[][] newRanFra(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                matrix[i][j] = randomNumber(5);
//                System.out.print(matrix[i][j] + " ");
            }
//            System.out.println();
        }

        this.fra = chRanFra(matrix);
        return this.fra;
    }

    private int[][] chRanFra(int[][] m){
        int[][] returnM = m;
        for (int i = 0; i <= 19; i++) {
            returnM[randomNumber(9)][randomNumber(9)] = randomNumber(14);
        }
        return returnM;
    }

    public static int randomNumber(int n){
        int number;
        number = new java.util.Random().nextInt(n)+1;
        return number;
    }

    public int[][] nextLevel(){
        this.level +=1;
        newRanFra(10);
        return this.fra;
    }
}
