package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.Box;
import javax.swing.border.EmptyBorder;
import net.portswigger.Zm2;

public class Zbh3 extends Zbqc implements Zsne, Zbd, Zrm5 {
  private final String Za = a(12819, -30716);
  
  private final Zbhs ZN;
  
  private final Zbhp ZX;
  
  private final Zmyx Zk;
  
  private final AtomicInteger ZB = new AtomicInteger();
  
  private final Zm9t ZR;
  
  private final Zm2s Zc;
  
  private boolean ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbh3(Zz0n paramZz0n, Zz_s paramZz_s, Zs6i paramZs6i, Zm6x paramZm6x) {
    setName(a(12826, 31126));
    this.Zc = new Zm2s(a(12819, -30716), a(12823, 31449));
    Zgws zgws = new Zgws(-1);
    this.ZN = new Zbhs(zgws);
    this.ZX = new Zbhp(paramZz0n, false);
    setBorder(new EmptyBorder(20, 20, 20, 20));
    setLayout(new BorderLayout());
    Zl(Zlkk.BACKGROUNDER);
    Zbqc zbqc1 = new Zbqc(new BorderLayout());
    zbqc1.setOpaque(false);
    String str = Zkqn.ZM();
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.setOpaque(false);
    Zm99 zm99 = new Zm99(a(12819, -30716), (new Ze3m(Zeuf.LIST, Zlkk.FOREGROUND)).ZU(Zmcx.LARGE_LINE_SIZE).Z_());
    zm99.ZE(Zt00.TITLE_BOLD_FONT);
    zm99.Ze(Zlkk.SOLID_FOREGROUND);
    zm99.setIconTextGap(10);
    zbqc2.add(zm99, a(12825, -6258));
    Zm2o zm2o = new Zm2o();
    zm2o.Zi(Zk97.DESKTOP_DASHBOARD);
    zm2o.setOpaque(false);
    this.ZR = new Zm9t();
    this.ZR.setOpaque(false);
    Zbqc zbqc3 = new Zbqc(new BorderLayout());
    zbqc3.setOpaque(false);
    zbqc3.add(zm2o, a(12818, -28686));
    zbqc3.add(Box.createHorizontalStrut(10), a(12821, -1369));
    zbqc3.add(this.ZR, a(12829, -22843));
    zbqc2.add(zbqc3, a(12824, 17020));
    zbqc2.add(Box.createVerticalStrut(10), a(12820, 23263));
    zbqc1.add(zbqc2, a(12817, 32458));
    Zbkd zbkd = new Zbkd();
    zbkd.ZX(zgws, (Zx08<Zrn3>[])new Zx08[] { Zx08.ZU(new Zr4j[] { Zr4j.SHOW_CRITICAL, Zr4j.SHOW_ERROR, Zr4j.SHOW_INFO, Zr4j.SHOW_DEBUG }) });
    zbkd.setOpaque(false);
    zbkd.Zh(new Zm2j(paramZz_s.Zt()));
    zbqc1.add(zbkd, a(12816, -23593));
    zbqc1.add(Box.createVerticalStrut(15), a(12828, -18593));
    add(zbqc1, a(12827, -20894));
    this.Zk = new Zmyx(1);
    this.Zk.setLeftComponent(this.ZN);
    this.Zk.setRightComponent(this.ZX);
    add(this.Zk, a(12816, -23593));
    paramZz_s.Zd(this);
    this.ZN.ZY(paramZz_s.Zb(Zbh3::lambda$new$0));
    paramZz_s.ZG(new Zvox(this));
    Zbup zbup = (Zbup)paramZz_s.Zj();
    Zbws zbws = (Zbws)zbup.getViewport().getView();
    paramZs6i.Zc(zbws::lambda$new$1);
    paramZm6x.ZO(Ztjx.class, Zehw.SWING, zbws::lambda$new$2);
    this.ZN.Zp(paramZz_s);
    paramZz_s.ZG(new Zrjv(this, zgws));
    if (Zbqc.Zwu() == null)
      Zkqn.Zc("SVJL0b"); 
  }
  
  public void Zi(Zbpn paramZbpn) {
    String str = Zkqn.ZM();
    if (paramZbpn != null) {
      this.Zk.ZG();
      this.ZX.ZR(paramZbpn);
      if (str == null) {
        this.Zk.Zf();
        return;
      } 
      return;
    } 
    this.Zk.Zf();
  }
  
  public void Za(Runnable paramRunnable) {
    this.ZR.Zv((new Ze3m(Zeuf.CLOSE, Zlkk.ACTION_NORMAL)).ZU(Zmcx.EXTRA_LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Zc(Zlkk.ACTION_PRESSED).Z_(), a(12822, 4605), paramRunnable);
    this.ZR.setOpaque(false);
  }
  
  public Component ZW() {
    return this;
  }
  
  public Zewb ZM() {
    return this.Zc;
  }
  
  public void Ze() {
    this.ZP = true;
    ZC();
    this.ZB.set(0);
  }
  
  private void ZC() {
    this.Zc.setText(a(12830, -5969));
    this.Zc.ZX();
    this.Zc.Ze(Zlkk.FOREGROUND);
  }
  
  public void ZV() {
    this.ZP = false;
  }
  
  public void ZJ(boolean paramBoolean) {
    if (paramBoolean)
      Zm2.Zo(Zze0.BOTTOM_DRAWER_EVENT_LOG_DETACHED); 
    this.ZR.setVisible(!paramBoolean);
  }
  
  private static void lambda$new$2(Zbws paramZbws, Ztjx paramZtjx) {
    List<Zlz8> list = paramZtjx.ZEU();
    Iterator<Zlz8> iterator = list.iterator();
    String str = Zkqn.ZM();
    while (iterator.hasNext()) {
      Zlz8 zlz8 = iterator.next();
      if (zlz8.ZLx().equals(Zru.DASHBOARD_EVENT_LOG.id)) {
        paramZbws.Zj(zlz8);
        if (str == null)
          continue; 
        break;
      } 
      continue;
      if (str == null)
        break; 
    } 
  }
  
  private static Zlz8 lambda$new$1(Zbws paramZbws) {
    return new Zlz8(Zru.DASHBOARD_EVENT_LOG.id, paramZbws.ZHh());
  }
  
  private static boolean lambda$new$0(Zbpn paramZbpn) {
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'x7päá7N½$%\\tSØþ»Åg=±Ñ ïQ(¿®­ÛËV·I\\nOU¾æh.tCÎóÌx\\rÃ{#´ïL-å¸ãÀ,ãv+üT>¿¾q[Ø@©a¡àîG.8N%Æ.Ü=íî''
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #126
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '3M®C\\tè§Ãñò¥'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #30
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic burp/Zbh3.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbh3.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #47
    //   214: goto -> 244
    //   217: bipush #26
    //   219: goto -> 244
    //   222: bipush #110
    //   224: goto -> 244
    //   227: bipush #77
    //   229: goto -> 244
    //   232: bipush #85
    //   234: goto -> 244
    //   237: bipush #59
    //   239: goto -> 244
    //   242: bipush #84
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3210) & 0xFFFF;
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
      byte b1 = 92;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbh3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */