package net.portswigger;

public class Zkp {
  private static final Object ZA;
  
  private static Zqw ZP;
  
  private static int[] Zl;
  
  private static final String a;
  
  public static void ZO(Zqw paramZqw) {
    synchronized (ZA) {
      if (paramZqw == null)
        throw new IllegalArgumentException(a); 
      ZP = paramZqw;
    } 
  }
  
  public static void Zu(Zh6 paramZh6) {
    synchronized (ZA) {
      ZP.ZA(paramZh6);
    } 
  }
  
  private static void lambda$static$0(Zh6 paramZh6) {}
  
  static {
    // Byte code:
    //   0: invokestatic Zc : ()[I
    //   3: ifnonnull -> 12
    //   6: iconst_3
    //   7: newarray int
    //   9: invokestatic ZT : ([I)V
    //   12: bipush #83
    //   14: ldc 'gjZV7=QJVr\\b'PJZJ=rA[ZJ'\\t>'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic net/portswigger/Zkp.a : Ljava/lang/String;
    //   23: goto -> 164
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 138
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 120, 0 -> 92, 1 -> 96, 2 -> 101, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: iconst_1
    //   93: goto -> 122
    //   96: bipush #112
    //   98: goto -> 122
    //   101: bipush #109
    //   103: goto -> 122
    //   106: bipush #41
    //   108: goto -> 122
    //   111: bipush #119
    //   113: goto -> 122
    //   116: iconst_1
    //   117: goto -> 122
    //   120: bipush #54
    //   122: ixor
    //   123: ixor
    //   124: i2c
    //   125: castore
    //   126: iinc #0, 1
    //   129: dup
    //   130: ifne -> 138
    //   133: dup2
    //   134: dup_x1
    //   135: goto -> 47
    //   138: dup2_x1
    //   139: pop2
    //   140: dup_x2
    //   141: iload_0
    //   142: if_icmpgt -> 44
    //   145: pop
    //   146: new java/lang/String
    //   149: dup_x1
    //   150: swap
    //   151: invokespecial <init> : ([C)V
    //   154: invokevirtual intern : ()Ljava/lang/String;
    //   157: swap
    //   158: pop
    //   159: swap
    //   160: pop
    //   161: goto -> 20
    //   164: new java/lang/Object
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: putstatic net/portswigger/Zkp.ZA : Ljava/lang/Object;
    //   174: <illegal opcode> ZA : ()Lnet/portswigger/Zqw;
    //   179: putstatic net/portswigger/Zkp.ZP : Lnet/portswigger/Zqw;
    //   182: return
  }
  
  public static void ZT(int[] paramArrayOfint) {
    Zl = paramArrayOfint;
  }
  
  public static int[] Zc() {
    return Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zkp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */