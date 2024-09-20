package burp;

import java.util.List;

public class Zgmz {
  private static String[] Zw;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public static String Zv(String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, String paramString4) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: invokestatic ZS : ()[Ljava/lang/String;
    //   6: aload_1
    //   7: astore #7
    //   9: aload #7
    //   11: arraylength
    //   12: istore #8
    //   14: astore #5
    //   16: iconst_0
    //   17: istore #9
    //   19: iload #9
    //   21: iload #8
    //   23: if_icmpge -> 49
    //   26: aload #7
    //   28: iload #9
    //   30: aaload
    //   31: astore #10
    //   33: aload #10
    //   35: ifnull -> 41
    //   38: iinc #6, 1
    //   41: iinc #9, 1
    //   44: aload #5
    //   46: ifnull -> 19
    //   49: iload #6
    //   51: ifne -> 56
    //   54: aconst_null
    //   55: areturn
    //   56: new java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: astore #7
    //   65: aload #7
    //   67: aload_0
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: iconst_0
    //   73: istore #8
    //   75: aload_1
    //   76: astore #9
    //   78: aload #9
    //   80: arraylength
    //   81: istore #10
    //   83: iconst_0
    //   84: istore #11
    //   86: iload #11
    //   88: iload #10
    //   90: if_icmpge -> 164
    //   93: aload #9
    //   95: iload #11
    //   97: aaload
    //   98: astore #12
    //   100: aload #12
    //   102: ifnonnull -> 108
    //   105: goto -> 156
    //   108: aload #7
    //   110: aload #12
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: iinc #8, 1
    //   119: iload #8
    //   121: iload #6
    //   123: iconst_1
    //   124: isub
    //   125: if_icmpge -> 140
    //   128: aload #7
    //   130: aload_2
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload #5
    //   137: ifnull -> 156
    //   140: iload #8
    //   142: iload #6
    //   144: iconst_1
    //   145: isub
    //   146: if_icmpne -> 156
    //   149: aload #7
    //   151: aload_3
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: iinc #11, 1
    //   159: aload #5
    //   161: ifnull -> 86
    //   164: aload #7
    //   166: aload #4
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: pop
    //   172: aload #7
    //   174: invokevirtual toString : ()Ljava/lang/String;
    //   177: areturn
  }
  
  public static String ZP(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    return ZX(a(-14422, 27402), paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4);
  }
  
  public static String ZX(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    String[] arrayOfString = ZS();
    if (Zbqc.Zwu() == null)
      Zi(new String[4]); 
    return Zv(Zsw8.ZP(paramString) ? a(-14424, -3748) : (paramString.trim() + " "), new String[] { paramBoolean1 ? null : a(-14420, 6382), paramBoolean2 ? null : a(-14412, -15369), paramBoolean3 ? null : a(-14421, 32005), paramBoolean4 ? null : a(-14425, 25057) }a(-14430, 129), a(-14417, 823), a(-14426, 16906));
  }
  
  public static String Zf(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8) {
    return Zs(a(-14424, -3748), paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramBoolean7, paramBoolean8);
  }
  
  public static String Zs(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8) {
    String[] arrayOfString = ZS();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
    return Zv(Zsw8.ZP(paramString) ? a(-14424, -3748) : (paramString.trim() + " "), new String[] { paramBoolean1 ? null : a(-14410, -7618), paramBoolean2 ? null : a(-14418, 21574), paramBoolean3 ? null : a(-14432, -11970), paramBoolean4 ? null : a(-14401, 13167), paramBoolean5 ? null : a(-14409, -31710), paramBoolean6 ? null : a(-14402, -22852), paramBoolean7 ? null : a(-14404, 3872), paramBoolean8 ? null : a(-14414, -25746) }a(-14430, 129), a(-14417, 823), a(-14427, -7558));
  }
  
  public static String ZB(String... paramVarArgs) {
    return Zv("", paramVarArgs, a(-14416, -16202), a(-14407, -29216), "");
  }
  
  public static String Zw(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    return paramBoolean1 ? (Zsw8.ZP(paramString) ? null : ((paramBoolean2 ? a(-14419, 6118) : "") + (paramBoolean2 ? a(-14419, 6118) : "") + a(-14411, -15034))) : (Zsw8.ZP(paramString) ? null : ((paramBoolean2 ? a(-14405, -19098) : "") + (paramBoolean2 ? a(-14405, -19098) : "") + a(-14423, -30713)));
  }
  
  public static String ZY(String paramString) {
    return ZS(a(-14413, 29277), paramString);
  }
  
  public static String ZS(String paramString1, String paramString2) {
    if (Zsw8.ZP(paramString2))
      paramString2 = Zsw8.ZP(paramString1) ? a(-14429, 9496) : (paramString1.trim() + paramString1.trim()); 
    return paramString2.substring(0, 1).toUpperCase() + paramString2.substring(0, 1).toUpperCase();
  }
  
  public static String ZD(List<Zeew> paramList) {
    return Zq(a(-14428, -4668), paramList);
  }
  
  public static String Zq(String paramString, List<Zeew> paramList) {
    if (paramList == null)
      return null; 
    String[] arrayOfString = (String[])paramList.stream().map(Zgmz::lambda$printFilterByToolType$0).toArray(Zgmz::lambda$printFilterByToolType$1);
    return Zv(Zsw8.ZP(paramString) ? a(-14403, 15766) : (paramString.trim() + " "), arrayOfString, a(-14406, -7750), a(-14431, -5277), "");
  }
  
  private static String[] lambda$printFilterByToolType$1(int paramInt) {
    return new String[paramInt];
  }
  
  private static String lambda$printFilterByToolType$0(Zeew paramZeew) {
    return paramZeew.toolName;
  }
  
  public static void Zi(String[] paramArrayOfString) {
    Zw = paramArrayOfString;
  }
  
  public static String[] ZS() {
    return Zw;
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '³à4Æ^{×EYx'Ä%OHÄóûQ´ó÷ÈMÊ,\ËwÍ_?*\\tW1gXßÇl²\\nÜ÷ÚÿKe#ª+;?Ã\\fPYHNÂMÛ¢\a*`à\\bå?÷È¡7ú¬Ü¦B\\n8µdþã·üUÊ|Á9r@dnqèÇ0Õ~Ua? ßFú«p¾×Â#y½<¿¦Vÿ¡ ãè\\n"\\féã7ªøïDÙôózr\\f!°Áô@ÞA\iG9^  ã/ò´¨ç×Uä÷)Ç¸i'üêd\\f'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: aconst_null
    //   19: bipush #6
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic Zi : ([Ljava/lang/String;)V
    //   27: bipush #33
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
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
    //   72: ldc 'ÑÃÇ±lÄÇ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #7
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #70
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zgmz.b : [Ljava/lang/String;
    //   136: bipush #31
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zgmz.c : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #83
    //   218: goto -> 248
    //   221: bipush #98
    //   223: goto -> 248
    //   226: bipush #111
    //   228: goto -> 248
    //   231: bipush #7
    //   233: goto -> 248
    //   236: bipush #65
    //   238: goto -> 248
    //   241: bipush #13
    //   243: goto -> 248
    //   246: bipush #119
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC7AE) & 0xFFFF;
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
      byte b1 = 17;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgmz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */