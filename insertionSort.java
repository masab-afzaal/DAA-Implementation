
    public class insertionSort{
        public static void insertionSort(int array[]) {
            for(int i=1; i<array.length; i++) {
                int curr = array[i];
                int prev = i-1;
    
                while(prev >=0 && array[prev] > curr) {
                    array[prev+1] = array[prev];
                    prev--;
                }
                array[prev+1] = curr;
    
            }
        }
    
        public static void main(String args []){
            
            int array[] = {6,1,2,1,5,3,1,5,2,6,};
            
           insertionSort(array);
            
            for(int i=0; i<array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    