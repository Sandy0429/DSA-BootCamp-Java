class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> haveMaxCandy = new ArrayList<>();
        int maxValue = max(candies);
        for(int i=0 ; i< candies.length ; i++){
            if((candies[i]+extraCandies) >= maxValue){
                haveMaxCandy.add(true);
            }
            else{
                haveMaxCandy.add(false);
            }
        }     
        return haveMaxCandy;
    }
    public static int max(int [] arr){
        int mx = arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
}
