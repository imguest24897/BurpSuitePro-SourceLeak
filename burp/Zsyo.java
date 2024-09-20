package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zvh;

public class Zsyo implements Iterable<Zr4b> {
  private final Zb_j Zw;
  
  private final Zvh ZQ;
  
  private List<Zr4b> Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsyo(Zb_j paramZb_j) {
    this(paramZb_j, Zvh.ZU);
  }
  
  Zsyo(Zb_j paramZb_j, Zvh paramZvh) {
    this.Zw = paramZb_j;
    this.ZQ = paramZvh;
    this.Zt = new ArrayList<>();
    List<String> list1 = (new Ztyx(a(-6851, -26782), paramZb_j)).Zb();
    List<String> list2 = (new Ztyx(a(-6852, -17592), paramZb_j)).Zb();
    String[] arrayOfString = Zrk1.ZT();
    if (list1.size() != list2.size()) {
      Zuh.Zb(false, Zqf.Zx);
      ZI(Collections.emptyList(), Collections.emptyList());
      return;
    } 
    byte b = 0;
    while (b < list1.size()) {
      this.Zt.add(new Zr4b(list1.get(b), list2.get(b)));
      b++;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public Iterator<Zr4b> iterator() {
    return this.Zt.iterator();
  }
  
  public void ZB(String paramString1, String paramString2) {
    Zr4b zr4b = new Zr4b(paramString1, paramString2);
    int i = this.Zt.indexOf(zr4b);
    if (i != -1)
      this.Zt.remove(i); 
    this.Zt.add(0, zr4b);
    if (this.Zt.size() > 25)
      this.Zt = this.Zt.subList(0, 25); 
    Zk();
  }
  
  public void Zf(String paramString1, String paramString2) {
    Zr4b zr4b = new Zr4b(paramString1, paramString2);
    int i = this.Zt.indexOf(zr4b);
    if (i == -1)
      return; 
    this.Zt.set(i, zr4b);
    Zk();
  }
  
  private void Zk() {
    ArrayList<String> arrayList1 = new ArrayList();
    ArrayList<String> arrayList2 = new ArrayList();
    String[] arrayOfString = Zrk1.ZT();
    for (Zr4b zr4b : this.Zt) {
      arrayList1.add(zr4b.Zh);
      arrayList2.add(zr4b.Zb);
      if (arrayOfString != null)
        break; 
    } 
    ZI(arrayList1, arrayList2);
  }
  
  private void ZI(List<String> paramList1, List<String> paramList2) {
    (new Ztyx(a(-6850, 3314), this.Zw)).ZS(paramList1);
    (new Ztyx(a(-6849, 6586), this.Zw)).ZS(paramList2);
  }
  
  public List<Zr4b> ZY(Zl0 paramZl0) {
    // Byte code:
    //   0: invokestatic ZT : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: aload_0
    //   13: getfield ZQ : Lnet/portswigger/Zvh;
    //   16: invokevirtual ZE : ()Z
    //   19: ifeq -> 174
    //   22: new java/util/HashSet
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #4
    //   31: new java/util/ArrayList
    //   34: dup
    //   35: aload_0
    //   36: getfield Zt : Ljava/util/List;
    //   39: invokespecial <init> : (Ljava/util/Collection;)V
    //   42: astore #5
    //   44: aload #5
    //   46: invokestatic reverse : (Ljava/util/List;)V
    //   49: aload #5
    //   51: invokeinterface iterator : ()Ljava/util/Iterator;
    //   56: astore #6
    //   58: aload #6
    //   60: invokeinterface hasNext : ()Z
    //   65: ifeq -> 166
    //   68: aload #6
    //   70: invokeinterface next : ()Ljava/lang/Object;
    //   75: checkcast burp/Zr4b
    //   78: astore #7
    //   80: aload_1
    //   81: aload #7
    //   83: getfield Zb : Ljava/lang/String;
    //   86: invokeinterface Zg : (Ljava/lang/String;)Ljava/io/File;
    //   91: astore #8
    //   93: aload #7
    //   95: getfield Zb : Ljava/lang/String;
    //   98: ifnonnull -> 105
    //   101: aconst_null
    //   102: goto -> 113
    //   105: aload #7
    //   107: getfield Zb : Ljava/lang/String;
    //   110: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   113: astore #9
    //   115: aload #4
    //   117: aload #9
    //   119: invokeinterface contains : (Ljava/lang/Object;)Z
    //   124: ifne -> 162
    //   127: aload #8
    //   129: invokevirtual canRead : ()Z
    //   132: ifeq -> 162
    //   135: aload #8
    //   137: invokevirtual canWrite : ()Z
    //   140: ifeq -> 162
    //   143: aload_3
    //   144: aload #7
    //   146: invokeinterface add : (Ljava/lang/Object;)Z
    //   151: pop
    //   152: aload #4
    //   154: aload #9
    //   156: invokeinterface add : (Ljava/lang/Object;)Z
    //   161: pop
    //   162: aload_2
    //   163: ifnull -> 58
    //   166: aload_3
    //   167: invokestatic reverse : (Ljava/util/List;)V
    //   170: aload_2
    //   171: ifnull -> 249
    //   174: aload_0
    //   175: getfield Zt : Ljava/util/List;
    //   178: invokeinterface iterator : ()Ljava/util/Iterator;
    //   183: astore #4
    //   185: aload #4
    //   187: invokeinterface hasNext : ()Z
    //   192: ifeq -> 249
    //   195: aload #4
    //   197: invokeinterface next : ()Ljava/lang/Object;
    //   202: checkcast burp/Zr4b
    //   205: astore #5
    //   207: aload_1
    //   208: aload #5
    //   210: getfield Zb : Ljava/lang/String;
    //   213: invokeinterface Zg : (Ljava/lang/String;)Ljava/io/File;
    //   218: astore #6
    //   220: aload #6
    //   222: invokevirtual canRead : ()Z
    //   225: ifeq -> 245
    //   228: aload #6
    //   230: invokevirtual canWrite : ()Z
    //   233: ifeq -> 245
    //   236: aload_3
    //   237: aload #5
    //   239: invokeinterface add : (Ljava/lang/Object;)Z
    //   244: pop
    //   245: aload_2
    //   246: ifnull -> 185
    //   249: aload_3
    //   250: areturn
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Gë®ÿ\\nS\\t¡ný JNÕ{öõ\v~>\\f¿HüÄ4©'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #18
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #105
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
    //   67: ldc '[Ù 4QþW¬ÑPBÅ!o4¬v+³ 0ÖBº0Ø®A'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #18
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #101
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
    //   128: putstatic burp/Zsyo.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zsyo.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 258
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 240, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 230, 5 -> 235
    //   212: iconst_1
    //   213: goto -> 242
    //   216: bipush #91
    //   218: goto -> 242
    //   221: bipush #125
    //   223: goto -> 242
    //   226: iconst_1
    //   227: goto -> 242
    //   230: bipush #66
    //   232: goto -> 242
    //   235: bipush #44
    //   237: goto -> 242
    //   240: bipush #15
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 164
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 160
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE53F) & 0xFFFF;
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
      byte b1 = 101;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */