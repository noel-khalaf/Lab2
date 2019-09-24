public class PointCPtest {
	public static void main (String args[]) {
    CartesianPointCP cp;
    PolarPointCP pp;
    CartesianPointCP cpi;
    PolarPointCP ppi;
    cp = new CartesianPointCP(10,10);
    pp = new PolarPointCP (cp.getRho(), cp.getTheta());
    ppi = new PolarPointCP (100, Math.asin(0.5));
    cpi = new CartesianPointCP (ppi.getX(), ppi.getY());
    if (cp.is_equal(pp))  System.out.println (cp + " equals " + pp);
    else                  System.out.println (cp + " does not equal " + pp);
    if (cpi.is_equal(ppi))  System.out.println (cpi + " equals " + ppi);
    else                    System.out.println (cpi + " does not equal " + ppi);
	}
}
