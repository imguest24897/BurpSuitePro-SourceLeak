package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Arrays;

@Zl
final class Zu7 extends Zu1<int[]> {
  private static final long serialVersionUID = 1L;
  
  public static final Zu7 ZT = new Zu7();
  
  public Zu7() {
    super((Class)int[].class);
  }
  
  protected Zu7(Zu7 paramZu7, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZu7, paramZzb, paramBoolean);
  }
  
  protected Zu1<?> Zk(Zzb paramZzb, Boolean paramBoolean) {
    return new Zu7(this, paramZzb, paramBoolean);
  }
  
  protected int[] Zg() {
    return new int[0];
  }
  
  public int[] ZK(Zg paramZg, Zyg paramZyg) throws IOException {
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
    //   17: checkcast [I
    //   20: areturn
    //   21: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_2
    //   26: invokevirtual ZS : ()Lcom/fasterxml/Zm/Zr;
    //   29: invokevirtual ZW : ()Lcom/fasterxml/Zm/Ze6;
    //   32: astore #4
    //   34: aload #4
    //   36: invokevirtual Zo : ()Ljava/lang/Object;
    //   39: checkcast [I
    //   42: astore #5
    //   44: iconst_0
    //   45: istore #6
    //   47: aload_1
    //   48: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   51: dup
    //   52: astore #7
    //   54: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   57: if_acmpeq -> 188
    //   60: aload #7
    //   62: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   65: if_acmpne -> 78
    //   68: aload_1
    //   69: invokevirtual Ze : ()I
    //   72: istore #8
    //   74: aload_3
    //   75: ifnull -> 149
    //   78: aload #7
    //   80: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   83: if_acmpne -> 141
    //   86: goto -> 93
    //   89: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: aload_0
    //   94: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   97: ifnull -> 129
    //   100: goto -> 107
    //   103: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload_0
    //   108: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   111: aload_2
    //   112: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   117: pop
    //   118: aload_3
    //   119: ifnull -> 47
    //   122: goto -> 129
    //   125: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload_0
    //   130: aload_2
    //   131: invokevirtual Zn : (Lcom/fasterxml/Zor/Zyg;)V
    //   134: iconst_0
    //   135: istore #8
    //   137: aload_3
    //   138: ifnull -> 149
    //   141: aload_0
    //   142: aload_1
    //   143: aload_2
    //   144: invokevirtual Zy : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)I
    //   147: istore #8
    //   149: iload #6
    //   151: aload #5
    //   153: arraylength
    //   154: if_icmplt -> 174
    //   157: aload #4
    //   159: aload #5
    //   161: iload #6
    //   163: invokevirtual ZL : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   166: checkcast [I
    //   169: astore #5
    //   171: iconst_0
    //   172: istore #6
    //   174: aload #5
    //   176: iload #6
    //   178: iinc #6, 1
    //   181: iload #8
    //   183: iastore
    //   184: aload_3
    //   185: ifnull -> 47
    //   188: goto -> 209
    //   191: astore #7
    //   193: aload #7
    //   195: aload #5
    //   197: aload #4
    //   199: invokevirtual Zf : ()I
    //   202: iload #6
    //   204: iadd
    //   205: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   208: athrow
    //   209: aload #4
    //   211: aload #5
    //   213: iload #6
    //   215: invokevirtual Zl : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   218: checkcast [I
    //   221: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	21	java/lang/Exception
    //   47	188	191	java/lang/Exception
    //   74	86	89	java/lang/Exception
    //   78	100	103	java/lang/Exception
    //   93	122	125	java/lang/Exception
  }
  
  protected int[] Zg(Zg paramZg, Zyg paramZyg) throws IOException {
    return new int[] { Zy(paramZg, paramZyg) };
  }
  
  protected int[] Zp(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = paramArrayOfint1.length;
    int j = paramArrayOfint2.length;
    int[] arrayOfInt = Arrays.copyOf(paramArrayOfint1, i + j);
    System.arraycopy(paramArrayOfint2, 0, arrayOfInt, i, j);
    return arrayOfInt;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */