package CI646.ast;

import CI646.ast.visitor.ASTVisitor;

/**
 * An AST node representing the addition of the left and right
 * hand expressions.
 *
 * Created by jb259 on 27/10/16.
 */
public class Plus<T> extends BinaryOp<T> {

    public Plus(Exp lhs, Exp rhs) {
        super(lhs, rhs);
    }

    @Override
    public T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
