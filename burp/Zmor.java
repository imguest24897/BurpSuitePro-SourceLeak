package burp;

import java.awt.Component;
import net.portswigger.Zoq;

public class Zmor extends Zmog {
  private final Zbiv ZD;
  
  private final Zbvz Zv;
  
  private final Zoq<Zbh7> ZB;
  
  public Zmor(Zbiv paramZbiv, Zlfb paramZlfb, Zbvz paramZbvz, Zoq<Zbh7> paramZoq, Zlli<Zt13> paramZlli) {
    super(paramZbvz, paramZlfb, (Zoq)paramZoq);
    this.ZD = paramZbiv;
    this.Zv = paramZbvz;
    this.ZB = paramZoq;
    String[] arrayOfString = Zzl5.ZH();
    paramZlli.ZE(Zt13.Zd, paramZbvz::lambda$new$0);
    paramZlli.ZE(Zt13.Zv, this::lambda$new$2);
    if (Zbqc.Zwu() == null)
      Zzl5.Zk(new String[4]); 
  }
  
  public Component Zg() {
    return this.Zv.ZB();
  }
  
  void Zx(String paramString) {
    this.ZB.ZV(paramString::lambda$setScope$3);
  }
  
  void Zu(String paramString) {
    this.Zv.ZW(paramString);
    this.ZB.ZV(paramString::lambda$setConfigDescription$4);
  }
  
  void ZI(String paramString) {
    this.Zv.Zh(paramString);
  }
  
  void ZD(int paramInt) {
    this.Zv.ZO(paramInt);
  }
  
  void ZW(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zv.ZK(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void Ze(Component paramComponent, Ztj1 paramZtj1, Zr5h paramZr5h) {
    this.ZD.Zg(paramComponent, paramZtj1, paramZr5h);
  }
  
  public void ZH(String paramString) {
    this.ZB.ZV(paramString::lambda$appendToPopoutLog$5);
  }
  
  private static void lambda$appendToPopoutLog$5(String paramString, Zbh7 paramZbh7) {
    paramZbh7.ZT(paramString);
  }
  
  private static void lambda$setConfigDescription$4(String paramString, Zbh7 paramZbh7) {
    paramZbh7.Za(paramString);
  }
  
  private static void lambda$setScope$3(String paramString, Zbh7 paramZbh7) {
    paramZbh7.ZH(paramString);
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$1);
  }
  
  private void lambda$new$1(Ztj1 paramZtj1) {
    ZB(paramZtj1.ZO(), paramZtj1.ZM());
    Zx(paramZtj1.Zs());
    Zu(paramZtj1.Zz());
  }
  
  private static void lambda$new$0(Zbvz paramZbvz, Zxr8 paramZxr8) {
    paramZbvz.Zj();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */