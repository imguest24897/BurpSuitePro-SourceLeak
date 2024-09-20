package com.fasterxml;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zm5;
import java.util.Collection;

public class Zvt extends Zvq {
  private static final long serialVersionUID = 1L;
  
  private static final String g;
  
  public Zvt(Zg paramZg, String paramString1, Zm5 paramZm5, Class<?> paramClass, String paramString2, Collection<Object> paramCollection) {
    super(paramZg, paramString1, paramZm5, paramClass, paramString2, paramCollection);
  }
  
  public static Zvt ZK(Zg paramZg, Object paramObject, String paramString, Collection<Object> paramCollection) {
    // Byte code:
    //   0: invokestatic ZH : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: instanceof java/lang/Class
    //   9: ifeq -> 23
    //   12: aload_1
    //   13: checkcast java/lang/Class
    //   16: astore #5
    //   18: aload #4
    //   20: ifnull -> 29
    //   23: aload_1
    //   24: invokevirtual getClass : ()Ljava/lang/Class;
    //   27: astore #5
    //   29: getstatic com/fasterxml/Zvt.g : Ljava/lang/String;
    //   32: iconst_2
    //   33: anewarray java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: aload_2
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: aload #5
    //   44: invokevirtual getName : ()Ljava/lang/String;
    //   47: aastore
    //   48: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   51: astore #6
    //   53: new com/fasterxml/Zvt
    //   56: dup
    //   57: aload_0
    //   58: aload #6
    //   60: aload_0
    //   61: invokevirtual Zz : ()Lcom/fasterxml/Zb/Zm5;
    //   64: aload #5
    //   66: aload_2
    //   67: aload_3
    //   68: invokespecial <init> : (Lcom/fasterxml/Zb/Zg;Ljava/lang/String;Lcom/fasterxml/Zb/Zm5;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Collection;)V
    //   71: astore #7
    //   73: aload #7
    //   75: aload_1
    //   76: aload_2
    //   77: invokevirtual Zc : (Ljava/lang/Object;Ljava/lang/String;)V
    //   80: aload #7
    //   82: invokestatic Zwu : ()[Lburp/Zbqc;
    //   85: ifnonnull -> 95
    //   88: iconst_5
    //   89: anewarray burp/Zbqc
    //   92: invokestatic Z_ : ([Lburp/Zbqc;)V
    //   95: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc 'ig)Y;HR`!^tIUl7v\\nO+{ZY8NOz{WI}g49NNb>5\`<U&N^e>'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zvt.g : Ljava/lang/String;
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
    //   80: bipush #65
    //   82: goto -> 112
    //   85: bipush #116
    //   87: goto -> 112
    //   90: bipush #38
    //   92: goto -> 112
    //   95: bipush #15
    //   97: goto -> 112
    //   100: bipush #71
    //   102: goto -> 112
    //   105: bipush #41
    //   107: goto -> 112
    //   110: bipush #82
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */