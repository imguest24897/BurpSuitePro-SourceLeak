package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Arrays;

@Zl
final class Zuz extends Zu1<float[]> {
  private static final long serialVersionUID = 1L;
  
  public Zuz() {
    super((Class)float[].class);
  }
  
  protected Zuz(Zuz paramZuz, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZuz, paramZzb, paramBoolean);
  }
  
  protected Zu1<?> Zk(Zzb paramZzb, Boolean paramBoolean) {
    return new Zuz(this, paramZzb, paramBoolean);
  }
  
  protected float[] ZK() {
    return new float[0];
  }
  
  public float[] Zq(Zg paramZg, Zyg paramZyg) throws IOException {
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
    //   17: checkcast [F
    //   20: areturn
    //   21: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_2
    //   26: invokevirtual ZS : ()Lcom/fasterxml/Zm/Zr;
    //   29: invokevirtual Zs : ()Lcom/fasterxml/Zm/Ze4;
    //   32: astore #4
    //   34: aload #4
    //   36: invokevirtual Zo : ()Ljava/lang/Object;
    //   39: checkcast [F
    //   42: astore #5
    //   44: iconst_0
    //   45: istore #6
    //   47: aload_1
    //   48: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   51: dup
    //   52: astore #7
    //   54: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   57: if_acmpeq -> 151
    //   60: aload #7
    //   62: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   65: if_acmpne -> 104
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
    //   105: aload_1
    //   106: aload_2
    //   107: invokevirtual Zx : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)F
    //   110: fstore #8
    //   112: iload #6
    //   114: aload #5
    //   116: arraylength
    //   117: if_icmplt -> 137
    //   120: aload #4
    //   122: aload #5
    //   124: iload #6
    //   126: invokevirtual ZL : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   129: checkcast [F
    //   132: astore #5
    //   134: iconst_0
    //   135: istore #6
    //   137: aload #5
    //   139: iload #6
    //   141: iinc #6, 1
    //   144: fload #8
    //   146: fastore
    //   147: aload_3
    //   148: ifnull -> 47
    //   151: goto -> 172
    //   154: astore #7
    //   156: aload #7
    //   158: aload #5
    //   160: aload #4
    //   162: invokevirtual Zf : ()I
    //   165: iload #6
    //   167: iadd
    //   168: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   171: athrow
    //   172: aload #4
    //   174: aload #5
    //   176: iload #6
    //   178: invokevirtual Zl : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   181: checkcast [F
    //   184: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	21	java/lang/Exception
    //   47	151	154	java/lang/Exception
    //   60	75	78	java/lang/Exception
    //   68	97	100	java/lang/Exception
  }
  
  protected float[] ZU(Zg paramZg, Zyg paramZyg) throws IOException {
    return new float[] { Zx(paramZg, paramZyg) };
  }
  
  protected float[] Zs(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    int i = paramArrayOffloat1.length;
    int j = paramArrayOffloat2.length;
    float[] arrayOfFloat = Arrays.copyOf(paramArrayOffloat1, i + j);
    System.arraycopy(paramArrayOffloat2, 0, arrayOfFloat, i, j);
    return arrayOfFloat;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */