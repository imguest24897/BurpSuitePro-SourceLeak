package burp;

import java.util.Iterator;

public class Zz61 implements Zlxj {
  private final Zb3t ZJ;
  
  private static Zbqc[] ZY;
  
  public Zz61(Zb3t paramZb3t) {
    this.ZJ = paramZb3t;
  }
  
  public Iterator<Zb3t> iterator() {
    return new Zeyg(this.ZJ);
  }
  
  public static void ZS(Zbqc[] paramArrayOfZbqc) {
    ZY = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zh() {
    return ZY;
  }
  
  static {
    if (Zh() != null)
      ZS(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz61.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */