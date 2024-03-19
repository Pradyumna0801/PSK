class Jp{
 private static int oc=10;
    static class I{
	private int ic;
 	 public I(int v){ this.ic=v;}
public void Display(){
	 System.out.println(oc);
	System.out.println(ic);
}



public static void main(String []args){
  I i=new I(20);
  i.Display();

 
   }
 }
}
