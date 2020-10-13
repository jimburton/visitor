package CI646.ast.visitor;

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

}
