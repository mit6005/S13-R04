package tree4;

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

    // public boolean equals(BinaryTree<E> tree) <-- no?
    // public boolean equals(BinaryTreeParent<E> leaf) <-- no?
    @Override public boolean equals(Object o) {
        if ( ! (o instanceof BinaryTreeParent)) { return false; }
        BinaryTreeParent<?> other = (BinaryTreeParent<?>)o;
        return value.equals(other.value) && left.equals(other.left) && right.equals(other.right);
    }

    @Override public int hashCode() {
        return value.hashCode(); // <-- is this ok?
    }
}
