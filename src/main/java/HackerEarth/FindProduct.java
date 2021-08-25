package HackerEarth;

import java.util.Scanner;

public class FindProduct {

        public static void main(String args[] ) throws Exception {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();

            int[] numArray = new int[N];
            for(int i=0; i<N; i++){
                numArray[i] = s.nextInt();
            }

            long modulo = 100000007;
            long answer = 1;

            for(int i=0; i<N; i++){
                answer = (answer*numArray[i]) % modulo;
            }

            System.out.print(answer);
        }
}
