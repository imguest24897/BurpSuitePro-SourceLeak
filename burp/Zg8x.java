package burp;

import java.awt.BorderLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javafx.collections.FXCollections;
import javax.swing.BorderFactory;

public class Zg8x extends Zbqc implements Zzyl {
  private final Zsy Zy;
  
  private final Zgx0 ZI;
  
  private final Zgq7 ZF;
  
  private final Zbnt ZX;
  
  private final Zs6i ZS;
  
  private final Zm6x ZN;
  
  private final Zmgv Z_;
  
  private Zbws Zd;
  
  private Zmix Zs;
  
  private Zbdf ZY;
  
  private Zbdf Zo;
  
  private Ze65 ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg8x(Ztdi paramZtdi, Zgx0 paramZgx0, Ztyg paramZtyg, Zgq7 paramZgq7, Zbnt paramZbnt, Zs6i paramZs6i, Zm6x paramZm6x, boolean paramBoolean) {
    this.ZI = paramZgx0;
    this.ZF = paramZgq7;
    this.ZX = paramZbnt;
    this.ZS = paramZs6i;
    this.ZN = paramZm6x;
    this.Z_ = new Zzak(this);
    this.Zy = paramZgx0.ZC(this, paramZtdi);
    setLayout(new BorderLayout());
    Zmyz zmyz = new Zmyz(0);
    zmyz.setLeftComponent(Ze(paramBoolean));
    zmyz.setRightComponent(ZK(paramZtyg));
    zmyz.Za(30);
    add(zmyz, a(12368, -15770));
    this.Zd.Zc(this::lambda$new$0);
  }
  
  public void ZX(Zmnm paramZmnm) {
    this.Zd.clearSelection();
    this.Zs.Zk();
    this.ZY.ZN(new byte[0], Zgu3.HTTP_REQUEST);
    this.Zo.ZN(new byte[0], Zgu3.HTTP_RESPONSE);
    int[] arrayOfInt = Ztpr.ZJx();
    if (paramZmnm != null && !paramZmnm.ZOQ().isEmpty()) {
      this.Zs.addTableModelListener(new Zl1p(this));
      for (Zgnc zgnc : paramZmnm.ZOQ()) {
        this.Zs.Z_(new Ze65(zgnc, this.ZX));
        if (arrayOfInt != null)
          break; 
      } 
    } 
  }
  
  private Zbqc Ze(boolean paramBoolean) {
    this.Zs = new Zmix(FXCollections.observableArrayList());
    this.Zd = new Zbws(this.Zs);
    this.Zd.setName(a(12372, -25491));
    this.Zd.setRowSelectionAllowed(true);
    this.Zd.setDragEnabled(false);
    this.Zd.setSelectionMode(0);
    this.Zd.ZF(true);
    this.Zd.setAutoCreateRowSorter(true);
    this.Zd.getTableHeader().setReorderingAllowed(true);
    this.Zd.setFillsViewportHeight(true);
    Zbup zbup = new Zbup();
    zbup.setViewportView(this.Zd);
    Zk7p zk7p = new Zk7p(this);
    this.Zd.Zk(zk7p);
    zbup.addMouseListener(zk7p);
    Zbqc zbqc = new Zbqc(new BorderLayout());
    zbqc.add(zbup, a(12371, 11892));
    Zbkd zbkd = new Zbkd();
    zbkd.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
    zbkd.Zh(new Zm2j(this.Zd));
    Zgf8 zgf8 = new Zgf8();
    zgf8.setName(a(12375, 20351));
    Objects.requireNonNull(this.Zs);
    zgf8.Zv(this.Zs::Zv, 20);
    zgf8.addFocusListener(new Zm9z(zgf8, this.Zd.getName()));
    zbkd.ZX(zgf8);
    zbqc.add(zbkd, a(12369, 20722));
    if (paramBoolean) {
      this.ZS.Zc(this::lambda$buildTable$1);
      this.ZN.ZO(Ztjx.class, Zehw.SWING, this::lambda$buildTable$2);
    } 
    return zbqc;
  }
  
  private Zbdx ZK(Ztyg paramZtyg) {
    this.ZY = paramZtyg.Z_(this.Z_, Zeew.SCANNER, false, Zbdf.ZD, true, Zb9b.Zx);
    this.Zo = paramZtyg.Z_(this.Z_, Zeew.SCANNER, false, Zbdf.ZU, true, Zb9b.Zx);
    return this.ZF.ZP(Zxff.CRAWL_PATHS_TRAFFIC).ZA(this.ZY, a(12374, -31371)).Zp(this.Zo, a(12373, 16356)).Zo().Zl();
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    int i = this.Zd.getSelectedRow();
    if (i != -1) {
      int j = this.Zd.convertRowIndexToModel(i);
      return this.Zy.Zu(paramInt, this.Zs.ZW(j));
    } 
    return false;
  }
  
  private void lambda$buildTable$2(Ztjx paramZtjx) {
    List<Zlz8> list = paramZtjx.ZEU();
    Iterator<Zlz8> iterator = list.iterator();
    int[] arrayOfInt = Ztpr.ZJx();
    while (iterator.hasNext()) {
      Zlz8 zlz8 = iterator.next();
      if (zlz8.ZLx().equals(Zru.TARGET_CRAWL_PATH.id)) {
        this.Zd.Zj(zlz8);
        if (arrayOfInt != null)
          continue; 
        break;
      } 
      continue;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private Zlz8 lambda$buildTable$1() {
    return new Zlz8(Zru.TARGET_CRAWL_PATH.id, this.Zd.ZHh());
  }
  
  private void lambda$new$0(int paramInt1, int paramInt2) {
    this.ZR = this.Zs.ZW(this.Zd.convertRowIndexToModel(paramInt1));
    this.ZY.ZE(this.ZR.Zos(), Zgu3.HTTP_REQUEST);
    this.Zo.ZE(this.ZR.ZoO(), Zgu3.HTTP_RESPONSE);
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Å+ßr-ÊÜr~øu1)Ô êey«ôÆjdýëÄpÒçÓéÃîÜÈl(CRonî°«sgÃ7k?H '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #78
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
    //   68: ldc 'â|Áf4j'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #127
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
    //   129: putstatic burp/Zg8x.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg8x.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
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
    //   212: bipush #12
    //   214: goto -> 243
    //   217: bipush #48
    //   219: goto -> 243
    //   222: bipush #10
    //   224: goto -> 243
    //   227: bipush #47
    //   229: goto -> 243
    //   232: bipush #81
    //   234: goto -> 243
    //   237: bipush #17
    //   239: goto -> 243
    //   242: iconst_3
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3055) & 0xFFFF;
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
      byte b1 = 124;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */