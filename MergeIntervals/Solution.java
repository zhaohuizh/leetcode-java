/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
import java.util.*;

public class Solution {
  public class IntervalComparator implements Comparator<Interval>{
    public int compare(Interval in1, Interval in2){
      return in1.start - in2.start;
    }
  }
  public List<Interval> merge(List<Interval> intervals) {
    if(intervals == null || intervals.size() <= 1){
      return intervals;
    }
    Collections.sort(intervals, new IntervalComparator());
    List<Interval> ret = new ArrayList<Interval>();
    Interval prev = intervals.get(0);
    for(int i = 1; i < intervals.size(); i++){
      Interval curr = intervals.get(i);
      if(curr.start > prev.end){
        ret.add(prev);
        prev = curr;
      }else{
        prev = new Interval(prev.start, 
            Math.max(prev.end, curr.end));
      }
    }
    ret.add(prev);
    return ret;
  }
}
