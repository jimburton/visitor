package CI346.tree.visitor;

/**
 * The interface for BinaryTree nodes which will be visited. This is a standard use
 * of the Visitor pattern, since the `accept' method and accompanying `visit' methods in
 * the Visitor classes return `void'. That is, they do some work and may store a result
 * internally, but don't return a value directly.
 *
 * Created by jb259 on 27/10/16.
 */
public interface VisitableTree {
    void accept(TreeVisitor visitor);
}
