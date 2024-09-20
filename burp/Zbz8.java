package burp;

import java.util.List;

public class Zbz8 {
  private final Zlk4 Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbz8(Zlk4 paramZlk4) {
    this.Zk = paramZlk4;
  }
  
  public List<Zllr> ZK() {
    // Byte code:
    //   0: invokestatic Ze : ()[I
    //   3: astore_1
    //   4: getstatic burp/Zrm_.Zz : [I
    //   7: aload_0
    //   8: getfield Zk : Lburp/Zlk4;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 40, 1 -> 54, 2 -> 60, 3 -> 66
    //   40: new java/lang/MatchException
    //   43: dup
    //   44: aconst_null
    //   45: aconst_null
    //   46: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   49: athrow
    //   50: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   53: athrow
    //   54: getstatic burp/Zgmf.Zz : [[Ljava/lang/String;
    //   57: goto -> 69
    //   60: getstatic burp/Zgmf.Zx : [[Ljava/lang/String;
    //   63: goto -> 69
    //   66: getstatic burp/Zgmf.ZY : [[Ljava/lang/String;
    //   69: astore_2
    //   70: new java/util/ArrayList
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: astore_3
    //   78: aload_2
    //   79: astore #4
    //   81: aload #4
    //   83: arraylength
    //   84: istore #5
    //   86: iconst_0
    //   87: istore #6
    //   89: iload #6
    //   91: iload #5
    //   93: if_icmpge -> 334
    //   96: aload #4
    //   98: iload #6
    //   100: aaload
    //   101: astore #7
    //   103: aload #7
    //   105: iconst_0
    //   106: aaload
    //   107: astore #8
    //   109: aload #7
    //   111: iconst_1
    //   112: aaload
    //   113: astore #9
    //   115: aload #9
    //   117: sipush #27102
    //   120: sipush #-9904
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   129: ifeq -> 141
    //   132: aload #9
    //   134: goto -> 148
    //   137: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   140: athrow
    //   141: aload #9
    //   143: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   148: astore #10
    //   150: aload #8
    //   152: aload #10
    //   154: ldc '''
    //   156: dup_x2
    //   157: pop
    //   158: sipush #27100
    //   161: sipush #-20786
    //   164: invokestatic a : (II)Ljava/lang/String;
    //   167: swap
    //   168: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   173: astore #11
    //   175: aload #8
    //   177: aload #9
    //   179: sipush #27103
    //   182: sipush #-2077
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: swap
    //   189: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   194: astore #12
    //   196: aload_0
    //   197: aload #12
    //   199: invokevirtual Zn : (Ljava/lang/String;)Z
    //   202: ifeq -> 244
    //   205: aload_3
    //   206: new burp/Zll5
    //   209: dup
    //   210: getstatic burp/Zzu2.SQL_INJECTION : Lburp/Zzu2;
    //   213: aload #12
    //   215: new burp/Ztc_
    //   218: dup
    //   219: iconst_3
    //   220: invokespecial <init> : (B)V
    //   223: iconst_1
    //   224: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxsx;B)V
    //   227: invokeinterface add : (Ljava/lang/Object;)Z
    //   232: pop
    //   233: aload_1
    //   234: ifnull -> 327
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   243: athrow
    //   244: aload #8
    //   246: invokevirtual isEmpty : ()Z
    //   249: ifeq -> 267
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   258: athrow
    //   259: iconst_0
    //   260: goto -> 268
    //   263: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   266: athrow
    //   267: iconst_1
    //   268: istore #13
    //   270: aload_3
    //   271: new burp/Zlly
    //   274: dup
    //   275: getstatic burp/Zzu2.SQL_INJECTION : Lburp/Zzu2;
    //   278: aload #12
    //   280: new burp/Zz14
    //   283: dup
    //   284: iconst_3
    //   285: invokespecial <init> : (B)V
    //   288: iload #13
    //   290: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxsx;B)V
    //   293: invokeinterface add : (Ljava/lang/Object;)Z
    //   298: pop
    //   299: aload_3
    //   300: new burp/Zll5
    //   303: dup
    //   304: getstatic burp/Zzu2.SQL_INJECTION : Lburp/Zzu2;
    //   307: aload #11
    //   309: new burp/Ztc_
    //   312: dup
    //   313: iconst_3
    //   314: invokespecial <init> : (B)V
    //   317: iconst_1
    //   318: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxsx;B)V
    //   321: invokeinterface add : (Ljava/lang/Object;)Z
    //   326: pop
    //   327: iinc #6, 1
    //   330: aload_1
    //   331: ifnull -> 89
    //   334: aload_3
    //   335: invokestatic Zwu : ()[Lburp/Zbqc;
    //   338: ifnonnull -> 354
    //   341: iconst_2
    //   342: newarray int
    //   344: invokestatic Zr : ([I)V
    //   347: goto -> 354
    //   350: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   353: athrow
    //   354: areturn
    // Exception table:
    //   from	to	target	type
    //   4	50	50	java/lang/MatchException
    //   115	137	137	java/lang/MatchException
    //   196	237	240	java/lang/MatchException
    //   205	252	255	java/lang/MatchException
    //   244	263	263	java/lang/MatchException
    //   334	347	350	java/lang/MatchException
  }
  
  private boolean Zn(String paramString) {
    try {
      if (paramString != null)
        try {
          if (paramString.startsWith(","));
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¡+!XêØuÅòµù´E6Sç!Ý´Ey¿rÇ¨gþ?!çÁãê&ÙAPe@Ê¯õ~¸oìÌÖ¸kÄÐ\\r\\rGK§'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #17
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
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
    //   66: aload #5
    //   68: putstatic burp/Zbz8.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zbz8.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #26
    //   154: goto -> 184
    //   157: bipush #7
    //   159: goto -> 184
    //   162: bipush #39
    //   164: goto -> 184
    //   167: bipush #112
    //   169: goto -> 184
    //   172: bipush #33
    //   174: goto -> 184
    //   177: bipush #59
    //   179: goto -> 184
    //   182: bipush #47
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
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
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x69DE) & 0xFFFF;
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
      byte b1 = 96;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbz8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */