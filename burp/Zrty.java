package burp;

import java.awt.Graphics2D;
import javax.swing.text.TabExpander;

public class Zrty implements Zep3 {
  private final Zmgn Za;
  
  private final Zmo8 ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrty(Zmgn paramZmgn, Zmo8 paramZmo8) {
    this.Za = paramZmgn;
    this.ZV = paramZmo8;
  }
  
  public float Zn(Zska paramZska, Graphics2D paramGraphics2D, float paramFloat1, float paramFloat2, TabExpander paramTabExpander) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zd : ()[C
    //   4: astore #7
    //   6: aload_1
    //   7: invokevirtual Zl : ()I
    //   10: istore #8
    //   12: iload #8
    //   14: aload_1
    //   15: invokevirtual Za : ()I
    //   18: iadd
    //   19: istore #9
    //   21: iconst_0
    //   22: istore #10
    //   24: iload #8
    //   26: istore #11
    //   28: aload_0
    //   29: getfield Za : Lburp/Zmgn;
    //   32: aload_1
    //   33: invokevirtual ZT : (Lburp/Zska;)Ljava/awt/Color;
    //   36: astore #12
    //   38: invokestatic ZE : ()I
    //   41: aload_2
    //   42: aload_0
    //   43: getfield Za : Lburp/Zmgn;
    //   46: invokevirtual getFont : ()Ljava/awt/Font;
    //   49: invokevirtual setFont : (Ljava/awt/Font;)V
    //   52: aload_0
    //   53: getfield Za : Lburp/Zmgn;
    //   56: invokevirtual Zi : ()Lburp/Zzkh;
    //   59: astore #13
    //   61: istore #6
    //   63: iload #8
    //   65: istore #14
    //   67: iload #14
    //   69: iload #9
    //   71: if_icmpge -> 509
    //   74: aload_0
    //   75: getfield Za : Lburp/Zmgn;
    //   78: invokevirtual ZE : ()Z
    //   81: ifeq -> 266
    //   84: aload #7
    //   86: iload #14
    //   88: caload
    //   89: invokestatic ZN : (C)Z
    //   92: ifeq -> 195
    //   95: aload #13
    //   97: aload #7
    //   99: iload #11
    //   101: iload #10
    //   103: invokeinterface Zo : ([CII)F
    //   108: fstore #15
    //   110: iload #10
    //   112: ifle -> 144
    //   115: aload_2
    //   116: aload #12
    //   118: invokevirtual setColor : (Ljava/awt/Color;)V
    //   121: aload_2
    //   122: new java/lang/String
    //   125: dup
    //   126: aload #7
    //   128: iload #11
    //   130: iload #10
    //   132: invokespecial <init> : ([CII)V
    //   135: fload_3
    //   136: fload #4
    //   138: invokevirtual drawString : (Ljava/lang/String;FF)V
    //   141: iconst_0
    //   142: istore #10
    //   144: fload_3
    //   145: fload #15
    //   147: fadd
    //   148: fstore #16
    //   150: aload #7
    //   152: iload #14
    //   154: caload
    //   155: aload #13
    //   157: invokestatic ZI : (CLburp/Zzkh;)Lburp/Zs5o;
    //   160: astore #17
    //   162: aload_0
    //   163: getfield ZV : Lburp/Zmo8;
    //   166: aload #17
    //   168: fload #16
    //   170: fload #4
    //   172: aload_2
    //   173: invokevirtual ZE : (Lburp/Zs5o;FFLjava/awt/Graphics2D;)F
    //   176: fstore_3
    //   177: iload #14
    //   179: iconst_1
    //   180: iadd
    //   181: istore #11
    //   183: iload #6
    //   185: ifeq -> 501
    //   188: iconst_2
    //   189: anewarray burp/Zbqc
    //   192: invokestatic Zr : ([Lburp/Zbqc;)V
    //   195: aload_0
    //   196: getfield Za : Lburp/Zmgn;
    //   199: invokevirtual Zb : ()Z
    //   202: ifeq -> 258
    //   205: aload_1
    //   206: invokevirtual Zj : ()Z
    //   209: ifeq -> 258
    //   212: aload #7
    //   214: iload #14
    //   216: caload
    //   217: bipush #32
    //   219: if_icmpne -> 258
    //   222: iload #10
    //   224: ifne -> 231
    //   227: iconst_1
    //   228: goto -> 232
    //   231: iconst_0
    //   232: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   235: sipush #1355
    //   238: sipush #16951
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   247: iload #14
    //   249: iconst_1
    //   250: iadd
    //   251: istore #11
    //   253: iload #6
    //   255: ifeq -> 501
    //   258: iinc #10, 1
    //   261: iload #6
    //   263: ifeq -> 501
    //   266: aload_0
    //   267: getfield Za : Lburp/Zmgn;
    //   270: invokevirtual Zb : ()Z
    //   273: ifeq -> 339
    //   276: aload_1
    //   277: invokevirtual Zj : ()Z
    //   280: ifeq -> 339
    //   283: aload #7
    //   285: iload #14
    //   287: caload
    //   288: bipush #32
    //   290: if_icmpeq -> 303
    //   293: aload #7
    //   295: iload #14
    //   297: caload
    //   298: bipush #9
    //   300: if_icmpne -> 339
    //   303: iload #10
    //   305: ifne -> 312
    //   308: iconst_1
    //   309: goto -> 313
    //   312: iconst_0
    //   313: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   316: sipush #1354
    //   319: sipush #26623
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   328: iload #14
    //   330: iconst_1
    //   331: iadd
    //   332: istore #11
    //   334: iload #6
    //   336: ifeq -> 501
    //   339: aload #7
    //   341: iload #14
    //   343: caload
    //   344: bipush #9
    //   346: if_icmpne -> 422
    //   349: aload #13
    //   351: aload #7
    //   353: iload #11
    //   355: iload #10
    //   357: invokeinterface Zo : ([CII)F
    //   362: fstore #15
    //   364: iload #10
    //   366: ifle -> 398
    //   369: aload_2
    //   370: aload #12
    //   372: invokevirtual setColor : (Ljava/awt/Color;)V
    //   375: aload_2
    //   376: new java/lang/String
    //   379: dup
    //   380: aload #7
    //   382: iload #11
    //   384: iload #10
    //   386: invokespecial <init> : ([CII)V
    //   389: fload_3
    //   390: fload #4
    //   392: invokevirtual drawString : (Ljava/lang/String;FF)V
    //   395: iconst_0
    //   396: istore #10
    //   398: aload #5
    //   400: fload_3
    //   401: fload #15
    //   403: fadd
    //   404: iconst_0
    //   405: invokeinterface nextTabStop : (FI)F
    //   410: fstore_3
    //   411: iload #14
    //   413: iconst_1
    //   414: iadd
    //   415: istore #11
    //   417: iload #6
    //   419: ifeq -> 501
    //   422: aload #7
    //   424: iload #14
    //   426: caload
    //   427: invokestatic ZR : (C)Z
    //   430: ifeq -> 498
    //   433: aload #13
    //   435: aload #7
    //   437: iload #11
    //   439: iload #10
    //   441: invokeinterface Zo : ([CII)F
    //   446: fstore #15
    //   448: iload #10
    //   450: ifle -> 482
    //   453: aload_2
    //   454: aload #12
    //   456: invokevirtual setColor : (Ljava/awt/Color;)V
    //   459: aload_2
    //   460: new java/lang/String
    //   463: dup
    //   464: aload #7
    //   466: iload #11
    //   468: iload #10
    //   470: invokespecial <init> : ([CII)V
    //   473: fload_3
    //   474: fload #4
    //   476: invokevirtual drawString : (Ljava/lang/String;FF)V
    //   479: iconst_0
    //   480: istore #10
    //   482: fload_3
    //   483: fload #15
    //   485: fadd
    //   486: fstore_3
    //   487: iload #14
    //   489: iconst_1
    //   490: iadd
    //   491: istore #11
    //   493: iload #6
    //   495: ifeq -> 501
    //   498: iinc #10, 1
    //   501: iinc #14, 1
    //   504: iload #6
    //   506: ifeq -> 67
    //   509: iload #11
    //   511: istore #14
    //   513: iload #10
    //   515: newarray char
    //   517: astore #15
    //   519: iconst_0
    //   520: iload #10
    //   522: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   525: aload #15
    //   527: aload #7
    //   529: iload #14
    //   531: <illegal opcode> accept : ([C[CI)Ljava/util/function/IntConsumer;
    //   536: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   541: aload #13
    //   543: aload #15
    //   545: iconst_0
    //   546: iload #10
    //   548: invokeinterface Zo : ([CII)F
    //   553: fstore #16
    //   555: fload_3
    //   556: fload #16
    //   558: fadd
    //   559: fstore #17
    //   561: iload #10
    //   563: ifle -> 591
    //   566: aload_2
    //   567: aload #12
    //   569: invokevirtual setColor : (Ljava/awt/Color;)V
    //   572: aload_2
    //   573: new java/lang/String
    //   576: dup
    //   577: aload #15
    //   579: iconst_0
    //   580: iload #10
    //   582: invokespecial <init> : ([CII)V
    //   585: fload_3
    //   586: fload #4
    //   588: invokevirtual drawString : (Ljava/lang/String;FF)V
    //   591: fload #17
    //   593: freturn
  }
  
  private static void lambda$paint$0(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2) {
    paramArrayOfchar1[paramInt2] = Zs5o.Zc(paramArrayOfchar2[paramInt2 + paramInt1]) ? '?' : paramArrayOfchar2[paramInt2 + paramInt1];
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'í[pÖ?#òLù³¬(îIBÕ¬.,¡Z*?\\r Ëê\\bW¯Rî¨jîÍ½å)§Xzã_vÌwæ¾aªÂ¥?±Rû÷ú\\rGbôë¤CN`²@c¤ ¨dÊ-âýÛãvÞvÀ,¯~uªÇþ­u®Ó[{XH²vs½G'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #63
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
    //   69: putstatic burp/Zrty.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zrty.b : [Ljava/lang/String;
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
    //   152: bipush #90
    //   154: goto -> 184
    //   157: bipush #51
    //   159: goto -> 184
    //   162: bipush #100
    //   164: goto -> 184
    //   167: bipush #78
    //   169: goto -> 184
    //   172: bipush #105
    //   174: goto -> 184
    //   177: bipush #98
    //   179: goto -> 184
    //   182: bipush #62
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
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x54B) & 0xFFFF;
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
      byte b1 = 4;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */