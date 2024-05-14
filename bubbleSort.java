


    public class bubbleSort{
        public static void bubbleSort(int array[]) {
    
            for(int i=0; i<array.length-1; i++) {
                
                for(int j=0; j<array.length-1-i; j++) {
    
                    if(array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    
        public static void main(String args []){
            
            int array[] = {6,1,2,1,5,3,1,5,2,6,};
            
           bubbleSort(array);
            
            for(int i=0; i<array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    