#include<bits/stdc++.h>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class Solution {
public:
    vector<int> getPreorder(TreeNode* root) {
        vector<int> preorder;
        
        TreeNode* cur = root;

        while (cur != NULL) {
            if (cur->left == NULL) {
                preorder.push_back(cur->val);
                
                cur = cur->right;
            } else {
                TreeNode* prev = cur->left;
                
                while (prev->right && prev->right != cur) {
                    prev = prev->right;
                }
                
                if (prev->right == NULL) {
                    prev->right = cur;
                    
                    cur = cur->left;
                } else {
                    prev->right = NULL;
                    
                    preorder.push_back(cur->val);
                    
                    cur = cur->right;
                }
            }
        }
        return preorder;
    }
};


int main() {

    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);
    root->left->right->right = new TreeNode(6);

    Solution sol;
    
    vector<int> preorder = sol.getPreorder(root);

    cout << "Binary Tree Morris Preorder Traveral: ";
    for(int i = 0; i< preorder.size(); i++){
        cout << preorder[i] << " ";
    }
    cout << endl;

    return 0;
}
                            
                        