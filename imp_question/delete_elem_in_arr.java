public class delete_elem_in_arr {
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,6,6};
        int user_input = 1;
        int del_pos =user_input - 1;
        for (int i = del_pos; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println("---------------------------");
        System.out.println("  After element deletion");
        System.out.println("---------------------------");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print("["+arr[i]+"]"+ "  ");
        }
        System.out.println();
        System.out.println("---------------------------");
    }
}
