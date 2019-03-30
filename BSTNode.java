
public class BSTNode<T> implements Comparable<BSTNode> {
  private Comparable<T> data;
  private BSTNode<T> left;
  private BSTNode<T> right;

  @Override
  public int compareTo(Comparable<T> o) {
    return data.compareTo(o);
  }

  public BSTNode(Comparable<T> data) {
    this.data = data;
    left = null;
    right = null;
  }

  public BSTNode<T> getLeftNode() {
    return left;
  }

  public BSTNode<T> getRightNode() {
    return right;
  }

  public Comparable<T> getData() {
    return data;
  }

  public void setLeftNode(BSTNode<T> newNode) {
    left = newNode;
  }

  public void setRightNode(BSTNode<T> newNode) {
    right = newNode;
  }
}