package net.portswigger;

import java.util.List;

public final class Zlw extends Record implements Zms {
  private final String zf8;
  
  private final Zms zfk;
  
  private final Zms zf5;
  
  private final List<Zms> Za;
  
  private final boolean Zn;
  
  private Zlw(Zuq paramZuq) {
    this(paramZuq.Zp, paramZuq.Zb, paramZuq.Ze, paramZuq.Zs, paramZuq.Zx);
  }
  
  public Zlw(String paramString, Zms paramZms1, Zms paramZms2, List<Zms> paramList, boolean paramBoolean) {
    this.zf8 = paramString;
    this.zfk = paramZms1;
    this.zf5 = paramZms2;
    this.Za = paramList;
    this.Zn = paramBoolean;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.Zg(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zlw;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zlw;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zlw;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String Zf8() {
    return this.zf8;
  }
  
  public Zms Zfk() {
    return this.zfk;
  }
  
  public Zms Zf5() {
    return this.zf5;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zlw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */