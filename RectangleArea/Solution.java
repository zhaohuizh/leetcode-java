public class Solution {
  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    int overlapA = Math.max(A, E);
    int overlapB = Math.max(B, F);
    int overlapC = Math.min(C, G);
    int overlapD = Math.min(D, H);
    if(overlapA >= overlapC || overlapB >= overlapD){
      return rectArea(A, B, C, D) + rectArea(E, F, G, H);
    }else{
      return rectArea(A, B, C, D) + rectArea(E, F, G, H)
        - rectArea(overlapA, overlapB, overlapC, overlapD);
    }
  }

  private int rectArea(int A, int B, int C, int D){
    return (C - A) * (D - B);
  }
}
