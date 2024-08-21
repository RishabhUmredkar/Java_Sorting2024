package Selection_Sort;

public class Selection_sort_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a [] = {"Aman","Mohit", "Rishabh", "Dishant"};
		int min ;
		String temp="";
		for(int i=0; i<a.length; i++)
		{
			min = i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j].compareTo(a[min])<0)
				{
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
