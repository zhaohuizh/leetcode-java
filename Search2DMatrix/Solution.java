public class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
      return false;
    }
    int rows = matrix.length;
    int cols = matrix[0].length;
    int start = 0;
    int end = rows - 1;
    while(start <= end){
      int mid = (start + end) >> 1;
      if(matrix[mid][cols - 1] == target){
        return true;
      }else if(matrix[mid][cols - 1] > target){
        end = mid - 1;
      }else{
        start = mid + 1;
      }
    }
    if(start >= rows) return false;
    int r = start;
    start = 0;
    end = cols - 1;
    while(start <= end){
      int mid = (start + end) >> 1;
      if(matrix[r][mid] == target){
        return true;
      }else if(matrix[r][mid] > target){
        end = mid - 1;
      }else{
        start = mid + 1;
      }
    }
    return false;
  }
}
