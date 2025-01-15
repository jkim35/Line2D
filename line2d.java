public class line2d{
    point p1;
    point p2;
    public line2d (point newp1, point newp2){
        p1 = newp1;
        p2 = newp2;
    }
    public line2d (int x1, int y1, int x2, int y2){
        p1 = new point(x1,y1);
        p2 = new point(x2,y2);
    }
    public point getP1(){
        return p1;
    }
    public point getP2(){
        return p2;
    }
    public String toString(){
        return "[("+p1.getX()+","+p1.getY()+"),  ("+p2.getX()+","+p2.getY()+")]";
    }  
    public double getSlope(){
        if(p2.getX()-p1.getX()!=0){
            return (double)(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
        }else{
            throw new IllegalArgumentException("undefined slope");
        }
        
    }
    public boolean isCollinear(point p){
        double slope;
        if(p2.getX()-p1.getX()!=0){
            slope = (double)(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
        }else{
            if(p2.getX()==p.getX()){
                return true;
            }else{
                return false;
            }
        }
        //y-y1 = m(x-x1)
        double yintercept = (double)slope*(0-p1.getX())+p1.getY();
    
        if((yintercept+slope*p.getX()<p.getY()+0.01)&&(yintercept+slope*p.getX()>p.getY()-0.01)){
            return true;
        }else{
            return false;
        }
        
    }


}