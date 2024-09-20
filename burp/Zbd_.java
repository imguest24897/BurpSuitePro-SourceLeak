package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import net.portswigger.Zm2;

class Zbd_ extends Zbqc implements Zmon {
  private final Zbc9 Zs;
  
  private final Zm9t ZG;
  
  private final Zm9t ZY;
  
  private final Supplier<Boolean> ZZ;
  
  private final boolean Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbd_(Zbd0 paramZbd0, Supplier<Boolean> paramSupplier) {
    super(new BorderLayout());
    this.ZZ = paramSupplier;
    Zbqc zbqc = Zt();
    Zbcg zbcg1 = Zltn.ZK(Zgzq.INSPECTOR_EMPTY_PANEL_ICON, a(-26037, -4635)).Za(a(-26035, 14450)).ZC(45).ZN(Zlar.INSPECTOR_LEARN_MORE_INFO).Zi();
    Zbcg zbcg2 = Zltn.ZK(Zgzq.INSPECTOR_EMPTY_PANEL_ICON, a(-26042, 9)).Za(a(-26035, 14450)).ZC(45).ZN(Zlar.INSPECTOR_LEARN_MORE_INFO).Zi();
    setName(a(-26048, -17227));
    zbcg1.setName(a(-26046, 28693));
    zbcg2.setName(a(-26047, -16916));
    this.Zs = new Zbc9(new Component[] { paramZbd0, zbqc, zbcg1, zbcg2 });
    this.ZG = new Zm9t();
    Objects.requireNonNull(paramZbd0);
    this.ZG.Zv(Ze3m.ZC(Zeuf.EXPAND_ALL, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_(), a(-26043, -4762), paramZbd0::ZW);
    this.ZG.ZO(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.ZG.ZD(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.ZG.setFocusable(true);
    this.ZY = new Zm9t();
    Objects.requireNonNull(paramZbd0);
    this.ZY.Zv(Ze3m.ZC(Zeuf.COLLAPSE_ALL, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_(), a(-26045, 11692), paramZbd0::Zt);
    this.ZY.ZO(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.ZY.ZD(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.ZY.setFocusable(true);
    Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    add(this.Zs, a(-26038, -10205));
    this.Zl = true;
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zl)
      ZC().forEach(Zm9t::updateUI); 
  }
  
  public List<Zm9t> ZC() {
    return List.of(this.ZG, this.ZY);
  }
  
  public Component ZE() {
    return this;
  }
  
  public Zs_i ZsO() {
    return Zs_i.INSPECTOR;
  }
  
  public String Zsd() {
    return a(-26044, 14569);
  }
  
  public Zbdr ZsQ() {
    return new Zbdr(a(-26035, 14450), Zeuf.INSPECTOR, a(-26041, 503));
  }
  
  public Zze0 Zsc() {
    return null;
  }
  
  private Zbqc Zt() {
    Zm99 zm991 = new Zm99(Zbz3.ZK(Zxpj.INSPECTOR_LOADING));
    zm991.setHorizontalAlignment(0);
    Zm99 zm992 = new Zm99(a(-26036, -15726));
    zm992.ZE(Zt00.TITLE_BOLD_FONT);
    zm992.setHorizontalAlignment(0);
    Zbqc zbqc1 = new Zbqc(new BorderLayout(0, 20));
    zbqc1.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    zbqc1.add(zm991, a(-26040, 29617));
    zbqc1.add(zm992, a(-26039, -5319));
    Zbqc zbqc2 = new Zbqc(new GridBagLayout());
    zbqc2.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 10;
    zbqc2.add(zbqc1, gridBagConstraints);
    return zbqc2;
  }
  
  void ZI() {
    Zq(((Boolean)this.ZZ.get()).booleanValue() ? 3 : 2);
  }
  
  void ZW() {
    Zm2.Zo(Zze0.MESSAGE_INSPECTOR_SHOW_WORKING_ANIMATION);
    Zq(1);
  }
  
  void ZH() {
    Zq(0);
  }
  
  private void Zq(int paramInt) {
    if (!Thread.currentThread().isInterrupted())
      this.Zs.Zv(paramInt); 
  }
  
  public void ZY() {
    this.ZY.setEnabled(false);
    this.ZG.setEnabled(false);
  }
  
  public void ZU() {
    this.ZY.setEnabled(true);
    this.ZG.setEnabled(true);
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '³)ØÓÂß~õ·-|é¶<{+Áá»òÝ*\\tÍ\\r}Ïw¹@ÁÑÝ½U2ô2¢\\nieïN\\fË²ò?Zr{o\\têÄ}Ag\\ns£jGü9& ¼HAi-,¦ô7ì*íüc~TÓÈnI-¬Ë^N¢R`}÷Q69ßð¢ïVwà°MlÛíFi(B\\rAMFÙèá°ó¨]LpYÌB©iQÙ~üR%4ß#ì¬óaö\\böÁSi¨Á,ð1¿¹-'Érò´þ0ðµþÞÉñó!Ï Wâ3¹áÙ¹eV$8#ë`&©î$"XÜlë\\bUÒ¸¹\\r¯Æb0nfÈuc°ató7 ,ü-ä>¨,coú©8±æþ<ïUèòXèû@ÁÃ)ñË{7uÈ´Óv\Þ§us°},»kk­ß¹À`ûV§4ìF¤qÒ WM÷®¸§ôÍ'Å¯ù?¼!{ÆYS(^k¢leà)q5Q(Áj;b]'Õ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #18
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
    //   68: ldc '`g2e^bw_Þ$\\fõÌoI\\tÁF\\fæKå9'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #16
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #120
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
    //   129: putstatic burp/Zbd_.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbd_.b : [Ljava/lang/String;
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
    //   212: bipush #65
    //   214: goto -> 244
    //   217: bipush #39
    //   219: goto -> 244
    //   222: bipush #120
    //   224: goto -> 244
    //   227: bipush #8
    //   229: goto -> 244
    //   232: bipush #103
    //   234: goto -> 244
    //   237: bipush #48
    //   239: goto -> 244
    //   242: bipush #31
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
    int i = (paramInt1 ^ 0xFFFF9A40) & 0xFFFF;
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
      byte b1 = 125;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbd_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */