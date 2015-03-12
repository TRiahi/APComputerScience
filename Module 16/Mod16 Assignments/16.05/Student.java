public class Student{
    
    String name;
    int qz1, qz2, qz3, qz4, qz5;
    
    Student(String n, int q1, int q2, int q3, int q4, int q5){
        
        name = n;
        qz1 = q1;
        qz2 = q2;
        qz3 = q3;
        qz4 = q4;
        qz5 = q5;
        
    }
    
    public int getQuiz(int qNumber){
        
        return qNumber;
        
    }
    
}
