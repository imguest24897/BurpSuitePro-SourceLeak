package com.fasterxml.Zo;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zg.Zfc;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zoz.Ziz;
import java.io.IOException;
import java.io.Serializable;

public class Za extends Zl implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zfc Zj;
  
  private static final String c;
  
  public Za(Zo paramZo, Ziz paramZiz, Zk paramZk, Zyo<Object> paramZyo, Zfc paramZfc) {
    super(paramZo, paramZiz, paramZk, null, paramZyo, null);
    this.Zj = paramZfc;
  }
  
  public void ZU(Zg paramZg, Zyg paramZyg, Object paramObject, String paramString) throws IOException {
    ZC(paramObject, paramString, (Zb)ZZ(paramZg, paramZyg));
  }
  
  public Object ZZ(Zg paramZg, Zyg paramZyg) throws IOException {
    return this.Ze.deserialize(paramZg, paramZyg);
  }
  
  protected void ZO(Object paramObject1, Object paramObject2, Object paramObject3) throws Exception {
    ZC(paramObject1, (String)paramObject2, (Zb)paramObject3);
  }
  
  protected void ZC(Object paramObject, String paramString, Zb paramZb) throws IOException {
    // Byte code:
    //   0: invokestatic ZP : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZZ : Lcom/fasterxml/Zoz/Ziz;
    //   7: checkcast com/fasterxml/Zoz/Zi6
    //   10: astore #5
    //   12: astore #4
    //   14: aload #5
    //   16: aload_1
    //   17: invokevirtual ZA : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: astore #6
    //   22: aload #6
    //   24: ifnonnull -> 49
    //   27: aload_0
    //   28: getfield Zj : Lcom/fasterxml/Zg/Zfc;
    //   31: invokevirtual Ze : ()Lcom/fasterxml/Zg/Zr;
    //   34: astore #7
    //   36: aload #5
    //   38: aload_1
    //   39: aload #7
    //   41: invokevirtual ZL : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   44: aload #4
    //   46: ifnull -> 111
    //   49: aload #6
    //   51: instanceof com/fasterxml/Zg/Zr
    //   54: ifne -> 104
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   63: athrow
    //   64: aconst_null
    //   65: checkcast com/fasterxml/Zor/Zyg
    //   68: getstatic com/fasterxml/Zo/Za.c : Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload_0
    //   78: invokevirtual Zh : ()Ljava/lang/String;
    //   81: aastore
    //   82: dup
    //   83: iconst_1
    //   84: aload #6
    //   86: invokevirtual getClass : ()Ljava/lang/Class;
    //   89: invokestatic Za : (Ljava/lang/Class;)Ljava/lang/String;
    //   92: aastore
    //   93: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   96: invokestatic Z_ : (Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   99: athrow
    //   100: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   103: athrow
    //   104: aload #6
    //   106: checkcast com/fasterxml/Zg/Zr
    //   109: astore #7
    //   111: aload #7
    //   113: aload_2
    //   114: aload_3
    //   115: invokevirtual Zo : (Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)Lcom/fasterxml/Zor/Zb;
    //   118: pop
    //   119: return
    // Exception table:
    //   from	to	target	type
    //   36	57	60	java/io/IOException
    //   49	100	100	java/io/IOException
  }
  
  public Zl ZO(Zyo<Object> paramZyo) {
    return this;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #112
    //   2: ldc 'hU\\fxM_ZLn\\bEJQC=JM@r^{xEp[}MSK@@Dn'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zo/Za.c : Ljava/lang/String;
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
    //   80: bipush #78
    //   82: goto -> 112
    //   85: bipush #68
    //   87: goto -> 112
    //   90: bipush #16
    //   92: goto -> 112
    //   95: bipush #17
    //   97: goto -> 112
    //   100: bipush #109
    //   102: goto -> 112
    //   105: bipush #29
    //   107: goto -> 112
    //   110: bipush #65
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */