class Solution {
    public boolean checkIfPangram(String sentence) {

        if(sentence.length()<26){
            return false;
        }

        Integer[] alphabet = new Integer[26];
        Arrays.fill(alphabet,-1);
        for(int i=0; i<sentence.length(); i++){

            int ch = (int)(sentence.charAt(i) - 'a');
            alphabet[ch] = 1;
        }
        
        // System.out.println(Arrays.toString(alphabet));
        int chk =-1;
        // System.out.println(Arrays.asList(alphabet).contains(chk));

        if(Arrays.asList(alphabet).contains(chk)){
            return false;
        }

        return true;
    }
}
