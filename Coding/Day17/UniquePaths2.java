//Question:https://leetcode.com/problems/unique-paths-ii/description/
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1)
        return 0;
        int p[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        p[0][0]=1;
        for(int i=1;i<obstacleGrid.length;i++)
        {
            if(obstacleGrid[i][0]==0)
            p[i][0]=p[i-1][0];
        }
        for(int i=1;i<obstacleGrid[0].length;i++)
        {
            if(obstacleGrid[0][i]==0)
            p[0][i]=p[0][i-1];
        }
        for(int i=1;i<obstacleGrid.length;i++)
        {
            for(int j=1;j<obstacleGrid[i].length;j++)
            {
                if(obstacleGrid[i][j]==0)
                p[i][j]=p[i-1][j]+p[i][j-1];
            }
        }
        return p[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}