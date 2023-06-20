class Solution {
    public String reverseVowels(String s) {
        int l = 0, r = s.length() - 1;
        char[] ch = s.toCharArray();

        while (l < r) {
            if ((ch[l] == 97 || ch[l] == 101 || ch[l] == 105 || ch[l] == 111 || ch[l] == 117
            || ch[l] == 65 || ch[l] == 69 || ch[l] == 73 || ch[l] == 79 || ch[l] == 85) &&
            (ch[r] == 97 || ch[r] == 101 || ch[r] == 105 || ch[r] == 111 || ch[r] == 117
            || ch[r] == 65 || ch[r] == 69 || ch[r] == 73 || ch[r] == 79 || ch[r] == 85)) {
                char tmp = ch[r];
                ch[r] = ch[l];
                ch[l] = tmp;
                l++;
                r--;
            } else if (ch[l] == 97 || ch[l] == 101 || ch[l] == 105 || ch[l] == 111 || ch[l] == 117
            || ch[l] == 65 || ch[l] == 69 || ch[l] == 73 || ch[l] == 79 || ch[l] == 85) {
                r--;
            } else if (ch[r] == 97 || ch[r] == 101 || ch[r] == 105 || ch[r] == 111 || ch[r] == 117
            || ch[r] == 65 || ch[r] == 69 || ch[r] == 73 || ch[r] == 79 || ch[r] == 85) {
                l++;
            } else {
                l++;
                r--;
            }
        }

        return new String(ch);
    }
}
