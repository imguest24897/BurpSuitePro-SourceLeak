package burp;

import java.util.List;

public abstract class Zzqx implements Zlwx {
  private static boolean Zj;
  
  public boolean ZW() {
    return false;
  }
  
  public boolean ZH() {
    throw new UnsupportedOperationException();
  }
  
  public boolean ZR() {
    return false;
  }
  
  public int Ze() {
    throw new UnsupportedOperationException();
  }
  
  public long ZD() {
    throw new UnsupportedOperationException();
  }
  
  public boolean Zi() {
    return false;
  }
  
  public String ZG() {
    throw new UnsupportedOperationException();
  }
  
  public boolean ZF() {
    return false;
  }
  
  public byte[] Za() {
    throw new UnsupportedOperationException();
  }
  
  public boolean Zq() {
    return false;
  }
  
  public Zvt Zf() {
    throw new UnsupportedOperationException();
  }
  
  public boolean ZN() {
    return false;
  }
  
  public List<Zlwx> ZO() {
    throw new UnsupportedOperationException();
  }
  
  public static void ZJ(boolean paramBoolean) {
    Zj = paramBoolean;
  }
  
  public static boolean ZC() {
    return Zj;
  }
  
  public static boolean Zw() {
    boolean bool = ZC();
    try {
      if (!bool)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (!ZC())
      ZJ(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */