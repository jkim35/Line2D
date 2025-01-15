public class testLine2d {
    public static void main(String[]args){
        point p1 = new point(0,0);
        point p2 = new point(3,4);
        point p3 = new point(4,9);
        point p4 = new point(6,8);
        line2d line1 = new line2d(p1,p2);
        line2d line2 = new line2d(p3,p4);
        line2d line3 = new line2d(4,9,6,8);
        System.out.println("line1: "+line1.toString());
        System.out.println("line2: "+line2.toString());
        System.out.println("line3: "+line3.toString());
        System.out.println("line 1, getP1: x = "+line1.getP1().getX()+",y="+line1.getP1().getY());
        System.out.println("line 1, getP2: x = "+line1.getP2().getX()+",y="+line1.getP2().getY());
        System.out.println("line 2, getP1: x = "+line2.getP1().getX()+",y="+line2.getP1().getY());
        System.out.println("line 2, getP2: x = "+line2.getP2().getX()+",y="+line2.getP2().getY());
        System.out.println("Line 1 slope: " +line1.getSlope());
        System.out.println("Line 2 slope: " +line2.getSlope()); 
        System.out.println("Line 1 + p3: " +line1.isCollinear(p3));
        System.out.println("Line 1 + p4: " +line1.isCollinear(p4));
    }
}
