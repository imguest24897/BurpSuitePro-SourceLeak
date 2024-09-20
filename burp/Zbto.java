package burp;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zrzg;
import net.portswigger.Zuh;

class Zbto extends Zbg2 implements Runnable {
  private final Zvoh ZV;
  
  private final Zxei Zy;
  
  private final Zt90 Zn;
  
  private final Zrzg Zd;
  
  private final Zbry ZL;
  
  private volatile boolean ZT = false;
  
  private final StringBuilder Z_ = new StringBuilder();
  
  private Zbup Zr;
  
  private Zl86 Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbto(Zvoh paramZvoh, Zxei paramZxei, Zt90 paramZt90, Zrzg paramZrzg, Zbry paramZbry) {
    this.ZV = paramZvoh;
    this.Zy = paramZxei;
    String str = Zvoh.ZE();
    this.Zn = paramZt90;
    this.Zd = paramZrzg;
    this.ZL = paramZbry;
    Zt();
    this.ZB = new String[] { a(-16879, 24805) };
    this.ZA = new boolean[] { true };
    this.Zh = 0;
    if (str == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void ZC() {
    (new Thread(this)).start();
  }
  
  private void ZM(String paramString) {
    try {
      this.Z_.append(paramString);
      this.Z_.append(Zlb0.Zp);
      String str = this.Z_.toString();
      this.Zg.setText(str);
      this.Zg.setCaretPosition(str.length());
    } catch (Exception exception) {
      Zah.ZA(exception, "", Zk_.UNEXPECTED, true);
    } 
  }
  
  public void run() {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: astore_1
    //   4: iconst_0
    //   5: istore_2
    //   6: invokestatic getWindows : ()[Ljava/awt/Window;
    //   9: astore_3
    //   10: aload_3
    //   11: arraylength
    //   12: istore #4
    //   14: iconst_0
    //   15: istore #5
    //   17: iload #5
    //   19: iload #4
    //   21: if_icmpge -> 75
    //   24: aload_3
    //   25: iload #5
    //   27: aaload
    //   28: astore #6
    //   30: aload #6
    //   32: aload_0
    //   33: getfield ZV : Lburp/Zvoh;
    //   36: invokevirtual ZP : ()Lburp/Zl04;
    //   39: if_acmpne -> 46
    //   42: aload_1
    //   43: ifnonnull -> 68
    //   46: aload #6
    //   48: iconst_0
    //   49: invokevirtual setVisible : (Z)V
    //   52: goto -> 68
    //   55: astore #7
    //   57: aload #7
    //   59: ldc ''
    //   61: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   64: iconst_1
    //   65: invokestatic ZA : (Ljava/lang/Throwable;Ljava/lang/String;Lnet/portswigger/Zk_;Z)V
    //   68: iinc #5, 1
    //   71: aload_1
    //   72: ifnonnull -> 17
    //   75: goto -> 89
    //   78: astore_3
    //   79: aload_3
    //   80: ldc ''
    //   82: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   85: iconst_1
    //   86: invokestatic ZA : (Ljava/lang/Throwable;Ljava/lang/String;Lnet/portswigger/Zk_;Z)V
    //   89: aload_0
    //   90: getfield ZV : Lburp/Zvoh;
    //   93: invokevirtual Zl : ()Lburp/Zxei;
    //   96: astore_3
    //   97: aload_3
    //   98: invokeinterface Zw : ()V
    //   103: aload_0
    //   104: getfield ZL : Lburp/Zbry;
    //   107: invokevirtual Zb : ()Z
    //   110: ifeq -> 200
    //   113: aload_0
    //   114: sipush #-16877
    //   117: sipush #-13270
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: invokevirtual ZM : (Ljava/lang/String;)V
    //   126: new java/util/ArrayList
    //   129: dup
    //   130: invokespecial <init> : ()V
    //   133: astore #4
    //   135: new burp/Zk6
    //   138: dup
    //   139: aload_3
    //   140: invokespecial <init> : (Lburp/Zxei;)V
    //   143: aload #4
    //   145: invokevirtual ZG : (Ljava/util/List;)Z
    //   148: ifeq -> 153
    //   151: iconst_1
    //   152: istore_2
    //   153: aload #4
    //   155: invokeinterface iterator : ()Ljava/util/Iterator;
    //   160: astore #5
    //   162: aload #5
    //   164: invokeinterface hasNext : ()Z
    //   169: ifeq -> 194
    //   172: aload #5
    //   174: invokeinterface next : ()Ljava/lang/Object;
    //   179: checkcast java/lang/String
    //   182: astore #6
    //   184: aload_0
    //   185: aload #6
    //   187: invokevirtual ZM : (Ljava/lang/String;)V
    //   190: aload_1
    //   191: ifnonnull -> 162
    //   194: aload_0
    //   195: ldc ''
    //   197: invokevirtual ZM : (Ljava/lang/String;)V
    //   200: aload_0
    //   201: getfield ZL : Lburp/Zbry;
    //   204: invokevirtual ZQ : ()Z
    //   207: ifeq -> 261
    //   210: aload_0
    //   211: sipush #-16866
    //   214: sipush #2523
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: invokevirtual ZM : (Ljava/lang/String;)V
    //   223: aload_0
    //   224: getfield Zd : Lnet/portswigger/Zrzg;
    //   227: invokevirtual ZY : ()Z
    //   230: ifne -> 255
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   239: athrow
    //   240: aload_0
    //   241: sipush #-16873
    //   244: sipush #-27911
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: invokevirtual ZM : (Ljava/lang/String;)V
    //   253: iconst_1
    //   254: istore_2
    //   255: aload_0
    //   256: ldc ''
    //   258: invokevirtual ZM : (Ljava/lang/String;)V
    //   261: aload_0
    //   262: getfield ZL : Lburp/Zbry;
    //   265: invokevirtual ZZ : ()Z
    //   268: ifeq -> 351
    //   271: aload_0
    //   272: sipush #-16876
    //   275: sipush #-31017
    //   278: invokestatic a : (II)Ljava/lang/String;
    //   281: invokevirtual ZM : (Ljava/lang/String;)V
    //   284: aload_0
    //   285: getfield Zn : Lburp/Zt90;
    //   288: getstatic burp/Zxc8.WIZARD : Lburp/Zxc8;
    //   291: invokeinterface Zr : (Lburp/Zxc8;)Z
    //   296: ifne -> 303
    //   299: iconst_1
    //   300: goto -> 304
    //   303: iconst_0
    //   304: istore #4
    //   306: goto -> 325
    //   309: astore #5
    //   311: aload #5
    //   313: ldc ''
    //   315: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   318: iconst_1
    //   319: invokestatic ZA : (Ljava/lang/Throwable;Ljava/lang/String;Lnet/portswigger/Zk_;Z)V
    //   322: iconst_1
    //   323: istore #4
    //   325: iload #4
    //   327: ifeq -> 345
    //   330: aload_0
    //   331: sipush #-16878
    //   334: sipush #31016
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: invokevirtual ZM : (Ljava/lang/String;)V
    //   343: iconst_1
    //   344: istore_2
    //   345: aload_0
    //   346: ldc ''
    //   348: invokevirtual ZM : (Ljava/lang/String;)V
    //   351: iload_2
    //   352: ifeq -> 379
    //   355: aload_0
    //   356: sipush #-16865
    //   359: sipush #-10575
    //   362: invokestatic a : (II)Ljava/lang/String;
    //   365: invokevirtual ZM : (Ljava/lang/String;)V
    //   368: aload_1
    //   369: ifnonnull -> 399
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   378: athrow
    //   379: aload_0
    //   380: sipush #-16880
    //   383: sipush #6728
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: invokevirtual ZM : (Ljava/lang/String;)V
    //   392: goto -> 399
    //   395: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   398: athrow
    //   399: aload_0
    //   400: iconst_1
    //   401: putfield ZT : Z
    //   404: return
    // Exception table:
    //   from	to	target	type
    //   6	75	78	java/lang/Exception
    //   30	42	55	java/lang/Exception
    //   46	52	55	java/lang/Exception
    //   200	233	236	java/lang/Exception
    //   284	306	309	java/lang/Exception
    //   351	372	375	java/lang/Exception
    //   355	392	395	java/lang/Exception
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        if (!this.ZT && !Zx6o.ZY(this.ZV.ZP(), a(-16875, 4365)))
          return this; 
        this.Zy.ZX(Zmg9.PROJECT_WIZARD_EXITED);
        return null;
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  private void Zt() {
    this.Zr = new Zbup();
    this.Zg = new Zl86();
    setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    setLayout(new BorderLayout());
    this.Zg.setColumns(20);
    this.Zg.setRows(5);
    this.Zr.setViewportView(this.Zg);
    add(this.Zr, a(-16874, 19695));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\t¼tTq$õO³ ·=Æ`ðÿnÏÉ§?èdðíòå6£Ág½ºù-ï+¥-2]K¸¨A¨7¨1é$5¿Asñu×LUh"¶Èùî¸ð¾ñöê8Õ¬|³Íæ­ÓQ`óÅ­ûß£zIPÌ,l$\\t \\nxçÁÃ5Ä­{_\\béòMn~ý4±sËª¸ytÎ¸zUÁ0rôI[¯àmÈcjÅÕÐÜ]\\nÈaÚ'~¯Ò}hnùâ£,ÍD¨»\\b×úAÇÜrãÎ¢=¼-q·w³'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #59
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc 'õp¦hÁòÎkÌÎÕð1â\\n'î:#¡gÅ¢59§§%;Nü5Ò5qX7í\\f-?e½y7'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #28
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #126
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zbto.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbto.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #53
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #16
    //   224: goto -> 244
    //   227: bipush #106
    //   229: goto -> 244
    //   232: bipush #29
    //   234: goto -> 244
    //   237: bipush #102
    //   239: goto -> 244
    //   242: bipush #35
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBE16) & 0xFFFF;
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbto.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */