package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ze5r<C extends Zgd8<M>, M extends Zgpi> implements Iterable<C> {
  private final List<C> ZR;
  
  private final Zefg<M> Zm;
  
  private static int[] Zv;
  
  public Ze5r(List<C> paramList, Zefg<M> paramZefg) {
    this.ZR = paramList;
    this.Zm = paramZefg;
  }
  
  public List<C> Za() {
    synchronized (this.Zm.Zz6()) {
      return Collections.unmodifiableList(new ArrayList<>(this.ZR));
    } 
  }
  
  public void Ze(C paramC) {
    synchronized (this.Zm.Zz6()) {
      Ze();
      this.ZR.add(paramC);
      this.Zm.add(paramC.Zz());
    } 
  }
  
  public C Zf(int paramInt) {
    synchronized (this.Zm.Zz6()) {
      Ze();
      this.Zm.remove(paramInt);
      return this.ZR.remove(paramInt);
    } 
  }
  
  public void ZF() {
    synchronized (this.Zm.Zz6()) {
      Ze();
      this.ZR.clear();
      this.Zm.clear();
    } 
  }
  
  public void ZH(int paramInt) {
    synchronized (this.Zm.Zz6()) {
      Ze();
      Zgd8 zgd8 = (Zgd8)this.ZR.get(paramInt);
      Zgpi zgpi = (Zgpi)this.Zm.get(paramInt);
      this.ZR.remove(paramInt);
      this.Zm.remove(paramInt);
      this.ZR.add(paramInt + 1, (C)zgd8);
      this.Zm.add(paramInt + 1, (M)zgpi);
      Ze();
    } 
  }
  
  public void Zz(C paramC, int paramInt) {
    synchronized (this.Zm.Zz6()) {
      Ze();
      this.ZR.remove(paramInt);
      this.Zm.remove(paramInt);
      this.ZR.add(paramInt, paramC);
      this.Zm.add(paramInt, paramC.Zz());
      Ze();
    } 
  }
  
  public boolean Zo(Predicate<C> paramPredicate) {
    int[] arrayOfInt = Zj();
    synchronized (this.Zm.Zz6()) {
      for (Zgd8 zgd8 : this.ZR) {
        if (paramPredicate.test((C)zgd8))
          return true; 
        if (arrayOfInt != null)
          break; 
      } 
    } 
    return false;
  }
  
  public C Zc(Predicate<C> paramPredicate) {
    int[] arrayOfInt = Zj();
    synchronized (this.Zm.Zz6()) {
      for (Zgd8 zgd8 : this.ZR) {
        if (paramPredicate.test((C)zgd8))
          return (C)zgd8; 
        if (arrayOfInt != null)
          break; 
      } 
    } 
    return null;
  }
  
  public boolean ZK(Predicate<C> paramPredicate) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic Zj : ()[I
    //   5: aload_0
    //   6: getfield Zm : Lburp/Zefg;
    //   9: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   14: dup
    //   15: astore #4
    //   17: monitorenter
    //   18: astore_2
    //   19: aload_0
    //   20: getfield ZR : Ljava/util/List;
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore #5
    //   30: aload #5
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 67
    //   40: aload #5
    //   42: invokeinterface next : ()Ljava/lang/Object;
    //   47: checkcast burp/Zgd8
    //   50: astore #6
    //   52: iload_3
    //   53: aload_1
    //   54: aload #6
    //   56: invokeinterface test : (Ljava/lang/Object;)Z
    //   61: ior
    //   62: istore_3
    //   63: aload_2
    //   64: ifnull -> 30
    //   67: aload #4
    //   69: monitorexit
    //   70: goto -> 81
    //   73: astore #7
    //   75: aload #4
    //   77: monitorexit
    //   78: aload #7
    //   80: athrow
    //   81: iload_3
    //   82: ireturn
    // Exception table:
    //   from	to	target	type
    //   19	70	73	finally
    //   73	78	73	finally
  }
  
  public int ZG() {
    synchronized (this.Zm.Zz6()) {
      Ze();
      return this.ZR.size();
    } 
  }
  
  public void Zd(List<C> paramList) {
    int[] arrayOfInt = Zj();
    synchronized (this.Zm.Zz6()) {
      ZF();
      for (Zgd8 zgd8 : paramList) {
        if (zgd8 != null)
          try {
            Ze((C)zgd8);
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.UNEXPECTED);
          }  
        if (arrayOfInt != null)
          break; 
      } 
      Ze();
    } 
  }
  
  public void ZL(List<C> paramList) {
    int[] arrayOfInt = Zj();
    synchronized (this.Zm.Zz6()) {
      for (Zgd8 zgd8 : paramList) {
        if (zgd8 != null)
          try {
            Ze((C)zgd8);
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.UNEXPECTED);
          }  
        if (arrayOfInt != null)
          break; 
      } 
      Ze();
    } 
  }
  
  public void forEach(Consumer<? super C> paramConsumer) {
    int[] arrayOfInt = Zj();
    synchronized (this.Zm.Zz6()) {
      for (Zgd8 zgd8 : this.ZR) {
        paramConsumer.accept((C)zgd8);
        if (arrayOfInt != null)
          break; 
      } 
    } 
  }
  
  public int Zo(C paramC) {
    synchronized (this.Zm.Zz6()) {
      Ze();
      return this.ZR.indexOf(paramC);
    } 
  }
  
  public boolean Zz(Zsnw<C> paramZsnw) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: invokestatic Zj : ()[I
    //   5: aload_0
    //   6: getfield Zm : Lburp/Zefg;
    //   9: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   14: dup
    //   15: astore #4
    //   17: monitorenter
    //   18: astore_2
    //   19: iconst_0
    //   20: istore #5
    //   22: iload #5
    //   24: aload_0
    //   25: getfield ZR : Ljava/util/List;
    //   28: invokeinterface size : ()I
    //   33: if_icmpge -> 94
    //   36: iload #5
    //   38: ifne -> 65
    //   41: aload_1
    //   42: aload_0
    //   43: getfield ZR : Ljava/util/List;
    //   46: iconst_0
    //   47: invokeinterface get : (I)Ljava/lang/Object;
    //   52: checkcast burp/Zgd8
    //   55: invokeinterface Ze : (Ljava/lang/Object;)Z
    //   60: istore_3
    //   61: aload_2
    //   62: ifnull -> 87
    //   65: aload_1
    //   66: iload_3
    //   67: aload_0
    //   68: getfield ZR : Ljava/util/List;
    //   71: iload #5
    //   73: invokeinterface get : (I)Ljava/lang/Object;
    //   78: checkcast burp/Zgd8
    //   81: invokeinterface ZH : (ZLjava/lang/Object;)Z
    //   86: istore_3
    //   87: iinc #5, 1
    //   90: aload_2
    //   91: ifnull -> 22
    //   94: aload #4
    //   96: monitorexit
    //   97: goto -> 108
    //   100: astore #6
    //   102: aload #4
    //   104: monitorexit
    //   105: aload #6
    //   107: athrow
    //   108: iload_3
    //   109: ireturn
    // Exception table:
    //   from	to	target	type
    //   19	97	100	finally
    //   100	105	100	finally
  }
  
  public C ZV(int paramInt) {
    synchronized (this.Zm.Zz6()) {
      return this.ZR.get(paramInt);
    } 
  }
  
  public Iterator<C> iterator() {
    Ze();
    return new Zzm7<>(this.ZR, this.Zm);
  }
  
  public Object ZB() {
    return this.Zm.Zz6();
  }
  
  public boolean ZQ() {
    return (ZG() == 0);
  }
  
  private void Ze() {
    Zuh.Zb((this.ZR.size() == this.Zm.size()), Zqf.Zr);
  }
  
  public int ZD(C paramC, Comparator<C> paramComparator) {
    int[] arrayOfInt = Zj();
    synchronized (this.Zm.Zz6()) {
      byte b = 0;
      for (Zgd8 zgd8 : this.ZR) {
        if (paramComparator.compare((C)zgd8, paramC) >= 0)
          break; 
        b++;
        if (arrayOfInt != null)
          break; 
      } 
      this.ZR.add(b, paramC);
      this.Zm.add(b, paramC.Zz());
      return b;
    } 
  }
  
  public Object Zf() {
    return this.Zm.Zz6();
  }
  
  public static void ZB(int[] paramArrayOfint) {
    Zv = paramArrayOfint;
  }
  
  public static int[] Zj() {
    return Zv;
  }
  
  static {
    if (Zj() != null)
      ZB(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */