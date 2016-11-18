package CI346.week5;

import CI346.ast.*;
import CI346.ast.visitor.EvalVisitor;
import CI346.tree.BinaryTree;
import CI346.tree.Branch;
import CI346.tree.Leaf;
import CI346.tree.visitor.ListTreeVisitor;
import CI346.tree.visitor.SumTreeVisitor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by jb259 on 28/10/16.
 */
public class TreeVisitorTest {
    BinaryTree<Integer> intTree;
    BinaryTree<String> strTree;

    @Before
    public void setUp() {
        intTree = new Branch<>(42, new Leaf<>(21), new Leaf<>(19));
        strTree = new Branch<>("Jim", new Leaf<>("Lauren"), new Leaf<>("Megan"));
    }

    @Test
    public void testSumTreeVisitor() {
        SumTreeVisitor sv = new SumTreeVisitor();
        intTree.accept(sv);
        assertEquals(sv.getSum(), 82);
        System.out.println(sv.getSum());
    }

    @Test
    public void testListTreeVisitor() {
        ListTreeVisitor lv = new ListTreeVisitor();
        strTree.accept(lv);
        //Test that the Visitor performs a preorder traversal
        assertEquals(lv.getList(), "[Lauren, Jim, Megan]");
        System.out.println(lv.getList());
    }

    @After
    public void tearDown() throws Exception {

    }

}