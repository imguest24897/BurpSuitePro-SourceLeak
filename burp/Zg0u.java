package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.RowSorter;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zto;

public class Zg0u extends Zg01<Zeo2> {
  private final Zrgd ZE;
  
  private final Zgb6 Zu;
  
  private final Zz_r Zt;
  
  private final Object ZN = new Object();
  
  private final Zkl6 ZT;
  
  private final Zm6x Ze;
  
  private final Zswv<Zeo2> Zz;
  
  private static String Zd;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zg0u(Zrgd paramZrgd, Zlod paramZlod, Zz_r paramZz_r, Zekl paramZekl, Zgb6 paramZgb6, Zzxf paramZzxf, Zr_4 paramZr_4, Ze6o paramZe6o, Zkl6 paramZkl6, Zbnt paramZbnt, Zgbj paramZgbj, Zswv<Zeo2> paramZswv, Zm6x paramZm6x) {
    super(a(30737, -28522), paramZlod, paramZekl, paramZzxf, paramZswv, paramZbnt, paramZr_4, paramZe6o);
    String str = Zv();
    this.ZE = paramZrgd;
    this.Zt = paramZz_r;
    this.Zu = paramZgb6;
    this.ZT = paramZkl6;
    this.Zz = paramZswv;
    this.Ze = paramZm6x;
    paramZgbj.Zr(this::ZG);
    if (str == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  private void ZG() {
    List<Zto<Zeo2, Zeo2>> list;
    String str = Zv();
    if (!this.Zy.Zi())
      return; 
    synchronized (this.ZC) {
      list = this.Zz.Zb();
    } 
    for (Zto<Zeo2, Zeo2> zto : list) {
      for (Zkuh<Zeo2> zkuh : this.Zx) {
        zkuh.ZR((Zeo2)zto.Zq, (Zeo2)zto.Zo);
        if (str == null)
          break; 
      } 
      if (str == null)
        break; 
    } 
    Zbsv.Zk(5L, TimeUnit.SECONDS);
  }
  
  public Zeo2 Zi(Zeo2 paramZeo2) {
    boolean bool;
    Zeo2 zeo2;
    String str = Zv();
    if (!this.Zu.ZfP())
      return paramZeo2; 
    synchronized (this.ZC) {
      int i = this.Zz.indexOf(paramZeo2);
      bool = (i != -1) ? true : false;
      Zbr zbr1 = paramZeo2.ZXD();
      Zbr zbr2 = paramZeo2.ZXI();
      Zbr zbr3 = paramZeo2.ZX9();
      Zbr zbr4 = bool ? zbr1.Zi(this.Zy) : zbr1;
      Zbr zbr5 = (zbr2 != null && bool) ? zbr2.Zi(this.Zy) : zbr2;
      Zbr zbr6 = (zbr3 != null && bool) ? zbr3.Zi(this.Zy) : zbr3;
      Zr_4 zr_4 = bool ? this.Zy : this.Zn;
      Zey9 zey9 = this.ZT.ZH();
      Zefx zefx = zbr4.ZP(paramZeo2.Zod(), zey9);
      zeo2 = zr_4.<Zeo2>ZH(new Zmyy(paramZeo2.ZEe(), zefx, zbr4, zbr5, this.ZE, this.Zu, this.ZT.Zq(), this.ZT.Zd()));
      zeo2.ZJ(zbr6);
      zeo2.ZB(paramZeo2.ZaP());
      zeo2.Zxg(paramZeo2.ZIx());
      zeo2.ZuP(paramZeo2.ZEK());
      if (bool)
        this.Zz.ZM(i, zeo2); 
    } 
    if (bool)
      for (Zkuh<Zeo2> zkuh : this.Zx) {
        zkuh.ZR(paramZeo2, zeo2);
        if (str == null)
          break; 
      }  
    return zeo2;
  }
  
  public Zeo2 Zq(int paramInt, Zefx paramZefx, Zbr paramZbr1, Zbr paramZbr2) {
    this.ZT.ZH();
    boolean bool = this.ZG.ZE(paramZefx.ZF());
    Zeo2 zeo2 = ZH(this.Zn, paramInt, paramZefx, paramZbr1, paramZbr2, bool);
    if (bool) {
      Zm2.Zo(Zze0.PROXY_HISTORY_HTTP_ITEM_ADDED);
      add(zeo2);
    } 
    return zeo2;
  }
  
  private Zeo2 ZH(Zr_4 paramZr_4, int paramInt, Zefx paramZefx, Zbr paramZbr1, Zbr paramZbr2, boolean paramBoolean) {
    return paramZr_4.<Zeo2>ZH(new Zmyt(paramInt, paramZefx, paramZbr1, paramZbr2, this.ZE, this.Zu, this.ZT.Zq(), this.ZT.Zd(), paramBoolean));
  }
  
  public void Zu(Zeo2 paramZeo2, Zs68 paramZs68, Zstu paramZstu) {
    if (this.ZG.ZE(paramZeo2.ZlL()))
      synchronized (this.ZC) {
        if (this.Zz.lastIndexOf(paramZeo2) == -1)
          return; 
        if (paramZeo2.ZoZ() && paramZstu != null) {
          byte[] arrayOfByte = paramZstu.ZiD();
          ((Zmwv)paramZeo2).ZG(arrayOfByte, arrayOfByte.length);
        } 
        paramZeo2.Zc(paramZs68, paramZstu);
        Zb(paramZeo2);
        this.Zt.Zg(Zeew.PROXY, paramZeo2);
      }  
  }
  
  public void Zd(Zeo2 paramZeo2, int paramInt) {
    synchronized (this.ZC) {
      if (this.Zz.lastIndexOf(paramZeo2) == -1)
        return; 
      paramZeo2.Zfs(paramZeo2.Zlq() + paramInt);
      Zb(paramZeo2);
    } 
  }
  
  public void ZF(Zbx0 paramZbx0) {
    String str = Zv();
    try {
      byte b = 0;
      while (b < this.Zz.size()) {
        Zeo2 zeo2 = this.Zz.Zw(b);
        paramZbx0.Zp(zeo2);
        b++;
        if (str == null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public List<Zsor> ZJ() {
    ArrayList<Zo8> arrayList;
    String str = Zv();
    synchronized (this.ZC) {
      arrayList = new ArrayList(this.Zz.size());
      for (Zeo2 zeo2 : this.Zz) {
        arrayList.add(new Zo8(zeo2, this.ZT.ZH(), this.Ze));
        if (str == null)
          break; 
      } 
    } 
    if (Zbqc.Zwu() == null)
      Zo("gXWvt"); 
    return (List)arrayList;
  }
  
  protected int ZY() {
    synchronized (this.ZN) {
      return this.ZF.ZGu();
    } 
  }
  
  protected int Zf() {
    synchronized (this.ZN) {
      int i = ZY() + 1;
      ZK(i);
      return i;
    } 
  }
  
  protected void ZK(int paramInt) {
    synchronized (this.ZN) {
      this.ZF.ZGX(paramInt);
    } 
  }
  
  public RowSorter.SortKey ZB() {
    return new RowSorter.SortKey(this.Zi.Zln(), this.Zi.Zle());
  }
  
  protected Zto<List<Zeo2>, Integer> Zk(Zr_4 paramZr_4, Zzir paramZzir, Zefg<Zeo2> paramZefg, Ztg8 paramZtg8, Zeom paramZeom, Zlc8 paramZlc8, float paramFloat1, float paramFloat2) {
    ArrayList<Zeo2> arrayList = new ArrayList();
    int i = 0;
    String str = Zv();
    for (Zeo2 zeo21 : paramZefg) {
      Zeo2 zeo22 = paramZtg8.<Zeo2>Zw(zeo21);
      arrayList.add(zeo22);
      i = Math.max(i, zeo22.ZEK());
      paramFloat1 += paramFloat2;
      if (!paramZlc8.Zq(paramFloat1, a(30736, 6264)) || str == null)
        break; 
    } 
    return Zto.ZM(arrayList, Integer.valueOf(i));
  }
  
  public Zeo2 Zx(Zeo2 paramZeo2) {
    Zeo2 zeo2;
    String str = Zv();
    if (!this.Zy.Zi() || (paramZeo2 instanceof Zxsr && this.Zy.Zl().ZV((Zxsr)paramZeo2)))
      return paramZeo2; 
    synchronized (this.ZC) {
      zeo2 = this.Zz.Zr(paramZeo2);
      for (Zkuh<Zeo2> zkuh : this.Zx) {
        zkuh.ZR(paramZeo2, zeo2);
        if (str == null)
          break; 
      } 
    } 
    return zeo2;
  }
  
  public static void Zo(String paramString) {
    Zd = paramString;
  }
  
  public static String Zv() {
    return Zd;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: ldc 'lI1xTc'
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '9Ñ*Os]ìØöÁy'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: iconst_5
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: invokestatic Zo : (Ljava/lang/String;)V
    //   26: bipush #93
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: aload #5
    //   73: putstatic burp/Zg0u.b : [Ljava/lang/String;
    //   76: iconst_2
    //   77: anewarray java/lang/String
    //   80: putstatic burp/Zg0u.c : [Ljava/lang/String;
    //   83: goto -> 229
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 202
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 184, 0 -> 156, 1 -> 160, 2 -> 165, 3 -> 170, 4 -> 174, 5 -> 179
    //   156: iconst_1
    //   157: goto -> 186
    //   160: bipush #50
    //   162: goto -> 186
    //   165: bipush #116
    //   167: goto -> 186
    //   170: iconst_2
    //   171: goto -> 186
    //   174: bipush #121
    //   176: goto -> 186
    //   179: bipush #54
    //   181: goto -> 186
    //   184: bipush #55
    //   186: ixor
    //   187: ixor
    //   188: i2c
    //   189: castore
    //   190: iinc #6, 1
    //   193: dup
    //   194: ifne -> 202
    //   197: dup2
    //   198: dup_x1
    //   199: goto -> 109
    //   202: dup2_x1
    //   203: pop2
    //   204: dup_x2
    //   205: iload #6
    //   207: if_icmpgt -> 105
    //   210: pop
    //   211: new java/lang/String
    //   214: dup_x1
    //   215: swap
    //   216: invokespecial <init> : ([C)V
    //   219: invokevirtual intern : ()Ljava/lang/String;
    //   222: swap
    //   223: pop
    //   224: swap
    //   225: pop
    //   226: goto -> 43
    //   229: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7810) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 35;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */