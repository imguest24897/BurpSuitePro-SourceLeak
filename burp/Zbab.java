package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Set;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbab extends Zbv5 implements Zl5s, Zt3u {
  private final Zxzh Zy;
  
  private final Ztik Zk;
  
  private final Ze5r<Zlil, Zmk5> ZM;
  
  private final Zt_o ZW;
  
  private final Zbws Zl;
  
  private final Zz0n Zx;
  
  private final Zerg ZE;
  
  private final Zgb6 Zr;
  
  private final Zkl6 Zw;
  
  private final Ztwv ZV;
  
  private final Zr_4 Zo;
  
  private final Ztyg ZA;
  
  private final Zr1m ZL;
  
  private final Zlr9 ZO;
  
  private final Ze4m ZN;
  
  private final Set<String> Zv;
  
  private final Zgq7 ZR;
  
  private Zmyw Zd;
  
  private Ze01 ZS;
  
  private Ze01 ZH;
  
  private Ze01 ZQ;
  
  private Ze01 Zf;
  
  private Ze01 ZG;
  
  private Ze01 Zn;
  
  private Zbup Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbab(Zz0n paramZz0n, Zerg paramZerg, Zgb6 paramZgb6, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zr1m paramZr1m, Zlr9 paramZlr9, Ze4m paramZe4m) {
    Zuh.Zv((paramZerg != null), Zqf.Zv, 0L);
    Zuh.Zv((paramZr_4 != null), Zqf.Zv, 2L);
    Zuh.Zb((null != paramZgzy.Zu()), Zqf.Zx);
    this.Zx = paramZz0n;
    this.ZE = paramZerg;
    this.Zr = paramZgb6;
    this.Zw = paramZkl6;
    this.ZV = paramZtwv;
    this.Zo = paramZr_4;
    this.ZA = paramZtyg;
    this.ZR = paramZgq7;
    this.ZL = paramZr1m;
    this.ZO = paramZlr9;
    this.ZN = paramZe4m;
    this.Zy = paramZgzy.Zh();
    this.Zk = paramZgzy.Zu();
    this.ZM = this.Zk.ZK();
    this.ZW = new Zt_o(this.ZM);
    this.Zl = new Zbws(this.ZW);
    this.Zk.Zv(this);
    ZT();
    this.Zv = Set.of(Zjd(), a(19427, 24548), a(19435, -7965), a(19451, -13086), a(19442, -7639), a(19431, -32031), a(19447, 171), a(19446, 895), a(19437, 31224), a(19434, -25594));
    setName(a(19450, 21165));
    this.Zj.setViewportView(this.Zl);
  }
  
  public String Zjd() {
    return a(19444, 17307);
  }
  
  public String ZjS() {
    return a(19440, 13354);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(19449, 12030), Zk97.DESKTOP_SETTINGS_SESSIONS_MACROS, this.ZL, new String[] { a(19448, -19769) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zv;
  }
  
  public void ZX(Zlil paramZlil) {
    int i = this.ZM.ZG();
    this.ZM.Ze(paramZlil);
    this.ZW.fireTableRowsInserted(i, i);
    this.Zl.getSelectionModel().setSelectionInterval(i, i);
  }
  
  public void Zu(Zlil paramZlil) {
    int i = this.ZM.Zo(paramZlil);
    if (i != -1)
      this.ZW.fireTableRowsUpdated(i, i); 
  }
  
  private Zlil Zg(int paramInt) {
    return this.ZM.ZV(paramInt);
  }
  
  private void ZR(int paramInt) {
    this.ZM.ZH(paramInt);
    this.ZW.fireTableRowsUpdated(paramInt, paramInt + 1);
  }
  
  public void Zt2() {
    this.ZW.fireTableDataChanged();
  }
  
  private void ZT() {
    this.ZG = new Ze01();
    this.ZH = new Ze01();
    this.Zn = new Ze01();
    this.Zf = new Ze01();
    this.ZQ = new Ze01();
    this.ZS = new Ze01();
    this.Zd = new Zmyw();
    this.Zj = new Zbup();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.ZG.setText(a(19433, 18551));
    this.ZG.setToolTipText(a(19441, 30725));
    this.ZG.addActionListener(new Zz2n(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZG, gridBagConstraints);
    this.ZH.setText(a(19429, 6808));
    this.ZH.setToolTipText(a(19432, 22694));
    this.ZH.addActionListener(new Zrs3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZH, gridBagConstraints);
    this.Zn.setText(a(19436, 2658));
    this.Zn.setToolTipText(a(19426, -4090));
    this.Zn.addActionListener(new Zzag(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zn, gridBagConstraints);
    this.Zf.setText(a(19428, -2249));
    this.Zf.setToolTipText(a(19453, 25344));
    this.Zf.addActionListener(new Zsad(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zf, gridBagConstraints);
    this.ZQ.setText(a(19443, -26769));
    this.ZQ.setToolTipText(a(19452, -5004));
    this.ZQ.addActionListener(new Zv8o(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZQ, gridBagConstraints);
    this.ZS.setText(a(19425, 32751));
    this.ZS.setToolTipText(a(19439, -3408));
    this.ZS.addActionListener(new Zgz_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZS, gridBagConstraints);
    this.Zd.setLeftComponent(this.Zj);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 11;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zd, gridBagConstraints);
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    int i = this.Zl.getSelectedRow();
    if (i == -1 || i == this.Zl.getRowCount() - 1)
      return; 
    ZR(i);
    this.Zl.getSelectionModel().setSelectionInterval(i + 1, i + 1);
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    int i = this.Zl.getSelectedRow();
    if (i < 1)
      return; 
    ZR(i - 1);
    this.Zl.getSelectionModel().setSelectionInterval(i - 1, i - 1);
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    int i = this.Zl.getSelectedRow();
    if (i == -1)
      return; 
    if (this.Zk.Zj(this.ZM.ZV(i))) {
      Zx6o.Zv(Zt2m.ZF(this), a(19430, 4135), a(19445, 24971));
      return;
    } 
    if (0 != Zx6o.Zc(Zt2m.ZF(this), a(19424, 23245), a(19455, 23775), new String[] { a(19454, -32754), a(19438, 17800) }1))
      return; 
    this.ZM.Zf(i);
    this.ZW.fireTableRowsDeleted(i, i);
    if (i >= this.Zl.getRowCount())
      i--; 
    if (i >= 0 && i < this.Zl.getRowCount())
      this.Zl.getSelectionModel().setSelectionInterval(i, i); 
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    int i = this.Zl.getSelectedRow();
    if (i == -1)
      return; 
    Zlil zlil = Zg(i);
    Zr73 zr73 = new Zr73(this, zlil, false, this.Zy, this.Zx, this.ZE, this.Zr, Zt2m.ZF(this), this.ZV, this.Zo, this.ZA, this.ZR, this.ZO, this.ZN, this.Zw.ZB(), this.Zw.ZH());
    zr73.setVisible(true);
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    Zr73 zr73 = new Zr73(this, new Zlil(this.Zk.ZD(), this.Zw.ZB(), this.Zo), true, this.Zy, this.Zx, this.ZE, this.Zr, Zt2m.ZF(this), this.ZV, this.Zo, this.ZA, this.ZR, this.ZO, this.ZN, this.Zw.ZB(), this.Zw.ZH());
    zr73.setVisible(true);
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    int i = this.Zl.getSelectedRow();
    if (i == -1)
      return; 
    Zlil zlil = Zg(i);
    ZX(zlil.ZU());
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Òhbõ¥~:Óä`fqvgFÖ°N¿$DdÌÊrùð±1Ï`Cb"ÉBtÜÔ¼ ò62u2£Üì,g£h=.e@ãõZ\\r.©,\q¶Ä4ETþç\\nmvôXa¾¹Ã¢]úÈu&£È9kë´íðb1>á9+[pEÏ±þµ9j\\t³LGåxÚ¾­l#4µÖ«f1÷s D½Yç6@J;¶T7/­Cô½X ÔLëÆÔ\\r¾Y1Ê*ÊÌ/!½Ý/Íé£KÚËàK¯×¥+vy³ñ*HX%Qå¾I:e:çêÂÈQ+éâ>6¦VyúÝ£½*ò¹×râ±Èí/(± +rò¸Ñï ]{óèS»ÈÏOÃ¹ñæreMòC:Zi±fkÐ-àH?üxøáWÞ=öþfÕã¥áÁhQï!0 óÅ¨¯qÌpe0ÝNSo\\fH \\rÞázU@H>lý1¯(¤ëÓÙá,oÙ8g»DzfþNhÐàÑÑ^¥~¬6HX=üè&Q­Ñ&d[ôÝü4?Í   ^®¯õË_jÉ½ôýö3ÚÜþÒQúµ=V.¤qºÈ¥®«@Gÿ0R¿Ø¾YôSc6k±©<Ej¼HYXFÿËH×Öewñè\\b£Ì¥â\\f]MÎºÐäÉÃu¢«AB8àÅÎò²'¶Nbu\\bÈ+þ(â$Ç¹ÈÌ|ÃÀw3=Îë¤Õ(lþ&ôe1£Þ/4úny~Jý%á8nFWP]-ñ\\bÈ(,ýÇÈfÌDÒÐ\\bº!¢ÀqÖmôé\\füÊgè\\nò=yà4c_ÚqSÚ ¾ßwgf±fãgiÅ)ev}¡º@5%9ÛGû'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #43
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #18
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
    //   68: ldc 'jÅ<n¯u%bÊ{Ñêÿeu'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_2
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zbab.a : [Ljava/lang/String;
    //   131: bipush #32
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbab.b : [Ljava/lang/String;
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
    //   212: bipush #36
    //   214: goto -> 244
    //   217: bipush #42
    //   219: goto -> 244
    //   222: bipush #11
    //   224: goto -> 244
    //   227: bipush #102
    //   229: goto -> 244
    //   232: bipush #44
    //   234: goto -> 244
    //   237: bipush #110
    //   239: goto -> 244
    //   242: bipush #100
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4BFF) & 0xFFFF;
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
      byte b1 = 78;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbab.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */