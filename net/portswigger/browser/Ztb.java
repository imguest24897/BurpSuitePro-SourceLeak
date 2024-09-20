package net.portswigger.browser;

import burp.Zgrn;
import burp.Zxr8;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class Ztb extends Zta {
  private final Zc1 Zr;
  
  private final AtomicReference<Zc9> Za;
  
  private final List<Zgrn> ZQ;
  
  public Ztb(Zc1 paramZc1, int paramInt, Zcl paramZcl) {
    super(paramInt, paramZcl);
    this.Zr = paramZc1;
    this.Za = new AtomicReference<>();
    this.ZQ = new LinkedList<>();
  }
  
  public boolean Zv() {
    boolean bool = super.Zv();
    if (bool) {
      this.ZQ.add(this.Zr.ZE(Zck.ZD, this::lambda$start$1));
      this.ZQ.add(this.Zr.ZE(Zck.Zf, this::lambda$start$3));
      this.Zr.Zj().Zc().ifPresent(this::ZY);
    } 
    return bool;
  }
  
  private void ZY(Zjw paramZjw) {
    Zeg zeg = paramZjw.Zx().ZI(this.ZG, this.Zm);
    Zc9 zc9 = this.Za.getAndSet(new Zc9(paramZjw, zeg));
    if (zc9 != null)
      zc9.Zd(); 
    zeg.Zc().ZE(Zc2.ZR, this::lambda$start$4);
    zeg.Zv();
  }
  
  private void Zx(Zct paramZct) {
    this.ZN.ZD(new Zxr8(Zc2.ZR, paramZct.ZX(Zk())));
  }
  
  private void Zf(Zjc paramZjc) {
    Zc9 zc9 = this.Za.get();
    if (zc9 != null && zc9.Zj(paramZjc))
      this.Zr.Zj().Zc().ifPresent(this::ZY); 
  }
  
  public void Zd() {
    super.Zd();
    ZE(Zeg::Zd);
  }
  
  public void ZY() {
    super.ZY();
    ZE(Zeg::ZY);
  }
  
  public void Zh(String paramString) {
    super.Zh(paramString);
    ZE(paramString::lambda$fail$5);
  }
  
  protected void Zi() {
    try {
      super.Zi();
    } finally {
      this.ZQ.forEach(Zgrn::ZZ);
      this.ZQ.clear();
    } 
  }
  
  private void ZE(Consumer<Zc9> paramConsumer) {
    Zc9 zc9 = this.Za.get();
    if (zc9 != null)
      paramConsumer.accept(zc9); 
  }
  
  private static void lambda$fail$5(String paramString, Zc9 paramZc9) {
    paramZc9.Zh(paramString);
  }
  
  private void lambda$start$4(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zx);
  }
  
  private void lambda$start$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$start$2);
  }
  
  private void lambda$start$2(Zcf paramZcf) {
    Zf(paramZcf.Zv());
  }
  
  private void lambda$start$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$start$0);
  }
  
  private void lambda$start$0(Zez paramZez) {
    paramZez.Zx(this::ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Ztb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */