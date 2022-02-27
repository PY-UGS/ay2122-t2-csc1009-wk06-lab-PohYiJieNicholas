import java.util.*;

public class HashMapExercise {

    public HashMapExercise() {

    }

    public void addAndSort(HashMap<Integer,Integer> hashMap, int value){
        int size = hashMap.size();
        hashMap.put(size, value);
        
        //Sort the map in ascending order
        for(int i = size; i > 0; i--){
            if (hashMap.get(i) < hashMap.get(i-1)){
                this.swapValues(hashMap,i,i-1);
            }
        }      
    }

    public void swapValues(HashMap<Integer,Integer> hashMap, int indexOne, int indexTwo){
        int temp1 = hashMap.get(indexOne);
        int temp2 = hashMap.get(indexTwo);

        hashMap.replace(indexOne,temp1 ,temp2);
        hashMap.replace(indexTwo,temp2, temp1);
    }

    public int findValue(HashMap<Integer,Integer> hashMap, int searchVal){
        int index = -1;
        //System.out.println("Content: " + list);
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() == searchVal){
                System.out.print("Number Found at index: ");
                return entry.getKey();
            }else{
                if(entry.getKey() == hashMap.size()-1){
                    System.out.print("Number not found returning: ");
                }
            }
        }
        
        return index;
        
    }

}
