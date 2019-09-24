public class PolarPointCP extends PointCP {
  double rho, theta;
  public String toString() {
    return "PolarPointCP: " + super.toString();
  }
  public PolarPointCP (double _rho, double _theta) {
    rho = _rho;
    theta = _theta;
  }
  public double getX() { return 0; }
  public double getY() { return 0; }
  public double getRho() { return rho; }
  public double getTheta() { return theta; }
}
