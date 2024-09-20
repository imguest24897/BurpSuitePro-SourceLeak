package burp;

import java.awt.Component;
import java.util.Objects;
import net.portswigger.Zoq;

public class Zxsz implements Zkuk {
  private final Zbiv ZS;
  
  private final Zlfb ZV;
  
  private final Zl2b Zf;
  
  private final Zgh7 ZU;
  
  private Zbvn ZL;
  
  private Zoq<Zbhk> Z_;
  
  private Zbhg ZY;
  
  private static boolean ZJ;
  
  public Zxsz(Zbiv paramZbiv, Zlfb paramZlfb, Zl2b paramZl2b, Zgh7 paramZgh7, Zlli<Zt13> paramZlli) {
    this.ZS = paramZbiv;
    this.ZV = paramZlfb;
    this.Zf = paramZl2b;
    this.ZU = paramZgh7;
    boolean bool = Zw();
    paramZlli.ZE(Zt13.Zd, this::lambda$new$0);
    paramZlli.ZE(Zt13.Zv, this::lambda$new$2);
    if (Zbqc.Zwu() == null)
      Zn(!bool); 
  }
  
  public void Zu(Zt0s paramZt0s) {
    this.ZL = this.Zf.ZZ(paramZt0s);
    this.Z_ = this.ZU.ZZ(paramZt0s);
    boolean bool = ZR();
    Objects.requireNonNull(this.ZV);
    Objects.requireNonNull(this.ZV);
    this.ZY = new Zbhg(this.ZL, (Zoq)this.Z_, this.ZV::ZE, this.ZV::ZF);
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Component Zg() {
    return this.ZL.ZB();
  }
  
  public void ZL(boolean paramBoolean) {
    this.ZL.ZF(paramBoolean);
    this.ZY.Zt(paramBoolean);
  }
  
  void ZA(boolean paramBoolean) {
    this.ZL.ZK(paramBoolean);
    this.Z_.ZV(paramBoolean::lambda$setCapturing$3);
  }
  
  public void Zb() {
    this.ZL.Zb();
    this.Z_.ZV(Zbhh::ZD);
  }
  
  public void Zs() {
    this.ZL.Zs();
    this.Z_.ZV(Zbhh::ZI);
  }
  
  public void Zm() {}
  
  public void Zj() {
    this.ZL.Zj();
  }
  
  public void Zf() {
    this.ZY.Ze();
  }
  
  public void ZA() {
    this.ZY.Zd();
  }
  
  public final Zbhg Zd() {
    return this.ZY;
  }
  
  public void ZB(String paramString1, String paramString2) {
    this.ZL.Zj(paramString1, paramString2);
    this.Z_.ZV(paramString1::lambda$setTaskName$4);
  }
  
  void ZL(String paramString) {
    this.Z_.ZV(paramString::lambda$setScope$5);
  }
  
  void ZB(String paramString) {
    this.ZL.ZN(paramString);
    this.Z_.ZV(paramString::lambda$setConfigDescription$6);
  }
  
  void ZV(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.ZL.Zw(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void Zj(String paramString) {
    this.Z_.ZV(paramString::lambda$appendToPopoutLog$7);
  }
  
  void ZQ(Component paramComponent, Ztj1 paramZtj1, Ztr3 paramZtr3) {
    this.ZS.Zg(paramComponent, paramZtj1, paramZtr3);
  }
  
  private static void lambda$appendToPopoutLog$7(String paramString, Zbhk paramZbhk) {
    paramZbhk.ZD(paramString);
  }
  
  private static void lambda$setConfigDescription$6(String paramString, Zbhk paramZbhk) {
    paramZbhk.Zq(paramString);
  }
  
  private static void lambda$setScope$5(String paramString, Zbhk paramZbhk) {
    paramZbhk.Zn(paramString);
  }
  
  private static void lambda$setTaskName$4(String paramString, Zbhk paramZbhk) {
    paramZbhk.ZO(paramString);
  }
  
  private static void lambda$setCapturing$3(boolean paramBoolean, Zbhk paramZbhk) {
    paramZbhk.ZO(paramBoolean);
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$1);
  }
  
  private void lambda$new$1(Ztj1 paramZtj1) {
    ZB(paramZtj1.ZO(), paramZtj1.ZM());
    ZL(paramZtj1.Zs());
    ZB(paramZtj1.Zz());
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    this.ZL.Zj();
  }
  
  public static void Zn(boolean paramBoolean) {
    ZJ = paramBoolean;
  }
  
  public static boolean Zw() {
    return ZJ;
  }
  
  public static boolean ZR() {
    boolean bool = Zw();
    return !bool;
  }
  
  static {
    if (!ZR())
      Zn(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxsz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */