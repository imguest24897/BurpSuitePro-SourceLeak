package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import net.portswigger.Zkb;

public class Zr76 extends Zrh7 {
  private final Zzdy[] Zt;
  
  private boolean ZS;
  
  private Zbqc Zv;
  
  private ButtonGroup ZB;
  
  private ButtonGroup Za;
  
  private Zzdy Zn;
  
  private Zzdy Zz;
  
  private Ze01 Zr;
  
  private Ze01 Z_;
  
  private Ze01 Zk;
  
  private Ze01 ZE;
  
  private Zbqc Zb;
  
  private Zm99 ZV;
  
  private Zm99 ZI;
  
  private Zbqc ZP;
  
  private Zmg2 Zh;
  
  private Zmg2 ZN;
  
  private Zmg2 ZM;
  
  private Zmg2 Zl;
  
  private Zg85 Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zr76(Window paramWindow, String[] paramArrayOfString, Zmuy paramZmuy) {
    super(paramWindow, true, Zzv7.SAVE_RESULTS_UI_DIALOG);
    Zl();
    this.Zt = new Zzdy[paramArrayOfString.length];
    int i = Zbyw.Zp();
    this.Zb.setLayout(new GridLayout((int)Math.ceil(Math.sqrt(paramArrayOfString.length) * 2.0D), (int)Math.ceil(Math.sqrt(paramArrayOfString.length) / 2.0D)));
    byte b = 0;
    while (b < paramArrayOfString.length) {
      this.Zt[b] = new Zzdy();
      this.Zt[b].setText(paramArrayOfString[b]);
      this.Zt[b].setSelected(paramZmuy.ZN(b));
      this.Zb.add(this.Zt[b]);
      b++;
      if (i == 0)
        break; 
    } 
    pack();
    Zq(paramWindow);
  }
  
  public boolean ZZ() {
    return this.ZS;
  }
  
  public byte[] Zd() {
    return this.ZN.isSelected() ? Zkb.Zy(this.Zc.getText()) : Zkb.Zy("\t");
  }
  
  public boolean Zy() {
    return this.Zn.isSelected();
  }
  
  public boolean[] Zw() {
    boolean[] arrayOfBoolean = new boolean[this.Zt.length];
    byte b = 0;
    int i = Zbyw.Zp();
    while (b < this.Zt.length) {
      arrayOfBoolean[b] = this.Zt[b].isSelected();
      b++;
      if (i == 0)
        break; 
    } 
    return arrayOfBoolean;
  }
  
  public boolean ZQ() {
    return this.Zh.isSelected();
  }
  
  public boolean Zu() {
    return this.Zz.isSelected();
  }
  
  private void Zl() {
    this.ZB = new ButtonGroup();
    this.Za = new ButtonGroup();
    this.Zv = new Zbqc();
    this.Zh = new Zmg2();
    this.Zn = new Zzdy();
    this.ZM = new Zmg2();
    this.ZI = new Zm99();
    this.Zk = new Ze01();
    this.ZE = new Ze01();
    this.Z_ = new Ze01();
    this.Zr = new Ze01();
    this.Zb = new Zbqc();
    this.ZP = new Zbqc();
    this.ZN = new Zmg2();
    this.Zl = new Zmg2();
    this.Zc = new Zg85();
    this.ZV = new Zm99();
    this.Zz = new Zzdy();
    setDefaultCloseOperation(2);
    setTitle(a(-23563, 17590));
    addWindowListener(new Zgxd(this));
    this.Zv.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    this.Zv.setLayout(gridBagLayout1);
    this.ZB.add(this.Zh);
    this.Zh.setSelected(true);
    this.Zh.setText(a(-23562, 23029));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zv.add(this.Zh, gridBagConstraints);
    this.Zn.setSelected(true);
    this.Zn.setText(a(-23564, 15190));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.Zv.add(this.Zn, gridBagConstraints);
    this.ZB.add(this.ZM);
    this.ZM.setText(a(-23568, 24722));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zv.add(this.ZM, gridBagConstraints);
    this.ZI.setText(a(-23565, -25564));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    this.Zv.add(this.ZI, gridBagConstraints);
    this.Zk.setText(a(-23557, 11879));
    this.Zk.addActionListener(new Zz3t(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    this.Zv.add(this.Zk, gridBagConstraints);
    this.ZE.setText(a(-23560, -24872));
    this.ZE.addActionListener(new Zkaa(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    this.Zv.add(this.ZE, gridBagConstraints);
    this.Z_.setText(a(-23567, -20110));
    this.Z_.addActionListener(new Zgfk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 26;
    gridBagConstraints.weighty = 1.0D;
    this.Zv.add(this.Z_, gridBagConstraints);
    this.Zr.setText(a(-23558, 28739));
    this.Zr.addActionListener(new Zkjd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 26;
    this.Zv.add(this.Zr, gridBagConstraints);
    this.Zb.setLayout((LayoutManager)null);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Zv.add(this.Zb, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZP.setLayout(gridBagLayout2);
    this.Za.add(this.ZN);
    this.ZN.setText(a(-23561, -30863));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZN, gridBagConstraints);
    this.Za.add(this.Zl);
    this.Zl.setSelected(true);
    this.Zl.setText(a(-23553, 10058));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zl, gridBagConstraints);
    this.Zc.setColumns(3);
    this.Zc.addKeyListener(new Zx5l(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zc, gridBagConstraints);
    this.ZV.setText(a(-23559, 3966));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZV, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.Zv.add(this.ZP, gridBagConstraints);
    this.Zz.setText(a(-23566, 11834));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.Zv.add(this.Zz, gridBagConstraints);
    getContentPane().add(this.Zv, a(-23554, -18886));
    pack();
  }
  
  private void Zo(ActionEvent paramActionEvent) {
    ZH((WindowEvent)null);
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    this.ZS = true;
    ZH((WindowEvent)null);
  }
  
  private void ZH(WindowEvent paramWindowEvent) {
    setVisible(false);
    dispose();
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    Zzdy[] arrayOfZzdy = this.Zt;
    int j = arrayOfZzdy.length;
    int i = Zbyw.Zx();
    byte b = 0;
    while (b < j) {
      Zzdy zzdy = arrayOfZzdy[b];
      zzdy.setSelected(true);
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    Zzdy[] arrayOfZzdy = this.Zt;
    int j = arrayOfZzdy.length;
    int i = Zbyw.Zp();
    byte b = 0;
    while (b < j) {
      Zzdy zzdy = arrayOfZzdy[b];
      zzdy.setSelected(false);
      b++;
      if (i == 0)
        break; 
    } 
  }
  
  private void Zz(KeyEvent paramKeyEvent) {
    this.ZN.setSelected(true);
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '÷-H-Õ¢ áÔv$·½fãÅ)¡Õ¢ýSKR*&Èæ°(Î¿û7zÅ¦0Öà.Ó\\r­Ë`¹>MÜM¡ J¨ß-½ª\\b¶\3"¢ ã4×5Î÷_;õ~¢ÂbìOÌ3·7wúã²\\n:^ð^ _mÜöÖÝ\\nÑXÖÒø&»ÈVåÓiºhòßÍ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #20
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
    //   68: ldc 'YÒR³J»Äy'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #28
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
    //   128: putstatic burp/Zr76.a : [Ljava/lang/String;
    //   131: bipush #14
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr76.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #60
    //   214: goto -> 243
    //   217: bipush #103
    //   219: goto -> 243
    //   222: bipush #93
    //   224: goto -> 243
    //   227: iconst_3
    //   228: goto -> 243
    //   231: bipush #127
    //   233: goto -> 243
    //   236: bipush #121
    //   238: goto -> 243
    //   241: bipush #105
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA3F3) & 0xFFFF;
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
      char c = 'Ñ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr76.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */