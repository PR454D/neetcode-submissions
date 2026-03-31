class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (var str : strs) {
            sizes.add(str.length());
        }
        for (int size : sizes) {
            res.append(size).append(",");
        }
        res.append("#");
        for (var str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder current = new StringBuilder();
            while (str.charAt(i) != ',') {
                current.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(current.toString()));
            i++;
        }
        i++;
        for (int size : sizes) {
            res.add(str.substring(i, i + size));
            i += size;
        }
        return res;
    }
}
