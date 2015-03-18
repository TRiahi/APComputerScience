public class Item{
    
    String itemID,itemName,inStore;
    int price;
    
    Item(String id, String in, String is, int p){
        
        itemID = id;
        itemName = in;
        inStore = is;
        price = p;
        
    }
    
    public static void toString(String itemID,String itemName,String inStore,int price){
         
        System.out.println("itemID: " + itemID + " itemName: " + itemName + " inStore: " + " Price: " + price);
       
    }
    
}
