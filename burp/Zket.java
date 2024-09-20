package burp;

import java.util.function.Supplier;

public abstract class Zket implements Zzxp {
  private final Ztrk ZF;
  
  private Zgu3 Zp = Zgu3.HTTP_REQUEST;
  
  private Zmlg Zn;
  
  private Zgyq Zv;
  
  private volatile boolean Zx;
  
  private volatile boolean Zz;
  
  private final Zt7b ZD;
  
  public Zket(Ztrk paramZtrk) {
    this.ZF = paramZtrk;
    this.ZD = new Zsp_(this);
  }
  
  public boolean ZQ() {
    return this.ZF.ZB0();
  }
  
  public boolean ZB() {
    return this.ZF.ZJ();
  }
  
  public void ZH(int paramInt, byte[] paramArrayOfbyte) {
    this.ZF.Z_(paramInt, paramArrayOfbyte);
  }
  
  public void ZY(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    this.ZF.ZI(paramInt1, paramInt2, paramArrayOfbyte);
  }
  
  public void Zt(int paramInt1, int paramInt2) {
    this.ZF.Ze(paramInt1, paramInt2);
  }
  
  public void ZW(int paramInt1, int paramInt2, String paramString) {
    Zx();
    this.ZF.Zx(paramInt1, paramInt2, paramString);
  }
  
  public void Zs(Zsmh paramZsmh) {
    this.ZF.Z_(paramZsmh);
  }
  
  public void Zk(Zsmh paramZsmh) {
    this.ZF.ZF(paramZsmh);
  }
  
  public Zmlg Zg(Zbnt paramZbnt, Zey9 paramZey9, Supplier<Boolean> paramSupplier) {
    if (this.Zn == null || this.Zx) {
      if (((Boolean)paramSupplier.get()).booleanValue())
        return null; 
      Zehk zehk = new Zehk(this, paramZbnt, paramZey9, paramSupplier);
      paramZey9.Zy(Za()).Zi(zehk);
      if (((Boolean)paramSupplier.get()).booleanValue())
        return null; 
      this.Zn = zehk.ZK;
      this.Zx = false;
    } 
    return this.Zn;
  }
  
  public Zgyq ZX(Zbnt paramZbnt, Supplier<Boolean> paramSupplier) {
    if (this.Zv == null || this.Zz) {
      if (((Boolean)paramSupplier.get()).booleanValue())
        return null; 
      Zs68 zs68 = Zmre.ZQ(null, Zt6s.Zu(Za()), Zt0k.NO_HTML_ANALYSIS, true, true, paramZbnt, paramSupplier);
      if (((Boolean)paramSupplier.get()).booleanValue())
        return null; 
      this.Zv = new Zgyq(Za(), this, zs68);
      this.Zz = false;
    } 
    return this.Zv;
  }
  
  private void Zx() {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: getstatic burp/Zx0.ZE : [I
    //   7: aload_0
    //   8: getfield Zp : Lburp/Zgu3;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: lookupswitch default -> 54, 1 -> 40, 2 -> 49
    //   40: aload_0
    //   41: iconst_1
    //   42: putfield Zx : Z
    //   45: aload_1
    //   46: ifnull -> 54
    //   49: aload_0
    //   50: iconst_1
    //   51: putfield Zz : Z
    //   54: return
  }
  
  public Zt7b Zk() {
    return this.ZD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */