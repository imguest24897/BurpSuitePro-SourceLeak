package com.fasterxml.Z_;

import com.fasterxml.Zor.Zr;
import com.fasterxml.Zoz.Zin;
import com.fasterxml.Zoz.Ziv;

public abstract class Zi {
  private static final Zi Zp;
  
  public static Zi ZF() {
    return Zp;
  }
  
  public abstract Boolean ZE(Ziv paramZiv);
  
  public abstract Boolean Zw(Ziv paramZiv);
  
  public abstract Zr Za(Zin paramZin);
  
  static {
    // Byte code:
    //   0: bipush #52
    //   2: ldc 'C;yw hT1f!+5z:6'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #20
    //   82: goto -> 112
    //   85: bipush #96
    //   87: goto -> 112
    //   90: bipush #32
    //   92: goto -> 112
    //   95: bipush #109
    //   97: goto -> 112
    //   100: bipush #114
    //   102: goto -> 112
    //   105: bipush #67
    //   107: goto -> 112
    //   110: bipush #47
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: aconst_null
    //   155: astore_2
    //   156: aload_0
    //   157: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   160: astore_3
    //   161: aload_3
    //   162: iconst_0
    //   163: invokestatic ZR : (Ljava/lang/Class;Z)Ljava/lang/Object;
    //   166: checkcast com/fasterxml/Z_/Zi
    //   169: astore_2
    //   170: goto -> 182
    //   173: astore_3
    //   174: goto -> 182
    //   177: astore_3
    //   178: aload_3
    //   179: invokestatic ZI : (Ljava/lang/Throwable;)V
    //   182: aload_2
    //   183: putstatic com/fasterxml/Z_/Zi.Zp : Lcom/fasterxml/Z_/Zi;
    //   186: return
    // Exception table:
    //   from	to	target	type
    //   156	170	173	java/lang/IllegalAccessError
    //   156	170	177	java/lang/Throwable
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Z_\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */