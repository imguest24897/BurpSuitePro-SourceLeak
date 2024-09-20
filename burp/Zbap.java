package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.List;
import javax.swing.ButtonGroup;

public class Zbap extends Zbv5 implements Zt3u {
  private final Zgb6 ZA;
  
  private final Zr1m ZH;
  
  private final List<String> ZF;
  
  private ButtonGroup Zu;
  
  private Zedd Zz;
  
  private Zbqc Zm;
  
  private Zmg2 ZX;
  
  private Zmg2 Zj;
  
  private Zmg2 Zv;
  
  private Zmg2 ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbap(Zgb6 paramZgb6, Zr1m paramZr1m) {
    this.ZA = paramZgb6;
    this.ZH = paramZr1m;
    ZZ();
    this.ZF = List.of(Zjd(), a(-9714, -16560), a(-9709, -4397), a(-9706, 8722), a(-9703, 31802), a(-9702, 14587));
    String str = Zbk_.Zb();
    setName(a(-9720, -26097));
    this.Zj.setText(this.Zj.getText() + this.Zj.getText() + a(-9708, -29720) + Zlqt.ZH);
    for (String str1 : Zlqt.ZB) {
      this.Zz.addItem(str1);
      if (str == null)
        break; 
    } 
  }
  
  public String Zjd() {
    return a(-9705, 20096);
  }
  
  public String ZjS() {
    return a(-9717, 14124);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(-9701, -26755), Zk97.DESKTOP_SETTINGS_USER_INTERFACE_MESSAGE_EDITOR_CHARACTER_SETS, this.ZH, new String[] { a(-9698, -11882) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZF;
  }
  
  private void ZZ() {
    this.Zu = new ButtonGroup();
    this.Zj = new Zmg2();
    this.ZX = new Zmg2();
    this.Zv = new Zmg2();
    this.Zm = new Zbqc();
    this.Zz = new Zedd();
    this.ZC = new Zmg2();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zu.add(this.Zj);
    this.Zj.setText(a(-9700, 29048));
    this.Zj.addActionListener(new Zm88(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zj, gridBagConstraints);
    this.Zu.add(this.ZX);
    this.ZX.setText(a(-9710, 22509));
    this.ZX.addActionListener(new Zt3m(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZX, gridBagConstraints);
    this.Zu.add(this.Zv);
    this.Zv.setText(a(-9699, -27575));
    this.Zv.addActionListener(new Zs9c(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zv, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.Zm.setLayout(gridBagLayout2);
    this.Zz.addActionListener(new Zvq(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.Zz, gridBagConstraints);
    this.Zu.add(this.ZC);
    this.ZC.setText(a(-9718, 29631));
    this.ZC.addActionListener(new Ztp4(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.ZC, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zm, gridBagConstraints);
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    ZY();
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    ZY();
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    ZY();
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    ZY();
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    ZY();
  }
  
  public void Zt2() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Zgb6;
    //   4: invokeinterface Zf1 : ()Ljava/lang/String;
    //   9: astore_2
    //   10: invokestatic Zb : ()Ljava/lang/String;
    //   13: aload_2
    //   14: astore_3
    //   15: astore_1
    //   16: iconst_m1
    //   17: istore #4
    //   19: aload_3
    //   20: invokevirtual hashCode : ()I
    //   23: lookupswitch default -> 121, 676123699 -> 79, 1249057423 -> 102, 1971001562 -> 56
    //   56: aload_3
    //   57: sipush #-9712
    //   60: sipush #-3098
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual equals : (Ljava/lang/Object;)Z
    //   69: ifeq -> 121
    //   72: iconst_0
    //   73: istore #4
    //   75: aload_1
    //   76: ifnonnull -> 121
    //   79: aload_3
    //   80: sipush #-9719
    //   83: sipush #550
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: invokevirtual equals : (Ljava/lang/Object;)Z
    //   92: ifeq -> 121
    //   95: iconst_1
    //   96: istore #4
    //   98: aload_1
    //   99: ifnonnull -> 121
    //   102: aload_3
    //   103: sipush #-9704
    //   106: sipush #26620
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual equals : (Ljava/lang/Object;)Z
    //   115: ifeq -> 121
    //   118: iconst_2
    //   119: istore #4
    //   121: iload #4
    //   123: tableswitch default -> 184, 0 -> 148, 1 -> 160, 2 -> 172
    //   148: aload_0
    //   149: getfield ZX : Lburp/Zmg2;
    //   152: iconst_1
    //   153: invokevirtual setSelected : (Z)V
    //   156: aload_1
    //   157: ifnonnull -> 226
    //   160: aload_0
    //   161: getfield Zj : Lburp/Zmg2;
    //   164: iconst_1
    //   165: invokevirtual setSelected : (Z)V
    //   168: aload_1
    //   169: ifnonnull -> 226
    //   172: aload_0
    //   173: getfield Zv : Lburp/Zmg2;
    //   176: iconst_1
    //   177: invokevirtual setSelected : (Z)V
    //   180: aload_1
    //   181: ifnonnull -> 226
    //   184: aload_0
    //   185: getfield ZC : Lburp/Zmg2;
    //   188: iconst_1
    //   189: invokevirtual setSelected : (Z)V
    //   192: getstatic burp/Zlqt.ZB : Ljava/util/List;
    //   195: aload_2
    //   196: invokeinterface contains : (Ljava/lang/Object;)Z
    //   201: ifeq -> 216
    //   204: aload_0
    //   205: getfield Zz : Lburp/Zedd;
    //   208: aload_2
    //   209: invokevirtual setSelectedItem : (Ljava/lang/Object;)V
    //   212: aload_1
    //   213: ifnonnull -> 226
    //   216: aload_0
    //   217: getfield Zz : Lburp/Zedd;
    //   220: getstatic burp/Zlqt.ZH : Ljava/lang/String;
    //   223: invokevirtual setSelectedItem : (Ljava/lang/Object;)V
    //   226: return
  }
  
  private void ZY() {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZX : Lburp/Zmg2;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 36
    //   14: aload_0
    //   15: getfield ZA : Lburp/Zgb6;
    //   18: sipush #-9707
    //   21: sipush #7362
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: invokeinterface ZJ : (Ljava/lang/String;)V
    //   32: aload_1
    //   33: ifnonnull -> 131
    //   36: aload_0
    //   37: getfield Zj : Lburp/Zmg2;
    //   40: invokevirtual isSelected : ()Z
    //   43: ifeq -> 68
    //   46: aload_0
    //   47: getfield ZA : Lburp/Zgb6;
    //   50: sipush #-9711
    //   53: sipush #-30375
    //   56: invokestatic a : (II)Ljava/lang/String;
    //   59: invokeinterface ZJ : (Ljava/lang/String;)V
    //   64: aload_1
    //   65: ifnonnull -> 131
    //   68: aload_0
    //   69: getfield Zv : Lburp/Zmg2;
    //   72: invokevirtual isSelected : ()Z
    //   75: ifeq -> 100
    //   78: aload_0
    //   79: getfield ZA : Lburp/Zgb6;
    //   82: sipush #-9697
    //   85: sipush #-23514
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: invokeinterface ZJ : (Ljava/lang/String;)V
    //   96: aload_1
    //   97: ifnonnull -> 131
    //   100: aload_0
    //   101: getfield ZC : Lburp/Zmg2;
    //   104: invokevirtual isSelected : ()Z
    //   107: ifeq -> 131
    //   110: aload_0
    //   111: getfield Zz : Lburp/Zedd;
    //   114: invokevirtual getSelectedItem : ()Ljava/lang/Object;
    //   117: checkcast java/lang/String
    //   120: astore_2
    //   121: aload_0
    //   122: getfield ZA : Lburp/Zgb6;
    //   125: aload_2
    //   126: invokeinterface ZJ : (Ljava/lang/String;)V
    //   131: return
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Zê?Rþð:\\r­ìäè;«yåùõ²àÔÝ[E\\reVU.L}1Ã}XX«wõgwÂëúd]## å\\r¡¨ó¯Ô½àÓ=Ø!UÊùwnjÅ,´ ?9½§UÛ9³·ÍÖt#jõH ¿Ø¾­áû!kStÀC¦*÷4v[BûXàJ¿±ü¬÷ÿPô\ü³'0'æ ÷DÅJb ÂZÓ\\rhm6êó£(º±') < JÁ^{ÓÌ8` ¥þÃ#&íÛº1ìâ*±ÓkìúçTtÍ|ìG#)Cl¬.~Ôkg0Ôm«¶GAUì\\rv2ÈLA½2¶ì§#&c\\r½j7¯AÎßa3§¬ªâ?Êº©ÖãCvÅiÿçõYá\\bÑg\\b9#åxA\\réÒ1Æãß#<Ó\\f¾)æ°ĻÛÞNílzýN½}¢J¡p(¼%·^º¿T²`ººÎZ´­Ýèl?s¥; Ý# åÏeT«Õ²\\rÝe¾Ä¶'4U'J@òàF )r]:×\\b¦ïóãûbq0¾þëÑÿá°õqª×½kËät­àþÓSá¦Th¾ê%wgÆ¢\\f³~2¿eÿ åÿ«Y¤°¼·Û¢ë ÜG¹E))Ã¹èJö÷iæ:ßXeÀè»4&ËËéî;cjÓæµÓîZ\\fI°¡=¡³T-kÄÜ±w`i]¸Ço-\4Rêûr,I@Ó¤¯ÌÈàêbì{jûE¡û*o#1à 1÷é.ïLWe%'Ù[ÁuØ<Q.E1È?Ga©\\by¶¦{Õ¨rÉ¯X74'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #12
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
    //   68: ldc 'iåF¡ªi±u6ætÛÐd)Etû?¨KÌss!º«×î\\nZþm»'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #27
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #98
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
    //   129: putstatic burp/Zbap.a : [Ljava/lang/String;
    //   132: bipush #21
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbap.b : [Ljava/lang/String;
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
    //   212: bipush #79
    //   214: goto -> 244
    //   217: bipush #47
    //   219: goto -> 244
    //   222: bipush #91
    //   224: goto -> 244
    //   227: bipush #10
    //   229: goto -> 244
    //   232: bipush #109
    //   234: goto -> 244
    //   237: bipush #37
    //   239: goto -> 244
    //   242: bipush #120
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDA1A) & 0xFFFF;
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
      char c = '­';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbap.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */