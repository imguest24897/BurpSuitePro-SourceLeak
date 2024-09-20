package burp;

import java.time.Duration;
import java.util.EnumSet;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zuq extends Zu3 implements Zz2s {
  @Zzvo(17)
  private final Zrpj ZK;
  
  @Zzvo(22)
  private final Zl34 Zg;
  
  @Zzvo(23)
  private final Zl34 ZL;
  
  @Zzvo(16)
  private boolean Zj = true;
  
  @Zzvo(18)
  private boolean ZC;
  
  @Zzvo(19)
  private boolean Z_;
  
  @Zzvo(20)
  private boolean Zu;
  
  @Zzvo(24)
  private boolean ZJ;
  
  private Zmet Zf;
  
  protected Zuq(int paramInt, String paramString1, String paramString2, String paramString3, Zrpj paramZrpj, Zmet paramZmet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Zl34 paramZl341, Zl34 paramZl342) {
    super(paramInt, paramString1, paramString2, paramString3);
    this.Zf = paramZmet;
    this.ZC = paramBoolean1;
    this.Z_ = paramBoolean2;
    this.Zu = paramBoolean3;
    this.ZJ = paramBoolean4;
    this.ZK = paramZrpj;
    int[] arrayOfInt = Zmup.ZN();
    this.Zg = paramZl341;
    this.ZL = paramZl342;
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public boolean ZPp() {
    return this.Zj;
  }
  
  public void ZKt(boolean paramBoolean) {
    this.Zj = paramBoolean;
  }
  
  public Zlae ZPT() {
    return new Zlae(this.ZK);
  }
  
  public EnumSet<Zmup> ZPW() {
    return Zb__.Zm(this.ZC, this.Z_, this.Zu);
  }
  
  public void ZKn(boolean paramBoolean) {
    this.ZC = paramBoolean;
  }
  
  public void ZKH(boolean paramBoolean) {
    this.Z_ = paramBoolean;
  }
  
  public void ZKG(boolean paramBoolean) {
    this.Zu = paramBoolean;
  }
  
  public Zmet ZGk() {
    return this.Zf;
  }
  
  public void ZF(Zmet paramZmet) {
    this.Zf = paramZmet;
  }
  
  public Zl34 ZGY() {
    return this.Zg;
  }
  
  public Zl34 ZGp() {
    return this.ZL;
  }
  
  public boolean ZPG() {
    return this.ZJ;
  }
  
  public void ZK8(boolean paramBoolean) {
    this.ZJ = paramBoolean;
  }
  
  @Zzvo(21)
  private byte Ztx() {
    return this.Zf.id;
  }
  
  public void Zr(Duration paramDuration) {
    Zuh.Zb(false, Zqf.ZC);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zuq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */