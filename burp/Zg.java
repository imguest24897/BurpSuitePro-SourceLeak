package burp;

class Zg<T extends Zgpi> {
  private final Zefg<Zrte<T>> ZX;
  
  private final int Zn;
  
  private int Zc;
  
  private Zrte<T> ZY;
  
  private int Zp;
  
  private Zrte<T> ZC;
  
  Zg(Zefg<Zrte<T>> paramZefg, int paramInt) {
    this.ZX = paramZefg;
    this.Zn = paramInt;
  }
  
  void ZY(int paramInt1, int paramInt2, T paramT) {
    // Byte code:
    //   0: invokestatic Ze : ()[Ljava/lang/String;
    //   3: iload_1
    //   4: istore #5
    //   6: astore #4
    //   8: iload #5
    //   10: iload_2
    //   11: if_icmplt -> 79
    //   14: aload_0
    //   15: iload_2
    //   16: iload_1
    //   17: if_icmpne -> 25
    //   20: iload #5
    //   22: goto -> 29
    //   25: iload #5
    //   27: iconst_1
    //   28: isub
    //   29: invokevirtual Zv : (I)V
    //   32: aload_0
    //   33: iload #5
    //   35: invokevirtual ZV : (I)V
    //   38: iload #5
    //   40: iload_2
    //   41: if_icmpne -> 54
    //   44: aload_0
    //   45: aload_3
    //   46: invokevirtual Zi : (Lburp/Zgpi;)V
    //   49: aload #4
    //   51: ifnull -> 71
    //   54: aload_0
    //   55: aload_0
    //   56: getfield ZY : Lburp/Zrte;
    //   59: aload_0
    //   60: getfield Zc : I
    //   63: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   68: invokevirtual Zi : (Lburp/Zgpi;)V
    //   71: iinc #5, -1
    //   74: aload #4
    //   76: ifnull -> 8
    //   79: return
  }
  
  private void Zv(int paramInt) {
    String[] arrayOfString = Zx29.Ze();
    if (this.Zc == 0) {
      int i = paramInt / this.Zn;
      this.Zc = paramInt % this.Zn;
      this.ZY = this.ZX.get(i);
      if (arrayOfString != null) {
        this.Zc--;
        return;
      } 
      return;
    } 
    this.Zc--;
  }
  
  private void ZV(int paramInt) {
    String[] arrayOfString = Zx29.Ze();
    if (this.Zp == 0) {
      int i = paramInt / this.Zn;
      this.Zp = paramInt % this.Zn;
      this.ZC = this.ZX.get(i);
      if (arrayOfString != null) {
        this.Zp--;
        return;
      } 
      return;
    } 
    this.Zp--;
  }
  
  private void Zi(T paramT) {
    this.ZC.ZU(this.Zp, paramT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */