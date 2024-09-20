package com.fasterxml.Zor;

import burp.Zbqc;
import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zyx;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class Zy_ extends Zym {
  private static final long serialVersionUID = 3L;
  
  protected LinkedList<Zyy> Zb;
  
  protected transient Closeable ZE;
  
  private static Zbqc[] ZR;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zy_(Closeable paramCloseable, String paramString) {
    super(paramString);
    this.ZE = paramCloseable;
    if (paramCloseable instanceof Zg)
      this.Zq = ((Zg)paramCloseable).ZQ(); 
  }
  
  public Zy_(Closeable paramCloseable, String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.ZE = paramCloseable;
    int i = Zyo.Zp();
    if (paramThrowable instanceof Zd) {
      this.Zq = ((Zd)paramThrowable).ZD();
      if (i == 0) {
        if (paramCloseable instanceof Zg)
          this.Zq = ((Zg)paramCloseable).ZQ(); 
        return;
      } 
      return;
    } 
    if (paramCloseable instanceof Zg)
      this.Zq = ((Zg)paramCloseable).ZQ(); 
  }
  
  public Zy_(Closeable paramCloseable, String paramString, Zm5 paramZm5) {
    super(paramString, paramZm5);
    this.ZE = paramCloseable;
  }
  
  public static Zy_ Zn(Zg paramZg, String paramString) {
    return new Zy_((Closeable)paramZg, paramString);
  }
  
  public static Zy_ ZT(Zg paramZg, String paramString, Throwable paramThrowable) {
    return new Zy_((Closeable)paramZg, paramString, paramThrowable);
  }
  
  public static Zy_ ZG(Zf paramZf, String paramString) {
    return new Zy_((Closeable)paramZf, paramString, (Throwable)null);
  }
  
  public static Zy_ ZH(Zf paramZf, String paramString, Throwable paramThrowable) {
    return new Zy_((Closeable)paramZf, paramString, paramThrowable);
  }
  
  public static Zy_ Z_(Zyg paramZyg, String paramString) {
    return new Zy_((Closeable)Zz(paramZyg), paramString);
  }
  
  private static Zg Zz(Zyg paramZyg) {
    return (paramZyg == null) ? null : paramZyg.Zu();
  }
  
  public static Zy_ ZG(IOException paramIOException) {
    return new Zy_(null, String.format(b(-26522, -28410), new Object[] { paramIOException.getClass().getName(), Zx.Zr(paramIOException) }));
  }
  
  public static Zy_ ZF(Throwable paramThrowable, Object paramObject, String paramString) {
    return ZX(paramThrowable, new Zyy(paramObject, paramString));
  }
  
  public static Zy_ ZR(Throwable paramThrowable, Object paramObject, int paramInt) {
    return ZX(paramThrowable, new Zyy(paramObject, paramInt));
  }
  
  public static Zy_ ZX(Throwable paramThrowable, Zyy paramZyy) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: instanceof com/fasterxml/Zor/Zy_
    //   8: ifeq -> 20
    //   11: aload_0
    //   12: checkcast com/fasterxml/Zor/Zy_
    //   15: astore_3
    //   16: iload_2
    //   17: ifne -> 125
    //   20: aload_0
    //   21: invokestatic Zr : (Ljava/lang/Throwable;)Ljava/lang/String;
    //   24: astore #4
    //   26: aload #4
    //   28: ifnull -> 39
    //   31: aload #4
    //   33: invokevirtual isEmpty : ()Z
    //   36: ifeq -> 78
    //   39: new java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: sipush #-26523
    //   49: sipush #4839
    //   52: invokestatic b : (II)Ljava/lang/String;
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: aload_0
    //   59: invokevirtual getClass : ()Ljava/lang/Class;
    //   62: invokevirtual getName : ()Ljava/lang/String;
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc ')'
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual toString : ()Ljava/lang/String;
    //   76: astore #4
    //   78: aconst_null
    //   79: astore #5
    //   81: aload_0
    //   82: instanceof com/fasterxml/Zb/Zd
    //   85: ifeq -> 112
    //   88: aload_0
    //   89: checkcast com/fasterxml/Zb/Zd
    //   92: invokevirtual Zn : ()Ljava/lang/Object;
    //   95: astore #6
    //   97: aload #6
    //   99: instanceof java/io/Closeable
    //   102: ifeq -> 112
    //   105: aload #6
    //   107: checkcast java/io/Closeable
    //   110: astore #5
    //   112: new com/fasterxml/Zor/Zy_
    //   115: dup
    //   116: aload #5
    //   118: aload #4
    //   120: aload_0
    //   121: invokespecial <init> : (Ljava/io/Closeable;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   124: astore_3
    //   125: aload_3
    //   126: aload_1
    //   127: invokevirtual ZH : (Lcom/fasterxml/Zor/Zyy;)V
    //   130: aload_3
    //   131: areturn
  }
  
  public Zy_ Zc(Throwable paramThrowable) {
    initCause(paramThrowable);
    return this;
  }
  
  public StringBuilder ZS(StringBuilder paramStringBuilder) {
    Zl(paramStringBuilder);
    return paramStringBuilder;
  }
  
  public void Zc(Object paramObject, String paramString) {
    ZH(new Zyy(paramObject, paramString));
  }
  
  public void ZH(Zyy paramZyy) {
    if (this.Zb == null)
      this.Zb = new LinkedList<>(); 
    if (this.Zb.size() < 1000)
      this.Zb.addFirst(paramZyy); 
  }
  
  @Zyx
  public Object Zn() {
    return this.ZE;
  }
  
  public String getLocalizedMessage() {
    return Zq();
  }
  
  public String getMessage() {
    return Zq();
  }
  
  protected String Zq() {
    String str = super.getMessage();
    if (this.Zb == null)
      return str; 
    StringBuilder stringBuilder = (str == null) ? new StringBuilder() : new StringBuilder(str);
    stringBuilder.append(b(-26524, -11678));
    stringBuilder = ZS(stringBuilder);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  public String toString() {
    return getClass().getName() + b(-26527, -20237) + getMessage();
  }
  
  protected void Zl(StringBuilder paramStringBuilder) {
    int i = Zyo.Zp();
    if (this.Zb == null)
      return; 
    Iterator<Zyy> iterator = this.Zb.iterator();
    while (iterator.hasNext()) {
      paramStringBuilder.append(((Zyy)iterator.next()).toString());
      if (iterator.hasNext()) {
        paramStringBuilder.append(b(-26521, 21812));
        if (i == 0)
          break; 
      } 
    } 
  }
  
  public static void ZB(Zbqc[] paramArrayOfZbqc) {
    ZR = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZL() {
    return ZR;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: invokestatic ZB : ([Lburp/Zbqc;)V
    //   12: ldc 'oNK«YÈÔÆ¢þ<Ïï×jõq%3e3JÍj\\bº'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: iconst_5
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: iconst_2
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 142
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 25
    //   69: ldc 'ìíðY>´50Òg¦µs',rck{\\b`ãì¥(b´)¼Mw1ö'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #39
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: iconst_2
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 142
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 83
    //   127: aload #5
    //   129: putstatic com/fasterxml/Zor/Zy_.c : [Ljava/lang/String;
    //   132: iconst_5
    //   133: anewarray java/lang/String
    //   136: putstatic com/fasterxml/Zor/Zy_.d : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #15
    //   214: goto -> 243
    //   217: bipush #78
    //   219: goto -> 243
    //   222: bipush #73
    //   224: goto -> 243
    //   227: iconst_3
    //   228: goto -> 243
    //   231: bipush #54
    //   233: goto -> 243
    //   236: bipush #16
    //   238: goto -> 243
    //   241: bipush #6
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 41, 0 -> 99
    //   300: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9865) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 11;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zy_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */