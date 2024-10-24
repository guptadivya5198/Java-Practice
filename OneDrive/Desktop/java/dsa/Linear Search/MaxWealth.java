
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7}, {7,1,3},{1,9,5}};

        int fans = maximumWealth(accounts);
        System.out.println("The maximum wealth is: " + fans);
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
