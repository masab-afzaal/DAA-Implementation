

    public class selectionSort{
        public static void selectionSort(int array[]) {
            for(int i=0; i<array.length-1; i++) {
                int minPos = i;
                for(int j=i+1; j<array.length; j++) {
                    if(array[minPos] > array[j]) {
                        minPos = j;
                    }
                }
                int temp = array[minPos];
                array[minPos] = array[i];
                array[i] = temp;
            }
        }
    
        public static void main(String args []){
            
            int array[] = {6,1,2,1,5,3,1,5,2,6,};
            
           selectionSort(array);
            
            for(int i=0; i<array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    