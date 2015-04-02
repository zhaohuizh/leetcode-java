public class Solution {
  public int compareVersion(String version1, String version2){
    String[] arr1 = version1.split("\\.");
    String[] arr2 = version2.split("\\.");
    int i = 0;
    while(i < arr1.length && i < arr2.length){
      int a1 = Integer.valueOf(arr1[i]);
      int a2 = Integer.valueOf(arr2[i]);
      if(a1 < a2){
        return -1;
      }else if(a1 > a2){
        return 1;
      }
      i++;
    }
       
    if(i == arr1.length && i == arr2.length){
      return 0;
    }else if(i < arr1.length){
      while(i < arr1.length && Integer.valueOf(arr1[i]) == 0){
        i++;
      };
      return i < arr1.length ? 1 : 0;
    }else{
      while(i < arr2.length && Integer.valueOf(arr2[i]) == 0){
        i++;
      };
      return i < arr2.length ? -1 : 0;
    }
  }
  public static void main(String[] args){
    Solution s = new Solution();
    int a = s.compareVersion("1", "0");
    System.out.println(a);
  }
}
