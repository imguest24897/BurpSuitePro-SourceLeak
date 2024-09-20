package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Zs6<T> extends Zzg<T> implements Zi {
  protected final Boolean ZM;
  
  protected final DateFormat ZO;
  
  protected final AtomicReference<DateFormat> ZH;
  
  private static final String[] d;
  
  private static final String[] e;
  
  protected Zs6(Class<T> paramClass, Boolean paramBoolean, DateFormat paramDateFormat) {
    super(paramClass);
    this.ZM = paramBoolean;
    this.ZO = paramDateFormat;
    this.ZH = (paramDateFormat == null) ? null : new AtomicReference<>();
  }
  
  public abstract Zs6<T> Zm(Boolean paramBoolean, DateFormat paramDateFormat);
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: aload_0
    //   7: invokevirtual Zz : ()Ljava/lang/Class;
    //   10: invokevirtual Z_ : (Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zo;Ljava/lang/Class;)Lcom/fasterxml/Zgy;
    //   13: astore #4
    //   15: astore_3
    //   16: aload #4
    //   18: ifnonnull -> 27
    //   21: aload_0
    //   22: areturn
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload #4
    //   29: invokevirtual ZI : ()Lcom/fasterxml/Zqi;
    //   32: astore #5
    //   34: aload #5
    //   36: invokevirtual Zp : ()Z
    //   39: ifeq -> 55
    //   42: aload_0
    //   43: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   46: aconst_null
    //   47: invokevirtual Zm : (Ljava/lang/Boolean;Ljava/text/DateFormat;)Lcom/fasterxml/Zs6;
    //   50: areturn
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload #4
    //   57: invokevirtual ZR : ()Z
    //   60: ifeq -> 155
    //   63: aload #4
    //   65: invokevirtual ZA : ()Z
    //   68: ifeq -> 90
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload #4
    //   80: invokevirtual Zk : ()Ljava/util/Locale;
    //   83: goto -> 94
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: aload_1
    //   91: invokevirtual Zn : ()Ljava/util/Locale;
    //   94: astore #6
    //   96: new java/text/SimpleDateFormat
    //   99: dup
    //   100: aload #4
    //   102: invokevirtual Zu : ()Ljava/lang/String;
    //   105: aload #6
    //   107: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   110: astore #7
    //   112: aload #4
    //   114: invokevirtual ZT : ()Z
    //   117: ifeq -> 132
    //   120: aload #4
    //   122: invokevirtual ZB : ()Ljava/util/TimeZone;
    //   125: goto -> 136
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: aload_1
    //   133: invokevirtual Z_ : ()Ljava/util/TimeZone;
    //   136: astore #8
    //   138: aload #7
    //   140: aload #8
    //   142: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   145: aload_0
    //   146: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   149: aload #7
    //   151: invokevirtual Zm : (Ljava/lang/Boolean;Ljava/text/DateFormat;)Lcom/fasterxml/Zs6;
    //   154: areturn
    //   155: aload #4
    //   157: invokevirtual ZA : ()Z
    //   160: istore #6
    //   162: aload #4
    //   164: invokevirtual ZT : ()Z
    //   167: istore #7
    //   169: aload #5
    //   171: getstatic com/fasterxml/Zqi.STRING : Lcom/fasterxml/Zqi;
    //   174: if_acmpne -> 185
    //   177: iconst_1
    //   178: goto -> 186
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: iconst_0
    //   186: istore #8
    //   188: iload #6
    //   190: ifne -> 223
    //   193: iload #7
    //   195: ifne -> 223
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   204: athrow
    //   205: iload #8
    //   207: ifne -> 223
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   216: athrow
    //   217: aload_0
    //   218: areturn
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: aload_1
    //   224: invokevirtual ZH : ()Lcom/fasterxml/Zor/Zy7;
    //   227: invokevirtual Zb : ()Ljava/text/DateFormat;
    //   230: astore #9
    //   232: aload #9
    //   234: instanceof com/fasterxml/Zm/Ze3
    //   237: ifeq -> 297
    //   240: aload #9
    //   242: checkcast com/fasterxml/Zm/Ze3
    //   245: astore #10
    //   247: aload #4
    //   249: invokevirtual ZA : ()Z
    //   252: ifeq -> 267
    //   255: aload #10
    //   257: aload #4
    //   259: invokevirtual Zk : ()Ljava/util/Locale;
    //   262: invokevirtual Zo : (Ljava/util/Locale;)Lcom/fasterxml/Zm/Ze3;
    //   265: astore #10
    //   267: aload #4
    //   269: invokevirtual ZT : ()Z
    //   272: ifeq -> 287
    //   275: aload #10
    //   277: aload #4
    //   279: invokevirtual ZB : ()Ljava/util/TimeZone;
    //   282: invokevirtual ZS : (Ljava/util/TimeZone;)Lcom/fasterxml/Zm/Ze3;
    //   285: astore #10
    //   287: aload_0
    //   288: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   291: aload #10
    //   293: invokevirtual Zm : (Ljava/lang/Boolean;Ljava/text/DateFormat;)Lcom/fasterxml/Zs6;
    //   296: areturn
    //   297: aload #9
    //   299: instanceof java/text/SimpleDateFormat
    //   302: ifne -> 348
    //   305: aload_1
    //   306: aload_0
    //   307: invokevirtual Zz : ()Ljava/lang/Class;
    //   310: sipush #-5968
    //   313: sipush #-16303
    //   316: invokestatic b : (II)Ljava/lang/String;
    //   319: iconst_1
    //   320: anewarray java/lang/Object
    //   323: dup
    //   324: iconst_0
    //   325: aload #9
    //   327: invokevirtual getClass : ()Ljava/lang/Class;
    //   330: invokevirtual getName : ()Ljava/lang/String;
    //   333: aastore
    //   334: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   337: invokevirtual ZA : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   340: pop
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   347: athrow
    //   348: aload #9
    //   350: checkcast java/text/SimpleDateFormat
    //   353: astore #10
    //   355: iload #6
    //   357: ifeq -> 383
    //   360: new java/text/SimpleDateFormat
    //   363: dup
    //   364: aload #10
    //   366: invokevirtual toPattern : ()Ljava/lang/String;
    //   369: aload #4
    //   371: invokevirtual Zk : ()Ljava/util/Locale;
    //   374: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   377: astore #10
    //   379: aload_3
    //   380: ifnull -> 393
    //   383: aload #10
    //   385: invokevirtual clone : ()Ljava/lang/Object;
    //   388: checkcast java/text/SimpleDateFormat
    //   391: astore #10
    //   393: aload #4
    //   395: invokevirtual ZB : ()Ljava/util/TimeZone;
    //   398: astore #11
    //   400: aload #11
    //   402: ifnull -> 433
    //   405: aload #11
    //   407: aload #10
    //   409: invokevirtual getTimeZone : ()Ljava/util/TimeZone;
    //   412: invokevirtual equals : (Ljava/lang/Object;)Z
    //   415: ifne -> 433
    //   418: goto -> 425
    //   421: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   424: athrow
    //   425: iconst_1
    //   426: goto -> 434
    //   429: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   432: athrow
    //   433: iconst_0
    //   434: istore #12
    //   436: iload #12
    //   438: ifeq -> 455
    //   441: aload #10
    //   443: aload #11
    //   445: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   448: goto -> 455
    //   451: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   454: athrow
    //   455: aload_0
    //   456: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   459: aload #10
    //   461: invokevirtual Zm : (Ljava/lang/Boolean;Ljava/text/DateFormat;)Lcom/fasterxml/Zs6;
    //   464: areturn
    // Exception table:
    //   from	to	target	type
    //   16	23	23	com/fasterxml/Zor/Zy_
    //   34	51	51	com/fasterxml/Zor/Zy_
    //   55	71	74	com/fasterxml/Zor/Zy_
    //   63	86	86	com/fasterxml/Zor/Zy_
    //   112	128	128	com/fasterxml/Zor/Zy_
    //   169	181	181	com/fasterxml/Zor/Zy_
    //   188	198	201	com/fasterxml/Zor/Zy_
    //   193	210	213	com/fasterxml/Zor/Zy_
    //   205	219	219	com/fasterxml/Zor/Zy_
    //   297	341	344	com/fasterxml/Zor/Zy_
    //   400	418	421	com/fasterxml/Zor/Zy_
    //   405	429	429	com/fasterxml/Zor/Zy_
    //   436	448	451	com/fasterxml/Zor/Zy_
  }
  
  public boolean Zt(Zyi paramZyi, T paramT) {
    return false;
  }
  
  public abstract void serialize(T paramT, Zf paramZf, Zyi paramZyi) throws IOException;
  
  protected boolean Zh(Zyi paramZyi) {
    try {
      if (this.ZM != null)
        return this.ZM.booleanValue(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZO == null) {
        try {
          if (paramZyi != null)
            return paramZyi.ZW(Zy0.WRITE_DATES_AS_TIMESTAMPS); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        throw new IllegalArgumentException(b(-5967, -24064) + Zz().getName());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  protected void ZP(Date paramDate, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (this.ZO == null) {
        paramZyi.ZH(paramDate, paramZf);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    DateFormat dateFormat = this.ZH.getAndSet(null);
    if (dateFormat == null)
      dateFormat = (DateFormat)this.ZO.clone(); 
    paramZf.ZD(dateFormat.format(paramDate));
    this.ZH.compareAndSet(null, dateFormat);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'n.²ü^Àùù]¦\\rÒÜ¹âÔÓå\\b\AÞNªÃrï;\î:}Á&º1nãµ~8?C§zVÀ¶XV5±Êr\\r¤(¥­ÃLGÓí<éô«êÁåÁ#LX;OÙz»°ã£ëñ6J."Þ®R KìÚ»$ßP'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #94
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #46
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
    //   69: putstatic com/fasterxml/Zs6.d : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zs6.e : [Ljava/lang/String;
    //   79: goto -> 227
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
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #13
    //   154: goto -> 184
    //   157: bipush #18
    //   159: goto -> 184
    //   162: bipush #112
    //   164: goto -> 184
    //   167: bipush #116
    //   169: goto -> 184
    //   172: bipush #96
    //   174: goto -> 184
    //   177: bipush #105
    //   179: goto -> 184
    //   182: bipush #53
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE8B0) & 0xFFFF;
    if (e[i] == null) {
      char[] arrayOfChar = d[i].toCharArray();
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
      char c = '';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      e[i] = (new String(arrayOfChar)).intern();
    } 
    return e[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */