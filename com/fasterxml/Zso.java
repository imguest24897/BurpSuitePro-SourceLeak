package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zm.Ze;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zp;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Zy;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Objects;

@Zl
public class Zso extends Zzg<Enum<?>> implements Zi {
  private static final long serialVersionUID = 1L;
  
  protected final Ze Zz;
  
  protected final Boolean ZG;
  
  protected final Ze ZF;
  
  protected final Ze Zy;
  
  private static final String[] d;
  
  private static final String[] e;
  
  public Zso(Ze paramZe1, Boolean paramBoolean, Ze paramZe2, Ze paramZe3) {
    super(paramZe1.Zh(), false);
    this.Zz = paramZe1;
    this.ZG = paramBoolean;
    this.ZF = paramZe2;
    this.Zy = paramZe3;
  }
  
  public static Zso Ze(Class<?> paramClass, Zy7 paramZy7, Zyv paramZyv, Zgy paramZgy) {
    Ze ze1 = Ze.Zk((Zf)paramZy7, paramZyv.Zo());
    Ze ze2 = ZW(paramZy7, (Class)paramClass, paramZyv.Zo());
    Ze ze3 = Ze.ZB((Zf)paramZy7, paramZyv.Zo());
    Boolean bool = Zm(paramClass, paramZgy, true, (Boolean)null);
    return new Zso(ze1, bool, ze2, ze3);
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    if (zgy != null) {
      Class<Enum<?>> clazz = Zz();
      Boolean bool = Zm(clazz, zgy, false, this.ZG);
      try {
        if (!Objects.equals(bool, this.ZG))
          return new Zso(this.Zz, bool, this.ZF, this.Zy); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } 
    return this;
  }
  
  public final void ZK(Enum<?> paramEnum, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (this.ZF != null) {
        paramZf.Zr(this.ZF.Zy(paramEnum));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (ZJ(paramZyi)) {
        paramZf.Zd(paramEnum.ordinal());
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZyi.ZW(Zy0.WRITE_ENUMS_USING_TO_STRING)) {
        paramZf.Zr(this.Zy.Zy(paramEnum));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Zr(this.Zz.Zy(paramEnum));
  }
  
  protected final boolean ZJ(Zyi paramZyi) {
    try {
      if (this.ZG != null)
        return this.ZG.booleanValue(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramZyi.ZW(Zy0.WRITE_ENUMS_USING_INDEX);
  }
  
  protected static Boolean Zm(Class<?> paramClass, Zgy paramZgy, boolean paramBoolean, Boolean paramBoolean1) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zqi zqi = (paramZgy == null) ? null : paramZgy.ZI();
    try {
      if (zqi == null)
        return paramBoolean1; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (zqi != Zqi.ANY) {
        try {
          if (zqi == Zqi.SCALAR)
            return paramBoolean1; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return paramBoolean1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (zqi != Zqi.STRING) {
        try {
          if (zqi == Zqi.NATURAL)
            return Boolean.FALSE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return Boolean.FALSE;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!zqi.Zp())
        try {
          if (zqi != Zqi.ARRAY) {
            try {
              (new Object[3])[0] = zqi;
              (new Object[3])[1] = paramClass.getName();
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            throw new IllegalArgumentException(String.format(b(16958, -1182), new Object[] { null, null, paramBoolean ? b(16959, -29146) : b(16956, -5827) }));
          } 
          return Boolean.TRUE;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Boolean.TRUE;
  }
  
  protected static Ze ZW(Zy7 paramZy7, Class<Enum<?>> paramClass, Zia paramZia) {
    Object object = paramZy7.ZK().Zg((Zf)paramZy7, paramZia);
    Zp zp = Zy.ZM(object, paramZy7.Zd());
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zp == null) ? null : Ze.ZK((Zf)paramZy7, paramZia, zp);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '{!ÙN^\\bxc*±©æÞq(kRxj'"Ú~AgX×;LÂüV]l"vûÍµjä+\ÐPYÄîVö+L"ó®è!õÓQÖæt\\bv]¹Ô¢C£'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #80
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #30
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
    //   69: putstatic com/fasterxml/Zso.d : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zso.e : [Ljava/lang/String;
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
    //   152: bipush #98
    //   154: goto -> 184
    //   157: bipush #23
    //   159: goto -> 184
    //   162: bipush #83
    //   164: goto -> 184
    //   167: bipush #97
    //   169: goto -> 184
    //   172: bipush #39
    //   174: goto -> 184
    //   177: bipush #104
    //   179: goto -> 184
    //   182: bipush #93
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
    int i = (paramInt1 ^ 0x423E) & 0xFFFF;
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
      byte b1 = 121;
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
      e[i] = (new String(arrayOfChar)).intern();
    } 
    return e[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zso.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */