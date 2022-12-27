class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int [][] answer = new int[image.length][image.length];

        for(int i=0;i<image.length;i++){
            for(int j=0; j<image.length/2; j++){
                // answer[i][(image.length-1)-j] = image[i][j];
                int temp = image[i][j];
                image[i][j] = image[i][image.length-1-j] ;
                image[i][image.length-1-j]  = temp;
            }

             for(int j=0; j<image.length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else if(image[i][j] == 1){
                    image[i][j] = 0;
                }
            }

        }

        // for(int i=0;i<image.length;i++){
        //     for(int j=0; j<image.length; j++){
        //         if(answer[i][j] == 0){
        //             answer[i][j] = 1;
        //         }
        //         else if(answer[i][j] == 1){
        //             answer[i][j] = 0;
        //         }
        //     }
        // }        
        // return answer;

        return image;
    }
}
