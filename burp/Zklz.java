package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zklz<T extends Zgpi<? super T>> implements Zeu4<T> {
  private final Zm31[] Zj;
  
  private final Zllo<T> ZT;
  
  private final byte Zs;
  
  private final boolean Zg;
  
  private static int ZH;
  
  protected Zklz(Zm31[] paramArrayOfZm31, Zllo<T> paramZllo) {
    this(paramArrayOfZm31, paramZllo, Zz5f.NOT_ABSTRACT, (byte)0);
  }
  
  protected Zklz(Zm31[] paramArrayOfZm31, Zllo<T> paramZllo, byte paramByte) {
    this(paramArrayOfZm31, paramZllo, Zz5f.NOT_ABSTRACT, paramByte);
  }
  
  protected Zklz(Zm31[] paramArrayOfZm31, Zllo<T> paramZllo, Zz5f paramZz5f) {
    this(paramArrayOfZm31, paramZllo, paramZz5f, (byte)0);
  }
  
  protected Zklz(Zm31[] paramArrayOfZm31, Zllo<T> paramZllo, Zz5f paramZz5f, byte paramByte) {
    this.Zj = paramArrayOfZm31;
    this.ZT = paramZllo;
    this.Zs = paramByte;
    this.Zg = (paramZz5f == Zz5f.ABSTRACT);
  }
  
  public final Zm31[] Zc() {
    return this.Zj;
  }
  
  public final Zllo<T> ZI() {
    return this.ZT;
  }
  
  public Zeu4<? extends T> Z_(byte paramByte) {
    Zuh.ZC(false, Zqf.ZC, paramByte, this.Zs);
    throw new UnsupportedOperationException();
  }
  
  public final byte Z_() {
    return this.Zs;
  }
  
  public final boolean Zs() {
    return this.Zg;
  }
  
  public static void Zo(int paramInt) {
    ZH = paramInt;
  }
  
  public static int ZM() {
    return ZH;
  }
  
  public static int ZQ() {
    int i = ZM();
    try {
      if (i == 0)
        return 36; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    return 0;
  }
  
  private static UnsupportedOperationException b(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (ZQ() == 0)
      Zo(18); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zklz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */