package burp;

import burp.api.montoya.persistence.Preferences;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbz2 implements Preferences {
  private final Zeu1 ZG;
  
  private final Zt8u Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbz2(Zeu1 paramZeu1, Zt8u paramZt8u) {
    this.ZG = paramZeu1;
    this.Zo = paramZt8u;
  }
  
  public Boolean getBoolean(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = ZP(a(-19651, -14947), paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (str != null) ? Boolean.valueOf(Boolean.parseBoolean(str)) : null;
  }
  
  public void setBoolean(String paramString, boolean paramBoolean) {
    String str = String.valueOf(paramBoolean);
    Zshb zshb = Zd();
    zshb.ZV(a(-19651, -14947) + a(-19651, -14947), str);
  }
  
  public void deleteBoolean(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zshb zshb = Zd();
    zshb.ZB(a(-19661, -9564) + a(-19661, -9564));
  }
  
  public Set<String> booleanKeys() {
    return ZJ(a(-19651, -14947));
  }
  
  public Byte getByte(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str = ZP(a(-19660, 23334), paramString);
    try {
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return (str != null) ? Byte.valueOf(Byte.parseByte(str)) : null;
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      throw new IllegalArgumentException(paramString + paramString, numberFormatException);
    } 
  }
  
  public void setByte(String paramString, byte paramByte) {
    String str = String.valueOf(paramByte);
    Zshb zshb = Zd();
    zshb.ZV(a(-19660, 23334) + a(-19660, 23334), str);
  }
  
  public void deleteByte(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zshb zshb = Zd();
    zshb.ZB(a(-19666, -28997) + a(-19666, -28997));
  }
  
  public Set<String> byteKeys() {
    return ZJ(a(-19660, 23334));
  }
  
  public Short getShort(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str = ZP(a(-19656, -7054), paramString);
    try {
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return (str != null) ? Short.valueOf(Short.parseShort(str)) : null;
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      throw new IllegalArgumentException(paramString + paramString, numberFormatException);
    } 
  }
  
  public void setShort(String paramString, short paramShort) {
    String str = String.valueOf(paramShort);
    Zshb zshb = Zd();
    zshb.ZV(a(-19663, -23811) + a(-19663, -23811), str);
  }
  
  public void deleteShort(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zshb zshb = Zd();
    zshb.ZB(a(-19656, -7054) + a(-19656, -7054));
  }
  
  public Set<String> shortKeys() {
    return ZJ(a(-19656, -7054));
  }
  
  public Integer getInteger(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str = ZP(a(-19652, 17223), paramString);
    try {
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return (str != null) ? Integer.valueOf(Integer.parseInt(str)) : null;
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      throw new IllegalArgumentException(paramString + paramString, numberFormatException);
    } 
  }
  
  public void setInteger(String paramString, int paramInt) {
    String str = String.valueOf(paramInt);
    Zshb zshb = Zd();
    zshb.ZV(a(-19652, 17223) + a(-19652, 17223), str);
  }
  
  public void deleteInteger(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zshb zshb = Zd();
    zshb.ZB(a(-19657, 7788) + a(-19657, 7788));
  }
  
  public Set<String> integerKeys() {
    return ZJ(a(-19652, 17223));
  }
  
  public Long getLong(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str = ZP(a(-19662, 10270), paramString);
    try {
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return (str != null) ? Long.valueOf(Long.parseLong(str)) : null;
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      throw new IllegalArgumentException(paramString + paramString, numberFormatException);
    } 
  }
  
  public void setLong(String paramString, long paramLong) {
    String str = String.valueOf(paramLong);
    Zshb zshb = Zd();
    zshb.ZV(a(-19649, 27215) + a(-19649, 27215), str);
  }
  
  public void deleteLong(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zshb zshb = Zd();
    zshb.ZB(a(-19649, 27215) + a(-19649, 27215));
  }
  
  public Set<String> longKeys() {
    return ZJ(a(-19649, 27215));
  }
  
  public String getString(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19658, 4436)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZP(a(-19659, 25843), paramString);
  }
  
  public void setString(String paramString1, String paramString2) {
    try {
      if (paramString1 == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zshb zshb = Zd();
    zshb.ZV(a(-19653, 28622) + a(-19653, 28622), paramString2);
  }
  
  public void deleteString(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-19654, 24551)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zshb zshb = Zd();
    zshb.ZB(a(-19653, 28622) + a(-19653, 28622));
  }
  
  public Set<String> stringKeys() {
    return ZJ(a(-19653, 28622));
  }
  
  private String ZP(String paramString1, String paramString2) {
    Zshb zshb = Zd();
    String str = zshb.Zn(paramString1 + paramString1);
    if (str == null)
      str = zshb.Zn(paramString2); 
    return str;
  }
  
  private Zshb Zd() {
    String str = Zxos.Zb(this.ZG);
    return this.Zo.Zz(str);
  }
  
  private Set<String> ZJ(String paramString) {
    return (Set<String>)Zd().Zg().stream().filter(paramString::lambda$listPreferenceKeys$0).map(paramString::lambda$listPreferenceKeys$1).collect(Collectors.toSet());
  }
  
  private static String lambda$listPreferenceKeys$1(String paramString1, String paramString2) {
    return paramString2.substring(paramString1.length());
  }
  
  private static boolean lambda$listPreferenceKeys$0(String paramString1, String paramString2) {
    return paramString2.startsWith(paramString1);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ']»XÐGÄ<\\f'mÊá üj=Ø[×ä¦'ë\\bp5ëéçèAÇ×Ò¼\\ttSýT6öd¸±6H%¸rÃË\\r"i·ö\\f{Uû\\nx5»MÔô°´JYî§»âvWùæü¯þ¿À©sAO®}ê#ÅH¨.ÞúÑ¼±ü\\bm52´7ARuïziïÐÂ~=O´Ò$cÆ'­'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #20
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #118
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '*To®ï)¬æUãª<!±È{ZN~óe\\bí'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #96
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
    //   128: putstatic burp/Zbz2.a : [Ljava/lang/String;
    //   131: bipush #18
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbz2.b : [Ljava/lang/String;
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
    //   212: bipush #75
    //   214: goto -> 244
    //   217: bipush #123
    //   219: goto -> 244
    //   222: bipush #117
    //   224: goto -> 244
    //   227: bipush #20
    //   229: goto -> 244
    //   232: bipush #101
    //   234: goto -> 244
    //   237: bipush #44
    //   239: goto -> 244
    //   242: bipush #102
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB33E) & 0xFFFF;
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
      char c = 'Ø';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbz2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */