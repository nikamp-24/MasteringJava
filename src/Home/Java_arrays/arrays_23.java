package Home.Java_arrays;

public class arrays_23 {
    public static void main(String[] args) {
//        Find majority element
//        If an element occurs strictly more than half of the total elements, it is called the majority element.

  int arr[] = {2, 3, 3, 3, 4, 5, 3, 3, 3 , 6};

  int candidate = arr[0];
  int count =1 ;
  for (int i =1; i<arr.length; i++){
      if (arr[i] == candidate){
          count++;
      }else {
          count--;
      }
      if (count==0){
          candidate =arr[i];
          count =1;
      }
  }

        int freq = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                freq++;
            }
        }

  if (freq > arr.length/2){
      System.out.println("The majority element is : "+candidate);
  } else {
      System.out.println("No majority element");
  }

    }
}
