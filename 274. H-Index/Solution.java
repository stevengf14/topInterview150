class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;

        for (int i = 0; i < n; i++) {
            int aux = n - i;
            if (citations[i] >= aux) {
                h = aux;
                break;
            }
        }
        return h;
    }
}
