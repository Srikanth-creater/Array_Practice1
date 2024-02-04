import java.util.*;
public class anagrams {

	public static void main(String[] args) {
		String s1="aab",s2="baa";int k=18;
		// TODO Auto-generated method stub
	      char[] a1 = s1.toCharArray();
	      char[] a2 = s2.toCharArray();

	      // sort the char array
	    int c=0;
	      Arrays.sort(a1);
	      Arrays.sort(a2);
	      System.out.println(Arrays.equals(a1, a2));
	      System.out.println(Arrays.toString(a1));
	      System.out.println(Arrays.toString(a2));
	      for(int i=0;i<a1.length;i++){
	              if(a1[i]!=a2[i]){
	                  c=c+1;
	              
	          }
	      }
	      if(c==k){
	          System.out.println('1');
	      }
	      else{
	    	  System.out.println('0');
	      }
	}

}
