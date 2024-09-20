package burp;

public class Zmyf {
  public static Zsba Zy(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return Zz(Zyf.Zy(paramArrayOfbyte), paramInt1, paramInt2);
  }
  
  public static Zsba ZA(Zstu paramZstu, int paramInt) {
    return Zz(paramZstu, paramInt, paramZstu.Zpu());
  }
  
  public static Zsba Zz(Zstu paramZstu, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokestatic ZX : (Lburp/Zstu;II)Lburp/Zmvi;
    //   6: astore #4
    //   8: invokestatic Zu : ()Z
    //   11: aload #4
    //   13: getfield Zs : I
    //   16: istore #5
    //   18: istore_3
    //   19: aload #4
    //   21: getfield ZR : I
    //   24: istore #6
    //   26: getstatic burp/Zsba.NONE : Lburp/Zsba;
    //   29: astore #7
    //   31: iload #6
    //   33: iload #5
    //   35: if_icmple -> 139
    //   38: aload_0
    //   39: iload #5
    //   41: invokeinterface Zp : (I)B
    //   46: bipush #60
    //   48: if_icmpne -> 73
    //   51: aload_0
    //   52: iload #6
    //   54: invokeinterface Zp : (I)B
    //   59: bipush #62
    //   61: if_icmpne -> 73
    //   64: getstatic burp/Zsba.XML : Lburp/Zsba;
    //   67: astore #7
    //   69: iload_3
    //   70: ifeq -> 139
    //   73: aload_0
    //   74: iload #5
    //   76: invokeinterface Zp : (I)B
    //   81: bipush #123
    //   83: if_icmpne -> 108
    //   86: aload_0
    //   87: iload #6
    //   89: invokeinterface Zp : (I)B
    //   94: bipush #125
    //   96: if_icmpne -> 108
    //   99: getstatic burp/Zsba.JSON : Lburp/Zsba;
    //   102: astore #7
    //   104: iload_3
    //   105: ifeq -> 139
    //   108: aload_0
    //   109: iload #5
    //   111: invokeinterface Zp : (I)B
    //   116: bipush #91
    //   118: if_icmpne -> 139
    //   121: aload_0
    //   122: iload #6
    //   124: invokeinterface Zp : (I)B
    //   129: bipush #93
    //   131: if_icmpne -> 139
    //   134: getstatic burp/Zsba.JSON : Lburp/Zsba;
    //   137: astore #7
    //   139: aload #7
    //   141: areturn
  }
  
  private static Zmvi ZX(Zstu paramZstu, int paramInt1, int paramInt2) {
    boolean bool = Zsba.Zu();
    int i = paramInt1;
    while (i < paramInt2 && paramZstu.Zp(i) <= 32) {
      i++;
      if (bool)
        break; 
    } 
    int j = paramInt2 - 1;
    while (j > i && paramZstu.Zp(j) <= 32) {
      j--;
      if (bool)
        break; 
    } 
    return new Zmvi(i, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmyf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */