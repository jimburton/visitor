package CI346.tree.visitor;

import CI346.tree.Branch;
import CI346.tree.Leaf;

/**
 * A visitor for binary trees that carries out a *pre-order* traversal to add together
 * all the labels in a tree whose labels are numbers.
 *
 * Created by jb259 on 27/10/16.
 */
public class SumTreeVisitor implements TreeVisitor {

    private int sum = 0;

    @Override
    public void visit(Branch node) {
        sum += (int) node.getLabel();
        node.getLeft().accept(this);
        node.getRight().accept(this);
    }

    @Override
    public void visit(Leaf node) {
        sum += (int) node.getLabel();
    }

    public int getSum() {
        return sum;
    }
}
