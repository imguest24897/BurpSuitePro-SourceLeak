package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ze0v extends Ze0q {
  private static final Ze9n ZK;
  
  private static final Ze9n ZJ;
  
  private static final Ze9n Zk;
  
  private static final Insets Zs;
  
  private final Ze0b Zo;
  
  private final Ze0b ZU;
  
  private final Consumer<Boolean> ZR;
  
  private Ze9n Zc;
  
  private Ze9n ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Ze0v(Consumer<Boolean> paramConsumer, Runnable paramRunnable, Zm6x paramZm6x) {
    this.ZR = paramConsumer;
    this.Zo = new Ze0b(ZK, a(-6191, -20649));
    this.ZU = new Ze0b(Ze3m.ZC(Zeuf.CHEVRON_DOWN, Zlkk.PRIMARY_BUTTON_FOREGROUND).ZU(Zmcx.LARGE_LINE_SIZE).Z_());
    setLayout(new GridBagLayout());
    paramZm6x.ZP(Zs4u.class, this::lambda$new$0);
    paramZm6x.ZP(Zxfh.class, this::lambda$new$1);
    this.Zo.setFocusable(true);
    this.Zo.addActionListener(paramRunnable::lambda$new$2);
    this.Zo.setName(a(-6192, 1827));
    this.Zo.setIconTextGap(10);
    this.Zo.setBorder(new CompoundBorder(new Zrf5(0, 0, 0, 1, Zlkk.RADIO_BAR_DIVIDER), new EmptyBorder(0, 10, 0, 10)));
    Zmse.Zb(this.Zo, 20);
    this.ZU.setBorder(new EmptyBorder(0, 5, 0, 5));
    this.ZU.setName(a(-6186, -17046));
    this.ZU.setFocusable(true);
    this.ZU.addActionListener(this::lambda$new$3);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zo, gridBagConstraints);
    gridBagConstraints.gridx = 1;
    gridBagConstraints.anchor = 24;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 0.0D;
    add(this.ZU, gridBagConstraints);
    setMargin(Zs);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.Zo.setEnabled(paramBoolean);
    this.ZU.setEnabled(paramBoolean);
    this.Zo.setContentAreaFilled(paramBoolean);
    this.ZU.setContentAreaFilled(paramBoolean);
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      if (this.Zo != null)
        Zmse.Zb(this.Zo, 20); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private void ZV() {
    Zkj9 zkj9 = new Zkj9();
    zkj9.ZE(Zlkk.PANEL_BACKGROUND);
    Zepe zepe1 = new Zepe(a(-6191, -20649));
    zepe1.addActionListener(this::lambda$showPopup$4);
    Zepe zepe2 = new Zepe(a(-6190, 21671));
    zepe2.addActionListener(this::lambda$showPopup$5);
    zkj9.add(zepe1);
    zkj9.add(zepe2);
    zkj9.show(this.Zo, 0, this.Zo.getHeight());
  }
  
  private static Zkmu Zi(List<? extends Zz6e<?>> paramList) {
    boolean bool = Zmue.Zm();
    if (!paramList.isEmpty()) {
      Zkmu zkmu = ZO(paramList.getFirst());
      byte b = 1;
      while (b < paramList.size()) {
        try {
          if (ZO(paramList.get(b)) != zkmu)
            return Zkmu.MIXED; 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        b++;
        if (!bool)
          break; 
      } 
      return zkmu;
    } 
    return Zkmu.TO_TARGET_SERVER;
  }
  
  private static Zkmu ZO(Zz6e<?> paramZz6e) {
    if (paramZz6e instanceof Ztf_) {
      Ztf_ ztf_ = (Ztf_)paramZz6e;
      try {
      
      } catch (MatchException matchException) {
        throw a(null);
      } 
      return ztf_.Zc() ? Zkmu.TO_TARGET_SERVER : Zkmu.TO_PROXY_CLIENT;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return Zkmu.TO_TARGET_SERVER;
  }
  
  private void lambda$showPopup$5(ActionEvent paramActionEvent) {
    this.Zo.setText(a(-6185, -29624));
    this.Zo.setIcon(this.Zc);
    this.ZR.accept(Boolean.valueOf(true));
  }
  
  private void lambda$showPopup$4(ActionEvent paramActionEvent) {
    this.Zo.setText(a(-6189, 12672));
    this.Zo.setIcon(this.ZS);
    this.ZR.accept(Boolean.valueOf(false));
  }
  
  private void lambda$new$3(ActionEvent paramActionEvent) {
    ZV();
  }
  
  private static void lambda$new$2(Runnable paramRunnable, ActionEvent paramActionEvent) {
    paramRunnable.run();
  }
  
  private void lambda$new$1(Zxfh paramZxfh) {
    try {
      switch (Zzte.ZH[paramZxfh.ZrI().ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      this.Zc = Zkmu.MIXED.Zp;
      if (a(-6185, -29624).equals(this.Zo.getText()))
        this.Zo.setIcon(this.Zc); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private void lambda$new$0(Zs4u paramZs4u) {
    try {
      this.ZS = (Zi(paramZs4u.ZzJ())).Zp;
      if (a(-6191, -20649).equals(this.Zo.getText()))
        this.Zo.setIcon(this.ZS); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¿tðb\\bví8Á Ô .½:\\nfF Þ>7¯dÑSÚQäØþ¤H8È¶ïX·À/vh'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #110
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
    //   68: ldc 'ò2?ÌÅxw;Ç?Ã1þ¼ðrÞÚßÀòV¶\\t½¿8'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #76
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
    //   129: putstatic burp/Ze0v.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ze0v.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #56
    //   214: goto -> 243
    //   217: bipush #21
    //   219: goto -> 243
    //   222: bipush #95
    //   224: goto -> 243
    //   227: bipush #24
    //   229: goto -> 243
    //   232: iconst_3
    //   233: goto -> 243
    //   236: bipush #113
    //   238: goto -> 243
    //   241: bipush #6
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
    //   300: getstatic burp/Zeuf.ARROW_RIGHT : Lburp/Zeuf;
    //   303: getstatic burp/Zlkk.PRIMARY_BUTTON_FOREGROUND : Lburp/Zlkk;
    //   306: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   309: invokevirtual Z_ : ()Lburp/Ze9n;
    //   312: putstatic burp/Ze0v.ZK : Lburp/Ze9n;
    //   315: getstatic burp/Zeuf.ARROW_LEFT : Lburp/Zeuf;
    //   318: getstatic burp/Zlkk.PRIMARY_BUTTON_FOREGROUND : Lburp/Zlkk;
    //   321: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   324: invokevirtual Z_ : ()Lburp/Ze9n;
    //   327: putstatic burp/Ze0v.ZJ : Lburp/Ze9n;
    //   330: getstatic burp/Zeuf.CONVERT : Lburp/Zeuf;
    //   333: getstatic burp/Zlkk.PRIMARY_BUTTON_FOREGROUND : Lburp/Zlkk;
    //   336: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   339: invokevirtual Z_ : ()Lburp/Ze9n;
    //   342: putstatic burp/Ze0v.Zk : Lburp/Ze9n;
    //   345: new java/awt/Insets
    //   348: dup
    //   349: iconst_0
    //   350: iconst_0
    //   351: iconst_0
    //   352: iconst_0
    //   353: invokespecial <init> : (IIII)V
    //   356: putstatic burp/Ze0v.Zs : Ljava/awt/Insets;
    //   359: return
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE7D3) & 0xFFFF;
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
      char c = 'æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */