package tree3;

import java.util.ArrayList;
import java.util.List;

/**
 * Builds a pre-order list of the elements in a visited tree
 * (pre-order is: parent, children).
 */
public class PreOrderVisitor<E> implements BinaryTree.Visitor<E, List<E>> {

    public List<E> visit(BinaryTreeLeaf<E> leaf) {
        List<E> preOrder = new ArrayList<E>();
        preOrder.add(leaf.getValue());
        return preOrder;
    }

    public List<E> visit(BinaryTreeParent<E> parent) {
        List<E> preOrder = new ArrayList<E>();
        preOrder.add(parent.getValue());
        preOrder.addAll(parent.getLeft().accept(this));
        preOrder.addAll(parent.getRight().accept(this));
        return preOrder;
    }
}
