import java.util.Arrays;

class 3.28.19 {
  
  public static void main(String[] args) {
    int[] a = {1, 2, 0};
    System.out.println(firstNum(a));
    
  }
  
  public static int firstNum(int[] a) {
  		Arrays.sort(a);
    	int compare = a[0];
    	for(int i = 1; i < a.length; i++) {
          if (compare > 0 && a[i] - 1 != compare){
            return compare + 1;
          }
          compare = a[i];
        }
    	return a[a.length - 1] + 1;
    
  }
  
}
