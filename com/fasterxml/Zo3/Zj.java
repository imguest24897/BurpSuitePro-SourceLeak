package com.fasterxml.Zo3;

import com.fasterxml.Zg_;
import com.fasterxml.Zgn;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Zio;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zp.Zc;
import com.fasterxml.Zp.Zd;
import com.fasterxml.Zp.Zk;
import com.fasterxml.Zp.Zp;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zp.Zz;
import com.fasterxml.Zw.Zt;
import com.fasterxml.Zyc;
import java.util.Collection;
import java.util.Objects;

public class Zj implements Zk<Zj> {
  protected Zg_ Z_;
  
  protected Zyc ZQ;
  
  protected String Zx;
  
  protected boolean Zc = false;
  
  protected Boolean ZU;
  
  protected Class<?> Za;
  
  protected Zz ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zj() {}
  
  protected Zj(Zj paramZj, Class<?> paramClass) {
    this.Z_ = paramZj.Z_;
    this.ZQ = paramZj.ZQ;
    this.Zx = paramZj.Zx;
    this.Zc = paramZj.Zc;
    this.ZH = paramZj.ZH;
    this.Za = paramClass;
    this.ZU = paramZj.ZU;
  }
  
  public Zj(Zgn paramZgn) {
    if (paramZgn != null)
      Zt(paramZgn); 
  }
  
  public static Zj Zt() {
    Zgn zgn = Zgn.ZF(Zg_.NONE, null, null, null, false, null);
    return (new Zj()).Zt(zgn);
  }
  
  public Za ZY(Zy7 paramZy7, Zk paramZk, Collection<Zd> paramCollection) {
    try {
      if (this.Z_ == Zg_.NONE)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramZk.Zm())
        try {
          if (!ZT((Zf<?>)paramZy7, paramZk))
            return null; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Z_ == Zg_.DEDUCTION)
        return Zx.Zi(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zz zz = Zk((Zf<?>)paramZy7, paramZk, Zi((Zf<?>)paramZy7), paramCollection, true, false);
    try {
      switch (Ze.ZN[this.ZQ.ordinal()]) {
        case 1:
          return new Zs(zz, null);
        case 2:
          return new Zr(zz, null, this.Zx);
        case 3:
          return new Zw(zz, null);
        case 4:
          return new Zl(zz, null, this.Zx);
        case 5:
          return new Zh(zz, null, this.Zx);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(a(13114, 18351) + this.ZQ);
  }
  
  public Zt Zn(Zyc paramZyc, Zk paramZk, Collection<Zd> paramCollection) {
    try {
      if (this.Z_ == Zg_.NONE)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramZk.Zm())
        try {
          if (!ZT((Zf<?>)paramZyc, paramZk))
            return null; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zp zp = Zg((Zf<?>)paramZyc, paramZk);
    Zz zz = Zk((Zf<?>)paramZyc, paramZk, zp, paramCollection, false, true);
    Zk zk = Zu(paramZyc, paramZk);
    try {
      if (this.Z_ == Zg_.DEDUCTION)
        return new Zc(paramZk, zz, zk, paramZyc, paramCollection); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      switch (Ze.ZN[this.ZQ.ordinal()]) {
        case 1:
          return new Zt(paramZk, zz, this.Zx, this.Zc, zk);
        case 2:
        case 5:
          return new Zi(paramZk, zz, this.Zx, this.Zc, zk, this.ZQ, Ze(paramZyc, paramZk));
        case 3:
          return new Za(paramZk, zz, this.Zx, this.Zc, zk);
        case 4:
          return new Zb(paramZk, zz, this.Zx, this.Zc, zk);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(a(13119, -8861) + this.ZQ);
  }
  
  protected Zk Zu(Zyc paramZyc, Zk paramZk) {
    try {
      if (this.Za != null) {
        try {
          if (this.Za != Void.class) {
            try {
              if (this.Za == Zt.class)
                return paramZyc.Zg().ZY(this.Za); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
          } else {
            return paramZyc.Zg().ZY(this.Za);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
          if (paramZk.ZP(this.Za))
            return paramZk; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
          if (paramZk.Zq(this.Za))
            return paramZyc.Zg().ZU(paramZk, this.Za); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
          if (paramZk.ZP(this.Za))
            return paramZk; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramZyc.ZB(Zy9.USE_BASE_TYPE_AS_DEFAULT_IMPL))
        try {
          if (!paramZk.ZV())
            return paramZk; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zj ZI(Zg_ paramZg_, Zz paramZz) {
    try {
      if (paramZg_ == null)
        throw new IllegalArgumentException(a(13112, -10243)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Z_ = paramZg_;
    this.ZH = paramZz;
    this.Zx = Zd(null, paramZg_);
    return this;
  }
  
  public Zj Za(Zgn paramZgn, Zz paramZz) {
    try {
      this.ZH = paramZz;
      if (paramZgn != null)
        Zt(paramZgn); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this;
  }
  
  public Zj Zv(Class<?> paramClass) {
    this.Za = paramClass;
    return this;
  }
  
  public Zj Zd(Class<?> paramClass) {
    try {
      if (this.Za == paramClass)
        return this; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zx.ZW(Zj.class, this, a(13115, 26564));
    return new Zj(this, paramClass);
  }
  
  public Zj Zt(Zgn paramZgn) {
    this.Z_ = Objects.<Zg_>requireNonNull(paramZgn.Zj());
    this.ZQ = paramZgn.Zi();
    this.Zx = Zd(paramZgn.ZH(), this.Z_);
    this.Za = paramZgn.Zl();
    this.Zc = paramZgn.ZX();
    this.ZU = paramZgn.ZG();
    return this;
  }
  
  protected String Zd(String paramString, Zg_ paramZg_) {
    try {
      if (paramString == null || paramString.isEmpty())
        paramString = paramZg_.ZY(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return paramString;
  }
  
  public Class<?> ZP() {
    return this.Za;
  }
  
  protected Zz Zk(Zf<?> paramZf, Zk paramZk, Zp paramZp, Collection<Zd> paramCollection, boolean paramBoolean1, boolean paramBoolean2) {
    try {
      if (this.ZH != null)
        return this.ZH; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Z_ == null)
        throw new IllegalStateException(a(13116, -30246)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      switch (Ze.ZY[this.Z_.ordinal()]) {
        case 1:
        case 2:
          return Zp.ZQ(paramZk, paramZf, paramZp);
        case 3:
          return Z_.ZS(paramZk, paramZf, paramZp);
        case 4:
          return Zf.ZT(paramZf, paramZk, paramCollection, paramBoolean1, paramBoolean2);
        case 5:
          return Zg.Zz(paramZf, paramZk, paramCollection, paramBoolean1, paramBoolean2);
        case 6:
          return null;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(a(13118, -2377) + this.Z_);
  }
  
  public Zp Zi(Zf<?> paramZf) {
    return paramZf.ZD();
  }
  
  protected Zp Zg(Zf<?> paramZf, Zk paramZk) {
    Zp zp = Zi(paramZf);
    try {
      if (this.Z_ == Zg_.CLASS || this.Z_ == Zg_.MINIMAL_CLASS) {
        Zc zc = zp.ZI(paramZf, paramZk);
        try {
          if (zc == Zc.DENIED)
            return Z_(paramZf, paramZk, zp); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
          if (zc == Zc.ALLOWED)
            return (Zp)Zz.ZJ; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return zp;
  }
  
  protected Zp Z_(Zf<?> paramZf, Zk paramZk, Zp paramZp) {
    throw new IllegalArgumentException(String.format(a(13117, 14601), new Object[] { Zx.ZZ(paramZp), Zx.ZZ(paramZk.Zf()) }));
  }
  
  protected boolean ZT(Zf<?> paramZf, Zk paramZk) {
    return false;
  }
  
  protected boolean Ze(Zyc paramZyc, Zk paramZk) {
    try {
      if (this.ZU != null)
        try {
          if (paramZk.Zp())
            return this.ZU.booleanValue(); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramZyc.ZB(Zy9.REQUIRE_TYPE_ID_FOR_SUBTYPES))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Zp(paramZyc, paramZk);
  }
  
  protected boolean Zp(Zyc paramZyc, Zk paramZk) {
    Zia zia = Zio.ZX((Zf)paramZyc, paramZk.Zf());
    Zt zt = paramZyc.ZK();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (zt.ZU((Zf)paramZyc, (Ziv)zia) != null);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ':À`Mæ2D\\tx ¼de[¯ ¼à+ëXÃ0H¡¾äGL««!ÏÑHÓÖªEQò8Å*¡65ÊüJÃËÿÙD`ú°Ø®ÒZH\\tâ&SÿZXÊÉN°§4ÒQp\\tÔÓ´ûÜtA|+]Ý½¦ÐætIè¸bÌi¶%Ên62¹¬¥Þ  a¨GÓõH¾?àÆZ³ i²d^{åÇEÑ@;vÜÐ~û(\\n~´êÿÊ° &jFµ¿¾4R$«û;Å¤»Â;ÖM)X(w×uJwPäÔi:)ULpÒkvjU\\bIi ÃûjjÄ\!2äJ5?!G\ai|/t»o\\tk&Úç@õïnHý®>_WØËÝ[À?¸Í4*s%@%B¯Q2xTíQ%½6&¹Ñ·ÙÇ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #67
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #16
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'qT®ûan{½\\bt¥ÔH6ç°ü/<a:NàPú'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #15
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #15
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
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
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic com/fasterxml/Zo3/Zj.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zo3/Zj.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #19
    //   214: goto -> 244
    //   217: bipush #74
    //   219: goto -> 244
    //   222: bipush #27
    //   224: goto -> 244
    //   227: bipush #23
    //   229: goto -> 244
    //   232: bipush #66
    //   234: goto -> 244
    //   237: bipush #88
    //   239: goto -> 244
    //   242: bipush #18
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x333E) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
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
      char c = 'Ú';
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */