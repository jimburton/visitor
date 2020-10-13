package CI646.tree.visitor;

/**
 * A visitor for binary trees that carries out a *pre-order* traversal to add together
 * all the labels in a tree whose labels are numbers.
 *
 * Created by jb259 on 27/10/16.
 */
public class SumTreeVisitor implements TreeVisitor {

    private int sum = 0;

    public int getSum() {
        return sum;
    }
}
