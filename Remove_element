class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int idx = 0;
        for(int i=0; i<nums.size(); i++)
        {
            if(nums[i]!=val)
            {
    //using two pointer index and i ....value of nums[i] is replaced with nums[index]
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
    // Advantage is removing desired elements from array without changing their sequence
};
