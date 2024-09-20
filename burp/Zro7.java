package burp;

import java.util.Set;
import java.util.function.Supplier;

class Zro7 {
  private final Set<Integer> ZW;
  
  private final Supplier<Boolean> Zn;
  
  private final Supplier<Float> Z_;
  
  private final Zkyp ZC;
  
  private int ZL;
  
  private Zro7(Zkyp paramZkyp, Zl5x paramZl5x, Zz1i paramZz1i) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/HashSet
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield ZW : Ljava/util/Set;
    //   15: aload_0
    //   16: aload_1
    //   17: putfield ZC : Lburp/Zkyp;
    //   20: aload_0
    //   21: aload_3
    //   22: aload_2
    //   23: <illegal opcode> get : (Lburp/Zz1i;Lburp/Zl5x;)Ljava/util/function/Supplier;
    //   28: putfield Zn : Ljava/util/function/Supplier;
    //   31: aload_0
    //   32: aload_1
    //   33: <illegal opcode> get : (Lburp/Zkyp;)Ljava/util/function/Supplier;
    //   38: putfield Z_ : Ljava/util/function/Supplier;
    //   41: return
  }
  
  void ZA(int paramInt) {
    this.ZW.add(Integer.valueOf(paramInt));
  }
  
  void ZD(int paramInt) {
    this.ZL = paramInt;
  }
  
  void Zi(Zbza paramZbza) {
    synchronized (this.ZW) {
      ZN();
      this.ZW.remove(Integer.valueOf(paramZbza.Zgv()));
    } 
  }
  
  boolean ZF(Zbza paramZbza) {
    synchronized (this.ZW) {
      ZN();
      this.ZW.add(Integer.valueOf(paramZbza.Zgv()));
      if (this.ZL >= this.ZC.ZYl()) {
        float f = this.ZW.size() / this.ZL * 100.0F;
        return (f >= ((Float)this.Z_.get()).floatValue());
      } 
      return false;
    } 
  }
  
  private void ZN() {
    if (((Boolean)this.Zn.get()).booleanValue())
      this.ZL++; 
  }
  
  private static Float lambda$new$1(Zkyp paramZkyp) {
    return Float.valueOf((paramZkyp.ZYe() <= 0.0F) ? Float.MAX_VALUE : paramZkyp.ZYe());
  }
  
  private static Boolean lambda$new$0(Zz1i paramZz1i, Zl5x paramZl5x) {
    return Boolean.valueOf((paramZz1i.Zd(paramZl5x) == 0L));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zro7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */