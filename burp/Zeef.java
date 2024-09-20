package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.swing.KeyStroke;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zeef implements Zm3g {
  private final Map<String, Ztde> Zr = new HashMap<>();
  
  private final Map<Integer, KeyStroke> Zw;
  
  private final Zr0t ZP;
  
  private final Zs4c ZR;
  
  private final List<Zl1c> Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zeef(Zs4c paramZs4c, List<Zl1c> paramList) {
    this(Ztsr.Zg, paramZs4c, paramList);
  }
  
  Zeef(Zr0t paramZr0t, Zs4c paramZs4c, List<Zl1c> paramList) {
    Zbqc[] arrayOfZbqc = Ztsr.Zb();
    this.Zw = new HashMap<>();
    this.ZP = paramZr0t;
    this.ZR = paramZs4c;
    this.Zx = paramList;
    for (Zl1c zl1c : paramList) {
      Zc(zl1c.Zs(), zl1c.Zt(), zl1c.ZA());
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void Zc(int paramInt1, int paramInt2, int paramInt3) {
    String str = Zsqw.ZO(Zsqw.Zz | paramInt1, paramInt2);
    Ztde ztde = this.ZP.Zo(paramInt3);
    Zuh.ZT((null == this.Zr.get(str)), Zqf.Zq, str);
    Zuh.ZY((null == this.Zw.get(Integer.valueOf(ztde.ZH()))), Zqf.Zq, ztde.ZH(), ztde.Zb());
    this.Zr.put(str, ztde);
    this.Zw.put(Integer.valueOf(paramInt3), Ztsr.ZW(paramInt1, paramInt2));
  }
  
  KeyStroke ZO(int paramInt) {
    return this.Zw.get(Integer.valueOf(paramInt));
  }
  
  Ztde ZS(String paramString) {
    return this.Zr.get(paramString);
  }
  
  Integer Z_(String paramString) {
    Ztde ztde = ZS(paramString);
    return (ztde == null) ? null : Integer.valueOf(ztde.ZH());
  }
  
  void Ze(Map<Integer, KeyStroke> paramMap) {
    ZM();
    Iterator<Integer> iterator = paramMap.keySet().iterator();
    Zbqc[] arrayOfZbqc = Ztsr.Zb();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      KeyStroke keyStroke = paramMap.get(Integer.valueOf(i));
      Zc(keyStroke.getModifiers(), keyStroke.getKeyCode(), i);
      this.Zx.add(new Zl1c(i, true, keyStroke.getKeyCode(), keyStroke.getModifiers(), this.ZP));
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  void ZW(List<Zl1c> paramList) {
    ZM();
    Iterator<Zl1c> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = Ztsr.Zb();
    while (iterator.hasNext()) {
      Zl1c zl1c = iterator.next();
      if (zl1c != null && zl1c.ZC() != null) {
        Zc(zl1c.Zs(), zl1c.Zt(), zl1c.ZA());
        this.Zx.add(zl1c);
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public List<Zl1c> ZU(boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = Ztsr.Zb();
    ArrayList<Zl1c> arrayList = new ArrayList();
    if (paramBoolean)
      for (Ztde ztde : this.ZP.ZB()) {
        if (!this.Zw.containsKey(Integer.valueOf(ztde.ZH())))
          arrayList.add(new Zl1c(ztde, null)); 
        if (arrayOfZbqc == null)
          break; 
      }  
    arrayList.addAll(this.Zx);
    Collections.sort(arrayList);
    return arrayList;
  }
  
  private void ZM() {
    this.Zr.clear();
    this.Zw.clear();
    this.Zx.clear();
  }
  
  public void Zd(Zmf_ paramZmf_) {
    Zbqc[] arrayOfZbqc = Ztsr.Zb();
    List<?> list = paramZmf_.Zs(a(-21699, -9371), new Zewt(this.ZP));
    if (list != null) {
      List<Zl1c> list1 = Zc((List)list, ZV(this.ZR, this.ZP));
      ArrayList<Zl1c> arrayList = new ArrayList();
      HashSet<KeyStroke> hashSet = new HashSet();
      for (Zl1c zl1c : list1) {
        if (hashSet.contains(zl1c.ZC()))
          continue; 
        hashSet.add(zl1c.ZC());
        arrayList.add(zl1c);
        if (arrayOfZbqc == null)
          break; 
      } 
      ZW(arrayList);
    } 
  }
  
  public void Zl(Zg4j paramZg4j) {
    Zn(paramZg4j, this.ZR, this.Zx, this.ZP);
  }
  
  public static void Zn(Zg4j paramZg4j, Zs4c paramZs4c, List<Zl1c> paramList, Zr0t paramZr0t) {
    List<Zl1c> list = Zl(paramList, ZV(paramZs4c, paramZr0t), paramZr0t);
    ZC(paramZg4j, list, paramZr0t);
  }
  
  private static void ZC(Zg4j paramZg4j, List<Zl1c> paramList, Zr0t paramZr0t) {
    Zzqw zzqw = paramZg4j.ZP(a(-21699, -9371));
    ArrayList<Zl1c> arrayList = new ArrayList<>(paramList);
    Collections.sort(arrayList);
    Iterator<Zl1c> iterator = arrayList.iterator();
    Zbqc[] arrayOfZbqc = Ztsr.Zb();
    while (iterator.hasNext()) {
      Zl1c zl1c = iterator.next();
      String str = paramZr0t.ZH(zl1c.ZA());
      if (!zl1c.Ze() && str != null) {
        String str1 = (zl1c.Zs() == -1 && zl1c.Zt() == -1) ? "" : Zsqw.ZO(zl1c.Zs(), zl1c.Zt());
        Zzqp zzqp = zzqw.Zc();
        zzqp.Zm(a(-21698, 16789), str);
        zzqp.Zm(a(-21697, 5693), str1);
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private static List<Zl1c> ZV(Zs4c paramZs4c, Zr0t paramZr0t) {
    if (paramZs4c == null)
      return Collections.emptyList(); 
    Zmf_ zmf_ = paramZs4c.ZD(new String[] { a(-21700, 12014) });
    List<T> list = (zmf_ == null) ? Collections.<T>emptyList() : zmf_.<T>Zs(a(-21699, -9371), new Zewt(paramZr0t));
    return (list == null) ? Collections.<Zl1c>emptyList() : (List)list;
  }
  
  private static List<Zl1c> Zc(List<Zl1c> paramList1, List<Zl1c> paramList2) {
    if (paramList2.isEmpty())
      return paramList1; 
    ArrayList<Zl1c> arrayList = new ArrayList<>(paramList1);
    Set set = (Set)paramList1.stream().map(Zl1c::ZA).collect(Collectors.toSet());
    Map map = (Map)paramList1.stream().filter(Zeef::lambda$hotkeysWithAddedDefaults$0).collect(Collectors.toMap(Zl1c::ZC, Function.identity()));
    List list = paramList2.stream().filter(set::lambda$hotkeysWithAddedDefaults$1).toList();
    Objects.requireNonNull(arrayList);
    list.stream().filter(map::lambda$hotkeysWithAddedDefaults$2).forEach(arrayList::add);
    return arrayList;
  }
  
  private static List<Zl1c> Zl(List<Zl1c> paramList1, List<Zl1c> paramList2, Zr0t paramZr0t) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface isEmpty : ()Z
    //   6: ifeq -> 11
    //   9: aload_0
    //   10: areturn
    //   11: new java/util/ArrayList
    //   14: dup
    //   15: aload_0
    //   16: invokespecial <init> : (Ljava/util/Collection;)V
    //   19: astore_3
    //   20: aload_1
    //   21: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   26: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   31: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   36: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   41: invokestatic toCollection : (Ljava/util/function/Supplier;)Ljava/util/stream/Collector;
    //   44: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   49: checkcast java/util/Set
    //   52: astore #4
    //   54: aload_0
    //   55: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   60: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   65: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   70: aload #4
    //   72: dup
    //   73: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: <illegal opcode> accept : (Ljava/util/Set;)Ljava/util/function/Consumer;
    //   82: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   87: aload #4
    //   89: aload_3
    //   90: aload_2
    //   91: <illegal opcode> accept : (Ljava/util/List;Lburp/Zr0t;)Ljava/util/function/Consumer;
    //   96: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   101: aload_3
    //   102: areturn
  }
  
  private static void lambda$hotkeysWithRemovedDefaults$3(List<Zl1c> paramList, Zr0t paramZr0t, Integer paramInteger) {
    paramList.add(new Zl1c(paramInteger.intValue(), false, -1, -1, paramZr0t));
  }
  
  private static boolean lambda$hotkeysWithAddedDefaults$2(Map paramMap, Zl1c paramZl1c) {
    return !paramMap.containsKey(paramZl1c.ZC());
  }
  
  private static boolean lambda$hotkeysWithAddedDefaults$1(Set paramSet, Zl1c paramZl1c) {
    return !paramSet.contains(Integer.valueOf(paramZl1c.ZA()));
  }
  
  private static boolean lambda$hotkeysWithAddedDefaults$0(Zl1c paramZl1c) {
    return Objects.nonNull(paramZl1c.ZC());
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Äî^ZD¤ÊÔ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #110
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 140
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
    //   67: ldc 'Ä¬T£R¶ÄÌéºÕ;\\fM)ÁÙæå,]±.ñ¤\\bLÃboÚí+ïMûY'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #25
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_3
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
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zeef.a : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zeef.b : [Ljava/lang/String;
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
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #95
    //   210: goto -> 240
    //   213: bipush #80
    //   215: goto -> 240
    //   218: bipush #7
    //   220: goto -> 240
    //   223: bipush #50
    //   225: goto -> 240
    //   228: bipush #81
    //   230: goto -> 240
    //   233: bipush #64
    //   235: goto -> 240
    //   238: bipush #85
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 39, 0 -> 97
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAB3E) & 0xFFFF;
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
      byte b1 = 100;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeef.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */