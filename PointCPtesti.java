public class PointCPtesti {
	public static void main (String args[]) {
    CartesianPointCPi cp;
    PolarPointCPi pp;
    CartesianPointCPi cpi;
    PolarPointCPi ppi;
    cp = new CartesianPointCPi(10,10);
    pp = new PolarPointCPi (cp.getRho(), cp.getTheta());
    ppi = new PolarPointCPi (100, Math.asin(0.5));
    cpi = new CartesianPointCPi (ppi.getX(), ppi.getY());
    if (cp.is_equal(pp))  System.out.println (cp + " equals " + pp);
    else                  System.out.println (cp + " does not equal " + pp);
    if (cpi.is_equal(ppi))  System.out.println (cpi + " equals " + ppi);
    else                    System.out.println (cpi + " does not equal " + ppi);
	}
}
