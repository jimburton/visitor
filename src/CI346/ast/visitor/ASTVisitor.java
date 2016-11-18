package CI346.ast.visitor;

import CI346.ast.Id;
import CI346.ast.Minus;
import CI346.ast.Plus;
import CI346.ast.Val;

/**
 * The base class of Visitors for ASTs. This interface needs to contain an
 * overloaded `visit' method for every subclass of Exp (i.e. everything
 * which might appear in an expression). The return type of the `visit' methods
 * has to match the return type of the `accept' methods in the AST nodes.
 *
 * Created by jb259 on 27/10/16.
 */
public interface ASTVisitor<T> {
    T visit(Plus<T> op);
    T visit(Minus<T> op);
    T visit(Id<T> var);
    T visit(Val<T> val);
    T visit(Mul<T> op);
    T visit(Pow<T> p);
}
