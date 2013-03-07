package tree3;

import java.util.List;

/**
 * A binary tree with a left child, right child, and ability to convert to in- or
 * pre-order list representations.
 * @param <E> type of values stored in this tree
 */
public interface BinaryTree<E> {

    /**
     * A binary tree visitor.
     * @param <E> type of values stored in the visited tree
     * @param <R> type of visitor return value
     */
    public interface Visitor<E, R> {

        /**
         * Visit a leaf node.
         * @return the result
         */
        public R visit(BinaryTreeLeaf<E> leaf);

        /**
         * Visit a parent node.
         * @return the result
         */
        public R visit(BinaryTreeParent<E> parent);
    }

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

    /**
     * Accept a visitor by calling the appropriate "visit" method.
     * @param visitor the visitor
     * @return the value returned by the visitor
     */
    public <R> R accept(Visitor<E, R> visitor);
}
