

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                int one=0;
                int minusOne=0;
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                    if (arr[i]==1){
                        one++;
                    }
                    else minusOne++;
                }
                if (minusOne==0 || one==0){
                    System.out.println("No");
                }
                else if ((one == minusOne) || ((Math.abs(one-minusOne))==1) || (((Math.abs(one-minusOne))==2) &&
                        (one%2 == 0 && minusOne%2==0))){
                    System.out.println("Yes");
                }
                else System.out.println("No");
            }
        }catch (Exception e){
            return;
        }
    }
}
