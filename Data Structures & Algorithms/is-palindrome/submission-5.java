class Solution {
    public boolean isPalindrome(String s) {
  		List<Character> arr = s.codePoints()
  			.mapToObj(c -> (char) c)
  			.filter(Character::isLetterOrDigit)
  			.toList();
  		int l = 0;
  		int r = arr.size() - 1;
  		while (l < r) {
  			if (Character.toLowerCase(arr.get(l)) != Character.toLowerCase(arr.get(r))) {
  				return false;
  			}
  			l++;
  			r--;
  		}
  		return true;
  	}
}
