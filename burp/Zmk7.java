package burp;

import java.util.Comparator;
import java.util.Objects;
import javax.swing.SortOrder;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public final class Zmk7<E> {
  private final String Zs;
  
  private final Class<?> Zp;
  
  private final Object Zv;
  
  private final TableCellRenderer ZT;
  
  private final TableCellRenderer ZQ;
  
  private final TableCellEditor Zi;
  
  private final int ZM;
  
  private final int Zd;
  
  private final int Zu;
  
  private final int ZA;
  
  private final boolean Zn;
  
  private final boolean ZK;
  
  private final boolean Zf;
  
  private final boolean Ze;
  
  private final boolean Zr;
  
  private final boolean Zw;
  
  private final Comparator<?> Zm;
  
  private final Zlcu Zo;
  
  private final SortOrder Z_;
  
  private final Zkuq<E> Zt;
  
  private final Zzbi<E> Zg;
  
  private final boolean Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zmk7(Zz_2<E> paramZz_2) {
    this.Zs = paramZz_2.Za;
    this.Zp = paramZz_2.ZP;
    this.Zv = paramZz_2.Zw;
    this.ZT = paramZz_2.ZY;
    this.ZQ = paramZz_2.Zx;
    this.Zi = paramZz_2.Zi;
    this.ZM = paramZz_2.ZT;
    this.Zd = paramZz_2.Zl;
    this.Zu = paramZz_2.Zy;
    this.ZA = paramZz_2.ZV;
    this.Zn = paramZz_2.ZF;
    this.ZK = paramZz_2.ZW;
    this.Zf = paramZz_2.Z_;
    this.Ze = paramZz_2.Zn;
    this.Zr = paramZz_2.ZG;
    this.Zw = paramZz_2.Zb;
    this.Zm = paramZz_2.Zv;
    this.Zo = paramZz_2.ZN;
    this.Z_ = paramZz_2.Zj;
    this.Zt = paramZz_2.ZA;
    this.Zg = paramZz_2.ZH;
    this.Zx = paramZz_2.Ze;
  }
  
  public String ZS() {
    return this.Zs;
  }
  
  public Class<?> ZM() {
    return this.Zp;
  }
  
  public Object ZW() {
    return this.Zv;
  }
  
  public TableCellRenderer ZE() {
    return this.ZT;
  }
  
  public TableCellRenderer Zb() {
    return this.ZQ;
  }
  
  public TableCellEditor ZT() {
    return this.Zi;
  }
  
  public int Zd() {
    return this.ZM;
  }
  
  public int ZA() {
    return this.Zd;
  }
  
  public int Zn() {
    return this.Zu;
  }
  
  public int ZI() {
    return this.ZA;
  }
  
  public boolean ZO() {
    return this.Zn;
  }
  
  public boolean ZN() {
    return this.ZK;
  }
  
  public boolean Zz() {
    return this.Zf;
  }
  
  public boolean Zt() {
    return this.Ze;
  }
  
  public boolean ZD() {
    return this.Zr;
  }
  
  public boolean Zs() {
    return this.Zw;
  }
  
  public Comparator<?> Zg() {
    return this.Zm;
  }
  
  public Zlcu Zq() {
    return this.Zo;
  }
  
  public SortOrder Zk() {
    return this.Z_;
  }
  
  public Zkuq<E> Zx() {
    return this.Zt;
  }
  
  public Zzbi<E> Za() {
    return this.Zg;
  }
  
  public boolean ZX() {
    return this.Zx;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zmk7 zmk7 = (Zmk7)paramObject;
    return (this.ZM == zmk7.ZM && this.Zd == zmk7.Zd && this.Zu == zmk7.Zu && this.ZA == zmk7.ZA && this.Zn == zmk7.Zn && this.ZK == zmk7.ZK && this.Zf == zmk7.Zf && this.Ze == zmk7.Ze && this.Zw == zmk7.Zw && Objects.equals(this.Zs, zmk7.Zs) && this.Zp == zmk7.Zp && Objects.equals(this.Zv, zmk7.Zv) && Objects.equals(this.ZT, zmk7.ZT) && Objects.equals(this.ZQ, zmk7.ZQ) && Objects.equals(this.Zi, zmk7.Zi) && Objects.equals(this.Zm, zmk7.Zm) && this.Zo == zmk7.Zo && this.Z_ == zmk7.Z_ && Objects.equals(this.Zt, zmk7.Zt) && Objects.equals(this.Zg, zmk7.Zg));
  }
  
  public int hashCode() {
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[5]); 
    return Objects.hash(new Object[] { 
          this.Zs, this.Zp, this.Zv, this.ZT, this.ZQ, this.Zi, Integer.valueOf(this.ZM), Integer.valueOf(this.Zd), Integer.valueOf(this.Zu), Integer.valueOf(this.ZA), 
          Boolean.valueOf(this.Zn), Boolean.valueOf(this.ZK), Boolean.valueOf(this.Zf), Boolean.valueOf(this.Ze), Boolean.valueOf(this.Zw), this.Zm, this.Zo, this.Z_, this.Zt, this.Zg });
  }
  
  public String toString() {
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    String str1 = String.valueOf(this.Zg);
    String str2 = String.valueOf(this.Zt);
    String str3 = String.valueOf(this.Zo);
    String str4 = String.valueOf(this.Z_);
    String str5 = String.valueOf(this.Zm);
    boolean bool1 = this.Zw;
    boolean bool2 = this.Ze;
    boolean bool3 = this.Zf;
    boolean bool4 = this.ZK;
    boolean bool5 = this.Zn;
    int i = this.ZA;
    int j = this.Zu;
    int k = this.Zd;
    int m = this.ZM;
    String str6 = String.valueOf(this.Zi);
    String str7 = String.valueOf(this.ZQ);
    String str8 = String.valueOf(this.ZT);
    String str9 = String.valueOf(this.Zv);
    String str10 = String.valueOf(this.Zp);
    String str11 = this.Zs;
    if (Zbqc.Zwu() == null)
      Zlkk.Zj(new Zbqc[5]); 
    return a(13061, -23358) + a(13061, -23358) + str11 + a(13062, 6630) + str10 + a(13070, 17021) + str9 + a(13077, 13573) + str8 + a(13067, 4108) + str7 + a(13065, 6444) + str6 + a(13057, -27099) + m + a(13069, 22839) + k + a(13058, -24279) + j + a(13056, -17736) + i + a(13078, -23837) + bool5 + a(13064, 29630) + bool4 + a(13068, 27905) + bool3 + a(13060, -32108) + bool2 + a(13071, -18343) + bool1 + a(13076, -27656) + str5 + a(13059, -28760) + str4 + a(13079, 15451) + str3 + a(13063, -15683) + str2 + a(13066, -4208) + str1;
  }
  
  public static <E> Zz_2<E> Zh(Zkuq<E> paramZkuq) {
    return new Zz_2<>(paramZkuq);
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'øê.®Ge'èëös(ÕÍ>ãò)\\nÛóÅ2KfÕÕ%§c¤z1}°º]\\b|a%©"$\\bA}¿ºàÈï»ú»Òj\\bøl£ù½ \\fv"]W.³Å>cr>éJ(\\r¹w¸q_6{Èì\\f ~Ïö×t¯J{Ù¨S3<âqØ°ò£Åv<\\r5=/¿.Þt¹ê O\\r[èù5EFh~Áß\\nfÜZjSA''qb1Ï?píÎ\ëoã~+Åó¥@#ÿ+ÍÛcûä÷²Y©ô%°ã&¸y\\r.þFÌ@ÄÚñ3?'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #22
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #29
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
    //   68: ldc 'xHX-À·QÖ\\rÎºø\\rx°ÒÅ÷ÍY'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #17
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #11
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
    //   129: putstatic burp/Zmk7.a : [Ljava/lang/String;
    //   132: bipush #20
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmk7.b : [Ljava/lang/String;
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
    //   212: bipush #125
    //   214: goto -> 244
    //   217: bipush #62
    //   219: goto -> 244
    //   222: bipush #88
    //   224: goto -> 244
    //   227: bipush #33
    //   229: goto -> 244
    //   232: bipush #95
    //   234: goto -> 244
    //   237: bipush #53
    //   239: goto -> 244
    //   242: bipush #38
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
    int i = (paramInt1 ^ 0x3305) & 0xFFFF;
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
      byte b1 = 125;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmk7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */