package net.portswigger.browser;

import burp.Zbqc;
import burp.Zlli;
import burp.Ztos;
import burp.Zxr8;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zta implements Zeg {
  protected final int ZG;
  
  protected final Zcl Zm;
  
  protected final Ztos<Zc2> ZN;
  
  private final Lock Zw;
  
  private final Condition Zz;
  
  private volatile Zeh Zd;
  
  private int Zc;
  
  private String Zg;
  
  private volatile Zj4 Zl;
  
  private static final String a;
  
  protected Zta(int paramInt, Zcl paramZcl) {
    boolean bool = Zct.ZT();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt <= 100) {
            try {
              this.ZG = paramInt;
              this.Zm = paramZcl;
              this.ZN = new Ztos(Zc2.Zd());
              this.Zw = new ReentrantLock();
              this.Zz = this.Zw.newCondition();
              this.Zl = Zj4.NOT_STARTED;
              if (!bool)
                Zbqc.Zr(new Zbqc[3]); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return;
          } 
          throw new IllegalArgumentException(a);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a);
  }
  
  public boolean Zv() {
    try {
      if (this.Zl != Zj4.NOT_STARTED)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zl = Zj4.RUNNING;
    Thread.startVirtualThread(this::lambda$start$0);
    return true;
  }
  
  public void Zd() {
    Zk(Zj4.STOPPED_BY_CLIENT);
  }
  
  public void ZY() {
    Zk(Zj4.ENDED_BY_REMOTE);
  }
  
  public void Zh(String paramString) {
    this.Zg = paramString;
    Zk(Zj4.FAILED);
  }
  
  public Zlli<Zc2> Zc() {
    return (Zlli<Zc2>)this.ZN;
  }
  
  public Zj4 Zq() {
    return this.Zl;
  }
  
  protected int Zk() {
    return ++this.Zc;
  }
  
  protected void ZQ(Zeh paramZeh) {
    try {
      if (this.Zl.Zk())
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zw.lock();
    try {
      this.Zd = paramZeh;
      this.Zz.signal();
    } finally {
      this.Zw.unlock();
    } 
  }
  
  private void Zk(Zj4 paramZj4) {
    try {
      if (this.Zl.Zk())
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zl = paramZj4;
    Zi();
  }
  
  protected void Zi() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.Zb((this.Zl != Zj4.RUNNING), Zqf.Zr);
    this.Zw.lock();
    try {
      this.Zz.signal();
    } finally {
      this.Zw.unlock();
    } 
    this.ZN.ZD(new Zxr8(Zc2.Zc, this));
  }
  
  private void lambda$start$0() {
    boolean bool = Zct.ZX();
    while (this.Zl == Zj4.RUNNING) {
      Zeh zeh = null;
      this.Zw.lock();
      try {
        if (this.Zd == null)
          this.Zz.await(); 
        zeh = this.Zd;
        this.Zd = null;
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.IGNORED);
      } finally {
        this.Zw.unlock();
      } 
      if (zeh != null) {
        Zct zct = zeh.Zm();
        this.ZN.ZD(new Zxr8(Zc2.ZR, zct));
      } 
      if (bool)
        break; 
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #84
    //   2: ldc '\\t(/9B`+/9R9S.+'C.?)0'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/browser/Zta.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #20
    //   82: goto -> 111
    //   85: bipush #39
    //   87: goto -> 111
    //   90: bipush #10
    //   92: goto -> 111
    //   95: bipush #26
    //   97: goto -> 111
    //   100: iconst_1
    //   101: goto -> 111
    //   104: bipush #42
    //   106: goto -> 111
    //   109: bipush #114
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zta.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */