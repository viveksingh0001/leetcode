class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        sortArray(boxTypes);
        int count = 0;
        for(int i=0; i<boxTypes.length; i++){
            if(boxTypes[i][0]<=truckSize){
                count += boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            } else{
                count+=truckSize*boxTypes[i][1];
                break;
            }
        }
        return count;
    }
    
    public static  void sortArray (int[][] array){
        Arrays.sort(array, new Comparator<int[]>() {
          @Override              
          public int compare(final int[] entry1, 
                             final int[] entry2) {
            if (entry1[1] > entry2[1])
                return -1;
            else
                return 1;
          }
        }); 
    }
}