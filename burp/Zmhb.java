package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmhb {
  private static String[] ZA;
  
  private static final String[] b;
  
  private static final String[] c;
  
  static List<Zrdb> ZE(Zgq<Zrdb> paramZgq, Zr_4 paramZr_4) {
    String[] arrayOfString = Zz();
    if (paramZgq == null)
      return new ArrayList<>(0); 
    ArrayList<Zrdb> arrayList = new ArrayList(paramZgq.ZY());
    for (Zsqx<Zrdb> zsqx : paramZgq) {
      arrayList.add(paramZr_4.<Zrdb>ZH(zsqx));
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  public static boolean Zl(Zstu paramZstu, int paramInt, Zbnt paramZbnt) {
    String[] arrayOfString = Zz();
    try {
      Zs68 zs68 = Zbwc.Zt((Zlit)null, paramZstu, Zt0k.HTML_AND_VIEWSTATE_ANALYSIS, paramZbnt);
      if (zs68.ZM == null)
        return false; 
      if (zs68.ZM.Zn == null)
        return false; 
      for (int[] arrayOfInt : zs68.ZM.Zn) {
        try {
          if (paramInt >= arrayOfInt[0] && paramInt < arrayOfInt[1])
            return true; 
        } catch (Exception exception) {
          throw a(null);
        } 
        if (arrayOfString != null)
          break; 
      } 
      return false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  public static boolean ZE(String paramString1, String paramString2) {
    if (paramString2.length() < 3)
      return false; 
    paramString1 = paramString1.toLowerCase();
    return (paramString1.contains(a(13630, -1704)) || (paramString1.contains(a(13631, 15669)) && !paramString1.equals(a(13625, -2292))) || paramString1.contains(a(13628, 12600)) || paramString1.equals(a(13629, 8139)) || paramString1.equals(a(13624, 16782)));
  }
  
  public static boolean ZN(String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic Zz : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual equals : (Ljava/lang/Object;)Z
    //   11: ifne -> 58
    //   14: aload_0
    //   15: invokestatic Zg : (Ljava/lang/String;)Ljava/lang/String;
    //   18: astore #4
    //   20: aload_1
    //   21: invokestatic Zg : (Ljava/lang/String;)Ljava/lang/String;
    //   24: astore #5
    //   26: aload #4
    //   28: ifnull -> 36
    //   31: aload #5
    //   33: ifnonnull -> 42
    //   36: iconst_1
    //   37: istore_3
    //   38: aload_2
    //   39: ifnull -> 58
    //   42: aload #4
    //   44: aload #5
    //   46: invokevirtual equals : (Ljava/lang/Object;)Z
    //   49: ifne -> 56
    //   52: iconst_1
    //   53: goto -> 57
    //   56: iconst_0
    //   57: istore_3
    //   58: iload_3
    //   59: ireturn
  }
  
  private static String Zg(String paramString) {
    if (paramString == null || paramString.length() == 0)
      return null; 
    int i = paramString.length();
    if (paramString.endsWith("."))
      i--; 
    String str = Zth6.ZW(paramString, i);
    if (str == null)
      return null; 
    i -= str.length() + 1;
    if (str.length() < 3) {
      str = Zth6.ZW(paramString, i);
      if (str == null)
        return null; 
      i -= str.length() + 1;
    } 
    return Zth6.ZW(paramString, i);
  }
  
  public static String Zj(String paramString) {
    String[] arrayOfString = Zz();
    if (paramString == null || paramString.length() == 0)
      return null; 
    int i = paramString.length();
    if (paramString.endsWith("."))
      i--; 
    String str = Zth6.ZW(paramString, i);
    if (str == null)
      return null; 
    i -= str.length() + 1;
    if (str.length() < 3) {
      str = Zth6.ZW(paramString, i);
      if (str == null)
        return null; 
      i -= str.length() + 1;
    } 
    int j = i;
    while (j > 0 && paramString.charAt(j - 1) != '.') {
      j--;
      if (arrayOfString != null)
        break; 
    } 
    return (i - j < 2) ? null : paramString.substring(j);
  }
  
  public static void Za(String[] paramArrayOfString) {
    ZA = paramArrayOfString;
  }
  
  public static String[] Zz() {
    return ZA;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '^4+$\\n):nÊ (Â£äÐ]'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Za : ([Ljava/lang/String;)V
    //   22: iconst_5
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #84
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 146
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
    //   71: ldc '6¢r´#é¾*ß*_¯PùIgB0·È*;G±ÓðÞu[Ï\\nï2î¦'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #7
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #94
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
    //   132: putstatic burp/Zmhb.b : [Ljava/lang/String;
    //   135: bipush #6
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zmhb.c : [Ljava/lang/String;
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
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #14
    //   218: goto -> 248
    //   221: bipush #108
    //   223: goto -> 248
    //   226: bipush #50
    //   228: goto -> 248
    //   231: bipush #16
    //   233: goto -> 248
    //   236: bipush #49
    //   238: goto -> 248
    //   241: bipush #99
    //   243: goto -> 248
    //   246: bipush #59
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x353C) & 0xFFFF;
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
      char c = 'ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */