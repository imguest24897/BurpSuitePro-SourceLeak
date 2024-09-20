package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Optional;
import javax.swing.BorderFactory;

public class Zgo7 extends Zbqc implements Zedo {
  public final Zt3u ZL;
  
  private final Zbkc ZF;
  
  private final Zg29 Zb;
  
  private final Optional<Ztbm> ZO;
  
  private final Zgov Zz;
  
  private Zzgo Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zgo7 Zq(Zt3u paramZt3u, Zg29 paramZg29) {
    return new Zgo7(paramZt3u, paramZg29, true);
  }
  
  public static Zgo7 ZO(Zt3u paramZt3u, Zg29 paramZg29, boolean paramBoolean) {
    return new Zgo7(paramZt3u, paramZg29, paramBoolean);
  }
  
  public static Zgo7 Zr(Zt3u paramZt3u, Zg29 paramZg29) {
    Zgo7 zgo7 = new Zgo7(paramZt3u, paramZg29, true);
    zgo7.ZC();
    return zgo7;
  }
  
  Zgo7(Zt3u paramZt3u, Zg29 paramZg29, boolean paramBoolean) {
    this.ZL = paramZt3u;
    this.Zb = paramZg29;
    this.ZO = Optional.<Zt3u>of(paramZt3u).filter(Zgo7::lambda$new$0).map(Zgo7::lambda$new$1);
    setName(a(17451, 204));
    setLayout(new GridBagLayout());
    Component component = paramZt3u.ZjY();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    Zbqc[] arrayOfZbqc = Zl4w.ZS();
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(component, gridBagConstraints);
    this.ZF = new Zbkc();
    this.ZF.Zx(paramZt3u.Zjd());
    this.ZF.setToolTipText("");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    add(this.ZF, gridBagConstraints);
    this.Zz = new Zgov(paramZg29);
    if (paramBoolean) {
      gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 2;
      gridBagConstraints.gridy = 0;
      gridBagConstraints.anchor = 22;
      add(this.Zz, gridBagConstraints);
    } 
    Zl8w zl8w = new Zl8w();
    zl8w.setText(paramZt3u.ZjS());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(5, 0, 5, 0);
    add(zl8w, gridBagConstraints);
    byte b = 2;
    if (this.ZO.isPresent()) {
      this.Zv = new Zzgo();
      this.Zv.setText(a(17452, 19105));
      this.Zv.setIconTextGap(10);
      this.Zv.addActionListener(this::lambda$new$2);
      this.Zv.setName(a(17455, 27658));
      Zbqc zbqc = new Zbqc(new BorderLayout());
      zbqc.Zl(Zlkk.TABLE_BACKGROUND);
      zbqc.setBorder(BorderFactory.createCompoundBorder(new Zr43(Zlkk.KEYLINE), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
      zbqc.add(this.Zv, a(17453, 23685));
      gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = b++;
      gridBagConstraints.gridwidth = 2;
      gridBagConstraints.fill = 1;
      gridBagConstraints.anchor = 23;
      gridBagConstraints.insets = new Insets(0, 0, 15, 0);
      add(zbqc, gridBagConstraints);
    } 
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = b;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.anchor = 23;
    add(paramZt3u.Zz(), gridBagConstraints);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public void ZC() {
    String str = this.Zb.Zo() ? a(17450, 21009) : a(17454, 21089);
    this.ZF.ZR(str);
  }
  
  public Zg29 ZL() {
    return this.Zb;
  }
  
  public Collection<String> ZV() {
    return this.ZL.ZjD();
  }
  
  public void Zt2() {
    this.ZL.Zt2();
    this.ZO.map(Ztbm::ZQA).ifPresent(this::lambda$configChanged$3);
  }
  
  private void lambda$configChanged$3(Boolean paramBoolean) {
    this.Zv.setSelected(paramBoolean.booleanValue());
    this.Zz.ZA(paramBoolean.booleanValue());
  }
  
  private void lambda$new$2(ActionEvent paramActionEvent) {
    boolean bool = this.Zv.isSelected();
    ((Ztbm)this.ZO.get()).ZO(bool);
    this.Zz.ZA(bool);
  }
  
  private static Ztbm lambda$new$1(Zt3u paramZt3u) {
    return (Ztbm)paramZt3u;
  }
  
  private static boolean lambda$new$0(Zt3u paramZt3u) {
    return paramZt3u instanceof Ztbm;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ']»½Q\\t§©)Çäùöá,U[ÈÒ8áÕE_?ï´)R×ÍÌßøÂ]ÝQWùFTóO©)2\fÑ^¤ÁøF+}`)2}c@þè¡8!ÔqXJ¡uoáÛþBX!¥JUÇÙïW}z¥îÈäßF¼z¼nª^Ø6èpJcJÈJk¨z¶ßuU3¶kºKLÊ¬ia§â·Äðmá´s°ânÕè+G=C:¾ÞÎ&HOçòC¼}h$v××<T-ÅóÚ©åòÜ½AJI¼É6 `Ýûëç'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #159
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #35
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 145
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc 'ÒôZÙx\\b±ÿzsZ*È÷i~¬¢ÓLM#ÛÕaZ©¢lò©åÞPoÅåÏÝ§å\\næ\\fVugyó<ùfÌu¡&?w2F$¤ÿ@\\f '¿^/\\f·0 ZbÈ&vfzÒÄÆ³«£ðGúåB;dK¢Éó_ØG«öubN¬Æ\Å,oráKÃ;ä<E6ByFq;Eã¹ÜSZÒ\\b\\f«eÒR{/£·ðo`'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: sipush #156
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #47
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zgo7.a : [Ljava/lang/String;
    //   134: bipush #6
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zgo7.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #66
    //   218: goto -> 248
    //   221: bipush #21
    //   223: goto -> 248
    //   226: bipush #34
    //   228: goto -> 248
    //   231: bipush #52
    //   233: goto -> 248
    //   236: bipush #7
    //   238: goto -> 248
    //   241: bipush #79
    //   243: goto -> 248
    //   246: bipush #43
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 41, 0 -> 101
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x442E) & 0xFFFF;
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
      char c = '§';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgo7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */