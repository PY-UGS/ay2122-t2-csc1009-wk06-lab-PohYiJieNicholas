import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //LinkedList
        System.out.println("Lab 6 exercise");

        LinkedList<Integer> linkedList = new LinkedList<Integer>(); //Create linklist object
        
        //Populate the linklist with values 1,3,5,7,9,11
        for(int i = 0; i <= 11; i ++){
            if(i % 2 == 1){
                linkedList.add(i);
            }
            
        }
        LinkListExercise listExercise = new LinkListExercise(); //Create listExercise object 
        
        //Question1
        System.out.println("Question 1:");
        System.out.print("Enter an integer to add to linklist: ");
        int add = input.nextInt();
        
        System.out.println("Content before change: " + linkedList);
        listExercise.addAndSort(linkedList, add);
        System.out.println("Content after change: " + linkedList);

        //Question 2
        System.out.println("\nQuestion 2:");
        System.out.print("Enter the 2 index you wish to swap: ");
        int index1 = input.nextInt();
        int index2 = input.nextInt();

        listExercise.swapValues(linkedList, index1, index2);
        System.out.println("Swapping Index "+index1 +" and " +index2+" :"  + linkedList);

        //Question3
        System.out.println("\nQuestion 3:");
        LinkedList<Integer> listRandom = new LinkedList<Integer>();
        int max = 9999;
        int min = 1000;

        for(int i = 0; i<500; i++){
            int randomValue = (int)(Math.random()*(max-min+1)+min);
            listRandom.add(randomValue);
        }

        System.out.print("Enter the number you wish to find between 1000 to 9999: ");
        int find = input.nextInt();

      
        System.out.print(listRandom);
        
        //System.out.print("Contents" +listRandom);
        System.out.println(listExercise.findValue(listRandom, find));

        //HashMaps
        //Question 4
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        HashMapExercise hashExercise = new HashMapExercise();

        //Populate the hash with values 1,3,5,7,9,11
        int k = 0;
        for(int i = 0; i <= 11; i ++){
            if(i % 2 == 1){
                hashMap.put(k,i);
                k++;
            }
            
        }

        System.out.println("\nQuestion 4:");
        System.out.print("Enter an integer to add to HashMap: ");
        int add2 = input.nextInt();
        System.out.println("Content before change: " + hashMap.values());
        hashExercise.addAndSort(hashMap, add2);
        System.out.println("Content after change: " + hashMap.values());

        //Question 5
        System.out.println("\nQuestion 5:");
        System.out.print("Enter the 2 index you wish to swap: ");
        int key1 = input.nextInt();
        int key2 = input.nextInt();
        hashExercise.swapValues(hashMap, key1,key2);
        System.out.println("Swapping Index 1 and 5: " + hashMap.values());

        //Question 6
       

        System.out.println("\nQuestion 6:");
        HashMap<Integer,Integer> hashRandom = new HashMap<Integer,Integer>();
     
        for(int i = 0; i<500; i++){
            int randomValue = (int)(Math.random()*(max-min+1)+min);
            hashRandom.put(i,randomValue);
        }
        
        System.out.print("Enter the number you wish to find between 1000 to 9999: ");
        int find2 = input.nextInt();

        System.out.println("Contents: "+hashRandom);
        System.out.println(hashExercise.findValue(hashRandom, find2));

        input.close();
    }   
    


}
