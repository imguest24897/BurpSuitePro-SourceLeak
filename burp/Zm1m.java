package burp;

import java.util.Map;

public class Zm1m implements Zei8<Zrp9> {
  private final Zll7 Zu = null;
  
  private final Zxcg<?> Zp;
  
  private final Zzi8 Zn;
  
  private final Zvow ZY;
  
  private final Zzi8 Zf;
  
  private final Zvow ZO;
  
  private final Zstu Zl;
  
  private final Zstu ZV;
  
  private final byte[] Zj;
  
  private final byte[] ZP;
  
  private static Zbqc[] Zb;
  
  public Zm1m(Zxcg<?> paramZxcg, Zvow paramZvow1, Zvow paramZvow2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.Zp = paramZxcg;
    this.Zn = null;
    this.ZY = paramZvow1;
    this.Zf = null;
    this.ZO = paramZvow2;
    this.Zl = null;
    this.Zj = paramArrayOfbyte1;
    this.ZV = null;
    this.ZP = paramArrayOfbyte2;
  }
  
  public Zsqx<Zrp9> Zc(Map<Zvow, Zzi8> paramMap) {
    return new Zlej(this, paramMap);
  }
  
  private Zstu Zy(Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zl : Lburp/Zstu;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> get : (Lburp/Zm1m;Lburp/Zr_4;)Ljava/util/function/Supplier;
    //   11: invokestatic requireNonNullElseGet : (Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   14: checkcast burp/Zstu
    //   17: areturn
  }
  
  private Zstu ZJ(Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZV : Lburp/Zstu;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> get : (Lburp/Zm1m;Lburp/Zr_4;)Ljava/util/function/Supplier;
    //   11: invokestatic requireNonNullElseGet : (Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   14: checkcast burp/Zstu
    //   17: areturn
  }
  
  public byte[] Zp(String paramString) {
    return this.Zj;
  }
  
  private Zstu lambda$getRetrievalPath$1(Zr_4 paramZr_4) {
    return Zlt_.ZF(this.ZP, paramZr_4);
  }
  
  private Zstu lambda$getOriginatingPath$0(Zr_4 paramZr_4) {
    return Zlt_.ZF(this.Zj, paramZr_4);
  }
  
  public static void ZE(Zbqc[] paramArrayOfZbqc) {
    Zb = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZV() {
    return Zb;
  }
  
  static {
    if (ZV() == null)
      ZE(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm1m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */