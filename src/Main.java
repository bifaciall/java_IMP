public class Main {
    public static void main(String[] args) {
        System.out.println(modwithbigexponents(5,11,7));
    }
    private static long modwithbigexponents(int b, int e, int m) {
        long result = 1;
        int remainder = b%m;// Calculate b % m, initially set as the remainder
        while(e != 0){
            if(e % 2 == 1){ //for algorithm goo brrrrr
                // If e is odd, multiply the result by remainder and take modulo m
                result = (result*remainder)%m;
            }
            e = (e - e % 2) / 2; //halfes exponent
            remainder = (remainder * remainder) % m; // Square the remainder, ensures it remains within range [0, m-1]
            System.out.printf("result %d, remainder %d, exponent %d\n", result, remainder, e);
        }
        return result %m; //return final result mod m, so that result < m-1
    }
}
