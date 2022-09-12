package com.strawbingo.algorithm.sword.ch2;

/**
 * 题13：机器人的运动范围。
 * 地上有一个m行n列的方格。一个机器人从坐标（0,0）的格子开始移动，上下左右移动，不能进入坐标和列数字之和大于k的格子。
 * 求能够到达多少个格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。
 * 但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 */
public class MovingCount {

    private int count;
    public int movingCount(int m, int n, int k) {
        count = 0;
        boolean[][] visited = new boolean[m][n];

        movingCount(m,n,0,0,k,visited);
        return count;
    }


    private void movingCount(int m, int n, int i, int j,int k, boolean[][] visited) {
//        System.out.println("in ="+i+":"+j+":"+count);
        //退出
        if(i<0 || j<0 || i ==m ||j==n) return;
        int sum = 0;
        if(visited[i][j]){
//            System.out.println("vi");
            return;
        }
        char[] chars = String.valueOf(i).toCharArray();
        for (char c:
                chars) {
            sum += Integer.parseInt(c+"");
        }
        chars = String.valueOf(j).toCharArray();
        for (char c:
                chars) {
            sum += Integer.parseInt(c+"");
        }
        //if sum < 0, or sum > k+1
        if(sum < 0 || sum > k ){
//            System.out.println("sum return:"+sum);
            return;
        }
//        System.out.println("sum:"+sum);
        if(sum <= k){

            count++;
            visited[i][j] =true;

        }
        //if  sum > k+1 , count ++, do more sum +
        movingCount(m,n,i,j+1,k,visited);
        movingCount(m,n,i+1,j,k,visited);
        // if sum > 0 , count ++, do more sum -
        movingCount(m,n,i,j-1,k,visited);
        movingCount(m,n,i-1,j,k,visited);

    }

}
