package tree2;

import java.util.ArrayList;
import java.util.List;

/**
 * A binary tree parent node, stores a value as well as left and right subtrees.
 * @param <E> type of values stored in this tree
 */
public class BinaryTreeParent<E> implements BinaryTree<E> {

    private final E value;
    private final BinaryTree<E> left;
    private final BinaryTree<E> right;

    /**
     * Creates a new binary tree parent node.
     * @param value value stored in this node
     * @param left left sub-tree
     * @param right right sub-tree
     */
    public BinaryTreeParent(E value, BinaryTree<E> left, BinaryTree<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public E getValue() {
        return value;
    }

    public BinaryTree<E> getLeft() {
        return left;
    }

    public BinaryTree<E> getRight() {
        return right;
    }

    public List<E> getInOrder() {
        List<E> inOrder = left.getInOrder();
        inOrder.add(value);
        inOrder.addAll(right.getInOrder());
        return inOrder;
    }

    public List<E> getPreOrder() {
        List<E> preOrder = new ArrayList<E>();
        preOrder.add(value);
        preOrder.addAll(left.getPreOrder());
        preOrder.addAll(right.getPreOrder());
        return preOrder;
    }
}
