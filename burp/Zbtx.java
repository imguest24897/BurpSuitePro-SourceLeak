package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.border.Border;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbtx extends Zbg2 implements Ztep {
  private final Zz9c Zv;
  
  private final Zt90 ZE;
  
  private final Zbtl Zr;
  
  private String ZR;
  
  private Ze01 ZJ;
  
  private Ze01 Zt;
  
  private Ze01 Zi;
  
  private Zbup ZT;
  
  private Zbup Zs;
  
  private Zbkc Zx;
  
  private Zl8w Za;
  
  private Zl8w ZK;
  
  private Zl8w Z_;
  
  private Zl86 ZO;
  
  private Zl86 ZV;
  
  private Zg85 Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbtx(Zz9c paramZz9c, Zt90 paramZt90, Zbtl paramZbtl) {
    this.Zv = paramZz9c;
    this.ZE = paramZt90;
    this.Zr = paramZbtl;
    if (!Zb12.ZG()) {
      Zm();
      this.ZO.ZI(Zt00.MONOSPACED_FONT);
      this.ZV.ZI(Zt00.MONOSPACED_FONT);
      this.Zw.setText(a(-23544, 12498));
    } 
    this.ZB = new String[] { a(-23539, -16645), a(-23550, 31970) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
  }
  
  public void ZC() {
    String str1 = Ztph.Zr();
    String str2 = this.ZE.Zz(this.Zv.ZL());
    if (str2 == null) {
      this.Zv.Zn(new Zbtz(this.Zv, this.ZE, Zkce.ONLINE_ACTIVATE_FAILED_ACTIVATION_ERROR, this.Zr));
      return;
    } 
    if (Zb12.ZG()) {
      System.out.println(a(-23551, -14584));
      System.out.println(a(-23543, 17834));
      System.out.println(a(-23540, -2459));
      System.out.println(str2);
      System.out.println(a(-23552, 8881));
      if (str1 == null) {
        this.ZO.setText(str2);
        this.ZO.setSelectionStart(0);
        this.ZO.setSelectionEnd(0);
        return;
      } 
      return;
    } 
    this.ZO.setText(str2);
    this.ZO.setSelectionStart(0);
    this.ZO.setSelectionEnd(0);
  }
  
  public Zsic Zn(int paramInt) {
    String str;
    if (this.Zv.ZM())
      return null; 
    switch (paramInt) {
      case 0:
        return Zx6o.ZY(this.Zv.ZU(), a(-23546, -8360)) ? null : this;
      case 1:
        str = Zb12.ZG() ? this.ZR : this.ZV.getText();
        if (str.length() == 0)
          return this; 
        switch (Zkcn.Zl[this.ZE.ZF(str, this.Zv.ZL()).ordinal()]) {
          case 1:
            return new Zbtw(this.Zv, this.ZE, Zkce.SUCCESS.ZD());
          case 2:
            return new Zbtw(this.Zv, this.ZE, this.ZE.ZV());
        } 
        return new Zbtz(this.Zv, this.ZE, Zkce.MANUAL_ACTIVATE_FAILED_ACTIVATION_ERROR, this.Zr);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  public void Zc() {
    this.Zv.Zf();
  }
  
  private void Zm() {
    this.Zw = new Zg85();
    this.ZJ = new Ze01();
    this.ZT = new Zbup();
    this.ZO = new Zl86();
    this.Zt = new Ze01();
    this.Zi = new Ze01();
    this.Zs = new Zbup();
    this.ZV = new Zl86();
    this.ZK = new Zl8w();
    this.Zx = new Zbkc();
    this.Z_ = new Zl8w();
    this.Za = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zw.setEditable(false);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zw, gridBagConstraints);
    this.ZJ.setText(a(-23537, 29260));
    this.ZJ.addActionListener(new Zza0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZJ, gridBagConstraints);
    this.ZO.setBorder((Border)null);
    this.ZO.setColumns(20);
    this.ZO.setEditable(false);
    this.ZO.setLineWrap(true);
    this.ZO.setRows(3);
    this.ZO.setWrapStyleWord(true);
    this.ZO.setOpaque(false);
    this.ZT.setViewportView(this.ZO);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZT, gridBagConstraints);
    this.Zt.setText(a(-23545, 882));
    this.Zt.addActionListener(new Zr82(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zt, gridBagConstraints);
    this.Zi.setText(a(-23538, 3651));
    this.Zi.addActionListener(new Zzko(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zi, gridBagConstraints);
    this.ZV.setBorder((Border)null);
    this.ZV.setColumns(20);
    this.ZV.setLineWrap(true);
    this.ZV.setRows(3);
    this.ZV.setWrapStyleWord(true);
    this.ZV.setOpaque(false);
    this.Zs.setViewportView(this.ZV);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zs, gridBagConstraints);
    this.ZK.setText(a(-23548, 2733));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.ZK, gridBagConstraints);
    this.Zx.Zx(a(-23541, 4053));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zx, gridBagConstraints);
    this.Z_.setText(a(-23547, 12023));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.Z_, gridBagConstraints);
    this.Za.setText(a(-23542, 18494));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Za, gridBagConstraints);
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    this.Zv.ZD().Zi().ZD().ZR(this.Zw.getText());
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    this.Zv.ZD().Zi().ZD().ZR(this.ZO.getText());
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    this.ZV.setText(this.Zv.ZD().Zi().ZD().Zp());
  }
  
  public boolean Zu() {
    return true;
  }
  
  public Zsic Zp(String paramString) {
    this.ZR = paramString;
    return Zn(1);
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ïFZG\\f¼H(b-´aQ;ìæj[&ÿ§$ËªÈ×½pÃA:Woò¿ ëHúsJÙ½MâÏmAzz²üÛÀòôÖ3l¼\\f:ï'ïÛéß~_mç%\\fÄÌ08½HàÀ@â!¹BI£ý$îÒ%ë%ïÒèïÉ°µ*£*²*Ø$­!gäâÖÌÈáQ½¸ÁèZ£b9À\\r\\fOv@Ü7Gt/ËÜ½Ñ§bm{¬Ðñ$ÚØæ©c^ ,÷¸Aû+ÚxädíyõRÜæ¢àÕ)?búºÒ(Ã©§ðÅ`aMÛfÜ¬*\\nG ¼Àe0 ?<fz$¿ª,j«ü÷¹ ÙQyáÍZg®ó1&ïàcSH±P°ECÎYaüª2ì¨²ùK½1ý$X¢qevËKðÉhÒn SÇC'yïa]sÆHãAëÂ÷p·,CÜñù¼á½z:½írôßªc%{«ôÁìTbb»ÉK*ÞË\\tÖh\zÎaÞI.(U\\bq®ÚÉPcK§)rjLª¯/Ä½-²ÍßýÔùh¡Ê²ÛÛ\ÄàztìñLµc<DÎªl]úÆMÂ{±¿±±C;Â¢!=ù(%\\n?õ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #89
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
    //   68: ldc 'û§\Y|Tl¹îÂfbÖÛÚk5;yÔ`Z®fñ.¤@ßÖ ¼Öõz<¼9'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #47
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #94
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
    //   129: putstatic burp/Zbtx.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbtx.b : [Ljava/lang/String;
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
    //   212: bipush #87
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #107
    //   224: goto -> 244
    //   227: bipush #44
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #57
    //   239: goto -> 244
    //   242: bipush #102
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
    int i = (paramInt1 ^ 0xFFFFA40C) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */