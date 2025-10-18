import java.util.Arrays;

public class MULTIPICATION238LEETCODEEXCEPTarr {
    public static void main(String[] args) {
        int n = nums.length;
        int[] ans = new int[n];

        // Step 1: Left products
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: Right product and final multiplication
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }

        return ans;
    }
}

