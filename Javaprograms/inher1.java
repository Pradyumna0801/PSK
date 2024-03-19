class A{
    int salary=20000;
}
class B extends A{
    int TA=500;
    int DA=700;

}
public class inher1 {
    public static void main(String[] args) {
        B ob=new B();
        System.out.println("Sallary: "+ob.salary);
        System.out.println("Travelling Allowance: "+ob.TA);
        System.out.println("Dearness Allowance: "+ob.DA); 
}}
