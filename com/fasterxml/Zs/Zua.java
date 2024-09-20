package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Arrays;

@Zl
final class Zua extends Zu1<short[]> {
  private static final long serialVersionUID = 1L;
  
  public Zua() {
    super((Class)short[].class);
  }
  
  protected Zua(Zua paramZua, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZua, paramZzb, paramBoolean);
  }
  
  protected Zu1<?> Zk(Zzb paramZzb, Boolean paramBoolean) {
    return new Zua(this, paramZzb, paramBoolean);
  }
  
  protected short[] ZP() {
    return new short[0];
  }
  
  public short[] ZK(Zg paramZg, Zyg paramZyg) throws IOException {
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
    //   17: checkcast [S
    //   20: areturn
    //   21: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_2
    //   26: invokevirtual ZS : ()Lcom/fasterxml/Zm/Zr;
    //   29: invokevirtual ZU : ()Lcom/fasterxml/Zm/Zei;
    //   32: astore #4
    //   34: aload #4
    //   36: invokevirtual Zo : ()Ljava/lang/Object;
    //   39: checkcast [S
    //   42: astore #5
    //   44: iconst_0
    //   45: istore #6
    //   47: aload_1
    //   48: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   51: dup
    //   52: astore #7
    //   54: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   57: if_acmpeq -> 163
    //   60: aload #7
    //   62: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   65: if_acmpne -> 116
    //   68: aload_0
    //   69: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   72: ifnull -> 104
    //   75: goto -> 82
    //   78: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   86: aload_2
    //   87: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   92: pop
    //   93: aload_3
    //   94: ifnull -> 47
    //   97: goto -> 104
    //   100: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload_0
    //   105: aload_2
    //   106: invokevirtual Zn : (Lcom/fasterxml/Zor/Zyg;)V
    //   109: iconst_0
    //   110: istore #8
    //   112: aload_3
    //   113: ifnull -> 124
    //   116: aload_0
    //   117: aload_1
    //   118: aload_2
    //   119: invokevirtual Zu : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)S
    //   122: istore #8
    //   124: iload #6
    //   126: aload #5
    //   128: arraylength
    //   129: if_icmplt -> 149
    //   132: aload #4
    //   134: aload #5
    //   136: iload #6
    //   138: invokevirtual ZL : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   141: checkcast [S
    //   144: astore #5
    //   146: iconst_0
    //   147: istore #6
    //   149: aload #5
    //   151: iload #6
    //   153: iinc #6, 1
    //   156: iload #8
    //   158: sastore
    //   159: aload_3
    //   160: ifnull -> 47
    //   163: goto -> 184
    //   166: astore #7
    //   168: aload #7
    //   170: aload #5
    //   172: aload #4
    //   174: invokevirtual Zf : ()I
    //   177: iload #6
    //   179: iadd
    //   180: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   183: athrow
    //   184: aload #4
    //   186: aload #5
    //   188: iload #6
    //   190: invokevirtual Zl : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   193: checkcast [S
    //   196: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	21	java/lang/Exception
    //   47	163	166	java/lang/Exception
    //   60	75	78	java/lang/Exception
    //   68	97	100	java/lang/Exception
  }
  
  protected short[] Zq(Zg paramZg, Zyg paramZyg) throws IOException {
    return new short[] { Zu(paramZg, paramZyg) };
  }
  
  protected short[] Zn(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    int i = paramArrayOfshort1.length;
    int j = paramArrayOfshort2.length;
    short[] arrayOfShort = Arrays.copyOf(paramArrayOfshort1, i + j);
    System.arraycopy(paramArrayOfshort2, 0, arrayOfShort, i, j);
    return arrayOfShort;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zua.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */