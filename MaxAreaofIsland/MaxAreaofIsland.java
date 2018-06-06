package leetcode_day1;

public class MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
    	int[][] bol = new int[grid.length][grid[0].length];
        if (grid == null)
        	return 0;
        int max = 0;
        for(int i= 0; i<grid.length;i++){
        	for(int j = 0; j<grid[0].length;j++){
        		int ins = 0;
        		if(grid[i][j]==1)
        			ins = DFS(bol,grid,i,j);
        		if(max < ins)
        			max = ins;
        	}
        }
        return max;
    }
    public int DFS(int[][] bol, int[][] grid,int i,int j){
    	int res = 0;
    	if(bol[i][j]==0){
    		res = 1;
    	}
    	grid[i][j] = -1;

    	if(j<grid[0].length-1&&grid[i][j+1]==1){
    		res +=DFS(bol,grid, i, j+1);
    	}
    	if(i<grid.length-1&&grid[i+1][j]==1){
    		res +=DFS(bol,grid, i+1, j);
    	}
    	if(j>0&&grid[i][j-1]==1){
    		res +=DFS(bol,grid, i, j-1);
    	}
    	if(i>0&&grid[i-1][j]==1){
    		res +=DFS(bol,grid, i-1, j);
    	}
    	return res;
    }
}
