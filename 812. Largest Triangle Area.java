class Solution {
    /**
     * Calculates the largest triangle area that can be formed by any three points
     * from the given array of points.
     *
     * @param points An array of points, where points[i] = [xi, yi].
     * @return The area of the largest triangle.
     */
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;

        // Iterate through all possible combinations of three distinct points (i, j, k)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Get the coordinates of the three points
                    int x1 = points[i][0];
                    int y1 = points[i][1];
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    int x3 = points[k][0];
                    int y3 = points[k][1];

                    // Calculate the area using the Shoelace/Determinant Formula
                    // Area = 0.5 * |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
                    double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

                    // Update the maximum area found so far
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}
