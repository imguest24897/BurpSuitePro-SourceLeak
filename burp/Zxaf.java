package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import net.portswigger.Zkb;

public class Zxaf extends Zxer implements ActionListener {
  private final Zz0n Z_;
  
  private final Zerg Zl;
  
  private final Ztwv Zk;
  
  private final Zgvd ZP;
  
  private final boolean Zj;
  
  private final Zbqc Zv;
  
  private final Zm99 ZS;
  
  private final Zx0n Zn;
  
  private final Zx0n Zy;
  
  private final Zx0n Zh;
  
  private final Ze01 ZT;
  
  private final Zx0_ Zb;
  
  private final Zbup ZH;
  
  private final Zsg_ ZL;
  
  private Zrdb Zq;
  
  private static Zbqc[] Zm;
  
  private static final String[] a;
  
  private static final String[] d;
  
  public Zxaf(Zz0n paramZz0n, Zerg paramZerg, Ztwv paramZtwv, Zgb6 paramZgb6, Ztyg paramZtyg, Zgq7 paramZgq7, Zey9 paramZey9, boolean paramBoolean) {
    this.Z_ = paramZz0n;
    this.Zl = paramZerg;
    this.Zk = paramZtwv;
    this.Zj = paramBoolean;
    this.ZP = new Zgvd(paramZtyg, paramZgq7, paramZey9);
    this.ZL = new Zsg_(new Zxco(paramZz0n, paramZgb6, paramZtyg, paramZgq7, paramZey9));
    setBorder(new Zr43(Zlkk.BORDER));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 20, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 10, 0, 10, 0, 0, 0, 0, 0, 0, 
        0, 10, 0 };
    this.Zv = new Zbqc(gridBagLayout);
    this.Zv.setBorder(BorderFactory.createEmptyBorder(15, 20, 20, 20));
    this.Zv.Zl(Zlkk.BACKGROUNDER);
    this.Zv.setVisible(false);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 1;
    this.ZS = new Zm99();
    this.ZS.ZE(Zt00.TITLE_BOLD_FONT);
    this.ZS.Ze(Zlkk.SOLID_FOREGROUND);
    this.ZS.setIconTextGap(8);
    this.ZS.setName(b(23903, -29993));
    Zbkq zbkq = new Zbkq(paramZz0n, this::ZW);
    this.ZT = new Ze01(b(23893, 6883));
    this.ZT.setToolTipText(b(23889, -20482));
    this.ZT.setVisible(false);
    this.ZT.addActionListener(this);
    Zbqc zbqc1 = new Zbqc();
    zbqc1.setOpaque(false);
    zbqc1.setLayout(new BoxLayout(zbqc1, 0));
    zbqc1.add(this.ZT);
    zbqc1.add(Box.createHorizontalStrut(8));
    zbqc1.add(zbkq);
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.setOpaque(false);
    zbqc2.add(this.ZS, b(23894, 4656));
    zbqc2.add(zbqc1, b(23888, 22902));
    this.Zv.add(zbqc2, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    this.Zv.add(new Zem9(), gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    Zx0n zx0n1 = new Zx0n(b(23895, -3054));
    this.Zv.add(zx0n1, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 23;
    this.Zn = new Zx0n();
    this.Zv.add(this.Zn, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    Zx0n zx0n2 = new Zx0n(b(23891, -10163));
    this.Zv.add(zx0n2, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 23;
    this.Zy = new Zx0n();
    this.Zv.add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    Zx0n zx0n3 = new Zx0n(b(23890, 25299));
    this.Zv.add(zx0n3, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 23;
    this.Zh = new Zx0n();
    this.Zv.add(this.Zh, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    this.Zv.add(new Zem9(), gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    Zbqc[] arrayOfZbqc = ZL();
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 1;
    this.Zb = new Zx0_(400);
    this.Zb.Zx(Zlkk.BACKGROUNDER);
    this.Zb.setEditable(false);
    this.Zb.setContentType(b(23892, -13959));
    this.Zb.Zf();
    this.Zb.addHyperlinkListener(new Zew1((Component)this));
    this.Zv.add(this.Zb, gridBagConstraints);
    this.ZH = new Zbup();
    this.ZH.setViewportView(this.Zv);
    this.ZH.setBorder(BorderFactory.createEmptyBorder());
    add(b(23902, -13945), this.ZH);
    addChangeListener(this::lambda$new$0);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zq != null)
      ZV(this.Zq); 
    if (this.ZL != null)
      this.ZL.Zh(); 
  }
  
  public void ZQ(Zrdb paramZrdb) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zxaf;Lburp/Zrdb;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private String ZW() {
    if (this.Zq != null) {
      Zree zree = Zrf1.Za.ZK(this.Zq);
      return (new Zlch(this.Zq, zree, this.Zj)).Z_(true);
    } 
    return "";
  }
  
  private void ZV(Zrdb paramZrdb) {
    this.Zq = paramZrdb;
    int i = getSelectedIndex();
    Zbqc[] arrayOfZbqc = ZL();
    this.ZP.ZH();
    while (getTabCount() > 1) {
      removeTabAt(1);
      if (arrayOfZbqc == null)
        break; 
    } 
    if (paramZrdb == null) {
      this.Zv.setVisible(false);
      return;
    } 
    Zree zree = Zrf1.Za.ZK(paramZrdb);
    byte b1 = this.Zj ? paramZrdb.ZaJ() : paramZrdb.Zaw();
    byte b2 = this.Zj ? paramZrdb.Zac() : paramZrdb.Zak();
    ImageIcon imageIcon = Ztvx.ZO(b1, b2, false);
    this.ZS.setText(zree.ZZV());
    this.ZS.setIcon(imageIcon);
    this.Zn.setText(Zls9.Zx(b1));
    this.Zy.setText(Zewc.ZO(b2));
    StringBuilder stringBuilder = new StringBuilder();
    Zmzk zmzk = paramZrdb.ZaB();
    Zrlp.Zn(stringBuilder, (zmzk == null) ? "" : zmzk.toString());
    byte[] arrayOfByte = paramZrdb.Zax();
    if (arrayOfByte != null)
      Zrlp.Zn(stringBuilder, Zkb.ZG(arrayOfByte)); 
    this.Zh.setText(stringBuilder.toString());
    this.Zb.setText((new Zlch(paramZrdb, zree, this.Zj)).Z_(false));
    this.Zv.setVisible(true);
    SwingUtilities.invokeLater(this::lambda$showIssueInternal$2);
    this.ZL.ZN();
    Ze(paramZrdb, new Zlri(this, paramZrdb));
    boolean bool = this.Zq.Za7().ZK();
    this.ZT.setVisible(bool);
    if (i > 0 && i < getTabCount())
      setSelectedIndex(i); 
  }
  
  public static void Ze(Zrdb paramZrdb, Zms5 paramZms5) {
    Zs5s zs5s = new Zs5s();
    paramZrdb.Za7().Zj(zs5s::lambda$outputToDesktopUi$3);
    Zgxh zgxh = new Zgxh(paramZms5, zs5s);
    paramZrdb.Za7().Zj(zgxh::lambda$outputToDesktopUi$4);
    if (paramZrdb.Za7().ZQ() > 0) {
      boolean bool = zgxh.ZS.stream().anyMatch(Zzi8::Za3);
      paramZms5.Za(zgxh.Ze, bool);
    } 
  }
  
  public JComponent ZB() {
    return (JComponent)this;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    Object object = paramActionEvent.getSource();
    if (object == this.ZT) {
      Zs5s zs5s = new Zs5s();
      this.Zq.Za7().ZO().Zu2().Zf(zs5s);
      Zstu zstu1 = ((Zzi8)zs5s.Zs.get(0)).ZoO();
      Zstu zstu2 = ((Zzi8)zs5s.Zs.get(1)).ZoO();
      if (zstu1 == null || zstu2 == null)
        return; 
      this.Zk.Zx(new Zl0p(this.Zl.Zk().ZYW(), b(23901, -15675) + b(23901, -15675), new Zbzh(zstu1, false), new Zbzh(zstu2, false), false, this.Z_.ZD()));
    } 
  }
  
  private static void lambda$outputToDesktopUi$4(Zgxh paramZgxh, Zgkc paramZgkc) {
    paramZgkc.Zu2().Zf(paramZgxh);
  }
  
  private static void lambda$outputToDesktopUi$3(Zs5s paramZs5s, Zgkc paramZgkc) {
    paramZgkc.Zu2().Zf(paramZs5s);
  }
  
  private void lambda$showIssueInternal$2() {
    this.ZH.getViewport().setViewPosition(new Point(0, 0));
  }
  
  private void lambda$showIssue$1(Zrdb paramZrdb) {
    ZV(paramZrdb);
    Zmse.ZF((Component)this);
  }
  
  private void lambda$new$0(ChangeEvent paramChangeEvent) {
    int i = getSelectedIndex();
    if (i < 1)
      return; 
    Component component = getComponentAt(i);
    if (component instanceof Zb3) {
      Zb3 zb3 = (Zb3)component;
      zb3.Zt();
    } 
  }
  
  public static void Zo(Zbqc[] paramArrayOfZbqc) {
    Zm = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZL() {
    return Zm;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_3
    //   10: anewarray burp/Zbqc
    //   13: ldc '0ûÙh!ç wå¶iÐ;(RãÖß9ö·zmA Ö\\tyË=/ÇÐÇ\\bÀÔGºê¶X)¬\\f.v\\bHsK­·?ã"º pçÌí{ïx7\\n©ö¿ÓÕ}bÅ¾Ø-¦i;1'³ax®"ù½Æ-¿·è\\r["¸ì7»½'Ì¥gn´5Uã¸Àd üê'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #9
    //   24: istore_1
    //   25: invokestatic Zo : ([Lburp/Zbqc;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: iconst_5
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
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
    //   71: goto -> 30
    //   74: ldc 'u\\n±qá¾¡÷@ï×PàÏ_ÿ}=Ìv-æw~ÝÈM\\b'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #8
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #70
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zxaf.a : [Ljava/lang/String;
    //   138: bipush #11
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zxaf.d : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #112
    //   222: goto -> 252
    //   225: bipush #99
    //   227: goto -> 252
    //   230: bipush #59
    //   232: goto -> 252
    //   235: bipush #114
    //   237: goto -> 252
    //   240: bipush #18
    //   242: goto -> 252
    //   245: bipush #81
    //   247: goto -> 252
    //   250: bipush #108
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5D57) & 0xFFFF;
    if (d[i] == null) {
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
      char c = '';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxaf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */