package burp;

class Ze56 {
  private final Zefg<Zmyi> Zn;
  
  private final int Zb;
  
  private int Zu;
  
  private Zmyi ZZ;
  
  private int Zq;
  
  private Zmyi ZX;
  
  Ze56(Zefg<Zmyi> paramZefg, int paramInt) {
    this.Zn = paramZefg;
    this.Zb = paramInt;
  }
  
  void ZR(int paramInt1, int paramInt2, Integer paramInteger) {
    // Byte code:
    //   0: invokestatic Zq : ()Z
    //   3: iload_1
    //   4: istore #5
    //   6: istore #4
    //   8: iload #5
    //   10: iload_2
    //   11: if_icmplt -> 72
    //   14: aload_0
    //   15: iload #5
    //   17: iconst_1
    //   18: isub
    //   19: invokevirtual ZR : (I)V
    //   22: aload_0
    //   23: iload #5
    //   25: invokevirtual ZD : (I)V
    //   28: iload #5
    //   30: iload_2
    //   31: if_icmpne -> 44
    //   34: aload_0
    //   35: aload_3
    //   36: invokevirtual Zx : (Ljava/lang/Integer;)V
    //   39: iload #4
    //   41: ifeq -> 64
    //   44: aload_0
    //   45: aload_0
    //   46: getfield ZZ : Lburp/Zmyi;
    //   49: aload_0
    //   50: getfield Zu : I
    //   53: invokeinterface ZN : (I)I
    //   58: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   61: invokevirtual Zx : (Ljava/lang/Integer;)V
    //   64: iinc #5, -1
    //   67: iload #4
    //   69: ifeq -> 8
    //   72: return
  }
  
  private void ZR(int paramInt) {
    boolean bool = Zg0b.ZC();
    if (this.Zu == 0) {
      int i = paramInt / this.Zb;
      this.Zu = paramInt % this.Zb;
      this.ZZ = this.Zn.get(i);
      if (!bool) {
        this.Zu--;
        return;
      } 
      return;
    } 
    this.Zu--;
  }
  
  private void ZD(int paramInt) {
    boolean bool = Zg0b.ZC();
    if (this.Zq == 0) {
      int i = paramInt / this.Zb;
      this.Zq = paramInt % this.Zb;
      this.ZX = this.Zn.get(i);
      if (!bool) {
        this.Zq--;
        return;
      } 
      return;
    } 
    this.Zq--;
  }
  
  private void Zx(Integer paramInteger) {
    this.ZX.ZX(this.Zq, paramInteger.intValue());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze56.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */