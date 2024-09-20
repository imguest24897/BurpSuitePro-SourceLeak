package burp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;

public class Zgv5 implements Zsmi, Zs7p {
  private final List<AtomicLong> Zc = Collections.synchronizedList(new ArrayList<>());
  
  private final List<AtomicLong> Zs = Collections.synchronizedList(new ArrayList<>());
  
  private final List<AtomicLong> Zn = Collections.synchronizedList(new ArrayList<>());
  
  private final List<AtomicLong> Zv = Collections.synchronizedList(new ArrayList<>());
  
  private final List<AtomicLong> ZA = Collections.synchronizedList(new ArrayList<>());
  
  private final List<AtomicLong> Zf = Collections.synchronizedList(new ArrayList<>());
  
  private final List<AtomicLong> ZT = Collections.synchronizedList(new ArrayList<>());
  
  private final List<AtomicLong> ZQ = Collections.synchronizedList(new ArrayList<>());
  
  private final Timer Zw = new Timer(a(-28092, 3938));
  
  private final Zsnz ZC = new Zsnz(this);
  
  private final Zstd Zt = new Zstd(this);
  
  private volatile int ZM = 0;
  
  private volatile int Zl;
  
  private volatile int Zq = 0;
  
  private volatile int Zp;
  
  private static String ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public void Zs() {
    this.Zc.add(new AtomicLong());
    this.Zn.add(new AtomicLong());
    this.ZA.add(new AtomicLong());
    this.ZT.add(new AtomicLong());
    this.Zs.add(new AtomicLong());
    String str = Zj();
    this.Zv.add(new AtomicLong());
    this.Zf.add(new AtomicLong());
    this.ZQ.add(new AtomicLong());
    this.Zl = Calendar.getInstance().get(12);
    this.Zp = Calendar.getInstance().get(11);
    this.Zw.schedule(this.ZC, 60000L, 60000L);
    this.Zw.schedule(this.Zt, Zo(), 3600000L);
    if (Zbqc.Zwu() == null)
      Zb("s61zhb"); 
  }
  
  public void ZW() {
    ((AtomicLong)this.Zc.get(this.ZM)).incrementAndGet();
    ((AtomicLong)this.Zs.get(this.Zq)).incrementAndGet();
  }
  
  public void Zk() {
    ((AtomicLong)this.Zn.get(this.ZM)).incrementAndGet();
    ((AtomicLong)this.Zv.get(this.Zq)).incrementAndGet();
  }
  
  public void Ze() {
    ((AtomicLong)this.ZA.get(this.ZM)).incrementAndGet();
    ((AtomicLong)this.Zf.get(this.Zq)).incrementAndGet();
  }
  
  public void ZU() {
    ((AtomicLong)this.ZT.get(this.ZM)).incrementAndGet();
    ((AtomicLong)this.ZQ.get(this.Zq)).incrementAndGet();
  }
  
  public String Zn() {
    // Byte code:
    //   0: invokestatic Zj : ()Ljava/lang/String;
    //   3: aload_0
    //   4: dup
    //   5: astore_2
    //   6: monitorenter
    //   7: astore_1
    //   8: new burp/Ztk7
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: aload_0
    //   16: getfield Zs : Ljava/util/List;
    //   19: aload_0
    //   20: getfield Zq : I
    //   23: aload_0
    //   24: getfield Zp : I
    //   27: invokevirtual Zw : (Ljava/util/List;II)Ljava/lang/String;
    //   30: new burp/Ztk7
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: aload_0
    //   38: getfield Zv : Ljava/util/List;
    //   41: aload_0
    //   42: getfield Zq : I
    //   45: aload_0
    //   46: getfield Zp : I
    //   49: invokevirtual Zw : (Ljava/util/List;II)Ljava/lang/String;
    //   52: new burp/Ztk7
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: aload_0
    //   60: getfield ZQ : Ljava/util/List;
    //   63: aload_0
    //   64: getfield Zq : I
    //   67: aload_0
    //   68: getfield Zp : I
    //   71: invokevirtual Zw : (Ljava/util/List;II)Ljava/lang/String;
    //   74: new burp/Ztk7
    //   77: dup
    //   78: invokespecial <init> : ()V
    //   81: aload_0
    //   82: getfield Zf : Ljava/util/List;
    //   85: aload_0
    //   86: getfield Zq : I
    //   89: aload_0
    //   90: getfield Zp : I
    //   93: invokevirtual Zw : (Ljava/util/List;II)Ljava/lang/String;
    //   96: new burp/Ztk7
    //   99: dup
    //   100: invokespecial <init> : ()V
    //   103: aload_0
    //   104: getfield Zc : Ljava/util/List;
    //   107: aload_0
    //   108: getfield ZM : I
    //   111: aload_0
    //   112: getfield Zl : I
    //   115: invokevirtual ZX : (Ljava/util/List;II)Ljava/lang/String;
    //   118: new burp/Ztk7
    //   121: dup
    //   122: invokespecial <init> : ()V
    //   125: aload_0
    //   126: getfield Zn : Ljava/util/List;
    //   129: aload_0
    //   130: getfield ZM : I
    //   133: aload_0
    //   134: getfield Zl : I
    //   137: invokevirtual ZX : (Ljava/util/List;II)Ljava/lang/String;
    //   140: new burp/Ztk7
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: aload_0
    //   148: getfield ZT : Ljava/util/List;
    //   151: aload_0
    //   152: getfield ZM : I
    //   155: aload_0
    //   156: getfield Zl : I
    //   159: invokevirtual ZX : (Ljava/util/List;II)Ljava/lang/String;
    //   162: new burp/Ztk7
    //   165: dup
    //   166: invokespecial <init> : ()V
    //   169: aload_0
    //   170: getfield ZA : Ljava/util/List;
    //   173: aload_0
    //   174: getfield ZM : I
    //   177: aload_0
    //   178: getfield Zl : I
    //   181: invokevirtual ZX : (Ljava/util/List;II)Ljava/lang/String;
    //   184: astore #4
    //   186: astore #5
    //   188: astore #6
    //   190: astore #7
    //   192: astore #8
    //   194: astore #9
    //   196: astore #10
    //   198: astore #11
    //   200: sipush #-28081
    //   203: sipush #22890
    //   206: invokestatic a : (II)Ljava/lang/String;
    //   209: aload #11
    //   211: sipush #-28082
    //   214: sipush #19838
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: aload #10
    //   222: sipush #-28086
    //   225: sipush #20928
    //   228: invokestatic a : (II)Ljava/lang/String;
    //   231: aload #9
    //   233: sipush #-28084
    //   236: sipush #11555
    //   239: invokestatic a : (II)Ljava/lang/String;
    //   242: aload #8
    //   244: sipush #-28087
    //   247: sipush #24463
    //   250: invokestatic a : (II)Ljava/lang/String;
    //   253: aload #7
    //   255: sipush #-28088
    //   258: sipush #6747
    //   261: invokestatic a : (II)Ljava/lang/String;
    //   264: aload #6
    //   266: sipush #-28091
    //   269: sipush #5998
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: aload #5
    //   277: sipush #-28083
    //   280: sipush #17353
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: aload #4
    //   288: sipush #-28085
    //   291: sipush #7131
    //   294: invokestatic a : (II)Ljava/lang/String;
    //   297: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   302: aload_2
    //   303: monitorexit
    //   304: aload_1
    //   305: ifnull -> 315
    //   308: iconst_3
    //   309: anewarray burp/Zbqc
    //   312: invokestatic Zr : ([Lburp/Zbqc;)V
    //   315: areturn
    //   316: astore_3
    //   317: aload_2
    //   318: monitorexit
    //   319: aload_3
    //   320: athrow
    // Exception table:
    //   from	to	target	type
    //   8	304	316	finally
    //   316	319	316	finally
  }
  
  private static Date Zo() {
    Calendar calendar = GregorianCalendar.getInstance();
    calendar.set(11, calendar.get(11) + 1);
    calendar.set(12, 0);
    return calendar.getTime();
  }
  
  private void ZV(List<AtomicLong> paramList, int paramInt) {
    if (paramList.size() <= paramInt)
      paramList.add(paramInt, new AtomicLong()); 
    ((AtomicLong)paramList.get(paramInt)).set(0L);
  }
  
  public static void Zb(String paramString) {
    ZV = paramString;
  }
  
  public static String Zj() {
    return ZV;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc 'UÎõ6ì£¿`BÖp¿,ã0a"5 ¾AÞnÈzI¯éÑùïÊ;zIDI»]{g®x¬ùDß=#¼É\\f0Fü_±i¦Û\\b=ÕÑåKqrq¡|Q­> Ú\\t¶ÂÕE7¦¢0LJ&±sf\\f³!Un8)$C0²rZÄ(nÔ-/OCèô° yxÓ?ghÄdH¯)Ø*­{x6\\f8;!µmò¹²XÛ\@½1;E._*f)J=¥2ÉIgC¯ð§<à\H±ªLQk~pÓ«¿P\\fbÞ£6×Ûd)é)U8'\\t Å\\f"KKÜ,beÎ1ú|d;ðWYCL¥!î¥­ây>4+'ßQ²~§f0ÃÜÌA-%Ð6¼µRSÁÕ®öÈ@KmK¹Ü*KÈ+jXøó¨.õÜ ¸ZË £ÑD}!4¯ÜtëØ±y-\\b:»ò>wï)Täø¡Õ²ÌÝñ;zNgIR²à\\tósLw<ó,F§ÜA¥Þð?}V c¡Âp³-,ynÍz$F©ìP5P'z²4kÖÀ¢T£³Ø·7ìèè-®*ýÅC\\bDlgßÙ%=Ïa¦Ãò·ëëã/Ç7Mû$qÀÊ Ãw{[Ü¢{\\r2ezôÊÓóá*¥içr@^·Ï­³¦'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zb : (Ljava/lang/String;)V
    //   22: bipush #77
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #19
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
    //   72: ldc 'ÑcàÚàwñ®²nª>#´\\b¬ÇÑ°ëa\\n«ÏKçÕGÖà¢hÒVt×G|*¯Íb\\t?m¯,×UVS®º5k~¦å!µou}:á'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #62
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #71
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
    //   133: putstatic burp/Zgv5.a : [Ljava/lang/String;
    //   136: bipush #10
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zgv5.b : [Ljava/lang/String;
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
    //   216: bipush #117
    //   218: goto -> 248
    //   221: bipush #123
    //   223: goto -> 248
    //   226: bipush #79
    //   228: goto -> 248
    //   231: bipush #90
    //   233: goto -> 248
    //   236: bipush #82
    //   238: goto -> 248
    //   241: bipush #126
    //   243: goto -> 248
    //   246: bipush #82
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
    int i = (paramInt1 ^ 0xFFFF924D) & 0xFFFF;
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
      byte b1 = 24;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgv5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */