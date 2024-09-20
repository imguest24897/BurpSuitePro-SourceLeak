package burp;

import java.net.InetAddress;

public class Ztt2 {
  private static final String[] a;
  
  private static final String[] b;
  
  public static String ZO(Zmzk paramZmzk) {
    String str = paramZmzk.ZJ1();
    boolean bool = paramZmzk.ZJZ();
    int i = paramZmzk.ZJO();
    return (bool && i == 443) ? str : ((!bool && i == 80) ? str : (str + ":" + str));
  }
  
  public static String ZZ(Zmzk paramZmzk, String paramString, Zgb6 paramZgb6, Zrgd paramZrgd, Zr1j paramZr1j, Zkh7 paramZkh7) {
    String str2;
    int j;
    String str3;
    String str4;
    String str5;
    int k;
    String str6;
    String str7;
    String str1 = paramZmzk.ZJ1();
    boolean bool = paramZmzk.ZJZ();
    int i = paramZmzk.ZJO();
    if (paramString == null)
      paramString = ""; 
    switch (paramZmzk.ZJY()) {
      case 4:
        str2 = paramString;
        j = i;
        str3 = str1;
        str4 = bool ? "s" : "";
        return a(-6711, 15858) + a(-6711, 15858) + str4 + a(-6715, -9858) + str3 + ":" + j;
      case 6:
        str5 = paramString;
        k = i;
        str6 = str1;
        str7 = bool ? "s" : "";
        return a(-6714, 15415) + a(-6714, 15415) + str7 + a(-6716, -3629) + str6 + a(-6713, -8090) + k;
    } 
    InetAddress inetAddress = paramZmzk.Zx(paramZgb6, paramZrgd, paramZr1j, paramZkh7);
    String str8 = (inetAddress == null) ? a(-6710, -14421) : inetAddress.getHostAddress();
    String str9 = paramString;
    int m = i;
    String str10 = str1;
    String str11 = bool ? "s" : "";
    return a(-6714, 15415) + a(-6714, 15415) + str11 + a(-6709, 14796) + str10 + ":" + m + str9 + a(-6712, 988) + str8;
  }
  
  public static String Zh(Zmzk paramZmzk) {
    String str1 = paramZmzk.ZJ1();
    boolean bool = paramZmzk.ZJZ();
    int i = paramZmzk.ZJO();
    String str2 = (paramZmzk.ZJY() == 6) ? ("[" + str1 + "]") : str1;
    return (bool && i == 443) ? (a(-6719, -14044) + a(-6719, -14044)) : ((!bool && i == 80) ? (a(-6718, -16998) + a(-6718, -16998)) : ((bool ? a(-6717, -27231) : a(-6720, -20145)) + (bool ? a(-6717, -27231) : a(-6720, -20145)) + ":" + str2));
  }
  
  static int ZE(Zmzk paramZmzk) {
    String str2 = paramZmzk.ZJ1();
    boolean bool = paramZmzk.ZJZ();
    int i = paramZmzk.ZJO();
    int j = 3;
    String str1 = Zbnt.ZW();
    j = 89 * j + ((str2 == null) ? 0 : str2.hashCode());
    j = 89 * j + i;
    j = 89 * j + (bool ? 1 : 0);
    if (str1 != null)
      Zbqc.Zr(new Zbqc[4]); 
    return j;
  }
  
  static boolean Z_(Zmzk paramZmzk, Object paramObject) {
    if (paramObject == null || !(paramObject instanceof Zmzk))
      return false; 
    Zmzk zmzk = (Zmzk)paramObject;
    return (paramZmzk.ZJZ() == zmzk.ZJZ() && paramZmzk.ZJO() == zmzk.ZJO() && paramZmzk.ZJ1().equals(zmzk.ZJ1()));
  }
  
  static int Zx(Zmzk paramZmzk1, Zmzk paramZmzk2) {
    String str1 = paramZmzk1.ZJ1();
    String str2 = paramZmzk2.ZJ1();
    if (!str1.equals(str2))
      return str1.compareTo(str2); 
    int i = paramZmzk1.ZJO();
    int j = paramZmzk2.ZJO();
    if (i < j)
      return -1; 
    if (i > j)
      return 1; 
    boolean bool1 = paramZmzk1.ZJZ();
    boolean bool2 = paramZmzk2.ZJZ();
    return (bool1 == bool2) ? 0 : (bool1 ? 1 : -1);
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ë#À`Eµ´hw´£Þ­\\b)_ÄR*ÌNp-F|ó'ÜÈ»,«ÿ©½Vºèg'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #97
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 141
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
    //   68: ldc '\;\\fÀYMü>í+'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_4
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Ztt2.a : [Ljava/lang/String;
    //   130: bipush #12
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Ztt2.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #94
    //   214: goto -> 244
    //   217: bipush #56
    //   219: goto -> 244
    //   222: bipush #118
    //   224: goto -> 244
    //   227: bipush #121
    //   229: goto -> 244
    //   232: bipush #14
    //   234: goto -> 244
    //   237: bipush #123
    //   239: goto -> 244
    //   242: bipush #7
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE5C1) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztt2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */