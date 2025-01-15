public class point{
    int x;
    int y;
    public point(int newx, int newy){
        x = newx;
        y = newy;
    }
    public point(){
        x = 0;
        y = 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void changeX(int newXnew){
        x = newXnew;
    }
    public void changeY(int newYnew){
        x = newYnew;
    }
    public int manhattanDistance(point other, point other2){
        return Math.abs(other.getX()-other2.getX())+Math.abs(other.getY()-other2.getY());
    }
    public boolean isCollinear(point p1, point p2,point p3){
        double slope;
        if(p2.getX()-p1.getX()!=0){
            slope = (double)(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
        }else{
            if(p2.getX()==p3.getX()){
                return true;
            }else{
                return false;
            }
        }
        //y-y1 = m(x-x1)
        double yintercept = (double)slope*(0-p1.getX())+p1.getY();
    
        if((yintercept+slope*p3.getX()<p3.getY()+0.01)&&(yintercept+slope*p3.getX()>p3.getY()-0.01)){
            return true;
        }else{
            return false;
        }
        
    }
}