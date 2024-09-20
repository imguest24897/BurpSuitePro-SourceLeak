package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.ListSelectionModel;

public class Zby1 extends Zbqc implements Zmov, Zgdq, Zky2 {
  private final Zm42 Zw;
  
  private final Zr_4 Zv;
  
  private final Zxaw ZU;
  
  private Zm41 ZX;
  
  private Zbws Zd;
  
  private int Zn = -1;
  
  private Zmyw ZP;
  
  private ButtonGroup Zy;
  
  private Ze01 ZL;
  
  private Ze01 Zk;
  
  private Ze01 ZA;
  
  private Ze01 Zi;
  
  private Ze01 Zo;
  
  private Zl8w ZS;
  
  private Zbup ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zby1(Zm41 paramZm41, Zm42 paramZm42, Zr_4 paramZr_4, Zxaw paramZxaw) {
    this.ZX = paramZm41;
    this.Zw = paramZm42;
    this.Zv = paramZr_4;
    this.ZU = paramZxaw;
    ZC();
    Zd(paramZm41.Zk());
    this.ZL.setName(a(-30902, 20893));
  }
  
  private void Zm(Zxwh paramZxwh) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 76
    //   8: aload_0
    //   9: getfield ZX : Lburp/Zm41;
    //   12: invokeinterface Zw : ()Z
    //   17: istore_3
    //   18: aload_0
    //   19: getfield Zn : I
    //   22: iconst_m1
    //   23: if_icmpne -> 40
    //   26: aload_0
    //   27: getfield ZX : Lburp/Zm41;
    //   30: aload_1
    //   31: invokeinterface Zz : (Lburp/Zxwh;)V
    //   36: aload_2
    //   37: ifnonnull -> 54
    //   40: aload_0
    //   41: getfield ZX : Lburp/Zm41;
    //   44: aload_1
    //   45: aload_0
    //   46: getfield Zn : I
    //   49: invokeinterface ZQ : (Lburp/Zxwh;I)V
    //   54: iload_3
    //   55: aload_0
    //   56: getfield ZX : Lburp/Zm41;
    //   59: invokeinterface Zw : ()Z
    //   64: if_icmpeq -> 76
    //   67: aload_0
    //   68: getfield ZU : Lburp/Zxaw;
    //   71: invokeinterface Zh : ()V
    //   76: aload_0
    //   77: iconst_m1
    //   78: putfield Zn : I
    //   81: return
  }
  
  private void Zd(Ztng paramZtng) {
    this.Zd = new Zbws(paramZtng);
    this.Zd.setName(a(-30909, -17034));
    this.ZW.setViewportView(this.Zd);
    this.ZW.Zy(this.Zd);
    this.Zd.Zk(this);
  }
  
  public void Za(Zm41 paramZm41) {
    this.ZX = paramZm41;
    Zd(paramZm41.Zk());
  }
  
  private void ZW() {
    int[] arrayOfInt = this.Zd.getSelectedRows();
    if (arrayOfInt.length == 0 || arrayOfInt.length > this.Zd.getRowCount())
      return; 
    boolean bool = this.ZX.Zw();
    this.ZX.Zs(arrayOfInt);
    if (bool != this.ZX.Zw())
      this.ZU.Zh(); 
  }
  
  private void ZV() {
    int[] arrayOfInt1 = this.Zd.getSelectedRows();
    ListSelectionModel listSelectionModel = this.Zd.getSelectionModel();
    String[] arrayOfString = Zbb7.ZS();
    int[] arrayOfInt2 = arrayOfInt1;
    int i = arrayOfInt2.length;
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt2[b];
      Zc(j, listSelectionModel);
      b++;
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void ZO() {
    int[] arrayOfInt = this.Zd.getSelectedRows();
    ListSelectionModel listSelectionModel = this.Zd.getSelectionModel();
    String[] arrayOfString = Zbb7.ZS();
    int i = arrayOfInt.length - 1;
    while (i >= 0) {
      ZC(arrayOfInt[i], listSelectionModel);
      i--;
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void Zc(int paramInt, ListSelectionModel paramListSelectionModel) {
    if (paramInt == 0)
      return; 
    int i = paramInt - 1;
    this.ZX.Zv(i);
    paramListSelectionModel.removeSelectionInterval(paramInt, paramInt);
    paramListSelectionModel.addSelectionInterval(i, i);
  }
  
  private void ZC(int paramInt, ListSelectionModel paramListSelectionModel) {
    int i = this.Zd.getRowCount() - 1;
    if (paramInt == i)
      return; 
    this.ZX.Zv(paramInt);
    int j = paramInt + 1;
    paramListSelectionModel.removeSelectionInterval(paramInt, paramInt);
    paramListSelectionModel.addSelectionInterval(j, j);
  }
  
  private void ZC() {
    this.Zy = new ButtonGroup();
    this.ZL = new Ze01();
    this.Zk = new Ze01();
    this.Zo = new Ze01();
    this.Zi = new Ze01();
    this.ZA = new Ze01();
    this.ZP = new Zmyw();
    this.ZW = new Zbup();
    this.ZS = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.ZL.setText(a(-30912, -31291));
    this.ZL.setToolTipText(a(-30911, 29423));
    this.ZL.addActionListener(new Zz73(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZL, gridBagConstraints);
    this.Zk.setText(a(-30897, -32321));
    this.Zk.setToolTipText(a(-30901, -23953));
    this.Zk.addActionListener(new Zzux(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zk, gridBagConstraints);
    this.Zo.setText(a(-30907, 9831));
    this.Zo.setToolTipText(a(-30906, -13684));
    this.Zo.addActionListener(new Zmw6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zo, gridBagConstraints);
    this.Zi.setText(a(-30910, 10721));
    this.Zi.setToolTipText(a(-30908, -9364));
    this.Zi.addActionListener(new Zxwr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zi, gridBagConstraints);
    this.ZA.setText(a(-30905, 17609));
    this.ZA.setToolTipText(a(-30903, -18638));
    this.ZA.addActionListener(new Zq1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZA, gridBagConstraints);
    this.ZP.setLeftComponent(this.ZW);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.fill = 1;
    add(this.ZP, gridBagConstraints);
    this.ZS.setText(a(-30904, -8202));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZS, gridBagConstraints);
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    Zr74 zr74 = new Zr74(this, this::Zm, this.Zw, null, this.Zv);
    zr74.setVisible(true);
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    int i = this.Zd.getSelectedRow();
    if (i == -1)
      return; 
    this.Zn = i;
    Zxwh zxwh = this.ZX.ZP(this.Zn);
    Zr74 zr74 = new Zr74(this, this::Zm, this.Zw, zxwh, this.Zv);
    zr74.setVisible(true);
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    ZW();
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    ZV();
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    ZO();
  }
  
  public void ZP(Zb_j paramZb_j) {
    this.ZX.ZP(paramZb_j);
  }
  
  public void Zs(Zb_j paramZb_j) {
    this.ZX.Zs(paramZb_j);
  }
  
  public void ZNH() {
    this.ZX.ZNH();
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    boolean bool = this.ZX.Zw();
    this.ZX.ZU(paramInt1);
    if (bool != this.ZX.Zw())
      this.ZU.Zh(); 
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\fGuGÚµ>\\bMjý»;Ä¢þÖò,AÒ£¬Iå¥·VBOém2©¤É"-!3"ÊÖì\¤ê'ëS`d¤\\fk@åÊ\\t5aÎ4¸ï\\n°:ºf&Ê)øLÍÃIBnÍ$Ì/ÔvÌÇÝËûu¥öUÓ·nJù7Ul¹¡}÷ÐCüEû 3ÖçÇè8-mEkÑ¢´¥ }5ß|LYæÿi}`þÕAÀU:$YxD¢ì$õdI$eR-W±±zH%ébD`ÓÐG'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #47
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_2
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
    //   64: goto -> 23
    //   67: ldc '^$î5ì\\n\\níìð!Âq`J¹ô àªºwØÀ~þ'´8ëº9Y!zú± C¡¢¸·ír`nãêHYå \\bH$fXÈèo¦#ÊïËx¢Z!8n'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #91
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #26
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
    //   128: putstatic burp/Zby1.a : [Ljava/lang/String;
    //   131: bipush #13
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zby1.b : [Ljava/lang/String;
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
    //   212: bipush #14
    //   214: goto -> 244
    //   217: bipush #69
    //   219: goto -> 244
    //   222: bipush #117
    //   224: goto -> 244
    //   227: bipush #125
    //   229: goto -> 244
    //   232: bipush #28
    //   234: goto -> 244
    //   237: bipush #92
    //   239: goto -> 244
    //   242: bipush #87
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
    int i = (paramInt1 ^ 0xFFFF8743) & 0xFFFF;
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
      char c = 'í';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zby1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */