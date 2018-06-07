package day2;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
    	if(grid == null){
    		return 0;
    	}
    	int sum = 0;
        sum = calSum(grid,grid.length-1,grid[0].length-1);
    	return sum;
    }
    public int calSum(int[][] grid,int i, int j){
    	if(i == 0 && j ==0){
    		return grid[i][j];
    	}
    	if(i == 0){
    		return calSum(grid,i,j-1)+grid[i][j];
    	}
    	if(j == 0){
    		return calSum(grid,i-1,j)+grid[i][j];
    	}
    	return(Math.min(calSum(grid,i-1,j)+grid[i][j],calSum(grid,i,j-1)+grid[i][j]));
    }
    
    public int minPathSum2(int[][] grid) {
    	if(grid == null){
    		return 0;
    	}
    	for(int i = 0;i<grid.length;i++){
    		for (int j = 0;j<grid[0].length;j++){
    			if(i == 0 && j == 0){
    				grid[i][j] = grid[i][j];
    			}else if(i==0){
        			grid[i][j]= grid[i][j-1]+grid[i][j];
    			}else if(j==0){
        			grid[i][j]= grid[i-1][j]+grid[i][j];
    			}else{
        			grid[i][j]= Math.min(grid[i-1][j], grid[i][j-1])+grid[i][j];
    			}
    		}
    	}
    	return grid[grid.length-1][grid[0].length-1];
    }
    
    
    
}
