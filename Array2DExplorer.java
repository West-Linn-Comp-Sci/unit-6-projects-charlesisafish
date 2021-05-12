
/**
 * This is a selection of methods used to practice 2D array techniques.
 *
 * @Gregory
 * @5/11/21
 */
public class Array2DExplorer
{
    public static void main(String[] args){
        Array2DExplorer test = new Array2DExplorer();
        int[][] array = {{0, 1, 2, 3, 4}, {4, 3, 2, 1, 0}, {2, 4, 0, 1, 3}, {100, -5, 0, 8, 50}, {0, 0, 0, 0, 0}};
        System.out.println(test.minRow(array, 0));
        test.toString(test.colMaxs(array));
        test.toString(test.allRowSums(array));
        test.toString1(test.averageCol(array));
        System.out.println(test.smallEven(array));
        System.out.println(test.biggestRow(array));
    }
    public int minRow(int[][] nums, int row){
        int min = 1000;
        for(int i=0; i<nums[row].length; i++){
            if(min>nums[row][i]){
                min = nums[row][i];
            }
        }
        return min;
    }
    public int[] colMaxs(int[][] matrix){
        int[] maxs = new int[matrix.length];
        int max = 0;
        for(int i=0; i<matrix.length; i++){
            max = 0;
            for(int g=0; g<matrix[i].length; g++){
                if(matrix[g][i]>max){
                    max = matrix[g][i];
                    maxs[i] = matrix[g][i];
                }
            }
        }
        return maxs;
    }
    public int[] allRowSums(int[][] data){
        int[] rowSum = new int[data.length];
        for(int i=0; i<data.length; i++){
            for(int g=0; g<data[i].length; g++){
                rowSum[i] += data[i][g];
            }
        }
        return rowSum;
    }
    public double[] averageCol(int[][] nums){
        double[] avgs = new double[nums[0].length];
        double avg = 0;
        int count;
        for(int i=0; i<nums.length; i++){
            avg = 0;
            count = 0;
            for(int g=0; g<nums[i].length; g++){
                    avg += nums[g][i];
                    count++;
            }
            avgs[i] = avg/count;
        }
        return avgs;
    }
    public int smallEven(int[][] matrix){
        int min = 100;
        for(int i=0; i<matrix.length; i++){
            for(int g=0; g<matrix[i].length; g++){
                if(matrix[i][g] % 2 == 0 && matrix[i][g] < min){
                    min = matrix[i][g];
                }
            }
        }
        return min;
    }
    public static int biggestRow(int[][] nums){
        int max = 0;
        int[] sum = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int g=0; g<nums[i].length; g++){
                    sum[i] += nums[i][g];
            }
        }
        for(int i=1; i<sum.length; i++){
            if(sum[i] > sum[i-1]){
                max = i;
            }
        }
        return max;
    }
    public void toString(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
    public void toString1(double[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print( + nums[i] + ", ");
        }
        System.out.println();
    }
}
