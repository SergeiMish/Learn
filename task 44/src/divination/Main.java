public class Main {
        public static void main(String[] args) {
                public boolean pair13(int[] nums) {
                        int count = 0;
                        for (int i=0; i<(nums.length-1); i++) {
                                if (nums[i]==13 && nums[i+1]==13) return true;
                        }
                        return false;  // if we get here, there was not a pair of 13's

                        // note: the i loop stops one short of the full length,
                        // so the code can refer to nums[i+1] in the loop.
                }
                This new6() method makes and returns a new int array of size N that is filled with the value 6.

                public int[] new6(int n) {
                        int[] result = new int[n];
                        for (int i=0; i<result.length; i++) {
                                result[i] = 6;
                        }
                        return result;
                }}}