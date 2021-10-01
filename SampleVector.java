import java.util.*;  
    public class SampleVector{  
    public static void main(String args[]){  
        Vector<String> v=new Vector<String>();  
        v.add("Akarsh");  
        v.add("Sahal");  
        v.add("Akhil");  
        v.add("Deepak");  
        Iterator<String> itr=v.iterator();  
        
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
    }  
}  