public class CaesarShiftEncryption{
    
    String messageEncryptDecrypt = "";
    
    CaesarShiftEncryption(String message){
        
        messageEncryptDecrypt = message;
        
    }
    
    public String encrypt(){
    
        String [] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","N","M","O"
        ,"P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        int i = 0, f = 0;
        int messageLength = messageEncryptDecrypt.length();
        messageEncryptDecrypt = messageEncryptDecrypt.toUpperCase();
        
        String encryptedMessage = "";
        
        while (i < messageLength){
            
            f = 0;
            
            while (f < 25){
            
                if (messageEncryptDecrypt.substring(i, i + 1).equals(letters[f])){
                    
                    encryptedMessage = encryptedMessage + "" + f;
                    
                }
                
                f++;
                
            }
            
            i++;
            
        }
        
        return encryptedMessage;
        
    }
    
    public String decrypt(){
        
         String [] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","N","M","O"
        ,"P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        String letter = "";
        
        int i = 0, intLetter = 0;
        int messageLength = messageEncryptDecrypt.length();
        messageEncryptDecrypt = messageEncryptDecrypt.toUpperCase();
        
        String decryptedMessage = "";
        
        while (i < messageLength){
            
            letter = messageEncryptDecrypt.substring(i, i + 1);
            intLetter = Integer.parseInt(letter);
            decryptedMessage = decryptedMessage + "" + letters[intLetter];
            
            i++;
            
        }
        
        return decryptedMessage;
        
    }
    
}
