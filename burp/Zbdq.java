package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbdq extends Zbqc implements Zkgx {
  private final Zb0h Zl;
  
  private Zkhl ZG;
  
  private Zbds ZE;
  
  private Zbds Zd;
  
  private Zm9v Zr;
  
  private Zm9g ZM;
  
  private Ze01 Zt;
  
  private Ze01 Zu;
  
  private String ZJ;
  
  private boolean ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbdq(Zb0h paramZb0h) {
    super(new GridBagLayout());
    this.Zl = paramZb0h;
    Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
  }
  
  void ZA(Zkhl paramZkhl, String paramString) {
    ZQ(paramZkhl, paramString);
    this.ZX = true;
    ZE(this.ZJ);
  }
  
  private void ZQ(Zkhl paramZkhl, String paramString) {
    try {
      this.ZG = paramZkhl;
      this.ZJ = paramString;
      removeAll();
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZE = paramZkhl.ZJ() ? new Zbd3(this.Zl, this::ZE, this::Zm) : new Zbd1(this.Zl);
    this.ZE.Zx(1);
    this.ZE.Zs(this.ZJ);
    Zbd4 zbd4 = new Zbd4(a(17335, -15457), this.ZE);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(zbd4, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(20, 0, 10, 0);
    add(ZW(), gridBagConstraints);
    if (paramZkhl.ZJ()) {
      Zbqc zbqc = ZY();
      gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 2;
      gridBagConstraints.anchor = 21;
      gridBagConstraints.fill = 2;
      add(zbqc, gridBagConstraints);
    } 
  }
  
  private Zkj9 ZJ() {
    Zkj9 zkj9 = new Zkj9();
    Zepe zepe = new Zepe(a(17329, -7518));
    zepe.addActionListener(this::lambda$buildCodeTypeMenu$0);
    zkj9.add(zepe);
    zepe = new Zepe(a(17338, -19048));
    zepe.addActionListener(this::lambda$buildCodeTypeMenu$1);
    zkj9.add(zepe);
    return zkj9;
  }
  
  private Zbqc ZW() {
    Zm99 zm99 = new Zm99(a(17339, -29273));
    zm99.ZE(Zt00.BOLD_FONT);
    this.ZM = new Zm9g();
    this.ZM.ZO(a(17329, -7518), Zbz3.ZK(Zxpj.INSPECTOR_ARROW_DOWN), a(17329, -7518), this::Zb);
    this.ZM.setHorizontalTextPosition(10);
    this.ZM.ZO(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    this.ZM.setFocusable(true);
    this.ZM.setBorder(Zswg.Zn(0, 5, 0, 5));
    Zbqc zbqc1 = new Zbqc(new GridBagLayout());
    zbqc1.Zl(Zlkk.INSPECTOR_TABLE_HEADING_BACKGROUND);
    zbqc1.setBorder(new EmptyBorder(3, 10, 1, 10));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    zbqc1.add(zm99, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    try {
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 0;
      gridBagConstraints.anchor = 21;
      gridBagConstraints.weightx = 1.0D;
      gridBagConstraints.insets = new Insets(0, 20, 0, 0);
      zbqc1.add(this.ZM, gridBagConstraints);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zd = this.ZG.ZJ() ? new Zbd3(this.Zl, this::ZE, this::ZT) : new Zbd1(this.Zl);
    this.Zr = new Zm9v(a(17328, -15639));
    this.Zr.setVisible(false);
    Zbqc zbqc2 = new Zbqc(new BorderLayout(0, 5));
    zbqc2.Zl(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    zbqc2.setBorder(new Zr43(Zlkk.INSPECTOR_TABLE_HEADING_BACKGROUND, 2, new Insets(10, 10, 10, 10)));
    zbqc2.add(this.Zd, a(17334, 24721));
    zbqc2.add(this.Zr, a(17340, 4060));
    Zbqc zbqc3 = new Zbqc(new BorderLayout());
    zbqc3.Zl(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    zbqc3.add(zbqc1, a(17333, 18179));
    zbqc3.add(zbqc2, a(17341, -29534));
    return zbqc3;
  }
  
  private Zbqc ZY() {
    this.Zt = new Ze01(a(17332, -6348));
    this.Zt.addActionListener(this::Z_);
    this.Zu = new Ze0q(a(17343, 20896));
    this.Zu.addActionListener(this::ZH);
    Zz(false);
    Zbqc zbqc1 = new Zbqc(new GridLayout(1, 0, 10, 0));
    zbqc1.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    zbqc1.add(this.Zt);
    zbqc1.add(this.Zu);
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    zbqc2.add(zbqc1, a(17330, 16606));
    return zbqc2;
  }
  
  private void ZP(boolean paramBoolean) {
    this.ZX = paramBoolean;
    Zt();
  }
  
  private void Zm() {
    Zt();
    ZH();
  }
  
  private void ZT() {
    ZK();
    ZH();
  }
  
  private void ZK() {
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      int i = Integer.parseInt(this.Zd.Zw(), this.ZX ? 16 : 10);
      try {
        if (i < 0 || i > 65533) {
          Za();
          return;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      String str = new String(Character.toChars(i));
      this.ZE.Zs(str);
      this.Zr.setVisible(false);
    } catch (IllegalArgumentException illegalArgumentException) {
      Zah.Zl(illegalArgumentException, Zk_.COMMON_RUNTIME_FAILURE);
      Za();
    } 
  }
  
  private void Zt() {
    ZE(this.ZE.Zw());
  }
  
  private void ZE(String paramString) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zd.Zs(this.ZX ? Zq(paramString) : ZD(paramString));
    ZM();
    this.Zr.setVisible(false);
  }
  
  private void ZM() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZM.setText(this.ZX ? a(17337, 23458) : a(17342, -28311));
  }
  
  private void Za() {
    Zz(false);
    this.Zt.setEnabled(true);
    this.Zr.setVisible(true);
  }
  
  private String Zq(String paramString) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramString.isEmpty() ? "" : String.format(a(17331, -15284), new Object[] { Integer.valueOf(paramString.codePointAt(0)) });
  }
  
  private String ZD(String paramString) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramString.isEmpty() ? "" : Integer.toString(paramString.codePointAt(0));
  }
  
  private void Zb() {
    ZJ().show(this.ZM, 0, this.ZM.getHeight());
  }
  
  private void ZH() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = !this.ZE.Zw().equals(this.ZJ) ? true : false;
    try {
      Zz(bool);
      if (!this.Zr.isVisible()) {
        try {
          if (this.ZE.Zw().isEmpty()) {
            this.Zu.setEnabled(false);
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zu.setEnabled(false);
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    ZE();
  }
  
  private void ZE() {
    try {
      if (this.Zu.isEnabled()) {
        this.ZJ = this.ZE.Zw();
        this.ZG.Zi(this.ZJ);
        Zz(false);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void Z_(ActionEvent paramActionEvent) {
    this.ZE.Zs(this.ZJ);
    Zm();
  }
  
  private void Zz(boolean paramBoolean) {
    try {
      if (this.ZG.ZJ()) {
        this.Zt.setEnabled(paramBoolean);
        this.Zu.setEnabled(paramBoolean);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Zkhl;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull -> 17
    //   9: getstatic burp/Zbdq.Zi : Lburp/Ztcw;
    //   12: areturn
    //   13: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   16: athrow
    //   17: aload_0
    //   18: getfield ZE : Lburp/Zbds;
    //   21: invokevirtual Zw : ()Ljava/lang/String;
    //   24: astore_2
    //   25: aload_0
    //   26: getfield Zd : Lburp/Zbds;
    //   29: invokevirtual Zw : ()Ljava/lang/String;
    //   32: astore_3
    //   33: aload_0
    //   34: getfield ZJ : Ljava/lang/String;
    //   37: astore #4
    //   39: aload_0
    //   40: getfield ZX : Z
    //   43: istore #5
    //   45: aload_0
    //   46: getfield Zr : Lburp/Zm9v;
    //   49: invokevirtual isVisible : ()Z
    //   52: istore #6
    //   54: aload_0
    //   55: aload_1
    //   56: aload #4
    //   58: aload_2
    //   59: aload_3
    //   60: iload #5
    //   62: iload #6
    //   64: <illegal opcode> Zg : (Lburp/Zbdq;Lburp/Zkhl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lburp/Ztcw;
    //   69: areturn
    // Exception table:
    //   from	to	target	type
    //   5	13	13	java/lang/IllegalArgumentException
  }
  
  public void ZU() {
    this.ZX = true;
    this.ZG = null;
    this.ZJ = null;
  }
  
  private void lambda$checkpoint$2(Zkhl paramZkhl, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2) {
    ZQ(paramZkhl, paramString1);
    this.ZE.Zs(paramString2);
    this.Zd.Zs(paramString3);
    this.ZX = paramBoolean1;
    ZM();
    this.Zr.setVisible(paramBoolean2);
    ZH();
  }
  
  private void lambda$buildCodeTypeMenu$1(ActionEvent paramActionEvent) {
    ZP(false);
  }
  
  private void lambda$buildCodeTypeMenu$0(ActionEvent paramActionEvent) {
    ZP(true);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '(c(A{¨TyTj6·äð½3Q-Íq4EC²uÿ;4`!2Â6PäK\\rÊí76ôñcÖQGÔ\\r IÁç\\nä2ÿFð ÕéïT·ÔöåéY\\tTÂo'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #18
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
    //   68: ldc 'OÒøu}º/'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #51
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
    //   129: putstatic burp/Zbdq.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbdq.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #86
    //   214: goto -> 243
    //   217: bipush #15
    //   219: goto -> 243
    //   222: bipush #33
    //   224: goto -> 243
    //   227: bipush #59
    //   229: goto -> 243
    //   232: bipush #113
    //   234: goto -> 243
    //   237: iconst_3
    //   238: goto -> 243
    //   241: bipush #87
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
    int i = (paramInt1 ^ 0x43B7) & 0xFFFF;
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
      byte b1 = 114;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */