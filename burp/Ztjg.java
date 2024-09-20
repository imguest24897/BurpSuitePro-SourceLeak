package burp;

import java.util.function.Predicate;

class Ztjg {
  private final boolean ZJ;
  
  private final Predicate<byte[]> ZK;
  
  private final Zt8d ZI;
  
  private Ztjg(boolean paramBoolean, Predicate<byte[]> paramPredicate, Zt8d paramZt8d) {
    this.ZJ = paramBoolean;
    this.ZK = paramPredicate;
    this.ZI = paramZt8d;
  }
  
  private boolean Zo() {
    return this.ZJ;
  }
  
  private boolean ZL(byte[] paramArrayOfbyte) {
    return this.ZK.test(paramArrayOfbyte);
  }
  
  private Zt8d ZZ() {
    return this.ZI;
  }
  
  public Predicate<byte[]> ZG() {
    return this.ZK;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztjg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */