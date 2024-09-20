package burp;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zsw8 {
  private static int[] ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static int ZA(String paramString1, String paramString2, int paramInt) {
    return Zx(paramString1, paramString2, paramInt, paramString1.length());
  }
  
  public static int Zx(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    paramInt2 -= paramString2.length();
    int i = paramInt1;
    int[] arrayOfInt = ZK();
    while (i <= paramInt2) {
      byte b = 0;
      while (true) {
        if (b < paramString2.length()) {
          char c = paramString1.charAt(i + b);
          if (c != paramString2.charAt(b)) {
            i++;
            break;
          } 
          b++;
          if (arrayOfInt == null)
            return i; 
          continue;
        } 
        return i;
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  public static int ZF(String paramString1, String paramString2, int paramInt) {
    return Zf(paramString1, paramString2, paramInt, paramString1.length());
  }
  
  public static int Zf(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    int[] arrayOfInt = ZK();
    if (paramString1 == null || paramString2 == null)
      return -1; 
    if (paramInt1 < 0)
      paramInt1 = 0; 
    int i = paramInt2 - paramString2.length() + 1;
    if (paramInt1 > i)
      return -1; 
    if (paramString2.length() == 0)
      return paramInt1; 
    int j = paramInt1;
    while (j < i) {
      if (paramString1.regionMatches(true, j, paramString2, 0, paramString2.length()))
        return j; 
      j++;
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  public static String Zz(String paramString) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual length : ()I
    //   8: invokespecial <init> : (I)V
    //   11: astore_2
    //   12: invokestatic ZK : ()[I
    //   15: iconst_0
    //   16: istore_3
    //   17: astore_1
    //   18: iload_3
    //   19: aload_0
    //   20: invokevirtual length : ()I
    //   23: if_icmpge -> 90
    //   26: aload_0
    //   27: iload_3
    //   28: invokevirtual charAt : (I)C
    //   31: istore #4
    //   33: iload_3
    //   34: iconst_2
    //   35: irem
    //   36: iconst_1
    //   37: if_icmpne -> 51
    //   40: aload_2
    //   41: iload #4
    //   43: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_1
    //   48: ifnonnull -> 83
    //   51: iload #4
    //   53: invokestatic isUpperCase : (C)Z
    //   56: ifeq -> 73
    //   59: aload_2
    //   60: iload #4
    //   62: invokestatic toLowerCase : (C)C
    //   65: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_1
    //   70: ifnonnull -> 83
    //   73: aload_2
    //   74: iload #4
    //   76: invokestatic toUpperCase : (C)C
    //   79: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: iinc #3, 1
    //   86: aload_1
    //   87: ifnonnull -> 18
    //   90: aload_2
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: areturn
  }
  
  public static boolean Zc(String paramString1, String paramString2) {
    byte b1 = 0;
    byte b2 = 0;
    int[] arrayOfInt = ZK();
    while (b1 < paramString1.length()) {
      if (b2 >= paramString2.length())
        return false; 
      switch (paramString2.charAt(b2)) {
        case '?':
          if (paramString1.charAt(b1) == '.')
            return false; 
          break;
        case '*':
          return (b2 + 1 >= paramString2.length() || Zc(paramString1.substring(b1), paramString2.substring(b2 + 1)) || Zc(paramString1.substring(b1 + 1), paramString2.substring(b2)));
        default:
          if (paramString1.charAt(b1) != paramString2.charAt(b2))
            return false; 
          break;
      } 
      b1++;
      b2++;
      if (arrayOfInt == null)
        break; 
    } 
    while (b2 < paramString2.length() && paramString2.charAt(b2) == '*') {
      b2++;
      if (arrayOfInt == null)
        break; 
    } 
    return (b2 >= paramString2.length());
  }
  
  public static String ZE(Collection<String> paramCollection) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZK : ()[I
    //   11: iconst_0
    //   12: istore_3
    //   13: astore_1
    //   14: aload_0
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #4
    //   22: aload #4
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 118
    //   32: aload #4
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast java/lang/String
    //   42: astore #5
    //   44: iload_3
    //   45: ifle -> 104
    //   48: iload_3
    //   49: iconst_1
    //   50: iadd
    //   51: aload_0
    //   52: invokeinterface size : ()I
    //   57: if_icmpge -> 78
    //   60: aload_2
    //   61: sipush #268
    //   64: sipush #14924
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload_1
    //   75: ifnonnull -> 104
    //   78: iload_3
    //   79: iconst_1
    //   80: iadd
    //   81: aload_0
    //   82: invokeinterface size : ()I
    //   87: if_icmpne -> 104
    //   90: aload_2
    //   91: sipush #269
    //   94: sipush #-15257
    //   97: invokestatic a : (II)Ljava/lang/String;
    //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_2
    //   105: aload #5
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: iinc #3, 1
    //   114: aload_1
    //   115: ifnonnull -> 22
    //   118: aload_2
    //   119: invokevirtual toString : ()Ljava/lang/String;
    //   122: areturn
  }
  
  public static boolean Zh(String paramString1, String paramString2) {
    return (paramString1 == null || paramString2 == null) ? false : ((paramString1.length() < paramString2.length()) ? false : paramString1.substring(0, paramString2.length()).equalsIgnoreCase(paramString2));
  }
  
  public static boolean ZR(String paramString) {
    int[] arrayOfInt = ZK();
    byte b = 0;
    while (b < paramString.length()) {
      char c = paramString.charAt(b);
      if ((c < ' ' && c != '\n' && c != '\r' && c != '\t') || c >= '')
        return false; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  public static boolean Zn(String paramString1, String paramString2) {
    return (paramString1 == null) ? ((paramString2 == null)) : paramString1.equals(paramString2);
  }
  
  public static boolean ZP(String paramString) {
    return (paramString == null || paramString.equals(""));
  }
  
  public static boolean ZS(String paramString) {
    return !ZP(paramString);
  }
  
  public static String Zf(Collection<String> paramCollection, String paramString) {
    int[] arrayOfInt = ZK();
    if (paramCollection == null || paramCollection.isEmpty())
      return ""; 
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<String> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext()) {
        stringBuilder.append(paramString);
        if (arrayOfInt == null)
          break; 
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static <T> String ZE(Collection<T> paramCollection, String paramString, Function<T, String> paramFunction) {
    int[] arrayOfInt = ZK();
    if (paramCollection == null || paramCollection.isEmpty())
      return ""; 
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<T> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(paramFunction.apply(iterator.next()));
      if (iterator.hasNext()) {
        stringBuilder.append(paramString);
        if (arrayOfInt == null)
          break; 
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static String Zg(String[] paramArrayOfString, String paramString) {
    int[] arrayOfInt = ZK();
    if (paramArrayOfString == null || paramArrayOfString.length == 0)
      return ""; 
    int i = paramArrayOfString.length;
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    while (b < i) {
      stringBuilder.append(paramArrayOfString[b]);
      if (b < i - 1)
        stringBuilder.append(paramString); 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public static boolean Zk(byte paramByte) {
    return (paramByte >= 48 && paramByte <= 57) ? true : ((paramByte >= 97 && paramByte <= 122) ? true : ((paramByte >= 65 && paramByte <= 90)));
  }
  
  public static String Zr(String paramString) {
    return ZH(paramString, "");
  }
  
  public static String ZH(String paramString1, String paramString2) {
    return (paramString1 == null) ? paramString2 : paramString1;
  }
  
  public static boolean ZO(String paramString) {
    return ZP(paramString) ? false : paramString.chars().allMatch(Character::isDigit);
  }
  
  public static boolean ZY(String paramString, CharSequence paramCharSequence) {
    return (paramString == null || paramCharSequence == null) ? false : paramString.contains(paramCharSequence);
  }
  
  public static boolean ZK(String paramString, CharSequence paramCharSequence) {
    return (paramString == null || paramCharSequence == null) ? false : paramString.toLowerCase(Locale.UK).contains(paramCharSequence.toString().toLowerCase(Locale.UK));
  }
  
  public static boolean ZC(String paramString, Pattern paramPattern) {
    if (paramString == null || paramPattern == null)
      return false; 
    Matcher matcher = paramPattern.matcher(paramString);
    return matcher.find();
  }
  
  public static String ZU(String paramString1, String paramString2) {
    if (paramString1 == null)
      return null; 
    int i = paramString1.indexOf(paramString2);
    return (i >= 0) ? paramString1.substring(i + paramString2.length()) : paramString1;
  }
  
  public static String ZY(String paramString, int paramInt, char paramChar) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual length : ()I
    //   8: invokespecial <init> : (I)V
    //   11: astore #4
    //   13: invokestatic ZK : ()[I
    //   16: aload #4
    //   18: aload_0
    //   19: iconst_0
    //   20: iload_1
    //   21: invokevirtual append : (Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
    //   24: pop
    //   25: astore_3
    //   26: iload_1
    //   27: istore #5
    //   29: iload #5
    //   31: aload_0
    //   32: invokevirtual length : ()I
    //   35: if_icmpge -> 109
    //   38: aload_0
    //   39: iload #5
    //   41: invokevirtual charAt : (I)C
    //   44: iload_2
    //   45: if_icmpne -> 90
    //   48: aload #4
    //   50: bipush #10
    //   52: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload #4
    //   58: aload_0
    //   59: iload #5
    //   61: iconst_1
    //   62: iadd
    //   63: iload #5
    //   65: iload_1
    //   66: iadd
    //   67: iconst_1
    //   68: iadd
    //   69: aload_0
    //   70: invokevirtual length : ()I
    //   73: invokestatic min : (II)I
    //   76: invokevirtual append : (Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: iload #5
    //   82: iload_1
    //   83: iadd
    //   84: istore #5
    //   86: aload_3
    //   87: ifnonnull -> 102
    //   90: aload #4
    //   92: aload_0
    //   93: iload #5
    //   95: invokevirtual charAt : (I)C
    //   98: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: iinc #5, 1
    //   105: aload_3
    //   106: ifnonnull -> 29
    //   109: aload #4
    //   111: invokevirtual toString : ()Ljava/lang/String;
    //   114: areturn
  }
  
  public static void Zi(int[] paramArrayOfint) {
    ZV = paramArrayOfint;
  }
  
  public static int[] ZK() {
    return ZV;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_2
    //   9: newarray int
    //   11: ldc 'Nô­$'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic Zi : ([I)V
    //   23: iconst_2
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #82
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 87
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
    //   72: aload #5
    //   74: putstatic burp/Zsw8.a : [Ljava/lang/String;
    //   77: iconst_2
    //   78: anewarray java/lang/String
    //   81: putstatic burp/Zsw8.b : [Ljava/lang/String;
    //   84: goto -> 231
    //   87: dup_x2
    //   88: pop
    //   89: invokevirtual toCharArray : ()[C
    //   92: dup_x1
    //   93: arraylength
    //   94: dup_x2
    //   95: pop
    //   96: iconst_0
    //   97: istore #6
    //   99: dup2_x1
    //   100: pop2
    //   101: dup_x2
    //   102: iconst_1
    //   103: if_icmpgt -> 204
    //   106: dup2
    //   107: swap
    //   108: iload #6
    //   110: dup2_x1
    //   111: caload
    //   112: swap
    //   113: iload #6
    //   115: bipush #7
    //   117: irem
    //   118: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #36
    //   158: goto -> 188
    //   161: bipush #118
    //   163: goto -> 188
    //   166: bipush #59
    //   168: goto -> 188
    //   171: bipush #114
    //   173: goto -> 188
    //   176: bipush #109
    //   178: goto -> 188
    //   181: bipush #85
    //   183: goto -> 188
    //   186: bipush #73
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 110
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 106
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
    //   228: goto -> 44
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x10C) & 0xFFFF;
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
      byte b1 = 76;
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsw8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */