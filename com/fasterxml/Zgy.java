package com.fasterxml;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

public class Zgy implements Zvs<Zzv>, Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Zgy ZT;
  
  private final String ZE;
  
  private final Zqi Zo;
  
  private final Locale Z_;
  
  private final String ZP;
  
  private final Boolean Zn;
  
  private final Zgt Zp;
  
  private transient TimeZone Zk;
  
  private static String[] ZM;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zgy() {
    this("", Zqi.ANY, "", "", Zgt.Zb(), null);
  }
  
  public Zgy(Zzv paramZzv) {
    this(paramZzv.ZH(), paramZzv.Zb(), paramZzv.ZD(), paramZzv.ZR(), Zgt.ZC(paramZzv), paramZzv.Zd().ZT());
  }
  
  public Zgy(String paramString1, Zqi paramZqi, String paramString2, String paramString3, Zgt paramZgt, Boolean paramBoolean) {
    this(paramString1, paramZqi, (paramString2 == null || paramString2.length() == 0 || a(-29659, -10939).equals(paramString2)) ? null : new Locale(paramString2), (paramString3 == null || paramString3.length() == 0 || a(-29658, 15772).equals(paramString3)) ? null : paramString3, null, paramZgt, paramBoolean);
  }
  
  public Zgy(String paramString1, Zqi paramZqi, Locale paramLocale, String paramString2, TimeZone paramTimeZone, Zgt paramZgt, Boolean paramBoolean) {
    this.ZE = (paramString1 == null) ? "" : paramString1;
    this.Zo = (paramZqi == null) ? Zqi.ANY : paramZqi;
    this.Z_ = paramLocale;
    this.Zk = paramTimeZone;
    this.ZP = paramString2;
    this.Zp = (paramZgt == null) ? Zgt.Zb() : paramZgt;
    this.Zn = paramBoolean;
  }
  
  public static final Zgy Zm() {
    return ZT;
  }
  
  public static Zgy ZC(Zgy paramZgy1, Zgy paramZgy2) {
    return (paramZgy1 == null) ? paramZgy2 : paramZgy1.Zx(paramZgy2);
  }
  
  public static final Zgy ZG(Zzv paramZzv) {
    return (paramZzv == null) ? ZT : new Zgy(paramZzv);
  }
  
  public final Zgy Zx(Zgy paramZgy) {
    // Byte code:
    //   0: invokestatic ZF : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 20
    //   8: aload_1
    //   9: getstatic com/fasterxml/Zgy.ZT : Lcom/fasterxml/Zgy;
    //   12: if_acmpeq -> 20
    //   15: aload_1
    //   16: aload_0
    //   17: if_acmpne -> 22
    //   20: aload_0
    //   21: areturn
    //   22: aload_0
    //   23: getstatic com/fasterxml/Zgy.ZT : Lcom/fasterxml/Zgy;
    //   26: if_acmpne -> 31
    //   29: aload_1
    //   30: areturn
    //   31: aload_1
    //   32: getfield ZE : Ljava/lang/String;
    //   35: astore_3
    //   36: aload_3
    //   37: ifnull -> 47
    //   40: aload_3
    //   41: invokevirtual isEmpty : ()Z
    //   44: ifeq -> 52
    //   47: aload_0
    //   48: getfield ZE : Ljava/lang/String;
    //   51: astore_3
    //   52: aload_1
    //   53: getfield Zo : Lcom/fasterxml/Zqi;
    //   56: astore #4
    //   58: aload #4
    //   60: getstatic com/fasterxml/Zqi.ANY : Lcom/fasterxml/Zqi;
    //   63: if_acmpne -> 72
    //   66: aload_0
    //   67: getfield Zo : Lcom/fasterxml/Zqi;
    //   70: astore #4
    //   72: aload_1
    //   73: getfield Z_ : Ljava/util/Locale;
    //   76: astore #5
    //   78: aload #5
    //   80: ifnonnull -> 89
    //   83: aload_0
    //   84: getfield Z_ : Ljava/util/Locale;
    //   87: astore #5
    //   89: aload_0
    //   90: getfield Zp : Lcom/fasterxml/Zgt;
    //   93: astore #6
    //   95: aload #6
    //   97: ifnonnull -> 110
    //   100: aload_1
    //   101: getfield Zp : Lcom/fasterxml/Zgt;
    //   104: astore #6
    //   106: aload_2
    //   107: ifnull -> 121
    //   110: aload #6
    //   112: aload_1
    //   113: getfield Zp : Lcom/fasterxml/Zgt;
    //   116: invokevirtual Zj : (Lcom/fasterxml/Zgt;)Lcom/fasterxml/Zgt;
    //   119: astore #6
    //   121: aload_1
    //   122: getfield Zn : Ljava/lang/Boolean;
    //   125: astore #7
    //   127: aload #7
    //   129: ifnonnull -> 138
    //   132: aload_0
    //   133: getfield Zn : Ljava/lang/Boolean;
    //   136: astore #7
    //   138: aload_1
    //   139: getfield ZP : Ljava/lang/String;
    //   142: astore #8
    //   144: aload #8
    //   146: ifnull -> 157
    //   149: aload #8
    //   151: invokevirtual isEmpty : ()Z
    //   154: ifeq -> 173
    //   157: aload_0
    //   158: getfield ZP : Ljava/lang/String;
    //   161: astore #8
    //   163: aload_0
    //   164: getfield Zk : Ljava/util/TimeZone;
    //   167: astore #9
    //   169: aload_2
    //   170: ifnull -> 179
    //   173: aload_1
    //   174: getfield Zk : Ljava/util/TimeZone;
    //   177: astore #9
    //   179: new com/fasterxml/Zgy
    //   182: dup
    //   183: aload_3
    //   184: aload #4
    //   186: aload #5
    //   188: aload #8
    //   190: aload #9
    //   192: aload #6
    //   194: aload #7
    //   196: invokespecial <init> : (Ljava/lang/String;Lcom/fasterxml/Zqi;Ljava/util/Locale;Ljava/lang/String;Ljava/util/TimeZone;Lcom/fasterxml/Zgt;Ljava/lang/Boolean;)V
    //   199: areturn
  }
  
  public static Zgy Zl(boolean paramBoolean) {
    return new Zgy("", null, null, null, null, Zgt.Zb(), Boolean.valueOf(paramBoolean));
  }
  
  public Zgy Zp(Boolean paramBoolean) {
    return (paramBoolean == this.Zn) ? this : new Zgy(this.ZE, this.Zo, this.Z_, this.ZP, this.Zk, this.Zp, paramBoolean);
  }
  
  public String Zu() {
    return this.ZE;
  }
  
  public Zqi ZI() {
    return this.Zo;
  }
  
  public Locale Zk() {
    return this.Z_;
  }
  
  public Boolean Zy() {
    return this.Zn;
  }
  
  public TimeZone ZB() {
    TimeZone timeZone = this.Zk;
    if (timeZone == null) {
      if (this.ZP == null)
        return null; 
      timeZone = TimeZone.getTimeZone(this.ZP);
      this.Zk = timeZone;
    } 
    return timeZone;
  }
  
  public boolean Zw() {
    return (this.Zo != Zqi.ANY);
  }
  
  public boolean ZR() {
    return (this.ZE != null && this.ZE.length() > 0);
  }
  
  public boolean ZA() {
    return (this.Z_ != null);
  }
  
  public boolean ZT() {
    return (this.Zk != null || (this.ZP != null && !this.ZP.isEmpty()));
  }
  
  public boolean ZQ() {
    return (this.Zn != null);
  }
  
  public Boolean Zq(Zye paramZye) {
    return this.Zp.ZP(paramZye);
  }
  
  public String toString() {
    return String.format(a(-29657, 32121), new Object[] { this.ZE, this.Zo, this.Zn, this.Z_, this.ZP, this.Zp });
  }
  
  public int hashCode() {
    int i = (this.ZP == null) ? 1 : this.ZP.hashCode();
    if (this.ZE != null)
      i ^= this.ZE.hashCode(); 
    i += this.Zo.hashCode();
    if (this.Zn != null)
      i ^= this.Zn.hashCode(); 
    if (this.Z_ != null)
      i += this.Z_.hashCode(); 
    i ^= this.Zp.hashCode();
    return i;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() != getClass())
      return false; 
    Zgy zgy = (Zgy)paramObject;
    return (this.Zo != zgy.Zo || !this.Zp.equals(zgy.Zp)) ? false : ((Zb(this.Zn, zgy.Zn) && Zb(this.ZP, zgy.ZP) && Zb(this.ZE, zgy.ZE) && Zb(this.Zk, zgy.Zk) && Zb(this.Z_, zgy.Z_)));
  }
  
  private static <T> boolean Zb(T paramT1, T paramT2) {
    return (paramT1 == null) ? ((paramT2 == null)) : ((paramT2 == null) ? false : paramT1.equals(paramT2));
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '&e;Ú_-¢¥æäìÙû²êSíæ|Y»/\\r¶¹æû3o²5ADáû&\\f°1üv\\nÎA¿üÆxJÊ"ÂK ?`|Ü¾²î5ï­ìL6e\\t/°U1Ø4qù\\t-£SÐxpp¬'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #82
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: invokestatic Zx : ([Ljava/lang/String;)V
    //   26: bipush #110
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: aload #5
    //   73: putstatic com/fasterxml/Zgy.b : [Ljava/lang/String;
    //   76: iconst_3
    //   77: anewarray java/lang/String
    //   80: putstatic com/fasterxml/Zgy.c : [Ljava/lang/String;
    //   83: goto -> 231
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 204
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #82
    //   158: goto -> 188
    //   161: bipush #44
    //   163: goto -> 188
    //   166: bipush #122
    //   168: goto -> 188
    //   171: bipush #35
    //   173: goto -> 188
    //   176: bipush #16
    //   178: goto -> 188
    //   181: bipush #125
    //   183: goto -> 188
    //   186: bipush #20
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 109
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 105
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 43
    //   231: new com/fasterxml/Zgy
    //   234: dup
    //   235: invokespecial <init> : ()V
    //   238: putstatic com/fasterxml/Zgy.ZT : Lcom/fasterxml/Zgy;
    //   241: return
  }
  
  public static void Zx(String[] paramArrayOfString) {
    ZM = paramArrayOfString;
  }
  
  public static String[] ZF() {
    return ZM;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8C27) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 88;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */