package net.portswigger;

public class Zn3 {
  public static final Zg5 Zf;
  
  private static boolean ZZ;
  
  static {
    // Byte code:
    //   0: invokestatic ZE : ()Z
    //   3: ifne -> 10
    //   6: iconst_1
    //   7: invokestatic ZT : (Z)V
    //   10: bipush #113
    //   12: ldc 'oSq/f?y^m?i4aWd<'
    //   14: iconst_m1
    //   15: goto -> 22
    //   18: astore_0
    //   19: goto -> 161
    //   22: dup_x2
    //   23: pop
    //   24: invokevirtual toCharArray : ()[C
    //   27: dup_x1
    //   28: arraylength
    //   29: dup_x2
    //   30: pop
    //   31: iconst_0
    //   32: istore_1
    //   33: dup2_x1
    //   34: pop2
    //   35: dup_x2
    //   36: iconst_1
    //   37: if_icmpgt -> 135
    //   40: dup2
    //   41: swap
    //   42: iload_1
    //   43: dup2_x1
    //   44: caload
    //   45: swap
    //   46: iload_1
    //   47: bipush #7
    //   49: irem
    //   50: tableswitch default -> 117, 0 -> 88, 1 -> 93, 2 -> 98, 3 -> 103, 4 -> 108, 5 -> 112
    //   88: bipush #92
    //   90: goto -> 119
    //   93: bipush #50
    //   95: goto -> 119
    //   98: bipush #112
    //   100: goto -> 119
    //   103: bipush #80
    //   105: goto -> 119
    //   108: iconst_1
    //   109: goto -> 119
    //   112: bipush #95
    //   114: goto -> 119
    //   117: bipush #26
    //   119: ixor
    //   120: ixor
    //   121: i2c
    //   122: castore
    //   123: iinc #1, 1
    //   126: dup
    //   127: ifne -> 135
    //   130: dup2
    //   131: dup_x1
    //   132: goto -> 43
    //   135: dup2_x1
    //   136: pop2
    //   137: dup_x2
    //   138: iload_1
    //   139: if_icmpgt -> 40
    //   142: pop
    //   143: new java/lang/String
    //   146: dup_x1
    //   147: swap
    //   148: invokespecial <init> : ([C)V
    //   151: invokevirtual intern : ()Ljava/lang/String;
    //   154: swap
    //   155: pop
    //   156: swap
    //   157: pop
    //   158: goto -> 18
    //   161: new net/portswigger/Zg5
    //   164: dup
    //   165: aload_0
    //   166: invokespecial <init> : (Ljava/lang/String;)V
    //   169: putstatic net/portswigger/Zn3.Zf : Lnet/portswigger/Zg5;
    //   172: return
  }
  
  public static void ZT(boolean paramBoolean) {
    ZZ = paramBoolean;
  }
  
  public static boolean ZE() {
    return ZZ;
  }
  
  public static boolean Zz() {
    boolean bool = ZE();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zn3.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */