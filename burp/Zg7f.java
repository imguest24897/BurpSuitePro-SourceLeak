package burp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class Zg7f extends Zghd implements Zzmq {
  private final List<Zi> ZF;
  
  private final String ZI;
  
  private final String Zs;
  
  private String ZR;
  
  private final String ZC;
  
  private final List<Zzat> Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg7f(Zlqb paramZlqb, String paramString1, String paramString2, String paramString3) {
    this(paramZlqb, paramString1, paramString2, paramString3, null, null);
  }
  
  public Zg7f(Zlqb paramZlqb, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    super(paramZlqb);
    this.ZI = paramString1;
    this.Zs = paramString2;
    this.ZR = paramString4;
    this.ZC = paramString5;
    this.ZF = new ArrayList<>(3);
    this.Zp = new ArrayList<>(3);
    Zi(paramString3);
  }
  
  private void Zf(Zi paramZi) {
    this.ZF.add(paramZi);
    if (paramZi instanceof Zkdb && !a(5785, 22148).equals(paramZi.ZV())) {
      Zzat zzat = new Zzat(null, paramZi.ZV());
      this.Zp.add(zzat);
    } 
  }
  
  public String ZG() {
    return this.ZI;
  }
  
  private String ZO(int paramInt, String paramString) {
    Zi zi = this.ZF.get(paramInt);
    String str = zi.ZV();
    if (str.indexOf('\n') > -1)
      str = str.replaceAll("\n", "\n" + paramString); 
    return str;
  }
  
  public String Zn() {
    return null;
  }
  
  public String ZH() {
    return this.ZC;
  }
  
  public String Zq() {
    return this.Zs;
  }
  
  public String Z_() {
    return this.ZR;
  }
  
  public boolean Zl() {
    return false;
  }
  
  public Zeks Zd(JTextComponent paramJTextComponent, boolean paramBoolean) {
    // Byte code:
    //   0: new burp/Zeks
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic ZM : ()[I
    //   12: new java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #5
    //   21: aload_1
    //   22: invokevirtual getCaretPosition : ()I
    //   25: istore #6
    //   27: aconst_null
    //   28: astore #7
    //   30: iconst_m1
    //   31: istore #8
    //   33: astore_3
    //   34: aload_1
    //   35: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   38: iload #6
    //   40: invokeinterface createPosition : (I)Ljavax/swing/text/Position;
    //   45: astore #7
    //   47: goto -> 60
    //   50: astore #9
    //   52: aload #9
    //   54: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   57: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   60: aload #4
    //   62: iload #6
    //   64: aload #7
    //   66: invokevirtual ZC : (ILjavax/swing/text/Position;)V
    //   69: iload #6
    //   71: istore #9
    //   73: iload #9
    //   75: istore #10
    //   77: aload_1
    //   78: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   81: astore #11
    //   83: aload #11
    //   85: checkcast burp/Ze9f
    //   88: iload #6
    //   90: invokestatic ZV : (Lburp/Ze9f;I)Ljava/lang/String;
    //   93: astore #12
    //   95: goto -> 112
    //   98: astore #13
    //   100: aload #13
    //   102: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   105: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   108: ldc ''
    //   110: astore #12
    //   112: iload #6
    //   114: istore #13
    //   116: iconst_0
    //   117: istore #14
    //   119: iload #14
    //   121: aload_0
    //   122: getfield ZF : Ljava/util/List;
    //   125: invokeinterface size : ()I
    //   130: if_icmpge -> 380
    //   133: aload_0
    //   134: getfield ZF : Ljava/util/List;
    //   137: iload #14
    //   139: invokeinterface get : (I)Ljava/lang/Object;
    //   144: checkcast burp/Zi
    //   147: astore #15
    //   149: aload_0
    //   150: iload #14
    //   152: aload #12
    //   154: invokevirtual ZO : (ILjava/lang/String;)Ljava/lang/String;
    //   157: astore #16
    //   159: aload #15
    //   161: instanceof burp/Zzl
    //   164: ifeq -> 217
    //   167: iload_2
    //   168: ifeq -> 195
    //   171: goto -> 178
    //   174: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   177: athrow
    //   178: aload_0
    //   179: aload #5
    //   181: aload #16
    //   183: aload_1
    //   184: iload #13
    //   186: invokevirtual ZV : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljavax/swing/text/JTextComponent;I)I
    //   189: istore #13
    //   191: aload_3
    //   192: ifnonnull -> 373
    //   195: aload #5
    //   197: aload #16
    //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: iload #13
    //   205: aload #16
    //   207: invokevirtual length : ()I
    //   210: iadd
    //   211: istore #13
    //   213: aload_3
    //   214: ifnonnull -> 373
    //   217: aload #15
    //   219: instanceof burp/Zkdb
    //   222: ifeq -> 264
    //   225: goto -> 232
    //   228: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   231: athrow
    //   232: sipush #5786
    //   235: sipush #30638
    //   238: invokestatic a : (II)Ljava/lang/String;
    //   241: aload #16
    //   243: invokevirtual equals : (Ljava/lang/Object;)Z
    //   246: ifeq -> 264
    //   249: goto -> 256
    //   252: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   255: athrow
    //   256: iload #13
    //   258: istore #8
    //   260: aload_3
    //   261: ifnonnull -> 373
    //   264: iload #13
    //   266: aload #16
    //   268: invokevirtual length : ()I
    //   271: iadd
    //   272: istore #17
    //   274: aload #5
    //   276: aload #16
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: pop
    //   282: aload #15
    //   284: instanceof burp/Zkdb
    //   287: ifeq -> 331
    //   290: aload #4
    //   292: iload #13
    //   294: iload #17
    //   296: invokevirtual Zk : (II)V
    //   299: iload #9
    //   301: iload #6
    //   303: if_icmpne -> 369
    //   306: goto -> 313
    //   309: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   312: athrow
    //   313: iload #13
    //   315: istore #9
    //   317: iload #9
    //   319: aload #16
    //   321: invokevirtual length : ()I
    //   324: iadd
    //   325: istore #10
    //   327: aload_3
    //   328: ifnonnull -> 369
    //   331: aload #15
    //   333: instanceof burp/Zq8
    //   336: ifeq -> 369
    //   339: goto -> 346
    //   342: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   345: athrow
    //   346: aload #4
    //   348: aload #15
    //   350: invokeinterface ZV : ()Ljava/lang/String;
    //   355: iload #13
    //   357: iload #17
    //   359: invokevirtual ZB : (Ljava/lang/String;II)V
    //   362: goto -> 369
    //   365: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   368: athrow
    //   369: iload #17
    //   371: istore #13
    //   373: iinc #14, 1
    //   376: aload_3
    //   377: ifnonnull -> 119
    //   380: iload #9
    //   382: iload #6
    //   384: if_icmpne -> 435
    //   387: iload #9
    //   389: iload #10
    //   391: if_icmpne -> 435
    //   394: goto -> 401
    //   397: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   400: athrow
    //   401: aload_0
    //   402: invokevirtual ZR : ()I
    //   405: ifne -> 435
    //   408: goto -> 415
    //   411: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   414: athrow
    //   415: iload #8
    //   417: iconst_m1
    //   418: if_icmple -> 435
    //   421: goto -> 428
    //   424: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   427: athrow
    //   428: iload #8
    //   430: dup
    //   431: istore #10
    //   433: istore #9
    //   435: aload #4
    //   437: iload #9
    //   439: iload #10
    //   441: invokevirtual Zb : (II)V
    //   444: iload #8
    //   446: iconst_m1
    //   447: if_icmple -> 466
    //   450: aload #4
    //   452: iload #8
    //   454: iload #8
    //   456: invokevirtual Zk : (II)V
    //   459: goto -> 466
    //   462: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   465: athrow
    //   466: aload #4
    //   468: iload #8
    //   470: invokevirtual ZL : (I)V
    //   473: aload #4
    //   475: aload #5
    //   477: invokevirtual toString : ()Ljava/lang/String;
    //   480: invokevirtual ZU : (Ljava/lang/String;)V
    //   483: aload #4
    //   485: areturn
    // Exception table:
    //   from	to	target	type
    //   34	47	50	javax/swing/text/BadLocationException
    //   83	95	98	javax/swing/text/BadLocationException
    //   159	171	174	javax/swing/text/BadLocationException
    //   213	225	228	javax/swing/text/BadLocationException
    //   217	249	252	javax/swing/text/BadLocationException
    //   274	306	309	javax/swing/text/BadLocationException
    //   327	339	342	javax/swing/text/BadLocationException
    //   331	362	365	javax/swing/text/BadLocationException
    //   380	394	397	javax/swing/text/BadLocationException
    //   387	408	411	javax/swing/text/BadLocationException
    //   401	421	424	javax/swing/text/BadLocationException
    //   435	459	462	javax/swing/text/BadLocationException
  }
  
  public Zzat ZD(int paramInt) {
    return this.Zp.get(paramInt);
  }
  
  public int ZR() {
    return (this.Zp == null) ? 0 : this.Zp.size();
  }
  
  private boolean ZO(String paramString) {
    int[] arrayOfInt = Zghd.ZM();
    byte b = 0;
    while (b < ZR()) {
      Zzat zzat = ZD(b);
      if (paramString.equals(zzat.ZG()))
        return true; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return false;
  }
  
  private void Zi(String paramString) {
    int[] arrayOfInt = Zghd.ZM();
    int j = 0;
    int i;
    while ((i = paramString.indexOf('$', j)) > -1 && i < paramString.length() - 1) {
      int k;
      char c = paramString.charAt(i + 1);
      switch (c) {
        case '$':
          Zf(new Zzl(paramString.substring(j, i + 1)));
          j = i + 2;
        case '{':
          k = paramString.indexOf('}', i + 2);
      } 
      continue;
      if (arrayOfInt == null)
        break; 
    } 
    if (j < paramString.length()) {
      String str = paramString.substring(j);
      Zf(new Zzl(str));
    } 
  }
  
  private int ZV(StringBuilder paramStringBuilder, String paramString, JTextComponent paramJTextComponent, int paramInt) {
    int[] arrayOfInt = Zghd.ZM();
    int i = paramString.indexOf('\t');
    if (i > -1) {
      int j = paramStringBuilder.length();
      int k = 4;
      Document document = paramJTextComponent.getDocument();
      if (document != null) {
        Integer integer = (Integer)document.getProperty(a(5784, 8137));
        if (integer != null)
          k = integer.intValue(); 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(" ".repeat(Math.max(0, k)));
      String str = stringBuilder.toString();
      int m = 0;
      do {
        paramStringBuilder.append(paramString, m, i);
        paramStringBuilder.append(str);
        m = i + 1;
      } while ((i = paramString.indexOf('\t', m)) > -1);
      paramStringBuilder.append(paramString.substring(m));
      paramInt += paramStringBuilder.length() - j;
      if (arrayOfInt == null) {
        paramStringBuilder.append(paramString);
        paramInt += paramString.length();
        return paramInt;
      } 
      return paramInt;
    } 
    paramStringBuilder.append(paramString);
    paramInt += paramString.length();
    return paramInt;
  }
  
  public String toString() {
    return Zq();
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '7îOöÙKÖÁ(èÂb'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #67
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
    //   69: putstatic burp/Zg7f.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zg7f.b : [Ljava/lang/String;
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
    //   152: bipush #100
    //   154: goto -> 184
    //   157: bipush #18
    //   159: goto -> 184
    //   162: bipush #55
    //   164: goto -> 184
    //   167: bipush #105
    //   169: goto -> 184
    //   172: bipush #65
    //   174: goto -> 184
    //   177: bipush #90
    //   179: goto -> 184
    //   182: bipush #96
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
    int i = (paramInt1 ^ 0x1698) & 0xFFFF;
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
      char c = 'å';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg7f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */