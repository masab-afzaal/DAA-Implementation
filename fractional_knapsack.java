import java.util.*;

public class fractional_knapsack{
  public static void main(String args []){
    int val[] = {60,100,120};
    int wht[] =   {10,20,30};
    int w = 50;

    double ratio[][] = new double[val.length][2];
    for(int i=0; i<val.length; i++){
      ratio[i][0] = i;
      ratio[i][1] = val[i] / (double) wht[i];
    }

    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
    
    int capacity = w;
    int fnlval = 0;
    for(int i=ratio.length-1; i>=0; i--){
      int idx = (int)ratio[i][0];
      if(capacity >= wht[idx]) {
        fnlval += val[idx];
        capacity -= wht[idx];
      } else {
        fnlval += (ratio[i][1] * capacity);
        capacity = 0;
        break;
      }
    }
    System.out.println(fnlval);
   
  }
}