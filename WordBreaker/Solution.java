import java.util.Set;

public class Solution {
  public boolean wordBreak(String s, Set<String> wordDict) {
    int len = s.length();
    if(len == 0) return wordDict.contains("");
    boolean[] dp = new boolean[len + 1];
    dp[0] = true;
    for(int i = 1; i <= len; i++){
      dp[i] = false;
      for(int j = i - 1; j >= 0; j--){
        if(dp[j] && wordDict.contains(s.substring(j, i))){
          dp[i] = true;
          break;
        }
      }
    }
    return dp[len];
  }
}
