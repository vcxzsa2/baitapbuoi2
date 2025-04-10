package buoi2;

public class bai1 {
        public static void subsets(int a[], boolean check[], int index){
            if (index == a.length){
                for (int i = 0; i < a.length; i++){
                    if(check[i]){
                        System.out.print(a[i] + " ");
                    }
                }
                System.out.println("");
                return;
            }
            check[index] = true;
            subsets(a, check, index + 1);

            check[index] = false;
            subsets(a, check, index + 1);
        }
        public static void main(String[] args) {
            int a[] = {1, 2, 3};
            boolean check[] = new boolean[a.length];
            bai1.subsets(a, check, 0);
        }
    }
