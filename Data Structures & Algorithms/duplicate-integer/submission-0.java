class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashSet<Integer> duplicate = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(duplicate.contains(nums[i]) != true){
                duplicate.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}