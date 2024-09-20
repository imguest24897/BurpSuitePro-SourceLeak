package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JSeparator;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;
import net.portswigger.Zmw;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl4q extends Zl04 implements Zmgv {
  private final Zerg Zw;
  
  private final Zb0h ZR;
  
  private final Zr_4 Zg;
  
  private final Object Zs;
  
  private final Zbdf ZY;
  
  private final Zbkv Z_;
  
  private final Zl8w ZP;
  
  private final Zmzk ZS;
  
  private final Ztwv ZA;
  
  private final Zmar Ze;
  
  private final Zey9 ZX;
  
  private Zm2o Zk;
  
  private Ze01 Zz;
  
  private Ze01 ZL;
  
  private Ze01 ZN;
  
  private Ze01 Zq;
  
  private Ze01 Zt;
  
  private Zm99 ZF;
  
  private Zm99 ZM;
  
  private Zbqc Zn;
  
  private Zbqc ZJ;
  
  private Zbqc ZZ;
  
  private Zbqc Zx;
  
  private Zbqc ZC;
  
  private JSeparator Zc;
  
  private Zm99 Zv;
  
  private Zbqc Zl;
  
  private Zbqc ZH;
  
  private Zbqc Zi;
  
  private Zbqc Zh;
  
  private Zbqc ZE;
  
  private Zmyz ZV;
  
  private static boolean Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl4q(Zz0n paramZz0n, Zerg paramZerg, Zgb6 paramZgb6, Zeew paramZeew, Window paramWindow, Zmzk paramZmzk, Zbr paramZbr, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zgsq paramZgsq, Zey9 paramZey9) {
    Zuh.Zv((paramZerg != null), Zqf.Zv, 0L);
    Zuh.Zv((paramZr_4 != null), Zqf.Zv, 2L);
    Zm2.ZC(Zrrh.SUITE_TOOLS_GENERATE_CSRF_POC);
    this.Zw = paramZerg;
    this.ZS = paramZmzk;
    this.ZA = paramZtwv;
    this.Zg = paramZr_4;
    this.ZX = paramZey9;
    this.Ze = new Zmar();
    this.Zs = new Object();
    this.ZR = paramZz0n.ZD();
    Zs();
    Zmse.Zf(this.ZV, 100, 35);
    this.ZV.Za(30);
    this.ZP = new Zl8w();
    this.ZP.Zl(true);
    this.ZE.add(this.ZP, a(23911, 5936));
    this.ZH.remove(this.ZE);
    this.ZN.addMouseListener(new Zlx_(this.ZN, this.Ze, this::ZZ));
    setTitle(a(23906, -30574));
    this.ZY = paramZtyg.Zz(this, paramZeew, true, Zbdf.ZD, Zb9b.Zx);
    this.Zh.add(paramZgq7.ZP(Zxff.CSRF_POC_GENERATOR).Zc(this.ZY).Zz().Zo().Zl(), a(23917, -3345));
    this.Z_ = new Zbkv(true, paramZgb6, this.ZR, paramZtwv);
    this.Zi.add(this.Z_, a(23917, -3345));
    this.Zv.setText(paramZmzk.toString());
    this.ZY.ZA(paramZbr.ZP(paramZmzk, paramZey9), paramZgsq);
    ZZ();
    pack();
    ZO(paramWindow);
    setVisible(true);
    if (bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  private void ZZ() {
    this.ZA.Zx(this::lambda$createCsrfPoc$0);
  }
  
  private void Zs() {
    this.Zn = new Zbqc();
    this.ZF = new Zm99();
    this.Zv = new Zm99();
    this.ZN = new Ze01();
    this.Zk = new Zm2o();
    this.Zl = new Zbqc();
    this.Zc = new JSeparator();
    this.ZV = new Zmyz();
    this.Zh = new Zbqc();
    this.Zx = new Zbqc();
    this.ZC = new Zbqc();
    this.ZM = new Zm99();
    this.Zi = new Zbqc();
    this.ZH = new Zbqc();
    this.ZE = new Zbqc();
    this.ZZ = new Zbqc();
    this.Zq = new Ze01();
    this.ZJ = new Zbqc();
    this.Zt = new Ze01();
    this.ZL = new Ze01();
    this.Zz = new Ze01();
    setDefaultCloseOperation(2);
    this.Zn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.Zn.setLayout(gridBagLayout);
    this.ZF.setText(a(23932, 8984));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 512;
    this.Zn.add(this.ZF, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 512;
    gridBagConstraints.weightx = 1.0D;
    this.Zn.add(this.Zv, gridBagConstraints);
    this.ZN.setText(a(23907, -441));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 768;
    this.Zn.add(this.ZN, gridBagConstraints);
    this.Zk.Zi(Zk97.DESKTOP_FUNCTIONS_GENERATE_CSRF_POC);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 22;
    this.Zn.add(this.Zk, gridBagConstraints);
    getContentPane().add(this.Zn, a(23914, 19806));
    this.Zl.setLayout(new BorderLayout());
    this.Zl.add(this.Zc, a(23911, 5936));
    this.ZV.setOrientation(0);
    this.Zh.setLayout(new BorderLayout(0, 10));
    this.ZV.setLeftComponent(this.Zh);
    this.Zx.setBorder(BorderFactory.createEmptyBorder(10, 8, 10, 10));
    this.Zx.setLayout(new BorderLayout(0, 10));
    this.ZC.setLayout(new BorderLayout());
    this.ZM.setText(a(23918, 32380));
    this.ZC.add(this.ZM, a(23908, 13506));
    this.Zx.add(this.ZC, a(23911, 5936));
    this.Zi.setLayout(new BorderLayout());
    this.Zx.add(this.Zi, a(23915, 10910));
    this.ZV.setRightComponent(this.Zx);
    this.Zl.add(this.ZV, a(23917, -3345));
    getContentPane().add(this.Zl, a(23917, -3345));
    this.ZH.setLayout(new BorderLayout());
    this.ZE.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
    this.ZE.setLayout(new BorderLayout());
    this.ZH.add(this.ZE, a(23911, 5936));
    this.Zq.setText(a(23919, 1249));
    this.Zq.addActionListener(new Zm1h(this));
    this.ZZ.add(this.Zq);
    this.ZH.add(this.ZZ, a(23933, 1023));
    this.Zt.setText(a(23931, 676));
    this.Zt.addActionListener(new Zxv(this));
    this.ZJ.add(this.Zt);
    this.ZL.setText(a(23934, 10841));
    this.ZL.addActionListener(new Zsv_(this));
    this.ZJ.add(this.ZL);
    this.Zz.setText(a(23935, -27153));
    this.Zz.addActionListener(new Ztcl(this));
    this.ZJ.add(this.Zz);
    this.ZH.add(this.ZJ, a(23913, 23630));
    getContentPane().add(this.ZH, a(23904, 4994));
    pack();
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    ZZ();
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    byte[] arrayOfByte = Zmw.Zq(new byte[][] { Zkb.Zy(a(23916, -21168)), this.Z_.ZF() });
    this.Zw.ZJ().Zf(null, this.Zg.ZZ(arrayOfByte), this, (byte)2);
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    this.ZR.ZR(this.Z_.Zp());
  }
  
  public Zmzk Zod() {
    return this.ZS;
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return new Zepa(a(23910, -11593), Zk97.DESKTOP_FUNCTIONS_GENERATE_CSRF_POC, Zt2m.ZF(this));
  }
  
  public Zbr Zo3() {
    Zsmh zsmh = this.ZY.Zi();
    if (zsmh != null) {
      Zgjd zgjd = new Zgjd(this.ZY.Zs());
      zsmh.Zh(zgjd);
      return zgjd.Zw();
    } 
    return null;
  }
  
  public Zgsq Zoe() {
    return this.ZY.Zs();
  }
  
  public Zstu Zos() {
    return Zyf.Zy(Zt6s.Zu(this.ZY.Zi()));
  }
  
  public Zstu ZoO() {
    return null;
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return 0L;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  private void lambda$createCsrfPoc$0() {
    synchronized (this.Zs) {
      this.Z_.Zc(false);
      this.Zq.setEnabled(false);
      this.ZL.setEnabled(false);
      this.Zt.setEnabled(false);
      this.ZN.setEnabled(false);
      this.Z_.Zx(Zkb.Zy(a(23909, 7845)));
      this.ZH.remove(this.ZE);
      try {
        StringBuilder stringBuilder = new StringBuilder();
        byte[] arrayOfByte = (new Zslx(this.ZY.Zi(), this.Ze.Zu(), this.Ze.Zq(), stringBuilder, this.ZX)).ZH();
        List<Ztu8> list = Zeam.Zv(arrayOfByte, 0, arrayOfByte.length, (byte)0);
        Zs68 zs68 = Zgv9.ZG().Zp(list).Zl();
        try {
          this.Z_.Zz(arrayOfByte, null, zs68.Zd);
          if (!stringBuilder.isEmpty()) {
            this.ZP.setText(a(23905, -16742) + a(23905, -16742));
            this.ZH.add(this.ZE, a(23911, 5936));
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
        this.Z_.Zx(Zkb.Zy(a(23912, -9229)));
      } 
      this.ZH.revalidate();
      this.ZH.validate();
      this.ZH.repaint();
      this.Z_.Zc(true);
      this.Zq.setEnabled(true);
      this.ZL.setEnabled(true);
      this.Zt.setEnabled(true);
      this.ZN.setEnabled(true);
    } 
  }
  
  public static void ZO(boolean paramBoolean) {
    Zo = paramBoolean;
  }
  
  public static boolean ZC() {
    return Zo;
  }
  
  public static boolean ZN() {
    boolean bool = ZC();
    return !bool;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '~®|¢%@\\nHX¼g^ød\\r;\\n=OÅ»bÛÃ\\baÅp4òb1%.Hjx´ç¢¡.êAÚrVÃ6A épè,ÞÂí:¥U\\bÞR(ì«¼XAºgt¬9\\rd}ei)ò:w$,\\nYm\\bád'Kà²n´ÖØ½¶Òª:°ä{aÏ\\fHù4v}`Û:ì\\tÇ±'âÓzéB 7Ú6(DÖâ'BgÒeK¢tSöWK9®##Ù`9É 0_^öº²ßAÑ¡`:nvd÷bcK>·ÃEY6z\\b>uX"Q¤¼cÁ¡¼ »ÌÂ¨Ã¤\\f'¯¢¹Ã©Z¸ùÁßzì²o éB0"6_ôà-,]4±E(XXËgúâêÄ­¬c³ö¥óò2ÉØ×t\\tWïÍC@ïìjN\\t^g×z¢ò¶R'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_0
    //   19: bipush #10
    //   21: istore_1
    //   22: invokestatic ZO : (Z)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #70
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'ÛÒ4¤È¸CiCg² ÉuâùG©Bº_:·'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #11
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #111
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zl4q.a : [Ljava/lang/String;
    //   136: bipush #21
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zl4q.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 263
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #17
    //   218: goto -> 247
    //   221: bipush #19
    //   223: goto -> 247
    //   226: bipush #96
    //   228: goto -> 247
    //   231: bipush #11
    //   233: goto -> 247
    //   236: bipush #74
    //   238: goto -> 247
    //   241: iconst_5
    //   242: goto -> 247
    //   245: bipush #90
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 170
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 166
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5D6F) & 0xFFFF;
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
      byte b1 = 29;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */