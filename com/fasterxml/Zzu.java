package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;

public class Zzu extends Zz0<Object> {
  protected final int ZM;
  
  public Zzu(int paramInt, Class<?> paramClass) {
    super(paramClass, false);
    this.ZM = paramInt;
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZM : I
    //   9: tableswitch default -> 254, 1 -> 56, 2 -> 77, 3 -> 101, 4 -> 124, 5 -> 201, 6 -> 201, 7 -> 224, 8 -> 254
    //   56: aload_3
    //   57: aload_1
    //   58: checkcast java/util/Date
    //   61: aload_2
    //   62: invokevirtual ZA : (Ljava/util/Date;Lcom/fasterxml/Zb/Zf;)V
    //   65: aload #4
    //   67: ifnull -> 269
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   76: athrow
    //   77: aload_3
    //   78: aload_1
    //   79: checkcast java/util/Calendar
    //   82: invokevirtual getTimeInMillis : ()J
    //   85: aload_2
    //   86: invokevirtual ZB : (JLcom/fasterxml/Zb/Zf;)V
    //   89: aload #4
    //   91: ifnull -> 269
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   100: athrow
    //   101: aload_2
    //   102: aload_1
    //   103: checkcast java/lang/Class
    //   106: invokevirtual getName : ()Ljava/lang/String;
    //   109: invokevirtual ZY : (Ljava/lang/String;)V
    //   112: aload #4
    //   114: ifnull -> 269
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   123: athrow
    //   124: aload_3
    //   125: getstatic com/fasterxml/Zor/Zy0.WRITE_ENUMS_USING_TO_STRING : Lcom/fasterxml/Zor/Zy0;
    //   128: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   131: ifeq -> 152
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   140: athrow
    //   141: aload_1
    //   142: invokevirtual toString : ()Ljava/lang/String;
    //   145: astore #5
    //   147: aload #4
    //   149: ifnull -> 190
    //   152: aload_1
    //   153: checkcast java/lang/Enum
    //   156: astore #6
    //   158: aload_3
    //   159: getstatic com/fasterxml/Zor/Zy0.WRITE_ENUM_KEYS_USING_INDEX : Lcom/fasterxml/Zor/Zy0;
    //   162: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   165: ifeq -> 183
    //   168: aload #6
    //   170: invokevirtual ordinal : ()I
    //   173: invokestatic valueOf : (I)Ljava/lang/String;
    //   176: astore #5
    //   178: aload #4
    //   180: ifnull -> 190
    //   183: aload #6
    //   185: invokevirtual name : ()Ljava/lang/String;
    //   188: astore #5
    //   190: aload_2
    //   191: aload #5
    //   193: invokevirtual ZY : (Ljava/lang/String;)V
    //   196: aload #4
    //   198: ifnull -> 269
    //   201: aload_2
    //   202: aload_1
    //   203: checkcast java/lang/Number
    //   206: invokevirtual longValue : ()J
    //   209: invokevirtual ZI : (J)V
    //   212: aload #4
    //   214: ifnull -> 269
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   223: athrow
    //   224: aload_3
    //   225: invokevirtual ZH : ()Lcom/fasterxml/Zor/Zy7;
    //   228: invokevirtual Zn : ()Lcom/fasterxml/Zb/Zy;
    //   231: aload_1
    //   232: checkcast [B
    //   235: checkcast [B
    //   238: invokevirtual ZS : ([B)Ljava/lang/String;
    //   241: astore #5
    //   243: aload_2
    //   244: aload #5
    //   246: invokevirtual ZY : (Ljava/lang/String;)V
    //   249: aload #4
    //   251: ifnull -> 269
    //   254: aload_2
    //   255: aload_1
    //   256: invokevirtual toString : ()Ljava/lang/String;
    //   259: invokevirtual ZY : (Ljava/lang/String;)V
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   268: athrow
    //   269: return
    // Exception table:
    //   from	to	target	type
    //   5	70	73	java/io/IOException
    //   56	94	97	java/io/IOException
    //   77	117	120	java/io/IOException
    //   101	134	137	java/io/IOException
    //   190	217	220	java/io/IOException
    //   243	262	265	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */