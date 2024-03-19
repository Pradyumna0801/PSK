class outerc{
    int a=10;
    class innerc{
        int b=20;
    }
}

public class inner_class {
    public static void main(String[] args) {
        outerc o=new outerc();
        outerc.innerc i=o.new innerc();
        System.out.println(o.a + i.b);
    }
}
