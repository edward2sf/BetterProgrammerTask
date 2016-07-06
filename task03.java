import java.util.*;


public class BetterProgrammerTask {

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static int getLevelSum(Node root, int N) {
        /*
          Please implement this method to
          traverse the tree and return the sum of the values (Node.getValue()) of all nodes
          at the level N in the tree.
          Node root is assumed to be at the level 1. All its children are level 2, etc.
         */
         
        int sum = root.getValue();

        if (N > 1) {
            for (int i = 0; i < root.getChildren().size(); i++) {
                sum = sum + getLevelSum(root.getChildren().get(i), N - 1);
            }
        }

        return sum;
    }
}
