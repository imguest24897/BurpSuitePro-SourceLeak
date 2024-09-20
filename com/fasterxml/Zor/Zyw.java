package com.fasterxml.Zor;

import com.fasterxml.Zgy;
import com.fasterxml.Zh.Zi;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zj.Zp;
import com.fasterxml.Zj.Zqn;
import com.fasterxml.Zj.Zz;
import com.fasterxml.Zm.Ze8;
import com.fasterxml.Zm.Zv;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Zv;
import com.fasterxml.Zp.Zc;
import com.fasterxml.Zp.Zp;
import com.fasterxml.Zq_;
import com.fasterxml.Zys;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

public abstract class Zyw {
  private static String[] Zt;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public abstract Zf<?> Zd();
  
  public abstract Zt Zv();
  
  public abstract boolean Zm(Zy9 paramZy9);
  
  public abstract boolean Zj(Zz paramZz);
  
  public abstract Zp Zw();
  
  public abstract boolean ZP();
  
  public abstract Class<?> Zx();
  
  public abstract Locale Zn();
  
  public abstract TimeZone Z_();
  
  public abstract Zgy Zp(Class<?> paramClass);
  
  public abstract Object Zj(Object paramObject);
  
  public Zk Zo(Type paramType) {
    try {
      if (paramType == null)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw c(null);
    } 
    return ZL().ZY(paramType);
  }
  
  public abstract Zk ZX(Zk paramZk, Class<?> paramClass);
  
  public Zk Zc(Zk paramZk, String paramString, Zp paramZp) throws Zy_ {
    Class<?> clazz;
    int i = paramString.indexOf('<');
    try {
      if (i > 0)
        return Zi(paramZk, paramString, paramZp, i); 
    } catch (ClassNotFoundException classNotFoundException) {
      throw c(null);
    } 
    Zf<?> zf = Zd();
    Zc zc = paramZp.ZR(zf, paramZk, paramString);
    try {
      if (zc == Zc.DENIED)
        return Zn(paramZk, paramString, paramZp); 
    } catch (ClassNotFoundException classNotFoundException) {
      throw c(null);
    } 
    try {
      clazz = ZL().Zr(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      return null;
    } catch (Exception exception) {
      throw ZU(paramZk, paramString, String.format(a(31675, 26702), new Object[] { exception.getClass().getName(), Zx.Zr(exception) }));
    } 
    try {
      if (!paramZk.Zq(clazz))
        return Zg(paramZk, paramString); 
    } catch (ClassNotFoundException classNotFoundException) {
      throw c(null);
    } 
    Zk zk = zf.Zg().ZU(paramZk, clazz);
    if (zc == Zc.INDETERMINATE) {
      zc = paramZp.ZN(zf, paramZk, zk);
      try {
        if (zc != Zc.ALLOWED)
          return ZY(paramZk, paramString, paramZp); 
      } catch (ClassNotFoundException classNotFoundException) {
        throw c(null);
      } 
    } 
    return zk;
  }
  
  private Zk Zi(Zk paramZk, String paramString, Zp paramZp, int paramInt) throws Zy_ {
    Zf<?> zf = Zd();
    Zc zc = paramZp.ZR(zf, paramZk, paramString.substring(0, paramInt));
    try {
      if (zc == Zc.DENIED)
        return Zn(paramZk, paramString, paramZp); 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    Zk zk = ZL().Ze(paramString);
    try {
      if (!zk.Zf(paramZk.Zf()))
        return Zg(paramZk, paramString); 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    try {
      if (zc != Zc.ALLOWED)
        try {
          if (paramZp.ZN(zf, paramZk, zk) != Zc.ALLOWED)
            return ZY(paramZk, paramString, paramZp); 
        } catch (Zy_ zy_) {
          throw c(null);
        }  
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    return zk;
  }
  
  protected <T> T Zg(Zk paramZk, String paramString) throws Zy_ {
    throw ZU(paramZk, paramString, a(31674, -29975));
  }
  
  protected <T> T Zn(Zk paramZk, String paramString, Zp paramZp) throws Zy_ {
    throw ZU(paramZk, paramString, a(31669, -16002) + Zx.ZZ(paramZp) + a(31678, 21319));
  }
  
  protected <T> T ZY(Zk paramZk, String paramString, Zp paramZp) throws Zy_ {
    throw ZU(paramZk, paramString, a(31677, 24380) + Zx.ZZ(paramZp) + a(31676, 8213));
  }
  
  protected abstract Zy_ ZU(Zk paramZk, String paramString1, String paramString2);
  
  public abstract Zi ZL();
  
  public Zys<?> Zm(Ziv paramZiv, Zv paramZv) throws Zy_ {
    Class clazz = paramZv.ZM();
    Zf<?> zf = Zd();
    Zqn zqn = zf.Zf();
    try {
    
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    Zys zys = (zqn == null) ? null : zqn.Zf(zf, paramZiv, clazz);
    if (zys == null)
      zys = (Zys)Zx.ZR(clazz, zf.Zd()); 
    return zys.ZA(paramZv.Zs());
  }
  
  public Zq_ ZN(Ziv paramZiv, Zv paramZv) {
    Class clazz = paramZv.Zw();
    Zf<?> zf = Zd();
    Zqn zqn = zf.Zf();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw c(null);
    } 
    Zq_ zq_ = (zqn == null) ? null : zqn.ZU(zf, paramZiv, clazz);
    if (zq_ == null)
      zq_ = (Zq_)Zx.ZR(clazz, zf.Zd()); 
    return zq_;
  }
  
  public Zv<Object, Object> ZS(Ziv paramZiv, Object paramObject) throws Zy_ {
    try {
      if (paramObject == null)
        return null; 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    try {
      if (paramObject instanceof Zv)
        return (Zv<Object, Object>)paramObject; 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    try {
      if (!(paramObject instanceof Class))
        throw new IllegalStateException(a(31667, -27744) + paramObject.getClass().getName() + a(31672, -13122)); 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    Class<Ze8> clazz = (Class)paramObject;
    try {
      if (clazz != Ze8.class)
        try {
          if (!Zx.Zu(clazz)) {
            try {
              if (!Zv.class.isAssignableFrom(clazz))
                throw new IllegalStateException(a(31673, 22099) + clazz.getName() + a(31668, -25162)); 
            } catch (Zy_ zy_) {
              throw c(null);
            } 
            Zf<?> zf = Zd();
            Zqn zqn = zf.Zf();
            try {
            
            } catch (Zy_ zy_) {
              throw c(null);
            } 
            Zv<Object, Object> zv = (zqn == null) ? null : zqn.ZZ(zf, paramZiv, clazz);
            if (zv == null)
              zv = (Zv)Zx.ZR(clazz, zf.Zd()); 
            return zv;
          } 
          return null;
        } catch (Zy_ zy_) {
          throw c(null);
        }  
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    return null;
  }
  
  public abstract <T> T Zm(Zk paramZk, String paramString) throws Zy_;
  
  public <T> T ZA(Class<?> paramClass, String paramString) throws Zy_ {
    return Zm(Zo(paramClass), paramString);
  }
  
  protected final String ZF(String paramString, Object... paramVarArgs) {
    try {
      if (paramVarArgs.length > 0)
        return String.format(paramString, paramVarArgs); 
    } catch (IllegalStateException illegalStateException) {
      throw c(null);
    } 
    return paramString;
  }
  
  protected final String ZX(String paramString) {
    try {
      if (paramString == null)
        return ""; 
    } catch (IllegalStateException illegalStateException) {
      throw c(null);
    } 
    try {
      if (paramString.length() <= 500)
        return paramString; 
    } catch (IllegalStateException illegalStateException) {
      throw c(null);
    } 
    return paramString.substring(0, 500) + a(31670, -25868) + paramString.substring(paramString.length() - 500);
  }
  
  protected String Zu(String paramString) {
    try {
      if (paramString == null)
        return a(31666, 7070); 
    } catch (IllegalStateException illegalStateException) {
      throw c(null);
    } 
    return String.format(a(31679, 2195), new Object[] { ZX(paramString) });
  }
  
  protected String ZQ(String paramString1, String paramString2) {
    try {
      if (paramString2 == null)
        return paramString1; 
    } catch (IllegalStateException illegalStateException) {
      throw c(null);
    } 
    return paramString1 + a(31671, 27080) + paramString2;
  }
  
  public static void Zx(String[] paramArrayOfString) {
    Zt = paramArrayOfString;
  }
  
  public static String[] Ze() {
    return Zt;
  }
  
  private static Exception c(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'X#Úì£Ue®vî#¢©¦Úðæ(Ü&FìójÁIâ¼ÜQãØ?/µ¦³J²ÜiS~r\È§ó²Ñê4ÖmzÆiA0Lù¢ûxÆ >ÕÔurdÜ\\r¦2gyqÝ?µ ôAêHªY¥¬¹5ÎHÿ¾µÄ:p¡°c¥¦;x7%ü¢\\r\TÍå¹ÿAL@ì¿ûimK²5&Â¼!:Çæ¶¡x}«\\rÇ£ë-©7³bÂËËÜiß(¬¿xo°SQø»UvàÝ<Ì<Ãñ«_Q17Ü¼ß´}9/¡ªÀýÐìÆíÕº¬ÖÏp£(Uÿ\\ngñÁü]&¤ªVFf'|.Æ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: aconst_null
    //   19: bipush #19
    //   21: istore_1
    //   22: invokestatic Zx : ([Ljava/lang/String;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #73
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'Tíà=ÿ.Ç2£× \\fÏÉàÚ"î&IÉ¿ª:¯)á;Ì6J»uÅÙ­:¤éúqî-Ädï¸@K'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_5
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #60
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic com/fasterxml/Zor/Zyw.b : [Ljava/lang/String;
    //   135: bipush #14
    //   137: anewarray java/lang/String
    //   140: putstatic com/fasterxml/Zor/Zyw.c : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 263
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 240
    //   216: bipush #26
    //   218: goto -> 247
    //   221: bipush #72
    //   223: goto -> 247
    //   226: bipush #99
    //   228: goto -> 247
    //   231: bipush #19
    //   233: goto -> 247
    //   236: iconst_2
    //   237: goto -> 247
    //   240: bipush #90
    //   242: goto -> 247
    //   245: bipush #46
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 169
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 165
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7BBE) & 0xFFFF;
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
      byte b1 = 18;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zyw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */