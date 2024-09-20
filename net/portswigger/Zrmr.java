package net.portswigger;

import java.util.List;

public final class Zrmr extends Record implements Zms {
  private final boolean zm8;
  
  private final Integer zma;
  
  private final Integer zmO;
  
  private final List<String> zmk;
  
  private final List<String> zm9;
  
  private final Integer ZD;
  
  private final Zrms ZZ;
  
  private final String zmx;
  
  private static final Zrmr Zi = new Zrmr((new Zaq()).ZQ(true));
  
  private static final Zrmr Za = new Zrmr((new Zaq()).ZQ(false));
  
  private static boolean ZK;
  
  public Zrmr() {
    this(new Zaq());
  }
  
  private Zrmr(Zaq paramZaq) {
    this(paramZaq.ZU, paramZaq.ZK, paramZaq.ZO, paramZaq.ZS, paramZaq.Zh, paramZaq.Zg, paramZaq.ZE, paramZaq.ZR);
  }
  
  public Zrmr(boolean paramBoolean, Integer paramInteger1, Integer paramInteger2, List<String> paramList1, List<String> paramList2, Integer paramInteger3, Zrms paramZrms, String paramString) {
    this.zm8 = paramBoolean;
    this.zma = paramInteger1;
    this.zmO = paramInteger2;
    this.zmk = paramList1;
    this.zm9 = paramList2;
    this.ZD = paramInteger3;
    this.ZZ = paramZrms;
    this.zmx = paramString;
  }
  
  public static Zrmr ZD(boolean paramBoolean) {
    return paramBoolean ? Zi : Za;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.ZC(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zrmr;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zrmr;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zrmr;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean Zm8() {
    return this.zm8;
  }
  
  public Integer Zma() {
    return this.zma;
  }
  
  public Integer ZmO() {
    return this.zmO;
  }
  
  public List<String> Zmk() {
    return this.zmk;
  }
  
  public List<String> Zm9() {
    return this.zm9;
  }
  
  public String Zmx() {
    return this.zmx;
  }
  
  public static void Zl(boolean paramBoolean) {
    ZK = paramBoolean;
  }
  
  public static boolean ZmZ() {
    return ZK;
  }
  
  public static boolean Zmm() {
    boolean bool = ZmZ();
    return !bool;
  }
  
  static {
    Zl(false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrmr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */