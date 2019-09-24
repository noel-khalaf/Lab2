public abstract class PointCP {
  public abstract double getX();
  public abstract double getY();
  public abstract double getRho();
  public abstract double getTheta();
  public String toString() {
    String str;
    // str = "(x,y) is (" + getX() + ", " + getY() + "); (Rho, Theta) is (" + getRho() + ", " + getTheta() + ")";
    str = String.format ("(x,y) is (%.5f, %.5f); (Rho, Theta) is (%.5f, %.5f)", getX(), getY(), getRho(), getTheta());
    return str;
  }
  public boolean is_equal(PointCP _p){
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


