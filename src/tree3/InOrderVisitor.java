package tree3;

import java.util.ArrayList;
import java.util.List;

/**
 * Builds an in-order list of the elements in a visited tree
 * (in-order is: left children, parent, right children).
 */
public class InOrderVisitor<E> implements BinaryTree.Visitor<E, List<E>> {

    public List<E> visit(BinaryTreeLeaf<E> leaf) {
        List<E> inOrder = new ArrayList<E>();
        inOrder.add(leaf.getValue());
        return inOrder;
    }

    public List<E> visit(BinaryTreeParent<E> parent) {
        // List<E> inOrder = visit(parent.getLeft()); <-- why not like this?
        List<E> inOrder = parent.getLeft().accept(this);
        // List<E> inOrder = parent.getLeft().accept(new InOrderVisitor<E>()); <-- what's the difference?
        inOrder.add(parent.getValue());
        inOrder.addAll(parent.getRight().accept(this));
        return inOrder;
    }
}
