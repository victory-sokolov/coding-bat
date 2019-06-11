package Misc;

/*
* LCM - Leas Common Multiple
* The LCM of two integers is the smallest positive integer that is perfectly divisible by both the numbers (without a remainder).
* */

public class LeasCommonMultiple {

    public static int LCM(int a, int b) {

        int n = 1000;

        if(a > n || b > n) {
           throw new IllegalArgumentException ("Number should be less or equal to " + n);
        }

        // Greatest number of two
        int lcm = (a > b) ? a : b;

        for(int i = 1; i <= n; i++) {
            if(lcm % a == 0 && lcm % b == 0)
                return lcm;
            lcm++;
        }

        return 0;
    }
}
