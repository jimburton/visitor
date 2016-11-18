package CI346.tree;

import CI346.tree.visitor.TreeVisitor;

/**
 * The subclass of BinaryTree that represents a leaf node.
 *
 * Created by jb259 on 27/10/16.
 */
public class Leaf<T> extends BinaryTree<T> {

    public Leaf(T label) {
        this.label = label;
    }

    @Override
    public void accept(TreeVisitor visitor) {
        visitor.visit(this);
    }
}
