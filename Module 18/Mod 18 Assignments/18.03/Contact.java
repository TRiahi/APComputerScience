public class Contact{
    
    String name, relation, bday, phone, email;
    
    Contact(String n, String r, String b, String p, String e){
       
        name = n;
        relation = r;
        bday = b;
        phone = p;
        email = e;
        
    }
    
    public String toString(String name, String relation, String bday, String phone, String email){
        
        String fullString = name + " " + relation + " " + bday + " " + phone + " " + email;
        
        return fullString;
    
    }
    
}
