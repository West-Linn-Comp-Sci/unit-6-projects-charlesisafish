public class MyArray2DExplorer {
    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRowPractice(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("}");

    }
    public boolean evenRow(int [][] mat, int row){
        int sum = 0;
        for(int i=0; i<mat[row].length; i++){
            if(mat[row][i] % 2 != 0){
                    return false;
            }
        }
        return true;
    }
    public int[] minRowPractice(int [][] mat){
        int[] rowSum = new int[mat.length];
        int min = 0;
        for(int i=0; i<mat.length; i++){
            for(int g=0; g<mat[i].length; g++){
                rowSum[i] += mat[i][g];
            }
        }
        for(int i=1; i<rowSum.length; i++){
            if(rowSum[i]<rowSum[i-1]){
                min = i;
            }
        }
        return mat[min];
    }
    public boolean oddColSum(int[][] array, int num){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i][num];
        }
        if(sum % 2 == 0){
            return false;
        }
        return true;
    }
}