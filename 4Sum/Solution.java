public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for(int i = 0; i < num.length - 3; i++){
            for(int j = i + 1; j < num.length - 2; j++){
                int k = j + 1;
                int l = num.length - 1;
                while(k < l){
                    int sum = num[i] + num[j] + num[k] + num[l];
                    if(sum < target){
                        k++;
                    }else if(sum > target){
                        l--;
                    }else{
                        List<Integer> one = new ArrayList<Integer>();
                        one.add(num[i]);
                        one.add(num[j]);
                        one.add(num[k]);
                        one.add(num[l]);
                        ret.add(one);
                        while(k < l && num[k + 1] == num[k]){
                            k++;
                        }
                        while(k < l && num[l - 1] == num[l]){
                            l--;
                        }
                        k++;
                        l--;
                    }
                }
                while(j < num.length - 2 && num[j + 1] == num[j]){
                    j++;
                }
            }
            while(i < num.length - 3 && num[i + 1] == num[i]){
                i++;
            }
        }
        return ret;
    }
}
