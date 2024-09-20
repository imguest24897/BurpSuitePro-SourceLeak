package com.fasterxml.Zo;

import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy4;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zr.Zm;
import java.io.IOException;

public class Zzu {
  protected final Zy4[] Zg;
  
  protected final Zm Zu;
  
  protected final Zm ZC;
  
  protected final int ZQ;
  
  private static final String a;
  
  private Zzu(Zy4[] paramArrayOfZy4, Zm paramZm1, Zm paramZm2, int paramInt) {
    this.Zg = paramArrayOfZy4;
    this.Zu = paramZm1;
    this.ZC = paramZm2;
    this.ZQ = paramInt;
  }
  
  public Zzu ZP(Zyc paramZyc) {
    int i = this.Zg.length;
    Zy4[] arrayOfZy4 = new Zy4[i];
    byte b = 0;
    String str = Zzp.ZP();
    while (b < i) {
      arrayOfZy4[b] = this.Zg[b].Zh(paramZyc);
      b++;
      if (str != null)
        break; 
    } 
    return new Zzu(arrayOfZy4, this.Zu, this.ZC, this.ZQ);
  }
  
  public Zzu ZE(Zk paramZk) {
    int i = this.Zg.length;
    String str = Zzp.ZP();
    Zy4[] arrayOfZy4 = new Zy4[i];
    byte b = 0;
    while (b < i) {
      arrayOfZy4[b] = this.Zg[b].Zf(paramZk);
      b++;
      if (str != null)
        break; 
    } 
    return new Zzu(arrayOfZy4, this.Zu, this.ZC, this.ZQ);
  }
  
  public Zk Zm(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    return Zw(new Zzk(paramArrayOfbyte, paramInt1, paramInt2));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('[');
    String str = Zzp.ZP();
    int i = this.Zg.length;
    if (i > 0) {
      stringBuilder.append(this.Zg[0].ZE().Zp());
      byte b = 1;
      while (b < i) {
        stringBuilder.append(a);
        stringBuilder.append(this.Zg[b].ZE().Zp());
        b++;
        if (str != null)
          break; 
      } 
    } 
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  private Zk Zw(Zzk paramZzk) throws IOException {
    // Byte code:
    //   0: invokestatic ZP : ()Ljava/lang/String;
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore #4
    //   8: astore_2
    //   9: aload_0
    //   10: getfield Zg : [Lcom/fasterxml/Zor/Zy4;
    //   13: astore #5
    //   15: aload #5
    //   17: arraylength
    //   18: istore #6
    //   20: iconst_0
    //   21: istore #7
    //   23: iload #7
    //   25: iload #6
    //   27: if_icmpge -> 179
    //   30: aload #5
    //   32: iload #7
    //   34: aaload
    //   35: astore #8
    //   37: aload_1
    //   38: invokevirtual ZC : ()V
    //   41: aload #8
    //   43: invokevirtual ZE : ()Lcom/fasterxml/Zb/Zmi;
    //   46: aload_1
    //   47: invokevirtual ZT : (Lcom/fasterxml/Zr/Za;)Lcom/fasterxml/Zr/Zm;
    //   50: astore #9
    //   52: aload #9
    //   54: ifnull -> 165
    //   57: aload #9
    //   59: invokevirtual ordinal : ()I
    //   62: aload_0
    //   63: getfield ZC : Lcom/fasterxml/Zr/Zm;
    //   66: invokevirtual ordinal : ()I
    //   69: if_icmpge -> 90
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   78: athrow
    //   79: aload_2
    //   80: ifnull -> 165
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   89: athrow
    //   90: aload_3
    //   91: ifnull -> 132
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   100: athrow
    //   101: aload #4
    //   103: invokevirtual ordinal : ()I
    //   106: aload #9
    //   108: invokevirtual ordinal : ()I
    //   111: if_icmplt -> 132
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   120: athrow
    //   121: aload_2
    //   122: ifnull -> 165
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   131: athrow
    //   132: aload #8
    //   134: astore_3
    //   135: aload #9
    //   137: astore #4
    //   139: aload #9
    //   141: invokevirtual ordinal : ()I
    //   144: aload_0
    //   145: getfield Zu : Lcom/fasterxml/Zr/Zm;
    //   148: invokevirtual ordinal : ()I
    //   151: if_icmplt -> 165
    //   154: aload_2
    //   155: ifnull -> 179
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   164: athrow
    //   165: iinc #7, 1
    //   168: aload_2
    //   169: ifnull -> 23
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   178: athrow
    //   179: aload_1
    //   180: aload_3
    //   181: aload #4
    //   183: invokevirtual Zd : (Lcom/fasterxml/Zor/Zy4;Lcom/fasterxml/Zr/Zm;)Lcom/fasterxml/Zo/Zk;
    //   186: areturn
    // Exception table:
    //   from	to	target	type
    //   52	72	75	java/io/IOException
    //   57	83	86	java/io/IOException
    //   79	94	97	java/io/IOException
    //   90	114	117	java/io/IOException
    //   101	125	128	java/io/IOException
    //   139	158	161	java/io/IOException
    //   154	172	175	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #85
    //   2: ldc 'P'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zo/Zzu.a : Ljava/lang/String;
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
    //   80: bipush #119
    //   82: goto -> 112
    //   85: bipush #37
    //   87: goto -> 112
    //   90: bipush #117
    //   92: goto -> 112
    //   95: bipush #44
    //   97: goto -> 112
    //   100: bipush #57
    //   102: goto -> 112
    //   105: bipush #18
    //   107: goto -> 112
    //   110: bipush #81
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zzu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */