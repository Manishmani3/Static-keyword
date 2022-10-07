public class Staticc {
static int notes=5;
static int pens=3;
static String box= "Geometric box";
int powerlegs=2;
String art="Artist";
String player="goodgamer";
String mus="musiclover";
String code="beginerjava";
  
  static void maths(){
  System.out.println("notes="+notes+"\n"+"Ink pens="+pens+"\n"+"Main tool for the maths is"+box);
  }


        
        public static void main(String [] args){
        maths();
        Staticc y=new Staticc();
        System.out.println(y.player);
        System.out.println(y.art);      
        System.out.println(y.mus);
        System.out.println(y.code);
        }
}
       
