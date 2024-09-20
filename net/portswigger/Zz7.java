package net.portswigger;

public class Zz7 extends Exception {
  private static String Zb;
  
  public Zz7(String paramString) {
    super(paramString);
  }
  
  public Zz7(Zqf paramZqf) {
    super(paramZqf.toString());
  }
  
  public Zz7(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public static void Zj(String paramString) {
    Zb = paramString;
  }
  
  public static String Zr() {
    return Zb;
  }
  
  static {
    if (Zr() != null)
      Zj("IGqPrc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zz7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */