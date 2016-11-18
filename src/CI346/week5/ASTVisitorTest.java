package CI346.week5;

import CI346.ast.*;
import CI346.ast.visitor.EvalVisitor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

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
    public void testEvalTreeVisitorMulPow() {
        Map<String, Integer> env = new HashMap<>();
        env.put("x", 6);
        env.put("y", 7);
        // 6 * 2^(7-1)
        Exp<Integer> exp = new Mul(new Id("x"), new Pow(new Val(2), new Minus(new Id("y"), new Val(1))));
        //Exp<Integer> exp = new Pow(new Val(2), new Minus(new Id("y"), new Val(1)));
        EvalVisitor ev = new EvalVisitor(env);
        int result = exp.accept(ev);
        assertEquals(result, 384);
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