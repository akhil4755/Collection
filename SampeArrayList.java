import java.util.*;  
class SampleArrayList{  
public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
    list.add("Akhil");//Adding object in arraylist  
    list.add("Akarsh");  
    list.add("Deepak");  
    list.add("Sahal");  
    //Traversing list through Iterator  
    Iterator itr=list.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    } 
     
    }  
}  