import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int num:arr){
		    map.put(num,map.getOrDefault(num,0)+1);
		}
		boolean found=false;
		for(int num:arr){
		    if(map.get(num)==1){
		        System.out.print(num);
		        found=true;
		        break;
		    }
		}
		if(!found){
		  System.out.print("0");}
	}
}
