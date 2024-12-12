class Solution {
    public int romanToInt(String s) {
        int value = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'M':
                    value += 1000;
                    break;
                case 'D':
                    value += 500;
                    break;
                case 'C':
                    if ((i + 1) <= n - 1) {
                        if (s.charAt(i + 1) == 'D') {
                            value += 400;
                            i++;
                        } else if (s.charAt(i + 1) == 'M') {
                            value += 900;
                            i++;
                        } else {
                            value += 100;
                        }
                    } else {
                        value += 100;
                    }
                    break;
                case 'L':
                    value += 50;
                    break;
                case 'X':
                    if ((i + 1) <= n - 1) {
                        if (s.charAt(i + 1) == 'L') {
                            value += 40;
                            i++;
                        } else if (s.charAt(i + 1) == 'C') {
                            value += 90;
                            i++;
                        } else {
                            value += 10;
                        }
                    } else {
                        value += 10;
                    }
                    break;
                case 'V':
                    value += 5;
                    break;
                case 'I':
                    if ((i + 1) <= n - 1) {
                        if (s.charAt(i + 1) == 'V') {
                            value += 4;
                            i++;
                        } else if (s.charAt(i + 1) == 'X') {
                            value += 9;
                            i++;
                        } else {
                            value += 1;
                        }
                    } else {
                        value += 1;
                    }
                    break;
                default:
                    value += 0;
            }
        }
        return value;
    }
}
