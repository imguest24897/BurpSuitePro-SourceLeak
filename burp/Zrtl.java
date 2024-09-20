package burp;

import net.portswigger.Zrmr;
import net.portswigger.Zs7;
import net.portswigger.Zt0;
import net.portswigger.Zu5;
import net.portswigger.Zzz;

public class Zrtl {
  private static final String a;
  
  public static Ze7n ZU(Zu5 paramZu5, Zg1z paramZg1z) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zj : ()Ljava/lang/String;
    //   4: astore_3
    //   5: invokestatic Zp : ()[I
    //   8: aload_0
    //   9: invokevirtual Zh : ()Ljava/util/List;
    //   12: invokeinterface getFirst : ()Ljava/lang/Object;
    //   17: checkcast net/portswigger/Zms
    //   20: astore #4
    //   22: new burp/Zio
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: getstatic burp/Zz_4.HEADER : Lburp/Zz_4;
    //   32: invokevirtual ZP : (Lburp/Zz_4;)Lburp/Zvy;
    //   35: checkcast burp/Zio
    //   38: aload_3
    //   39: invokevirtual Zn : (Ljava/lang/String;)Lburp/Zvy;
    //   42: checkcast burp/Zio
    //   45: aload_3
    //   46: invokevirtual Zj : (Ljava/lang/String;)Lburp/Zvy;
    //   49: checkcast burp/Zio
    //   52: astore #5
    //   54: astore_2
    //   55: aload #4
    //   57: astore #6
    //   59: iconst_0
    //   60: istore #7
    //   62: aload #6
    //   64: iload #7
    //   66: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   71: tableswitch default -> 182, -1 -> 182, 0 -> 104, 1 -> 119, 2 -> 134, 3 -> 149
    //   104: aload #6
    //   106: checkcast net/portswigger/Zs7
    //   109: astore #8
    //   111: aload #5
    //   113: aload #8
    //   115: invokestatic Zr : (Lburp/Zio;Lnet/portswigger/Zs7;)Lburp/Ze7n;
    //   118: areturn
    //   119: aload #6
    //   121: checkcast net/portswigger/Zzz
    //   124: astore #9
    //   126: aload #5
    //   128: aload #9
    //   130: invokestatic Zc : (Lburp/Zio;Lnet/portswigger/Zzz;)Lburp/Ze7n;
    //   133: areturn
    //   134: aload #6
    //   136: checkcast net/portswigger/Zrmr
    //   139: astore #10
    //   141: aload #5
    //   143: aload #10
    //   145: invokestatic Zx : (Lburp/Zio;Lnet/portswigger/Zrmr;)Lburp/Ze7n;
    //   148: areturn
    //   149: aload #6
    //   151: checkcast net/portswigger/Zt0
    //   154: astore #11
    //   156: aload #5
    //   158: aload #11
    //   160: invokestatic ZT : (Lburp/Zio;Lnet/portswigger/Zt0;)Lburp/Ze7n;
    //   163: aload_2
    //   164: ifnonnull -> 181
    //   167: iconst_2
    //   168: anewarray burp/Zbqc
    //   171: invokestatic Zr : ([Lburp/Zbqc;)V
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   180: athrow
    //   181: areturn
    //   182: aload_1
    //   183: getstatic burp/Zrtl.a : Ljava/lang/String;
    //   186: invokeinterface ZC : (Ljava/lang/String;)V
    //   191: new java/lang/UnsupportedOperationException
    //   194: dup
    //   195: invokespecial <init> : ()V
    //   198: athrow
    // Exception table:
    //   from	to	target	type
    //   156	174	177	java/lang/UnsupportedOperationException
  }
  
  private static Ze7n Zr(Zio paramZio, Zs7 paramZs7) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return paramZio.ZG(Zmtz.NUMBER).ZR(Zxaq.NUMBER).ZM(paramZs7.description()).ZF(!paramZs7.required()).Ze(paramZs7.examples().stream().map(String::valueOf).toList()).Zo((new Zrbg()).ZE((Integer)paramZs7.max()).Zq((Integer)paramZs7.min()).ZV()).Zb();
  }
  
  private static Ze7n Zc(Zio paramZio, Zzz paramZzz) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return paramZio.ZG(Zmtz.NUMBER).ZR(Zxaq.NUMBER).ZM(paramZzz.description()).ZF(!paramZzz.required()).Ze(paramZzz.examples().stream().map(String::valueOf).toList()).Zo((new Zrbg()).ZE((Integer)paramZzz.max()).Zq((Integer)paramZzz.min()).ZV()).Zb();
  }
  
  private static Ze7n Zx(Zio paramZio, Zrmr paramZrmr) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return paramZio.ZG(Zmtz.TEXT).ZR(Zxaq.TEXT).ZM(paramZrmr.Zmx()).ZF(!paramZrmr.Zm8()).Ze(paramZrmr.Zmk().stream().map(String::valueOf).toList()).Zo((new Zrbg()).Zj(paramZrmr.ZmO()).Zp(paramZrmr.Zma()).ZV()).Zb();
  }
  
  private static Ze7n ZT(Zio paramZio, Zt0 paramZt0) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return paramZio.ZG(Zmtz.BOOLEAN).ZM(paramZt0.Zg1()).ZF(!paramZt0.ZgO()).Ze(paramZt0.Zgl().stream().map(String::valueOf).toList()).Zb();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: ldc '&5i~?'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrtl.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #76
    //   82: goto -> 112
    //   85: bipush #112
    //   87: goto -> 112
    //   90: bipush #64
    //   92: goto -> 112
    //   95: bipush #86
    //   97: goto -> 112
    //   100: bipush #11
    //   102: goto -> 112
    //   105: bipush #11
    //   107: goto -> 112
    //   110: bipush #75
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrtl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */