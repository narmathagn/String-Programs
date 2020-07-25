import java.util.*;
public class StringRotation{
	public static void main(String args[]){
		String s="rhdt:246";
		String[] s1=s.split(":");
		String ans="";
		char[] ch=s1[1].toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
		    	int a=Character.getNumericValue(ch[i]);
		    	int c=a*a;
			sum=sum+c;
		}
		if(sum%2==0)
		{
			ans=s1[0].substring(s1[0].length()-1)+s1[0].substring(0,s1[0].length()-1);
		}
		else
		{
			ans=s1[0].substring(2)+s1[0].substring(0,2);
		}
		System.out.println(ans);
	}
}
