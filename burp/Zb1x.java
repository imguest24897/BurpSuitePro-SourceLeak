package burp;

public class Zb1x implements Zgx1 {
  private final Zrzd ZD;
  
  public Zb1x(Zrzd paramZrzd) {
    this.ZD = paramZrzd;
  }
  
  public void Zc(Zstu paramZstu, Zm7o paramZm7o) {
    int[] arrayOfInt = Zzi2.ZW();
    int i = paramZm7o.Zz();
    if (Zw(paramZstu, i))
      paramZm7o.Zl(Za(paramZstu, i)); 
    if (Zbqc.Zwu() == null)
      Zzi2.ZS(new int[4]); 
  }
  
  private boolean Zw(Zstu paramZstu, int paramInt) {
    return ZL(paramZstu, new Zm7o(paramInt), ZX(paramZstu, paramInt));
  }
  
  private boolean ZL(Zstu paramZstu, Zm7o paramZm7o, boolean paramBoolean) {
    if (paramBoolean)
      paramZm7o.Zl(1); 
    while (ZY(paramZstu, paramZm7o.Zz())) {
      if (!ZC(paramZstu, paramZm7o, paramBoolean))
        return (ZS(paramZstu, paramZm7o.Zz(), paramBoolean) && ZW(paramZstu, paramZm7o.Zz())); 
    } 
    return false;
  }
  
  private boolean ZC(Zstu paramZstu, Zm7o paramZm7o, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZW : ()[I
    //   3: astore #4
    //   5: aload_2
    //   6: invokevirtual Zz : ()I
    //   9: istore #5
    //   11: aload_1
    //   12: iload #5
    //   14: invokeinterface Zp : (I)B
    //   19: invokestatic isDigit : (I)Z
    //   22: ifeq -> 35
    //   25: aload_2
    //   26: iconst_1
    //   27: invokevirtual Zl : (I)V
    //   30: aload #4
    //   32: ifnonnull -> 103
    //   35: aload_0
    //   36: aload_1
    //   37: aload_2
    //   38: invokevirtual Zz : ()I
    //   41: iload_3
    //   42: invokevirtual ZS : (Lburp/Zstu;IZ)Z
    //   45: ifeq -> 68
    //   48: aload_0
    //   49: aload_1
    //   50: iload #5
    //   52: invokevirtual ZJ : (Lburp/Zstu;I)Z
    //   55: ifeq -> 68
    //   58: aload_2
    //   59: iconst_1
    //   60: invokevirtual Zl : (I)V
    //   63: aload #4
    //   65: ifnonnull -> 103
    //   68: aload_0
    //   69: aload_1
    //   70: aload_2
    //   71: invokevirtual Zz : ()I
    //   74: iload_3
    //   75: invokevirtual ZS : (Lburp/Zstu;IZ)Z
    //   78: ifeq -> 101
    //   81: aload_0
    //   82: aload_1
    //   83: iload #5
    //   85: invokevirtual Z_ : (Lburp/Zstu;I)Z
    //   88: ifeq -> 101
    //   91: aload_2
    //   92: iconst_2
    //   93: invokevirtual Zl : (I)V
    //   96: aload #4
    //   98: ifnonnull -> 103
    //   101: iconst_0
    //   102: ireturn
    //   103: iconst_1
    //   104: ireturn
  }
  
  private boolean ZX(Zstu paramZstu, int paramInt) {
    return (paramZstu.Zp(paramInt) == 45);
  }
  
  private boolean ZY(Zstu paramZstu, int paramInt) {
    return (paramInt < paramZstu.Zpu());
  }
  
  private boolean ZS(Zstu paramZstu, int paramInt, boolean paramBoolean) {
    return (Zs(paramInt, paramBoolean) && ZY(paramZstu, paramInt));
  }
  
  private boolean Zs(int paramInt, boolean paramBoolean) {
    return paramBoolean ? ((paramInt > 1)) : ((paramInt > 0));
  }
  
  private boolean ZJ(Zstu paramZstu, int paramInt) {
    return (paramZstu.Zp(paramInt) == 46);
  }
  
  private boolean Z_(Zstu paramZstu, int paramInt) {
    return (paramInt + 1 < paramZstu.Zpu()) ? (((paramZstu.Zp(paramInt) == 69 || paramZstu.Zp(paramInt) == 101) && (paramZstu.Zp(paramInt + 1) == 43 || paramZstu.Zp(paramInt + 1) == 45))) : false;
  }
  
  private boolean ZW(Zstu paramZstu, int paramInt) {
    int i = paramInt + this.ZD.Zo(paramZstu, paramInt);
    return (ZY(paramZstu, i) && (paramZstu.Zp(i) == 44 || paramZstu.Zp(i) == 93));
  }
  
  private int Za(Zstu paramZstu, int paramInt) {
    Zm7o zm7o = new Zm7o(paramInt);
    if (ZL(paramZstu, zm7o, ZX(paramZstu, paramInt))) {
      int i = zm7o.Zz() - paramInt;
      return i + this.ZD.Zo(paramZstu, paramInt + i);
    } 
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */