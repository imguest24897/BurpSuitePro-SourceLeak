package net.portswigger;

import java.util.List;

public final class Zt0 extends Record implements Zms {
  private final boolean zgO;
  
  private final List<Boolean> zgl;
  
  private final String zg1;
  
  private static final Zt0 Zk = new Zt0((new Zis()).ZX(true));
  
  private static final Zt0 Zj = new Zt0((new Zis()).ZX(false));
  
  private Zt0(Zis paramZis) {
    this(paramZis.ZV, paramZis.ZM, paramZis.Zx);
  }
  
  public Zt0(boolean paramBoolean, List<Boolean> paramList, String paramString) {
    this.zgO = paramBoolean;
    this.zgl = paramList;
    this.zg1 = paramString;
  }
  
  public static Zt0 Zb(boolean paramBoolean) {
    return paramBoolean ? Zk : Zj;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.Zr(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zt0;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zt0;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zt0;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZgO() {
    return this.zgO;
  }
  
  public List<Boolean> Zgl() {
    return this.zgl;
  }
  
  public String Zg1() {
    return this.zg1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zt0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */