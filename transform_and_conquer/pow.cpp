// binary exponentation
// 50. Pow(x, n) (medium)
class Solution {
public:
    double myPow(double x, int n) {
        double res = 1.0;
        long long nn = n;
        if (x==1.0) return 1.0;
        if (nn < 0)
            nn *= -1;

        while (nn) {
            if (nn % 2) {
                res *= x;
                nn--;
            } else {
                x *= x;
                nn /= 2;
            }
        }
        if (n<0) return 1.0/res;
        return res;
    }
};