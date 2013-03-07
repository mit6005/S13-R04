package tree4;

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

    @Override public boolean equals(Object o) {
        if ( ! (o instanceof BinaryTreeLeaf)) { return false; }
        BinaryTreeLeaf<?> other = (BinaryTreeLeaf<?>)o;
        return value.equals(other.value);
    }

    @Override public int hashCode() {
        return value.hashCode();
    }
}
