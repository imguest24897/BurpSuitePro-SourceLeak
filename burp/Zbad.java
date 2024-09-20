package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Set;

class Zbad extends Zbv5 implements Ztbm {
  private final Zxg9 Zu;
  
  private final Zlyd ZY;
  
  private final Zr_4 ZW;
  
  private final Zr_4 ZT;
  
  private final Zr1m Zy;
  
  private final Collection<String> Zb;
  
  private Ztch Zt;
  
  private Zbws ZD;
  
  private int Zo;
  
  private Zmyw ZJ;
  
  private Zzdy Zj;
  
  private Zzdy ZO;
  
  private Ze01 ZI;
  
  private Ze01 Zz;
  
  private Ze01 ZF;
  
  private Zbup ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbad(Zxg9 paramZxg9, Zlyd paramZlyd, Zr_4 paramZr_41, Zr_4 paramZr_42, Zr1m paramZr1m) {
    this.Zu = paramZxg9;
    this.ZY = paramZlyd;
    this.ZW = paramZr_41;
    this.ZT = paramZr_42;
    this.Zy = paramZr1m;
    this.Zo = -1;
    ZzN();
    this.Zb = Set.of(new String[] { 
          Zjd(), a(-32145, 20897), a(-32152, 27769), a(-32133, -14812), a(-32147, -20086), a(-32158, -5401), a(-32146, 21093), a(-32153, 6935), a(-32136, 27980), a(-32159, 3889), 
          a(-32129, 23237), a(-32148, -21409) });
  }
  
  public String Zjd() {
    return a(-32135, -24296);
  }
  
  public String ZjS() {
    return a(-32157, -20063);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    this.Zt = new Ztch(this.Zu, this.ZY, this.ZW, this.ZT, zbkr, this.Zy);
    this.ZD = new Zbws(this.Zt.ZW().ZT());
    this.ZD.Zk(new Zbla(this.ZD, this.Zt));
    this.ZM.setViewportView(this.ZD);
    ZzT();
    Zt2();
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zb;
  }
  
  public boolean ZQA() {
    return this.Zt.ZF();
  }
  
  public void ZO(boolean paramBoolean) {
    this.Zt.ZV(paramBoolean);
    Zt2();
  }
  
  public void Zo(String paramString, Zkjm paramZkjm) {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: ifnull -> 64
    //   8: aload_0
    //   9: getfield Zt : Lburp/Ztch;
    //   12: invokevirtual ZW : ()Lburp/Zlpd;
    //   15: astore #4
    //   17: aload #4
    //   19: invokeinterface ZT : ()Lburp/Ztnt;
    //   24: astore #5
    //   26: aload_0
    //   27: getfield Zo : I
    //   30: iconst_m1
    //   31: if_icmpne -> 45
    //   34: aload #5
    //   36: aload_1
    //   37: aload_2
    //   38: invokevirtual Zu : (Ljava/lang/String;Lburp/Zkjm;)V
    //   41: aload_3
    //   42: ifnonnull -> 56
    //   45: aload #5
    //   47: aload_0
    //   48: getfield Zo : I
    //   51: aload_1
    //   52: aload_2
    //   53: invokevirtual ZK : (ILjava/lang/String;Lburp/Zkjm;)V
    //   56: aload #4
    //   58: aload_2
    //   59: invokeinterface Za : (Lburp/Zkjm;)V
    //   64: aload_0
    //   65: iconst_m1
    //   66: putfield Zo : I
    //   69: return
  }
  
  private void ZzN() {
    this.Zj = new Zzdy();
    this.ZI = new Ze01();
    this.Zz = new Ze01();
    this.ZF = new Ze01();
    this.ZO = new Zzdy();
    this.ZJ = new Zmyw();
    this.ZM = new Zbup();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zj.setSelected(true);
    this.Zj.setText(a(-32155, 23312));
    this.Zj.addActionListener(new Zeqt(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.Zj, gridBagConstraints);
    this.ZI.setText(a(-32160, 3986));
    this.ZI.setEnabled(false);
    this.ZI.addActionListener(new Zko3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZI, gridBagConstraints);
    this.Zz.setText(a(-32149, -5057));
    this.Zz.setEnabled(false);
    this.Zz.addActionListener(new Zt74(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zz, gridBagConstraints);
    this.ZF.setText(a(-32151, -1628));
    this.ZF.setEnabled(false);
    this.ZF.addActionListener(new Zm58(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZF, gridBagConstraints);
    this.ZO.setText(a(-32130, -24023));
    this.ZO.addActionListener(new Zs2j(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.ZO, gridBagConstraints);
    this.ZJ.setLeftComponent(this.ZM);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.fill = 1;
    add(this.ZJ, gridBagConstraints);
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    this.Zt.ZW().ZS(this.ZO.isSelected());
  }
  
  private void ZU(ActionEvent paramActionEvent) {
    this.Zt.ZW().ZG(this.Zj.isSelected());
    Zzc();
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    int i = this.ZD.getSelectedRow();
    if (i >= 0 && i < this.ZD.getRowCount())
      this.Zt.ZW().ZT().ZL(this.ZD.convertRowIndexToModel(i)); 
    if (i >= this.ZD.getRowCount())
      i--; 
    if (i >= 0 && i < this.ZD.getRowCount())
      this.ZD.getSelectionModel().setSelectionInterval(i, i); 
  }
  
  private void Zq(ActionEvent paramActionEvent) {
    int i = this.ZD.getSelectedRow();
    if (i != -1) {
      Zlpd zlpd = this.Zt.ZW();
      Ztnt ztnt = zlpd.ZT();
      this.Zo = this.ZD.convertRowIndexToModel(i);
      Zr6v zr6v = ztnt.Zw(this.Zo);
      Zrvu zrvu = new Zrvu(Zt2m.ZF(this), this, zr6v, zlpd.ZA());
      zrvu.setVisible(true);
    } 
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    Zrvu zrvu = new Zrvu(Zt2m.ZF(this), this, null, this.Zt.ZW().ZA());
    zrvu.setVisible(true);
  }
  
  public void Zt2() {
    Zlpd zlpd = this.Zt.ZW();
    this.ZD.ZL(zlpd.ZT());
    Zrul zrul = zlpd.ZU();
    this.ZO.setSelected(zrul.ZPy());
    this.Zj.setSelected(zrul.ZPa());
    Zzc();
  }
  
  private void Zzc() {
    Zrul zrul = this.Zt.ZW().ZU();
    boolean bool = zrul.ZPa();
    this.ZI.setEnabled(bool);
    this.Zz.setEnabled(bool);
    this.ZF.setEnabled(bool);
  }
  
  private void ZzT() {
    setName(a(-32134, 11215));
    this.Zj.setName(a(-32154, 26525));
    this.ZO.setName(a(-32150, -24881));
    this.ZD.setName(a(-32156, 11260));
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÑÝïº#@SFb0j@CâÜñ·03/Âøv³\\nÀsõ\\b<ã§\Ä"¼ò»\\r¨õ}ë¢WäFb:g\\bbuúù7Ù û\\bã??".Jú ¤'¿è¾~©Q?¬©ÑcVF´Òjm4þV±%·üyÈ¤BBAçÛß½Ð' Wtï{Hó¡jµ§TS'òïg¡¶ûãO+£ó»0\\f9ßôüHU)\\rvð\\n©0RÙPEt|H{$,$è`Ð\\t#%{46¾æûONÕñl7Ñ=u;6Å6z¡åå'ïÈÿÝ£t¬ª[Ã§äéÄpÆ¹%>¼íÒ½"K,GÉP!MPOýÏº![3×ÛUàiY¤Ü²/·¶¨$­0æZ\\bøCÑÑûOxïÇ³ð8\\tÅØ}Õ³;LJ4;ìü1ì`Mfè­Û\\b|ÅcÍd@E i2kHípÝ!?ýåë\\tLÓx$Á!ÕCH\Ói(g;I¦÷è06úâÊ\ À}m§TË \\b'ê)­é_=êMw2ê°¬Æ(ÙïÏi\\n§ØT3Ú¯'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #125
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
    //   67: ldc 'æ9Nó:4f^Qä½9\\n­ß >6áµùÀ GÅº['Hk$æðÇæx.þc§ÖÈHÍ¿û.®1[:fÊø·»þ(D'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #12
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #9
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
    //   128: putstatic burp/Zbad.a : [Ljava/lang/String;
    //   131: bipush #22
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbad.b : [Ljava/lang/String;
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
    //   212: bipush #22
    //   214: goto -> 244
    //   217: bipush #104
    //   219: goto -> 244
    //   222: bipush #65
    //   224: goto -> 244
    //   227: bipush #66
    //   229: goto -> 244
    //   232: bipush #41
    //   234: goto -> 244
    //   237: bipush #41
    //   239: goto -> 244
    //   242: bipush #105
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
    int i = (paramInt1 ^ 0xFFFF826B) & 0xFFFF;
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
      char c = 'ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbad.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */