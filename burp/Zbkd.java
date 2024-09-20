package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Zbkd extends Zbqc {
  private final List<Zm9t> ZU;
  
  private final List<AbstractButton> Zc;
  
  private Zbc6 Zo;
  
  private Zbky ZR;
  
  private Zgf8 ZE;
  
  private String ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbkd() {
    setLayout(new GridLayout());
    setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    setOpaque(false);
    this.ZU = new ArrayList<>();
    this.Zc = new ArrayList<>();
  }
  
  @SafeVarargs
  public final <T extends Zrn3> void ZX(Zkt2<T> paramZkt2, Zx08<T>... paramVarArgs) {
    Zbc6 zbc6 = new Zbc6();
    zbc6.ZY(paramZkt2);
    boolean bool = Zm99.ZQ();
    Zx08<T>[] arrayOfZx08 = paramVarArgs;
    int i = arrayOfZx08.length;
    byte b = 0;
    while (b < i) {
      Zx08<T> zx08 = arrayOfZx08[b];
      zbc6.Zh(zx08);
      b++;
      if (bool)
        break; 
    } 
    Zgf8 zgf8 = new Zgf8();
    zgf8.Zv(paramZkt2, 10);
    zgf8.setOpaque(false);
    Zdf zdf = new Zdf(new Insets(1, 1, 1, 1), Zlkk.TABLE_FILTER_BAR_BORDER, 1.0F, 8);
    zgf8.setBorder(BorderFactory.createCompoundBorder((Border)zdf, BorderFactory.createEmptyBorder(2, 4, 2, 4)));
    ZG(zbc6);
    ZX(zgf8);
  }
  
  public void ZX(Zgf8 paramZgf8) {
    this.ZE = paramZgf8;
    Zi();
  }
  
  public void Zn(Zbky paramZbky) {
    this.ZR = paramZbky;
    Zi();
  }
  
  public void ZG(Zbc6 paramZbc6) {
    this.Zo = paramZbc6;
    Zi();
  }
  
  public void Zh(Zm9t paramZm9t) {
    this.ZU.add(paramZm9t);
    Zi();
  }
  
  public void Zw(Zm9t paramZm9t) {
    this.ZU.remove(paramZm9t);
    Zi();
  }
  
  public void Zj(String paramString) {
    this.ZP = paramString;
    Zi();
  }
  
  public <T extends AbstractButton> void Zw(T paramT) {
    this.Zc.add((AbstractButton)paramT);
    Zi();
  }
  
  private void Zi() {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: aload_0
    //   4: invokevirtual removeAll : ()V
    //   7: istore_1
    //   8: aload_0
    //   9: getfield ZP : Ljava/lang/String;
    //   12: ifnull -> 29
    //   15: aload_0
    //   16: getfield Zo : Lburp/Zbc6;
    //   19: ifnonnull -> 33
    //   22: aload_0
    //   23: getfield ZR : Lburp/Zbky;
    //   26: ifnonnull -> 33
    //   29: iconst_1
    //   30: goto -> 34
    //   33: iconst_2
    //   34: istore_2
    //   35: iload_2
    //   36: iconst_2
    //   37: if_icmpne -> 45
    //   40: bipush #10
    //   42: goto -> 46
    //   45: iconst_0
    //   46: istore_3
    //   47: aload_0
    //   48: new java/awt/GridLayout
    //   51: dup
    //   52: iload_2
    //   53: iconst_1
    //   54: iconst_0
    //   55: iload_3
    //   56: invokespecial <init> : (IIII)V
    //   59: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   62: iload_2
    //   63: anewarray burp/Zbkg
    //   66: astore #4
    //   68: iconst_0
    //   69: istore #5
    //   71: iload #5
    //   73: aload #4
    //   75: arraylength
    //   76: if_icmpge -> 98
    //   79: aload #4
    //   81: iload #5
    //   83: new burp/Zbkg
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: aastore
    //   91: iinc #5, 1
    //   94: iload_1
    //   95: ifne -> 71
    //   98: aload_0
    //   99: getfield ZP : Ljava/lang/String;
    //   102: ifnull -> 111
    //   105: aload_0
    //   106: aload #4
    //   108: invokevirtual ZK : ([Lburp/Zbkg;)V
    //   111: aload_0
    //   112: getfield Zo : Lburp/Zbc6;
    //   115: ifnull -> 124
    //   118: aload_0
    //   119: aload #4
    //   121: invokevirtual Zn : ([Lburp/Zbkg;)V
    //   124: aload_0
    //   125: getfield ZR : Lburp/Zbky;
    //   128: ifnull -> 141
    //   131: aload_0
    //   132: aload #4
    //   134: invokevirtual Zc : ([Lburp/Zbkg;)V
    //   137: iload_1
    //   138: ifne -> 155
    //   141: aload_0
    //   142: getfield ZP : Ljava/lang/String;
    //   145: ifnonnull -> 155
    //   148: aload #4
    //   150: iconst_0
    //   151: aaload
    //   152: invokestatic ZL : (Lburp/Zbkg;)V
    //   155: aload_0
    //   156: getfield ZE : Lburp/Zgf8;
    //   159: ifnull -> 169
    //   162: aload_0
    //   163: aload #4
    //   165: iload_2
    //   166: invokevirtual ZK : ([Lburp/Zbkg;I)V
    //   169: aload_0
    //   170: getfield Zc : Ljava/util/List;
    //   173: invokeinterface isEmpty : ()Z
    //   178: ifne -> 187
    //   181: aload_0
    //   182: aload #4
    //   184: invokevirtual ZW : ([Lburp/Zbkg;)V
    //   187: aload_0
    //   188: getfield ZU : Ljava/util/List;
    //   191: invokeinterface isEmpty : ()Z
    //   196: ifne -> 205
    //   199: aload_0
    //   200: aload #4
    //   202: invokevirtual Zl : ([Lburp/Zbkg;)V
    //   205: aload #4
    //   207: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   210: aload_0
    //   211: <illegal opcode> accept : (Lburp/Zbkd;)Ljava/util/function/Consumer;
    //   216: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   221: aload_0
    //   222: invokevirtual revalidate : ()V
    //   225: return
  }
  
  private void ZK(Zbkg[] paramArrayOfZbkg) {
    Zm99 zm99 = new Zm99(this.ZP);
    zm99.setBorder(new EmptyBorder(5, 0, 0, 0));
    zm99.ZE(Zt00.TITLE_BOLD_FONT);
    zm99.Ze(Zlkk.BURP_TITLE);
    zm99.setName(a(-18073, 22999));
    Zbkg zbkg = paramArrayOfZbkg[0];
    GridBagConstraints gridBagConstraints = ZC(zbkg);
    zbkg.add(zm99, gridBagConstraints);
  }
  
  private void Zl(Zbkg[] paramArrayOfZbkg) {
    Zbqc zbqc = new Zbqc();
    zbqc.setName(a(-18074, 23967));
    zbqc.setOpaque(false);
    zbqc.setLayout(new BoxLayout(zbqc, 0));
    zbqc.setOpaque(false);
    zbqc.add(this.ZU.get(0));
    boolean bool = Zm99.ZQ();
    byte b = 1;
    while (b < this.ZU.size()) {
      Component component = Box.createHorizontalStrut(10);
      zbqc.add(component);
      zbqc.add(this.ZU.get(b));
      b++;
      if (bool)
        break; 
    } 
    Zbkg zbkg = paramArrayOfZbkg[0];
    GridBagConstraints gridBagConstraints = Zu(zbkg);
    zbkg.add(zbqc, gridBagConstraints);
  }
  
  private void ZW(Zbkg[] paramArrayOfZbkg) {
    Zbqc zbqc = new Zbqc();
    boolean bool = Zm99.ZM();
    zbqc.setName(a(-18075, 3152));
    zbqc.setOpaque(false);
    zbqc.setLayout(new BoxLayout(zbqc, 0));
    zbqc.setAlignmentX(1.0F);
    zbqc.setOpaque(false);
    zbqc.add(this.Zc.get(0));
    byte b = 1;
    while (b < this.Zc.size()) {
      Component component = Box.createHorizontalStrut(10);
      zbqc.add(component);
      zbqc.add(this.Zc.get(b));
      b++;
      if (!bool)
        break; 
    } 
    Zbkg zbkg = paramArrayOfZbkg[0];
    GridBagConstraints gridBagConstraints = Zu(zbkg);
    zbkg.add(zbqc, gridBagConstraints);
  }
  
  private void ZK(Zbkg[] paramArrayOfZbkg, int paramInt) {
    boolean bool = (paramInt == 2 && this.ZR != null && this.Zo != null) ? false : (paramArrayOfZbkg.length - 1);
    this.ZE.setBorder(BorderFactory.createCompoundBorder((Border)new Zdf(new Insets(1, 1, 1, 1), Zlkk.SEARCH_BAR_BORDER, 1.0F, 10), BorderFactory.createEmptyBorder(2, 8, 2, 5)));
    this.ZE.setOpaque(false);
    Zbkg zbkg = paramArrayOfZbkg[bool];
    GridBagConstraints gridBagConstraints = Zu(zbkg);
    zbkg.add(this.ZE, gridBagConstraints);
  }
  
  private void Zc(Zbkg[] paramArrayOfZbkg) {
    Zbkg zbkg = paramArrayOfZbkg[paramArrayOfZbkg.length - 1];
    GridBagConstraints gridBagConstraints = ZC(zbkg);
    zbkg.add(this.ZR, gridBagConstraints);
  }
  
  private void Zn(Zbkg[] paramArrayOfZbkg) {
    Zbkg zbkg = paramArrayOfZbkg[paramArrayOfZbkg.length - 1];
    GridBagConstraints gridBagConstraints = Zu(zbkg);
    boolean bool = (ZA() >= 3 && paramArrayOfZbkg.length == 1) ? true : false;
    this.Zo.Zp(bool);
    zbkg.add(this.Zo, gridBagConstraints);
    if (this.ZR == null)
      ZL(zbkg); 
  }
  
  private static void ZL(Zbkg paramZbkg) {
    Component component = Box.createHorizontalGlue();
    GridBagConstraints gridBagConstraints = ZC(paramZbkg);
    gridBagConstraints.insets = new Insets(0, 0, 0, 0);
    paramZbkg.add(component, gridBagConstraints);
  }
  
  private static GridBagConstraints Zu(Zbkg paramZbkg) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = paramZbkg.Zv++;
    gridBagConstraints.insets = new Insets(0, paramZbkg.Zc, 0, 0);
    paramZbkg.Zc = 10;
    return gridBagConstraints;
  }
  
  private static GridBagConstraints ZC(Zbkg paramZbkg) {
    GridBagConstraints gridBagConstraints = Zu(paramZbkg);
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    return gridBagConstraints;
  }
  
  private int ZA() {
    byte b = 0;
    if (this.ZP != null)
      b++; 
    if (this.Zo != null)
      b++; 
    if (this.ZR != null)
      b++; 
    if (this.ZE != null)
      b++; 
    return b;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '@ËCÇìÝ¬¼)þê8ö7LVº\ã6#£o9ù#GÙI«ñØÍð ð'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #10
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #6
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zbkd.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zbkd.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #109
    //   154: goto -> 184
    //   157: bipush #28
    //   159: goto -> 184
    //   162: bipush #38
    //   164: goto -> 184
    //   167: bipush #124
    //   169: goto -> 184
    //   172: bipush #35
    //   174: goto -> 184
    //   177: bipush #96
    //   179: goto -> 184
    //   182: bipush #47
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB967) & 0xFFFF;
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
      char c = 'À';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbkd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */