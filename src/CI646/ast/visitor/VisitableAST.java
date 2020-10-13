package CI646.ast.visitor;

/**
 * The interface for AST nodes which will be visited. This is a non-standard
 * implementation of the Visitor pattern since it is specialised for the type T,
 * which is the return type of the `accept' method. This method would normally
 * return void.
 *
 * Created by jb259 on 27/10/16.
 */
public interface VisitableAST<T> {
    T accept(ASTVisitor<T> visitor);
}
