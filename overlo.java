package JavaBal;

public class overlo {
    public static void main(String[] args) {
        overlo ov = new overlo();
        int ans1 = ov.add(2,3);
        int ans2 = ov.add(3,4,5);
        float ans3 = ov.add(23.4f,24.6f);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
    int add(int n1,int n2){
        return n1+n2;
    }
    int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    float add(float n1,float n2){
        return n1+n2;
    }
}
