import java.util.*;
// public class GreedyAlog {
//     public static void main(String[] args) {
//         int start[]={1,3,0,5,8,5};
//         int end[]={2,4,6,7,9,9};
//         int maxAct = 0;
        
//         ArrayList<Integer> ans = new Arraylist<>();
//         maxAct=1;
//         ans.add(0);
//         int lastEnd = end[0];
//         for(int i = 1;i<start.length;i++){
//             if (start[i]>=lastEnd) {
//                 maxAct++;
//                 ans.add(i);
//                 lastEnd=end[i];
//             }
//         }
//         System.out.println("MAx Activities:"+   maxAct);
//         for(int i=0;i<ans.size();i++){
//             System.out.println("A"+ans.get(i)+" ");
//         }        
//     }
// }

/**
 * GreedyAlog
 */
public class GreedyAlog {

    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W = 50;

        double ratio[][]=new double[val.length][2];
        //0th col is for indx; 1'st col is for ratio
        
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        //asending order
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int cap= W;
        int finalValue= 0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if (cap>=weight[idx]) {
                finalValue += val[idx];
                cap -=weight[idx];
            } else{
                finalValue += (ratio[i][1]*cap);
                cap=0;
                break;
            }
        }
        System.out.println("final Value"+finalValue);
    }
}