package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import net.portswigger.browser.Zc5;
import net.portswigger.browser.Zci;

public class Zbs9 {
  private final Zmx1 ZW;
  
  private final Zxts Zh;
  
  private final Zm9o ZE;
  
  private final Ztos<Zt1w> Zy;
  
  private final List<Zs3n> Ze = new ArrayList<>();
  
  private final List<Zs3n> ZQ = new ArrayList<>();
  
  private int ZX = 1;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbs9(Zmx1 paramZmx1, Zxts paramZxts, Zm9o paramZm9o) {
    this.ZW = paramZmx1;
    this.Zh = paramZxts;
    this.ZE = paramZm9o;
    this.Zy = paramZm9o.ZW();
  }
  
  public Optional<String> Zy(Zs3n paramZs3n) {
    Optional<String> optional = paramZs3n.Zk();
    if (optional.isPresent())
      return optional; 
    int i = this.Ze.size();
    this.Ze.add(paramZs3n);
    this.ZW.Zp(i, paramZs3n);
    if (paramZs3n.ZP().startsWith(a(-547, 2394)))
      this.ZX++; 
    return Optional.empty();
  }
  
  public void ZY(int paramInt) {
    if (paramInt < 0 || paramInt >= this.Ze.size())
      return; 
    this.ZW.ZZ(paramInt, this.Ze.get(paramInt));
  }
  
  public int Zf() {
    return this.ZX;
  }
  
  public Optional<String> Zl(int paramInt, Zs3n paramZs3n) {
    if (paramInt < 0 || paramInt >= this.Ze.size())
      return Optional.empty(); 
    Optional<String> optional = paramZs3n.Zk();
    if (optional.isPresent())
      return optional; 
    this.Ze.set(paramInt, paramZs3n);
    this.ZW.ZX(paramInt, paramZs3n);
    return Optional.empty();
  }
  
  public void ZN(List<Integer> paramList) {
    ArrayList<Zs3n> arrayList = new ArrayList();
    Iterator<Integer> iterator = paramList.iterator();
    int i = Zbiv.Zd();
    while (iterator.hasNext()) {
      Integer integer = iterator.next();
      if (integer.intValue() >= 0 && integer.intValue() < this.Ze.size()) {
        Zs3n zs3n = this.Ze.get(integer.intValue());
        arrayList.add(zs3n);
        if (zs3n.ZP().startsWith(a(-551, -3196)))
          this.ZX--; 
      } 
      if (i != 0)
        break; 
    } 
    this.Ze.removeAll(arrayList);
    this.ZW.ZH(this.Ze);
  }
  
  public void ZS() {
    ArrayList<Zs3n> arrayList = new ArrayList<>(this.Ze);
    this.Ze.clear();
    this.Ze.addAll(this.ZQ);
    this.ZQ.clear();
    this.ZQ.addAll(arrayList);
    this.ZW.ZH(this.Ze);
  }
  
  public void ZR() {
    this.ZW.ZD();
  }
  
  public void ZH(Zmf_ paramZmf_) {
    if (Zg(paramZmf_))
      this.ZW.ZH(this.Ze); 
  }
  
  private boolean Zg(Zmf_ paramZmf_) {
    if (!paramZmf_.Zh(a(-546, 26916)) && !paramZmf_.Zh(a(-552, 9150)))
      return false; 
    List<?> list1 = paramZmf_.Zs(a(-550, 6037), Zs7s::ZU);
    List<?> list2 = paramZmf_.Zs(a(-549, 23044), Zko4::ZM);
    this.Ze.clear();
    this.ZQ.clear();
    if (list1 != null)
      this.Ze.addAll(list1); 
    if (list2 != null)
      this.Ze.addAll(list2); 
    return true;
  }
  
  public String ZM(String paramString) {
    return Zzqb.Za(this.Zh, paramString, Zm());
  }
  
  public Zzkm Zm() {
    Zzkm zzkm = new Zzkm();
    if (this.Ze.isEmpty())
      return zzkm; 
    Zzqw zzqw = zzkm.ZP(ZQ() ? a(-550, 6037) : a(-549, 23044));
    this.Ze.forEach(zzqw::lambda$getAppLoginConfiguration$0);
    return zzkm;
  }
  
  private boolean ZQ() {
    return this.Ze.stream().allMatch(Zbs9::lambda$loginsAreAllLoginCredentials$1);
  }
  
  public Zmpo ZO() {
    return new Zmpo(this.Ze);
  }
  
  public boolean Zd() {
    return !this.ZQ.isEmpty();
  }
  
  public String ZQ(Zgyw paramZgyw) {
    return (new Zmpo(this.Ze)).Zl(paramZgyw).orElse("");
  }
  
  public void ZH(Zz62 paramZz62) {
    this.ZW.ZF(paramZz62);
  }
  
  public Optional<String> ZY(Zg96 paramZg96) {
    return paramZg96.Zj1();
  }
  
  public void Zu(Zmle paramZmle, Zg96 paramZg96, Zrvo paramZrvo) {
    // Byte code:
    //   0: aload_0
    //   1: aload_3
    //   2: invokevirtual Zj : (Lburp/Zrvo;)Lburp/Zgrn;
    //   5: astore #4
    //   7: aload_0
    //   8: aload_2
    //   9: aload_3
    //   10: invokevirtual ZF : (Lburp/Zg96;Lburp/Zrvo;)Lburp/Zgrn;
    //   13: astore #5
    //   15: new burp/Zggg
    //   18: dup
    //   19: aload_2
    //   20: invokevirtual ZjX : ()Ljava/lang/String;
    //   23: invokespecial <init> : (Ljava/lang/String;)V
    //   26: astore #6
    //   28: aload_0
    //   29: getfield Zy : Lburp/Ztos;
    //   32: getstatic burp/Zt1w.ZK : Lburp/Zlnb;
    //   35: aload #6
    //   37: <illegal opcode> accept : (Lburp/Zggg;)Ljava/util/function/Consumer;
    //   42: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   45: astore #7
    //   47: new burp/Zt55
    //   50: dup
    //   51: sipush #-545
    //   54: sipush #27604
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: invokespecial <init> : (Ljava/lang/String;)V
    //   63: aload_0
    //   64: aload_2
    //   65: aload_1
    //   66: aload #6
    //   68: aload #4
    //   70: aload #5
    //   72: aload #7
    //   74: <illegal opcode> run : (Lburp/Zbs9;Lburp/Zg96;Lburp/Zmle;Lburp/Zggg;Lburp/Zgrn;Lburp/Zgrn;Lburp/Zgrn;)Ljava/lang/Runnable;
    //   79: invokevirtual Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   82: pop
    //   83: return
  }
  
  private Zgrn ZF(Zg96 paramZg96, Zrvo paramZrvo) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zy : Lburp/Ztos;
    //   4: getstatic burp/Zt1w.ZF : Lburp/Zlnb;
    //   7: aload_0
    //   8: aload_1
    //   9: aload_2
    //   10: <illegal opcode> accept : (Lburp/Zbs9;Lburp/Zg96;Lburp/Zrvo;)Ljava/util/function/Consumer;
    //   15: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   18: areturn
  }
  
  private Zgrn Zj(Zrvo paramZrvo) {
    return this.Zy.ZE(Zt1w.Zt, paramZrvo::lambda$subscribeToFailureEvent$6);
  }
  
  public boolean Zg(Zc5 paramZc5, String paramString) {
    Znk znk = new Znk(paramString, paramZc5.ZL());
    Optional<String> optional = Zy(znk);
    return optional.isEmpty();
  }
  
  public void ZU() {
    this.Zy.ZD(new Zxr8(Zt1w.ZK));
  }
  
  public void Zh() {
    this.ZW.Zh();
  }
  
  private static void lambda$subscribeToFailureEvent$6(Zrvo paramZrvo, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: <illegal opcode> run : (Lburp/Zxr8;Lburp/Zrvo;)Ljava/lang/Runnable;
    //   7: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private static void lambda$subscribeToFailureEvent$5(Zxr8<Zl0l> paramZxr8, Zrvo paramZrvo) {
    int i = Zbiv.Zd();
    if (paramZxr8.ZF().isPresent()) {
      paramZrvo.ZY(((Zl0l)paramZxr8.ZF().get()).ZIV());
      if (i != 0) {
        paramZrvo.ZY(Zci.EXCEEDED_MAXIMUM_RESTARTS);
        return;
      } 
      return;
    } 
    paramZrvo.ZY(Zci.EXCEEDED_MAXIMUM_RESTARTS);
  }
  
  private void lambda$subscribeToSuccessEvent$4(Zg96 paramZg96, Zrvo paramZrvo, Zxr8<Zrb0> paramZxr8) {
    int i = Zbiv.Zd();
    boolean bool = false;
    if (paramZxr8.ZF().isPresent())
      bool = Zg(((Zrb0)paramZxr8.ZF().get()).ZmR(), paramZg96.ZjQ()); 
    if (bool) {
      paramZrvo.Zr();
      if (i != 0) {
        paramZrvo.ZY(Zci.INVALID_STEP_GENERATED);
        return;
      } 
      return;
    } 
    paramZrvo.ZY(Zci.INVALID_STEP_GENERATED);
  }
  
  private void lambda$beginGeneratingRecordedLogin$3(Zg96 paramZg96, Zmle paramZmle, Zggg paramZggg, Zgrn paramZgrn1, Zgrn paramZgrn2, Zgrn paramZgrn3) {
    try {
      this.ZE.ZI(paramZg96, paramZmle, paramZggg);
    } finally {
      paramZgrn1.ZZ();
      paramZgrn2.ZZ();
      paramZgrn3.ZZ();
    } 
  }
  
  private static void lambda$beginGeneratingRecordedLogin$2(Zggg paramZggg, Zxr8 paramZxr8) {
    paramZggg.ZX();
  }
  
  private static boolean lambda$loginsAreAllLoginCredentials$1(Zs3n paramZs3n) {
    return paramZs3n instanceof Zs7s;
  }
  
  private static void lambda$getAppLoginConfiguration$0(Zzqw paramZzqw, Zs3n paramZs3n) {
    Zzqp zzqp = paramZzqw.Zc();
    paramZs3n.ZE(zzqp);
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ø1·s?á*eA)g$´%âalÂÄ®þÜ$áÎiÔ'µ¨9Ø~J¬Hä9\\nS8ÇÇ)Õ7â³Þþ8¨ÆþÞ¸ÎFÕï´ Izc!±9ÖU.óÁûw~ÿei2m³½vÀ8_î&ªðp`\\rÃslÛ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #33
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #91
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
    //   68: ldc 'jXV( ,ozOl *×ÓÊ¨:á¶Z<b3²rù.°¶°¥i3X=r{¢'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #29
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #20
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
    //   129: putstatic burp/Zbs9.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbs9.b : [Ljava/lang/String;
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
    //   212: bipush #36
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #37
    //   224: goto -> 244
    //   227: bipush #95
    //   229: goto -> 244
    //   232: bipush #6
    //   234: goto -> 244
    //   237: bipush #21
    //   239: goto -> 244
    //   242: bipush #90
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
    int i = (paramInt1 ^ 0xFFFFFDDB) & 0xFFFF;
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
      byte b1 = 90;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbs9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */