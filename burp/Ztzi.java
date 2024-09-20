package burp;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.util.List;
import java.util.function.BooleanSupplier;
import net.portswigger.Zm2;

public class Ztzi extends MouseAdapter implements Zedo {
  private final Zsud Za;
  
  private final Zxw6 Zn;
  
  private final Zbk5 ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztzi(Zsud paramZsud, Zxw6 paramZxw6, Zspz paramZspz, Zm6v paramZm6v, Zgb6 paramZgb6, Zg9z paramZg9z, Zg6x paramZg6x, Zm51 paramZm51, Zzbc paramZzbc, boolean paramBoolean, Zmwz paramZmwz, Zm6x paramZm6x) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Za : Lburp/Zsud;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield Zn : Lburp/Zxw6;
    //   14: new burp/Ztm_
    //   17: dup
    //   18: sipush #29898
    //   21: sipush #26498
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: getstatic burp/Zzca.SETTINGS : Lburp/Zzca;
    //   30: getstatic burp/Zk97.DESKTOP_TOOLS_LOGGER_CAPTURE_FILTER : Lburp/Zk97;
    //   33: aload_3
    //   34: iconst_1
    //   35: anewarray java/lang/String
    //   38: dup
    //   39: iconst_0
    //   40: sipush #29893
    //   43: sipush #-5385
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: aastore
    //   50: invokespecial <init> : (Ljava/lang/String;Lburp/Zzca;Lburp/Zk97;Lburp/Zspz;[Ljava/lang/String;)V
    //   53: astore #14
    //   55: new burp/Zg98
    //   58: dup
    //   59: getstatic burp/Zkba.Zm : Ljava/lang/String;
    //   62: sipush #29889
    //   65: sipush #20470
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: sipush #29896
    //   74: sipush #-24451
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: sipush #29899
    //   83: sipush #9373
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: sipush #29888
    //   92: sipush #12552
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: getstatic burp/Zrrh.LOGGER_CAPTURE_FILTER_BAMBDA_HELP_SECTION_EXPANDED : Lburp/Zrrh;
    //   101: getstatic burp/Zec3.LOGGER_CAPTURE_FILTER_BAMBDA_HASH : Lburp/Zec3;
    //   104: getstatic burp/Zze0.LOGGER_CAPTURE_FILTER_BAMBDA_APPLIED : Lburp/Zze0;
    //   107: getstatic burp/Zrrh.LOGGER_CAPTURE_FILTER_BAMBDA_JAVADOC_LINK_CLICKED : Lburp/Zrrh;
    //   110: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zrrh;Lburp/Zec3;Lburp/Zze0;Lburp/Zrrh;)V
    //   113: astore #15
    //   115: new burp/Zbqc
    //   118: dup
    //   119: new java/awt/BorderLayout
    //   122: dup
    //   123: invokespecial <init> : ()V
    //   126: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   129: astore #16
    //   131: aload #16
    //   133: getstatic burp/Zlkk.BAMBDA_PERFORMANCE_WARNING_BANNER_BACKGROUND : Lburp/Zlkk;
    //   136: invokevirtual Zl : (Lburp/Zlkk;)V
    //   139: aload #16
    //   141: new javax/swing/border/EmptyBorder
    //   144: dup
    //   145: bipush #10
    //   147: bipush #20
    //   149: bipush #10
    //   151: iconst_0
    //   152: invokespecial <init> : (IIII)V
    //   155: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   158: invokestatic Zl : ()I
    //   161: new burp/Zm99
    //   164: dup
    //   165: sipush #29903
    //   168: sipush #-7610
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: getstatic burp/Zeuf.INFORMATION : Lburp/Zeuf;
    //   177: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   180: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   183: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   186: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   189: invokevirtual Z_ : ()Lburp/Ze9n;
    //   192: invokespecial <init> : (Ljava/lang/String;Ljavax/swing/Icon;)V
    //   195: astore #17
    //   197: aload #17
    //   199: bipush #10
    //   201: invokevirtual setIconTextGap : (I)V
    //   204: istore #13
    //   206: aload #16
    //   208: aload #17
    //   210: sipush #29902
    //   213: sipush #-21131
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   222: new burp/Zbqr
    //   225: dup
    //   226: aload #15
    //   228: aload #5
    //   230: aload #6
    //   232: aload #12
    //   234: new burp/Zs4k
    //   237: dup
    //   238: invokespecial <init> : ()V
    //   241: aload #16
    //   243: invokespecial <init> : (Lburp/Zg98;Lburp/Zgb6;Lburp/Zg9z;Lburp/Zm6x;Lburp/Zxka;Ljava/awt/Component;)V
    //   246: astore #18
    //   248: new burp/Ztdf
    //   251: dup
    //   252: aload #18
    //   254: aload #15
    //   256: aload #8
    //   258: aload #7
    //   260: aload #4
    //   262: aload #11
    //   264: invokespecial <init> : (Lburp/Zbqr;Lburp/Zg98;Lburp/Zm51;Lburp/Zt33;Lburp/Zm6v;Lburp/Zm3g;)V
    //   267: astore #19
    //   269: aload #19
    //   271: invokevirtual Za4 : ()V
    //   274: aload #7
    //   276: aload #19
    //   278: invokeinterface ZS : (Lburp/Zedo;)V
    //   283: aload #7
    //   285: aload #19
    //   287: invokeinterface Zm : (Lburp/Zzkg;)V
    //   292: aload #7
    //   294: aload #19
    //   296: invokeinterface Zf : (Lburp/Zklo;)V
    //   301: new burp/Ztm_
    //   304: dup
    //   305: sipush #29891
    //   308: sipush #-32757
    //   311: invokestatic a : (II)Ljava/lang/String;
    //   314: getstatic burp/Zzca.BAMBDA : Lburp/Zzca;
    //   317: getstatic burp/Zk97.BAMBDAS_LOGGER_CAPTURE_FILTER : Lburp/Zk97;
    //   320: aload #19
    //   322: iconst_3
    //   323: anewarray java/lang/String
    //   326: dup
    //   327: iconst_0
    //   328: sipush #29892
    //   331: sipush #20688
    //   334: invokestatic a : (II)Ljava/lang/String;
    //   337: aastore
    //   338: dup
    //   339: iconst_1
    //   340: sipush #29901
    //   343: sipush #-24790
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: aastore
    //   350: dup
    //   351: iconst_2
    //   352: sipush #29900
    //   355: sipush #-27398
    //   358: invokestatic a : (II)Ljava/lang/String;
    //   361: aastore
    //   362: invokespecial <init> : (Ljava/lang/String;Lburp/Zzca;Lburp/Zk97;Lburp/Zspz;[Ljava/lang/String;)V
    //   365: astore #20
    //   367: new burp/Zglg
    //   370: dup
    //   371: aload #9
    //   373: aload #7
    //   375: aload #19
    //   377: aload #14
    //   379: aload #20
    //   381: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   384: getstatic burp/Zk97.BAMBDAS_LOGGER_CAPTURE_FILTER_CONVERT_TO_BAMBDA : Lburp/Zk97;
    //   387: aload #7
    //   389: iload #10
    //   391: aload #11
    //   393: <illegal opcode> apply : (Lburp/Zg6x;ZLburp/Zmwz;)Ljava/util/function/BiFunction;
    //   398: invokespecial <init> : (Lburp/Zbqa;Lburp/Zt33;Lburp/Ztd8;Ljava/util/List;Lburp/Zk97;Ljava/util/function/BiFunction;)V
    //   401: astore #21
    //   403: aload_0
    //   404: new burp/Zxwe
    //   407: dup
    //   408: aload_1
    //   409: aload_0
    //   410: <illegal opcode> Zc : (Lburp/Ztzi;)Lburp/Zgyi;
    //   415: aload #21
    //   417: invokespecial <init> : (Lburp/Ztl5;Lburp/Zgyi;Lburp/Ztun;)V
    //   420: invokevirtual ZU : ()Lburp/Zbk5;
    //   423: putfield ZS : Lburp/Zbk5;
    //   426: aload #7
    //   428: aload_0
    //   429: <illegal opcode> Zn : (Lburp/Ztzi;)Lburp/Zzkg;
    //   434: invokeinterface Zm : (Lburp/Zzkg;)V
    //   439: invokestatic Zwu : ()[Lburp/Zbqc;
    //   442: ifnonnull -> 453
    //   445: iinc #13, 1
    //   448: iload #13
    //   450: invokestatic ZW : (I)V
    //   453: return
  }
  
  private void Zn() {
    this.ZS.Zy();
  }
  
  public Zbky ZW() {
    return this.ZS;
  }
  
  private void Zq(BooleanSupplier paramBooleanSupplier, Runnable paramRunnable) {
    Zm2.Zo(Zze0.LOGGER_EDITED_CAPTURE_FILTER);
    Zn();
    this.Zn.Zg(this.Za, paramBooleanSupplier, paramRunnable);
  }
  
  public void Zt2() {
    this.ZS.Zv();
  }
  
  private void lambda$new$1(Zsij paramZsij) {
    this.ZS.ZE(a(29897, 3091));
  }
  
  private static Zr7o lambda$new$0(Zg6x paramZg6x, boolean paramBoolean, Zmwz paramZmwz, Component paramComponent, List<Ztm_> paramList) {
    Zr78 zr78 = new Zr78(paramComponent, paramZg6x, paramBoolean, paramList);
    paramZmwz.ZM(zr78);
    zr78.setName(a(29890, -28291));
    return zr78;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ',@ö=êåYr)Ô\\f«öÞµ3ò~plûË¸oÂ÷å½\\b²ãN±\\b53Xë(\\fÅ®äùZIÀ*Òíq\\rj?LÃs`¢dH&g¡ËÅe6 ±À%3\\fE·2Êä-[Q2|]xµiÆt$QèÒZC±Ä l2É[Âöèk%¡¤Ig­0è<oZtÃs®RGc-ÚôEøØFçò Ý»` ¬£×~Kë`¶Ùü°ÏNÏßT_SÒÍFÄüÞÑÚ_I\\f¡*>`Y8¯¶wàóU Z:qlì¿;í  º5³=TIÿëÞ27ÖL*«çûø^Kb=Hç1ÌÑ¾à±P>ÕôèÉv;Òõ¨(=±v\\b5¾»¢½çXÅPôj^å´µ«É'¹2Í-¾åC¨ªT¡y¢tæ#"vVâ\\f$U´æº ×\\n8ÂX ñ¬-méyÆßêmWÂãAþEÁÎHí÷³¶Öçÿt¾ñ×:I_zGï_6çÇÉ>ë^q }ô§åV³kÎ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #57
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #17
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
    //   68: ldc '*õÌÑGÑ*và×ñ½Ùx´K×~|Ì9ë¡1ûùx×ºoÊV"S÷iH '
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #28
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #45
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
    //   129: putstatic burp/Ztzi.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztzi.b : [Ljava/lang/String;
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
    //   212: bipush #115
    //   214: goto -> 244
    //   217: bipush #47
    //   219: goto -> 244
    //   222: bipush #44
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #62
    //   234: goto -> 244
    //   237: bipush #31
    //   239: goto -> 244
    //   242: bipush #74
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
    int i = (paramInt1 ^ 0x74C8) & 0xFFFF;
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
      char c = '¸';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztzi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */