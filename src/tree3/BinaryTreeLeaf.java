package tree3;

import java.util.ArrayList;
import java.util.List;

/**
 * A binary tree leaf node, stores a value and has no children.
 * @param <E> type of values stored in this tree
 */
public class BinaryTreeLeaf<E> implements BinaryTree<E> {

    private final E value;

    /**
     * Creates a new binary tree leaf node.
     * @param value value stored in this leaf
     */
    public BinaryTreeLeaf(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    /**
     * @throws UnsupportedOperationException always
     */
    public BinaryTree<E> getLeft() {
        throw new UnsupportedOperationException();
    }

    /**
     * @throws UnsupportedOperationException always
     */
    public BinaryTree<E> getRight() {
        throw new UnsupportedOperationException();
    }

    public List<E> getInOrder() {
        List<E> inOrder = new ArrayList<E>();
        inOrder.add(value);
        return inOrder;
    }

    public List<E> getPreOrder() {
        List<E> preOrder = new ArrayList<E>();
        preOrder.add(value);
        return preOrder;
    }

    public <R> R accept(BinaryTree.Visitor<E, R> visitor) {
        return visitor.visit(this);
    }
}
