package burp;

import java.awt.Component;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Zmk3 implements Zle3, Zkgx {
  private final Zmjk Zv;
  
  private final Zbde ZB;
  
  private final Zl2p ZD;
  
  private final Supplier<Boolean> ZE;
  
  private final AtomicInteger Zn = new AtomicInteger(0);
  
  private Zo4 ZA;
  
  Zmk3(Zo4 paramZo4, String paramString, Zl2p paramZl2p, Supplier<Boolean> paramSupplier) {
    this.Zv = paramZo4.Z_();
    this.ZD = paramZl2p;
    this.ZE = paramSupplier;
    this.ZA = paramZo4;
    this.ZB = new Zbde(paramString, paramZl2p);
    paramZl2p.Zc(paramZo4);
    this.ZB.ZR();
  }
  
  public Zmjk ZK() {
    return this.Zv;
  }
  
  public void ZU(Zliz paramZliz) {
    this.ZA = paramZliz.Zx(this.Zv);
    this.Zn.incrementAndGet();
    this.ZB.Zi(this.ZA.Zk());
    this.ZD.Zc(this.ZA);
  }
  
  public Component ZP() {
    return this.ZB;
  }
  
  public void ZJ(String paramString) {
    this.ZB.setName(paramString);
  }
  
  public void Zo() {
    this.ZB.Zi(false);
  }
  
  public void Zt() {
    if (this.ZD.Zl() > 0)
      this.ZB.Zi(true); 
  }
  
  public void ZB() {
    String str = Zbdm.Zy();
    if (((Boolean)this.ZE.get()).booleanValue()) {
      this.ZD.ZN();
      this.ZB.ZR();
      this.ZB.setVisible(true);
      if (str != null) {
        this.ZB.setVisible(false);
        return;
      } 
      return;
    } 
    this.ZB.setVisible(false);
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZB : Lburp/Zbde;
    //   4: invokevirtual ZH : ()Z
    //   7: istore_1
    //   8: aload_0
    //   9: getfield Zn : Ljava/util/concurrent/atomic/AtomicInteger;
    //   12: invokevirtual get : ()I
    //   15: istore_2
    //   16: aload_0
    //   17: getfield ZD : Lburp/Zl2p;
    //   20: invokeinterface ZI : ()Lburp/Ztcw;
    //   25: astore_3
    //   26: aload_0
    //   27: iload_2
    //   28: iload_1
    //   29: aload_3
    //   30: <illegal opcode> Zg : (Lburp/Zmk3;IZLburp/Ztcw;)Lburp/Ztcw;
    //   35: areturn
  }
  
  public void ZU() {
    this.ZB.Zi(this.ZA.Zk());
  }
  
  private void lambda$checkpoint$0(int paramInt, boolean paramBoolean, Ztcw paramZtcw) {
    boolean bool = (paramInt < this.Zn.get()) ? true : false;
    this.ZB.Zi(bool ? this.ZA.Zk() : paramBoolean);
    paramZtcw.Zg();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmk3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */