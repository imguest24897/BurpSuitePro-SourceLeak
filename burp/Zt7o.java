package burp;

import java.awt.BorderLayout;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.util.EnumSet;
import java.util.Set;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zt7o extends Zthr {
  private static final Set<Short> Zy;
  
  private static final Set<Short> ZL;
  
  private final Zbdf ZN;
  
  private final Zbs7 Zs;
  
  private final Zt9q Zt;
  
  private final Zmpj Zq;
  
  private final Zbqc ZT;
  
  private boolean ZW;
  
  private Zs68 ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZV(EnumSet<Zgu3> paramEnumSet) {
    return paramEnumSet.contains(Zgu3.HTTP_RESPONSE);
  }
  
  Zt7o(Zbdf paramZbdf, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, Ze_8 paramZe_8, Zey9 paramZey9) {
    super(paramZey9);
    this.ZN = paramZbdf;
    this.ZE = Zrri.RENDER;
    this.Z_ = false;
    this.Zn = false;
    this.ZT = new Zbqc();
    this.ZT.setName(a(-4051, 5827));
    this.ZT.setLayout(new BorderLayout());
    this.ZM = this.ZT;
    this.Zs = new Zbs7(paramZe_8, paramZey9);
    this.Zt = new Zt9q(paramZgb6, paramZb0h, paramZtwv);
    this.Zq = new Zmpj();
    HierarchyListener hierarchyListener1 = this::lambda$new$0;
    HierarchyListener hierarchyListener2 = this::lambda$new$1;
    this.ZT.addHierarchyListener(hierarchyListener1);
    this.ZT.addHierarchyListener(hierarchyListener2);
  }
  
  private void ZX() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    SwingUtilities.invokeLater(this::Zl);
  }
  
  public boolean ZT(Zsmh paramZsmh, Zgu3 paramZgu3, Zs68 paramZs68, boolean paramBoolean) {
    int[] arrayOfInt = Zbdf.ZM();
    if (paramZgu3 == Zgu3.HTTP_RESPONSE && !paramBoolean) {
      this.Z_ = (ZB(paramZs68) || ZF(paramZs68));
      if (arrayOfInt != null) {
        this.Z_ = false;
        return this.Z_;
      } 
      return this.Z_;
    } 
    this.Z_ = false;
    return this.Z_;
  }
  
  public boolean ZD(Zefx paramZefx) {
    return false;
  }
  
  public void Zs(Zefx paramZefx, boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZC(Zefx paramZefx, boolean paramBoolean1, boolean paramBoolean2) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zy(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_VIEW_RENDER_TAB);
    if (this.Zg != paramZsmh) {
      this.ZP = paramZs68;
      this.Zg = paramZsmh;
      this.ZT.removeAll();
      this.ZW = true;
      Zl();
    } 
  }
  
  public void Za(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Za(Zsmh paramZsmh, boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZN(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {}
  
  public void ZV(int paramInt1, int paramInt2, String paramString) {}
  
  public Zsmh Zb() {
    return this.Zg;
  }
  
  public void Zx() {
    this.Zg = Zsmh.Zy;
    this.ZT.removeAll();
  }
  
  public Zkcm Zx(boolean paramBoolean) {
    return Zkcm.Zb(paramBoolean);
  }
  
  private void Zl() {
    if (!this.ZW || this.Zg == null || this.ZP == null)
      return; 
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    byte[] arrayOfByte = Zt6s.Zu(this.Zg);
    Zkcg zkcg = ZI(this.ZP.ZH.ZJ, arrayOfByte, this.ZP);
    if (zkcg != Zkcg.RENDERED && this.ZP.ZH.Zj != 256)
      zkcg = ZI(this.ZP.ZH.Zj, arrayOfByte, this.ZP); 
    if (zkcg == Zkcg.ERRORED)
      ZS(arrayOfByte, this.ZP); 
    this.ZW = false;
  }
  
  private Zkcg ZI(short paramShort, byte[] paramArrayOfbyte, Zs68 paramZs68) {
    try {
      switch (paramShort) {
        case 256:
        case 518:
          ZR(paramArrayOfbyte);
          return Zkcg.RENDERED;
        case 513:
        case 514:
        case 515:
          Zu(paramArrayOfbyte, paramZs68);
          return Zkcg.RENDERED;
        case 257:
          ZS(paramArrayOfbyte, paramZs68);
          return Zkcg.RENDERED;
      } 
      return Zkcg.UNKNOWN;
    } catch (Zeqa zeqa) {
      Zah.Zl(zeqa, Zk_.IGNORED);
      return Zkcg.ERRORED;
    } 
  }
  
  private boolean ZB(Zs68 paramZs68) {
    short s = paramZs68.ZH.ZJ;
    if (Zy.contains(Short.valueOf(s)) && !paramZs68.ZH.Zl) {
      int i = paramZs68.Zs - paramZs68.Zk;
      return (s != 256 || i >= 7);
    } 
    return false;
  }
  
  private boolean ZF(Zs68 paramZs68) {
    return (ZL.contains(Short.valueOf(paramZs68.ZH.Zj)) && !paramZs68.ZH.Zl);
  }
  
  private void Zu(byte[] paramArrayOfbyte, Zs68 paramZs68) throws Zeqa {
    this.Zq.Zl(paramArrayOfbyte, paramZs68.Zk);
    this.ZT.add(this.Zq.ZE(), a(-4052, -6525));
    SwingUtilities.invokeLater(this::lambda$renderContentAsImage$2);
  }
  
  private void ZS(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    this.Zt.ZB(paramArrayOfbyte, paramZs68.Zk);
    this.ZT.add(this.Zt.Zr(), a(-4050, -3329));
    SwingUtilities.invokeLater(this::lambda$renderContentAsImage$2);
  }
  
  private void ZR(byte[] paramArrayOfbyte) {
    this.ZT.add(this.Zs.ZC(paramArrayOfbyte, this.ZN), a(-4050, -3329));
    SwingUtilities.invokeLater(this::lambda$renderContentAsImage$2);
  }
  
  public Ztcw ZI() {
    return Zr_1.Zb(new Ztcw[] { super.ZI(), Zi });
  }
  
  public void ZU() {
    super.ZU();
  }
  
  private void lambda$renderContentAsImage$2() {
    Zmse.ZF(this.ZT);
  }
  
  private void lambda$new$1(HierarchyEvent paramHierarchyEvent) {
    if ((paramHierarchyEvent.getChangeFlags() & 0x4L) > 0L && !this.ZT.isShowing()) {
      this.ZW = true;
      this.ZT.removeAll();
    } 
  }
  
  private void lambda$new$0(HierarchyEvent paramHierarchyEvent) {
    if ((paramHierarchyEvent.getChangeFlags() & 0x4L) > 0L && this.ZT.isShowing())
      ZX(); 
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Bó #³øùh¡W9Å¹ÄmkP`,çX¼-'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #40
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
    //   69: putstatic burp/Zt7o.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zt7o.b : [Ljava/lang/String;
    //   79: goto -> 227
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
    //   98: if_icmpgt -> 200
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
    //   152: bipush #81
    //   154: goto -> 184
    //   157: bipush #101
    //   159: goto -> 184
    //   162: bipush #42
    //   164: goto -> 184
    //   167: bipush #97
    //   169: goto -> 184
    //   172: bipush #25
    //   174: goto -> 184
    //   177: bipush #21
    //   179: goto -> 184
    //   182: bipush #24
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: bipush #6
    //   229: anewarray java/lang/Short
    //   232: dup
    //   233: iconst_0
    //   234: sipush #256
    //   237: invokestatic valueOf : (S)Ljava/lang/Short;
    //   240: aastore
    //   241: dup
    //   242: iconst_1
    //   243: sipush #514
    //   246: invokestatic valueOf : (S)Ljava/lang/Short;
    //   249: aastore
    //   250: dup
    //   251: iconst_2
    //   252: sipush #513
    //   255: invokestatic valueOf : (S)Ljava/lang/Short;
    //   258: aastore
    //   259: dup
    //   260: iconst_3
    //   261: sipush #515
    //   264: invokestatic valueOf : (S)Ljava/lang/Short;
    //   267: aastore
    //   268: dup
    //   269: iconst_4
    //   270: sipush #518
    //   273: invokestatic valueOf : (S)Ljava/lang/Short;
    //   276: aastore
    //   277: dup
    //   278: iconst_5
    //   279: sipush #257
    //   282: invokestatic valueOf : (S)Ljava/lang/Short;
    //   285: aastore
    //   286: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   289: putstatic burp/Zt7o.Zy : Ljava/util/Set;
    //   292: iconst_5
    //   293: anewarray java/lang/Short
    //   296: dup
    //   297: iconst_0
    //   298: sipush #514
    //   301: invokestatic valueOf : (S)Ljava/lang/Short;
    //   304: aastore
    //   305: dup
    //   306: iconst_1
    //   307: sipush #513
    //   310: invokestatic valueOf : (S)Ljava/lang/Short;
    //   313: aastore
    //   314: dup
    //   315: iconst_2
    //   316: sipush #515
    //   319: invokestatic valueOf : (S)Ljava/lang/Short;
    //   322: aastore
    //   323: dup
    //   324: iconst_3
    //   325: sipush #518
    //   328: invokestatic valueOf : (S)Ljava/lang/Short;
    //   331: aastore
    //   332: dup
    //   333: iconst_4
    //   334: sipush #257
    //   337: invokestatic valueOf : (S)Ljava/lang/Short;
    //   340: aastore
    //   341: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   344: putstatic burp/Zt7o.ZL : Ljava/util/Set;
    //   347: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF02C) & 0xFFFF;
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
      char c = '¦';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */