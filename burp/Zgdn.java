package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Zgdn {
  private static int[] Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void ZF(Zreg paramZreg, Zb_h paramZb_h) {
    paramZb_h.Z_(a(-13415, 24185), paramZreg.ZmO());
    paramZb_h.Z_(a(-13424, -853), paramZreg.Zmz());
    paramZreg.Zub().Zi(paramZb_h, a(-13432, 1898));
    byte b = 0;
    Iterator<Zgnx> iterator = paramZreg.ZIU().iterator();
    int[] arrayOfInt = Zu();
    while (iterator.hasNext()) {
      Zgnx zgnx = iterator.next();
      zgnx.Zm(paramZb_h, ++b);
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  public static boolean ZT(Zreg paramZreg, Object paramObject) {
    if (!(paramObject instanceof Zreg))
      return false; 
    Zreg zreg = (Zreg)paramObject;
    return ZN(paramZreg.ZmQ().Zub(), paramZreg.ZIU(), zreg.ZmQ().Zub(), zreg.ZIU());
  }
  
  public static Component Zb(String paramString) {
    Zx0_ zx0_ = new Zx0_(400);
    zx0_.setEditable(false);
    zx0_.setContentType(a(-13421, 22470));
    zx0_.Zf();
    zx0_.setText(paramString);
    zx0_.Zx(Zlkk.PANEL_BACKGROUND);
    Zbqc zbqc = new Zbqc();
    zbqc.Zl(Zlkk.PANEL_BACKGROUND);
    zbqc.setLayout(new BorderLayout(10, 10));
    zbqc.setBorder(new EmptyBorder(15, 10, 20, 10));
    zbqc.add(zx0_);
    Zbup zbup = new Zbup();
    zbup.setViewportView(zbqc);
    SwingUtilities.invokeLater(zbup::lambda$getDescriptionPanel$0);
    int[] arrayOfInt = Zu();
    if (Zbqc.Zwu() == null)
      Zo(new int[2]); 
    return zbup;
  }
  
  static String ZR(Zreg paramZreg, Zefg<Zxtl> paramZefg) {
    Font font = Zt00.DEFAULT_FONT.ZV();
    String str1 = a(-13413, -25317) + a(-13413, -25317) + font.getFamily();
    String str2 = a(-13411, -15362) + a(-13411, -15362) + font.getSize() - 2;
    return String.format(a(-13412, 2053), new Object[] { str1, str2, Zlkk.FOREGROUND.ZC() }) + String.format(a(-13412, 2053), new Object[] { str1, str2, Zlkk.FOREGROUND.ZC() }) + Zk(paramZreg, paramZefg, Zgdn::lambda$buildDescription$1);
  }
  
  public static void Ze(Zvon paramZvon, Zreg paramZreg) throws IOException {
    paramZvon.Zv(a(-13428, -12978));
    paramZvon.ZW(a(-13429, -24418), paramZreg.ZmO());
    paramZvon.ZW(a(-13418, -1340), paramZreg.Zmz());
    paramZvon.Zv(a(-13417, -32626));
    int[] arrayOfInt = Zu();
    for (Zgnx zgnx : paramZreg.ZIU()) {
      paramZvon.ZW(a(-13423, -11380), zgnx.ZGd());
      if (arrayOfInt != null)
        break; 
    } 
    paramZvon.ZW(a(-13420, -10922));
    paramZvon.ZW(a(-13427, -11428));
  }
  
  static void Zb(Writer paramWriter, Zreg paramZreg, Zefg<Zxtl> paramZefg) throws IOException {
    paramWriter.write(String.format(a(-13431, 19594), new Object[] { Zk(paramZreg, paramZefg, Zgdn::lambda$reportAsHtml$2) }));
  }
  
  private static String ZK(Zll7 paramZll7, Zefg<Zgnx> paramZefg) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Zgnx> iterator = paramZefg.iterator();
    int[] arrayOfInt = Zu();
    while (iterator.hasNext()) {
      Zgnx zgnx = iterator.next();
      stringBuilder.append(zgnx.Zkb(paramZll7.Zsf().Zis()));
      if (arrayOfInt != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static String Zk(Zreg paramZreg, Zefg<Zxtl> paramZefg, Zs3y paramZs3y) {
    // Byte code:
    //   0: invokestatic Zu : ()[I
    //   3: astore_3
    //   4: new java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore #4
    //   13: aload_0
    //   14: invokeinterface ZmQ : ()Lburp/Zrde;
    //   19: invokeinterface Zuo : ()Z
    //   24: ifeq -> 112
    //   27: aload_0
    //   28: invokeinterface ZmQ : ()Lburp/Zrde;
    //   33: new burp/Zr2w
    //   36: dup
    //   37: aload #4
    //   39: aload_1
    //   40: invokespecial <init> : (Ljava/lang/StringBuilder;Lburp/Zefg;)V
    //   43: invokeinterface ZC : (Lburp/Zr9a;)Lburp/Zte7;
    //   48: pop
    //   49: aload #4
    //   51: sipush #-13419
    //   54: sipush #1914
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: iconst_2
    //   61: anewarray java/lang/Object
    //   64: dup
    //   65: iconst_0
    //   66: aload_0
    //   67: invokeinterface Zmz : ()Ljava/lang/String;
    //   72: invokestatic ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   75: aastore
    //   76: dup
    //   77: iconst_1
    //   78: aload_0
    //   79: invokeinterface ZIU : ()Lburp/Zefg;
    //   84: invokeinterface size : ()I
    //   89: iconst_1
    //   90: if_icmpgt -> 98
    //   93: ldc ''
    //   95: goto -> 100
    //   98: ldc 's'
    //   100: aastore
    //   101: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload_3
    //   109: ifnull -> 183
    //   112: aload #4
    //   114: sipush #-13409
    //   117: sipush #-9385
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: iconst_3
    //   124: anewarray java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload_0
    //   130: invokeinterface ZmO : ()Ljava/lang/String;
    //   135: invokestatic ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   138: aastore
    //   139: dup
    //   140: iconst_1
    //   141: aload_0
    //   142: invokeinterface Zmz : ()Ljava/lang/String;
    //   147: invokestatic ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   150: aastore
    //   151: dup
    //   152: iconst_2
    //   153: aload_0
    //   154: invokeinterface ZIU : ()Lburp/Zefg;
    //   159: invokeinterface size : ()I
    //   164: iconst_1
    //   165: if_icmpgt -> 173
    //   168: ldc ''
    //   170: goto -> 175
    //   173: ldc 's'
    //   175: aastore
    //   176: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: aload_0
    //   184: invokeinterface ZIU : ()Lburp/Zefg;
    //   189: invokeinterface iterator : ()Ljava/util/Iterator;
    //   194: astore #5
    //   196: aload #5
    //   198: invokeinterface hasNext : ()Z
    //   203: ifeq -> 269
    //   206: aload #5
    //   208: invokeinterface next : ()Ljava/lang/Object;
    //   213: checkcast burp/Zgnx
    //   216: astore #6
    //   218: aload #6
    //   220: invokeinterface ZGd : ()Ljava/lang/String;
    //   225: bipush #13
    //   227: bipush #32
    //   229: invokevirtual replace : (CC)Ljava/lang/String;
    //   232: bipush #10
    //   234: bipush #32
    //   236: invokevirtual replace : (CC)Ljava/lang/String;
    //   239: bipush #9
    //   241: bipush #32
    //   243: invokevirtual replace : (CC)Ljava/lang/String;
    //   246: astore #7
    //   248: aload #4
    //   250: aload_2
    //   251: aload #7
    //   253: invokestatic ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   256: invokeinterface ZJ : (Ljava/lang/String;)Ljava/lang/String;
    //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: aload_3
    //   266: ifnull -> 196
    //   269: aload #4
    //   271: sipush #-13422
    //   274: bipush #-52
    //   276: invokestatic a : (II)Ljava/lang/String;
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: invokevirtual toString : ()Ljava/lang/String;
    //   285: areturn
  }
  
  private static boolean ZN(Zll7 paramZll71, Zefg<Zgnx> paramZefg1, Zll7 paramZll72, Zefg<Zgnx> paramZefg2) {
    int[] arrayOfInt = Zu();
    if (paramZefg1.size() != paramZefg2.size())
      return false; 
    if (paramZll71.ZF(Zgid.ZO) || paramZll72.ZF(Zgid.ZO)) {
      byte b = 0;
      while (b < paramZefg1.size()) {
        if (!((Zgnx)paramZefg1.get(b)).equals(paramZefg2.get(b)))
          return false; 
        b++;
        if (arrayOfInt != null)
          break; 
      } 
      return true;
    } 
    return ZK(paramZll71, paramZefg1).equals(ZK(paramZll72, paramZefg2));
  }
  
  private static String lambda$reportAsHtml$2(String paramString) {
    return String.format(a(-13430, -11543), new Object[] { paramString });
  }
  
  private static String lambda$buildDescription$1(String paramString) {
    return String.format(a(-13416, -22328), new Object[] { paramString });
  }
  
  private static void lambda$getDescriptionPanel$0(Zbup paramZbup) {
    paramZbup.getViewport().setViewPosition(new Point(0, 0));
  }
  
  public static void Zo(int[] paramArrayOfint) {
    Zc = paramArrayOfint;
  }
  
  public static int[] Zu() {
    return Zc;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'hRÔÕ®ß0XO®£ÎåëcG}ûÕÌ>ÚÌ:¾ÌN<ÀÜ\\ryü.õû·ê4íÈĊÚQä\\fÎ}´*Wt)öíîîr¬_éU5Ýø¼Ã$·HeT¬òØß>6¦Éáº¸¬Ì.NpUI1´â[\\rv9ÄüAÀÜúuPSºjÔµÄw}±h³Hiô¹HkØå ÚçZO L5}Ï\\tÁs7Yã{q« Ðk^:2?ö¨gjà¤>EwMY\Ç"(xÑ`±x+ªòé^\\n¯TÈBØ¦à¼Ëå¾Ì¶YCÅ4+#\\bHïø¡Õ}§#þ8L¢ätúdÐÒ=Þ²Î7W¾¬õ9¯!×h¤Ùþ_ß]ìI;BÉ[vtfCÏ6±<apÞ Újehl÷(Ì¨£È*9yPeûô¿ÍT<ÉX07/oç|}@o*¢T`ïÊ2V¨hÐgÊgÝ-¦d{&ñP Fêlª\-%Ìü¶ûÇçZg`Ï°:v¼ÑÆ ÉÍHªô ÛÁlbTSm¿d¤ûÓðØúÇ9uuHí¶ÿêA±H¨¬²¬]Ë\\bËÄ\\f4û(°^y¹»äMÉ\\tûW8ËïGbÍºbÖØÑ\\r\\nôÚ¦,¹bwÛÔjhÆÀ%máh+W¼õpYþÐ¨]\\tW*SWòÑÓhNÂ]qp:¸ôô³¦'RHÂøß¥íQâ<º:Þkáýpx.J·6ª>!|àµ¿h#K`÷ÁÄÄ§·9ÓÏ ^Þ!d4åàÇÛÏñdn¨ÇõÆ6`?6*Á&å'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zo : ([I)V
    //   22: bipush #24
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: iconst_1
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
    //   68: goto -> 27
    //   71: ldc '¶6}BÅÌZIAð§òí"¯þj¼!§De0«'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #17
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #78
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
    //   132: putstatic burp/Zgdn.a : [Ljava/lang/String;
    //   135: bipush #23
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zgdn.b : [Ljava/lang/String;
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
    //   216: bipush #21
    //   218: goto -> 248
    //   221: bipush #31
    //   223: goto -> 248
    //   226: bipush #70
    //   228: goto -> 248
    //   231: bipush #94
    //   233: goto -> 248
    //   236: bipush #89
    //   238: goto -> 248
    //   241: bipush #70
    //   243: goto -> 248
    //   246: bipush #43
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
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCB98) & 0xFFFF;
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
      byte b1 = 38;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgdn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */