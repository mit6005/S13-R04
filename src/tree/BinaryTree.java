package tree;

/**
 * A binary tree with a left child and right child.
 * @param <E> type of values stored in this tree
 */
public interface BinaryTree<E> {
    /**
     * Gets the value at this node.
     * @return the value at this node
     */
    public E getValue();

    /**
     * Gets the left subtree.  This is an "optional" method, meaning it may
     * throw an {@link UnsupportedOperationException}.
     * @return the left subtree
     */
    public BinaryTree<E> getLeft();

    /**
     * Gets the right subtree.  This is an "optional" method, meaning it may
     * throw an {@link UnsupportedOperationException}.
     * @return the right subtree
     */
    public BinaryTree<E> getRight();
}
