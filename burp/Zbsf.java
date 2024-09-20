package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Z_j;
import net.portswigger.Zkv;
import net.portswigger.Zrm7;
import net.portswigger.Zrmr;
import net.portswigger.Zs7;
import net.portswigger.Zt0;
import net.portswigger.Zu7;
import net.portswigger.Zu9;
import net.portswigger.Zuo;
import net.portswigger.Zv2;
import net.portswigger.Zzx;
import net.portswigger.Zzz;

public class Zbsf extends Z_j {
  private final String Zb;
  
  private final Zg1z ZW;
  
  private final String ZS;
  
  private final List<List<Zxr2>> ZZ = new ArrayList<>();
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zbsf(String paramString1, Zg1z paramZg1z, String paramString2) {
    this.Zb = paramString1;
    this.ZW = paramZg1z;
    this.ZS = paramString2;
  }
  
  void Z_(Consumer<String> paramConsumer) {
    this.ZZ.stream().filter(this::lambda$observePermutations$0).map(Zbsf::Zd).forEach(paramConsumer);
  }
  
  private boolean Zp(List<Zxr2> paramList) {
    return paramList.stream().anyMatch(this::lambda$hasUnsupportedPart$1);
  }
  
  private static String Zd(List<Zxr2> paramList) {
    return paramList.stream().map(Zxr2::ZT).collect(Collectors.joining());
  }
  
  public void Zg(Zu9 paramZu9) {
    Zbs8 zbs8 = new Zbs8(paramZu9.ZZM(), paramZu9.ZZa(), this.ZS);
    paramZu9.ZZ9().ZF((Zuo)zbs8);
    List<Zxr2> list = zbs8.Zq();
    if (!list.isEmpty())
      ZZ(list); 
  }
  
  public void Zc(Zrm7 paramZrm7) {
    Zv((Zu7<?>)paramZrm7);
  }
  
  public void ZE(Zzx paramZzx) {
    Zv((Zu7<?>)paramZzx);
  }
  
  public void ZT(Zkv paramZkv) {
    Zv((Zu7<?>)paramZkv);
  }
  
  private void Zv(Zu7<?> paramZu7) {
    ZZ(Collections.singletonList(Zxr2.Za(paramZu7.Zw())));
  }
  
  private void ZZ(List<Zxr2> paramList) {
    ArrayList<List<Zxr2>> arrayList = new ArrayList<>(this.ZZ);
    this.ZZ.clear();
    int[] arrayOfInt = Zrc8.Zp();
    if (arrayList.isEmpty()) {
      Objects.requireNonNull(this.ZZ);
      paramList.stream().map(Zbsf::lambda$visitPermutations$2).forEach(this.ZZ::add);
      if (arrayOfInt == null) {
        Objects.requireNonNull(this.ZZ);
        arrayList.stream().flatMap(paramList::lambda$visitPermutations$4).forEachOrdered(this.ZZ::add);
        return;
      } 
      return;
    } 
    Objects.requireNonNull(this.ZZ);
    arrayList.stream().flatMap(paramList::lambda$visitPermutations$4).forEachOrdered(this.ZZ::add);
  }
  
  public void ZY(Zs7 paramZs7) {
    ZO((Zv2<Number>)paramZs7);
  }
  
  public void ZC(Zrmr paramZrmr) {
    ZZ(ZG(b(-18733, 15754), paramZrmr.Zmk(), paramZrmr.Zm9()));
  }
  
  public void Zz(Zzz paramZzz) {
    ZO((Zv2<Number>)paramZzz);
  }
  
  private <T extends Number> void ZO(Zv2<T> paramZv2) {
    ArrayList<Number> arrayList = new ArrayList();
    if (paramZv2.min() != null)
      arrayList.add(paramZv2.min()); 
    if (paramZv2.max() != null)
      arrayList.add(paramZv2.max()); 
    if (paramZv2.examples().isEmpty() && arrayList.isEmpty()) {
      ZZ(List.of(Zxr2.Za(Integer.valueOf(0)), Zxr2.Za(Integer.valueOf(1))));
      return;
    } 
    ZZ(ZG(b(-18735, -3242), paramZv2.examples(), arrayList));
  }
  
  public void Zr(Zt0 paramZt0) {
    ZZ(ZG(b(-18736, -32564), paramZt0.Zgl(), Arrays.asList((Object[])new Boolean[] { Boolean.valueOf(false), Boolean.valueOf(true) })));
  }
  
  private List<Zxr2> ZG(String paramString, List<?> paramList1, List<?> paramList2) {
    List<Zxr2> list = Stream.concat(paramList1.stream(), paramList2.stream()).distinct().map(Zxr2::Za).toList();
    return list.isEmpty() ? List.of(Zxr2.ZO(paramString + paramString)) : list;
  }
  
  protected void Zq(String paramString) {
    this.ZZ.forEach(paramString::lambda$visitUnsupportedType$5);
  }
  
  private static void lambda$visitUnsupportedType$5(String paramString, List<Zxr2> paramList) {
    paramList.add(Zxr2.ZO(paramString));
  }
  
  private static Stream lambda$visitPermutations$4(List paramList1, List paramList2) {
    return paramList1.stream().map(paramList2::lambda$visitPermutations$3);
  }
  
  private static LinkedList lambda$visitPermutations$3(List<?> paramList, Zxr2 paramZxr2) {
    LinkedList<Zxr2> linkedList = new LinkedList(paramList);
    linkedList.add(paramZxr2);
    return linkedList;
  }
  
  private static LinkedList lambda$visitPermutations$2(Zxr2 paramZxr2) {
    return new LinkedList(Collections.singletonList(paramZxr2));
  }
  
  private boolean lambda$hasUnsupportedPart$1(Zxr2 paramZxr2) {
    if (paramZxr2.ZW()) {
      this.ZW.Zc(this.Zb, paramZxr2.Zq());
      return true;
    } 
    return false;
  }
  
  private boolean lambda$observePermutations$0(List<Zxr2> paramList) {
    return !Zp(paramList);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'æ°oùûH81l¿oæ\\\t¹è%Ù¢Ñ\\bN3Bw'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #33
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #126
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
    //   67: ldc '®írj¾(×pxÞ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #7
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_2
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
    //   127: putstatic burp/Zbsf.c : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zbsf.d : [Ljava/lang/String;
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
    //   208: bipush #51
    //   210: goto -> 240
    //   213: bipush #117
    //   215: goto -> 240
    //   218: bipush #121
    //   220: goto -> 240
    //   223: bipush #65
    //   225: goto -> 240
    //   228: bipush #93
    //   230: goto -> 240
    //   233: bipush #26
    //   235: goto -> 240
    //   238: bipush #43
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
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB6D2) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = '®';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbsf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */