package burp;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Zmr2 implements Iterator<Zrbc> {
  private final Zt0r Zn;
  
  private final Zb9t ZU;
  
  private final Zmz6 ZD;
  
  private final Zm7h ZZ;
  
  private final Ztij Zt;
  
  private final Supplier<Boolean> Zk;
  
  private final Iterator<Zxs7> ZV;
  
  private final AtomicBoolean ZT;
  
  private final Consumer<Throwable> ZC;
  
  Zmr2(Zt0r paramZt0r, Zz1i paramZz1i, Zb9t paramZb9t, Zmz6 paramZmz6, Zm7h paramZm7h, Ztij paramZtij, Ze4e paramZe4e, Supplier<Boolean> paramSupplier) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zn : Lburp/Zt0r;
    //   9: aload_0
    //   10: aload_3
    //   11: putfield ZU : Lburp/Zb9t;
    //   14: aload_0
    //   15: aload #4
    //   17: putfield ZD : Lburp/Zmz6;
    //   20: aload_0
    //   21: aload #5
    //   23: putfield ZZ : Lburp/Zm7h;
    //   26: aload_0
    //   27: aload #6
    //   29: putfield Zt : Lburp/Ztij;
    //   32: aload_0
    //   33: aload #8
    //   35: putfield Zk : Ljava/util/function/Supplier;
    //   38: aload_3
    //   39: invokevirtual ZG : ()Lburp/Ze3n;
    //   42: astore #9
    //   44: aload_0
    //   45: aload #9
    //   47: ifnonnull -> 56
    //   50: invokestatic emptyIterator : ()Ljava/util/Iterator;
    //   53: goto -> 66
    //   56: aload #9
    //   58: invokevirtual Zo : ()Ljava/util/List;
    //   61: invokeinterface iterator : ()Ljava/util/Iterator;
    //   66: putfield ZV : Ljava/util/Iterator;
    //   69: aload_0
    //   70: new java/util/concurrent/atomic/AtomicBoolean
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: putfield ZT : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   80: aload_0
    //   81: aload_0
    //   82: aload #7
    //   84: aload_1
    //   85: aload_2
    //   86: <illegal opcode> accept : (Lburp/Zmr2;Lburp/Ze4e;Lburp/Zt0r;Lburp/Zz1i;)Ljava/util/function/Consumer;
    //   91: putfield ZC : Ljava/util/function/Consumer;
    //   94: return
  }
  
  public boolean hasNext() {
    return (!this.ZT.get() && ((Boolean)this.Zk.get()).booleanValue() && this.ZV.hasNext());
  }
  
  public Zrbc Zq() {
    return new Zrd7(this.Zn, this.ZU, this.ZD, this.ZZ, this.Zt, this.ZV.next(), this.ZC);
  }
  
  private void lambda$new$0(Ze4e paramZe4e, Zt0r paramZt0r, Zz1i paramZz1i, Throwable paramThrowable) {
    paramZe4e.Zl(Zb09.Zh(paramZt0r, paramZz1i.Zd(paramZt0r), Zblb.ZB(paramThrowable)).Zn(), paramThrowable);
    this.ZT.set(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmr2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */