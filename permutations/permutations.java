import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String arr[]={"a","b","c"};
		ArrayList<String> list=new ArrayList<>();
		per(arr,list,0);
	}
	
	public static void per(String arr[],ArrayList<String> list,int index){
	    
	    if(list.size()>=arr.length){
	        System.out.println(list);
	        return;
	    }
	    
	    for(int i=0;i<arr.length;i++){
	        list.add(arr[i]);
	        per(arr,list,i);
	        list.remove(list.size()-1);
	    }
	    
	}
}
