package burp;

public class Zr4e {
  private static final Zem5[] ZB;
  
  private static final String[] Zc;
  
  private static final String[] Zb;
  
  private static final Zewi ZL;
  
  private static final Zewi Zv;
  
  private static final Zewi Ze;
  
  private static final Zewi ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrr2 ZP(String paramString) {
    if (paramString == null)
      return ZA(null, null, null, null, null); 
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = paramString;
    String[] arrayOfString1 = Zf(str6);
    if (arrayOfString1 == null)
      return ZA(null, null, null, null, ZC(str6)); 
    if (arrayOfString1.length == 3 && !arrayOfString1[0].startsWith(":")) {
      str1 = arrayOfString1[0].isEmpty() ? null : arrayOfString1[0];
      str2 = arrayOfString1[1];
      str6 = arrayOfString1[2];
    } 
    String[] arrayOfString2 = Zu(str6);
    if (arrayOfString2 == null)
      return ZA(str1, str2, null, null, ZC(str6)); 
    if (arrayOfString2.length == 2) {
      if (Zq(str2, str1, arrayOfString2)) {
        str3 = str1 + str1 + str2;
        str2 = null;
        str1 = null;
      } else {
        str3 = arrayOfString2[0];
      } 
      str6 = arrayOfString2[1];
    } 
    String[] arrayOfString3 = Zk(str6);
    if (arrayOfString3.length == 2) {
      if (Ze.Zs(arrayOfString3[0])) {
        str4 = arrayOfString3[1];
        str5 = arrayOfString3[0];
      } else {
        str4 = ZC(str6);
      } 
    } else if (Ze.Zs(str6)) {
      str5 = str6;
    } else {
      str4 = ZC(str6);
    } 
    return ZA(str1, str2, str3, str5, str4);
  }
  
  private Zrr2 ZA(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    int i = Zo(paramString5);
    if (i != -1) {
      String str = paramString5.substring(0, i);
      return new Zrr2(paramString1, paramString2, paramString3, paramString4, str.isEmpty() ? null : str, paramString5.substring(i));
    } 
    return (paramString5 != null && !paramString5.startsWith("/") && !paramString5.startsWith(a(18849, 23161)) && !paramString5.startsWith("\\")) ? new Zrr2(paramString1, paramString2, paramString3, paramString4, null, paramString5) : new Zrr2(paramString1, paramString2, paramString3, paramString4, paramString5, null);
  }
  
  private int Zo(String paramString) {
    if (paramString == null)
      return -1; 
    int i = paramString.indexOf('?');
    return (i != -1) ? i : paramString.indexOf(';');
  }
  
  private boolean Zq(String paramString1, String paramString2, String[] paramArrayOfString) {
    return (":".equals(paramString1) && paramString2 != null && !paramArrayOfString[0].contains(":"));
  }
  
  private String ZC(String paramString) {
    String str = Zmit.ZH();
    if (paramString == null || paramString.isEmpty())
      return null; 
    String[] arrayOfString = Zb;
    int i = arrayOfString.length;
    byte b = 0;
    while (b < i) {
      String str1 = arrayOfString[b];
      if (paramString.startsWith(str1))
        return paramString; 
      b++;
      if (str != null)
        break; 
    } 
    return paramString;
  }
  
  private String[] Zu(String paramString) {
    return ZW(paramString, Zc, Zv, true);
  }
  
  private String[] Zk(String paramString) {
    return ZW(paramString, Zb, ZS, false);
  }
  
  private String[] ZW(String paramString, String[] paramArrayOfString, Zewi paramZewi, boolean paramBoolean) {
    String[] arrayOfString = paramArrayOfString;
    int i = arrayOfString.length;
    String str = Zmit.ZH();
    byte b = 0;
    while (b < i) {
      String str1 = arrayOfString[b];
      int j = paramString.indexOf(str1);
      if (j >= 0) {
        if (paramZewi.Zs(paramString.substring(0, j))) {
          int k = paramBoolean ? (j + str1.length()) : j;
          return new String[] { paramString.substring(0, k), paramString.substring(k) };
        } 
        return null;
      } 
      b++;
      if (str != null)
        break; 
    } 
    return new String[] { paramString };
  }
  
  private String[] Zf(String paramString) {
    Zem5[] arrayOfZem5 = ZB;
    int i = arrayOfZem5.length;
    byte b = 0;
    String str = Zmit.ZH();
    while (b < i) {
      Zem5 zem5 = arrayOfZem5[b];
      int j = paramString.indexOf(zem5.Z_);
      if (j >= 0) {
        String str1 = paramString.substring(0, j);
        if (ZL.Zs(str1)) {
          String str2 = zem5.ZJ(paramString, j);
          if (str2 == null)
            return null; 
          String str3 = paramString.substring(j + str2.length());
          return new String[] { str1, str2, str3 };
        } 
        return null;
      } 
      b++;
      if (str != null)
        break; 
    } 
    return new String[] { paramString };
  }
  
  private static boolean lambda$static$3(String paramString) {
    return true;
  }
  
  private static boolean lambda$static$2(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic ZH : ()Ljava/lang/String;
    //   5: iconst_0
    //   6: istore_3
    //   7: astore_1
    //   8: iload_3
    //   9: aload_0
    //   10: invokevirtual length : ()I
    //   13: if_icmpge -> 85
    //   16: aload_0
    //   17: iload_3
    //   18: invokevirtual charAt : (I)C
    //   21: istore #4
    //   23: iload #4
    //   25: bipush #58
    //   27: if_icmpne -> 46
    //   30: iload_3
    //   31: ifeq -> 38
    //   34: iload_2
    //   35: ifeq -> 40
    //   38: iconst_0
    //   39: ireturn
    //   40: iconst_1
    //   41: istore_2
    //   42: aload_1
    //   43: ifnull -> 78
    //   46: iload #4
    //   48: invokestatic isLetter : (C)Z
    //   51: ifne -> 78
    //   54: iload #4
    //   56: invokestatic isDigit : (C)Z
    //   59: ifne -> 78
    //   62: bipush #46
    //   64: iload #4
    //   66: if_icmpeq -> 78
    //   69: bipush #45
    //   71: iload #4
    //   73: if_icmpeq -> 78
    //   76: iconst_0
    //   77: ireturn
    //   78: iinc #3, 1
    //   81: aload_1
    //   82: ifnull -> 8
    //   85: aload_0
    //   86: invokevirtual isEmpty : ()Z
    //   89: ifeq -> 94
    //   92: iconst_0
    //   93: ireturn
    //   94: aload_0
    //   95: aload_0
    //   96: invokevirtual length : ()I
    //   99: iconst_1
    //   100: isub
    //   101: invokevirtual charAt : (I)C
    //   104: istore_3
    //   105: iload_3
    //   106: invokestatic isLetter : (C)Z
    //   109: ifne -> 119
    //   112: iload_3
    //   113: invokestatic isDigit : (C)Z
    //   116: ifeq -> 123
    //   119: iconst_1
    //   120: goto -> 124
    //   123: iconst_0
    //   124: ireturn
  }
  
  private static boolean lambda$static$1(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic ZH : ()Ljava/lang/String;
    //   5: aload_0
    //   6: invokevirtual toCharArray : ()[C
    //   9: astore_3
    //   10: aload_3
    //   11: arraylength
    //   12: istore #4
    //   14: iconst_0
    //   15: istore #5
    //   17: astore_1
    //   18: iload #5
    //   20: iload #4
    //   22: if_icmpge -> 82
    //   25: aload_3
    //   26: iload #5
    //   28: caload
    //   29: istore #6
    //   31: iload #6
    //   33: bipush #58
    //   35: if_icmpne -> 50
    //   38: iload_2
    //   39: ifeq -> 44
    //   42: iconst_0
    //   43: ireturn
    //   44: iconst_1
    //   45: istore_2
    //   46: aload_1
    //   47: ifnull -> 75
    //   50: iload #6
    //   52: invokestatic isLetter : (C)Z
    //   55: ifne -> 75
    //   58: iload #6
    //   60: invokestatic isDigit : (C)Z
    //   63: ifne -> 75
    //   66: bipush #37
    //   68: iload #6
    //   70: if_icmpeq -> 75
    //   73: iconst_0
    //   74: ireturn
    //   75: iinc #5, 1
    //   78: aload_1
    //   79: ifnull -> 18
    //   82: iconst_1
    //   83: ireturn
  }
  
  private static boolean lambda$static$0(String paramString) {
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    String str = Zmit.ZH();
    byte b = 0;
    while (b < i) {
      char c = arrayOfChar[b];
      if (!Character.isLetter(c) && !Character.isDigit(c))
        return false; 
      b++;
      if (str != null)
        break; 
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '×\\n«²@½'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #59
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc ';¾Ø'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_2
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #53
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic burp/Zr4e.a : [Ljava/lang/String;
    //   129: iconst_5
    //   130: anewarray java/lang/String
    //   133: putstatic burp/Zr4e.b : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #111
    //   210: goto -> 240
    //   213: bipush #20
    //   215: goto -> 240
    //   218: bipush #57
    //   220: goto -> 240
    //   223: bipush #13
    //   225: goto -> 240
    //   228: bipush #94
    //   230: goto -> 240
    //   233: bipush #25
    //   235: goto -> 240
    //   238: bipush #43
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: iconst_4
    //   297: anewarray burp/Zem5
    //   300: dup
    //   301: iconst_0
    //   302: new burp/Zebo
    //   305: dup
    //   306: sipush #18852
    //   309: sipush #-27859
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: bipush #7
    //   317: invokespecial <init> : (Ljava/lang/String;I)V
    //   320: aastore
    //   321: dup
    //   322: iconst_1
    //   323: new burp/Zebo
    //   326: dup
    //   327: sipush #18851
    //   330: sipush #30742
    //   333: invokestatic a : (II)Ljava/lang/String;
    //   336: bipush #6
    //   338: invokespecial <init> : (Ljava/lang/String;I)V
    //   341: aastore
    //   342: dup
    //   343: iconst_2
    //   344: new burp/Zebo
    //   347: dup
    //   348: sipush #18850
    //   351: sipush #-24036
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: bipush #6
    //   359: invokespecial <init> : (Ljava/lang/String;I)V
    //   362: aastore
    //   363: dup
    //   364: iconst_3
    //   365: new burp/Zem5
    //   368: dup
    //   369: ldc ':'
    //   371: invokespecial <init> : (Ljava/lang/String;)V
    //   374: aastore
    //   375: putstatic burp/Zr4e.ZB : [Lburp/Zem5;
    //   378: iconst_1
    //   379: anewarray java/lang/String
    //   382: dup
    //   383: iconst_0
    //   384: ldc '@'
    //   386: aastore
    //   387: putstatic burp/Zr4e.Zc : [Ljava/lang/String;
    //   390: iconst_5
    //   391: anewarray java/lang/String
    //   394: dup
    //   395: iconst_0
    //   396: ldc '/'
    //   398: aastore
    //   399: dup
    //   400: iconst_1
    //   401: ldc '\'
    //   403: aastore
    //   404: dup
    //   405: iconst_2
    //   406: sipush #18848
    //   409: sipush #-9860
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: aastore
    //   416: dup
    //   417: iconst_3
    //   418: ldc '?'
    //   420: aastore
    //   421: dup
    //   422: iconst_4
    //   423: ldc ';'
    //   425: aastore
    //   426: putstatic burp/Zr4e.Zb : [Ljava/lang/String;
    //   429: <illegal opcode> Zs : ()Lburp/Zewi;
    //   434: putstatic burp/Zr4e.ZL : Lburp/Zewi;
    //   437: <illegal opcode> Zs : ()Lburp/Zewi;
    //   442: putstatic burp/Zr4e.Zv : Lburp/Zewi;
    //   445: <illegal opcode> Zs : ()Lburp/Zewi;
    //   450: putstatic burp/Zr4e.Ze : Lburp/Zewi;
    //   453: <illegal opcode> Zs : ()Lburp/Zewi;
    //   458: putstatic burp/Zr4e.ZS : Lburp/Zewi;
    //   461: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x49A0) & 0xFFFF;
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
      char c = '¨';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr4e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */