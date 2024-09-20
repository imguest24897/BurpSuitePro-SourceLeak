package burp;

import java.awt.Component;
import java.io.File;
import java.util.function.Function;
import net.portswigger.Zkb;
import net.portswigger.Zl0;

public class Zx_d {
  private final Zmo9 Zf;
  
  private final Zl0 ZH;
  
  private final Zt4u ZA;
  
  private final Zkr6 ZG;
  
  private final Zbyn Zl;
  
  private final Zmuy ZR;
  
  private final Zskh ZZ;
  
  private final Function<Integer, String> Zk;
  
  private final Zbws ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zx_d(Zmo9 paramZmo9, Zl0 paramZl0, Zt4u paramZt4u, Zkr6 paramZkr6, Zbyn paramZbyn, Zmuy paramZmuy, Zskh paramZskh, Function<Integer, String> paramFunction, Zbws paramZbws) {
    this.Zf = paramZmo9;
    this.ZH = paramZl0;
    this.ZA = paramZt4u;
    this.ZG = paramZkr6;
    this.Zl = paramZbyn;
    this.ZR = paramZmuy;
    this.ZZ = paramZskh;
    this.Zk = paramFunction;
    this.ZX = paramZbws;
  }
  
  public void Zg(Component paramComponent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZR : Lburp/Zmuy;
    //   4: invokevirtual ZC : ()I
    //   7: anewarray java/lang/String
    //   10: astore_3
    //   11: invokestatic Zw : ()Z
    //   14: iconst_0
    //   15: istore #4
    //   17: istore_2
    //   18: iload #4
    //   20: aload_3
    //   21: arraylength
    //   22: if_icmpge -> 53
    //   25: aload_3
    //   26: iload #4
    //   28: aload_0
    //   29: getfield Zk : Ljava/util/function/Function;
    //   32: iload #4
    //   34: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   37: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   42: checkcast java/lang/String
    //   45: aastore
    //   46: iinc #4, 1
    //   49: iload_2
    //   50: ifeq -> 18
    //   53: aload_1
    //   54: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   57: astore #4
    //   59: aload_0
    //   60: getfield Zf : Lburp/Zmo9;
    //   63: aload #4
    //   65: aload_3
    //   66: aload_0
    //   67: getfield ZR : Lburp/Zmuy;
    //   70: invokeinterface Zn : (Ljava/awt/Window;[Ljava/lang/String;Lburp/Zmuy;)Lburp/Zr76;
    //   75: astore #5
    //   77: aload #5
    //   79: iconst_1
    //   80: invokevirtual setVisible : (Z)V
    //   83: aload #5
    //   85: invokevirtual ZZ : ()Z
    //   88: ifeq -> 522
    //   91: getstatic burp/Zze0.INTRUDER_EXPORT_CSV : Lburp/Zze0;
    //   94: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   97: aload_0
    //   98: getfield Zf : Lburp/Zmo9;
    //   101: aload_0
    //   102: getfield ZA : Lburp/Zt4u;
    //   105: aload #4
    //   107: invokeinterface Zu : (Lburp/Zt4u;Ljava/awt/Window;)Ljava/io/File;
    //   112: astore #6
    //   114: aload #6
    //   116: ifnull -> 522
    //   119: new java/io/BufferedOutputStream
    //   122: dup
    //   123: aload_0
    //   124: getfield ZH : Lnet/portswigger/Zl0;
    //   127: aload #6
    //   129: invokeinterface Zp : (Ljava/io/File;)Ljava/io/OutputStream;
    //   134: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   137: astore #7
    //   139: aload #5
    //   141: invokevirtual Zd : ()[B
    //   144: astore #8
    //   146: iconst_1
    //   147: istore #9
    //   149: aload #5
    //   151: invokevirtual Zw : ()[Z
    //   154: astore #10
    //   156: aload #5
    //   158: invokevirtual Zy : ()Z
    //   161: ifeq -> 242
    //   164: iconst_0
    //   165: istore #11
    //   167: iload #11
    //   169: aload_3
    //   170: arraylength
    //   171: if_icmpge -> 234
    //   174: aload #10
    //   176: iload #11
    //   178: baload
    //   179: ifeq -> 227
    //   182: iload #9
    //   184: ifeq -> 201
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   193: athrow
    //   194: iconst_0
    //   195: istore #9
    //   197: iload_2
    //   198: ifeq -> 215
    //   201: aload #7
    //   203: aload #8
    //   205: invokevirtual write : ([B)V
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: aload #7
    //   217: aload_3
    //   218: iload #11
    //   220: aaload
    //   221: invokestatic Zy : (Ljava/lang/String;)[B
    //   224: invokevirtual write : ([B)V
    //   227: iinc #11, 1
    //   230: iload_2
    //   231: ifeq -> 167
    //   234: aload #7
    //   236: getstatic burp/Zlb0.Zk : [B
    //   239: invokevirtual write : ([B)V
    //   242: aload #5
    //   244: invokevirtual ZQ : ()Z
    //   247: istore #11
    //   249: aload #5
    //   251: invokevirtual Zu : ()Z
    //   254: istore #12
    //   256: iconst_0
    //   257: istore #13
    //   259: iload #13
    //   261: aload_0
    //   262: getfield ZR : Lburp/Zmuy;
    //   265: invokevirtual getRowCount : ()I
    //   268: if_icmpge -> 425
    //   271: iload #11
    //   273: ifne -> 295
    //   276: aload_0
    //   277: getfield ZX : Lburp/Zbws;
    //   280: iload #13
    //   282: invokevirtual isRowSelected : (I)Z
    //   285: ifeq -> 418
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   294: athrow
    //   295: aload_0
    //   296: getfield ZX : Lburp/Zbws;
    //   299: iload #13
    //   301: invokevirtual convertRowIndexToModel : (I)I
    //   304: istore #14
    //   306: iconst_1
    //   307: istore #9
    //   309: iconst_0
    //   310: istore #15
    //   312: iload #15
    //   314: aload_3
    //   315: arraylength
    //   316: if_icmpge -> 382
    //   319: aload #10
    //   321: iload #15
    //   323: baload
    //   324: ifeq -> 375
    //   327: iload #9
    //   329: ifeq -> 346
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   338: athrow
    //   339: iconst_0
    //   340: istore #9
    //   342: iload_2
    //   343: ifeq -> 360
    //   346: aload #7
    //   348: aload #8
    //   350: invokevirtual write : ([B)V
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   359: athrow
    //   360: aload #7
    //   362: aload_0
    //   363: iload #14
    //   365: iload #15
    //   367: iload #12
    //   369: invokevirtual Zn : (IIZ)[B
    //   372: invokevirtual write : ([B)V
    //   375: iinc #15, 1
    //   378: iload_2
    //   379: ifeq -> 312
    //   382: goto -> 410
    //   385: astore #15
    //   387: aload #15
    //   389: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   392: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   395: getstatic burp/Zmgc.SAVE_FAILURE : Lburp/Zmgc;
    //   398: aload_0
    //   399: getfield ZZ : Lburp/Zskh;
    //   402: iconst_0
    //   403: anewarray java/lang/Object
    //   406: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   409: pop
    //   410: aload #7
    //   412: getstatic burp/Zlb0.Zk : [B
    //   415: invokevirtual write : ([B)V
    //   418: iinc #13, 1
    //   421: iload_2
    //   422: ifeq -> 259
    //   425: aload #7
    //   427: invokevirtual close : ()V
    //   430: goto -> 522
    //   433: astore #7
    //   435: aload #7
    //   437: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   440: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   443: getstatic burp/Zmgc.ERROR_CREATING_FILE : Lburp/Zmgc;
    //   446: aload_0
    //   447: getfield ZZ : Lburp/Zskh;
    //   450: iconst_1
    //   451: anewarray java/lang/Object
    //   454: dup
    //   455: iconst_0
    //   456: aload #6
    //   458: invokevirtual getPath : ()Ljava/lang/String;
    //   461: aastore
    //   462: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   465: pop
    //   466: goto -> 522
    //   469: astore #7
    //   471: aload #7
    //   473: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   476: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   479: getstatic burp/Zmgc.SAVE_FAILURE : Lburp/Zmgc;
    //   482: aload_0
    //   483: getfield ZZ : Lburp/Zskh;
    //   486: iconst_0
    //   487: anewarray java/lang/Object
    //   490: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   493: pop
    //   494: goto -> 522
    //   497: astore #7
    //   499: aload #7
    //   501: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   504: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   507: getstatic burp/Zmgc.SAVE_FAILURE : Lburp/Zmgc;
    //   510: aload_0
    //   511: getfield ZZ : Lburp/Zskh;
    //   514: iconst_0
    //   515: anewarray java/lang/Object
    //   518: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   521: pop
    //   522: return
    // Exception table:
    //   from	to	target	type
    //   119	430	433	java/io/FileNotFoundException
    //   119	430	469	java/io/IOException
    //   119	430	497	java/lang/Exception
    //   174	187	190	java/lang/Exception
    //   197	208	211	java/lang/Exception
    //   271	288	291	java/lang/Exception
    //   306	382	385	java/lang/Exception
    //   319	332	335	java/lang/Exception
    //   342	353	356	java/lang/Exception
  }
  
  private byte[] Zn(int paramInt1, int paramInt2, boolean paramBoolean) {
    String str = this.ZR.ZK(paramInt1, paramInt2, true).toString();
    return Zkb.Zy(paramBoolean ? Zr(str) : str);
  }
  
  private String Zr(String paramString) {
    return String.format(a(-31593, -29736), new Object[] { paramString.replace("\"", a(-31596, -30316)) });
  }
  
  public Zg1r ZM(Component paramComponent) {
    Zby0 zby0 = this.Zf.ZI();
    File file = this.Zf.Ze(this.ZA, paramComponent, zby0);
    if (file == null)
      return null; 
    boolean bool = zby0.ZP();
    if (!bool && !Zs6n.Zb(file)) {
      this.Zf.ZG(paramComponent, a(-31594, 28207), a(-31595, -27013));
      return null;
    } 
    Zg1r zg1r = new Zg1r(file, this.ZR, Zt2m.ZF(paramComponent), bool, this.ZZ, this.ZH);
    zg1r.ZQ();
    return zg1r;
  }
  
  public void ZY(Component paramComponent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zx_d;Ljava/awt/Component;)Ljava/lang/Runnable;
    //   7: invokestatic Zi : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$saveConfig$0(Component paramComponent) {
    this.ZG.ZP(this.Zl, true, paramComponent);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '»±$*<BßtÐKM3-½h_íÉJÿZùzjuq£õ§'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #77
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
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
    //   66: ldc 'U5ay£ñ\\tÌp*'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #7
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #59
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
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
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zx_d.a : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zx_d.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 255
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 237, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 232
    //   208: bipush #34
    //   210: goto -> 239
    //   213: bipush #53
    //   215: goto -> 239
    //   218: bipush #28
    //   220: goto -> 239
    //   223: bipush #6
    //   225: goto -> 239
    //   228: iconst_5
    //   229: goto -> 239
    //   232: bipush #102
    //   234: goto -> 239
    //   237: bipush #90
    //   239: ixor
    //   240: ixor
    //   241: i2c
    //   242: castore
    //   243: iinc #6, 1
    //   246: dup
    //   247: ifne -> 255
    //   250: dup2
    //   251: dup_x1
    //   252: goto -> 163
    //   255: dup2_x1
    //   256: pop2
    //   257: dup_x2
    //   258: iload #6
    //   260: if_icmpgt -> 159
    //   263: pop
    //   264: new java/lang/String
    //   267: dup_x1
    //   268: swap
    //   269: invokespecial <init> : ([C)V
    //   272: invokevirtual intern : ()Ljava/lang/String;
    //   275: swap
    //   276: pop
    //   277: swap
    //   278: tableswitch default -> 38, 0 -> 97
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8494) & 0xFFFF;
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
      byte b1 = 51;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */