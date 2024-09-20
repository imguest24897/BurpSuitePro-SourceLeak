package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zz4u implements Zsza {
  private final List<Zktl> ZB = new CopyOnWriteArrayList<>();
  
  public void ZW(Zktl paramZktl) {
    this.ZB.add(paramZktl);
  }
  
  public void Zm(int paramInt, boolean paramBoolean) {
    int i = Zguu.Zb();
    for (Zktl zktl : this.ZB) {
      zktl.ZL(paramInt, paramBoolean);
      if (i == 0)
        break; 
    } 
  }
  
  public void Zv(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield ZB : Ljava/util/List;
    //   8: invokeinterface iterator : ()Ljava/util/Iterator;
    //   13: astore #4
    //   15: aload #4
    //   17: invokeinterface hasNext : ()Z
    //   22: ifeq -> 88
    //   25: aload #4
    //   27: invokeinterface next : ()Ljava/lang/Object;
    //   32: checkcast burp/Zktl
    //   35: astore #5
    //   37: iload_1
    //   38: ifne -> 45
    //   41: iload_2
    //   42: ifeq -> 49
    //   45: iconst_1
    //   46: goto -> 50
    //   49: iconst_0
    //   50: istore #6
    //   52: iload #6
    //   54: ifeq -> 77
    //   57: aload #5
    //   59: iload_1
    //   60: ifne -> 67
    //   63: iconst_1
    //   64: goto -> 68
    //   67: iconst_0
    //   68: invokeinterface ZN : (Z)V
    //   73: iload_3
    //   74: ifeq -> 84
    //   77: aload #5
    //   79: invokeinterface Zy : ()V
    //   84: iload_3
    //   85: ifeq -> 15
    //   88: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz4u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */