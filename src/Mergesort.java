import java.util.ArrayList;
import java.util.Random;

public class Mergesort {

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftarr ,ArrayList<Integer> rightarr){

        ArrayList<Integer> mergedList = new ArrayList<Integer>();

        while(!leftarr.isEmpty() && !rightarr.isEmpty()) {
            if(leftarr.get(0) > rightarr.get(0)) {
                mergedList.add(rightarr.get(0));
                rightarr.remove(0);
            }
            else {
                mergedList.add(leftarr.get(0));
                leftarr.remove(0);
            }
        }

        while(!leftarr.isEmpty()) {
            mergedList.add(leftarr.get(0));
            leftarr.remove(0);
        }

        while(!rightarr.isEmpty()) {
            mergedList.add(rightarr.get(0));
            rightarr.remove(0);
        }

        return mergedList ;
    }



    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {

        if(dataList.size() <= 1) {
            return dataList;
        }
        ArrayList<Integer> leftarr = new ArrayList<Integer>();
        ArrayList<Integer> rightarr = new ArrayList<Integer>();

        int medium = dataList.size() / 2;

        leftarr = mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium)));
        rightarr = mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium , dataList.size())));

        return this.mergeFunc(leftarr , rightarr);

    }


    public static void main (String args[]) {
        ArrayList <Integer> testData = new ArrayList<Integer>();
        for(int i =0;i<100;i++) {
            testData.add((int)(Math.random()*100));
        }

        Mergesort mSort = new Mergesort();

        long st = System.currentTimeMillis();

        //속도 측정할 메소드
        mSort.mergeSplitFunc(testData);

        long et = System.currentTimeMillis();

        System.out.println((et - st)+" ms");

    }
}
