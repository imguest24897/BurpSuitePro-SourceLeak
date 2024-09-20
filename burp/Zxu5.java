package burp;

public class Zxu5 extends Zxsr implements Zxz4 {
  private static String[] Zg;
  
  Zxu5(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zeu4<? extends Zxz4> ZF() {
    return Zxz4.ZQ;
  }
  
  public static void Zm(String[] paramArrayOfString) {
    Zg = paramArrayOfString;
  }
  
  public static String[] ZS() {
    return Zg;
  }
  
  static {
    if (ZS() == null)
      Zm(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxu5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */