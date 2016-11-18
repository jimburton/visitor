package CI346.ast.visitor;

import CI346.ast.Id;
import CI346.ast.Minus;
import CI346.ast.Plus;
import CI346.ast.Val;

import java.util.Map;

/**
 * An AST Visitor which evaluates an expression. In order to
 * look up the value of identifiers, the constructor requires a
 * lookup table, or environment, allowing us to look up identifier
 * names.
 *
 * Created by jb259 on 27/10/16.
 */
public class EvalVisitor implements ASTVisitor<Integer> {
    Map<String, Integer> env;

    public EvalVisitor(Map<String, Integer> env) {
        this.env = env;
    }


    @Override
    public Integer visit(Plus op) {
        Integer l = (Integer) op.getLhs().accept(this);
        Integer r = (Integer) op.getRhs().accept(this);
        return l+r;
    }

    @Override
    public Integer visit(Minus op) {
        Integer l = (Integer) op.getLhs().accept(this);
        Integer r = (Integer) op.getRhs().accept(this);
        return l-r;
    }

    @Override
    public Integer visit(Id var) {
        if(env.containsKey(var.getId())) {
            return env.get(var.getId());
        } else {
            throw new RuntimeException("Variable referenced but not declared: `"+var.getId()+"'");
        }
    }

    @Override
    public Integer visit(Val val) {
        return (int) val.getValue();
    }

    @Override
    public Integer visit(Mul op) {
        Integer l = (Integer) op.getLhs().accept(this);
        Integer r = (Integer) op.getRhs().accept(this);
        return l*r;
    }

    @Override
    public Integer visit(Pow p) {
        Integer l = (Integer) p.getLhs().accept(this);
        Integer r = (Integer) p.getRhs().accept(this);
        return (int) Math.pow(l.doubleValue(), r.doubleValue());
    }
}
