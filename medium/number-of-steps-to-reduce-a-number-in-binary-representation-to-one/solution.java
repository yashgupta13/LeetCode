class Solution {
    public int numSteps(String s) {
        int count=0;
        while(s.length()>1)
        {
            if(s.charAt(s.length()-1)=='0')
            {
                count++;
                s=s.substring(0,s.length()-1);
            }else{
                s=addOne(s);
                count++;
            }
        }
        return count;
    }
    public static String addOne(String binary) {
        StringBuilder sb = new StringBuilder(binary);
        int carry = 1;  // we are adding 1

        for (int i = sb.length() - 1; i >= 0; i--) {

            if (sb.charAt(i) == '1' && carry == 1) {
                sb.setCharAt(i, '0');  // 1 + 1 = 0 carry 1
            } 
            else if (sb.charAt(i) == '0' && carry == 1) {
                sb.setCharAt(i, '1');  // 0 + 1 = 1 carry 0
                carry = 0;
                break; // no more carry, stop early
            }
        }

        // If carry is still 1, prepend '1'
        if (carry == 1) {
            sb.insert(0, '1');
        }

        return sb.toString();
    }
}