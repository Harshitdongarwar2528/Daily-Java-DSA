package NumberSystem;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 28;
        boolean flag = false; // Used to skip leading zeros

        // Loop from 32 down to 0 to check each bit
        for (int i = 32; i >= 0; i--) {
            // Shift n right by i bits and check the least significant bit
            if (((n >> i) & 1) == 1) {
                flag = true; // First '1' found
                System.out.print("1");
            } else {
                // Only print 0 if we've already found the first 1
                if (flag)
                    System.out.print("0");
            }
        }
    }
}

