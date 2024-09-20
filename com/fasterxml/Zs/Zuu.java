package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Arrays;

@Zl
final class Zuu extends Zu1<boolean[]> {
  private static final long serialVersionUID = 1L;
  
  public Zuu() {
    super((Class)boolean[].class);
  }
  
  protected Zuu(Zuu paramZuu, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZuu, paramZzb, paramBoolean);
  }
  
  protected Zu1<?> Zk(Zzb paramZzb, Boolean paramBoolean) {
    return new Zuu(this, paramZzb, paramBoolean);
  }
  
  protected boolean[] ZM() {
    return new boolean[0];
  }
  
  public boolean[] ZQ(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual Zs : ()Z
    //   8: ifne -> 25
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual Zn : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   17: checkcast [Z
    //   20: areturn
    //   21: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_2
    //   26: invokevirtual ZS : ()Lcom/fasterxml/Zm/Zr;
    //   29: invokevirtual Zt : ()Lcom/fasterxml/Zm/Ze9;
    //   32: astore #4
    //   34: aload #4
    //   36: invokevirtual Zo : ()Ljava/lang/Object;
    //   39: checkcast [Z
    //   42: astore #5
    //   44: iconst_0
    //   45: istore #6
    //   47: aload_1
    //   48: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   51: dup
    //   52: astore #7
    //   54: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   57: if_acmpeq -> 207
    //   60: aload #7
    //   62: getstatic com/fasterxml/Zb/Zl.VALUE_TRUE : Lcom/fasterxml/Zb/Zl;
    //   65: if_acmpne -> 75
    //   68: iconst_1
    //   69: istore #8
    //   71: aload_3
    //   72: ifnull -> 168
    //   75: aload #7
    //   77: getstatic com/fasterxml/Zb/Zl.VALUE_FALSE : Lcom/fasterxml/Zb/Zl;
    //   80: if_acmpne -> 97
    //   83: goto -> 90
    //   86: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: iconst_0
    //   91: istore #8
    //   93: aload_3
    //   94: ifnull -> 168
    //   97: aload #7
    //   99: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   102: if_acmpne -> 160
    //   105: goto -> 112
    //   108: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: aload_0
    //   113: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   116: ifnull -> 148
    //   119: goto -> 126
    //   122: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: aload_0
    //   127: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   130: aload_2
    //   131: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   136: pop
    //   137: aload_3
    //   138: ifnull -> 47
    //   141: goto -> 148
    //   144: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: aload_0
    //   149: aload_2
    //   150: invokevirtual Zn : (Lcom/fasterxml/Zor/Zyg;)V
    //   153: iconst_0
    //   154: istore #8
    //   156: aload_3
    //   157: ifnull -> 168
    //   160: aload_0
    //   161: aload_1
    //   162: aload_2
    //   163: invokevirtual Zt : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Z
    //   166: istore #8
    //   168: iload #6
    //   170: aload #5
    //   172: arraylength
    //   173: if_icmplt -> 193
    //   176: aload #4
    //   178: aload #5
    //   180: iload #6
    //   182: invokevirtual ZL : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   185: checkcast [Z
    //   188: astore #5
    //   190: iconst_0
    //   191: istore #6
    //   193: aload #5
    //   195: iload #6
    //   197: iinc #6, 1
    //   200: iload #8
    //   202: bastore
    //   203: aload_3
    //   204: ifnull -> 47
    //   207: goto -> 228
    //   210: astore #7
    //   212: aload #7
    //   214: aload #5
    //   216: aload #4
    //   218: invokevirtual Zf : ()I
    //   221: iload #6
    //   223: iadd
    //   224: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   227: athrow
    //   228: aload #4
    //   230: aload #5
    //   232: iload #6
    //   234: invokevirtual Zl : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   237: checkcast [Z
    //   240: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	21	java/lang/Exception
    //   47	207	210	java/lang/Exception
    //   71	83	86	java/lang/Exception
    //   93	105	108	java/lang/Exception
    //   97	119	122	java/lang/Exception
    //   112	141	144	java/lang/Exception
  }
  
  protected boolean[] Zw(Zg paramZg, Zyg paramZyg) throws IOException {
    return new boolean[] { Zt(paramZg, paramZyg) };
  }
  
  protected boolean[] ZK(boolean[] paramArrayOfboolean1, boolean[] paramArrayOfboolean2) {
    int i = paramArrayOfboolean1.length;
    int j = paramArrayOfboolean2.length;
    boolean[] arrayOfBoolean = Arrays.copyOf(paramArrayOfboolean1, i + j);
    System.arraycopy(paramArrayOfboolean2, 0, arrayOfBoolean, i, j);
    return arrayOfBoolean;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */