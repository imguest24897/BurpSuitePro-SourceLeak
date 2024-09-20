package burp;

public class Zmod implements Zeu0 {
  private final Zlqk Ze;
  
  private final Zmuf ZS;
  
  private final Ztwv Zr;
  
  private final Zlf Zv;
  
  public Zmod(Zlqk paramZlqk, Zmuf paramZmuf, Ztwv paramZtwv, Zlf paramZlf) {
    this.Ze = paramZlqk;
    this.ZS = paramZmuf;
    this.Zr = paramZtwv;
    this.Zv = paramZlf;
  }
  
  public void ZN(Zeew paramZeew, Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, long paramLong, String paramString) {
    ZW(paramZeew, paramZmzk, paramZstu1, paramZstu2, paramLong, paramString, true);
  }
  
  public void ZW(Zeew paramZeew, Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, long paramLong, String paramString, boolean paramBoolean) {
    Zzme zzme = this.ZS.Zb(paramZeew, paramZmzk, paramZstu1, paramZstu2, paramLong, paramString);
    ZZ(zzme, paramBoolean);
  }
  
  public void ZE(Zeew paramZeew, Zmzk paramZmzk, Zbr paramZbr, Zstu paramZstu, long paramLong, String paramString) {
    Zzme zzme = this.ZS.Zl(paramZeew, paramZmzk, paramZbr, paramZstu, paramLong, paramString);
    ZZ(zzme, true);
  }
  
  public void ZP(Zzme paramZzme) {
    Zzme zzme = this.ZS.ZS(paramZzme);
    ZZ(zzme, true);
  }
  
  public void Za(Zbx0 paramZbx0) {
    this.Ze.Ze(paramZbx0);
  }
  
  private void ZZ(Zzme paramZzme, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Zlf;
    //   4: iload_2
    //   5: invokeinterface Za : (Z)V
    //   10: aload_0
    //   11: getfield Zr : Lburp/Ztwv;
    //   14: aload_0
    //   15: aload_1
    //   16: <illegal opcode> call : (Lburp/Zmod;Lburp/Zzme;)Ljava/util/concurrent/Callable;
    //   21: invokeinterface ZO : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   26: pop
    //   27: return
  }
  
  private Boolean lambda$processNewEntry$0(Zzme paramZzme) throws Exception {
    return Boolean.valueOf(this.Ze.add(paramZzme));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmod.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */