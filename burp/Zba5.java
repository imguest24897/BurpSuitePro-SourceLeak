package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Set;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;

public class Zba5 extends Zbv5 implements Zt3u, Zgdq {
  private final Set<String> ZD;
  
  private final Ztr0 ZG;
  
  private Zzdy Zi;
  
  private Box.Filler Zo;
  
  private Zbqc Zg;
  
  private Zzdy ZT;
  
  private Zedd Zk;
  
  private Zm99 ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zba5(Ztr0 paramZtr0) {
    this.ZG = paramZtr0;
    Zd();
    this.ZD = Set.of(new String[] { 
          a(-10076, -10919), a(-10069, 18476), a(-10075, -14674), a(-10080, 5125), a(-10065, -4502), a(-10070, 6484), a(-10078, -12173), a(-10067, 13319), a(-10066, -5343), a(-10073, 19239), 
          a(-10079, -23511) });
    ZZ();
    ZY();
    ZR();
  }
  
  private void ZY() {
    this.ZT.setSelected(this.ZG.Zr());
    this.Zi.setSelected(this.ZG.Zs());
    this.Zk.setSelectedItem(this.ZG.ZK());
  }
  
  private void ZZ() {
    DefaultComboBoxModel<Double> defaultComboBoxModel = new DefaultComboBoxModel();
    defaultComboBoxModel.addAll(this.ZG.ZM());
    this.Zk.setModel(defaultComboBoxModel);
  }
  
  public void ZNH() {
    if (this.Zi.isSelected())
      this.Zi.doClick(); 
    this.Zk.setSelectedItem(Double.valueOf(1.0D));
    if (this.ZT.isSelected())
      this.ZT.doClick(); 
  }
  
  public String Zjd() {
    return a(-10074, 24059);
  }
  
  public String ZjS() {
    return a(-10077, 16648);
  }
  
  public Component ZjY() {
    Zbkk zbkk = new Zbkk();
    zbkk.ZB(Zk97.DESKTOP_SETTINGS_NETWORK_TLS_SERVER_TLS_CERTIFICATES, this, a(-10068, 7827));
    return zbkk;
  }
  
  public Collection<String> ZjD() {
    return this.ZD;
  }
  
  public void Zt2() {}
  
  private void ZR() {
    boolean bool = this.ZT.isSelected();
    Zb(bool);
    this.ZG.Zt(bool, this.Zi.isSelected(), ((Double)this.Zk.getSelectedItem()).doubleValue());
  }
  
  private void Zb(boolean paramBoolean) {
    this.Zi.setEnabled(paramBoolean);
    this.ZH.setEnabled(paramBoolean);
    this.Zk.setEnabled(paramBoolean);
  }
  
  private void Zn() {
    this.ZG.ZT(this.Zi.isSelected());
  }
  
  private void ZE() {
    this.ZG.Zz((Double)this.Zk.getSelectedItem());
  }
  
  private void Zd() {
    this.ZT = new Zzdy();
    this.Zg = new Zbqc();
    this.Zi = new Zzdy();
    this.ZH = new Zm99();
    this.Zk = new Zedd();
    this.Zo = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 0, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 10, 0 };
    setLayout(gridBagLayout1);
    this.ZT.setText(a(-10059, 14268));
    this.ZT.addActionListener(new Zxe2(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZT, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 0, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 10, 0 };
    this.Zg.setLayout(gridBagLayout2);
    this.Zi.setText(a(-10072, 14828));
    this.Zi.addActionListener(new Zevk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    this.Zg.add(this.Zi, gridBagConstraints);
    this.ZH.setText(a(-10071, 8905));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.Zg.add(this.ZH, gridBagConstraints);
    this.Zk.addActionListener(new Zkh6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    this.Zg.add(this.Zk, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 30, 0, 0);
    add(this.Zg, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zo, gridBagConstraints);
  }
  
  private void ZP(ActionEvent paramActionEvent) {
    ZR();
  }
  
  private void Za(ActionEvent paramActionEvent) {
    Zn();
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    ZE();
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '9VÊW¯¥uí[ ¦àh¸\\t |ñçv`âHmMyÊ1½Y¯ñ»*öäW \\fjê{m öa©&S;ÒÿÆÕ9+»áà¼bF+szO¬ew±{mÓþi÷ö º,¾+ÄÙ#_ Âw7Ál?õÕHv\\f×Äì-Í?0\\nÝ71îà¶!9ÎA?7`çµ1RîàJõ\\fV\\n«ªHþ|Y\\r¡©Ý ü¬×u¤ñDaÔüÈØ]\©Ö^¶bÅHÀÉý¤rpòª'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #122
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'xtpYÂeô[£ýlC}P<~×^ \\tÏmßW'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_2
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zba5.a : [Ljava/lang/String;
    //   130: bipush #17
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zba5.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #55
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #22
    //   224: goto -> 244
    //   227: bipush #121
    //   229: goto -> 244
    //   232: bipush #55
    //   234: goto -> 244
    //   237: bipush #41
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
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD8A5) & 0xFFFF;
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
      byte b1 = 101;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zba5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */