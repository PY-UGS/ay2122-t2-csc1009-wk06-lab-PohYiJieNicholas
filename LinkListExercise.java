import java.util.*;
public class LinkListExercise {

    public LinkListExercise() {}

    //Question 1
    public void addAndSort(LinkedList<Integer> list, int value){
        int size = list.size();
        
        //insert sort linklist
        for(int i = 0; i < size; i++){
            if (value <= list.get(i)){
                list.add(i, value);
                break;
            }else if(list.getLast() < value){
                list.add(value);
                break;
            }
        }
    }

    //Question 2
    public void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){
        int temp1 = list.get(indexOne);
        int temp2 = list.get(indexTwo);

        if(temp1 != -1 || temp2 != -1){
            list.set(indexOne, temp2);
            list.set(indexTwo, temp1);
        }

    }

    //Question 3
    public int findValue(LinkedList<Integer> list, int searchVal){
        //System.out.println("Content: " + list);
        if(list.contains(searchVal)){
            System.out.print("Number found at index: ");
            return list.indexOf(searchVal);
        }else{
            System.out.print("Number not found, returning: ");
            return -1;
        }
    }
}
