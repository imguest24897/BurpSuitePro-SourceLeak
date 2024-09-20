package burp;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.jetbrains.annotations.VisibleForTesting;

public class Zec implements Zehc {
  static final List<Zko7> ZJ;
  
  static final Set<String> ZE;
  
  private final Zti_ ZR;
  
  private final Zz_9 Zc;
  
  private final Ze3n Zl;
  
  private final Ztwv ZX;
  
  private final Zb6q Zs;
  
  private final Zs68 ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zec(Zz_9 paramZz_9, Ze3n paramZe3n, Ztwv paramZtwv, Zbnt paramZbnt) {
    this(paramZz_9, paramZe3n, new Zti_(), paramZtwv, paramZbnt);
  }
  
  @VisibleForTesting
  public Zec(Zz_9 paramZz_9, Ze3n paramZe3n, Zti_ paramZti_, Ztwv paramZtwv, Zbnt paramZbnt) {
    this.ZR = paramZti_;
    int i = Zmd3.Zd();
    this.Zc = paramZz_9;
    this.Zl = paramZe3n;
    this.ZX = paramZtwv;
    List<Zb6q> list = paramZe3n.Zi();
    this.Zs = list.get(list.size() - 1);
    this.ZB = Zbwc.Zt(paramZe3n.ZA().ZF(), this.Zs.Za(), Zt0k.HTML_ANALYSIS, paramZbnt);
    if (i == 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zgq<Zrdb> ZC() {
    List<Ztu8> list1 = ZO();
    List<Ztu8> list2 = ZY(list1);
    List<Zxf> list = (List)list2.stream().map(this::Zj).filter(Zec::lambda$scanHtml$0).collect(Collectors.toList());
    return Zlkp.ZR(list, this.Zl, list1);
  }
  
  private List<Ztu8> ZO() {
    return (this.ZB.Zd == null) ? Collections.<Ztu8>emptyList() : (List<Ztu8>)this.ZB.Zd.stream().filter(Zec::lambda$findScriptUrlsInHTML$1).filter(Zec::lambda$findScriptUrlsInHTML$2).collect(Collectors.toList());
  }
  
  public Predicate<Ztu8> ZU(Function<Ztu8, String> paramFunction) {
    // Byte code:
    //   0: invokestatic newKeySet : ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    //   3: astore_2
    //   4: aload_2
    //   5: aload_1
    //   6: <illegal opcode> test : (Ljava/util/Set;Ljava/util/function/Function;)Ljava/util/function/Predicate;
    //   11: areturn
  }
  
  private List<Ztu8> ZY(List<Ztu8> paramList) {
    return (List<Ztu8>)paramList.stream().filter(ZU(Zec::lambda$findDistinctScriptsInHtml$4)).collect(Collectors.toList());
  }
  
  public Zxf Zj(Ztu8 paramZtu8) {
    String str = paramZtu8.ZlP().ZIm(a(-30452, 19897)).ZQG();
    List<Zsje> list = this.ZR.Zr(str, ZJ);
    if (list.size() == 0) {
      String str1 = ZV(str);
      list = this.ZR.ZJ(str1, ZJ);
    } 
    return new Zxf(paramZtu8, list);
  }
  
  static boolean Zl(String paramString) {
    return !ZE.contains(paramString);
  }
  
  public Zgq<Zrdb> Zh() {
    return ZC(ZJ);
  }
  
  public Zgq<Zrdb> ZL(List<Zko7> paramList) {
    Zgq<Zgpi> zgq = new Zgq<>();
    String str = this.Zl.ZN();
    List<Zsje> list = this.ZR.Zr(str, paramList);
    if (list.isEmpty()) {
      String str1 = ZV(str);
      list = this.ZR.ZJ(str1, paramList);
    } 
    zgq.ZF((Zgq)Zlkp.Zr(list, this.Zl));
    return (Zgq)zgq;
  }
  
  public Zgq<Zrdb> ZR(List<Zko7> paramList) {
    int j = Math.min(this.Zs.ZF(), 1000000);
    String str = this.Zs.Za().Zb(this.Zs.Zs(), j).Zis();
    int i = Zmd3.Zd();
    List<Ztba> list = this.ZR.ZK(str, this.Zl.ZA().ZF().Zdw(), paramList, this.ZX, this.Zs.Zs());
    if (Zbqc.Zwu() == null)
      Zmd3.Zn(++i); 
    return Zlkp.ZG(list, this.Zl);
  }
  
  @VisibleForTesting
  public Zgq<Zrdb> ZC(List<Zko7> paramList) {
    Zgq<Zrdb> zgq = ZL(paramList);
    if (zgq.Zn())
      zgq = ZR(paramList); 
    return zgq;
  }
  
  private static String ZV(String paramString) {
    if (paramString.isEmpty())
      return ""; 
    int i = paramString.lastIndexOf('/');
    return paramString.substring((i < 0) ? 1 : (i + 1));
  }
  
  public Ztk8 Zb() {
    if (this.Zc.Zr(Zzu2.VULNERABLE_JAVASCRIPT_DEPENDENCY)) {
      Zgq<Zrdb> zgq = null;
      if (Zf()) {
        zgq = Zh();
      } else if (ZJ()) {
        zgq = ZC();
      } 
      if (zgq != null && !zgq.Zn())
        return Ztk8.Zy(zgq); 
    } 
    return Ztk8.ZD();
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_VulnerableJsLibraries;
  }
  
  private boolean Zf() {
    String str = new String(this.Zl.ZA().ZF().Zd4());
    return str.endsWith(a(-30453, 28780)) ? true : Zk8m.Zw(this.ZB.ZH);
  }
  
  private boolean ZJ() {
    String str = new String(this.Zl.ZA().ZF().Zd4());
    return (str.endsWith(a(-30451, -18588)) || str.endsWith(a(-30455, -2494))) ? true : Zk8m.Zp(this.ZB.ZH);
  }
  
  private static String lambda$findDistinctScriptsInHtml$4(Ztu8 paramZtu8) {
    return paramZtu8.ZlP().ZIm(a(-30452, 19897)).ZQG();
  }
  
  private static boolean lambda$distinctBySrc$3(Set paramSet, Function paramFunction, Ztu8 paramZtu8) {
    return paramSet.add(paramFunction.apply(paramZtu8));
  }
  
  private static boolean lambda$findScriptUrlsInHTML$2(Ztu8 paramZtu8) {
    return (paramZtu8.ZlP().ZIm(a(-30454, -28141)) != null);
  }
  
  private static boolean lambda$findScriptUrlsInHTML$1(Ztu8 paramZtu8) {
    return (paramZtu8.ZlP() != null && paramZtu8.ZlP().ZJ3().equalsIgnoreCase(a(-30456, -12736)));
  }
  
  private static boolean lambda$scanHtml$0(Zxf paramZxf) {
    return !paramZxf.Zn().isEmpty();
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¤åQ²9³Q#JvEì\'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #123
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc ';\\t\\tãüx'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #62
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
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
    //   127: putstatic burp/Zec.a : [Ljava/lang/String;
    //   130: bipush #6
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zec.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #44
    //   214: goto -> 243
    //   217: iconst_5
    //   218: goto -> 243
    //   221: bipush #27
    //   223: goto -> 243
    //   226: bipush #121
    //   228: goto -> 243
    //   231: bipush #28
    //   233: goto -> 243
    //   236: bipush #24
    //   238: goto -> 243
    //   241: bipush #32
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: new burp/Zs7z
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: invokevirtual Zi : ()Ljava/util/List;
    //   310: putstatic burp/Zec.ZJ : Ljava/util/List;
    //   313: new burp/Zs7z
    //   316: dup
    //   317: invokespecial <init> : ()V
    //   320: invokevirtual ZD : ()Ljava/util/Set;
    //   323: putstatic burp/Zec.ZE : Ljava/util/Set;
    //   326: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8909) & 0xFFFF;
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
      char c = 'Ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zec.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */