package burp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

class Zznu extends Zzn1 {
  private final Zrw8 ZW;
  
  private final Consumer<Integer> Zx;
  
  private final List<Zr_m> ZV;
  
  private final List<Zbq5> ZG;
  
  private final Object ZY;
  
  Zznu(Zrw8 paramZrw8, Consumer<Integer> paramConsumer, Zr_m... paramVarArgs) {
    this.ZW = paramZrw8;
    this.Zx = paramConsumer;
    this.ZV = new LinkedList<>();
    this.ZG = new LinkedList<>();
    this.ZY = new Object();
    Collections.addAll(this.ZV, paramVarArgs);
  }
  
  public void Zw(int paramInt) {
    this.Zx.accept(Integer.valueOf(paramInt));
  }
  
  public void ZW(int paramInt, Zmkb paramZmkb) {
    // Byte code:
    //   0: invokestatic Z_ : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZY : Ljava/lang/Object;
    //   8: dup
    //   9: astore #4
    //   11: monitorenter
    //   12: aload_2
    //   13: getfield Zi : Ljava/awt/Component;
    //   16: astore #6
    //   18: aload #6
    //   20: instanceof burp/Zbq5
    //   23: ifeq -> 71
    //   26: aload #6
    //   28: checkcast burp/Zbq5
    //   31: astore #5
    //   33: aload_0
    //   34: getfield ZG : Ljava/util/List;
    //   37: aload #5
    //   39: invokeinterface add : (Ljava/lang/Object;)Z
    //   44: pop
    //   45: aload_0
    //   46: getfield ZV : Ljava/util/List;
    //   49: aload #5
    //   51: <illegal opcode> accept : (Lburp/Zbq5;)Ljava/util/function/Consumer;
    //   56: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   61: getstatic burp/Zze0.COLLABORATOR_UI_TAB_ADDED : Lburp/Zze0;
    //   64: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   67: aload_3
    //   68: ifnonnull -> 78
    //   71: iconst_0
    //   72: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   75: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   78: aload #4
    //   80: monitorexit
    //   81: goto -> 92
    //   84: astore #7
    //   86: aload #4
    //   88: monitorexit
    //   89: aload #7
    //   91: athrow
    //   92: return
    // Exception table:
    //   from	to	target	type
    //   12	81	84	finally
    //   84	89	84	finally
  }
  
  public void Zv(int paramInt, String paramString) {
    synchronized (this.ZY) {
      this.ZW.Zh(paramInt, paramString);
    } 
  }
  
  public void Zk(int paramInt1, int paramInt2) {
    if (paramInt1 == paramInt2)
      return; 
    synchronized (this.ZY) {
      Zbq5 zbq5 = this.ZG.remove(paramInt1);
      this.ZG.add(paramInt2, zbq5);
      this.ZW.ZS(paramInt1, paramInt2);
    } 
  }
  
  public void ZB(int paramInt) {
    synchronized (this.ZY) {
      Zbq5 zbq5 = this.ZG.get(paramInt);
      this.ZG.remove(zbq5);
      this.ZW.ZO(paramInt);
      this.ZV.forEach(zbq5::lambda$tabRemoved$1);
    } 
  }
  
  private static void lambda$tabRemoved$1(Zbq5 paramZbq5, Zr_m paramZr_m) {
    paramZr_m.ZC(paramZbq5);
  }
  
  private static void lambda$tabAdded$0(Zbq5 paramZbq5, Zr_m paramZr_m) {
    paramZr_m.ZR(paramZbq5);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zznu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */