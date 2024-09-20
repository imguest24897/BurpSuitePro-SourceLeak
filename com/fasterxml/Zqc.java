package com.fasterxml;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyp;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Zqc extends Zq2<LocalTime> {
  private static final long serialVersionUID = 1L;
  
  private static final DateTimeFormatter ZA;
  
  public static final Zqc ZZ;
  
  protected final Boolean Ze = null;
  
  private static final String[] h;
  
  private static final String[] i;
  
  protected Zqc() {
    this(ZA);
  }
  
  public Zqc(DateTimeFormatter paramDateTimeFormatter) {
    super(LocalTime.class, paramDateTimeFormatter);
  }
  
  protected Zqc(Zqc paramZqc, Boolean paramBoolean) {
    super(paramZqc, paramBoolean);
  }
  
  protected Zqc(Zqc paramZqc, Boolean paramBoolean1, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi, Boolean paramBoolean2) {
    super(paramZqc, paramBoolean1, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zqc Zo(DateTimeFormatter paramDateTimeFormatter) {
    return new Zqc(this, Boolean.valueOf(this.Zb), paramDateTimeFormatter, this.Zw, this.Ze);
  }
  
  protected Zqc ZY(Boolean paramBoolean) {
    return new Zqc(this, paramBoolean);
  }
  
  protected Zq2<?> ZI(Zyg paramZyg, Zo paramZo, Zgy paramZgy) {
    Zqc zqc = (Zqc)super.ZI(paramZyg, paramZo, paramZgy);
    Boolean bool = paramZgy.Zq(Zye.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
    try {
      if (!Objects.equals(bool, zqc.Ze))
        return new Zqc(zqc, Boolean.valueOf(zqc.Zb), zqc.Za, zqc.Zw, bool); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    return zqc;
  }
  
  public LocalTime Zi(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   8: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   11: ifeq -> 29
    //   14: aload_0
    //   15: aload_1
    //   16: aload_2
    //   17: aload_1
    //   18: invokevirtual ZR : ()Ljava/lang/String;
    //   21: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Ljava/time/LocalTime;
    //   24: areturn
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_1
    //   30: invokevirtual Zp : ()Z
    //   33: ifeq -> 57
    //   36: aload_0
    //   37: aload_1
    //   38: aload_2
    //   39: aload_2
    //   40: aload_1
    //   41: aload_0
    //   42: aload_0
    //   43: invokevirtual ZX : ()Ljava/lang/Class;
    //   46: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyo;Ljava/lang/Class;)Ljava/lang/String;
    //   49: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Ljava/time/LocalTime;
    //   52: areturn
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual Zs : ()Z
    //   61: ifeq -> 364
    //   64: aload_1
    //   65: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   68: astore #4
    //   70: aload #4
    //   72: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   75: if_acmpne -> 84
    //   78: aconst_null
    //   79: areturn
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload_2
    //   85: getstatic com/fasterxml/Zor/Zyp.UNWRAP_SINGLE_VALUE_ARRAYS : Lcom/fasterxml/Zor/Zyp;
    //   88: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   91: ifeq -> 158
    //   94: aload #4
    //   96: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   99: if_acmpeq -> 124
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   108: athrow
    //   109: aload #4
    //   111: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   114: if_acmpne -> 158
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload_0
    //   125: aload_1
    //   126: aload_2
    //   127: invokevirtual Zi : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/time/LocalTime;
    //   130: astore #5
    //   132: aload_1
    //   133: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   136: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   139: if_acmpeq -> 155
    //   142: aload_0
    //   143: aload_1
    //   144: aload_2
    //   145: invokevirtual ZH : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)V
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload #5
    //   157: areturn
    //   158: aload #4
    //   160: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   163: if_acmpne -> 337
    //   166: aload_1
    //   167: invokevirtual Ze : ()I
    //   170: istore #5
    //   172: aload_1
    //   173: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   176: pop
    //   177: aload_1
    //   178: invokevirtual Ze : ()I
    //   181: istore #6
    //   183: aload_1
    //   184: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   187: astore #4
    //   189: aload #4
    //   191: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   194: if_acmpne -> 210
    //   197: iload #5
    //   199: iload #6
    //   201: invokestatic of : (II)Ljava/time/LocalTime;
    //   204: astore #7
    //   206: aload_3
    //   207: ifnull -> 334
    //   210: aload_1
    //   211: invokevirtual Ze : ()I
    //   214: istore #8
    //   216: aload_1
    //   217: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   220: astore #4
    //   222: aload #4
    //   224: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   227: if_acmpne -> 245
    //   230: iload #5
    //   232: iload #6
    //   234: iload #8
    //   236: invokestatic of : (III)Ljava/time/LocalTime;
    //   239: astore #7
    //   241: aload_3
    //   242: ifnull -> 334
    //   245: aload_1
    //   246: invokevirtual Ze : ()I
    //   249: istore #9
    //   251: iload #9
    //   253: sipush #1000
    //   256: if_icmpge -> 281
    //   259: aload_0
    //   260: aload_2
    //   261: invokevirtual ZC : (Lcom/fasterxml/Zor/Zyg;)Z
    //   264: ifne -> 281
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: iload #9
    //   276: ldc 1000000
    //   278: imul
    //   279: istore #9
    //   281: aload_1
    //   282: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   285: astore #4
    //   287: aload #4
    //   289: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   292: if_acmpeq -> 321
    //   295: aload_2
    //   296: aload_1
    //   297: aload_0
    //   298: invokevirtual ZX : ()Ljava/lang/Class;
    //   301: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   304: sipush #27031
    //   307: sipush #-28679
    //   310: invokestatic d : (II)Ljava/lang/String;
    //   313: invokevirtual Zq : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Class;Lcom/fasterxml/Zb/Zl;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   316: athrow
    //   317: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   320: athrow
    //   321: iload #5
    //   323: iload #6
    //   325: iload #8
    //   327: iload #9
    //   329: invokestatic of : (IIII)Ljava/time/LocalTime;
    //   332: astore #7
    //   334: aload #7
    //   336: areturn
    //   337: aload_2
    //   338: aload_0
    //   339: invokevirtual ZX : ()Ljava/lang/Class;
    //   342: sipush #27030
    //   345: sipush #21194
    //   348: invokestatic d : (II)Ljava/lang/String;
    //   351: iconst_1
    //   352: anewarray java/lang/Object
    //   355: dup
    //   356: iconst_0
    //   357: aload #4
    //   359: aastore
    //   360: invokevirtual ZF : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   363: pop
    //   364: aload_1
    //   365: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   368: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   371: ifeq -> 386
    //   374: aload_1
    //   375: invokevirtual ZO : ()Ljava/lang/Object;
    //   378: checkcast java/time/LocalTime
    //   381: areturn
    //   382: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   385: athrow
    //   386: aload_1
    //   387: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   390: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   393: ifeq -> 409
    //   396: aload_0
    //   397: aload_1
    //   398: aload_2
    //   399: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)V
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   408: athrow
    //   409: aload_0
    //   410: aload_2
    //   411: aload_1
    //   412: sipush #27028
    //   415: sipush #-2690
    //   418: invokestatic d : (II)Ljava/lang/String;
    //   421: iconst_0
    //   422: anewarray java/lang/Object
    //   425: invokevirtual ZE : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zb/Zg;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   428: checkcast java/time/LocalTime
    //   431: areturn
    // Exception table:
    //   from	to	target	type
    //   4	25	25	java/io/IOException
    //   29	53	53	java/io/IOException
    //   70	80	80	java/io/IOException
    //   84	102	105	java/io/IOException
    //   94	117	120	java/io/IOException
    //   132	148	151	java/io/IOException
    //   251	267	270	java/io/IOException
    //   287	317	317	java/io/IOException
    //   364	382	382	java/io/IOException
    //   386	402	405	java/io/IOException
  }
  
  protected boolean ZC(Zyg paramZyg) {
    try {
    
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    return (this.Ze != null) ? this.Ze.booleanValue() : paramZyg.Zg(Zyp.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
  }
  
  protected LocalTime Zf(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    String str = paramString.trim();
    try {
      if (str.length() == 0)
        return ZN(paramZg, paramZyg, str); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    DateTimeFormatter dateTimeFormatter = this.Za;
    try {
      try {
        if (dateTimeFormatter == ZA && str.contains("T"))
          return LocalTime.parse(str, DateTimeFormatter.ISO_LOCAL_DATE_TIME); 
      } catch (DateTimeException dateTimeException) {
        throw a(null);
      } 
      return LocalTime.parse(str, dateTimeFormatter);
    } catch (DateTimeException dateTimeException) {
      return (LocalTime)Z_(paramZyg, dateTimeException, str);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Í(7xýzðó1¹ÇËüËM¡ÛÎçac3M.~+tùÃ²÷3EyÄÄÄÔW»ÃjI> G»o;o C5rw&¶ÇZ)~lz¾Ü.ÜkªwÈÓ«WHmþQ5¼uev'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #61
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #16
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic com/fasterxml/Zqc.h : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zqc.i : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #62
    //   154: goto -> 183
    //   157: bipush #91
    //   159: goto -> 183
    //   162: iconst_4
    //   163: goto -> 183
    //   166: bipush #44
    //   168: goto -> 183
    //   171: bipush #33
    //   173: goto -> 183
    //   176: bipush #27
    //   178: goto -> 183
    //   181: bipush #70
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: getstatic java/time/format/DateTimeFormatter.ISO_LOCAL_TIME : Ljava/time/format/DateTimeFormatter;
    //   229: putstatic com/fasterxml/Zqc.ZA : Ljava/time/format/DateTimeFormatter;
    //   232: new com/fasterxml/Zqc
    //   235: dup
    //   236: invokespecial <init> : ()V
    //   239: putstatic com/fasterxml/Zqc.ZZ : Lcom/fasterxml/Zqc;
    //   242: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6996) & 0xFFFF;
    if (i[i] == null) {
      char[] arrayOfChar = h[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 92;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      i[i] = (new String(arrayOfChar)).intern();
    } 
    return i[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */