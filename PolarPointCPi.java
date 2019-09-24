public class PolarPointCPi implements PointCP_intr {
  double rho, theta;
  public String toString() {
    String str;
    str = String.format ("(x,y) is (%.5f, %.5f); (Rho, Theta) is (%.5f, %.5f)", getX(), getY(), getRho(), getTheta());
    return "PolarPointCP: " + str;
  }
  public PolarPointCPi (double _rho, double _theta) {
    rho = _rho;
    theta = _theta;
  }
  public double getX() { return 0; }
  public double getY() { return 0; }
  public double getRho() { return rho; }
  public double getTheta() { return theta; }
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
