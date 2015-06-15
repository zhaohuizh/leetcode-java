public class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int len1 = nums1.length;
    int len2 = nums2.length;
    int halfLen = (len1 + len2) / 2;
    if((len1 + len2) % 2 == 0){
      return (median(nums1, nums2, halfLen) + median(nums1, nums2, halfLen + 1) ) / 2.0; 
    }else{
      return median(nums1, nums2, halfLen + 1);
    }
  }
  public int median(int[] nums1, int[] nums2, int k){
    int b1 = 0;
    int b2 = 0;
    int e1 = nums1.length - 1;
    int e2 = nums2.length - 1;
    while(true){
      if(b1 > e1){
        return nums2[b2 + k - 1];
      }
      if(b2 > e2){
        return nums1[b1 + k - 1];
      }
      if(k <= 1){
        return Math.min(nums1[b1], nums2[b2]);
      }
      int m1 = (b1 + e1) >> 1;
      int m2 = (b2 + e2) >> 1;
      if(nums1[m1] > nums2[m2]){
        if(m1 - b1 + m2 - b2 > k - 1){
          e1 = m1 - 1;
        }else{
          k = k - m2 + b2 - 1;
          b2 = m2 + 1;
        }
      }else{
        if(m1 - b1 + m2 - b2 > k - 1){
          e2 = m2 - 1;
        }else{
          k = k - m1 + b1 - 1;
          b1 = m1 + 1;
        }
      }
    }
  }
}
