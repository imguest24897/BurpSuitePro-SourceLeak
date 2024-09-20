package burp;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Zspa {
  private final Zgna Zk;
  
  private final Zrgd ZK;
  
  private final AtomicBoolean Zj = new AtomicBoolean(false);
  
  private final AtomicInteger Zc = new AtomicInteger(0);
  
  private final AtomicLong ZJ;
  
  public Zspa(Zgna paramZgna, Zrgd paramZrgd) {
    this.Zk = paramZgna;
    this.ZK = paramZrgd;
    this.ZJ = new AtomicLong(paramZrgd.Zz());
  }
  
  public boolean ZT(Zrke paramZrke) {
    // Byte code:
    //   0: invokestatic ZD : ()Ljava/lang/String;
    //   3: astore_2
    //   4: getstatic burp/Zo9.ZV : [I
    //   7: aload_1
    //   8: invokevirtual ordinal : ()I
    //   11: iaload
    //   12: tableswitch default -> 116, 1 -> 48, 2 -> 66, 3 -> 82, 4 -> 98, 5 -> 114
    //   48: aload_0
    //   49: getfield Zc : Ljava/util/concurrent/atomic/AtomicInteger;
    //   52: invokevirtual getAndIncrement : ()I
    //   55: ifne -> 116
    //   58: aload_0
    //   59: invokevirtual Zw : ()V
    //   62: aload_2
    //   63: ifnull -> 116
    //   66: aload_0
    //   67: invokevirtual ZJ : ()V
    //   70: aload_0
    //   71: getfield Zc : Ljava/util/concurrent/atomic/AtomicInteger;
    //   74: invokevirtual getAndDecrement : ()I
    //   77: pop
    //   78: aload_2
    //   79: ifnull -> 116
    //   82: aload_0
    //   83: invokevirtual ZJ : ()V
    //   86: aload_0
    //   87: getfield Zj : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   90: iconst_1
    //   91: invokevirtual set : (Z)V
    //   94: aload_2
    //   95: ifnull -> 116
    //   98: aload_0
    //   99: getfield Zj : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   102: iconst_0
    //   103: invokevirtual set : (Z)V
    //   106: aload_0
    //   107: invokevirtual Zw : ()V
    //   110: aload_2
    //   111: ifnull -> 116
    //   114: iconst_0
    //   115: ireturn
    //   116: iconst_1
    //   117: ireturn
  }
  
  public void ZJ() {
    if (Zc())
      ZF(); 
  }
  
  public boolean Zc() {
    return (!this.Zj.get() && this.Zc.get() > 0);
  }
  
  protected void Zw() {
    this.ZJ.set(this.ZK.Zz());
  }
  
  protected void ZF() {
    long l1 = this.ZK.Zz();
    long l2 = l1 - this.ZJ.get();
    this.ZJ.set(l1);
    this.Zk.Zm(Duration.ofNanos(l2));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zspa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */