/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue <Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> levellist=new ArrayList<>();
            while(size>0){
            Node currNode=queue.poll(); // remove from queue
            levellist.add(currNode.val); 
            //now push all child node in queue
            for(Node child:currNode.children){
                if(child!=null){
                    queue.offer(child);
                }
            }
            size--;
            }
            res.add(levellist);
        }
        return res;
    }
}