package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zti8 implements Zehc {
  private static final Pattern ZB;
  
  private final Ze3n ZQ;
  
  private static String[] Zt;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zti8(Ze3n paramZe3n) {
    this.ZQ = paramZe3n;
  }
  
  public Ztk8 Zb() {
    String[] arrayOfString = ZZ();
    try {
      if (!this.ZQ.Za().ZJZ())
        return Ztk8.ZD(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    for (String str : this.ZQ.ZL().Zm()) {
      try {
        if (str == null)
          continue; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      Matcher matcher = ZB.matcher(str);
      try {
        if (matcher.find() && matcher.groupCount() == 2)
          try {
            int i = Integer.parseInt(matcher.group(2));
            return (i >= 60) ? Ztk8.ZD() : Ztk8.ZY(Zz0d.Zu(this.ZQ.Za(), this.ZQ.ZN(), this.ZQ.Zt().Z_(Zy(str))));
          } catch (NumberFormatException numberFormatException) {
            Zah.Zl(numberFormatException, Zk_.IGNORED);
            return Ztk8.ZY(Zz0d.Zu(this.ZQ.Za(), this.ZQ.ZN(), this.ZQ.Zt().Z_(Zy(str))));
          }  
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      try {
        if (str.startsWith(a(8904, 2374)))
          return Ztk8.ZY(Zz0d.Zu(this.ZQ.Za(), this.ZQ.ZN(), this.ZQ.Zt().Z_(Zy(str)))); 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      if (arrayOfString == null)
        break; 
    } 
    return Ztk8.ZY(Zz0d.Zu(this.ZQ.Za(), this.ZQ.ZN(), this.ZQ.Zt()));
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_StrictTransportSecurityNotEnforced;
  }
  
  private Collection<Zl1r> Zy(String paramString) {
    int i = Zlt_.Zf(this.ZQ.ZL().Za(), Zkb.Zy(paramString), true);
    int j = i + paramString.length();
    return Collections.singleton(Zrlp.Zj(i, j));
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_5
    //   7: anewarray java/lang/String
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic Zc : ([Ljava/lang/String;)V
    //   15: ldc 'ÍÆÿp®Ó³¤^yÝ§'Ó·¯\\bÞb~µ;T8R±H{¸ÍmgÎ\\fcÉ·TB\\tÙ§´W«J5;ÚÇ¼5¶!»2£É\\b#ZÖÎ\\f1¶'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #60
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: iconst_3
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 88
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 29
    //   73: aload #5
    //   75: putstatic burp/Zti8.b : [Ljava/lang/String;
    //   78: iconst_2
    //   79: anewarray java/lang/String
    //   82: putstatic burp/Zti8.c : [Ljava/lang/String;
    //   85: goto -> 230
    //   88: dup_x2
    //   89: pop
    //   90: invokevirtual toCharArray : ()[C
    //   93: dup_x1
    //   94: arraylength
    //   95: dup_x2
    //   96: pop
    //   97: iconst_0
    //   98: istore #6
    //   100: dup2_x1
    //   101: pop2
    //   102: dup_x2
    //   103: iconst_1
    //   104: if_icmpgt -> 203
    //   107: dup2
    //   108: swap
    //   109: iload #6
    //   111: dup2_x1
    //   112: caload
    //   113: swap
    //   114: iload #6
    //   116: bipush #7
    //   118: irem
    //   119: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #15
    //   158: goto -> 187
    //   161: bipush #52
    //   163: goto -> 187
    //   166: bipush #28
    //   168: goto -> 187
    //   171: bipush #48
    //   173: goto -> 187
    //   176: bipush #23
    //   178: goto -> 187
    //   181: bipush #41
    //   183: goto -> 187
    //   186: iconst_3
    //   187: ixor
    //   188: ixor
    //   189: i2c
    //   190: castore
    //   191: iinc #6, 1
    //   194: dup
    //   195: ifne -> 203
    //   198: dup2
    //   199: dup_x1
    //   200: goto -> 111
    //   203: dup2_x1
    //   204: pop2
    //   205: dup_x2
    //   206: iload #6
    //   208: if_icmpgt -> 107
    //   211: pop
    //   212: new java/lang/String
    //   215: dup_x1
    //   216: swap
    //   217: invokespecial <init> : ([C)V
    //   220: invokevirtual intern : ()Ljava/lang/String;
    //   223: swap
    //   224: pop
    //   225: swap
    //   226: pop
    //   227: goto -> 45
    //   230: sipush #8905
    //   233: sipush #-9709
    //   236: invokestatic a : (II)Ljava/lang/String;
    //   239: bipush #34
    //   241: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   244: putstatic burp/Zti8.ZB : Ljava/util/regex/Pattern;
    //   247: return
  }
  
  public static void Zc(String[] paramArrayOfString) {
    Zt = paramArrayOfString;
  }
  
  public static String[] ZZ() {
    return Zt;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x22C9) & 0xFFFF;
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
      char c = '';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zti8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */