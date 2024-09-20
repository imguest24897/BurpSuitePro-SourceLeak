package burp;

import java.util.concurrent.atomic.AtomicInteger;

public class Zua extends Zni implements Zefk {
  private final AtomicInteger Zc = new AtomicInteger();
  
  private final AtomicInteger ZY = new AtomicInteger();
  
  private final AtomicInteger Zy = new AtomicInteger();
  
  private final AtomicInteger Zu = new AtomicInteger();
  
  private final AtomicInteger ZT = new AtomicInteger();
  
  private final AtomicInteger ZB;
  
  private static int[] Zk;
  
  public Zua() {
    int[] arrayOfInt = Zqt();
    this.ZB = new AtomicInteger();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zeu4<Zefk> ZF() {
    return Z_;
  }
  
  @Zzvo(1)
  public int ZQ6() {
    return this.Zc.get();
  }
  
  public int ZQK() {
    return this.Zc.incrementAndGet();
  }
  
  public void Zbm(int paramInt) {
    this.Zc.set(paramInt);
  }
  
  @Zzvo(2)
  public int ZQE() {
    return this.ZY.get();
  }
  
  public int ZQv() {
    return this.ZY.incrementAndGet();
  }
  
  public void Zbb(int paramInt) {
    this.ZY.set(paramInt);
  }
  
  @Zzvo(3)
  public int ZQ_() {
    return this.Zy.get();
  }
  
  public void ZbB(int paramInt) {
    this.Zy.set(paramInt);
  }
  
  @Zzvo(4)
  public int ZQZ() {
    return this.Zu.get();
  }
  
  public void Zbp(int paramInt) {
    this.Zu.set(paramInt);
  }
  
  @Zzvo(5)
  public int ZQX() {
    return this.ZT.get();
  }
  
  public void Zb8(int paramInt) {
    this.ZT.set(paramInt);
  }
  
  @Zzvo(6)
  public int ZQ2() {
    return this.ZB.get();
  }
  
  public void ZbO(int paramInt) {
    this.ZB.set(paramInt);
  }
  
  public static void Zz(int[] paramArrayOfint) {
    Zk = paramArrayOfint;
  }
  
  public static int[] Zqt() {
    return Zk;
  }
  
  static {
    if (Zqt() != null)
      Zz(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zua.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */