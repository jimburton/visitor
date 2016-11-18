package CI346.ast;

import CI346.ast.visitor.ASTVisitor;

/**
 * An AST node representing the subtraction of the right hand expression from
 * the left hand expression.
 *
 * Created by jb259 on 27/10/16.
 */
public class Minus<T> extends BinaryOp<T> {

    public Minus(Exp lhs, Exp rhs) {
        super(lhs, rhs);
    }

    @Override
    public T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
