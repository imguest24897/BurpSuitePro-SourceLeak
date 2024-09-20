package burp;

class Zg9 {
  static void ZK(String paramString, Zz3i paramZz3i, Zxrr paramZxrr) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: aload_1
    //   4: astore #4
    //   6: astore_3
    //   7: iconst_0
    //   8: istore #5
    //   10: aload_0
    //   11: ifnonnull -> 18
    //   14: iconst_0
    //   15: goto -> 22
    //   18: aload_0
    //   19: invokevirtual length : ()I
    //   22: istore #6
    //   24: iload #6
    //   26: ifne -> 39
    //   29: aload_1
    //   30: ifnull -> 38
    //   33: aload_1
    //   34: aload_2
    //   35: invokestatic ZO : (Lburp/Zz3i;Lburp/Zxrr;)V
    //   38: return
    //   39: iload #5
    //   41: iload #6
    //   43: if_icmpge -> 140
    //   46: iload #6
    //   48: iload #5
    //   50: isub
    //   51: bipush #100
    //   53: invokestatic min : (II)I
    //   56: istore #7
    //   58: aload #4
    //   60: aload_0
    //   61: iload #5
    //   63: iload #5
    //   65: iload #7
    //   67: iadd
    //   68: invokevirtual substring : (II)Ljava/lang/String;
    //   71: invokeinterface ZkH : (Ljava/lang/String;)V
    //   76: iload #5
    //   78: iload #7
    //   80: iadd
    //   81: istore #5
    //   83: iload #5
    //   85: iload #6
    //   87: if_icmpge -> 130
    //   90: aload #4
    //   92: invokeinterface ZT5 : ()Lburp/Zz3i;
    //   97: ifnonnull -> 117
    //   100: aload_2
    //   101: invokeinterface ZdQ : ()Lburp/Zz3i;
    //   106: astore #8
    //   108: aload #4
    //   110: aload #8
    //   112: invokeinterface Zn : (Lburp/Zz3i;)V
    //   117: aload #4
    //   119: invokeinterface ZT5 : ()Lburp/Zz3i;
    //   124: astore #4
    //   126: aload_3
    //   127: ifnonnull -> 136
    //   130: aload #4
    //   132: aload_2
    //   133: invokestatic ZO : (Lburp/Zz3i;Lburp/Zxrr;)V
    //   136: aload_3
    //   137: ifnonnull -> 39
    //   140: return
  }
  
  private static void ZO(Zz3i paramZz3i, Zxrr paramZxrr) {
    Zz3i zz3i = paramZz3i.ZT5();
    if (zz3i != null) {
      ZO(zz3i, paramZxrr);
      paramZxrr.Zg(zz3i);
      paramZz3i.Zn(null);
    } 
  }
  
  static String ZM(Zz3i paramZz3i) {
    StringBuilder stringBuilder = new StringBuilder();
    int[] arrayOfInt = Zxb7.Zv();
    Zz3i zz3i = paramZz3i;
    while (zz3i != null) {
      stringBuilder.append(zz3i.ZTN());
      zz3i = zz3i.ZT5();
      if (arrayOfInt == null)
        break; 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */