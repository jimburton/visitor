package CI646.tests;

import CI646.tree.BinaryTree;
import CI646.tree.Branch;
import CI646.tree.Leaf;
import CI646.tree.visitor.ListTreeVisitor;
import CI646.tree.visitor.SumTreeVisitor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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