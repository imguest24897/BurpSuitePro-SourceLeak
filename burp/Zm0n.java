package burp;

public class Zm0n {
  public final byte[] Zc;
  
  public final Zs2i Zv;
  
  public final Zlvf ZC;
  
  final Zej6 ZB;
  
  final Zm4g Zk;
  
  private static String Zp;
  
  protected Zm0n(Zej6 paramZej6, Zs2i paramZs2i, Zlvf paramZlvf, byte[] paramArrayOfbyte, Zm4g paramZm4g) {
    this.ZB = paramZej6;
    this.Zc = paramArrayOfbyte;
    this.Zv = paramZs2i;
    this.ZC = paramZlvf;
    this.Zk = paramZm4g;
  }
  
  public long ZE() {
    return this.ZB.ZY ? 0L : this.ZB.Zh;
  }
  
  public static void Za(String paramString) {
    Zp = paramString;
  }
  
  public static String ZX() {
    return Zp;
  }
  
  static {
    if (ZX() != null)
      Za("qAvlsb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm0n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */