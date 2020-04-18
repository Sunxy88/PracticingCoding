package Algorithm.Solutions.LeetCode;

public class LeetCode11 {
    public int maxArea(int[] height) {
        if (height == null || height.length <= 1)
            return 0;
        int area = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            area = Math.max(area, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return area;
    }
}
