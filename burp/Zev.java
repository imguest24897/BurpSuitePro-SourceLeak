package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import net.portswigger.Zm2;

public class Zev implements Zmf9, Zkuc, Ztu3 {
  private final Zmue ZM;
  
  private final Zkhg ZE;
  
  private final List<Ztf_<?>> ZD;
  
  private final Consumer<Zmx3> Zx;
  
  private final Lock ZA;
  
  private final Lock Zg;
  
  private final AtomicBoolean ZR;
  
  public Zev(Zekl paramZekl, Zskh paramZskh, Ztwv paramZtwv, Zmue paramZmue, Zkhg paramZkhg) {
    this.ZM = paramZmue;
    this.ZE = paramZkhg;
    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    this.ZA = reentrantReadWriteLock.readLock();
    this.Zg = reentrantReadWriteLock.writeLock();
    this.ZD = new LinkedList<>();
    this.ZR = new AtomicBoolean(true);
    Zeba zeba = new Zeba(paramZskh, paramZtwv, paramZekl, this.ZR);
    Objects.requireNonNull(zeba);
    this.Zx = zeba::ZK;
  }
  
  public void Zf(Zz6e<?> paramZz6e) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZE : Lburp/Zkhg;
    //   4: aload_1
    //   5: invokevirtual Zs : (Lburp/Zz6e;)Lburp/Ztf_;
    //   8: astore_2
    //   9: aload_0
    //   10: getfield Zg : Ljava/util/concurrent/locks/Lock;
    //   13: invokeinterface lock : ()V
    //   18: aload_0
    //   19: getfield ZD : Ljava/util/List;
    //   22: invokeinterface size : ()I
    //   27: istore_3
    //   28: aload_0
    //   29: getfield ZD : Ljava/util/List;
    //   32: aload_2
    //   33: invokeinterface add : (Ljava/lang/Object;)Z
    //   38: pop
    //   39: aload_0
    //   40: iload_3
    //   41: <illegal opcode> run : (Lburp/Zev;I)Ljava/lang/Runnable;
    //   46: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   49: aload_0
    //   50: getfield Zg : Ljava/util/concurrent/locks/Lock;
    //   53: invokeinterface unlock : ()V
    //   58: goto -> 75
    //   61: astore #4
    //   63: aload_0
    //   64: getfield Zg : Ljava/util/concurrent/locks/Lock;
    //   67: invokeinterface unlock : ()V
    //   72: aload #4
    //   74: athrow
    //   75: return
    // Exception table:
    //   from	to	target	type
    //   18	49	61	finally
    //   61	63	61	finally
  }
  
  public void Ze() {
    // Byte code:
    //   0: invokestatic Zh : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zg : Ljava/util/concurrent/locks/Lock;
    //   8: invokeinterface lock : ()V
    //   13: aload_0
    //   14: getfield ZD : Ljava/util/List;
    //   17: invokeinterface size : ()I
    //   22: istore_2
    //   23: iload_2
    //   24: ifle -> 68
    //   27: getstatic burp/Zrrh.PROXY_INTERCEPT_MESSAGE_FORWARD_ALL : Lburp/Zrrh;
    //   30: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   33: aload_0
    //   34: getfield ZD : Ljava/util/List;
    //   37: invokeinterface isEmpty : ()Z
    //   42: ifne -> 58
    //   45: aload_0
    //   46: iconst_0
    //   47: getstatic burp/Zmxm.FORWARD : Lburp/Zmxm;
    //   50: iconst_1
    //   51: invokevirtual ZC : (ILburp/Zmxm;Z)V
    //   54: aload_1
    //   55: ifnull -> 33
    //   58: aload_0
    //   59: iload_2
    //   60: <illegal opcode> run : (Lburp/Zev;I)Ljava/lang/Runnable;
    //   65: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   68: aload_0
    //   69: getfield Zg : Ljava/util/concurrent/locks/Lock;
    //   72: invokeinterface unlock : ()V
    //   77: goto -> 92
    //   80: astore_3
    //   81: aload_0
    //   82: getfield Zg : Ljava/util/concurrent/locks/Lock;
    //   85: invokeinterface unlock : ()V
    //   90: aload_3
    //   91: athrow
    //   92: return
    // Exception table:
    //   from	to	target	type
    //   13	68	80	finally
  }
  
  public void ZS(List<Zz6e<?>> paramList) {
    Zf(paramList, Zmxm.FORWARD, Zrrh.PROXY_INTERCEPT_MESSAGE_FORWARD_SINGLE, Zrrh.PROXY_INTERCEPT_MESSAGE_FORWARD_MULTIPLE);
  }
  
  public void Zq(List<Zz6e<?>> paramList) {
    Zf(paramList, Zmxm.DROP, Zrrh.PROXY_INTERCEPT_MESSAGE_DROPPED_SINGLE, Zrrh.PROXY_INTERCEPT_MESSAGE_DROPPED_MULTIPLE);
  }
  
  private void Zf(List<Zz6e<?>> paramList, Zmxm paramZmxm, Zrrh paramZrrh1, Zrrh paramZrrh2) {
    // Byte code:
    //   0: invokestatic Zh : ()[I
    //   3: astore #5
    //   5: aload_1
    //   6: ifnull -> 48
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifne -> 48
    //   18: aload_1
    //   19: invokeinterface size : ()I
    //   24: iconst_1
    //   25: if_icmpne -> 37
    //   28: aload_3
    //   29: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   32: aload #5
    //   34: ifnull -> 42
    //   37: aload #4
    //   39: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   42: aload_0
    //   43: aload_1
    //   44: aload_2
    //   45: invokevirtual Zh : (Ljava/util/List;Lburp/Zmxm;)V
    //   48: return
  }
  
  private void Zh(List<Zz6e<?>> paramList, Zmxm paramZmxm) {
    int[] arrayOfInt = Zgr_.Zh();
    for (Zz6e<?> zz6e : paramList) {
      boolean bool = (zz6e == null) ? true : this.ZD.indexOf(zz6e);
      if (bool)
        ZC(bool, paramZmxm, false); 
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private void ZC(int paramInt, Zmxm paramZmxm, boolean paramBoolean) {
    this.Zg.lock();
    try {
      Ztf_<?> ztf_ = this.ZD.remove(paramInt);
      if (paramZmxm == Zmxm.FORWARD) {
        int i = ztf_.ZL().ZAs().length();
        if (i > 0)
          Zm2.Zi(Zv8r.PROXY_INTERCEPT_NOTES_ADDED, i); 
        ztf_.Zb(ztf_.Zm());
        paramZmxm = ztf_.ZW() ? Zmxm.UPDATE_AND_FORWARD : Zmxm.FORWARD;
      } 
      this.Zx.accept(new Zmx3(ztf_, paramZmxm));
      if (!paramBoolean)
        this.ZM.fireTableRowsDeleted(paramInt, paramInt); 
    } finally {
      this.Zg.unlock();
    } 
  }
  
  public Ztf_<?> ZU(int paramInt) {
    this.ZA.lock();
    try {
      return this.ZD.get(paramInt);
    } finally {
      this.ZA.unlock();
    } 
  }
  
  public int ZF() {
    this.ZA.lock();
    try {
      return this.ZD.size();
    } finally {
      this.ZA.unlock();
    } 
  }
  
  public void ZY() {
    this.ZR.set(false);
  }
  
  private void lambda$forwardAll$1(int paramInt) {
    this.ZM.fireTableRowsDeleted(0, paramInt - 1);
  }
  
  private void lambda$addToQueue$0(int paramInt) {
    this.ZM.fireTableRowsInserted(paramInt, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zev.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */