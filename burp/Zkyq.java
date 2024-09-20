package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Zkyq {
  protected final Ztj1 Ze;
  
  private final Zkuk ZG;
  
  private final Ztef ZW;
  
  private final AtomicBoolean ZX;
  
  private final List<Zgrn> ZD;
  
  private boolean ZC;
  
  private static int[] Zi;
  
  protected Zkyq(Ztj1 paramZtj1, Zkuk paramZkuk, Ztef paramZtef) {
    this.Ze = paramZtj1;
    this.ZG = paramZkuk;
    this.ZW = paramZtef;
    this.ZX = new AtomicBoolean();
    this.ZD = new ArrayList<>();
  }
  
  public int Zi() {
    return this.Ze.Zh();
  }
  
  public String ZU() {
    return this.Ze.ZO();
  }
  
  public Component Zg() {
    return this.ZG.Zg();
  }
  
  public Zbhg ZJ() {
    return this.ZG.Zd();
  }
  
  public void ZL(boolean paramBoolean) {
    this.ZG.ZL(paramBoolean);
  }
  
  public void Zu() {
    this.ZC = true;
    this.ZG.Zf();
    Zq();
  }
  
  public void Zo() {
    if (this.ZC) {
      this.ZC = false;
      this.ZG.ZA();
    } 
  }
  
  public void Zq() {}
  
  public boolean Za() {
    return (!this.Ze.ZE() && !this.ZX.get());
  }
  
  public boolean ZX() {
    return this.Ze.ZE();
  }
  
  public boolean ZY() {
    return this.ZX.get();
  }
  
  public void Z_() {
    int[] arrayOfInt = ZM();
    if (this.ZX.get())
      return; 
    if (this.Ze.ZE()) {
      this.Ze.Zp();
      if (arrayOfInt != null) {
        this.Ze.Zv();
        return;
      } 
      return;
    } 
    this.Ze.Zv();
  }
  
  public boolean Zm(String paramString) {
    if (paramString == null || paramString.isEmpty())
      return true; 
    String str = paramString.toLowerCase(Locale.ENGLISH);
    return (this.Ze.ZO().toLowerCase(Locale.ENGLISH).contains(str) || this.Ze.Zz().toLowerCase(Locale.ENGLISH).contains(str)) ? true : Zc(str);
  }
  
  protected boolean Zc(String paramString) {
    return false;
  }
  
  public void ZG(String paramString) {
    this.Ze.ZN(paramString);
    this.ZG.ZB(this.Ze.ZO(), this.Ze.ZM());
  }
  
  public abstract void Zp(Component paramComponent);
  
  public Zkcl ZZ() {
    return this.Ze.Zl();
  }
  
  public void ZP() {
    if (this.ZX.compareAndSet(false, true)) {
      this.ZG.Zm();
      this.ZW.ZG();
    } 
  }
  
  public void ZF(Zlli<Zt13> paramZlli) {
    this.ZD.add(paramZlli.ZE(Zt13.ZC, this::lambda$subscribeTo$1));
    this.ZD.add(paramZlli.ZE(Zt13.ZV, this::lambda$subscribeTo$3));
    this.ZD.add(paramZlli.ZE(Zt13.Ze, this::lambda$subscribeTo$4));
    this.ZD.add(paramZlli.ZE(Zt13.ZZ, this::lambda$subscribeTo$4));
  }
  
  protected void Zp() {
    this.ZX.set(false);
    this.ZG.Zs();
    this.ZW.ZG();
  }
  
  private void ZO() {
    this.ZX.set(false);
    this.ZG.Zb();
    this.ZW.ZG();
  }
  
  protected void Zh() {
    int[] arrayOfInt = ZM();
    if (this.ZX.compareAndSet(true, false)) {
      if (this.Ze.ZE()) {
        Zp();
        if (arrayOfInt != null) {
          ZO();
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    ZO();
  }
  
  public void Ze() {
    this.ZG.Zo();
  }
  
  public void ZL() {
    this.ZG.ZS();
  }
  
  public void Zk() {
    this.ZD.forEach(Zgrn::ZZ);
    this.ZD.clear();
  }
  
  public void Zy() {
    this.ZG.Zq();
  }
  
  private void lambda$subscribeTo$4(Zxr8 paramZxr8) {
    Zh();
  }
  
  private void lambda$subscribeTo$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeTo$2);
  }
  
  private void lambda$subscribeTo$2(Ztak paramZtak) {
    if (paramZtak.ZX())
      ZO(); 
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeTo$0);
  }
  
  private void lambda$subscribeTo$0(Zst9 paramZst9) {
    if (paramZst9.ZB())
      Zp(); 
  }
  
  public static void ZB(int[] paramArrayOfint) {
    Zi = paramArrayOfint;
  }
  
  public static int[] ZM() {
    return Zi;
  }
  
  static {
    if (ZM() != null)
      ZB(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */