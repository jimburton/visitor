package CI646.ast;

/**
 * An AST node which represents a binary operator.
 *
 * Created by jb259 on 27/10/16.
 *
 */
public abstract class BinaryOp<T> extends Exp<T> {
    protected Exp lhs;
    protected Exp rhs;

    public BinaryOp(Exp lhs, Exp rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public Exp getLhs() {
        return lhs;
    }

    public Exp getRhs() {
        return rhs;
    }
}
