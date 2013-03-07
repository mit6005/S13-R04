package tree3;

public class Main {
    
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTreeParent<Integer>(11,
                                   new BinaryTreeParent<Integer>(9,
                                           new BinaryTreeLeaf<Integer>(5),
                                           new BinaryTreeParent<Integer>(6,
                                                   new BinaryTreeLeaf<Integer>(1),
                                                   new BinaryTreeLeaf<Integer>(2))),
                                   new BinaryTreeParent<Integer>(10,
                                           new BinaryTreeParent<Integer>(7,
                                                   new BinaryTreeLeaf<Integer>(3),
                                                   new BinaryTreeLeaf<Integer>(4)),
                                           new BinaryTreeLeaf<Integer>(8)));
        
        System.out.println("in-order: " + tree.getInOrder());
        System.out.println(" visitor: " + tree.accept(new InOrderVisitor<Integer>()));
        
        System.out.println("pre-order: " + tree.getPreOrder());
        System.out.println("  visitor: " + tree.accept(new PreOrderVisitor<Integer>()));
        
        System.out.print("breadth-first: ");
        BreadthFirstVisitor<Integer> bfv = new BreadthFirstVisitor<Integer>();
        tree.accept(bfv);
        for (BinaryTree<Integer> node : bfv.result()) {
            System.out.print(node.getValue() + ", ");
        }
        System.out.println("done");
    }
}
