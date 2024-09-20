package burp;

import java.awt.Component;
import java.util.List;

abstract class Zkt0 implements Zzyl {
  final List<Zgib> ZC;
  
  Zkt0(List<Zgib> paramList) {
    this.ZC = paramList;
  }
  
  abstract Component Za(Zt8 paramZt8);
  
  Component Zv(Zt8 paramZt8, boolean paramBoolean) {
    return Za(paramZt8);
  }
  
  public void ZV(boolean paramBoolean) {}
  
  abstract void Zj(int paramInt1, int paramInt2);
  
  void Zr(int paramInt1, int paramInt2, Zto4 paramZto4) {
    Zj(paramInt1, paramInt2);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: iload_1
    //   10: aload_2
    //   11: <illegal opcode> test : (ILjava/lang/Object;)Ljava/util/function/Predicate;
    //   16: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   21: ireturn
  }
  
  abstract void Zv();
  
  void ZW(Zt8 paramZt8) {}
  
  private static boolean lambda$handleAction$0(int paramInt, Object paramObject, Zgib paramZgib) {
    return paramZgib.ZI(paramInt, paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkt0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */