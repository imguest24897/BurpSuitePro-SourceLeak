package burp;

public class Zri4 implements Zg_ {
  private final Zt8x Zu;
  
  public Zri4(Zt8x paramZt8x) {
    this.Zu = paramZt8x;
  }
  
  public boolean ZS(Zzih paramZzih) {
    if (this.Zu.Zm(paramZzih)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramZzih.Z_());
      int i = paramZzih.ZD++;
      ZK(paramZzih, stringBuilder);
      Zv(paramZzih, stringBuilder);
      paramZzih.Zm(new Zsvc(Zgho.LITERAL_REGEX, stringBuilder.toString(), paramZzih.Za, i, paramZzih.ZD));
      return true;
    } 
    return false;
  }
  
  private void ZK(Zzih paramZzih, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: invokestatic Zz : ()[I
    //   3: astore_3
    //   4: iconst_0
    //   5: istore #4
    //   7: aload_1
    //   8: getfield ZD : I
    //   11: aload_1
    //   12: getfield Zp : I
    //   15: if_icmpge -> 118
    //   18: aload_0
    //   19: getfield Zu : Lburp/Zt8x;
    //   22: aload_1
    //   23: invokeinterface Zl : (Lburp/Zzih;)Z
    //   28: ifeq -> 34
    //   31: iconst_1
    //   32: istore #4
    //   34: iload #4
    //   36: ifeq -> 59
    //   39: aload_0
    //   40: getfield Zu : Lburp/Zt8x;
    //   43: aload_1
    //   44: invokeinterface Zn : (Lburp/Zzih;)Z
    //   49: ifeq -> 95
    //   52: iconst_0
    //   53: istore #4
    //   55: aload_3
    //   56: ifnonnull -> 95
    //   59: aload_0
    //   60: getfield Zu : Lburp/Zt8x;
    //   63: aload_1
    //   64: invokeinterface Zp : (Lburp/Zzih;)Z
    //   69: ifeq -> 95
    //   72: aload_2
    //   73: aload_1
    //   74: invokevirtual Z_ : ()C
    //   77: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload_1
    //   82: dup
    //   83: getfield ZD : I
    //   86: iconst_1
    //   87: iadd
    //   88: putfield ZD : I
    //   91: aload_3
    //   92: ifnonnull -> 118
    //   95: aload_2
    //   96: aload_1
    //   97: invokevirtual Z_ : ()C
    //   100: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_1
    //   105: dup
    //   106: getfield ZD : I
    //   109: iconst_1
    //   110: iadd
    //   111: putfield ZD : I
    //   114: aload_3
    //   115: ifnonnull -> 7
    //   118: return
  }
  
  private void Zv(Zzih paramZzih, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = Ztw7.Zz();
    while (paramZzih.ZD < paramZzih.Zp && this.Zu.ZG(paramZzih)) {
      paramStringBuilder.append(paramZzih.Z_());
      paramZzih.ZD++;
      if (arrayOfInt == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zri4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */