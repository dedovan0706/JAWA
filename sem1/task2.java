/*Дан массив двоичных чисел, например [1,1,0,1,1,1], 
вывести максимальное количество подряд идущих 1.*/

public class task2 {
    public static void main(String[] args) {
        int arr[] = new int[] {1,1,0,1,0,1};
        int temp = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 ){
               temp ++;
    }
        else {
            if (temp > max) {
               max = temp;
    
              }
                   temp = 0;
    }
    
    }
            if (temp > max) {
                    max = temp;
    }
                System.out.println(max);
    }
    }