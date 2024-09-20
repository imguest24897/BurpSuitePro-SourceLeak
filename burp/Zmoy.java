package burp;

import java.awt.Component;
import net.portswigger.Zoq;
import net.portswigger.browser.Zct;

public class Zmoy extends Zmog {
  private final Zbiv Zr;
  
  private final Zbvz Zm;
  
  private final Zoq<Zbhb> Zp;
  
  private static String Zb;
  
  public Zmoy(Zbiv paramZbiv, Zlfb paramZlfb, Zbvz paramZbvz, Zoq<Zbhb> paramZoq, Zlli<Zt13> paramZlli) {
    super(paramZbvz, paramZlfb, (Zoq)paramZoq);
    this.Zr = paramZbiv;
    String str = ZW();
    this.Zm = paramZbvz;
    this.Zp = paramZoq;
    paramZlli.ZE(Zt13.Zd, paramZbvz::lambda$new$0);
    paramZlli.ZE(Zt13.Zv, this::lambda$new$2);
    if (Zbqc.Zwu() == null)
      Zo("Q1Gap"); 
  }
  
  public Component Zg() {
    return this.Zm.ZB();
  }
  
  void Zx(String paramString) {
    this.Zp.ZV(paramString::lambda$setScope$3);
  }
  
  void ZA(String paramString) {
    this.Zm.ZW(paramString);
    this.Zp.ZV(paramString::lambda$setConfigDescription$4);
  }
  
  void Zp(boolean paramBoolean) {
    this.Zp.ZV(paramBoolean::lambda$setCrawling$5);
  }
  
  void ZC(String paramString) {
    this.Zm.Zh(paramString);
  }
  
  void ZN(int paramInt) {
    this.Zm.ZO(paramInt);
  }
  
  void Zu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zm.ZK(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void ZD(int paramInt) {
    this.Zp.ZV(paramInt::lambda$updateUniqueLocations$6);
  }
  
  void Ze(int paramInt) {
    this.Zp.ZV(paramInt::lambda$updatePendingActions$7);
  }
  
  void ZR(int paramInt) {
    this.Zp.ZV(paramInt::lambda$updateCurrentDepth$8);
  }
  
  void ZI(Zct paramZct) {
    this.Zp.ZV(paramZct::lambda$setCurrentFrame$9);
  }
  
  void ZL(Component paramComponent, Ztj1 paramZtj1, Zzep paramZzep) {
    this.Zr.Zg(paramComponent, paramZtj1, paramZzep);
  }
  
  void ZW(String paramString) {
    this.Zp.ZV(paramString::lambda$appendToPopoutLog$10);
  }
  
  private static void lambda$appendToPopoutLog$10(String paramString, Zbhb paramZbhb) {
    paramZbhb.Zb(paramString);
  }
  
  private static void lambda$setCurrentFrame$9(Zct paramZct, Zbhb paramZbhb) {
    paramZbhb.Zb(paramZct);
  }
  
  private static void lambda$updateCurrentDepth$8(int paramInt, Zbhb paramZbhb) {
    paramZbhb.Z_(paramInt);
  }
  
  private static void lambda$updatePendingActions$7(int paramInt, Zbhb paramZbhb) {
    paramZbhb.ZR(paramInt);
  }
  
  private static void lambda$updateUniqueLocations$6(int paramInt, Zbhb paramZbhb) {
    paramZbhb.ZO(paramInt);
  }
  
  private static void lambda$setCrawling$5(boolean paramBoolean, Zbhb paramZbhb) {
    paramZbhb.Zm(paramBoolean);
  }
  
  private static void lambda$setConfigDescription$4(String paramString, Zbhb paramZbhb) {
    paramZbhb.Zx(paramString);
  }
  
  private static void lambda$setScope$3(String paramString, Zbhb paramZbhb) {
    paramZbhb.Zh(paramString);
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$1);
  }
  
  private void lambda$new$1(Ztj1 paramZtj1) {
    ZB(paramZtj1.ZO(), paramZtj1.ZM());
    Zx(paramZtj1.Zs());
    ZA(paramZtj1.Zz());
  }
  
  private static void lambda$new$0(Zbvz paramZbvz, Zxr8 paramZxr8) {
    paramZbvz.Zj();
  }
  
  public static void Zo(String paramString) {
    Zb = paramString;
  }
  
  public static String ZW() {
    return Zb;
  }
  
  static {
    if (ZW() == null)
      Zo("HkK6gb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmoy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */