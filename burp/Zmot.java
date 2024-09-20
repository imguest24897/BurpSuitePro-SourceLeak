package burp;

import java.awt.Component;
import net.portswigger.Zoq;
import net.portswigger.browser.Zct;

public class Zmot extends Zmog {
  private final Zbiv ZX;
  
  private final Zbvx Zo;
  
  private final Zoq<Zbhv> ZJ;
  
  private static int Zj;
  
  public Zmot(Zbiv paramZbiv, Zlfb paramZlfb, Zbvx paramZbvx, Zoq<Zbhv> paramZoq, Zlli<Zt13> paramZlli) {
    super(paramZbvx, paramZlfb, (Zoq)paramZoq);
    this.ZX = paramZbiv;
    this.Zo = paramZbvx;
    this.ZJ = paramZoq;
    paramZlli.ZE(Zt13.Zd, paramZbvx::lambda$new$0);
    int i = ZZ();
    paramZlli.ZE(Zt13.Zv, this::lambda$new$2);
    if (Zbqc.Zwu() == null)
      ZO(++i); 
  }
  
  void ZW(String paramString) {
    this.ZJ.ZV(paramString::lambda$setScope$3);
  }
  
  void ZV(String paramString) {
    this.Zo.ZW(paramString);
    this.ZJ.ZV(paramString::lambda$setConfigDescription$4);
  }
  
  void ZO(String paramString) {
    this.Zo.Zf(paramString);
  }
  
  void ZU(int paramInt) {
    this.Zo.ZG(paramInt);
  }
  
  void ZS(boolean paramBoolean) {}
  
  void ZY(int paramInt) {
    this.ZJ.ZV(paramInt::lambda$updateUniqueLocations$5);
  }
  
  void Zs(int paramInt) {
    this.ZJ.ZV(paramInt::lambda$updatePendingActions$6);
  }
  
  void ZL(int paramInt) {
    this.ZJ.ZV(paramInt::lambda$updateCurrentDepth$7);
  }
  
  void ZO(Zct paramZct) {
    this.ZJ.ZV(paramZct::lambda$setCurrentFrame$8);
  }
  
  void Ze() {
    this.ZJ.ZV(Zbhv::ZX);
  }
  
  void Zx(int paramInt) {
    this.ZJ.ZV(paramInt::lambda$mapItemUpdated$9);
  }
  
  void ZN(int paramInt) {
    this.ZJ.ZV(paramInt::lambda$mapItemRemoved$10);
  }
  
  void Zz(Component paramComponent, Ztj1 paramZtj1, Zlog paramZlog) {
    this.ZX.Zg(paramComponent, paramZtj1, paramZlog);
  }
  
  void Zr(String paramString) {
    this.ZJ.ZV(paramString::lambda$appendToPopoutLog$11);
  }
  
  private static void lambda$appendToPopoutLog$11(String paramString, Zbhv paramZbhv) {
    paramZbhv.Zh(paramString);
  }
  
  private static void lambda$mapItemRemoved$10(int paramInt, Zbhv paramZbhv) {
    paramZbhv.ZV(paramInt);
  }
  
  private static void lambda$mapItemUpdated$9(int paramInt, Zbhv paramZbhv) {
    paramZbhv.ZU(paramInt);
  }
  
  private static void lambda$setCurrentFrame$8(Zct paramZct, Zbhv paramZbhv) {
    paramZbhv.Zl(paramZct);
  }
  
  private static void lambda$updateCurrentDepth$7(int paramInt, Zbhv paramZbhv) {
    paramZbhv.ZN(Integer.valueOf(paramInt));
  }
  
  private static void lambda$updatePendingActions$6(int paramInt, Zbhv paramZbhv) {
    paramZbhv.ZM(Integer.valueOf(paramInt));
  }
  
  private static void lambda$updateUniqueLocations$5(int paramInt, Zbhv paramZbhv) {
    paramZbhv.ZS(paramInt);
  }
  
  private static void lambda$setConfigDescription$4(String paramString, Zbhv paramZbhv) {
    paramZbhv.Zd(paramString);
  }
  
  private static void lambda$setScope$3(String paramString, Zbhv paramZbhv) {
    paramZbhv.Zr(paramString);
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$1);
  }
  
  private void lambda$new$1(Ztj1 paramZtj1) {
    ZB(paramZtj1.ZO(), paramZtj1.ZM());
    ZW(paramZtj1.Zs());
    ZV(paramZtj1.Zz());
  }
  
  private static void lambda$new$0(Zbvx paramZbvx, Zxr8 paramZxr8) {
    paramZbvx.Zj();
  }
  
  public static void ZO(int paramInt) {
    Zj = paramInt;
  }
  
  public static int ZZ() {
    return Zj;
  }
  
  public static int ZE() {
    int i = ZZ();
    return (i == 0) ? 58 : 0;
  }
  
  static {
    if (ZE() == 0)
      ZO(34); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */