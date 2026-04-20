impl Solution {
    pub fn combination_sum(nums: Vec<i32>, target: i32) -> Vec<Vec<i32>> {
        let mut res = Vec::new();
        let mut curr = Vec::new();

        // Use a closure to capture 'res', 'nums', and 'target' from the environment
        fn dfs(
            i: usize, 
            total: i32, 
            target: i32, 
            nums: &Vec<i32>, 
            curr: &mut Vec<i32>, 
            res: &mut Vec<Vec<i32>>
        ) {
            if total == target {
                res.push(curr.clone());
                return;
            }

            // Indexing and length checks must use usize
            if i >= nums.len() || total > target {
                return;
            }

            curr.push(nums[i]);
            dfs(i, total + nums[i], target, nums, curr, res);
            curr.pop();
            dfs(i + 1, total, target, nums, curr, res);
        }

        dfs(0, 0, target, &nums, &mut curr, &mut res);
        res
    }
}
