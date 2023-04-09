package leetcode;

public class Question_11_Container_with_most_water {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
        System.out.println(maxAreaWithForLoop(height));
    }

    public static int maxArea(int[] walls) {
        int maxArea =0;
        int firstWall = 0;
        int lastWall = walls.length-1;

        while(firstWall<lastWall){
            int twoWallDiff = lastWall-firstWall;
            int area = twoWallDiff*Math.min(walls[firstWall],walls[lastWall]);
            //maxArea = Math.max(area,maxArea);
            if(maxArea<area){
                maxArea=area;
            }
            if(walls[firstWall]<=walls[lastWall]){
                firstWall++;
            }
            else{
                lastWall--;
            }
        }

        return maxArea;
    }

    public static int maxAreaWithForLoop(int[] heightList) {
        int maxArea = 0;
        for(int i =0;i<heightList.length;i++){
            // area = height * width
            int firstWall = heightList[i]; // first take height of first wall.
            // now for each with calcuate area and find max.
            for(int j=i+1;j<heightList.length;j++){
                int secondWall = heightList[j];
                int area = (firstWall<secondWall?firstWall:secondWall)*(j-i);  // small wall * difference between wall.
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}
