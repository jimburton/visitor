package CI346.ast;

import CI346.ast.visitor.ASTVisitor;

/**
 * Created by jb259 on 28/10/16.
 */
public class Pow<T> extends BinaryOp<T> {
    public Pow(Exp lhs, Exp rhs) {
        super(lhs, rhs);
    }

    @Override
    public T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
