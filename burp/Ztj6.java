package burp;

public class Ztj6 {
  static int Zp(Character paramCharacter) {
    if (paramCharacter == null)
      return -1; 
    switch (paramCharacter.charValue()) {
      case '"':
        return -6;
      default:
        return -5;
      case '`':
        break;
    } 
    return -7;
  }
  
  static Character Zf(int paramInt) {
    switch (paramInt) {
      case -5:
        return Character.valueOf('\'');
      case -6:
        return Character.valueOf('"');
      case -7:
        return Character.valueOf('`');
    } 
    return null;
  }
  
  public static int Zu(int paramInt) {
    return ZQ(paramInt, 1073741824);
  }
  
  public static boolean ZB(int paramInt) {
    return Zp(paramInt, 1073741824);
  }
  
  public static int ZZ(int paramInt) {
    return Zu(paramInt, 1073741824);
  }
  
  public static int Za(int paramInt) {
    return ZQ(paramInt, 536870912);
  }
  
  public static boolean ZT(int paramInt) {
    return Zp(paramInt, 536870912);
  }
  
  public static int ZQ(int paramInt) {
    return Zu(paramInt, 536870912);
  }
  
  public static int ZV(int paramInt) {
    return ZQ(paramInt, 268435456);
  }
  
  public static boolean ZS(int paramInt) {
    return Zp(paramInt, 268435456);
  }
  
  public static int ZD(int paramInt) {
    return Zu(paramInt, 268435456);
  }
  
  public static int Zt(int paramInt) {
    return ZQ(paramInt, 134217728);
  }
  
  public static boolean ZR(int paramInt) {
    return Zp(paramInt, 134217728);
  }
  
  public static int Zs(int paramInt) {
    return Zu(paramInt, 134217728);
  }
  
  public static int ZE(int paramInt) {
    return ZQ(paramInt, 67108864);
  }
  
  public static boolean ZJ(int paramInt) {
    return Zp(paramInt, 67108864);
  }
  
  public static int Z_(int paramInt) {
    return Zu(paramInt, 67108864);
  }
  
  private static int ZQ(int paramInt1, int paramInt2) {
    String[] arrayOfString = Zldn.ZS();
    if (paramInt1 == 0) {
      paramInt1 = Integer.MIN_VALUE;
      return (arrayOfString != null) ? ((paramInt1 < 0) ? (paramInt1 & (paramInt2 ^ 0xFFFFFFFF)) : (paramInt1 | paramInt2)) : (paramInt1 | paramInt2);
    } 
    return (paramInt1 < 0) ? (paramInt1 & (paramInt2 ^ 0xFFFFFFFF)) : (paramInt1 | paramInt2);
  }
  
  private static boolean Zp(int paramInt1, int paramInt2) {
    return (paramInt1 < 0 && (short)paramInt1 != 0) ? (((paramInt1 & paramInt2) == 0)) : (((paramInt1 & paramInt2) != 0));
  }
  
  private static int Zu(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: iload_0
    //   5: ifge -> 22
    //   8: iload_0
    //   9: iload_1
    //   10: iand
    //   11: ifne -> 22
    //   14: iload_0
    //   15: iload_1
    //   16: ior
    //   17: istore_3
    //   18: aload_2
    //   19: ifnull -> 28
    //   22: iload_0
    //   23: iload_1
    //   24: iconst_m1
    //   25: ixor
    //   26: iand
    //   27: istore_3
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: if_icmpne -> 38
    //   34: iconst_0
    //   35: goto -> 39
    //   38: iload_3
    //   39: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztj6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */