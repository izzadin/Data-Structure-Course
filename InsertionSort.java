class InsertionSort{

public static void main(String args[]){
int[] array= {1,5,4,2,3};
print(array);
print(sort(array));
}
public static int[] sort(int[] array){
int i,j,key,temp;  // i to loop through the whole array, j to loop from key to the left, temp for swap

for(i=1;i<array.length;i++){     // loop through the whole array
	key = array[i];                     // the individual value to be sorted
	j=i-1;                                  // sorting the next left element from the key
	while(j>=0 && key<array[j]){   // moving to the nex element
		temp=array[j];                   // do sawp
		array[j]=array[j+1];
		array[j+1]=temp;
		j--;
	}
}
	return array;
}
public static void print(int[] array)
{
	System.out.print("Array :[");
	for(int i=0;i<array.length;i++)
System.out.print(array[i]+",");
System.out.println("]");
}
}
