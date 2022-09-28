import java.util.ArrayList;
import java.util.Arrays;


public class Quicksort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList){

        if(dataList.size() == 0) {
            return dataList;
        }

        int pivot = dataList.get(0);
        ArrayList<Integer> leftarr = new ArrayList<Integer>();
        ArrayList<Integer> rightarr = new ArrayList<Integer>();

        for(int i=1;i<dataList.size();i++) {
            if(dataList.get(i) > pivot) {
                rightarr.add(dataList.get(i));
            }
            else {
                leftarr.add(dataList.get(i));
            }
        }


        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        mergedList.addAll(this.sort(leftarr));
        mergedList.addAll(Arrays.asList(pivot));
        mergedList.addAll(this.sort(rightarr));

        return mergedList;
    }

    public static void main (String ars[]) {
        ArrayList <Integer> testData = new ArrayList<Integer>();
        for(int i =0;i<100;i++) {
            testData.add((int)(Math.random()*100));
        }

        Quicksort qsort = new Quicksort();

        long st = System.currentTimeMillis();

        //속도 측정할 메소드
        qsort.sort(testData);

        long et = System.currentTimeMillis();

        System.out.println((et - st)+" ms");
    }

}
