package burp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zto;
import net.portswigger.Zuh;

class Zx8h {
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zt(Object paramObject, boolean paramBoolean, Zrfx<Ze5l> paramZrfx, Zrfx<Zsdr> paramZrfx1, Zzwo<Zsdr, Ztqz> paramZzwo) {
    int i = Zjr.ZH1();
    if (!(paramObject instanceof Zr2a)) {
      Zuh.Zb(false, Zqf.Zk);
      return false;
    } 
    Zr2a zr2a = (Zr2a)paramObject;
    Set<String> set = Za(zr2a);
    if (!paramBoolean && !paramZrfx.contains(Ze5l.Zg(set, "&")))
      return false; 
    if (paramZrfx1 != null && !set.containsAll((Collection)paramZrfx1.stream().map(Zsdr::toString).collect(Collectors.toSet())))
      return false; 
    for (Zto<Object, String> zto : Ze(zr2a)) {
      Ztqz ztqz = paramZzwo.Zd(new Zw_((String)zto.Zo));
      if (ztqz == null)
        continue; 
      if (!ztqz.Zm(zto.Zq))
        return false; 
      if (i == 0)
        break; 
    } 
    return true;
  }
  
  static void ZW(Object paramObject, boolean paramBoolean, Zrfx<Ze5l> paramZrfx, Zrfx<Zsdr> paramZrfx1, Zzwo<Zsdr, Ztqz> paramZzwo, Runnable paramRunnable, Consumer<Zrfx<Zsdr>> paramConsumer, Zr_4 paramZr_4) {
    int i = Zjr.ZH1();
    if (!(paramObject instanceof Zr2a)) {
      Zuh.Zb(false, Zqf.Zk);
      return;
    } 
    Zr2a zr2a = (Zr2a)paramObject;
    Set<String> set = Za(zr2a);
    Ze(set, paramBoolean, paramZrfx, paramRunnable);
    ZL(zr2a, paramZzwo, paramZr_4);
    if (paramZrfx1 == null) {
      paramConsumer.accept(Zr(zr2a, paramZr_4));
      if (i == 0) {
        paramZrfx1.retainAll((Collection)set.stream().map(Zw_::new).collect(Collectors.toSet()));
        return;
      } 
      return;
    } 
    paramZrfx1.retainAll((Collection)set.stream().map(Zw_::new).collect(Collectors.toSet()));
  }
  
  private static void Ze(Set<String> paramSet, boolean paramBoolean, Zrfx<Ze5l> paramZrfx, Runnable paramRunnable) {
    int i = Zjr.ZH5();
    if (!paramBoolean) {
      if (paramZrfx.size() >= 10) {
        paramRunnable.run();
        paramZrfx.clear();
        if (i != 0) {
          paramZrfx.add(Ze5l.Zg(paramSet, "&"));
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    paramZrfx.add(Ze5l.Zg(paramSet, "&"));
  }
  
  private static void ZL(Zr2a paramZr2a, Zzwo<Zsdr, Ztqz> paramZzwo, Zr_4 paramZr_4) {
    int i = Zjr.ZH5();
    for (Zto<Object, String> zto : Ze(paramZr2a)) {
      String str = (String)zto.Zo;
      Ztqz ztqz = paramZzwo.Zd(new Zw_(str));
      if (ztqz == null) {
        ztqz = paramZr_4.<Ztqz>ZH(new Zbwz());
        paramZzwo.Zu(paramZr_4.Zz(str), ztqz);
      } 
      ztqz.ZG(zto.Zq);
      if (i != 0)
        break; 
    } 
  }
  
  private static Set<String> Za(Zr2a paramZr2a) {
    HashSet<String> hashSet = new HashSet();
    null = paramZr2a.Zts().iterator();
    int i = Zjr.ZH5();
    while (null.hasNext()) {
      Zt8g zt8g = null.next();
      hashSet.add(zt8g.Zns());
      if (i != 0)
        break; 
    } 
    for (Zz_b zz_b : paramZr2a.Zta()) {
      hashSet.add(zz_b.ZMm());
      if (i != 0)
        break; 
    } 
    return hashSet;
  }
  
  private static List<Zto<Object, String>> Ze(Zr2a paramZr2a) {
    LinkedList<Zto<Object, String>> linkedList = new LinkedList();
    Objects.requireNonNull(linkedList);
    paramZr2a.Zts().stream().map(Zx8h::lambda$parameterAndNameTuples$0).forEach(linkedList::add);
    Objects.requireNonNull(linkedList);
    paramZr2a.Zta().stream().map(Zx8h::lambda$parameterAndNameTuples$1).forEach(linkedList::add);
    return linkedList;
  }
  
  private static Zrfx<Zsdr> Zr(Zr2a paramZr2a, Zr_4 paramZr_4) {
    Zrfx<Zgpi> zrfx = Ztzb.ZD(paramZr_4, Zsdr.Zo);
    Objects.requireNonNull(paramZr_4);
    Objects.requireNonNull(zrfx);
    Za(paramZr2a).stream().map(paramZr_4::Zz).forEach(zrfx::add);
    return (Zrfx)zrfx;
  }
  
  static String ZN(Zzwo<Zsdr, Ztqz> paramZzwo, Zrfx<Zsdr> paramZrfx, Zrfx<Ze5l> paramZrfx1, boolean paramBoolean) {
    boolean bool = paramBoolean;
    String str1 = String.valueOf(paramZrfx1);
    String str2 = String.valueOf(paramZrfx);
    String str3 = String.valueOf(paramZzwo);
    return a(-25897, 21246) + a(-25897, 21246) + str3 + a(-25900, -18072) + str2 + a(-25898, -21058) + str1 + a(-25899, -593) + bool;
  }
  
  private static Zto lambda$parameterAndNameTuples$1(Zz_b paramZz_b) {
    return Zto.ZM(paramZz_b, paramZz_b.ZMm());
  }
  
  private static Zto lambda$parameterAndNameTuples$0(Zt8g paramZt8g) {
    return Zto.ZM(paramZt8g, paramZt8g.Zns());
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ùº72ZÝÕÔ"±Ö@H-HÖOPÜõCü1éï/º\ÖüUýQ¥eÁ ÃB\\fÎóZG]'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #15
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #45
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
    //   67: ldc 'c~aèµ®ªúåï}Ôo&´¾ÅÓÙ2rÙsêáøHò92bò®¨x\\r'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #88
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zx8h.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zx8h.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #13
    //   219: goto -> 244
    //   222: bipush #77
    //   224: goto -> 244
    //   227: bipush #38
    //   229: goto -> 244
    //   232: bipush #38
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #126
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9AD6) & 0xFFFF;
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
      char c = ' ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx8h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */