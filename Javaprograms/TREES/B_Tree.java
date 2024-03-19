// NOT RUN
import java.util.*;
class B_Tree {
    ArrayList<Integer> keys;
    ArrayList<B_Tree> children;
    boolean leaf;
    int degree;

    B_Tree(int degree, boolean leaf) {
        this.degree = degree;
        this.leaf = leaf;
        keys = new ArrayList<>();
        children = new ArrayList<>();
    }

    int findKey(int k) {
        int idx = 0;
        while (idx < keys.size() && keys.get(idx) < k) {
            ++idx;
        }
        return idx;
    }

    void splitChild(int i, B_Tree y) {
        B_Tree z = new B_Tree(y.degree, y.leaf);
        z.keys.addAll(y.keys.subList(degree / 2, degree - 1));
        if (!y.leaf) {
            z.children.addAll(y.children.subList(degree / 2, degree));
            y.children.subList(degree / 2, degree).clear();
        }
        y.keys.subList(degree / 2, degree - 1).clear();
        children.add(i + 1, z);
        keys.add(i, y.keys.get(degree / 2 - 1));
    }

    void insertNonFull(int k) {
        int i = keys.size() - 1;
        if (leaf) {
            while (i >= 0 && keys.get(i) > k) {
                --i;
            }
            keys.add(i + 1, k);
        } else {
            while (i >= 0 && keys.get(i) > k) {
                --i;
            }
            if (children.get(i + 1).keys.size() == 2 * degree - 1) {
                splitChild(i + 1, children.get(i + 1));
                if (keys.get(i + 1) < k) {
                    ++i;
                }
            }
            children.get(i + 1).insertNonFull(k);
        }
    }

    boolean search(int k) {
        int i = 0;
        while (i < keys.size() && k > keys.get(i)) {
            ++i;
        }
        if (i < keys.size() && keys.get(i) == k) {
            return true;
        }
        return leaf ? false : children.get(i).search(k);
    }

    void traverse() {
        int i;
        for (i = 0; i < keys.size(); i++) {
            if (!leaf) {
                children.get(i).traverse();
            }
            System.out.print(keys.get(i) + " ");
        }
        if (!leaf) {
            children.get(i).traverse();
        }
    }
}

class BTree {
    private B_Tree root;
    private int degree;

    BTree(int degree) {
        this.degree = degree;
        root = new B_Tree(degree, true);
    }

    void insert(int k) {
        if (root.keys.size() == 2 * degree - 1) {
            B_Tree s = new B_Tree(degree, false);
            s.children.add(0, root);
            s.splitChild(0, root);
            int i = 0;
            if (s.keys.get(0) < k) {
                ++i;
            }
            s.children.get(i).insertNonFull(k);
            root = s;
        } else {
            root.insertNonFull(k);
        }
    }
    boolean search(int k) {
        return root.search(k);
    }

    void traverse() {
        if (root != null) {
            root.traverse();
        }
    }

    public static void main(String[] args) {
        BTree tree = new BTree(3);
        tree.insert(1);
        tree.insert(3);
        tree.insert(7);
        tree.insert(10);
        tree.insert(11);
        tree.insert(13);
        tree.insert(14);
        tree.insert(15);
        tree.insert(18);
        tree.insert(16);
        tree.insert(19);
        tree.insert(24);
        tree.insert(25);
        tree.insert(26);
        tree.insert(21);
        tree.insert(4);
        tree.insert(5);
        tree.insert(20);
        tree.insert(22);
        tree.insert(2);
        tree.insert(17);
        tree.insert(12);
        tree.insert(6);

        System.out.println("B-Tree traversal:");
        tree.traverse();

        int key = 6;
        System.out.println("\n\nSearch for key " + key + ": " + tree.search(key));
    }
}
  