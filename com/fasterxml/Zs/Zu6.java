package com.fasterxml.Zs;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public abstract class Zu6<T> extends Zuy<T> implements Zi {
  protected final DateFormat ZA = null;
  
  protected final String ZG = null;
  
  private static final String[] e;
  
  private static final String[] f;
  
  protected Zu6(Class<?> paramClass) {
    super(paramClass);
  }
  
  protected Zu6(Zu6<T> paramZu6, DateFormat paramDateFormat, String paramString) {
    super(paramZu6.ZC);
  }
  
  protected abstract Zu6<T> Zk(DateFormat paramDateFormat, String paramString);
  
  public Zd Zb() {
    return Zd.DateTime;
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: aload_0
    //   7: invokevirtual ZX : ()Ljava/lang/Class;
    //   10: invokevirtual Zx : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Ljava/lang/Class;)Lcom/fasterxml/Zgy;
    //   13: astore #4
    //   15: astore_3
    //   16: aload #4
    //   18: ifnull -> 422
    //   21: aload #4
    //   23: invokevirtual ZB : ()Ljava/util/TimeZone;
    //   26: astore #5
    //   28: aload #4
    //   30: invokevirtual Zy : ()Ljava/lang/Boolean;
    //   33: astore #6
    //   35: aload #4
    //   37: invokevirtual ZR : ()Z
    //   40: ifeq -> 138
    //   43: aload #4
    //   45: invokevirtual Zu : ()Ljava/lang/String;
    //   48: astore #7
    //   50: aload #4
    //   52: invokevirtual ZA : ()Z
    //   55: ifeq -> 70
    //   58: aload #4
    //   60: invokevirtual Zk : ()Ljava/util/Locale;
    //   63: goto -> 74
    //   66: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_1
    //   71: invokevirtual Zn : ()Ljava/util/Locale;
    //   74: astore #8
    //   76: new java/text/SimpleDateFormat
    //   79: dup
    //   80: aload #7
    //   82: aload #8
    //   84: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   87: astore #9
    //   89: aload #5
    //   91: ifnonnull -> 100
    //   94: aload_1
    //   95: invokevirtual Z_ : ()Ljava/util/TimeZone;
    //   98: astore #5
    //   100: aload #9
    //   102: aload #5
    //   104: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   107: aload #6
    //   109: ifnull -> 129
    //   112: aload #9
    //   114: aload #6
    //   116: invokevirtual booleanValue : ()Z
    //   119: invokevirtual setLenient : (Z)V
    //   122: goto -> 129
    //   125: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload_0
    //   130: aload #9
    //   132: aload #7
    //   134: invokevirtual Zk : (Ljava/text/DateFormat;Ljava/lang/String;)Lcom/fasterxml/Zs/Zu6;
    //   137: areturn
    //   138: aload #5
    //   140: ifnull -> 292
    //   143: aload_1
    //   144: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   147: invokevirtual Zb : ()Ljava/text/DateFormat;
    //   150: astore #7
    //   152: aload #7
    //   154: invokevirtual getClass : ()Ljava/lang/Class;
    //   157: ldc com/fasterxml/Zm/Ze3
    //   159: if_acmpne -> 242
    //   162: aload #4
    //   164: invokevirtual ZA : ()Z
    //   167: ifeq -> 189
    //   170: goto -> 177
    //   173: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: aload #4
    //   179: invokevirtual Zk : ()Ljava/util/Locale;
    //   182: goto -> 193
    //   185: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: aload_1
    //   190: invokevirtual Zn : ()Ljava/util/Locale;
    //   193: astore #8
    //   195: aload #7
    //   197: checkcast com/fasterxml/Zm/Ze3
    //   200: astore #9
    //   202: aload #9
    //   204: aload #5
    //   206: invokevirtual ZS : (Ljava/util/TimeZone;)Lcom/fasterxml/Zm/Ze3;
    //   209: astore #9
    //   211: aload #9
    //   213: aload #8
    //   215: invokevirtual Zo : (Ljava/util/Locale;)Lcom/fasterxml/Zm/Ze3;
    //   218: astore #9
    //   220: aload #6
    //   222: ifnull -> 234
    //   225: aload #9
    //   227: aload #6
    //   229: invokevirtual Za : (Ljava/lang/Boolean;)Lcom/fasterxml/Zm/Ze3;
    //   232: astore #9
    //   234: aload #9
    //   236: astore #7
    //   238: aload_3
    //   239: ifnull -> 281
    //   242: aload #7
    //   244: invokevirtual clone : ()Ljava/lang/Object;
    //   247: checkcast java/text/DateFormat
    //   250: astore #7
    //   252: aload #7
    //   254: aload #5
    //   256: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   259: aload #6
    //   261: ifnull -> 281
    //   264: aload #7
    //   266: aload #6
    //   268: invokevirtual booleanValue : ()Z
    //   271: invokevirtual setLenient : (Z)V
    //   274: goto -> 281
    //   277: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   280: athrow
    //   281: aload_0
    //   282: aload #7
    //   284: aload_0
    //   285: getfield ZG : Ljava/lang/String;
    //   288: invokevirtual Zk : (Ljava/text/DateFormat;Ljava/lang/String;)Lcom/fasterxml/Zs/Zu6;
    //   291: areturn
    //   292: aload #6
    //   294: ifnull -> 422
    //   297: aload_1
    //   298: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   301: invokevirtual Zb : ()Ljava/text/DateFormat;
    //   304: astore #7
    //   306: aload_0
    //   307: getfield ZG : Ljava/lang/String;
    //   310: astore #8
    //   312: aload #7
    //   314: invokevirtual getClass : ()Ljava/lang/Class;
    //   317: ldc com/fasterxml/Zm/Ze3
    //   319: if_acmpne -> 353
    //   322: aload #7
    //   324: checkcast com/fasterxml/Zm/Ze3
    //   327: astore #9
    //   329: aload #9
    //   331: aload #6
    //   333: invokevirtual Za : (Ljava/lang/Boolean;)Lcom/fasterxml/Zm/Ze3;
    //   336: astore #9
    //   338: aload #9
    //   340: astore #7
    //   342: aload #9
    //   344: invokevirtual ZI : ()Ljava/lang/String;
    //   347: astore #8
    //   349: aload_3
    //   350: ifnull -> 397
    //   353: aload #7
    //   355: invokevirtual clone : ()Ljava/lang/Object;
    //   358: checkcast java/text/DateFormat
    //   361: astore #7
    //   363: aload #7
    //   365: aload #6
    //   367: invokevirtual booleanValue : ()Z
    //   370: invokevirtual setLenient : (Z)V
    //   373: aload #7
    //   375: instanceof java/text/SimpleDateFormat
    //   378: ifeq -> 397
    //   381: aload #7
    //   383: checkcast java/text/SimpleDateFormat
    //   386: invokevirtual toPattern : ()Ljava/lang/String;
    //   389: pop
    //   390: goto -> 397
    //   393: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   396: athrow
    //   397: aload #8
    //   399: ifnonnull -> 413
    //   402: sipush #13822
    //   405: sipush #-25146
    //   408: invokestatic c : (II)Ljava/lang/String;
    //   411: astore #8
    //   413: aload_0
    //   414: aload #7
    //   416: aload #8
    //   418: invokevirtual Zk : (Ljava/text/DateFormat;Ljava/lang/String;)Lcom/fasterxml/Zs/Zu6;
    //   421: areturn
    //   422: aload_0
    //   423: areturn
    // Exception table:
    //   from	to	target	type
    //   50	66	66	com/fasterxml/Zor/Zy_
    //   100	122	125	com/fasterxml/Zor/Zy_
    //   152	170	173	com/fasterxml/Zor/Zy_
    //   162	185	185	com/fasterxml/Zor/Zy_
    //   252	274	277	com/fasterxml/Zor/Zy_
    //   363	390	393	com/fasterxml/Zor/Zy_
  }
  
  protected Date ZG(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (this.ZA != null && paramZg.ZL(Zl.VALUE_STRING)) {
        String str = paramZg.ZR().trim();
        if (str.isEmpty()) {
          Zx zx = ZR(paramZyg, str);
          try {
            switch (Zr.Zx[zx.ordinal()]) {
              case 1:
                return new Date(0L);
            } 
          } catch (ParseException parseException) {
            throw b(null);
          } 
          return null;
        } 
        synchronized (this.ZA) {
          return this.ZA.parse(str);
        } 
      } 
    } catch (ParseException parseException) {
      throw b(null);
    } 
    return super.ZG(paramZg, paramZyg);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'lEO`¿LÛ½%Îþ¾Ë#J\\r|Öûf;µÃÏ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #9
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #43
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
    //   69: putstatic com/fasterxml/Zs/Zu6.e : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zs/Zu6.f : [Ljava/lang/String;
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
    //   152: bipush #109
    //   154: goto -> 184
    //   157: bipush #83
    //   159: goto -> 184
    //   162: bipush #127
    //   164: goto -> 184
    //   167: bipush #92
    //   169: goto -> 184
    //   172: bipush #16
    //   174: goto -> 184
    //   177: bipush #31
    //   179: goto -> 184
    //   182: bipush #102
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
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x35FE) & 0xFFFF;
    if (f[i] == null) {
      char[] arrayOfChar = e[i].toCharArray();
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
      byte b1 = 126;
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
      f[i] = (new String(arrayOfChar)).intern();
    } 
    return f[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */