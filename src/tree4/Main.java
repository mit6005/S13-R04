package tree4;

public class Main {
    
    public static void main(String[] args) {
        BinaryTree<Character> aa = new BinaryTreeParent<Character>('q',
                new BinaryTreeParent<Character>('a',
                        new BinaryTreeLeaf<Character>('s'),
                        new BinaryTreeLeaf<Character>('d')),
                new BinaryTreeParent<Character>('z',
                        new BinaryTreeLeaf<Character>('x'),
                        new BinaryTreeLeaf<Character>('c')));
        BinaryTree<Character> bb = new BinaryTreeParent<Character>('q',
                new BinaryTreeParent<Character>('a',
                        new BinaryTreeLeaf<Character>('s'),
                        new BinaryTreeLeaf<Character>('d')),
                new BinaryTreeParent<Character>('z',
                        new BinaryTreeLeaf<Character>('x'),
                        new BinaryTreeLeaf<Character>('c')));
        BinaryTree<Character> cc = new BinaryTreeParent<Character>('q',
                new BinaryTreeParent<Character>('a',
                        new BinaryTreeLeaf<Character>('s'),
                        new BinaryTreeLeaf<Character>('#')),
                new BinaryTreeParent<Character>('z',
                        new BinaryTreeLeaf<Character>('x'),
                        new BinaryTreeLeaf<Character>('c')));
        
        System.out.println("aa equals bb? " + aa.equals(bb));
        System.out.println("aa equals cc? " + aa.equals(cc));
        System.out.println("bb equals cc? " + bb.equals(cc));
        
        Object oo = aa;
        System.out.println("aa equals oo? " + aa.equals(oo));
        System.out.println("oo equals aa? " + oo.equals(aa));
        System.out.println("bb equals oo? " + bb.equals(oo));
        System.out.println("oo equals bb? " + oo.equals(bb));
    }
}
