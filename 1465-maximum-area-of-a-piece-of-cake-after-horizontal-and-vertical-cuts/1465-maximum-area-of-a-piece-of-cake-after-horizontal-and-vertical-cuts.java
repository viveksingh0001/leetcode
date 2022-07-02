class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
    Arrays.sort(verticalCuts);
    int maxX = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
    int maxY = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
    for (int i = 1; i < horizontalCuts.length; ++i)
        maxX = Math.max(maxX, horizontalCuts[i] - horizontalCuts[i - 1]);
    for (int i = 1; i < verticalCuts.length; ++i)
        maxY = Math.max(maxY, verticalCuts[i] - verticalCuts[i-1]);
    return (int)((long)maxX * maxY % 1000000007);
    }
}