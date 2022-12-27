class Solution {
    public int largestAltitude(int[] gain) {
        int [] altitudes = new int[gain.length+1];
        // altitudes[0] = 0;

        int max =0;
        for(int i =1; i<altitudes.length; i++){
            altitudes[i]= altitudes[i-1]+gain[i-1];
            max = Math.max(max,altitudes[i]);
        }        
        // Arrays.sort(altitudes); // this will take more memory
        // return altitudes[altitudes.length-1];

        return max;
    }
    
}
