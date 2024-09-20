package net.portswigger.browser;

import burp.Zbqc;
import java.util.List;
import java.util.Objects;
import net.portswigger.Zi7;

public class Zjp {
  private static final List<Zcn<?>> ZQ;
  
  private final String Zg;
  
  private final String ZC;
  
  private final String Zn;
  
  private final String ZU;
  
  private final String ZH;
  
  private final String ZP;
  
  private final List<String> Zu;
  
  private final String Zz;
  
  private final String ZB;
  
  private final int Zo;
  
  private final boolean ZO;
  
  private final Zjp Zk;
  
  private final String ZM;
  
  private static Zbqc[] Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zjp(Zdp paramZdp) {
    this.Zg = paramZdp.Zd;
    this.ZC = paramZdp.ZL;
    this.Zn = paramZdp.Zt;
    this.ZU = paramZdp.ZX;
    this.ZH = paramZdp.ZY;
    this.ZP = paramZdp.Zk;
    this.Zu = paramZdp.ZP;
    this.Zz = paramZdp.ZG;
    this.ZB = paramZdp.ZM;
    this.Zo = paramZdp.ZC;
    this.ZO = paramZdp.Z_;
    this.Zk = paramZdp.ZW;
    this.ZM = paramZdp.ZD;
  }
  
  public String Zl() {
    return this.Zg;
  }
  
  public String Zp() {
    return this.ZC;
  }
  
  public String Zm() {
    return this.Zn;
  }
  
  public String ZO() {
    return this.ZU;
  }
  
  public String Zd() {
    return this.ZH;
  }
  
  public String ZG() {
    return this.ZP;
  }
  
  public List<String> ZL() {
    return this.Zu;
  }
  
  public String Zv() {
    return this.Zz;
  }
  
  public String Zy() {
    return this.ZB;
  }
  
  public int Z_() {
    return this.Zo;
  }
  
  public boolean Zi() {
    return this.ZO;
  }
  
  public Zjp Zu() {
    return this.Zk;
  }
  
  public String Zn() {
    return this.ZM;
  }
  
  public String toString() {
    Zbqc[] arrayOfZbqc = Za();
    String str1 = this.ZM;
    String str2 = String.valueOf(this.Zk);
    int i = this.Zo;
    String str3 = this.ZB;
    String str4 = this.Zz;
    String str5 = String.valueOf(this.Zu);
    String str6 = this.ZP;
    String str7 = this.ZH;
    String str8 = this.ZU;
    String str9 = this.Zn;
    String str10 = this.ZC;
    String str11 = this.Zg;
    if (Zbqc.Zwu() == null)
      ZH(new Zbqc[4]); 
    return a(-27201, -25617) + a(-27201, -25617) + str11 + a(-27231, 25060) + str10 + a(-27219, -2455) + str9 + a(-27213, -28364) + str8 + a(-27232, 1833) + str7 + a(-27222, -27082) + str6 + a(-27218, -9160) + str5 + a(-27228, 8658) + str4 + a(-27209, 32559) + str3 + a(-27223, -12574) + i + a(-27224, 449) + str2 + a(-27202, -19871) + str1;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zjp zjp = (Zjp)paramObject;
    return (this.Zo == zjp.Zo && this.ZO == zjp.ZO && Objects.equals(this.Zg, zjp.Zg) && Objects.equals(this.ZC, zjp.ZC) && Objects.equals(this.Zn, zjp.Zn) && Objects.equals(this.ZU, zjp.ZU) && Objects.equals(this.ZH, zjp.ZH) && Objects.equals(this.ZP, zjp.ZP) && Objects.equals(this.Zu, zjp.Zu) && Objects.equals(this.Zz, zjp.Zz) && Objects.equals(this.ZB, zjp.ZB) && Objects.equals(this.Zk, zjp.Zk) && Objects.equals(this.ZM, zjp.ZM));
  }
  
  public Zi7 Zf(Zi7 paramZi7) {
    // Byte code:
    //   0: getstatic net/portswigger/browser/Zjp.ZQ : Ljava/util/List;
    //   3: aload_0
    //   4: aload_1
    //   5: <illegal opcode> accept : (Lnet/portswigger/browser/Zjp;Lnet/portswigger/Zi7;)Ljava/util/function/Consumer;
    //   10: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   15: aload_1
    //   16: areturn
  }
  
  public static Zjp ZD(Zi7 paramZi7) {
    Zdp zdp = Zdp.Zc();
    Zbqc[] arrayOfZbqc = Za();
    boolean bool = false;
    for (Zcn<?> zcn : ZQ) {
      if (zcn.ZU(paramZi7)) {
        zcn.Zi(zdp, paramZi7);
        bool = true;
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    return bool ? zdp.ZU() : null;
  }
  
  private void lambda$buildJson$0(Zi7 paramZi7, Zcn paramZcn) {
    if (paramZcn.Zu(this))
      paramZcn.Zs(this, paramZi7); 
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '`'+Çìq`Ó7Y\\rÇ4Lê©³/U²ÿF\\tð.}ÖúPÎÁCãsúfep\\nËíb[Øzÿf\\tbdÃÝ/\\tµqTìÄï\\fõ¹\\n$PÛSpp0i)Á¢å\\t<àrNÔP(\\nû3ëXª]Rî4è:¥Ó|C³2y »>,´aYïPöõµ1q­<!y@oüy¿Ú|#ÇT"8xÍnxK\\fÁî¬ïs DÛiè/ÎHÔ{o=zr#Øø1¶$Bª½ÄJÿ#T\\rUÃ«\\fÔò°³É¡ k¹sÆ¸¯¢'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: iconst_5
    //   20: istore_1
    //   21: invokestatic ZH : ([Lburp/Zbqc;)V
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #41
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
    //   71: ldc 'ÍÍ¥k£ï.Pù¸»éÊ%lÔjudÏ,íaåñÝõ'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #14
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #122
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
    //   132: putstatic net/portswigger/browser/Zjp.a : [Ljava/lang/String;
    //   135: bipush #26
    //   137: anewarray java/lang/String
    //   140: putstatic net/portswigger/browser/Zjp.b : [Ljava/lang/String;
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
    //   216: bipush #96
    //   218: goto -> 248
    //   221: bipush #20
    //   223: goto -> 248
    //   226: bipush #119
    //   228: goto -> 248
    //   231: bipush #97
    //   233: goto -> 248
    //   236: bipush #65
    //   238: goto -> 248
    //   241: bipush #96
    //   243: goto -> 248
    //   246: bipush #13
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
    //   304: bipush #13
    //   306: anewarray net/portswigger/browser/Zcn
    //   309: dup
    //   310: iconst_0
    //   311: new net/portswigger/browser/Zcs
    //   314: dup
    //   315: sipush #-27212
    //   318: sipush #-7885
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   329: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   334: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   337: aastore
    //   338: dup
    //   339: iconst_1
    //   340: new net/portswigger/browser/Zcs
    //   343: dup
    //   344: sipush #-27227
    //   347: sipush #-32373
    //   350: invokestatic a : (II)Ljava/lang/String;
    //   353: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   358: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   363: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   366: aastore
    //   367: dup
    //   368: iconst_2
    //   369: new net/portswigger/browser/Zcs
    //   372: dup
    //   373: sipush #-27210
    //   376: sipush #-19106
    //   379: invokestatic a : (II)Ljava/lang/String;
    //   382: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   387: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   392: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   395: aastore
    //   396: dup
    //   397: iconst_3
    //   398: new net/portswigger/browser/Zcs
    //   401: dup
    //   402: sipush #-27215
    //   405: sipush #-10811
    //   408: invokestatic a : (II)Ljava/lang/String;
    //   411: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   416: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   421: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   424: aastore
    //   425: dup
    //   426: iconst_4
    //   427: new net/portswigger/browser/Zcs
    //   430: dup
    //   431: sipush #-27214
    //   434: sipush #-14708
    //   437: invokestatic a : (II)Ljava/lang/String;
    //   440: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   445: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   450: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   453: aastore
    //   454: dup
    //   455: iconst_5
    //   456: new net/portswigger/browser/Zcw
    //   459: dup
    //   460: sipush #-27220
    //   463: sipush #20376
    //   466: invokestatic a : (II)Ljava/lang/String;
    //   469: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   474: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   479: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   482: aastore
    //   483: dup
    //   484: bipush #6
    //   486: new net/portswigger/browser/Zcs
    //   489: dup
    //   490: sipush #-27226
    //   493: sipush #-32313
    //   496: invokestatic a : (II)Ljava/lang/String;
    //   499: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   504: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   509: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   512: aastore
    //   513: dup
    //   514: bipush #7
    //   516: new net/portswigger/browser/Zcs
    //   519: dup
    //   520: sipush #-27229
    //   523: sipush #-28051
    //   526: invokestatic a : (II)Ljava/lang/String;
    //   529: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   534: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   539: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   542: aastore
    //   543: dup
    //   544: bipush #8
    //   546: new net/portswigger/browser/Zcs
    //   549: dup
    //   550: sipush #-27225
    //   553: sipush #7270
    //   556: invokestatic a : (II)Ljava/lang/String;
    //   559: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   564: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   569: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   572: aastore
    //   573: dup
    //   574: bipush #9
    //   576: new net/portswigger/browser/Zcj
    //   579: dup
    //   580: sipush #-27211
    //   583: sipush #23497
    //   586: invokestatic a : (II)Ljava/lang/String;
    //   589: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   594: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   599: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   602: aastore
    //   603: dup
    //   604: bipush #10
    //   606: new net/portswigger/browser/Zcp
    //   609: dup
    //   610: sipush #-27217
    //   613: sipush #-18235
    //   616: invokestatic a : (II)Ljava/lang/String;
    //   619: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   624: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   629: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   632: aastore
    //   633: dup
    //   634: bipush #11
    //   636: new net/portswigger/browser/Zcg
    //   639: dup
    //   640: sipush #-27216
    //   643: sipush #19089
    //   646: invokestatic a : (II)Ljava/lang/String;
    //   649: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   654: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   659: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   662: aastore
    //   663: dup
    //   664: bipush #12
    //   666: new net/portswigger/browser/Zcs
    //   669: dup
    //   670: sipush #-27230
    //   673: sipush #-27228
    //   676: invokestatic a : (II)Ljava/lang/String;
    //   679: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   684: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   689: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   692: aastore
    //   693: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   696: putstatic net/portswigger/browser/Zjp.ZQ : Ljava/util/List;
    //   699: return
  }
  
  public static void ZH(Zbqc[] paramArrayOfZbqc) {
    Zr = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Za() {
    return Zr;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF95A6) & 0xFFFF;
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
      byte b1 = 92;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zjp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */