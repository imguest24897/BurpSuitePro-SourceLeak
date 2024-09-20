package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;

class Zbm3 extends Zbv5 implements Zl_2 {
  private final Zz0n ZF;
  
  private final Zt4u ZY;
  
  private final Zgvc ZO;
  
  private Zzdy Zi;
  
  private Zzdy ZH;
  
  private Zzdy Zm;
  
  private Zzdy Zq;
  
  private Ze01 Zo;
  
  private Ze01 Zk;
  
  private Ze01 ZA;
  
  private Zl8w Zn;
  
  private Zm2o ZG;
  
  private Zg85 Zu;
  
  private Zg85 ZX;
  
  private Zbkc Zy;
  
  private Zg85 Zt;
  
  private Zm99 Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbm3(Zz0n paramZz0n, Zt4u paramZt4u, Zgvc paramZgvc) {
    this.ZF = paramZz0n;
    this.ZY = paramZt4u;
    this.ZO = paramZgvc;
    Zh();
    this.Zu.setText(Zrhd.Zp(paramZgvc.Zh()));
    this.Zu.setCaretPosition(0);
    this.ZX.setText(Zrhd.Zp(paramZgvc.Zd()));
    this.ZX.setCaretPosition(0);
    this.Zt.setText(Zrhd.Zp(paramZgvc.ZG()));
    this.Zt.setCaretPosition(0);
    this.Zm.setName(a(8115, 16561));
    this.Zq.setName(a(8120, -11699));
    this.ZH.setName(a(8122, 2124));
    ZT((ActionEvent)null);
    Zw((ActionEvent)null);
    ZJ((ActionEvent)null);
    Zs((ActionEvent)null);
  }
  
  public void Zz(List<String> paramList) {
    // Byte code:
    //   0: invokestatic Zb : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: aload_0
    //   6: getfield ZO : Lburp/Zgvc;
    //   9: invokevirtual Zh : ()Ljava/util/List;
    //   12: if_acmpne -> 38
    //   15: aload_0
    //   16: getfield Zu : Lburp/Zg85;
    //   19: aload_1
    //   20: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   23: invokevirtual setText : (Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield Zu : Lburp/Zg85;
    //   30: iconst_0
    //   31: invokevirtual setCaretPosition : (I)V
    //   34: aload_2
    //   35: ifnonnull -> 113
    //   38: aload_1
    //   39: aload_0
    //   40: getfield ZO : Lburp/Zgvc;
    //   43: invokevirtual Zd : ()Ljava/util/List;
    //   46: if_acmpne -> 72
    //   49: aload_0
    //   50: getfield ZX : Lburp/Zg85;
    //   53: aload_1
    //   54: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   57: invokevirtual setText : (Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield ZX : Lburp/Zg85;
    //   64: iconst_0
    //   65: invokevirtual setCaretPosition : (I)V
    //   68: aload_2
    //   69: ifnonnull -> 113
    //   72: aload_1
    //   73: aload_0
    //   74: getfield ZO : Lburp/Zgvc;
    //   77: invokevirtual ZG : ()Ljava/util/List;
    //   80: if_acmpne -> 106
    //   83: aload_0
    //   84: getfield Zt : Lburp/Zg85;
    //   87: aload_1
    //   88: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   91: invokevirtual setText : (Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield Zt : Lburp/Zg85;
    //   98: iconst_0
    //   99: invokevirtual setCaretPosition : (I)V
    //   102: aload_2
    //   103: ifnonnull -> 113
    //   106: iconst_0
    //   107: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   110: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   113: return
  }
  
  private void Zh() {
    this.Zi = new Zzdy();
    this.Zm = new Zzdy();
    this.ZH = new Zzdy();
    this.Zq = new Zzdy();
    this.Zu = new Zg85();
    this.Zo = new Ze01();
    this.ZX = new Zg85();
    this.Zk = new Ze01();
    this.Zt = new Zg85();
    this.ZA = new Ze01();
    this.Zn = new Zl8w();
    this.Zy = new Zbkc();
    this.ZG = new Zm2o();
    this.Zj = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zi.setSelected(true);
    this.Zi.setText(a(8117, -22852));
    this.Zi.addActionListener(new Zxpy(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.Zi, gridBagConstraints);
    this.Zm.setSelected(true);
    this.Zm.setText(a(8114, 25091));
    this.Zm.addActionListener(new Zmwl(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.Zm, gridBagConstraints);
    this.ZH.setSelected(true);
    this.ZH.setText(a(8123, 4053));
    this.ZH.addActionListener(new Zb11(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZH, gridBagConstraints);
    this.Zq.setSelected(true);
    this.Zq.setText(a(8112, 31613));
    this.Zq.addActionListener(new Zeo0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.Zq, gridBagConstraints);
    this.Zu.setEditable(false);
    this.Zu.setColumns(35);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.Zu, gridBagConstraints);
    this.Zo.setText(a(8119, -308));
    this.Zo.addActionListener(new Zkvb(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 18;
    add(this.Zo, gridBagConstraints);
    this.ZX.setEditable(false);
    this.ZX.setColumns(35);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZX, gridBagConstraints);
    this.Zk.setText(a(8113, 31661));
    this.Zk.addActionListener(new Zsqr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 18;
    add(this.Zk, gridBagConstraints);
    this.Zt.setEditable(false);
    this.Zt.setColumns(35);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.Zt, gridBagConstraints);
    this.ZA.setText(a(8113, 31661));
    this.ZA.addActionListener(new Zz0i(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 18;
    add(this.ZA, gridBagConstraints);
    this.Zn.setText(a(8121, 6403));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zn, gridBagConstraints);
    this.Zy.Zx(a(8118, -27147));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 21;
    add(this.Zy, gridBagConstraints);
    this.ZG.Zi(Zk97.DESKTOP_FUNCTIONS_CONTENT_DISCOVERY_FILE_EXTENSIONS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZG, gridBagConstraints);
    this.Zj.setText(a(8116, -21362));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    add(this.Zj, gridBagConstraints);
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    new Zrhd(this.ZO.ZB(), this.ZF, this.ZY, this, this.ZO.Zh());
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    this.ZO.Zd(this.Zi.isSelected());
    this.Zo.setEnabled(this.Zi.isSelected());
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    this.ZO.Zl(this.Zm.isSelected());
    this.Zk.setEnabled(this.Zm.isSelected());
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    this.ZO.Zy(this.Zq.isSelected());
    this.ZA.setEnabled(this.Zq.isSelected());
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    this.ZO.ZV(this.ZH.isSelected());
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    new Zrhd(this.ZO.ZB(), this.ZF, this.ZY, this, this.ZO.Zd());
  }
  
  private void Zq(ActionEvent paramActionEvent) {
    new Zrhd(this.ZO.ZB(), this.ZF, this.ZY, this, this.ZO.ZG());
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '4D¯¬Á¿ v¬æ1jÇÓÂöTIüA¼ëAÇ]xjlT\\b÷>ú\\b:Õ?×\\nôÄ?^âUh]±n{Ëf\\tÈA¯çJÁDFP\\b)ë£â¨hòv.N,ôºö:u#Ò,¤q,áµÕOÒL!T^ü7?l£\\f!PÊ6q©ì%¾gÏ\\f\\bVÌøî÷tU7rjjyg7mNmUK¦Cê;&éaº^R­ò}V§iX=(dÓò\ð+Æ¥·{Æ!ýý kã¡;]2æOú$S®Tñ^5¸l&ØùSjým4­ÙbFÝO?\'Dwö/ùíø»¦%õeènn¡\\nWSú ³>¼ýacÒÁXùÔ&B[\\r^ôÒØÐT\\b©Tâý©áHxkz²KÎm_ÍcÝS¹\¤jÚN,TÄO]Ía@'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #50
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #101
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
    //   68: ldc '# oÌlREyõ^°sèeñÐöÀO¹ÐÖò\\rÇ§!HÀÎÒ§_½\¦úd_¶á°\íT1§;²b'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #37
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #106
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
    //   129: putstatic burp/Zbm3.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbm3.b : [Ljava/lang/String;
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
    //   212: bipush #19
    //   214: goto -> 244
    //   217: bipush #80
    //   219: goto -> 244
    //   222: bipush #47
    //   224: goto -> 244
    //   227: bipush #90
    //   229: goto -> 244
    //   232: bipush #37
    //   234: goto -> 244
    //   237: bipush #38
    //   239: goto -> 244
    //   242: bipush #57
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
    int i = (paramInt1 ^ 0x1FB0) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbm3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */