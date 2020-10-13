package CI646.tree;

import CI646.tree.visitor.TreeVisitor;

/**
 * The subclass of BinaryTree that represents a branch with left and right children.
 *
 * Created by jb259 on 27/10/16.
 */
public class Branch<T> extends BinaryTree<T> {
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    public Branch(T label, BinaryTree<T> left, BinaryTree<T> right) {
        this.label = label;
        this.left = left;
        this.right = right;
    }

    public BinaryTree<T> getLeft() {
        return left;
    }

    public BinaryTree<T> getRight() {
        return right;
    }


    @Override
    public void accept(TreeVisitor visitor) {
        visitor.visit(this);
    }
}
