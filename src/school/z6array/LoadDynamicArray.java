/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pole;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Walter Wolf
 */
public class LoadDynamicArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zpusob 1:");
        int[] pluh = loadDinArray();
        //output2
        System.out.print("Array 1 is ");
        System.out.print("[");
        for(int i = 0; i<pluh.length; i++){
            if(i==(pluh.length-1)){
            System.out.print(pluh[i]);
            }
            else{
            System.out.print(pluh[i]+", ");
            }
            
        }
        System.out.print("]");
        
        
        
        System.out.println();
        
        
        
        System.out.println("Zpusob 2:");
        int[] pluh2 = loadDinArrayL();
        //output2
        System.out.print("Array 2 is ");
        System.out.print("[");
        for(int i = 0; i<pluh2.length; i++){
            if(i==(pluh2.length-1)){
            System.out.print(pluh2[i]);
            }
            else{
            System.out.print(pluh2[i]+", ");
            }  
        }
        System.out.print("]");
    }
    
    
    public static int[] loadDinArray() {
        
        int[] numbers = new int[1];
        int count = 0;

        System.out.println("Enter numbers (negative number to stop):");
        while (true) {
            int input = sc.nextInt();
            if (input < 0) {
                break;
            }
            if (count == numbers.length) {
                int[] newNumbers = new int[numbers.length + 1];
                System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
                numbers = newNumbers;
            }

            numbers[count] = input;
            count++;
        }

        int[] resultArray = new int[count];
        System.arraycopy(numbers, 0, resultArray, 0, count);

        return resultArray;
    }
    
    
    public static int[] loadDinArrayL(){
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers (negative number to stop):");
        
        while (true){
            int input = sc.nextInt();
            if (input < 0){
                break;
            }
            numbers.add(input);
        }
        int[] result = new int[numbers.size()];
        for (int i=0; i< numbers.size(); i++){
            result[i] = numbers.get(i);
        }
        return result;
    }
    
}
