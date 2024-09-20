package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zet2 {
  private final List<Ztnj> Zs;
  
  private int Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zet2(List<String> paramList, List<Integer> paramList1, int paramInt) {
    this.Zs = Zu(paramList, paramList1, paramInt);
    this.Zg = paramInt;
  }
  
  List<Ztnj> ZK() {
    return this.Zs;
  }
  
  Ztnj Zo(int paramInt) {
    return this.Zs.get(paramInt);
  }
  
  Ztnj ZD() {
    return this.Zs.get(this.Zs.size() - 1);
  }
  
  String ZJ(String paramString) {
    int[] arrayOfInt = Zb6u.ZI();
    for (Ztnj ztnj : this.Zs) {
      if (ztnj.Zh().equalsIgnoreCase(paramString))
        return ztnj.Z_(); 
      if (arrayOfInt != null)
        break; 
    } 
    return null;
  }
  
  Zga7 ZW(String paramString1, String paramString2) {
    Ztnj ztnj = Ztnj.Zx(paramString1, paramString2, ZZ());
    this.Zs.add(ztnj);
    Zga7 zga7 = new Zga7(ztnj.Zn, ztnj.ZU());
    this.Zg += zga7.Zy();
    return zga7;
  }
  
  Zrif Za(int paramInt, String paramString1, String paramString2) {
    Ztnj ztnj1 = this.Zs.get(paramInt);
    Ztnj ztnj2 = Ztnj.Zx(paramString1, paramString2, ztnj1.Zn);
    return Zf(paramInt, ztnj1, ztnj2);
  }
  
  List<Zmg4> ZJ(List<Integer> paramList) {
    ArrayList<Zmg4> arrayList = new ArrayList();
    ArrayList<Integer> arrayList1 = new ArrayList<>(paramList);
    arrayList1.sort(Comparator.reverseOrder());
    Iterator<Integer> iterator = arrayList1.iterator();
    int[] arrayOfInt = Zb6u.ZI();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      Ztnj ztnj = this.Zs.remove(i);
      Zmg4 zmg4 = new Zmg4(ztnj.Zn, ztnj.ZB);
      ZV(i, zmg4.Zy());
      arrayList.add(zmg4);
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
  
  void Za(int paramInt1, int paramInt2) {
    Ztnj ztnj1 = this.Zs.get(paramInt1);
    Ztnj ztnj2 = this.Zs.get(paramInt2);
    int i = ztnj2.Zb();
    int j = -ztnj1.Zb();
    ztnj1 = ztnj1.Zy(i);
    ztnj2 = ztnj2.Zy(j);
    this.Zs.set(paramInt1, ztnj2);
    this.Zs.set(paramInt2, ztnj1);
  }
  
  List<Zxeq> Zd(String paramString) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZI : ()[I
    //   11: iconst_0
    //   12: istore #4
    //   14: astore_2
    //   15: iconst_0
    //   16: istore #5
    //   18: iload #5
    //   20: aload_0
    //   21: getfield Zs : Ljava/util/List;
    //   24: invokeinterface size : ()I
    //   29: if_icmpge -> 115
    //   32: aload_0
    //   33: getfield Zs : Ljava/util/List;
    //   36: iload #5
    //   38: invokeinterface get : (I)Ljava/lang/Object;
    //   43: checkcast burp/Ztnj
    //   46: astore #6
    //   48: aload #6
    //   50: invokevirtual ZA : ()Z
    //   53: ifeq -> 108
    //   56: iload #4
    //   58: ifne -> 65
    //   61: aload_1
    //   62: ifnonnull -> 91
    //   65: aload_3
    //   66: aload_0
    //   67: iload #5
    //   69: iinc #5, -1
    //   72: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   75: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   78: invokevirtual ZJ : (Ljava/util/List;)Ljava/util/List;
    //   81: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   86: pop
    //   87: aload_2
    //   88: ifnull -> 108
    //   91: aload_3
    //   92: aload_0
    //   93: iload #5
    //   95: aload_1
    //   96: invokevirtual ZC : (ILjava/lang/String;)Lburp/Zrif;
    //   99: invokeinterface add : (Ljava/lang/Object;)Z
    //   104: pop
    //   105: iconst_1
    //   106: istore #4
    //   108: iinc #5, 1
    //   111: aload_2
    //   112: ifnull -> 18
    //   115: iload #4
    //   117: ifne -> 170
    //   120: aload_1
    //   121: ifnull -> 170
    //   124: aload_1
    //   125: aload_0
    //   126: invokevirtual ZZ : ()I
    //   129: invokestatic ZX : (Ljava/lang/String;I)Lburp/Ztnj;
    //   132: astore #5
    //   134: aload_0
    //   135: getfield Zs : Ljava/util/List;
    //   138: aload #5
    //   140: invokeinterface add : (Ljava/lang/Object;)Z
    //   145: pop
    //   146: aload_3
    //   147: new burp/Zga7
    //   150: dup
    //   151: aload #5
    //   153: getfield Zn : I
    //   156: aload #5
    //   158: invokevirtual ZU : ()[B
    //   161: invokespecial <init> : (I[B)V
    //   164: invokeinterface add : (Ljava/lang/Object;)Z
    //   169: pop
    //   170: aload_3
    //   171: areturn
  }
  
  Zxeq Zw(String paramString) {
    int[] arrayOfInt = Zb6u.ZI();
    byte b = 0;
    while (b < this.Zs.size()) {
      Ztnj ztnj = this.Zs.get(b);
      if (ztnj.Zh().equalsIgnoreCase(a(-23780, -83)))
        return Za(b, ztnj.Zh(), paramString); 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return ZW(a(-23779, 16700), paramString);
  }
  
  private Zrif ZC(int paramInt, String paramString) {
    Ztnj ztnj1 = this.Zs.get(paramInt);
    Ztnj ztnj2 = Ztnj.ZX(paramString, ztnj1.Zn);
    return Zf(paramInt, ztnj1, ztnj2);
  }
  
  private Zrif Zf(int paramInt, Ztnj paramZtnj1, Ztnj paramZtnj2) {
    this.Zs.set(paramInt, paramZtnj2);
    Zrif zrif = new Zrif(paramZtnj1.Zn, paramZtnj1.ZB, paramZtnj2.ZU());
    ZV(paramInt + 1, zrif.Zy());
    return zrif;
  }
  
  void Zu(int paramInt) {
    ZV(0, paramInt);
  }
  
  private void ZV(int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zb6u.ZI();
    if (paramInt2 == 0)
      return; 
    this.Zg += paramInt2;
    int i = paramInt1;
    while (i < this.Zs.size()) {
      this.Zs.set(i, ((Ztnj)this.Zs.get(i)).Zy(paramInt2));
      i++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private static List<Ztnj> Zu(List<String> paramList, List<Integer> paramList1, int paramInt) {
    int[] arrayOfInt = Zb6u.ZI();
    Zuh.Zb((paramList.size() == paramList1.size()), Zqf.Zr);
    ArrayList<Ztnj> arrayList = new ArrayList();
    int i = paramList.size() - 1;
    byte b = 1;
    while (b < i) {
      arrayList.add(Ztnj.Zi(paramList.get(b), ((Integer)paramList1.get(b)).intValue(), ((Integer)paramList1.get(b + 1)).intValue()));
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    if (i > 0)
      arrayList.add(Ztnj.Zi(paramList.get(i), ((Integer)paramList1.get(i)).intValue(), paramInt)); 
    return arrayList;
  }
  
  private int ZZ() {
    return this.Zs.isEmpty() ? this.Zg : (ZD()).ZB;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'dß9®ÔlÚí\\fï}lO^J=¦¯¨'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #12
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #118
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zet2.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zet2.b : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #42
    //   154: goto -> 183
    //   157: bipush #70
    //   159: goto -> 183
    //   162: bipush #13
    //   164: goto -> 183
    //   167: bipush #102
    //   169: goto -> 183
    //   172: bipush #86
    //   174: goto -> 183
    //   177: bipush #87
    //   179: goto -> 183
    //   182: iconst_5
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA31D) & 0xFFFF;
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
      byte b1 = 91;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zet2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */