package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zeg7 implements Zvt {
  private final Map<String, Zlwx> ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zeg7(Map<String, Zlwx> paramMap) {
    this.ZW = paramMap;
  }
  
  public boolean Z_(String paramString) throws Zzam {
    Zlwx zlwx = this.ZW.get(paramString);
    try {
      if (zlwx != null)
        try {
          if (zlwx.ZW())
            return zlwx.ZH(); 
          throw new Zzam(a(27560, -18211) + a(27560, -18211));
        } catch (Zzam zzam) {
          throw a(null);
        }  
    } catch (Zzam zzam) {
      throw a(null);
    } 
    throw new Zzam(a(27560, -18211) + a(27560, -18211));
  }
  
  public boolean Zc(String paramString, boolean paramBoolean) {
    Zlwx zlwx = this.ZW.get(paramString);
    return (zlwx == null || !zlwx.ZW()) ? paramBoolean : zlwx.ZH();
  }
  
  public String ZC(String paramString) throws Zzam {
    Zlwx zlwx = this.ZW.get(paramString);
    try {
      if (zlwx != null)
        try {
          if (zlwx.Zi())
            return zlwx.ZG(); 
          throw new Zzam(a(27567, -32517) + a(27567, -32517));
        } catch (Zzam zzam) {
          throw a(null);
        }  
    } catch (Zzam zzam) {
      throw a(null);
    } 
    throw new Zzam(a(27567, -32517) + a(27567, -32517));
  }
  
  public String Zf(String paramString1, String paramString2) {
    Zlwx zlwx = this.ZW.get(paramString1);
    return (zlwx == null || !zlwx.Zi()) ? paramString2 : zlwx.ZG();
  }
  
  public int Zk(String paramString) throws Zzam {
    Zlwx zlwx = this.ZW.get(paramString);
    try {
      if (zlwx != null)
        try {
          if (zlwx.ZR())
            return zlwx.Ze(); 
          throw new Zzam(a(27562, -10615) + a(27562, -10615));
        } catch (Zzam zzam) {
          throw a(null);
        }  
    } catch (Zzam zzam) {
      throw a(null);
    } 
    throw new Zzam(a(27562, -10615) + a(27562, -10615));
  }
  
  public int Za(String paramString, int paramInt) {
    Zlwx zlwx = this.ZW.get(paramString);
    return (zlwx == null || !zlwx.ZR()) ? paramInt : zlwx.Ze();
  }
  
  public long ZU(String paramString) throws Zzam {
    Zlwx zlwx = this.ZW.get(paramString);
    try {
      if (zlwx != null)
        try {
          if (zlwx.ZR())
            return zlwx.ZD(); 
          throw new Zzam(a(27565, 16230) + a(27565, 16230));
        } catch (Zzam zzam) {
          throw a(null);
        }  
    } catch (Zzam zzam) {
      throw a(null);
    } 
    throw new Zzam(a(27565, 16230) + a(27565, 16230));
  }
  
  public long ZR(String paramString, long paramLong) {
    Zlwx zlwx = this.ZW.get(paramString);
    return (zlwx == null || !zlwx.ZR()) ? paramLong : zlwx.ZD();
  }
  
  public List<Zlwx> ZE(String paramString) {
    Zlwx zlwx = this.ZW.get(paramString);
    return (zlwx == null || !zlwx.ZN()) ? Collections.emptyList() : zlwx.ZO();
  }
  
  public Zlwx Zi(String paramString) {
    return this.ZW.containsKey(paramString) ? this.ZW.get(paramString) : Zzq4.Zn;
  }
  
  public Zvt ZX(String paramString) {
    Zlwx zlwx = this.ZW.get(paramString);
    return (zlwx == null || !zlwx.Zq()) ? Zz4l.ZI : zlwx.Zf();
  }
  
  public byte[] Zp(String paramString) throws Zzam {
    Zlwx zlwx = this.ZW.get(paramString);
    try {
      if (zlwx != null)
        try {
          if (zlwx.ZF())
            return zlwx.Za(); 
          throw new Zzam(a(27561, -3875) + a(27561, -3875));
        } catch (Zzam zzam) {
          throw a(null);
        }  
    } catch (Zzam zzam) {
      throw a(null);
    } 
    throw new Zzam(a(27561, -3875) + a(27561, -3875));
  }
  
  public byte[] Zz(String paramString, byte[] paramArrayOfbyte) {
    Zlwx zlwx = this.ZW.get(paramString);
    return (zlwx == null || !zlwx.ZF()) ? paramArrayOfbyte : zlwx.Za();
  }
  
  public <T> List<T> Zg(String paramString, Zsh4<T> paramZsh4) {
    String[] arrayOfString = Zzkm.Zq();
    Zlwx zlwx = Zi(paramString);
    if (zlwx.ZN()) {
      ArrayList<T> arrayList = new ArrayList();
      List<Zlwx> list = zlwx.ZO();
      for (Zlwx zlwx1 : list) {
        if (zlwx1.Zq())
          try {
            Zvt zvt = zlwx1.Zf();
            try {
              if (zvt != null)
                arrayList.add(paramZsh4.Zu(zvt)); 
            } catch (Exception exception) {
              throw a(null);
            } 
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.USER_ERROR);
          }  
        if (arrayOfString != null)
          break; 
      } 
      return arrayList;
    } 
    return null;
  }
  
  public List<String> ZG(String paramString) {
    String[] arrayOfString = Zzkm.Zq();
    Zlwx zlwx = Zi(paramString);
    if (zlwx.ZN()) {
      ArrayList<String> arrayList = new ArrayList();
      List<Zlwx> list = zlwx.ZO();
      for (Zlwx zlwx1 : list) {
        if (zlwx1.Zi())
          arrayList.add(zlwx1.ZG()); 
        if (arrayOfString != null)
          break; 
      } 
      return arrayList;
    } 
    return null;
  }
  
  public Iterator<Map.Entry<String, Zlwx>> iterator() {
    return this.ZW.entrySet().iterator();
  }
  
  public int ZI(String paramString, String[] paramArrayOfString, int paramInt) {
    int i = ZI(paramString, Arrays.asList(paramArrayOfString));
    return (i == -1) ? paramInt : i;
  }
  
  public int ZT(String paramString, String[] paramArrayOfString) throws Zzam {
    List<String> list = Arrays.asList(paramArrayOfString);
    int i = ZI(paramString, list);
    try {
      if (i == -1)
        throw new Zzam(a(27566, 15175) + a(27566, 15175) + Zsw8.ZE(list)); 
    } catch (Zzam zzam) {
      throw a(null);
    } 
    return i;
  }
  
  public int ZE(String paramString, List<String> paramList) throws Zzam {
    int i = ZI(paramString, paramList);
    try {
      if (i == -1)
        throw new Zzam(a(27566, 15175) + a(27566, 15175) + Zsw8.ZE(paramList)); 
    } catch (Zzam zzam) {
      throw a(null);
    } 
    return i;
  }
  
  public int Zu(String paramString, Map<Integer, String> paramMap) throws Zzam {
    int i = Zw(paramString, paramMap);
    try {
      if (i == -1)
        throw new Zzam(a(27566, 15175) + a(27566, 15175) + Zsw8.ZE(paramMap.values())); 
    } catch (Zzam zzam) {
      throw a(null);
    } 
    return i;
  }
  
  private int ZI(String paramString, List<String> paramList) {
    Zlwx zlwx = this.ZW.get(paramString);
    return (zlwx == null || !zlwx.Zi()) ? -1 : Zh(zlwx.ZG(), paramList);
  }
  
  public int Zh(String paramString, List<String> paramList) {
    String str = paramString.toLowerCase();
    byte b = 0;
    String[] arrayOfString = Zzkm.Zq();
    while (b < paramList.size()) {
      if (((String)paramList.get(b)).toLowerCase().equals(str))
        return b; 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return -1;
  }
  
  private int Zw(String paramString, Map<Integer, String> paramMap) {
    String[] arrayOfString = Zzkm.Zq();
    Zlwx zlwx = this.ZW.get(paramString);
    if (zlwx == null || !zlwx.Zi())
      return -1; 
    String str = ((Zlwx)this.ZW.get(paramString)).ZG().toLowerCase();
    for (Map.Entry<Integer, String> entry : paramMap.entrySet()) {
      if (((String)entry.getValue()).toLowerCase().equals(str))
        return ((Integer)entry.getKey()).intValue(); 
      if (arrayOfString != null)
        break; 
    } 
    return -1;
  }
  
  public boolean ZW(String paramString1, String paramString2, String paramString3, boolean paramBoolean) throws Zzam {
    Zlwx zlwx = this.ZW.get(paramString1);
    try {
      if (zlwx != null)
        try {
          if (zlwx.Zi()) {
            try {
              if (!paramString2.equalsIgnoreCase(zlwx.ZG()))
                try {
                  if (!paramString3.equalsIgnoreCase(zlwx.ZG())) {
                    a(27564, -27467);
                    throw new Zzam(a(27564, -27467) + a(27564, -27467) + paramString2 + a(27563, -32767) + paramString3);
                  } 
                } catch (Zzam zzam) {
                  throw a(null);
                }  
            } catch (Zzam zzam) {
              throw a(null);
            } 
            return paramString2.equalsIgnoreCase(zlwx.ZG());
          } 
          return paramBoolean;
        } catch (Zzam zzam) {
          throw a(null);
        }  
    } catch (Zzam zzam) {
      throw a(null);
    } 
    return paramBoolean;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Gí(±S\\b¤1!Ø¨êK÷UÞ.AIÁ¸2_.ÁqKQeÔ)ÚiñBK =HÜ`ND³Âv=$Õ!ïNG6l^ñ³m\\fO&6þ´5CàÜ»þ­wLrÜ±`0ïoµ¹þLIrÄJNýnÚ')A0wù¢Éè²Y'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #94
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '@©Ò-ÍªaäÀCÖ@XÜgëóê}*n6Qðù0éIõªañér<¨gñ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #29
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #100
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zeg7.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zeg7.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #71
    //   214: goto -> 244
    //   217: bipush #98
    //   219: goto -> 244
    //   222: bipush #84
    //   224: goto -> 244
    //   227: bipush #108
    //   229: goto -> 244
    //   232: bipush #103
    //   234: goto -> 244
    //   237: bipush #79
    //   239: goto -> 244
    //   242: bipush #97
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6BAB) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeg7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */