/*https://leetcode.com/problems/sudoku-solver/submissions/*/
class Solution {
    public void solveSudoku(char[][] board) {
       sudokuSolver(board,0,0); 
    }
    
    public boolean sudokuSolver( char[][] board, int currentRow, int currentCol)
    {
        if(currentRow==9)
        {
            return true;
        }
        if(currentCol==9)
        {
            return sudokuSolver(board,currentRow+1,0);
        }
        if(board[currentRow][currentCol]=='.')
        {
          
        //checking for currentval in range 10
        for(char i = '1'; i <='9'; i++)
        {
           if(isValid(board, currentRow, currentCol, i)) 
           {
               board[currentRow][currentCol]=i;
               {
                   if (sudokuSolver(board, currentRow, currentCol+1))
                   {
                       return true;
                   }
                  else
                  {
                      board[currentRow][currentCol] = '.';
                  }
               }
           }
        }
        }
        else
        {
            return sudokuSolver(board,currentRow,currentCol+1);
        }
        
        return false;
    }
    
    public boolean isValid(char[][] board, int currentRow, int currentCol, char currentVal)
    {
        return isRowValid(board,currentRow, currentVal) && isColValid(board,currentCol,currentVal) && isSubGridValid(board, currentRow, currentCol, currentVal);
    }
    
    public boolean isRowValid(char[][] board ,int currentRow, char currentVal)
    {
        //checking for currentRow in range 9
        for(int i=0;i<9;i++)
        {
            if( board[currentRow][i] == currentVal)
            {
                return false;
            }
        }
        return true;
    }
     public boolean isColValid(char[][] board ,int currentCol, char currentVal)
    {
        //checking for currentRow in range 9
        for(int i=0;i<9;i++)
        {
            if( board[i][currentCol] == currentVal)
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean isSubGridValid(char[][] board , int currentRow, int currentCol, char currentVal)
    {
        int x= 3*(currentRow/3);
        int y= 3*(currentCol/3);
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[x+i][y+j]==currentVal)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
