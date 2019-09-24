public class CartesianPointCP extends PointCP {
  double x, y;
  public String toString() {
    return "CartesianPointCP: " + super.toString();
  }
  public CartesianPointCP(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double getX() { return x; }
  public double getY() { return y; }
  public double getRho() { return 0; }
  public double getTheta() { return 0; }
}
