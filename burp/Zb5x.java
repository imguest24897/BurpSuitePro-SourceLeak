package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zb5x extends Zbqc {
  private final Zbnt Zc;
  
  private final Zxs0 ZJ;
  
  private final Zmf9 ZV;
  
  private final Component ZN;
  
  private final Zei6 Zq;
  
  private final Zb_j ZM;
  
  private final Zg7s ZH;
  
  private final Zgun Zl;
  
  private final Zgun ZD;
  
  public Ze01 ZI;
  
  private Zm9t Zf;
  
  private Zm2o ZK;
  
  private Ze01 ZO;
  
  private Zbqc Zv;
  
  private Zbqc Zm;
  
  private Zbqc ZT;
  
  private Zbqc ZC;
  
  private Zbqc Zi;
  
  private Zz8s Zd;
  
  private Zm99 Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zb5x(Zmf9 paramZmf9, Zbnt paramZbnt, Zxs0 paramZxs0, Zm6x paramZm6x, Zei6 paramZei6, Zm2j paramZm2j, Zb_j paramZb_j) {
    this.ZV = paramZmf9;
    this.Zc = paramZbnt;
    this.ZJ = paramZxs0;
    this.Zq = paramZei6;
    this.ZM = paramZb_j;
    this.Zl = new Zgun(Ze3m.ZC(Zeuf.TOGGLE_OFF, Zlkk.TOGGLE_BUTTON_FOREGROUND).ZU(Zmcx.LINE_SIZE).Z_(), Zmpl.NORMAL);
    this.ZD = new Zgun(Ze3m.ZC(Zeuf.TOGGLE_ON, Zlkk.TOGGLE_BUTTON_SELECTED_FOREGROUND).ZU(Zmcx.LINE_SIZE).Z_(), Zmpl.SELECTED);
    ZY();
    Objects.requireNonNull(paramZei6);
    this.ZN = new Ze0v(paramZei6::Zx, this::Z_, paramZm6x);
    this.ZN.setEnabled(false);
    this.Zv.add(this.ZN, a(-28887, 29518));
    this.ZC.add(paramZm2j, a(-28891, 24704));
    ZM(paramZei6.ZU());
    this.Zf.Zv(Ze3m.ZC(Zeuf.EDIT, Zlkk.ACTION_NORMAL).ZU(Zmcx.LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_(), a(-28886, -28291), this::Zk);
    paramZm6x.ZO(Zlp.class, Zehw.SWING, this::lambda$new$0);
    paramZm6x.ZO(Ztzz.class, Zehw.SWING, this::lambda$new$1);
    this.Zi.setVisible(false);
    ZM();
    this.ZH = new Zb8f(this, paramZei6);
  }
  
  private void Zf() {
    this.Zb.setIcon(this.Zq.Zx() ? Ze3m.ZC(Zeuf.LOCK, Zlkk.INTERCEPT_LOCK_ICON).Z_() : null);
    this.Zb.setText(this.Zq.Zc());
  }
  
  private void ZR(Zz6e<?> paramZz6e) {
    boolean bool = Zmue.Zm();
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    if (paramZz6e != null) {
      ZH(paramZz6e);
      if (!bool) {
        Zh();
        return;
      } 
      return;
    } 
    Zh();
  }
  
  private void ZH(Zz6e<?> paramZz6e) {
    Zf();
    ZJ(true, paramZz6e.ZZ());
    this.Zi.setVisible(true);
  }
  
  private void Zh() {
    this.Zb.setIcon((Icon)null);
    this.Zb.setText(" ");
    ZJ(false, false);
    this.Zi.setVisible(false);
  }
  
  private void ZJ(boolean paramBoolean1, boolean paramBoolean2) {
    this.ZN.setEnabled(paramBoolean1);
    this.ZI.setEnabled(paramBoolean1);
    this.Zf.setVisible(paramBoolean2);
    this.Zb.setToolTipText(paramBoolean2 ? a(-28885, -22865) : null);
  }
  
  private void ZM(boolean paramBoolean) {
    String str = paramBoolean ? a(-28884, -12246) : a(-28893, 15613);
    this.Zd.setText(str);
    this.Zd.setSelected(paramBoolean);
  }
  
  private void ZH() {
    boolean bool = this.Zd.isSelected();
    Zm2.ZC(bool ? Zrrh.PROXY_INTERCEPT_INTERCEPTION_TURNED_ON : Zrrh.PROXY_INTERCEPT_INTERCEPTION_TURNED_OFF);
    this.Zq.ZM(bool);
  }
  
  private void Zk() {
    Zm2.ZC(Zrrh.PROXY_INTERCEPT_TARGET_MODIFIED);
    if (this.Zq.Zy() != null && this.Zq.Zy().ZZ() && this.Zq.Zy().ZJ() != null)
      (new Zrhy(this.ZH, this.Zq.Zy().ZJ(), this.Zc, Zzmm.PROXY_INTERCEPT)).setVisible(true); 
  }
  
  private void Z_() {
    boolean bool = Zmue.ZH();
    if (this.Zq.ZZ()) {
      this.ZV.Ze();
      if (bool) {
        this.ZV.ZS(this.Zq.Zl());
        return;
      } 
      return;
    } 
    this.ZV.ZS(this.Zq.Zl());
  }
  
  private void ZM() {
    Zbgj zbgj = new Zbgj(this::lambda$addSkidmark$2);
    Ze8a ze8a = (new Zzg(Zxdz.PROXY_INTERCEPT, this.Zd, this.ZM, zbgj)).Zm(Zla4.NORTH).ZH(Zrf0.WEST).Zx(15).ZG();
    this.Zd.addActionListener(ze8a::lambda$addSkidmark$3);
  }
  
  private void ZY() {
    this.Zm = new Zbqc();
    this.Zd = new Zz8s(new Zgun[] { this.Zl, this.ZD });
    this.Zv = new Zbqc();
    this.ZI = new Ze01();
    this.ZT = new Zbqc();
    this.Zi = new Zbqc();
    this.Zb = new Zm99();
    this.Zf = new Zm9t();
    this.ZO = new Ze01();
    this.ZK = new Zm2o();
    this.ZC = new Zbqc();
    setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    setLayout(new GridBagLayout());
    this.Zm.setLayout(new GridLayout(1, 5, 10, 0));
    this.Zd.setSelected(true);
    this.Zd.setText(a(-28890, 16359));
    this.Zd.setToolTipText(a(-28888, -16628));
    this.Zd.setName(a(-28895, -5569));
    this.Zd.addActionListener(new Zx06(this));
    this.Zm.add(this.Zd);
    this.Zv.setLayout(new BorderLayout());
    this.Zm.add(this.Zv);
    this.ZI.setText(a(-28894, -353));
    this.ZI.setEnabled(false);
    this.ZI.setName(a(-28881, 1548));
    this.ZI.addActionListener(new Zz9a(this));
    this.Zm.add(this.ZI);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    add(this.Zm, gridBagConstraints);
    this.ZT.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
    this.ZT.setLayout(new GridBagLayout());
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.Zi.setLayout(gridBagLayout);
    this.Zb.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    this.Zb.setHorizontalAlignment(4);
    this.Zb.setText(a(-28883, 23158));
    this.Zb.setIconTextGap(10);
    this.Zb.setName(a(-28896, -25456));
    this.Zb.addMouseListener(new Zx5g(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.weightx = 1.0D;
    this.Zi.add(this.Zb, gridBagConstraints);
    this.Zf.setName(a(-28889, -4241));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    this.Zi.add(this.Zf, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.weightx = 1.0D;
    this.ZT.add(this.Zi, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZT, gridBagConstraints);
    this.ZO.setIcon(Ze3m.ZC(Zeuf.PANEL_BROWSER, Zlkk.ACTION_NORMAL).Z_());
    this.ZO.setText(a(-28882, -16111));
    this.ZO.setToolTipText(a(-28892, -24683));
    this.ZO.setIconTextGap(6);
    this.ZO.addActionListener(new Ztq6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    add(this.ZO, gridBagConstraints);
    this.ZK.setBorder(BorderFactory.createEmptyBorder(0, 18, 0, 11));
    this.ZK.Zi(Zk97.DESKTOP_TOOLS_PROXY_INTERCEPT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    add(this.ZK, gridBagConstraints);
    this.ZC.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    add(this.ZC, gridBagConstraints);
  }
  
  private void Zf(ActionEvent paramActionEvent) {
    ZH();
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    this.ZV.Zq(this.Zq.Zl());
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    this.ZJ.Zp();
  }
  
  private void ZJ(MouseEvent paramMouseEvent) {
    Zk();
  }
  
  private static void lambda$addSkidmark$3(Ze8a paramZe8a, ActionEvent paramActionEvent) {
    paramZe8a.ZM();
  }
  
  private void lambda$addSkidmark$2() {
    Zz1q.Zc(SwingUtilities.getWindowAncestor(this.Zd), Zk97.DESKTOP_TOOLS_PROXY_INTERCEPT);
  }
  
  private void lambda$new$1(Ztzz paramZtzz) {
    ZR(paramZtzz.ZL9());
  }
  
  private void lambda$new$0(Zlp paramZlp) {
    ZM(paramZlp.ZQl());
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÌÂ!\\r¢ÄSª®Á¶íÜ}ÕÍ¸\\t ýaÁ£a\ÜËhÆÓÍgqáhr?¯Eà}%ÎQÞ_ÛDñkI´\\f A$tÇÃ~"®Feppýá§¡ev;¦;­õáRCôÓaIrùªdHýpí¥::g{Å7½V:"*\\fÈëk¨ú}wÃæØG¹TµÎ%?LîJVÖ`Ë§ux`&¬¥ÉÑøòFB9¯â,¿\?ô1Èo\\f·V&.aæ7÷Å° bû»æ´3³8ÅõôÅ¬õM@'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #69
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'ç(%é¾«¾¨DªPEstÎ¡Òy4à1íÀ¸À­1â'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #12
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #17
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
    //   128: putstatic burp/Zb5x.a : [Ljava/lang/String;
    //   131: bipush #16
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zb5x.b : [Ljava/lang/String;
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
    //   212: bipush #6
    //   214: goto -> 244
    //   217: bipush #8
    //   219: goto -> 244
    //   222: bipush #62
    //   224: goto -> 244
    //   227: bipush #24
    //   229: goto -> 244
    //   232: bipush #102
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #108
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8F22) & 0xFFFF;
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
      byte b1 = 12;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */