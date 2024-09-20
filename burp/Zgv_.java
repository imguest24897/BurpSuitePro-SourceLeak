package burp;

public class Zgv_ {
  public final byte[] ZI;
  
  public final Zb3s Zd;
  
  public final boolean ZG;
  
  private static Zbqc[] Zf;
  
  public Zgv_(byte[] paramArrayOfbyte, Zb3s paramZb3s) {
    this(paramArrayOfbyte, paramZb3s, false);
  }
  
  public Zgv_(byte[] paramArrayOfbyte, Zb3s paramZb3s, boolean paramBoolean) {
    this.ZI = paramArrayOfbyte;
    this.Zd = paramZb3s;
    this.ZG = paramBoolean;
  }
  
  public static void Zy(Zbqc[] paramArrayOfZbqc) {
    Zf = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zm() {
    return Zf;
  }
  
  static {
    if (Zm() == null)
      Zy(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgv_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */