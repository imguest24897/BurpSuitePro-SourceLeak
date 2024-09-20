package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Objects;
import net.portswigger.Zm2;

public class Zbek extends Zbv5 implements Zsnh {
  private final Zz8z ZD;
  
  private boolean ZX;
  
  private boolean ZS;
  
  private Zm99 Zm;
  
  private Zm99 Zh;
  
  private Zm99 Zl;
  
  private Zm99 ZC;
  
  private Zzdy Zv;
  
  private Zzdy Zy;
  
  private Zzdy Zb;
  
  private Zzdy Za;
  
  private Zedd Zg;
  
  private Zedd ZJ;
  
  private Zl8w ZQ;
  
  private Zbkc ZT;
  
  private Zm9v Zj;
  
  private Zgfo Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbek(Zz8z paramZz8z, boolean paramBoolean) {
    this.ZD = paramZz8z;
    ZB8();
    ZBW();
    Objects.requireNonNull(paramZz8z);
    this.Zz.ZO(paramZz8z::Zi4, this::Zh, 1, 2147483647, 0, new int[0]);
    if (!paramBoolean) {
      this.Zl.setEnabled(false);
      this.ZC.setEnabled(false);
      this.Zz.setEnabled(false);
    } 
  }
  
  private void ZBW() {
    this.ZX = true;
    Objects.requireNonNull(this.ZJ);
    Arrays.<Zlk4>stream(Zlk4.values()).map(Zbek::lambda$populateDropDownLists$0).forEach(this.ZJ::addItem);
    Objects.requireNonNull(this.Zg);
    Arrays.<Zeko>stream(Zeko.values()).map(Zbek::lambda$populateDropDownLists$1).forEach(this.Zg::addItem);
    this.ZX = false;
  }
  
  public String Zd() {
    return this.ZS ? a(12173, 20797) : "";
  }
  
  private void Zh(boolean paramBoolean) {
    this.ZS = !paramBoolean;
    this.Zj.setVisible(!paramBoolean);
  }
  
  public String ZZ() {
    return this.ZT.Zr();
  }
  
  public Zk97 ZR() {
    return Zk97.DESKTOP_SCANNING_AUDIT_OPTIONS_AUDIT_OPTIMIZATION;
  }
  
  public String Zq() {
    return a(12174, 6960);
  }
  
  public Zmf_ Zn() {
    Zzkm zzkm = new Zzkm();
    this.ZD.Zl(zzkm);
    return zzkm.ZV(new String[] { a(12169, -19118) });
  }
  
  public String ZE() {
    return a(12163, -28193);
  }
  
  public void Zt2() {
    this.ZJ.setSelectedItem((this.ZD.ZqT()).uiName);
    this.Zg.setSelectedItem((this.ZD.ZqM()).uiName);
    this.Za.setSelected(this.ZD.Zqo());
    this.Zv.setSelected(this.ZD.Zqb());
    this.Zb.setSelected(this.ZD.Zql());
    this.Zy.setSelected(this.ZD.ZqP());
    this.Zz.ZM(this.ZD.ZqB());
    this.Zj.setVisible(false);
  }
  
  private Zlk4 ZB1() {
    Object object = this.ZJ.getSelectedItem();
    return !(object instanceof String) ? Zlk4.NORMAL : Zlk4.Za((String)object);
  }
  
  private Zeko Zt() {
    Object object = this.Zg.getSelectedItem();
    return !(object instanceof String) ? Zeko.NORMAL : Zeko.Zf((String)object);
  }
  
  private void ZB8() {
    this.ZT = new Zbkc();
    this.ZQ = new Zl8w();
    this.Zm = new Zm99();
    this.ZJ = new Zedd();
    this.Zh = new Zm99();
    this.Zg = new Zedd();
    this.Za = new Zzdy();
    this.Zv = new Zzdy();
    this.Zb = new Zzdy();
    this.Zy = new Zzdy();
    this.Zl = new Zm99();
    this.Zz = new Zgfo();
    this.ZC = new Zm99();
    this.Zj = new Zm9v();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZT.Zx(a(12165, -12721));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 21;
    add(this.ZT, gridBagConstraints);
    this.ZQ.setText(a(12161, -22847));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZQ, gridBagConstraints);
    this.Zm.setText(a(12168, 15089));
    this.Zm.setHorizontalTextPosition(10);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zm, gridBagConstraints);
    this.ZJ.addActionListener(new Zmc2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZJ, gridBagConstraints);
    this.Zh.setText(a(12160, -32715));
    this.Zh.setHorizontalTextPosition(10);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zh, gridBagConstraints);
    this.Zg.addActionListener(new Zg4_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zg, gridBagConstraints);
    this.Za.setText(a(12167, -291));
    this.Za.addActionListener(new Zkc2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Za, gridBagConstraints);
    this.Zv.setText(a(12171, 12816));
    this.Zv.addActionListener(new Zz0p(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.Zv, gridBagConstraints);
    this.Zb.setText(a(12166, -1809));
    this.Zb.addActionListener(new Zsve(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.Zb, gridBagConstraints);
    this.Zy.setText(a(12175, -5367));
    this.Zy.addActionListener(new Zkqv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.Zy, gridBagConstraints);
    this.Zl.setText(a(12172, 13406));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.Zl, gridBagConstraints);
    this.Zz.addActionListener(new Zlsm(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zz, gridBagConstraints);
    this.ZC.setText(a(12170, 6913));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZC, gridBagConstraints);
    this.Zj.setText(a(12162, -1978));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.Zj, gridBagConstraints);
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    if (this.ZX)
      return; 
    this.ZD.ZH(ZB1());
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    if (this.ZX)
      return; 
    this.ZD.ZX(Zt());
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    this.ZD.Zi6(this.Za.isSelected());
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    this.ZD.Zi9(this.Zv.isSelected());
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    this.ZD.Ziz(this.Zb.isSelected());
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    Zm2.ZC(Zrrh.SCANNER_OPTIONS_ENGINE_FOLLOW_REDIRECTIONS_DISABLED);
    this.ZD.ZiM(this.Zy.isSelected());
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    this.ZD.Zi4(this.Zz.ZE());
  }
  
  private static String lambda$populateDropDownLists$1(Zeko paramZeko) {
    return paramZeko.uiName;
  }
  
  private static String lambda$populateDropDownLists$0(Zlk4 paramZlk4) {
    return paramZlk4.uiName;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'P;&ÛíÖÄGmýù\\feTÛµ![û;u\\f33ß]¢®|$\\tÞXT\\n¿cIFî´ÏôGgÄE¹,grvj¸$k7~,\úÆx\\fEëÌÓÒb(¬|#?¨Dùí(D4ejà\\fÂ}?ÔÀ÷fZ£gHøèu÷ÜúsxO³ò©\\r¹×^T%ª]s£$ëÙ´U+2Xjþã" GhóéÒqÀ¦ºÉ¥°¨ìÈH5nS¤úBOÿË<ö ®ÓÉ$Ô2¬¥Nz/Ã]¾&Ê<rG5æ¸kx¦Ù\\ná>Ç¾³Ñ&>ø·éÑ¾®Ïß}²ÙÉ4%Z±g²Ç~à½¸Ëd$©\ÈTR{_ï¤¨eâçáûâ¦i\\rÄÀ6a¢G.ûR/\\r·yLìa\\nØ#xÍiÿhÙ×ìGL<W.zÛ,£<nVË!hdûG§.íÆD÷mgnVÐÚsOÃÛH+$öÂmåfº¶5Ò\\r¨,ÄD;Xý?÷a¹iõ\\blÎÂå¶DÿRw5Ê¿1ß\\r{@Òüù¥í{çGz!ýGÃÑ¹IÝ'¡tú¼ù¦*Ñ`èÃWT«?Þ_Ìù¶t)¨ç;üÃ034ø¶WJ.êàvÂ-ÇíÀzÁØ[°ÀWë³5²Pí®£åÌåPHhP41hÜ,\\r;jVáEãNÎ\\r*èôð \\t¢¥c5{«.rÙ±1ßù¡ÒÈ=1 TjCNlÛ4Ç£ÍÖ <'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #47
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #29
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
    //   68: ldc '*4\\bF%õD_Aæ½"s½94;AÍ°ËõY\\tÓïaèu `NÃXÄIë[t/ìäÀZ¶ÝxÉô*'¥JxìR[eÑM«ú2¼ØójúèC'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #67
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #78
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
    //   129: putstatic burp/Zbek.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbek.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #36
    //   214: goto -> 243
    //   217: iconst_5
    //   218: goto -> 243
    //   221: bipush #83
    //   223: goto -> 243
    //   226: bipush #83
    //   228: goto -> 243
    //   231: bipush #94
    //   233: goto -> 243
    //   236: bipush #51
    //   238: goto -> 243
    //   241: bipush #24
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
    int i = (paramInt1 ^ 0x2F8B) & 0xFFFF;
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
      byte b1 = 32;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbek.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */