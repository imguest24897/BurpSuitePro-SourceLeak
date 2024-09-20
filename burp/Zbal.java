package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zbal extends Zbv5 implements Zedo {
  private final Zt4u ZM;
  
  private final Zm5v Zr;
  
  private final Zb0h Zg;
  
  private final Ztwv ZB;
  
  private final Zr_4 ZD;
  
  private final Zr1m ZA;
  
  private final List<byte[]> ZQ;
  
  private final Zt0_<byte[]> Zb;
  
  private int ZP = Integer.MAX_VALUE;
  
  private int ZC;
  
  private static int Zz;
  
  private Zm2o Zd;
  
  private Zl8w Zk;
  
  private Zbkc ZN;
  
  private Zmyw Zc;
  
  private Ze01 Z_;
  
  private Ze01 Zl;
  
  private Ze0q ZO;
  
  private Ze01 ZX;
  
  private Zm99 ZF;
  
  private Zm99 ZV;
  
  private Zm99 ZR;
  
  private Zm99 ZE;
  
  private Zm99 ZW;
  
  private Zm99 Zj;
  
  private Zbup ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbal(Zz0n paramZz0n, Zt4u paramZt4u, Zm5v paramZm5v, Ztwv paramZtwv, Zr_4 paramZr_4, Zr1m paramZr1m) {
    this.ZM = paramZt4u;
    this.Zr = paramZm5v;
    this.ZB = paramZtwv;
    this.ZD = paramZr_4;
    this.ZA = paramZr1m;
    this.Zg = paramZz0n.ZD();
    ZZ();
    this.Zb = (Zt0_)new Zt0_<>();
    this.ZQ = (List)this.Zb.ZL();
    this.ZT.setViewportView(new Zbws(this.Zb));
  }
  
  public void Zt2() {}
  
  private void ZZ(List<byte[]> paramList) {
    boolean bool = Zba6.ZT();
    int i = paramList.size();
    if (this.ZQ.size() + i > 20000)
      i = 20000 - this.ZQ.size(); 
    Iterator<byte> iterator = paramList.iterator();
    while (iterator.hasNext() && i-- > 0) {
      byte[] arrayOfByte = (byte[])iterator.next();
      if (arrayOfByte.length < this.ZP)
        this.ZP = arrayOfByte.length; 
      if (arrayOfByte.length > this.ZC)
        this.ZC = arrayOfByte.length; 
      this.ZQ.add(arrayOfByte);
      if (!bool)
        break; 
    } 
    if (!this.ZQ.isEmpty()) {
      this.ZW.setText((this.ZQ.size() < 20000) ? Integer.toString(this.ZQ.size()) : a(-2098, 20776));
      this.Zj.setText(Integer.toString(this.ZP));
      this.ZE.setText(Integer.toString(this.ZC));
    } 
    this.Zb.fireTableDataChanged();
  }
  
  private void ZZ() {
    this.ZF = new Zm99();
    this.ZW = new Zm99();
    this.ZV = new Zm99();
    this.Zj = new Zm99();
    this.ZR = new Zm99();
    this.ZE = new Zm99();
    this.Zl = new Ze01();
    this.ZX = new Ze01();
    this.Z_ = new Ze01();
    this.ZO = new Ze0q();
    this.Zc = new Zmyw();
    this.ZT = new Zbup();
    this.Zk = new Zl8w();
    this.ZN = new Zbkc();
    this.Zd = new Zm2o();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZF.setText(a(-2097, -14201));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZF, gridBagConstraints);
    this.ZW.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZW, gridBagConstraints);
    this.ZV.setText(a(-2104, -32352));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZV, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.Zj, gridBagConstraints);
    this.ZR.setText(a(-2082, 31667));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZR, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZE, gridBagConstraints);
    this.Zl.setText(a(-2083, 23634));
    this.Zl.setToolTipText(a(-2100, 28223));
    this.Zl.addActionListener(new Zzcg(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zl, gridBagConstraints);
    this.ZX.setText(a(-2103, 19207));
    this.ZX.setToolTipText(a(-2084, 11726));
    this.ZX.addActionListener(new Zsqg(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZX, gridBagConstraints);
    this.Z_.setText(a(-2107, 10408));
    this.Z_.setToolTipText(a(-2106, 231));
    this.Z_.addActionListener(new Zsvn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Z_, gridBagConstraints);
    this.ZO.setText(a(-2102, -7239));
    this.ZO.addActionListener(new Zlkr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.ZO, gridBagConstraints);
    this.Zc.setLeftComponent(this.ZT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zc, gridBagConstraints);
    this.Zk.setColumns(20);
    this.Zk.setText(a(-2111, -17512));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zk, gridBagConstraints);
    this.ZN.Zx(a(-2105, 9320));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    add(this.ZN, gridBagConstraints);
    this.Zd.Zi(Zk97.DESKTOP_TOOLS_SEQUENCER_SAMPLE_MANUAL_LOAD);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zd, gridBagConstraints);
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    Zx_j zx_j;
    try {
      if (this.ZQ.size() < Zgpg.Zf[0]) {
        Zx6o.Zv(this.Zr.Zn(), a(-2109, -19720), a(-2108, 4457) + a(-2108, 4457) + Zgpg.Zf[0]);
        return;
      } 
    } catch (Zs0j zs0j) {
      throw a(null);
    } 
    try {
      zx_j = this.Zr.Zq(true);
    } catch (Zs0j zs0j) {
      Zah.Zl(zs0j, Zk_.USER_ERROR);
      Zx6o.Zv(this, a(-2101, -1859), a(-2110, 874));
      return;
    } 
    Zm2.Zo(Zze0.SEQUENCER_MANUAL_LOAD_ANALYSIS);
    Zl4x zl4x = new Zl4x(this.ZM, this.Zr.Zn(), a(-2099, -30755) + a(-2099, -30755) + ++Zz, zx_j, this.ZQ, this.Zg, this.ZB, this.ZD, this.ZA);
    zl4x.setVisible(true);
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    this.Zb.ZS();
    this.ZP = Integer.MAX_VALUE;
    this.ZC = 0;
    this.ZW.setText("0");
    this.Zj.setText("");
    this.ZE.setText("");
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    File file = Zs6n.ZP(Zg1m.CONFIG, this.ZM, this, 0);
    if (file != null)
      try {
        List<byte[]> list = Zs6n.Zu(file);
        ZZ(list);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
  }
  
  private void Zh(ActionEvent paramActionEvent) {
    boolean bool = Zba6.ZY();
    try {
      String str1 = this.Zg.Zp();
      if (str1 == null)
        return; 
      ArrayList<byte[]> arrayList = new ArrayList();
      BufferedReader bufferedReader = new BufferedReader(new StringReader(str1));
      String str2;
      while ((str2 = bufferedReader.readLine()) != null) {
        arrayList.add(Zkb.Zy(str2));
        if (bool)
          break; 
      } 
      bufferedReader.close();
      ZZ((List<byte[]>)arrayList);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ï¹½ápíÎÖ"|ókg³æúv íðÒÊÑÎAóè±øF¸ß2q`Õps¾dÐ{iºYó<Þ=®Côø\\tM¿@s2¬\\bô¹l¡'Q \K½9DÆ|Åxò ¶¸çm }IÔ BLæ3Ùë¤ï`çýïÈÂô«(?þ©Ñ«h1ðdop²æÌ´«Ò©ü¼¹Abyø!*ËHF|W ÁÅá,×9ÜÈn@JÉm73û<#]æ¦@åkZÔCWKæKrËTáý3²(rr)¬]oH\\bû&9Â5¾TÖ¤ß^q3ÙMq!1sgeIMK²{ñkªHE °}|)¡«ÁÏwÈÁ`uZîÆ|:\\f`¯¯\\tÎPÊÜk½Û»àÛvi?¿êui[pbòï¢·÷Z×.}Y6¦ë\\r¢Ú~ä~]d )ûäRÙNÃö$V¦ßÀ¥f³}_"7\WÊÛ*y¦`ÇÉT¶&LË»ÔÂÿ4Ä1dydµäØbè@¹aàµ5ì'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #20
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #53
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
    //   68: ldc '<=V¡¢½\\b¤÷JB×%ñ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #26
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
    //   129: putstatic burp/Zbal.a : [Ljava/lang/String;
    //   132: bipush #19
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbal.b : [Ljava/lang/String;
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
    //   212: bipush #59
    //   214: goto -> 244
    //   217: bipush #19
    //   219: goto -> 244
    //   222: bipush #75
    //   224: goto -> 244
    //   227: bipush #98
    //   229: goto -> 244
    //   232: bipush #54
    //   234: goto -> 244
    //   237: bipush #114
    //   239: goto -> 244
    //   242: bipush #54
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
    //   300: iconst_0
    //   301: putstatic burp/Zbal.Zz : I
    //   304: return
  }
  
  private static Zs0j a(Zs0j paramZs0j) {
    return paramZs0j;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF7CC) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbal.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */