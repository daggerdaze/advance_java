public class TowerOfHanoi {
    static int count=0;
    static void  move(int disk,char src , char dist, char spare){
        if(disk==1||disk==0) {
            //System.out.println("move disk" + disk + " from " + src + " to " + dist);
            count+=1;
        }
        else{
            move(disk-1,src,spare,dist);
            //System.out.println("move disk"+disk+" from "+src+" to "+dist);
            count+=1;
            move(disk-1,spare,dist,src);
        }
    }
 
    public static void main(String[] args) {
        move(100,'A','B','C');
        System.out.println("count"+count);
    }
}