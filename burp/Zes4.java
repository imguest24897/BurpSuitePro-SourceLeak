package burp;

import java.awt.Component;
import java.util.Objects;
import net.portswigger.Zoq;

public class Zes4 implements Zkuk {
  private final Zbiv Zn;
  
  private final Zlfb ZR;
  
  private final Ze7u ZJ;
  
  private final Zb80 Z_;
  
  private Zbv_ Zc;
  
  private Zoq<Zbhc> ZH;
  
  private Zbhg Zz;
  
  private static String[] Zr;
  
  public Zes4(Zbiv paramZbiv, Zlfb paramZlfb, Ze7u paramZe7u, Zb80 paramZb80, Zlli<Zt13> paramZlli) {
    this.Zn = paramZbiv;
    this.ZR = paramZlfb;
    this.ZJ = paramZe7u;
    this.Z_ = paramZb80;
    paramZlli.ZE(Zt13.Zv, this::lambda$new$1);
  }
  
  public void Zg(Zkye paramZkye) {
    this.Zc = this.ZJ.ZW(paramZkye);
    this.ZH = this.Z_.Zr(paramZkye);
    String[] arrayOfString = ZX();
    Objects.requireNonNull(this.ZR);
    Objects.requireNonNull(this.ZR);
    this.Zz = new Zbhg(this.Zc, (Zoq)this.ZH, this.ZR::ZE, this.ZR::ZF);
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Component Zg() {
    return this.Zc.ZB();
  }
  
  public void ZL(boolean paramBoolean) {
    this.Zc.ZF(paramBoolean);
    this.Zz.Zt(paramBoolean);
  }
  
  public void Zb() {
    this.Zc.Zb();
    this.ZH.ZV(Zbhh::ZD);
  }
  
  public void Zs() {
    this.Zc.Zs();
    this.ZH.ZV(Zbhh::ZI);
  }
  
  public void Zm() {}
  
  public void Zj() {
    this.Zc.Zj();
  }
  
  public void Zf() {
    this.Zz.Ze();
  }
  
  public void ZA() {
    this.Zz.Zd();
  }
  
  public void ZB(String paramString1, String paramString2) {
    this.Zc.Zj(paramString1, paramString2);
    this.ZH.ZV(paramString1::lambda$setTaskName$2);
  }
  
  public final Zbhg Zd() {
    return this.Zz;
  }
  
  void ZM(String paramString) {
    this.ZH.ZV(paramString::lambda$setScope$3);
  }
  
  void Zl(String paramString) {
    this.Zc.Zy(paramString);
    this.ZH.ZV(paramString::lambda$setConfigDescription$4);
  }
  
  void Zc(boolean paramBoolean) {
    this.Zc.ZO(paramBoolean);
    this.ZH.ZV(paramBoolean::lambda$setCapturing$5);
  }
  
  void ZD(int paramInt) {
    this.ZH.ZV(paramInt::lambda$updateSiteMapItemsAddedCount$6);
  }
  
  void ZF(int paramInt) {
    this.ZH.ZV(paramInt::lambda$updateResponsesProcessedCount$7);
  }
  
  void Zn(int paramInt) {
    this.ZH.ZV(paramInt::lambda$updateResponsesQueuedCount$8);
  }
  
  public void Zv(String paramString) {
    this.ZH.ZV(paramString::lambda$appendToPopoutLog$9);
  }
  
  public void ZO() {
    this.ZH.ZV(Zbhc::ZY);
  }
  
  public void ZE(int paramInt) {
    this.ZH.ZV(paramInt::lambda$mapItemUpdated$10);
  }
  
  public void Zx(int paramInt) {
    this.ZH.ZV(paramInt::lambda$mapItemRemoved$11);
  }
  
  void ZJ(Component paramComponent, Ztj1 paramZtj1, Ze9i paramZe9i) {
    this.Zn.Zg(paramComponent, paramZtj1, paramZe9i);
  }
  
  private static void lambda$mapItemRemoved$11(int paramInt, Zbhc paramZbhc) {
    paramZbhc.Zs(paramInt);
  }
  
  private static void lambda$mapItemUpdated$10(int paramInt, Zbhc paramZbhc) {
    paramZbhc.ZE(paramInt);
  }
  
  private static void lambda$appendToPopoutLog$9(String paramString, Zbhc paramZbhc) {
    paramZbhc.Zq(paramString);
  }
  
  private static void lambda$updateResponsesQueuedCount$8(int paramInt, Zbhc paramZbhc) {
    paramZbhc.Zl(paramInt);
  }
  
  private static void lambda$updateResponsesProcessedCount$7(int paramInt, Zbhc paramZbhc) {
    paramZbhc.Zq(paramInt);
  }
  
  private static void lambda$updateSiteMapItemsAddedCount$6(int paramInt, Zbhc paramZbhc) {
    paramZbhc.Zv(paramInt);
  }
  
  private static void lambda$setCapturing$5(boolean paramBoolean, Zbhc paramZbhc) {
    paramZbhc.Za(paramBoolean);
  }
  
  private static void lambda$setConfigDescription$4(String paramString, Zbhc paramZbhc) {
    paramZbhc.Zz(paramString);
  }
  
  private static void lambda$setScope$3(String paramString, Zbhc paramZbhc) {
    paramZbhc.Zh(paramString);
  }
  
  private static void lambda$setTaskName$2(String paramString, Zbhc paramZbhc) {
    paramZbhc.ZO(paramString);
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$0);
  }
  
  private void lambda$new$0(Ztj1 paramZtj1) {
    ZB(paramZtj1.ZO(), paramZtj1.ZM());
    ZM(paramZtj1.Zs());
    Zl(paramZtj1.Zz());
  }
  
  public static void ZI(String[] paramArrayOfString) {
    Zr = paramArrayOfString;
  }
  
  public static String[] ZX() {
    return Zr;
  }
  
  static {
    if (ZX() == null)
      ZI(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zes4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */