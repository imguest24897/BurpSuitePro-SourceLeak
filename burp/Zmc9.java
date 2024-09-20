package burp;

import java.util.concurrent.locks.Lock;

public class Zmc9 implements Zk9e {
  private final Zk9e ZK;
  
  private final Lock ZM;
  
  private final Zx5d Z_;
  
  private final Zttz ZV;
  
  private volatile boolean ZO;
  
  public Zmc9(Zk9e paramZk9e, Lock paramLock, Zx5d paramZx5d, Zttz paramZttz) {
    this.ZK = paramZk9e;
    this.ZM = paramLock;
    this.Z_ = paramZx5d;
    this.ZV = paramZttz;
  }
  
  public void ZQ() {
    ZA();
    this.ZK.ZQ();
  }
  
  public void ZV() {
    this.ZK.ZV();
  }
  
  public void ZY() {
    this.ZK.ZY();
  }
  
  public void Zg() {
    ZA();
    this.ZK.Zg();
  }
  
  public void Zh() {
    this.ZO = true;
  }
  
  public void Zk() {
    this.ZO = false;
  }
  
  private void ZA() {
    // Byte code:
    //   0: invokestatic ZH : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZM : Ljava/util/concurrent/locks/Lock;
    //   8: invokeinterface lock : ()V
    //   13: aload_0
    //   14: getfield ZO : Z
    //   17: ifne -> 104
    //   20: aload_0
    //   21: getfield ZV : Lburp/Zttz;
    //   24: invokevirtual Zo : ()Lburp/Ztbt;
    //   27: astore_2
    //   28: getstatic burp/Ztzn.ZO : [I
    //   31: aload_2
    //   32: invokevirtual ordinal : ()I
    //   35: iaload
    //   36: tableswitch default -> 97, 1 -> 64, 2 -> 75, 3 -> 86
    //   64: aload_0
    //   65: getfield Z_ : Lburp/Zx5d;
    //   68: invokevirtual Zt : ()V
    //   71: aload_1
    //   72: ifnull -> 104
    //   75: aload_0
    //   76: getfield Z_ : Lburp/Zx5d;
    //   79: invokevirtual Zo : ()V
    //   82: aload_1
    //   83: ifnull -> 104
    //   86: aload_0
    //   87: getfield Z_ : Lburp/Zx5d;
    //   90: invokevirtual Zh : ()V
    //   93: aload_1
    //   94: ifnull -> 104
    //   97: iconst_0
    //   98: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   101: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   104: aload_0
    //   105: getfield ZM : Ljava/util/concurrent/locks/Lock;
    //   108: invokeinterface unlock : ()V
    //   113: goto -> 128
    //   116: astore_3
    //   117: aload_0
    //   118: getfield ZM : Ljava/util/concurrent/locks/Lock;
    //   121: invokeinterface unlock : ()V
    //   126: aload_3
    //   127: athrow
    //   128: return
    // Exception table:
    //   from	to	target	type
    //   13	104	116	finally
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmc9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */