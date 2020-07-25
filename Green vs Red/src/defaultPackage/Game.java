package defaultPackage;
import java.util.Scanner;
import defaultPackage.Rules;
/**
 * The Green vs Red application is a game played on a 2D grid which accepts the size of
 * the grid and the initial state of the grid. The values must be 0s and 1s only. 
 * Then accepts the coordinates of a cell and a number N which shows the times the
 * rules will be applied.
 * After that 4 rules are applied and it calculates how many times the cell in the
 * chosen coordinates was green (including the 'Generation Zero').
 * 
 * @author Kostadin Teodosiev
 * 
 */
public class Game {
	
        Scanner scan = new Scanner(System.in);
        static int x ;
        static int y ;
        static int x1;
        static int y1;
        static int N ; 
        static int result;
        String values="";
        String dimension="";
        String coordAndTimes="";
        String[] splitedDim;
        String[] splited;
        

        public Game(){
        	 
         //System.out.println("Height and Width:");
         dimension=scan.nextLine();                    //Entering the size of the grid
         splitedDim=dimension.split(",");
         y= Integer.parseInt(splitedDim[0]);           
         x= Integer.parseInt(splitedDim[1]);
           if(y>=1000||x>=1000) {                            //Check that x<=y<1000
           System.out.println("The grid can't be bigger than 999x999!");
           System.exit(0);
         }
           
         int[][] grid = new int [y][x];
         int[][] grid1 = new int [y][x];
         for(int i=0;i< y ; i++){            //Entering the values for 'Generation Zero'
        	 
        	 //System.out.println("Enter value for "+(i+1)+" row:");
        	 values += scan.next();
         
         }
         
         char[] values1=values.toCharArray();
         for (char i:values1) {                //Check that only 0s and 1s are entered
        	 if (!(i=='0'||i=='1')) {
        		 System.out.println("Entered values must be 0s and 1s!");
    			 System.exit(0);
        }	 }
         
         for(int i=0; i<y; i++){               //Assign the values to the grid
        	 for (int j=0; j<x; j++) {
        		 grid[i][j] = Character.getNumericValue(values1[(i*grid.length)+j]);
        }		 }
         
         
         
        // System.out.println("Coords and Times: ");
         coordAndTimes=scan.next();                   //Entering the last arguments
         splited=coordAndTimes.split(",");
         y1 = Integer.parseInt(splited[0]);
         x1 = Integer.parseInt(splited[1]);
         N = Integer.parseInt(splited[2]);
         
         checkValues(grid);              //Check if the value in the coordinates in 
        	                        //'Generation Zero' is Green
         
       
         Rules.applyRules(grid, grid1);            //Apply the rules and print the result
         System.out.println("The result is: "+ result);
        
        
        }
        
        public int checkValues(int[][]grid) {
        	if (grid[x1][y1]==1) {
        		result=1;
        	}else result=0;
        	
        	return result;
        }
        	
}


      
        	
        



