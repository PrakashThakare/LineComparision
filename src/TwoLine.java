public class TwoLine {
    public static void main(String[] args) {
        int x1=12,y1=14,x2=23,y2=43,x3=21,y3=32,x4=65,y4=96;
        int L1=(int) Math.sqrt((y1-x1)^2+(y2-x2)^2);
        int L2=(int) Math.sqrt((y3-x3)^2+(y4-x4)^2);
        if(L1==L2)
            System.out.println("lines are equal");
        else
            System.out.println("lines are not equal");
    }
}
