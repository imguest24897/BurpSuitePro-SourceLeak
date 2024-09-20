package burp;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zco;

class Zean {
  private final Zg94 Ze;
  
  private final Zrk_ Zr;
  
  private final Zz0n Zx;
  
  private final Zgb6 Zm;
  
  private final Ztyg ZN;
  
  private final Zgq7 Zv;
  
  private final Zco Zp;
  
  private final Zbnt ZG;
  
  private final Zsvy ZB;
  
  private final Zr_4 Zo;
  
  private final Zxg0 Zg;
  
  private final Zl4y ZU;
  
  private final Zmde Zt;
  
  private final Zey9 ZL;
  
  private final Zeos ZQ;
  
  private final Zxrg Zi;
  
  private Zs1u ZK;
  
  private Ztrw Zz;
  
  private Zx0r Zu;
  
  private Zzc1 ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zean(Zg94 paramZg94, Zrk_ paramZrk_, Zz0n paramZz0n, Zgb6 paramZgb6, Ztyg paramZtyg, Zgq7 paramZgq7, Zco paramZco, Zxg0 paramZxg0, Zbnt paramZbnt, Zsvy paramZsvy, Zr_4 paramZr_4, Zey9 paramZey9, Zeos paramZeos, Zxrg paramZxrg, Zmde paramZmde) {
    this.Ze = paramZg94;
    this.Zr = paramZrk_;
    this.Zx = paramZz0n;
    this.Zm = paramZgb6;
    this.ZN = paramZtyg;
    this.Zv = paramZgq7;
    this.Zp = paramZco;
    this.Zg = paramZxg0;
    this.ZG = paramZbnt;
    this.ZB = paramZsvy;
    this.Zo = paramZr_4;
    this.ZL = paramZey9;
    this.ZQ = paramZeos;
    this.Zi = paramZxrg;
    Objects.requireNonNull(paramZgb6);
    Objects.requireNonNull(paramZgb6);
    this.ZU = new Zl4y(paramZgb6::ZU0, paramZgb6::ZI);
    this.Zt = paramZmde;
  }
  
  Zm0o[] Zw() {
    // Byte code:
    //   0: new burp/Zrw8
    //   3: dup
    //   4: aload_0
    //   5: getfield Ze : Lburp/Zg94;
    //   8: invokeinterface ZI : ()Lburp/Zefg;
    //   13: aload_0
    //   14: getfield ZU : Lburp/Zl4y;
    //   17: dup
    //   18: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   21: pop
    //   22: <illegal opcode> accept : (Lburp/Zl4y;)Ljava/util/function/Consumer;
    //   27: aload_0
    //   28: getfield Zt : Lburp/Zmde;
    //   31: invokespecial <init> : (Lburp/Zefg;Ljava/util/function/Consumer;Lburp/Zmpi;)V
    //   34: astore_2
    //   35: new burp/Zboz
    //   38: dup
    //   39: aload_2
    //   40: aload_0
    //   41: getfield Zm : Lburp/Zgb6;
    //   44: aload_0
    //   45: getfield ZG : Lburp/Zbnt;
    //   48: aload_0
    //   49: getfield Zo : Lburp/Zr_4;
    //   52: invokespecial <init> : (Lburp/Zkkf;Lburp/Zgb6;Lburp/Zbnt;Lburp/Zr_4;)V
    //   55: astore_3
    //   56: invokestatic Z_ : ()[I
    //   59: new burp/Zlr_
    //   62: dup
    //   63: aload_0
    //   64: getfield Ze : Lburp/Zg94;
    //   67: invokespecial <init> : (Lburp/Zg94;)V
    //   70: astore #4
    //   72: new java/util/concurrent/atomic/AtomicReference
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: astore #5
    //   81: new burp/Zrdz
    //   84: dup
    //   85: invokespecial <init> : ()V
    //   88: astore #6
    //   90: aload_0
    //   91: aload #6
    //   93: aload_3
    //   94: aload #5
    //   96: <illegal opcode> ZS : (Lburp/Zean;Lburp/Zrdz;Lburp/Zboz;Ljava/util/concurrent/atomic/AtomicReference;)Lburp/Zshe;
    //   101: astore #7
    //   103: aload_0
    //   104: getfield ZQ : Lburp/Zeos;
    //   107: aload #7
    //   109: invokevirtual Zn : (Lburp/Zshe;)V
    //   112: new burp/Zl1t
    //   115: dup
    //   116: aload_0
    //   117: getfield Zr : Lburp/Zrk_;
    //   120: aload_0
    //   121: getfield ZQ : Lburp/Zeos;
    //   124: dup
    //   125: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: <illegal opcode> ZJ : (Lburp/Zeos;)Lburp/Zbqs;
    //   134: aload_0
    //   135: getfield Zx : Lburp/Zz0n;
    //   138: invokeinterface Zj : ()Lburp/Ztwv;
    //   143: aload_0
    //   144: getfield Zm : Lburp/Zgb6;
    //   147: invokespecial <init> : (Lburp/Zrk_;Lburp/Zbqs;Lburp/Ztwv;Lburp/Zgb6;)V
    //   150: astore #8
    //   152: new burp/Zg13
    //   155: dup
    //   156: aload_0
    //   157: getfield Zm : Lburp/Zgb6;
    //   160: invokespecial <init> : (Lburp/Zgb6;)V
    //   163: astore #9
    //   165: astore_1
    //   166: aload_0
    //   167: new burp/Zzc1
    //   170: dup
    //   171: aload_0
    //   172: getfield Zp : Lnet/portswigger/Zco;
    //   175: aload #9
    //   177: aload #4
    //   179: invokespecial <init> : (Lnet/portswigger/Zco;Lburp/Zg13;Lburp/Zsgv;)V
    //   182: putfield ZO : Lburp/Zzc1;
    //   185: new burp/Zrxz
    //   188: dup
    //   189: aload_0
    //   190: getfield ZO : Lburp/Zzc1;
    //   193: invokespecial <init> : (Lburp/Zzc1;)V
    //   196: astore #10
    //   198: new burp/Zx5h
    //   201: dup
    //   202: aload #10
    //   204: invokespecial <init> : (Lburp/Zb2v;)V
    //   207: astore #11
    //   209: aload_0
    //   210: new burp/Zx0r
    //   213: dup
    //   214: aload_0
    //   215: getfield Ze : Lburp/Zg94;
    //   218: aload #11
    //   220: invokespecial <init> : (Lburp/Zg94;Lburp/Zx5h;)V
    //   223: putfield Zu : Lburp/Zx0r;
    //   226: new burp/Zehb
    //   229: dup
    //   230: aload_0
    //   231: getfield Zx : Lburp/Zz0n;
    //   234: aload_0
    //   235: getfield Ze : Lburp/Zg94;
    //   238: aload #11
    //   240: aload_0
    //   241: getfield Zm : Lburp/Zgb6;
    //   244: aload_0
    //   245: getfield ZN : Lburp/Ztyg;
    //   248: aload_0
    //   249: getfield Zv : Lburp/Zgq7;
    //   252: aload_0
    //   253: getfield Zi : Lburp/Zxrg;
    //   256: aload_0
    //   257: getfield Zo : Lburp/Zr_4;
    //   260: aload_0
    //   261: getfield ZU : Lburp/Zl4y;
    //   264: aload_0
    //   265: getfield ZL : Lburp/Zey9;
    //   268: aload_0
    //   269: getfield Zt : Lburp/Zmde;
    //   272: invokespecial <init> : (Lburp/Zz0n;Lburp/Zg94;Lburp/Zb2v;Lburp/Zgb6;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zxrg;Lburp/Zr_4;Lburp/Zl4y;Lburp/Zey9;Lburp/Zbq6;)V
    //   275: astore #12
    //   277: new burp/Zznu
    //   280: dup
    //   281: aload_2
    //   282: aload_0
    //   283: getfield Ze : Lburp/Zg94;
    //   286: dup
    //   287: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   290: pop
    //   291: <illegal opcode> accept : (Lburp/Zg94;)Ljava/util/function/Consumer;
    //   296: iconst_3
    //   297: anewarray burp/Zr_m
    //   300: dup
    //   301: iconst_0
    //   302: aload #6
    //   304: aastore
    //   305: dup
    //   306: iconst_1
    //   307: aload #11
    //   309: aastore
    //   310: dup
    //   311: iconst_2
    //   312: new burp/Zxo8
    //   315: dup
    //   316: aload #4
    //   318: invokespecial <init> : (Lburp/Zlr_;)V
    //   321: aastore
    //   322: invokespecial <init> : (Lburp/Zrw8;Ljava/util/function/Consumer;[Lburp/Zr_m;)V
    //   325: astore #13
    //   327: aload_0
    //   328: new burp/Zs1u
    //   331: dup
    //   332: aload_0
    //   333: getfield Ze : Lburp/Zg94;
    //   336: aload #12
    //   338: aload #13
    //   340: aload_0
    //   341: getfield ZB : Lburp/Zsvy;
    //   344: invokespecial <init> : (Lburp/Zg94;Lburp/Zehb;Lburp/Zznu;Lburp/Zsvy;)V
    //   347: putfield ZK : Lburp/Zs1u;
    //   350: aload #5
    //   352: aload_0
    //   353: getfield ZK : Lburp/Zs1u;
    //   356: invokevirtual set : (Ljava/lang/Object;)V
    //   359: aload_0
    //   360: new burp/Ztrw
    //   363: dup
    //   364: aload_0
    //   365: getfield Zg : Lburp/Zxg0;
    //   368: aload_0
    //   369: getfield ZK : Lburp/Zs1u;
    //   372: aload_0
    //   373: getfield Ze : Lburp/Zg94;
    //   376: invokespecial <init> : (Lburp/Zxg0;Lburp/Zs1u;Lburp/Zg94;)V
    //   379: putfield Zz : Lburp/Ztrw;
    //   382: aload_0
    //   383: getfield Ze : Lburp/Zg94;
    //   386: invokeinterface Zn : ()Z
    //   391: ifeq -> 410
    //   394: aload #8
    //   396: invokevirtual ZV : ()V
    //   399: aload_1
    //   400: ifnonnull -> 436
    //   403: iconst_5
    //   404: anewarray burp/Zbqc
    //   407: invokestatic Zr : ([Lburp/Zbqc;)V
    //   410: aload #4
    //   412: aload #8
    //   414: dup
    //   415: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   418: pop
    //   419: <illegal opcode> ZG : (Lburp/Zl1t;)Lburp/Zb3a;
    //   424: invokevirtual ZO : (Lburp/Zb3a;)V
    //   427: aload #4
    //   429: aload_0
    //   430: getfield Zz : Lburp/Ztrw;
    //   433: invokevirtual ZO : (Lburp/Zb3a;)V
    //   436: iconst_1
    //   437: anewarray burp/Zm0o
    //   440: dup
    //   441: iconst_0
    //   442: new burp/Zszh
    //   445: dup
    //   446: aload_0
    //   447: getfield Zz : Lburp/Ztrw;
    //   450: invokevirtual ZR : ()Ljava/awt/Component;
    //   453: getstatic burp/Zeew.COLLABORATOR : Lburp/Zeew;
    //   456: getfield toolName : Ljava/lang/String;
    //   459: invokespecial <init> : (Ljava/awt/Component;Ljava/lang/String;)V
    //   462: aastore
    //   463: areturn
  }
  
  void ZQ() {
    this.Zz.Zd();
  }
  
  String Zl() {
    return (this.Zm.ZU0()).ZT ? this.Zu.ZE() : null;
  }
  
  String ZV(boolean paramBoolean) {
    return (this.Zm.ZU0()).ZT ? this.Zu.ZZ(paramBoolean) : null;
  }
  
  String ZP(Zlwu paramZlwu) {
    boolean bool = (this.Zm.ZU0()).ZT;
    return bool ? this.ZO.ZQ(paramZlwu) : null;
  }
  
  void Zi(Zg94 paramZg94, Ztg8 paramZtg8, Zlc8 paramZlc8, float paramFloat1, float paramFloat2) {
    int[] arrayOfInt = Zxco.Z_();
    Zefg<Zmx> zefg = paramZg94.ZI();
    if (!paramZlc8.Zq(paramFloat1, a(14800, -32030)) || zefg.isEmpty())
      return; 
    for (Zmx zmx : paramZg94.ZI()) {
      if (!zmx.Zp().isEmpty()) {
        Zmx zmx1 = paramZtg8.<Zmx>Zw(zmx);
        zmx1.ZU((this.Ze.ZEH()).Zj);
        this.Ze.ZI().add(zmx1);
        this.ZK.ZU(zmx1);
        paramFloat1 += paramFloat2;
      } 
      if (!paramZlc8.Zq(paramFloat1, a(14801, -8210)) || arrayOfInt == null)
        break; 
    } 
  }
  
  private Zgte lambda$getConfigTabs$0(Zrdz paramZrdz, Zboz paramZboz, AtomicReference paramAtomicReference) {
    Objects.requireNonNull(paramAtomicReference);
    return new Zlj3(paramZrdz, paramZboz, paramAtomicReference::get, this.Zt);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '­GÔYãÑ\\fóº:­vs4'F'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #12
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #63
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
    //   69: putstatic burp/Zean.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zean.b : [Ljava/lang/String;
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
    //   152: bipush #56
    //   154: goto -> 184
    //   157: bipush #66
    //   159: goto -> 184
    //   162: bipush #106
    //   164: goto -> 184
    //   167: bipush #19
    //   169: goto -> 184
    //   172: bipush #41
    //   174: goto -> 184
    //   177: bipush #109
    //   179: goto -> 184
    //   182: bipush #28
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
    int i = (paramInt1 ^ 0x39D0) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zean.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */