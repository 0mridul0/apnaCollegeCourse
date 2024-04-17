package arrays;

public class sprialMatrix {
    public static void printSpiralMatrix(int[][] matirx){
    int startRow = 0;
    int startCol=0;
    int endRow=matirx.length-1;
    int endCol=matirx[0].length-1;

        while (startRow<=endRow && startCol<=endCol)
        {
            //top
            for(int j=startCol ; j<=endCol ; j++)
            {
                System.out.print(matirx[startRow][j]+" ");
            }
            //right
            for (int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(matirx[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(matirx[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>startRow;i--)
            {

                if(startCol==endCol)
                {
                    break;
                }
                System.out.print(matirx[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiralMatrix(matrix);
    }
}
