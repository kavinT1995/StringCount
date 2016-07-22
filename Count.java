# StringCount
public class Count {

	
	public static void main(String[] args) {
		
		String S="aabbbccccxx";
		char[] array = S.toCharArray();
				int count = 1;
				int max = 0;
				char maxChar = 0,ch=0;;
				for(int i=1; i<array.length; i++){
				    if(array[i]==array[i-1])
				    {
				        count++;
				        ch=array[i-1];
				    } else 
				    {
				        if(count>max){ 
				            max=count;
				           maxChar=ch;
				        }
				        count = 1; 
				    }
				}
				if(count>max){
				    max=count; 
				    maxChar=ch;
				}
				System.out.println(max+" " +maxChar); 

}
}
