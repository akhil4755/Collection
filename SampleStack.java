import java.util.*;  

public class SampleStack{  
    public static void main(String args[]){  
        Stack<String> stack = new Stack<String>();  
        stack.push("Afin");  
        stack.push("Kevin");  
        stack.push("Naveen");  
        stack.push("Fahad");
        stack.pop();

        Iterator<String> itr=stack.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
    }  
}  