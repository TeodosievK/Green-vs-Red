package defaultPackage;
public class Rules extends Game{
    
    	
	public static int applyRules(int[][]grid,int[][]grid1) {
		for(int k=0;k<N;k++) {
  		  for(int i=0;i<y;i++) {
  			  for(int j=0;j<x;j++) {
  				  if (grid[0][0]==0) {                   //Rules for upper left corner
  					  if (grid[0][1]+grid[1][0]+grid[1][1]==3) {
  						  grid1[0][0]=1; }
  					  else grid1[0][0]=0; }
  				  else if (grid[0][0]==1) {
  					  if (grid[0][1]+grid[1][0]+grid[1][1]>=2) {
  						  grid1[0][0]=1; }
  					  else grid1[0][0]=0; }
  				  
  				  if (grid[0][x-1]==0) {                 //Rules for upper Right corner
  					  if (grid[0][x-2]+grid[1][x-2]+grid[1][x-1]==3) {
  						  grid1[0][x-1]=1;
  	        			}else grid1[0][x-1]=0;
  	        		}else if (grid[0][x-1]==1) {
  	        			if (grid[0][x-2]+grid[1][x-2]+grid[1][x-1]>=2) {
  	        				grid1[0][x-1]=1;
  	        		    }else grid1[0][x-1]=0;                    
  	        			
  	        		} if (grid[y-1][0]==0) {             //Rules for bottom Left corner
  	        			if (grid[y-2][0]+grid[y-2][1]+grid[y-1][1]==3) {
  	        				grid1[y-1][0]=1;
  	        			}else grid1[y-1][0]=0;
  	        		}else if (grid[y-1][0]==1) {
  	        			if (grid[y-2][0]+grid[y-2][1]+grid[y-1][1]>=2) {
  	        				grid1[y-1][0]=1;
  	        			}else grid1[y-1][0]=0;                    
  	        			
  	        		}if (grid[y-1][x-1]==0) {            //Rules for bottom Right corner
  	        			if (grid[y-2][x-2]+grid[y-2][x-1]+grid[y-1][x-2]==3) {
  	        				grid1[y-1][x-1]=1;
  	        			}else grid1[y-1][x-1]=0;
  	        		}else if (grid[y-1][x-1]==1) {
  	        			if (grid[y-2][x-2]+grid[y-2][x-1]+grid[y-1][x-2]>=2) {
  	        				grid1[y-1][x-1]=1;
  	        			}else grid1[y-1][x-1]=0;                 
  	        		}
  	        		if (i!=0 && i!=y-1 && grid[i][0]==0) {     //Rules for left side
  	        			if (grid[i-1][0]+grid[i+1][0]+grid[i][1]+grid[i-1][1]+grid[i+1][1]==3) {
  	        				grid1[i][0]=1;
  	        			}else grid1[i][0]=0;
  	        		}else if (i!=0 && i!=y-1 && grid[i][0]==1) {
  	        			if (grid[i-1][0]+grid[i+1][0]+grid[i][1]+grid[i-1][1]+grid[i+1][1]>=2&&
  	        					grid[i-1][0]+grid[i+1][0]+grid[i][1]+grid[i-1][1]+grid[i+1][1]<=3) {
  	        				grid1[i][0]=1;
  	        			}else grid1[i][0]=0;                     
  	        		}
  	        		if (j!=0 && j!=x-1 && grid[0][j]==0) {    //Rules for top side
  	        			if (grid[0][j-1]+grid[0][j+1]+grid[1][j]+grid[1][j-1]+grid[1][j+1]==3) {
  	        				grid1[0][j]=1;
  	        			}else grid1[0][j]=0;
  	        		}else if (j!=0 && j!=x-1 && grid[0][j]==1) {
  	        			if (grid[0][j-1]+grid[0][j+1]+grid[1][j]+grid[1][j-1]+grid[1][j+1]>=2&&
  	        					grid[0][j-1]+grid[0][j+1]+grid[1][j]+grid[1][j-1]+grid[1][j+1]<=3) {
  	        				grid1[0][j]=1;
  	        			}else grid1[0][j]=0;                     
  	        	 }                                             //Rules for bottom side
  	        		if (j!=0 && j!=x-1 && i==y-1 && grid[i][j]==0) {
  	        			if (grid[i][j-1]+grid[i][j+1]+grid[i-1][j]+grid[i-1][j-1]+grid[i-1][j+1]==3) {
  	        				grid1[i][j]=1;
  	        			}else grid1[i][j]=0;
  	        		}else if (j!=0 && j!=x-1 && i==y-1 && grid[i][j]==1) {
  	        			if (grid[i][j-1]+grid[i][j+1]+grid[i-1][j]+grid[i-1][j-1]+grid[i-1][j+1]>=2&&
  	        					grid[i][j-1]+grid[i][j+1]+grid[i-1][j]+grid[i-1][j-1]+grid[i-1][j+1]<=3) {
  	        				grid1[i][j]=1;
  	        			}else grid1[i][j]=0;                     
  	        	 }                                               //Rules for right side
  	        		if (i!=0 && i!=y-1 && j==x-1 && grid[i][j]==0) {
  	        			if (grid[i][j-1]+grid[i-1][j]+grid[i+1][j]+grid[i-1][j-1]+grid[i+1][j-1]==3) {
  	        				grid1[i][j]=1;
  	        			}else grid1[i][j]=0;
  	        		}else if (i!=0 && i!=y-1 && j==x-1 && grid[i][j]==1) {
  	        			if (grid[i][j-1]+grid[i-1][j]+grid[i+1][j]+grid[i-1][j-1]+grid[i+1][j-1]>=2&&
  	        					grid[i][j-1]+grid[i-1][j]+grid[i+1][j]+grid[i-1][j-1]+grid[i+1][j-1]<=3) {
  	        				grid1[i][j]=1;
  	        			}else grid1[i][j]=0;                     
  	        	 }                                                 //Rules for center
  	        		if (i!=0 && i!=y-1 && j!=x-1 && j!=0 && grid[i][j]==0) {
  	        			if (grid[i][j-1]+grid[i-1][j]+grid[i+1][j]+grid[i][j+1]+grid[i+1][j-1]+grid[i-1][j-1]+grid[i+1][j+1]+grid[i-1][j+1]==3||
  	        					grid[i][j-1]+grid[i-1][j]+grid[i+1][j]+grid[i][j+1]+grid[i+1][j-1]+grid[i-1][j-1]+grid[i+1][j+1]+grid[i-1][j+1]==6) {
  	        				grid1[i][j]=1;
  	        			}else grid1[i][j]=0;
  	        		}else if (i!=0 && i!=y-1 && j!=x-1 && j!=0 && grid[i][j]==1) {
  	        			if (grid[i][j-1]+grid[i-1][j]+grid[i+1][j]+grid[i][j+1]+grid[i+1][j-1]+grid[i-1][j-1]+grid[i+1][j+1]+grid[i-1][j+1]>=2&&
  	        					grid[i][j-1]+grid[i-1][j]+grid[i+1][j]+grid[i][j+1]+grid[i+1][j-1]+grid[i-1][j-1]+grid[i+1][j+1]+grid[i-1][j+1]<=3||
  	        					grid[i][j-1]+grid[i-1][j]+grid[i+1][j]+grid[i][j+1]+grid[i+1][j-1]+grid[i-1][j-1]+grid[i+1][j+1]+grid[i-1][j+1]==6) {
  	        				grid1[i][j]=1;
  	        			}else grid1[i][j]=0;                     
  	        		}
  	        	 }
  	         }
  	         for (int i=0;i<y;i++) {
  	        	 for(int j=0;j<x;j++) {
  	        		 grid[i][j]=grid1[i][j];
  	        }
  	         }
  	         if (grid[x1][y1]==1){
  	        	 result=result+1;
  	        		 }
  	         }return result;
    }
      
      	
}



