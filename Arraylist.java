import java.util.ArrayList;
public class Arraylist {
    public static void swaplist(ArrayList<Integer> hiir,int indx,int indx1){
        int temp = hiir.get(indx);
        hiir.set(indx,hiir.get(indx1));
        hiir.set(indx1,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> hiir = new ArrayList<>();
        hiir.add(9);
        hiir.add(6);
        hiir.add(7);
        hiir.remove(0);
        hiir.set(0,4);
        // System.out.println(hiir);
        // for(int i=0;i<hiir.size();i++){
        //     System.out.print(hiir.get(i));
        // }
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<hiir.size();i++){
        //     if(max<hiir.get(i)){
        //         max = hiir.get(i);
        //     }
        // }
        // System.out.println(max);
         int indx=0,indx1=1;
         swaplist(hiir,indx,indx1);
         System.out.println(hiir);
        //  ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
        //  ArrayList<Integer> list1= new ArrayList<>();
        //  list1.add(6);list1.add(3);
        //  ArrayList<Integer> list2 = new ArrayList<>();
        //  list2.add(4);list2.add(9);
        //  mainlist.add(list2);mainlist.add(list1);
        //  for(int i =0;i<mainlist.size();i++){
        //     ArrayList<Integer> cuur = mainlist.get(i);
        //     for(int j=0;j<cuur.size();j++){
        //         System.out.print(cuur.get(j));
        //     }
        //     System.out.println();
        //  }
    }
}
