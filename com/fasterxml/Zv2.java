package com.fasterxml;

import com.fasterxml.Zo.Zzj;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyv;

class Zv2 extends Zzj {
  final Zyf ZR;
  
  private static final String a;
  
  Zv2(Zyf paramZyf) {}
  
  public Zzp Zs(Zyc paramZyc, Zyv paramZyv, Zzp paramZzp) {
    // Byte code:
    //   0: invokestatic Zf : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: invokevirtual Zf : ()Lcom/fasterxml/Zor/Zk;
    //   7: astore #5
    //   9: aload #5
    //   11: invokevirtual Zf : ()Ljava/lang/Class;
    //   14: astore #6
    //   16: astore #4
    //   18: ldc java/time/ZoneId
    //   20: aload #6
    //   22: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   25: ifeq -> 115
    //   28: aload_3
    //   29: instanceof com/fasterxml/Zs/Zfa
    //   32: ifeq -> 115
    //   35: aload_3
    //   36: checkcast com/fasterxml/Zs/Zfa
    //   39: astore #7
    //   41: aload #6
    //   43: ldc java/time/ZoneId
    //   45: if_acmpne -> 59
    //   48: aload_2
    //   49: invokevirtual Zo : ()Lcom/fasterxml/Zoz/Zia;
    //   52: astore #8
    //   54: aload #4
    //   56: ifnonnull -> 72
    //   59: aload_1
    //   60: aload_1
    //   61: ldc java/time/ZoneId
    //   63: invokevirtual Zu : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   66: aload_1
    //   67: invokestatic ZB : (Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zoz/Zij;)Lcom/fasterxml/Zoz/Zia;
    //   70: astore #8
    //   72: aload #7
    //   74: invokevirtual Zp : ()Z
    //   77: ifne -> 115
    //   80: aload_0
    //   81: getfield ZR : Lcom/fasterxml/Zyf;
    //   84: aload #8
    //   86: getstatic com/fasterxml/Zv2.a : Ljava/lang/String;
    //   89: iconst_1
    //   90: anewarray java/lang/Class
    //   93: dup
    //   94: iconst_0
    //   95: ldc java/lang/String
    //   97: aastore
    //   98: invokevirtual Zq : (Lcom/fasterxml/Zoz/Zia;Ljava/lang/String;[Ljava/lang/Class;)Lcom/fasterxml/Zoz/Ziq;
    //   101: astore #9
    //   103: aload #9
    //   105: ifnull -> 115
    //   108: aload #7
    //   110: aload #9
    //   112: invokevirtual Zn : (Lcom/fasterxml/Zoz/Zif;)V
    //   115: aload_3
    //   116: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #63
    //   2: ldc '*-'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zv2.a : Ljava/lang/String;
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
    //   80: bipush #122
    //   82: goto -> 112
    //   85: bipush #116
    //   87: goto -> 112
    //   90: bipush #64
    //   92: goto -> 112
    //   95: bipush #33
    //   97: goto -> 112
    //   100: bipush #110
    //   102: goto -> 112
    //   105: bipush #113
    //   107: goto -> 112
    //   110: bipush #13
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */