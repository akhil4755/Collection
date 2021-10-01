import java.util.*;  
class SampleLinkedList {
    public static void main(String args[]){  
        LinkedList<String> al=new LinkedList<String>();  
        al.add("Akku");  
        al.add("vava");  
        al.add("kannan");  
        al.add("Ajay");  
        Iterator<String> itr=al.iterator();  
            
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  

        }  
    }  
}
