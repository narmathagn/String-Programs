import java.util.*;
public class StringNumbers{
	public static void main(String args[]){
		String s="3,2,6,5,1,4,8,9";
		String s1[]=s.split(",");
		String s2="";
		int n1=0,k=0,j=0;
		for(int i=0;i<s1.length;i++)
		{
			j=i;
			if(s1[j].equals("5"))
			{
				while(!s1[j].equals("8"))
				{
					s2=s2+s1[j];
					j++;
				}	
				s2=s2+s1[j];
				break;
			}
			else
			{
			    int a=Integer.parseInt(s1[i]);
			    n1=n1+a;
			}
		}
		//System.out.println(j);
		for(int i=j+1;i<s1.length;i++)
		{
		     int a=Integer.parseInt(s1[i]);
		     n1=n1+a;
		}
		//System.out.println(n1);
		int n2=Integer.parseInt(s2);
		int output=n1+n2;
		System.out.println(output);
	}
}