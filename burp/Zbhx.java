package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class Zbhx extends Zbqc implements Zlko {
  private final Zbh0 ZN;
  
  private final Zxer ZG;
  
  private final Zbc9 Zx;
  
  private final Zbhw ZK;
  
  private final List<Zxnc> Zc;
  
  private final Zzo4 ZW;
  
  private Zewb Zv;
  
  private int ZU;
  
  private static int ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbhx(Zxei paramZxei, Ztwv paramZtwv, Zb63 paramZb63, Zebm paramZebm, Zmhp paramZmhp, Zrm5... paramVarArgs) {
    this.Zc = (List<Zxnc>)Arrays.<Zrm5>stream(paramVarArgs).map(this::lambda$new$0).collect(Collectors.toList());
    setLayout(new BorderLayout());
    int i = Z_();
    setBorder(new CompoundBorder(new Zrf5(1, 0, 0, 0, Zlkk.BORDER), new EmptyBorder(3, 0, 0, 5)));
    Zbqc zbqc = new Zbqc(new BorderLayout());
    this.ZN = new Zbh0(paramZtwv);
    zbqc.add(this.ZN, a(-5115, 2430));
    this.ZG = (Zxer)Zrxv.Zp().ZX().Zl(zbqc).ZG(this::lambda$new$1).Z_().Ze(new Zzni(this)).ZW();
    this.ZG.setName(a(-5114, -15040));
    this.ZG.setShowContentSeparators(false);
    add((Component)this.ZG, a(-5116, 2508));
    this.Zx = new Zbc9();
    this.ZK = new Zbhw(this.Zx);
    for (Zxnc zxnc : this.Zc) {
      Zf(zxnc);
      if (i != 0) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    paramZb63.ZC(this.ZK);
    Zbpq zbpq = new Zbpq(this);
    this.ZG.addChangeListener(zbpq);
    this.ZG.addMouseListener(zbpq);
    this.ZG.addMouseMotionListener(zbpq);
    this.ZW = new Zzo4(this.Zc, this.ZG, this.Zv, this.ZK, this.Zx);
  }
  
  public void ZO(long paramLong, int paramInt) {
    this.ZN.ZJ(paramLong, paramInt);
  }
  
  public void ZL(List<Zebi> paramList) {
    this.ZN.Zf(paramList);
  }
  
  private void Zp() {
    ArrayList<Zxnc> arrayList = new ArrayList();
    byte b = 0;
    int i = Z_();
    while (b < this.ZG.getTabCount()) {
      Zewb zewb = (Zewb)this.ZG.getTabComponentAt(b);
      Zxnc zxnc = ZV(zewb);
      arrayList.add(zxnc);
      b++;
      if (i != 0)
        break; 
    } 
    b = 0;
    while (b < this.Zc.size()) {
      Zxnc zxnc = this.Zc.get(b);
      if (zxnc.Zu())
        arrayList.add(b, zxnc); 
      b++;
      if (i != 0)
        break; 
    } 
    this.Zc.clear();
    this.Zc.addAll(arrayList);
  }
  
  private void Zf(Zxnc paramZxnc) {
    this.Zx.add(paramZxnc.Zl());
    Zewb zewb = paramZxnc.Zy();
    Zmfd zmfd = new Zmfd(this);
    zmfd.setPreferredSize(new Dimension(0, 0));
    this.ZG.addTab(zewb.getText(), zmfd);
    this.ZG.setSelectedIndex(-1);
    int i = this.ZG.indexOfTab(zewb.getText());
    this.ZG.setTabComponentAt(i, zewb.ZD());
    this.ZU++;
  }
  
  public void Zb(Predicate<Zrm5> paramPredicate) {
    this.ZW.Zm(paramPredicate);
  }
  
  void ZS(Zewb paramZewb) {
    if (paramZewb.equals(this.Zv))
      ZV(paramZewb).Zk(); 
    this.Zv = null;
    this.ZG.setSelectedIndex(-1);
    this.ZK.ZC();
  }
  
  private boolean Za(Zewb paramZewb) {
    return Objects.equals(this.Zv, paramZewb);
  }
  
  static Zxnc ZJ(Zewb paramZewb, List<Zxnc> paramList) {
    return paramList.stream().filter(paramZewb::lambda$getDetachableForTabComponent$2).findFirst().orElseThrow();
  }
  
  Zxnc ZV(Zewb paramZewb) {
    return ZJ(paramZewb, this.Zc);
  }
  
  private void Zs(int paramInt, boolean paramBoolean) {
    Zewb zewb = (Zewb)this.ZG.getTabComponentAt(paramInt);
    Zxnc zxnc = ZV(zewb);
    Component component = zxnc.Zl();
    if (Za(zewb))
      ZS(zewb); 
    this.ZU--;
    this.ZG.removeTabAt(paramInt);
    this.Zx.remove(component);
    component.setVisible(true);
    zxnc.ZR(Zt2m.ZF(this), paramBoolean);
  }
  
  void Zr(Zxnc paramZxnc) {
    Ztmt ztmt = new Ztmt(this);
    ztmt.setPreferredSize(new Dimension(0, 0));
    paramZxnc.Zk();
    this.Zx.add(paramZxnc.Zl());
    this.ZU++;
    String str = paramZxnc.Zy().getText();
    int i = this.ZG.getTabCount();
    int j = Zk(paramZxnc);
    this.ZG.Zl(str, ztmt, str, j);
    this.ZG.setTabComponentAt(j, paramZxnc.Zy().ZD());
    if (i == 0)
      this.ZG.setSelectedIndex(-1); 
  }
  
  private int Zk(Zxnc paramZxnc) {
    byte b = 0;
    Iterator<Zxnc> iterator = this.Zc.iterator();
    int i = Zr();
    while (iterator.hasNext()) {
      Zxnc zxnc = iterator.next();
      if (zxnc.equals(paramZxnc))
        break; 
      if (!zxnc.Zu())
        b++; 
      if (i == 0)
        break; 
    } 
    return b;
  }
  
  private static boolean lambda$getDetachableForTabComponent$2(Zewb paramZewb, Zxnc paramZxnc) {
    return Objects.equals(paramZewb, paramZxnc.Zy());
  }
  
  private void lambda$new$1(Zlfz paramZlfz) {
    Zs(paramZlfz.Zs(), true);
  }
  
  private Zxnc lambda$new$0(Zrm5 paramZrm5) {
    return new Zxnc(this, paramZrm5);
  }
  
  public static void ZT(int paramInt) {
    ZE = paramInt;
  }
  
  public static int Z_() {
    return ZE;
  }
  
  public static int Zr() {
    int i = Z_();
    return (i == 0) ? 52 : 0;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_0
    //   9: ldc 'ÕØißÙÞe#M­j,tÁ°Ú¯+~'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: invokestatic ZT : (I)V
    //   23: iconst_m1
    //   24: istore_0
    //   25: bipush #98
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 85
    //   42: aload #5
    //   44: swap
    //   45: iload_3
    //   46: iinc #3, 1
    //   49: swap
    //   50: aastore
    //   51: iload_0
    //   52: iload_1
    //   53: iadd
    //   54: dup
    //   55: istore_0
    //   56: iload #4
    //   58: if_icmpge -> 70
    //   61: aload_2
    //   62: iload_0
    //   63: invokevirtual charAt : (I)C
    //   66: istore_1
    //   67: goto -> 25
    //   70: aload #5
    //   72: putstatic burp/Zbhx.a : [Ljava/lang/String;
    //   75: iconst_3
    //   76: anewarray java/lang/String
    //   79: putstatic burp/Zbhx.b : [Ljava/lang/String;
    //   82: goto -> 231
    //   85: dup_x2
    //   86: pop
    //   87: invokevirtual toCharArray : ()[C
    //   90: dup_x1
    //   91: arraylength
    //   92: dup_x2
    //   93: pop
    //   94: iconst_0
    //   95: istore #6
    //   97: dup2_x1
    //   98: pop2
    //   99: dup_x2
    //   100: iconst_1
    //   101: if_icmpgt -> 204
    //   104: dup2
    //   105: swap
    //   106: iload #6
    //   108: dup2_x1
    //   109: caload
    //   110: swap
    //   111: iload #6
    //   113: bipush #7
    //   115: irem
    //   116: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #94
    //   158: goto -> 188
    //   161: bipush #34
    //   163: goto -> 188
    //   166: bipush #122
    //   168: goto -> 188
    //   171: bipush #88
    //   173: goto -> 188
    //   176: bipush #38
    //   178: goto -> 188
    //   181: bipush #112
    //   183: goto -> 188
    //   186: bipush #24
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 108
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 104
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 42
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEC04) & 0xFFFF;
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
      char c = '¿';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbhx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */