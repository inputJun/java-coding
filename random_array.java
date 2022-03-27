public class Exercise {
    public static void main(String[] args) {
        int [][] num = new int[4][4];
        for(int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++)
                num[i][j] = 0;
        }

        int a = 0;
        while(a < 10) {
            int x = (int)(Math.random()*4);
            int y = (int)(Math.random()*4);
            if(num[x][y] == 0) {
                num[x][y] = (int)(Math.random()*10 + 1);
                a++;
            }
        }
        
        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
