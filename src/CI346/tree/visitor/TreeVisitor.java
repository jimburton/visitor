package CI346.tree.visitor;

import CI346.tree.Branch;
import CI346.tree.Leaf;

/**
 * The base class for BinaryTree visitors. This interface needs to contain an
 * overloaded `visit' method for every subclass of BinaryTree (i.e. everything
 * which might appear in a tree).
 *
 * Created by jb259 on 27/10/16.
 */
public interface TreeVisitor {

    void visit(Branch node);
    void visit(Leaf node);

}
