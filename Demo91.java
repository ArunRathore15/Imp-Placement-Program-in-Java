//FIND LARGEST ELEMENT IN AN ARRAY
/*class Demo91{
	public static void main(String ar[]){
		int x[]={2,5,17,9,4};
		int m=x[0];
		for(int i=0;i<x.length;i++){
			if(m<x[i])
				m=x[i];}
		System.out.println("MAXIMUM IS="+m);}
}*/

//FIND SMALEST ELEMENT IN AN ARRAY
/*class Demo91{
	public static void main(String ar[]){
		int x[]={2,5,17,9,4};
		int m=x[0];
		for(int i=0;i<x.length;i++){
			if(m>x[i])
				m=x[i];}
		System.out.println("MINIMUM IS="+m);}
}*/

//FIND THE SMALLEST AND THE LARGEST NUMBER IN AN ARRAY
/*class Demo91{
	public static void main(String ar[]){
		int x[]={22,5,17,9,4};
		int m=x[0];
		int m1=x[0];
		for(int i=0;i<x.length;i++){
			if(m<x[i])
				m=x[i];
			if(m1>x[i])
				m1=x[i];}
		System.out.println("MAXIMUM IS="+m);
		System.out.println("MINIMUM IS="+m1);}
}*/

//FIND THE SECOND SMALLEST ELEMENT IN AN ARRAY
/*class Demo91{
	public static void main(String ar[]){
		int x[]={22,50,17,19,41};
		int m=x[0];
		int m1=Integer.MAX_VALUE;
		for(int i=0;i<x.length;i++){
			if(m>x[i])
				m=x[i];
			if(x[i]!=m & m1>x[i])
				m1=x[i];}
		System.out.println("The Smallest is="+m);
		System.out.println("The Second Smallest is="+m1);}
}*/

//CALCULATE THE SUM OF AN ARRAY
/*class Demo91{
	public static void main(String ar[]){
		int x[]={2,5,17,9,4};
		int m=0;
		for(int i=0;i<x.length;i++){
		m=m+x[i];}
		System.out.println("SUM IS="+m);}
}*/

//REVERSE THE ARRAY
/*class Demo91{
	public static void main(String ar[]){
		int x[]={2,5,17,9,4};
		int s=0;
		int e=x.length-1;
		while(s<e)
		{
			int t=x[s];
		x[s]=x[e];
		x[e]=t;
		s++;
		e--;
	}
	for(int i=0;i<x.length;i++)
	{
		System.out.print(x[i]+" ");
	}
}
}*/

//Sort An array in ascending order
/*class Demo91{
	public static void main(String ar[]){
		int x[]={2,4,1,6,3,8,5,9};
		int n=x.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(x[j]>x[j+1]){
					int t=x[j];
					x[j]=x[j+1];
					x[j+1]=t;}
		}
		}
		for(int k=0;k<n;k++){
			System.out.print(x[k]+" ");	}
	}
}*/

//SORT AN ARRAY IN DECENDING ORDER
/*class Demo91
{
	public static void main(String ar[]){
		int x[]={2,4,1,6,3,8,5,9};
		int n=x.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++){
				if(x[j]<x[j+1])
				{
					int t=x[j];
					x[j]=x[j+1];
					x[j+1]=t;
				}
			}
		}
		for(int k=0;k<n;k++){
			System.out.print(x[k]+" ");
			
		}
	}
}*/

//SORT FIRST HALF IN ASCENDING ORDER AND SECOND HALF IN DECENDING ORDER
/*class Demo91{
	public static void main(String ar[]){
		int x[]={2,4,12,6,3,8,5,9,11,2};
			int n=x.length;
			int k=n/2;
		for(int i=0;i<=k;i++){
			for(int j=0;j<k-i-1;j++){
				if(x[j]>x[j+1]){
					int t=x[j];
					x[j]=x[j+1];
					x[j+1]=t;
				}
			}
		}
		for(int m=k;m<n-1;m++)
		{
			for(int p=k;p<n-m-1+k;p++){
				if(x[p]<x[p+1])
				{
					int s=x[p];
					x[p]=x[p+1];
					x[p+1]=s;
				}
			}
		}
		for(int l=0;l<n;l++)
		{
			System.out.print(x[l]+" ");
		}
	}
}*/

//FIND THE FREQUENCY OF AN ELEMENT IN AN ARRAY
/*class Demo91{
	public static void main(String ar[]){
		int x[]={1,2,2,3,3,3,4,5,5,6,6,6,7,7};
		for(int i=0;i<x.length;i++){
			if(x[i]==-1)
				continue;
			int c=1;
			for(int j=i+1;j<x.length;j++){
				if(x[i]==x[j]){
					c++;
					x[j]=-1;}
			}
System.out.println("the value\t"+x[i]+ "is appear total\t" +c+ "\ttimes");}
}}*/

//SORT ELEMENT OF AN ARRAY ACCORDING TO THEIR FREQUENCY
/*class Demo91{
	public static void main(String ar[]){
		int x[]={1,4,4,4,5,5,6,9,9,9,9,8};
		for(int i=0;i<x.length;i++){
			int c=1;
			if(x[i]==1)
				continue;
			for(int j=i+1;j<x.length;j++){
			if(x[i]==x[j]){
				c++;
				x[j]=1;}
			}
System.out.println("the value\t"+x[i]+ "is appear total\t" +c+ "\ttimes");}
	}
}
*/