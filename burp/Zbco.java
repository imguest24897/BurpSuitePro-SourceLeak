package burp;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.swing.BorderFactory;

class Zbco extends Zbqc {
  private final Map<String, Integer> ZU = new HashMap<>();
  
  private final AtomicReference<String> ZD = new AtomicReference<>();
  
  private final CardLayout ZO = new CardLayout();
  
  private final CardLayout Zf = new CardLayout();
  
  private final CardLayout Zb = new CardLayout();
  
  private final Zbqc Zk = new Zbqc(this.ZO);
  
  private final Zbqc Zn = new Zbqc(this.Zf);
  
  private final Zbqc Zj = new Zbqc(this.Zb);
  
  private final Zbcw ZF = new Zbcw();
  
  private final Ze01 Zs;
  
  private final Ze01 Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zbco(ActionListener paramActionListener1, ActionListener paramActionListener2, ActionListener paramActionListener3, Component paramComponent1, Component paramComponent2) {
    super(new BorderLayout());
    this.ZF.setVisible(false);
    Ze01 ze01 = new Ze01(a(-22373, -32383));
    ze01.setName(a(-22381, -7306));
    ze01.addActionListener(paramActionListener1);
    this.Zs = new Ze01(a(-22372, 28586));
    this.Zs.setName(a(-22377, -22845));
    this.Zs.addActionListener(paramActionListener2);
    this.Zq = new Ze0q(a(-22379, 16573));
    this.Zq.setName(a(-22369, 31678));
    this.Zq.addActionListener(paramActionListener3);
    this.Zn.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
    if (paramComponent2 != null)
      add(paramComponent2, a(-22378, -946)); 
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = -1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 5, 0, 5);
    gridBagConstraints.weightx = 1.0D;
    Zbqc zbqc1 = new Zbqc(new GridBagLayout());
    zbqc1.add(ze01, gridBagConstraints);
    zbqc1.add(this.Zs, gridBagConstraints);
    zbqc1.add(this.Zq, gridBagConstraints);
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.add(this.ZF, a(-22376, 11350));
    if (paramComponent1 != null)
      zbqc2.add(paramComponent1, a(-22383, 25767)); 
    zbqc2.add(this.Zk, a(-22382, -12759));
    zbqc2.setBorder(BorderFactory.createEmptyBorder(15, 15, 0, 15));
    Zbqc zbqc3 = new Zbqc(new BorderLayout());
    zbqc3.add(this.Zj, a(-22371, 19758));
    Zbqc zbqc4 = new Zbqc(new BorderLayout());
    zbqc4.add(zbqc3, a(-22384, -15997));
    zbqc4.add(zbqc1, a(-22370, 24258));
    zbqc4.setBorder(BorderFactory.createEmptyBorder(0, 15, 15, 15));
    Zbqc zbqc5 = new Zbqc(new BorderLayout());
    zbqc5.add(zbqc2, a(-22380, 20279));
    zbqc5.add(this.Zn, a(-22384, -15997));
    zbqc5.add(zbqc4, a(-22375, -137));
    add(zbqc5, a(-22384, -15997));
  }
  
  private void Zz(String paramString1, String paramString2, Component paramComponent1, Component paramComponent2, Component paramComponent3, Supplier<Boolean> paramSupplier) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: aload_0
    //   4: getfield ZU : Ljava/util/Map;
    //   7: aload_1
    //   8: aload_0
    //   9: getfield ZF : Lburp/Zbcw;
    //   12: invokevirtual getComponentCount : ()I
    //   15: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   23: pop
    //   24: aload_0
    //   25: getfield Zk : Lburp/Zbqc;
    //   28: aload_3
    //   29: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   34: invokestatic requireNonNullElseGet : (Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   37: checkcast java/awt/Component
    //   40: aload_1
    //   41: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield Zn : Lburp/Zbqc;
    //   48: aload #4
    //   50: aload_1
    //   51: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   54: istore #7
    //   56: aload_0
    //   57: getfield Zj : Lburp/Zbqc;
    //   60: aload #5
    //   62: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   67: invokestatic requireNonNullElseGet : (Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   70: checkcast java/awt/Component
    //   73: aload_1
    //   74: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   77: new burp/Zbcm
    //   80: dup
    //   81: new burp/Zm2w
    //   84: dup
    //   85: aload_1
    //   86: invokespecial <init> : (Ljava/lang/String;)V
    //   89: <illegal opcode> getAsBoolean : ()Ljava/util/function/BooleanSupplier;
    //   94: aload_0
    //   95: aload_1
    //   96: aload #6
    //   98: <illegal opcode> run : (Lburp/Zbco;Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/lang/Runnable;
    //   103: aconst_null
    //   104: iconst_0
    //   105: invokespecial <init> : (Lburp/Zgmj;Ljava/util/function/BooleanSupplier;Ljava/lang/Runnable;Ljava/lang/String;Z)V
    //   108: astore #8
    //   110: aload #8
    //   112: aload_2
    //   113: invokevirtual setName : (Ljava/lang/String;)V
    //   116: aload_0
    //   117: getfield ZF : Lburp/Zbcw;
    //   120: aload #8
    //   122: invokevirtual Zk : (Lburp/Zbcm;)V
    //   125: aload_0
    //   126: getfield ZF : Lburp/Zbcw;
    //   129: invokevirtual getComponentCount : ()I
    //   132: iconst_1
    //   133: if_icmple -> 149
    //   136: aload_0
    //   137: getfield ZF : Lburp/Zbcw;
    //   140: iconst_1
    //   141: invokevirtual setVisible : (Z)V
    //   144: iload #7
    //   146: ifne -> 154
    //   149: aload_0
    //   150: aload_1
    //   151: invokevirtual Zz : (Ljava/lang/String;)V
    //   154: return
  }
  
  private void Zz(String paramString) {
    this.ZF.ZS(((Integer)this.ZU.get(paramString)).intValue());
  }
  
  private void Zk(String paramString, boolean paramBoolean) {
    this.ZD.set(paramString);
    this.ZO.show(this.Zk, paramString);
    this.Zf.show(this.Zn, paramString);
    this.Zb.show(this.Zj, paramString);
    ZG(paramBoolean);
  }
  
  public void ZG(boolean paramBoolean) {
    this.Zs.setEnabled(paramBoolean);
    this.Zq.setEnabled(paramBoolean);
  }
  
  public String ZN() {
    return this.ZD.get();
  }
  
  private void lambda$add$1(String paramString, Supplier<Boolean> paramSupplier) {
    Zk(paramString, ((Boolean)paramSupplier.get()).booleanValue());
  }
  
  private static boolean lambda$add$0() {
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¡cRéL¢«´gáOÍ3äâ-ÉWÐÖ\\rK%ä¬¨£)hOXÃ\\f·¢:8oê"~¨W &èûÆË^¶)3)[ÃË½Oüj§^z­0Åhúls¥ÔïëKZ«²n(85ÊI½­á'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #71
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
    //   68: ldc '3ìI\\fwdÖ°'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #95
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
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zbco.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbco.b : [Ljava/lang/String;
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
    //   212: bipush #57
    //   214: goto -> 244
    //   217: bipush #14
    //   219: goto -> 244
    //   222: bipush #32
    //   224: goto -> 244
    //   227: bipush #28
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #104
    //   239: goto -> 244
    //   242: bipush #16
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
    int i = (paramInt1 ^ 0xFFFFA895) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbco.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */