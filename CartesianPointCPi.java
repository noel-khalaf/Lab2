public class CartesianPointCPi implements PointCP_intr {
  double x, y;
  public String toString() {
    String str;
    str = String.format ("(x,y) is (%.5f, %.5f); (Rho, Theta) is (%.5f, %.5f)", getX(), getY(), getRho(), getTheta());
    return "CartesianPointCP: " + str;
  }
  public CartesianPointCPi(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double getX() { return x; }
  public double getY() { return y; }
  public double getRho() { return 0; }
  public double getTheta() { return 0; }
  public boolean is_equal(PointCP_intr _p){
    boolean eq = true;
    double d;
    if (Math.abs(getX() - _p.getX()) > 1E-5) eq = false;
    if (Math.abs(getY() - _p.getY()) > 1E-5) eq = false;
    if (Math.abs(getRho() - _p.getRho()) > 1E-5) eq = false;
    d = Math.abs(getTheta() - _p.getTheta());
    d -= (int) (d/Math.PI) * Math.PI;
    if (d > 1E-5) eq = false;
    return eq;
  }
}
