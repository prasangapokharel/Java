class MinBalanceException extends Exception {
    public MinBalanceException() {
        System.out.println("Balance Is Low");
    }
}

public class UserDefinedExample {
    public static void main(String[] args) {
        try {
            int[] acc = {100, 101, 102, 103, 104, 105}; 
            double[] balance = {900, 2000, 1500, 1560, 1765.50};
            for (int i = 0; i < 5; i++) {
                System.out.println("Account No: " + acc[i] + " Balance: " + balance[i]);
                if (balance[i] < 1086) {
                    throw new MinBalanceException(); }
            }
        } catch (MinBalanceException e) {
            System.out.println("Exception caught");
        }
    }
}
