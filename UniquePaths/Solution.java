public class Solution {
  public int uniquePaths(int m, int n) {
    if(m == 0 || n == 0) return 0;
    int[] cache = new int[n];
    for(int i = 0; i < n; i++){
      cache[i] = 1;
    }
    for(int i = 1; i < m; i++){
      for(int j = 1; j < n; j++){
        cache[j] = cache[j - 1] + cache[j];
      }
    }
    return cache[n - 1];
  }
}
