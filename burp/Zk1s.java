package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zk1s {
  private final Zt82 Zv = new Zt82();
  
  private final Collection<Zlug> ZS = new ArrayList<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zk1s Zc(Collection<Zlug> paramCollection) {
    this.ZS.addAll(paramCollection);
    return this;
  }
  
  public Zk1s Zx(Zstu paramZstu, Zs68 paramZs68) {
    Zj(paramZs68.Zb);
    ZJ(paramZs68.ZH);
    Zv(paramZs68);
    ZF(paramZs68);
    Ze(paramZstu, paramZs68);
    return this;
  }
  
  public Zk1s Zw(List<Zg8y> paramList) {
    List<Zesu> list = Arrays.asList(new Zesu[] { new Zl1w(), new Zzjy(), new Zb3y(), new Zx_c(), new Zen_(), new Zel1() });
    Iterator<Zesu> iterator = list.iterator();
    int i = Zlug.ZS();
    while (iterator.hasNext()) {
      Zesu zesu = iterator.next();
      if (!this.ZS.contains(zesu.Zr())) {
        Objects.requireNonNull(zesu);
        paramList.forEach(zesu::Zz);
        zesu.ZG(this.Zv);
      } 
      if (i == 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zlug.ZO(++i); 
    return this;
  }
  
  private void Zj(int paramInt) {
    if (this.ZS.contains(Zlug.STATUS_CODE))
      return; 
    this.Zv.Ze(Zlug.STATUS_CODE, paramInt);
  }
  
  private void ZJ(Zk8m paramZk8m) {
    Zg5s zg5s1 = new Zg5s(a(28770, -2535), Zlug.CONTENT_TYPE);
    Objects.requireNonNull(zg5s1);
    paramZk8m.Ze().forEach(zg5s1::ZB);
    int i = Zlug.ZJ();
    Zg5s zg5s2 = new Zg5s(a(28774, -32698), Zlug.CONTENT_TYPE_CHARSET);
    for (String str : paramZk8m.Zb) {
      zg5s2.ZB(str);
      if (i != 0)
        break; 
    } 
    zg5s2.Zv(this.Zv);
    zg5s1.Zv(this.Zv);
  }
  
  private void Zv(Zs68 paramZs68) {
    Zmsp zmsp = new Zmsp();
    Map map = (Map)Stream.<Zthm>of(new Zthm[] { new Zg5s(a(28775, 4667), Zlug.LOCATION), new Zg5s(a(28771, 27821), Zlug.CONTENT_LOCATION), new Zg5s(a(28773, -13415), Zlug.ETAG_HEADER), new Zeg9(), new Zg53(), new Zg5s(a(28772, 22564), Zlug.LAST_MODIFIED_HEADER), zmsp }).filter(this::lambda$populateFingerprintBuilderWithHeaderData$0).collect(Collectors.toMap(Zk1s::lambda$populateFingerprintBuilderWithHeaderData$1, Function.identity()));
    int i = Zlug.ZJ();
    for (String str1 : paramZs68.Zy()) {
      if (str1 == null)
        continue; 
      int j = str1.indexOf(':');
      if (j == -1)
        continue; 
      String str2 = str1.toLowerCase(Locale.ENGLISH).substring(0, j);
      String str3 = str1.substring(j + 1);
      Zthm zthm = (Zthm)map.get(str2);
      if (zthm != null)
        zthm.ZB(str3); 
      if (i != 0)
        break; 
    } 
    if (!zmsp.ZB())
      zmsp.ZZ(paramZs68.Zs - paramZs68.Zk); 
    for (Zthm zthm : map.values()) {
      zthm.Zv(this.Zv);
      if (i != 0)
        break; 
    } 
  }
  
  private void ZF(Zs68 paramZs68) {
    int i = Zlug.ZS();
    if (!ZW(paramZs68))
      return; 
    List<Zmky> list = Arrays.asList(new Zmky[] { 
          new Zkgl(), new Zob(), new Zglz(), new Zz2o(), new Zkfu(), new Zbxs(), new Zbpv(), new Zsi4(), new Zzq5(), new Zsx8(), 
          new Zs4w(), new Zs4n() });
    for (Zmky zmky : list) {
      if (!this.ZS.contains(zmky.Zq())) {
        Objects.requireNonNull(zmky);
        paramZs68.Zd.forEach(zmky::ZI);
        zmky.ZW(this.Zv);
      } 
      if (i == 0)
        break; 
    } 
  }
  
  private static boolean ZW(Zs68 paramZs68) {
    return (paramZs68.Zd != null && !paramZs68.Zd.isEmpty()) ? ((paramZs68.Zd.size() == 1) ? ((((Ztu8)paramZs68.Zd.get(0)).ZlD() != 3)) : true) : false;
  }
  
  private void Ze(Zstu paramZstu, Zs68 paramZs68) {
    ArrayList arrayList = new ArrayList(Arrays.asList((Object[])new Zbu2[] { new Zzk(), new Zr3h(), new Zxyo(), new Zs5h(), new Zrad(), new Zevt(), new Zln0(), new Zeab(), new Ze5y() }));
    byte[] arrayOfByte = paramZstu.ZiD();
    int i = Zlug.ZS();
    for (Zbu2 zbu2 : arrayList) {
      if (!this.ZS.contains(zbu2.ZV())) {
        zbu2.ZW(arrayOfByte, paramZs68);
        zbu2.ZB(this.Zv);
      } 
      if (i == 0)
        break; 
    } 
  }
  
  public Zs6y ZF() {
    return this.Zv.Zc();
  }
  
  private static String lambda$populateFingerprintBuilderWithHeaderData$1(Zthm paramZthm) {
    return paramZthm.Z_().toLowerCase(Locale.ENGLISH);
  }
  
  private boolean lambda$populateFingerprintBuilderWithHeaderData$0(Zthm paramZthm) {
    return !this.ZS.contains(paramZthm.ZQ());
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'JãZgXõ\\ffg<âýXQÓn,BÃK9\\r]ìjj[np³'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #58
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
    //   68: ldc 'AßjG^!#Î5}ÿ§\\f\\fß£¹Èÿ¯n?U'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #16
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #14
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
    //   129: putstatic burp/Zk1s.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zk1s.b : [Ljava/lang/String;
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
    //   212: bipush #45
    //   214: goto -> 244
    //   217: bipush #94
    //   219: goto -> 244
    //   222: bipush #109
    //   224: goto -> 244
    //   227: bipush #78
    //   229: goto -> 244
    //   232: bipush #108
    //   234: goto -> 244
    //   237: bipush #36
    //   239: goto -> 244
    //   242: bipush #110
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
    int i = (paramInt1 ^ 0x7067) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk1s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */