package burp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import javax.swing.SortOrder;

public class Zs6i implements Zm3g, Zk8k {
  private final List<Zlz8> ZM;
  
  private final Set<Supplier<Zlz8>> Zy;
  
  private final Zm6x ZB;
  
  private final Zsx5 Zj;
  
  private static Zbqc[] Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs6i(Zm6x paramZm6x, Zsx5 paramZsx5) {
    this.ZB = paramZm6x;
    this.Zj = paramZsx5;
    this.ZM = new ArrayList<>();
    this.Zy = new HashSet<>();
  }
  
  public void Zd(Zmf_ paramZmf_) {
    List<?> list = paramZmf_.Zs(a(-32143, -27718), this::ZJ);
    String str = paramZmf_.Zm(a(-32142, -22892), null);
    if (list != null) {
      this.ZM.clear();
      List<Zlz8> list1 = this.Zj.Z_(str, (List)list);
      this.ZM.addAll(list1);
      this.ZB.Zj(new Ztjx(list1));
    } 
  }
  
  private Zlz8 ZJ(Zvt paramZvt) throws Zzam {
    Zgie zgie = new Zgie();
    Objects.requireNonNull(zgie);
    return new Zlz8(paramZvt.ZC(Zsxn.TABLE_ID.key), paramZvt.Zg(Zsxn.TABLE_COLUMNS.key, zgie::ZH));
  }
  
  public void Zl(Zg4j paramZg4j) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zy : Ljava/util/Set;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   14: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   19: invokeinterface toList : ()Ljava/util/List;
    //   24: astore_3
    //   25: invokestatic Zm : ()[Lburp/Zbqc;
    //   28: aload_1
    //   29: sipush #-32141
    //   32: sipush #31088
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: invokeinterface ZP : (Ljava/lang/String;)Lburp/Zzqw;
    //   43: astore #4
    //   45: aload_3
    //   46: invokeinterface iterator : ()Ljava/util/Iterator;
    //   51: astore #5
    //   53: astore_2
    //   54: aload #5
    //   56: invokeinterface hasNext : ()Z
    //   61: ifeq -> 352
    //   64: aload #5
    //   66: invokeinterface next : ()Ljava/lang/Object;
    //   71: checkcast burp/Zlz8
    //   74: astore #6
    //   76: aload #4
    //   78: invokevirtual Zc : ()Lburp/Zzqp;
    //   81: astore #7
    //   83: aload #7
    //   85: getstatic burp/Zsxn.TABLE_ID : Lburp/Zsxn;
    //   88: getfield key : Ljava/lang/String;
    //   91: aload #6
    //   93: invokevirtual ZLx : ()Ljava/lang/String;
    //   96: invokevirtual Zm : (Ljava/lang/String;Ljava/lang/String;)V
    //   99: aload #7
    //   101: getstatic burp/Zsxn.TABLE_COLUMNS : Lburp/Zsxn;
    //   104: getfield key : Ljava/lang/String;
    //   107: invokevirtual Zm : (Ljava/lang/String;)Lburp/Zzqw;
    //   110: astore #8
    //   112: aload #6
    //   114: invokevirtual ZLF : ()Ljava/util/List;
    //   117: invokeinterface iterator : ()Ljava/util/Iterator;
    //   122: astore #9
    //   124: aload #9
    //   126: invokeinterface hasNext : ()Z
    //   131: ifeq -> 348
    //   134: aload #9
    //   136: invokeinterface next : ()Ljava/lang/Object;
    //   141: checkcast burp/Zr8p
    //   144: astore #10
    //   146: aload #8
    //   148: invokevirtual Zc : ()Lburp/Zzqp;
    //   151: astore #11
    //   153: aload #10
    //   155: instanceof burp/Zb2w
    //   158: ifeq -> 182
    //   161: aload #11
    //   163: getstatic burp/Zsxn.COLUMN_TYPE : Lburp/Zsxn;
    //   166: getfield key : Ljava/lang/String;
    //   169: getstatic burp/Zk8z.NATIVE : Lburp/Zk8z;
    //   172: getfield value : Ljava/lang/String;
    //   175: invokevirtual Zm : (Ljava/lang/String;Ljava/lang/String;)V
    //   178: aload_2
    //   179: ifnonnull -> 230
    //   182: aload #10
    //   184: instanceof burp/Zrg
    //   187: ifeq -> 230
    //   190: aload #10
    //   192: checkcast burp/Zrg
    //   195: astore #12
    //   197: aload #11
    //   199: getstatic burp/Zsxn.COLUMN_TYPE : Lburp/Zsxn;
    //   202: getfield key : Ljava/lang/String;
    //   205: getstatic burp/Zk8z.CUSTOM : Lburp/Zk8z;
    //   208: getfield value : Ljava/lang/String;
    //   211: invokevirtual Zm : (Ljava/lang/String;Ljava/lang/String;)V
    //   214: aload #11
    //   216: getstatic burp/Zsxn.COLUMN_BAMBDA : Lburp/Zsxn;
    //   219: getfield key : Ljava/lang/String;
    //   222: aload #12
    //   224: invokevirtual ZT : ()Ljava/lang/String;
    //   227: invokevirtual Zm : (Ljava/lang/String;Ljava/lang/String;)V
    //   230: aload #11
    //   232: getstatic burp/Zsxn.COLUMN_ID : Lburp/Zsxn;
    //   235: getfield key : Ljava/lang/String;
    //   238: aload #10
    //   240: invokeinterface name : ()Ljava/lang/String;
    //   245: invokevirtual Zm : (Ljava/lang/String;Ljava/lang/String;)V
    //   248: aload #11
    //   250: getstatic burp/Zsxn.COLUMN_VISIBLE : Lburp/Zsxn;
    //   253: getfield key : Ljava/lang/String;
    //   256: aload #10
    //   258: invokeinterface visible : ()Z
    //   263: invokevirtual Zj : (Ljava/lang/String;Z)V
    //   266: aload #11
    //   268: getstatic burp/Zsxn.COLUMN_WIDTH : Lburp/Zsxn;
    //   271: getfield key : Ljava/lang/String;
    //   274: aload #10
    //   276: invokeinterface width : ()I
    //   281: invokevirtual ZU : (Ljava/lang/String;I)V
    //   284: aload #11
    //   286: getstatic burp/Zsxn.COLUMN_SORT : Lburp/Zsxn;
    //   289: getfield key : Ljava/lang/String;
    //   292: aload #10
    //   294: invokeinterface sortOrder : ()Ljavax/swing/SortOrder;
    //   299: invokestatic ZK : (Ljavax/swing/SortOrder;)Ljava/lang/String;
    //   302: invokevirtual Zm : (Ljava/lang/String;Ljava/lang/String;)V
    //   305: aload #11
    //   307: getstatic burp/Zsxn.COLUMN_SORT_PRECEDENCE : Lburp/Zsxn;
    //   310: getfield key : Ljava/lang/String;
    //   313: aload #10
    //   315: invokeinterface sortPrecedence : ()Lburp/Zlcu;
    //   320: invokestatic Zf : (Lburp/Zlcu;)Ljava/lang/String;
    //   323: invokevirtual Zb : (Ljava/lang/String;Ljava/lang/String;)V
    //   326: aload #11
    //   328: getstatic burp/Zsxn.COLUMN_USER_RESIZED : Lburp/Zsxn;
    //   331: getfield key : Ljava/lang/String;
    //   334: aload #10
    //   336: invokeinterface userResized : ()Z
    //   341: invokevirtual Zj : (Ljava/lang/String;Z)V
    //   344: aload_2
    //   345: ifnonnull -> 124
    //   348: aload_2
    //   349: ifnonnull -> 54
    //   352: invokestatic Zwu : ()[Lburp/Zbqc;
    //   355: ifnonnull -> 365
    //   358: iconst_4
    //   359: anewarray burp/Zbqc
    //   362: invokestatic ZZ : ([Lburp/Zbqc;)V
    //   365: return
  }
  
  public void Zc(Supplier<Zlz8> paramSupplier) {
    this.Zy.add(paramSupplier);
  }
  
  private static String ZK(SortOrder paramSortOrder) {
    return paramSortOrder.name();
  }
  
  private static String Zf(Zlcu paramZlcu) {
    return (paramZlcu != null) ? paramZlcu.name() : null;
  }
  
  private static boolean lambda$get$0(Zru paramZru, Zlz8 paramZlz8) {
    return paramZlz8.ZLx().equals(paramZru.id);
  }
  
  public static void ZZ(Zbqc[] paramArrayOfZbqc) {
    Zw = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zm() {
    return Zw;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_5
    //   7: anewarray burp/Zbqc
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic ZZ : ([Lburp/Zbqc;)V
    //   15: ldc 'Àì6ç'ÖÕ[Ã}ç)··Í¶u( ¼:ff'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #6
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #48
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 89
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: aload #5
    //   76: putstatic burp/Zs6i.a : [Ljava/lang/String;
    //   79: iconst_3
    //   80: anewarray java/lang/String
    //   83: putstatic burp/Zs6i.b : [Ljava/lang/String;
    //   86: goto -> 235
    //   89: dup_x2
    //   90: pop
    //   91: invokevirtual toCharArray : ()[C
    //   94: dup_x1
    //   95: arraylength
    //   96: dup_x2
    //   97: pop
    //   98: iconst_0
    //   99: istore #6
    //   101: dup2_x1
    //   102: pop2
    //   103: dup_x2
    //   104: iconst_1
    //   105: if_icmpgt -> 208
    //   108: dup2
    //   109: swap
    //   110: iload #6
    //   112: dup2_x1
    //   113: caload
    //   114: swap
    //   115: iload #6
    //   117: bipush #7
    //   119: irem
    //   120: tableswitch default -> 190, 0 -> 160, 1 -> 165, 2 -> 170, 3 -> 175, 4 -> 180, 5 -> 185
    //   160: bipush #85
    //   162: goto -> 192
    //   165: bipush #103
    //   167: goto -> 192
    //   170: bipush #42
    //   172: goto -> 192
    //   175: bipush #116
    //   177: goto -> 192
    //   180: bipush #25
    //   182: goto -> 192
    //   185: bipush #79
    //   187: goto -> 192
    //   190: bipush #124
    //   192: ixor
    //   193: ixor
    //   194: i2c
    //   195: castore
    //   196: iinc #6, 1
    //   199: dup
    //   200: ifne -> 208
    //   203: dup2
    //   204: dup_x1
    //   205: goto -> 112
    //   208: dup2_x1
    //   209: pop2
    //   210: dup_x2
    //   211: iload #6
    //   213: if_icmpgt -> 108
    //   216: pop
    //   217: new java/lang/String
    //   220: dup_x1
    //   221: swap
    //   222: invokespecial <init> : ([C)V
    //   225: invokevirtual intern : ()Ljava/lang/String;
    //   228: swap
    //   229: pop
    //   230: swap
    //   231: pop
    //   232: goto -> 46
    //   235: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8273) & 0xFFFF;
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
      char c = 'Ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */