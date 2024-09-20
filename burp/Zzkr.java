package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zzkr implements Zm3g, Zmgs {
  private final List<Zr5_> Zi;
  
  private final Zr5_ ZW;
  
  private final Supplier<Integer> ZC;
  
  private final Zz4b ZD;
  
  private final Zr_4 ZM;
  
  private final Zz1m<Zt1s> ZQ;
  
  private final Zrgd Zl;
  
  private final Zsy Zx;
  
  private final Zskh Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zzkr(List<Zr5_> paramList, Zr5_ paramZr5_, Supplier<Integer> paramSupplier, Zz4b paramZz4b, Zr_4 paramZr_4, Zz1m<Zt1s> paramZz1m, Zrgd paramZrgd, Zsy paramZsy, Zskh paramZskh) {
    this.Zi = paramList;
    this.ZW = paramZr5_;
    this.ZC = paramSupplier;
    this.ZD = paramZz4b;
    this.ZM = paramZr_4;
    this.ZQ = paramZz1m;
    this.Zl = paramZrgd;
    this.Zx = paramZsy;
    this.Zm = paramZskh;
  }
  
  public Zr5_ ZD() {
    return this.ZW;
  }
  
  public List<Zr5_> Zk() {
    return Collections.unmodifiableList(this.Zi);
  }
  
  public Zr5_ Ze(Ztau paramZtau, Zs3t paramZs3t) {
    Ztwh ztwh = paramZtau.ZQ();
    Ztic ztic = this.ZM.<Ztic>ZH(new Zx81());
    ztic.Zd(((Integer)this.ZC.get()).intValue());
    String str = Ztj1.Ze();
    ztic.Zr(ztwh.Zz());
    ztic.ZE(ztwh.Zw());
    ztic.Zn(ztwh.ZY());
    ztic.ZQ(ztwh.ZK());
    ztic.Zh(ztwh.Zc());
    ztic.ZZ(ztwh.ZW());
    ztic.Zl(ztwh.ZQ());
    ztic.Zd(ztwh.ZO());
    ztic.Zu(ztwh.Zo());
    ztic.Z_(ztwh.Zf());
    ztic.ZY(ztwh.Zy());
    ztic.ZX(ztwh.Zm());
    ztic.Zl(ztwh.ZB());
    this.ZD.ZVq().add(ztic);
    Zr5_ zr5_ = new Zr5_(ztic, paramZtau, this.ZQ, this.Zl, this.Zx, this.Zm);
    paramZs3t.Zl(zr5_.Zs());
    this.Zi.add(zr5_);
    this.ZQ.ZD(new Zxr8(Zt1s.ZX));
    if (Zbqc.Zwu() == null)
      Ztj1.Zb("vXbplb"); 
    return zr5_;
  }
  
  public Zr5_ ZE(int paramInt) {
    Zuh.Zb((paramInt >= 0 && paramInt < this.Zi.size()), Zqf.Zk);
    return this.Zi.get(paramInt);
  }
  
  public Zr5_ ZZ(int paramInt) {
    Optional<Zr5_> optional = Zp(paramInt);
    Zuh.Zb(optional.isPresent(), Zqf.Zk);
    return optional.orElse(null);
  }
  
  public Optional<Zr5_> ZH(String paramString) {
    return this.Zi.stream().filter(paramString::lambda$findResourcePoolWithName$0).findFirst();
  }
  
  public Optional<Zr5_> Zp(int paramInt) {
    return this.Zi.stream().filter(paramInt::lambda$findResourcePoolWithId$1).findFirst();
  }
  
  public void ZR(int paramInt) {
    // Byte code:
    //   0: invokestatic Ze : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zi : Ljava/util/List;
    //   8: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   13: iload_1
    //   14: <illegal opcode> test : (I)Ljava/util/function/Predicate;
    //   19: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   24: invokeinterface findFirst : ()Ljava/util/Optional;
    //   29: astore_3
    //   30: aload_3
    //   31: invokevirtual isEmpty : ()Z
    //   34: ifeq -> 45
    //   37: iconst_0
    //   38: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   41: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   44: return
    //   45: aload_3
    //   46: invokevirtual get : ()Ljava/lang/Object;
    //   49: checkcast burp/Zr5_
    //   52: astore #4
    //   54: aload #4
    //   56: invokevirtual Z_ : ()I
    //   59: aload_0
    //   60: getfield ZW : Lburp/Zr5_;
    //   63: invokevirtual Z_ : ()I
    //   66: if_icmpne -> 80
    //   69: iconst_0
    //   70: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   73: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   76: aload_2
    //   77: ifnonnull -> 166
    //   80: aload #4
    //   82: aload_0
    //   83: getfield ZW : Lburp/Zr5_;
    //   86: invokevirtual Zh : (Lburp/Zr5_;)V
    //   89: aload_0
    //   90: getfield Zi : Ljava/util/List;
    //   93: aload #4
    //   95: invokeinterface remove : (Ljava/lang/Object;)Z
    //   100: istore #5
    //   102: aload_0
    //   103: getfield ZD : Lburp/Zz4b;
    //   106: invokeinterface ZVq : ()Lburp/Zefg;
    //   111: iload_1
    //   112: <illegal opcode> test : (I)Ljava/util/function/Predicate;
    //   117: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
    //   122: istore #6
    //   124: aload #4
    //   126: invokevirtual ZI : ()V
    //   129: aload_0
    //   130: getfield ZQ : Lburp/Zz1m;
    //   133: new burp/Zxr8
    //   136: dup
    //   137: getstatic burp/Zt1s.ZX : Lburp/Zlnb;
    //   140: invokespecial <init> : (Lburp/Zlnb;)V
    //   143: invokeinterface ZD : (Lburp/Zxr8;)V
    //   148: iload #5
    //   150: iload #6
    //   152: if_icmpne -> 159
    //   155: iconst_1
    //   156: goto -> 160
    //   159: iconst_0
    //   160: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   163: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   166: return
  }
  
  public int Zc() {
    return Zk().size();
  }
  
  public void ZH() {
    this.Zi.forEach(Zr5_::Zn);
  }
  
  public void ZK() {
    this.Zi.forEach(Zr5_::Zb);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    Ztwh ztwh = this.ZW.ZO();
    Zlk6 zlk6 = new Zlk6();
    int i = paramZmf_.ZA(a(-18873, -8204), ztwh.ZY());
    boolean bool1 = paramZmf_.ZC(a(-18872, 15036), ztwh.Zw());
    int j = paramZmf_.ZA(a(-18880, -11143), ztwh.Zf());
    boolean bool2 = paramZmf_.ZC(a(-18871, -13669), ztwh.ZK());
    boolean bool3 = paramZmf_.ZC(a(-18879, 17851), ztwh.Zy());
    String str = Ztj1.Ze();
    boolean bool4 = paramZmf_.ZC(a(-18878, -9419), ztwh.Zc());
    boolean bool5 = paramZmf_.ZC(a(-18869, -20337), ztwh.ZW());
    boolean bool6 = paramZmf_.ZC(a(-18877, -19067), ztwh.ZQ());
    boolean bool7 = paramZmf_.ZC(a(-18874, -30067), ztwh.Zo());
    List<?> list = paramZmf_.Zs(a(-18867, 15854), Zzkr::lambda$loadBurpConfiguration$4);
    if (Zepo.ZN(list))
      list = ztwh.ZO(); 
    zlk6.Zs(ztwh.Zz()).ZA(i).Zq(bool1).Zj(j).ZI(bool2).ZU(bool3).Zw(bool4).ZA(bool5).Zt(bool6).Zs(bool7).ZN((List)list);
    Zm_3 zm_3 = zlk6.ZP();
    if (zm_3.Zx()) {
      Ztwh ztwh1 = zlk6.Zi();
      if (!ztwh.equals(ztwh1))
        this.ZW.Zf(ztwh1); 
      if (str == null) {
        Zbqc.Zr(new Zbqc[1]);
      } else {
        return;
      } 
    } 
    System.out.println(a(-18876, 11013) + a(-18876, 11013));
  }
  
  public void Zl(Zg4j paramZg4j) {}
  
  public void Zl(Zz9t paramZz9t) {
    paramZz9t.ZP(a(-18875, -24308));
    Iterator<Zr5_> iterator = Zk().iterator();
    String str = Ztj1.Ze();
    while (iterator.hasNext()) {
      Zr5_ zr5_ = iterator.next();
      zr5_.Zl(paramZz9t);
      paramZz9t.Zt();
      if (str == null)
        break; 
    } 
  }
  
  public void Zx() {
    this.Zi.forEach(Zr5_::ZI);
  }
  
  private static Integer lambda$loadBurpConfiguration$4(Zvt paramZvt) throws Zzam {
    return Integer.valueOf(paramZvt.Zk(a(-18870, 32057)));
  }
  
  private static boolean lambda$removeResourcePoolWithId$3(int paramInt, Ztic paramZtic) {
    return (paramZtic.ZrT() == paramInt);
  }
  
  private static boolean lambda$findResourcePoolWithId$1(int paramInt, Zr5_ paramZr5_) {
    return (paramZr5_.Z_() == paramInt);
  }
  
  private static boolean lambda$findResourcePoolWithName$0(String paramString, Zr5_ paramZr5_) {
    return paramZr5_.Zu().equals(paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¶\\rhð0ÀöÀµé{2õ\\tái©íl1{q\\fo ½Á×F®ÜÍú¬_,¹ÎÈÁEgo(ä`¹Mæäåàåù4Ùà½×è½\\bÓ­Mýñà®òt5kà÷SGªaÀÀLÅù0oÃåÔ¤û½zHWUµ5h¯hÐL±Æ/àQ`s+uª»Ú&?|$@*[u E?vê üon Âj"ÄÑ¤âÚÐ­MÖè{MªÉ+mqµO£éÍoòF|qE'ÍÁøEv!Äµ×dm0}ØA# Ç{ÎÍ:´$èÌ<¦ÔÊE6ÔÕÕaÍA?YC¶Ï8Xlú@PEëhô¢ËõµéÕ|ß¦ª'AüI)èwVÒ~p#ÄmýþºS9`¶Cÿ</Y52Ï¢\âåP_5ùÊð)[&çÎùb 3¸_mí%Ð$¤üÿ)C]8ÖÝ\\f^´ÓØî cMùél\\rS¬4ûw²áÌs ®@Ðÿ\\tBñénø­aá8$fÌË:_´.«PÑ¡b*Q±X;IÛW1ÓGC2>ñÃ]  ºUjt@`©gÄ!¾½nwD{´·ØzíÞBzc/8ñ_öëg/§ìÂ\ÛArMkèÆEÜdÊiV+Coù¢íÃ¨þÅfª*kÃÐSck:åaÒwËÈNªëÂ@>¬ÑX5éýø*#*?³°Wº¥7Ê²MNÈÜ"qÑùf`s¤øñ:ì ,$ùÝ®þñÏZý"0!Á@¸ç¸ç¬®U¯(KTTTdQçÛ1t¼Á.øLµø½éà^]jûo·ùî^ÈË +_ó!^§ýEéøe}M=$(Gû´ßø§&.rVëa\\bË¸B[@¤¶Åëfp"¯/(¾JÀw$6ÊJ¯s «`XuÏwùWm¡R,Ú}ØeÉgxGUì#õ½l 1ÔøJE kTÏ-xô¾C© ;Ñyå@À\\f1ö'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #76
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #87
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
    //   68: ldc 'ºê»pg42UjÖ÷\\fËg|¦ÎÇ=cKÑg]ñ¶H²½Ý"»sýT@3¨ræùhkeLNJ úûx¢ceüýbÅèagÙÙ ÌÁôn^_!ñð'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #121
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
    //   129: putstatic burp/Zzkr.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzkr.b : [Ljava/lang/String;
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
    //   212: bipush #11
    //   214: goto -> 244
    //   217: bipush #12
    //   219: goto -> 244
    //   222: bipush #115
    //   224: goto -> 244
    //   227: bipush #59
    //   229: goto -> 244
    //   232: bipush #9
    //   234: goto -> 244
    //   237: bipush #64
    //   239: goto -> 244
    //   242: bipush #44
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
    int i = (paramInt1 ^ 0xFFFFB641) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzkr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */