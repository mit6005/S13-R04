package tree2;

import java.util.List;

/**
 * A binary tree with a left child, right child, and ability to convert to in- or
 * pre-order list representations.
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

    /**
     * Creates and returns an in-order list of the elements in this tree
     * (in-order is: left children, parent, right children).
     * @return the in-order list of elements
     */
    public List<E> getInOrder();

    /**
     * Creates and returns a pre-order list of the elements in this tree
     * (pre-order is: parent, children).
     * @return the pre-order list of elements
     */
    public List<E> getPreOrder();
}
