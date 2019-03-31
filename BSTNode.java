public class BSTNode<T extends Comparable<T>> {
  private T data;
  private BSTNode<T> left;
  private BSTNode<T> right;

  public BSTNode(T newData) {
    data = newData;
    left = null;
    right = null;
  }

  public BSTNode<T> getLeftNode() {
    return left;
  }

  public BSTNode<T> getRightNode() {
    return right;
  }

  public T getData() {
    return data;
  }

  public void setLeftNode(BSTNode<T> newNode) {
    left = newNode;
  }

  public void setRightNode(BSTNode<T> newNode) {
    right = newNode;
  }
  
  public void setData(T newData) {
    data = newData;
  }
}