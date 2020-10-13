package CI646.ast.visitor;

/**
 * The base class of Visitors for ASTs. This interface needs to contain an
 * overloaded `visit' method for every subclass of Exp (i.e. everything
 * which might appear in an expression). The return type of the `visit' methods
 * has to match the return type of the `accept' methods in the AST nodes.
 *
 * Created by jb259 on 27/10/16.
 */
public interface ASTVisitor<T> {

}
