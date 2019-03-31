public class BST<T extends Comparable<T>> {

  private BSTNode<T> root;

  public BST() {
    root = null;
  }

  public boolean find(T value) {
    return find(root, value);
  }

  private boolean find(BSTNode<T> node, T elem) {
    if (node == null) { // Base Case
      return false;
    }

    if (elem.compareTo(node.getData()) == 0) {
      return true;
    } else if (elem.compareTo(node.getData()) < 0) {
      return find(node.getLeftNode(), elem);
    } else {
      return find(node.getRightNode(), elem);
    }
  }

  public BSTNode<T> insert(T elem) {
    if (root == null) {
      return root = new BSTNode<T>(elem);
    }

    return insert(root, elem);
  }

  public BSTNode<T> insert(BSTNode<T> node, T elem) {
    if (node == null) {
      return new BSTNode<T>(elem);
    }

    if (elem.compareTo(node.getData()) < 0) {
      node.setLeftNode(insert(node.getLeftNode(), elem));
      return node;
    } else {
      node.setRightNode(insert(node.getRightNode(), elem));
      return node;
    }
  }

  public void delete(T elem) {
    root = delete(root, elem);
  }

  private BSTNode<T> delete(BSTNode<T> node, T elem) {
    if (node == null) {
      return null;
    }

    if (elem.compareTo(node.getData()) == 0) {
      if (node.getLeftNode() == null) {
        return node.getRightNode();
      } else if (node.getRightNode() == null) {
        return node.getLeftNode();
      } else {
        if (node.getRightNode().getLeftNode() == null) {
          node.setData(node.getRightNode().getData());
          node.setRightNode(node.getRightNode().getRightNode());
          return node;
        } else {
          node.setData(removeSmallest(node.getRightNode()));
          return node;
        }
      }
    } else if (elem.compareTo(node.getData()) < 0) {
      node.setLeftNode(delete(node.getLeftNode(), elem));
      return node;
    } else {
      node.setRightNode(delete(node.getRightNode(), elem));
      return node;
    }
  }

  private T removeSmallest(BSTNode<T> node) {
    if (node.getLeftNode().getLeftNode() == null) {
      T smallest = node.getLeftNode().getData();
      node.setLeftNode(node.getLeftNode().getRightNode());
      return smallest;
    } else {
      return removeSmallest(node.getLeftNode());
    }
  }

  public void print() {
    print(root);
  }

  private void print(BSTNode node) {
    if (node != null) {
      print(node.getLeftNode());
      System.out.print(node.getData() + " ");
      print(node.getRightNode());
    }
  }
}
