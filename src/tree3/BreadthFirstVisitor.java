package tree3;

import java.util.*;

/**
 * Builds a breadth-first list of the nodes in the visited tree
 * (breadth-first is: root, immediate children, their children, ...).
 */
public class BreadthFirstVisitor<E> implements BinaryTree.Visitor<E, Void> {
    
    private final List<BinaryTree<E>> result = new ArrayList<BinaryTree<E>>();
    private final Deque<BinaryTree<E>> deque = new ArrayDeque<BinaryTree<E>>();
    
    public Void visit(BinaryTreeLeaf<E> leaf) {
        result.add(leaf);
        return null;
    }

    public Void visit(BinaryTreeParent<E> parent) {
        result.add(parent);
        deque.add(parent.getLeft());
        deque.add(parent.getRight());
        while ( ! deque.isEmpty()) {
            deque.pop().accept(this);
        }
        return null;
    }

    /**
     * Returns the result.
     * @return breadth-first list of nodes in visited tree
     */
    public List<BinaryTree<E>> result() {
        return Collections.unmodifiableList(result);
    }
}
