public class Solution {
  public int maximumGap(int[] num) {
    int res = 0;
    int len = num.length;
    if(len == 0) return res;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int n : num){
      max = Math.max(n, max);
      min = Math.min(n, min);
    }
    if(max == min) return res;
    int bucketGap = (max - min) / (len - 1);
    if(bucketGap == 0) bucketGap = 1;
    int[] max_bucket = new int[len];
    int[] min_bucket = new int[len];
    for(int i = 0; i < len; i++){
      int idx = (num[i] - min) / bucketGap;
      if(idx >= len) idx = len - 1;
      if(max_bucket[idx] == 0){
        max_bucket[idx] = num[i];
        min_bucket[idx] = num[i];
      }else{
        max_bucket[idx] = Math.max(max_bucket[idx], num[i]);
        min_bucket[idx] = Math.min(min_bucket[idx], num[i]);
      }
    }
    int prev = max_bucket[0];
    for(int i = 1; i < len; i++){
      if(min_bucket[i] != 0){
        if(min_bucket[i] - prev > res){
          res = min_bucket[i] - prev;
        }
        prev = max_bucket[i];
      }
    }
    return res;
  }
}
