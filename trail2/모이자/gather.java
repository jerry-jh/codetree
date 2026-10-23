import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        // 변수 선언하고 입력받기
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        // 각 i번째 집으로 모였을 때 합
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += a[j]*Math.abs(i-j);
            }
            // 가능한 거리 합 중 최솟값
            min = Math.min(min, sum);
        }
        System.out.print(min);
        // Please write your code here.
    }
}