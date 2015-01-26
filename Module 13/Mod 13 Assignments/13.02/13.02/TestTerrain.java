/**
 * Testing class for all the terrain.
 * 
 * @author David Johnson
 * @version 1/23/15
 */
public class TestTerrain{
    
     public static void main(String[] args){
         
         int length = 500, width = 500;
         
         Terrain varT = new Terrain(length, width);
         Mountains varM = new Mountains(length, width);
         WinterMountains varWM = new WinterMountains(length, width);
         Forest varF = new Forest(length, width);
         
         int totalMountain = varM.getMountains();
         int totalWinterMountain = varWM.getWinterMountains();
         int totalForest = varF.getForest();
         
         System.out.println("Mountains: " + totalMountain);
         System.out.println("Winter Mountains: " + totalWinterMountain);
         System.out.println("Trees: " + totalForest);
         
     }
    
}
