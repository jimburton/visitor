package CI346.ast;

import CI346.ast.visitor.VisitableAST;

/**
 * The base class for all AST nodes, where `Exp' stands for Expression.
 * Expressions can be binary operators such as Plus and Minus, identifiers,
 * such as `x', or values, such as 42.
 *
 * An expression such as 5 + y - 2 would produce the following AST:
 * new Plus(new Val(5), new Minus(new Id("y"), new Val(2))).
 * Evaluating this expression successfully would require an environment
 * (hashmap of <String, Integer> pairs) that contains a definition of `x'.
 *
 * Implements VisitableAST so that all Exp subclasses can be visited.
 *
 * Created by jb259 on 27/10/16.
 */
public abstract class Exp<T> implements VisitableAST<T> {
}
