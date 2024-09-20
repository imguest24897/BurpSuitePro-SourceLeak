package burp;

public class Zv85 {
  private static String Zt;
  
  public static String Zz(String paramString, int paramInt) {
    return ((paramInt & 0x1) == 1) ? Zk(paramString) : (((paramInt & 0x2) == 2) ? ("\000" + paramString) : paramString);
  }
  
  private static String Zk(String paramString) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Zn : ()Ljava/lang/String;
    //   11: iconst_0
    //   12: istore_3
    //   13: astore_1
    //   14: iload_3
    //   15: aload_0
    //   16: invokevirtual length : ()I
    //   19: if_icmpge -> 128
    //   22: aload_0
    //   23: iload_3
    //   24: invokevirtual charAt : (I)C
    //   27: istore #4
    //   29: iload #4
    //   31: invokestatic isLetterOrDigit : (C)Z
    //   34: ifeq -> 48
    //   37: aload_2
    //   38: iload #4
    //   40: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_1
    //   45: ifnull -> 121
    //   48: aload_2
    //   49: ldc '%'
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: iload #4
    //   57: invokestatic toHexString : (I)Ljava/lang/String;
    //   60: astore #5
    //   62: aload #5
    //   64: invokevirtual length : ()I
    //   67: iconst_2
    //   68: isub
    //   69: istore #6
    //   71: iload #6
    //   73: ifne -> 87
    //   76: aload_2
    //   77: aload #5
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: aload_1
    //   84: ifnull -> 121
    //   87: iload #6
    //   89: iconst_m1
    //   90: if_icmpne -> 109
    //   93: aload_2
    //   94: ldc '0'
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: aload #5
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload_1
    //   106: ifnull -> 121
    //   109: aload_2
    //   110: aload #5
    //   112: iload #6
    //   114: invokevirtual substring : (I)Ljava/lang/String;
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: iinc #3, 1
    //   124: aload_1
    //   125: ifnull -> 14
    //   128: aload_2
    //   129: invokevirtual toString : ()Ljava/lang/String;
    //   132: areturn
  }
  
  public static void ZW(String paramString) {
    Zt = paramString;
  }
  
  public static String Zn() {
    return Zt;
  }
  
  static {
    if (Zn() != null)
      ZW("tlQIub"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv85.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */