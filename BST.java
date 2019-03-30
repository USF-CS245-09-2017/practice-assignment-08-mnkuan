public class BST {

  private BSTNode root;

  public BST() {
    root = null;
  }

  public boolean find(Object value) {
    return find(root, value);
  }

  private boolean find(BSTNode node, Object value) {
    if (node == null) { // Base Case
      return false;
    }

    if (node.getData().compareTo(value) > 0) {
      return find(node.getLeftNode(), value);
    } else if (node.getData().compareTo((T) value) < 0) {
      return find(node.getRightNode(), value);
    } else {
      return true;
    }
  }

  public BSTNode<T> insert(Comparable<T> value) {
    return insert(root, value);
  }

  public BSTNode<T> insert(BSTNode<T> node, Comparable<T> value) {
    if (node == null) {
      root = new BSTNode<T>(value);
      return root;
    }

    if (node.getData().compareTo((T) value) < 0) {
      node.setRightNode(insert(node.getRightNode(), value));
    } else if (node.getData().compareTo((T) value) > 0) {
      node.setLeftNode(insert(node.getLeftNode(), value));
    }
    
    return root;

  }

  public void print() {
    print(root);
  }

  private void print(BSTNode<T> node) {
    if (node != null) {
      print(node.getLeftNode());
      System.out.print(node.getData());
      print(node.getRightNode());
    }
  }
}
