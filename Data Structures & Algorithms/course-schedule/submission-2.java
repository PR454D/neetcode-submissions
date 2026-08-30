class Solution {
    private Map<Integer, List<Integer>> seen = new HashMap<>();
    private Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) seen.put(i, new ArrayList<>());
        for (int[] course: prerequisites) seen.get(course[0]).add(course[1]);
        for (int c = 0; c < numCourses; c++) if (!dfs(c)) return false;
        return true;
    }
    private boolean dfs(int crs) {
        if (visiting.contains(crs)) return false;
        if (seen.get(crs).isEmpty()) return true;
        visiting.add(crs);
        for (int pre: seen.get(crs)) if (!dfs(pre)) return false;
        visiting.remove(crs);
        seen.put(crs, new ArrayList<>());
        return true;
    }
}
