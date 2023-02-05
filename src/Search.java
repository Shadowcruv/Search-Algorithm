public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Search search = new Search();
        int start = 0;
        int end = arr.length - 1;
        int target = 9;
        search.binarySearch(arr,start,end,target);

    }

    public Search(){

    }
    public boolean binarySearch(int[] a, int s, int e, int t){
        if(s > e){
            System.out.println("False");
            return false;}

      int midIndex = (s + e) / 2;
      /* if(s == e ){
            System.out.println("number not found");
            System.exit(1);
          }
*/
       if (a[midIndex]== t) {
             System.out.println("true");
             return true;
         }

         /*if(s > e){
             System.out.println("number not found");
             System.exit(1);
         }*/
         if(a[midIndex]> t){
             System.out.println("is bvgrsrdy g vfxxtc gcfxrxc  gcrrxcghvct ");
             return binarySearch(a, s, midIndex-1, t);
         }else {
             System.out.println("is greater");
             return binarySearch(a,midIndex +1,e,t);
         }
    }
 }

