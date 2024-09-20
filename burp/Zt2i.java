package burp;

import java.util.concurrent.atomic.AtomicBoolean;

public class Zt2i {
  private final AtomicBoolean ZL;
  
  private final AtomicBoolean ZN;
  
  private final AtomicBoolean ZI;
  
  private final AtomicBoolean ZQ;
  
  private final AtomicBoolean ZC;
  
  private final AtomicBoolean ZU;
  
  private final AtomicBoolean Za;
  
  private final AtomicBoolean Zq;
  
  private final AtomicBoolean ZY;
  
  public Zt2i(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9) {
    this.ZL = new AtomicBoolean(paramBoolean1);
    this.ZN = new AtomicBoolean(paramBoolean2);
    this.ZI = new AtomicBoolean(paramBoolean3);
    this.ZQ = new AtomicBoolean(paramBoolean4);
    this.ZC = new AtomicBoolean(paramBoolean5);
    this.ZU = new AtomicBoolean(paramBoolean6);
    this.Za = new AtomicBoolean(paramBoolean7);
    this.Zq = new AtomicBoolean(paramBoolean8);
    this.ZY = new AtomicBoolean(paramBoolean9);
  }
  
  void ZM(boolean paramBoolean) {
    this.ZL.set(paramBoolean);
  }
  
  boolean ZM() {
    return this.ZL.get();
  }
  
  void ZP(boolean paramBoolean) {
    this.ZN.set(paramBoolean);
  }
  
  boolean Zo() {
    return this.ZN.get();
  }
  
  void ZI(boolean paramBoolean) {
    this.ZI.set(paramBoolean);
  }
  
  boolean ZB() {
    return this.ZI.get();
  }
  
  void ZS(boolean paramBoolean) {
    this.ZQ.set(paramBoolean);
  }
  
  boolean ZE() {
    return this.ZQ.get();
  }
  
  void Zu(boolean paramBoolean) {
    this.ZC.set(paramBoolean);
  }
  
  boolean ZK() {
    return this.ZC.get();
  }
  
  void ZO(boolean paramBoolean) {
    this.ZU.set(paramBoolean);
  }
  
  boolean ZS() {
    return this.ZU.get();
  }
  
  void ZU(boolean paramBoolean) {
    this.Za.set(paramBoolean);
  }
  
  boolean Za() {
    return this.Za.get();
  }
  
  void ZV(boolean paramBoolean) {
    this.Zq.set(paramBoolean);
  }
  
  boolean Zr() {
    return this.Zq.get();
  }
  
  boolean Zt() {
    return (this.ZN.get() || this.ZI.get() || this.ZQ.get() || this.ZC.get());
  }
  
  public void ZN(boolean paramBoolean) {
    this.ZY.set(paramBoolean);
  }
  
  boolean Zh() {
    return this.ZY.get();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt2i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */