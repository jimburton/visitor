package CI346.week5;

import CI346.ast.*;
import CI346.tree.Branch;
import CI346.tree.Leaf;
import CI346.tree.BinaryTree;
import CI346.ast.visitor.EvalVisitor;
import CI346.tree.visitor.ListTreeVisitor;
import CI346.tree.visitor.SumTreeVisitor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by jb259 on 28/10/16.
 */
public class ASTVisitorTest {
    Exp<Integer> exp;
    Map<String, Integer> env;

    @Before
    public void setUp() {
        env = new HashMap<>();
        exp = new Plus(new Id("x"), new Minus(new Val(99), new Id("y")));
        env = new HashMap<>();
        env.put("x", 42);
        env.put("y", 19);
    }

    @Test
    public void testEvalTreeVisitor() {
        EvalVisitor ev = new EvalVisitor(env);
        int result = exp.accept(ev);
        assertEquals(result, 122);
        System.out.println(result);
    }

    @Test
    public void testEvalTreeVisitorUndecl() {
        EvalVisitor ev = new EvalVisitor(env);
        try {
            Exp<Integer> undeclared = new Id("z");
            undeclared.accept(ev);
            assert(false);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    @After
    public void tearDown() throws Exception {

    }

}