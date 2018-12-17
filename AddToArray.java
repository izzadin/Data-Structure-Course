class AddToArray{
static  int[] array;
static int counter;
public static void main(String args[]){
array =new int[4];
counter=0;
add(500);
add(450);
add(300);
 add(320);
 print(array);
 add(600);
 print(array);
 remove(0);
  print(array);
	}
public static void add(int score){
if(counter < array.length || score>array[array.length-1]){
if(counter < array.length) // no drop
counter++;                     //increase the number of scores
int j = counter-1;
while(j>0 && array[j-1] < score ){
array[j] = array[j-1];       //shift the score < than the new one to the right
j--;                                 //go to the next
}
array[j]=score;               // after done add the new score
}
}
public static int remove(int index){
   if(index<0 || index > array.length){
	   // we have to do something here
   }
int temp = array[index];                 // save the score to be removed
for(int i = index; i<counter-1;i++)  // count up from index (not down)
array[i]=array[i+1];                        // shift scores to the left
array[counter-1] = 0;                      // delete the old last score
counter--;                                      // decrease the number of scores
return temp;                                  // return the score
}
public static void print(int[] array)
{
	System.out.print("Scores :[");
	for(int i=0;i<array.length;i++)
System.out.print(array[i]+",");
System.out.println("]");
}
}