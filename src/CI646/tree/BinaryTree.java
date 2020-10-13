package CI646.tree;

import CI646.tree.visitor.VisitableTree;

/**
 * The base class for nodes in a binary tree. Implements VisitableTree
 * so that all nodes in the tree can be visited.
 *
 * Created by jb259 on 27/10/16.
 */
public abstract class BinaryTree<T> implements VisitableTree {
    protected T label;

    public T getLabel() {
        return label;
    }

}
