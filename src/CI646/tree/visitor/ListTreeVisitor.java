package CI646.tree.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * A visitor for binary trees that carries out an *in-order* traversal to
 * create a list of the labels in a tree.
 *
 * Created by jb259 on 27/10/16.
 */
public class ListTreeVisitor implements TreeVisitor {
    private List<String> result;

    public ListTreeVisitor() {
        this.result = new ArrayList<>();
    }

    public String getList() {
        return result.toString();
    }
}
