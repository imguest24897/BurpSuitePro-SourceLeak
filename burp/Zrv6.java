package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;

public class Zrv6 extends Zrh7 {
  private final int ZI;
  
  private final Ztf9 Ze;
  
  private final boolean Zl;
  
  private Zbqc Zz;
  
  private Ze01 Zc;
  
  private Ze01 ZA;
  
  private Zbqc ZB;
  
  private Zm9v Zu;
  
  private Zm99 ZS;
  
  private Zm99 ZR;
  
  private Zm99 Zj;
  
  private Zbqc ZL;
  
  private Zm99 ZG;
  
  private Zg85 ZE;
  
  private Ztln Zw;
  
  private Zg85 Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void ZC(Window paramWindow, Ztf9 paramZtf9) {
    new Zrv6(paramWindow, 0, null, paramZtf9);
  }
  
  static void Zr(Window paramWindow, int paramInt, Zs7s paramZs7s, Ztf9 paramZtf9) {
    new Zrv6(paramWindow, paramInt, paramZs7s, paramZtf9);
  }
  
  private Zrv6(Window paramWindow, int paramInt, Zs7s paramZs7s, Ztf9 paramZtf9) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: getstatic burp/Zzv7.CREDENTIALS_EDITOR : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: invokestatic ZX : ()[Ljava/lang/String;
    //   12: aload_0
    //   13: iload_2
    //   14: putfield ZI : I
    //   17: aload_0
    //   18: aload #4
    //   20: putfield Ze : Lburp/Ztf9;
    //   23: aload_0
    //   24: invokevirtual ZF : ()V
    //   27: astore #5
    //   29: aload_3
    //   30: ifnonnull -> 56
    //   33: aload_0
    //   34: sipush #10380
    //   37: sipush #3828
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: invokevirtual setTitle : (Ljava/lang/String;)V
    //   46: aload_0
    //   47: iconst_0
    //   48: putfield Zl : Z
    //   51: aload #5
    //   53: ifnull -> 113
    //   56: aload_0
    //   57: sipush #10381
    //   60: sipush #12761
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual setTitle : (Ljava/lang/String;)V
    //   69: aload_0
    //   70: getfield ZE : Lburp/Zg85;
    //   73: aload_3
    //   74: invokeinterface ZP : ()Ljava/lang/String;
    //   79: invokevirtual setText : (Ljava/lang/String;)V
    //   82: aload_0
    //   83: getfield Zr : Lburp/Zg85;
    //   86: aload_3
    //   87: invokeinterface ZHb : ()Ljava/lang/String;
    //   92: invokevirtual setText : (Ljava/lang/String;)V
    //   95: aload_0
    //   96: getfield Zw : Lburp/Ztln;
    //   99: aload_3
    //   100: invokeinterface ZHy : ()Ljava/lang/String;
    //   105: invokevirtual setText : (Ljava/lang/String;)V
    //   108: aload_0
    //   109: iconst_1
    //   110: putfield Zl : Z
    //   113: aload_0
    //   114: bipush #65
    //   116: bipush #15
    //   118: invokestatic Zf : (Ljava/awt/Component;II)V
    //   121: aload_0
    //   122: invokevirtual pack : ()V
    //   125: aload_1
    //   126: ifnonnull -> 139
    //   129: aload_0
    //   130: aconst_null
    //   131: invokevirtual ZN : (Ljava/awt/Window;)V
    //   134: aload #5
    //   136: ifnull -> 144
    //   139: aload_0
    //   140: aload_1
    //   141: invokevirtual Zq : (Ljava/awt/Window;)V
    //   144: aload_0
    //   145: iconst_1
    //   146: invokevirtual setVisible : (Z)V
    //   149: return
  }
  
  private void ZR() {
    setVisible(false);
    dispose();
  }
  
  private void ZF() {
    this.ZL = new Zbqc();
    this.ZS = new Zm99();
    this.ZE = new Zg85();
    this.Zj = new Zm99();
    this.Zr = new Zg85();
    this.ZR = new Zm99();
    this.Zw = new Ztln();
    this.ZG = new Zm99();
    this.Zz = new Zbqc();
    this.Zu = new Zm9v();
    this.ZB = new Zbqc();
    this.ZA = new Ze01();
    this.Zc = new Ze01();
    this.ZL.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    this.ZL.setLayout(gridBagLayout);
    this.ZS.setText(a(10382, -26238));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    this.ZL.add(this.ZS, gridBagConstraints);
    this.ZE.setColumns(30);
    this.ZE.addActionListener(new Zz8d(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    this.ZL.add(this.ZE, gridBagConstraints);
    this.Zj.setText(a(10377, 17970));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 22;
    this.ZL.add(this.Zj, gridBagConstraints);
    this.Zr.setColumns(30);
    this.Zr.addActionListener(new Zmc6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    this.ZL.add(this.Zr, gridBagConstraints);
    this.ZR.setText(a(10383, -30755));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 22;
    this.ZL.add(this.ZR, gridBagConstraints);
    this.Zw.setColumns(30);
    this.Zw.addActionListener(new Zs4m(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    this.ZL.add(this.Zw, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    this.ZL.add(this.ZG, gridBagConstraints);
    this.Zz.setLayout(new BorderLayout());
    this.Zu.setHorizontalAlignment(4);
    this.Zz.add(this.Zu, a(10378, 18844));
    this.ZB.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 0));
    this.ZB.setLayout(new GridLayout(1, 2, 15, 0));
    this.ZA.setText(a(10370, -15530));
    this.ZA.addActionListener(new Zzyq(this));
    this.ZB.add(this.ZA);
    this.Zc.setText(a(10376, -12045));
    this.Zc.addActionListener(new Zmak(this));
    this.ZB.add(this.Zc);
    this.Zz.add(this.ZB, a(10371, 28446));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.ZL.add(this.Zz, gridBagConstraints);
    getContentPane().add(this.ZL, a(10379, -18947));
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZX : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: new burp/Znc
    //   7: dup
    //   8: aload_0
    //   9: getfield ZE : Lburp/Zg85;
    //   12: invokevirtual getText : ()Ljava/lang/String;
    //   15: aload_0
    //   16: getfield Zr : Lburp/Zg85;
    //   19: invokevirtual getText : ()Ljava/lang/String;
    //   22: new java/lang/String
    //   25: dup
    //   26: aload_0
    //   27: getfield Zw : Lburp/Ztln;
    //   30: invokevirtual getPassword : ()[C
    //   33: invokespecial <init> : ([C)V
    //   36: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   39: astore_3
    //   40: aload_0
    //   41: getfield Zl : Z
    //   44: ifeq -> 67
    //   47: aload_0
    //   48: getfield Ze : Lburp/Ztf9;
    //   51: aload_0
    //   52: getfield ZI : I
    //   55: aload_3
    //   56: invokeinterface Za : (ILburp/Zs3n;)Ljava/util/Optional;
    //   61: astore #4
    //   63: aload_2
    //   64: ifnull -> 79
    //   67: aload_0
    //   68: getfield Ze : Lburp/Ztf9;
    //   71: aload_3
    //   72: invokeinterface Zy : (Lburp/Zs3n;)Ljava/util/Optional;
    //   77: astore #4
    //   79: aload #4
    //   81: invokevirtual isPresent : ()Z
    //   84: ifeq -> 106
    //   87: aload_0
    //   88: getfield Zu : Lburp/Zm9v;
    //   91: aload #4
    //   93: invokevirtual get : ()Ljava/lang/Object;
    //   96: checkcast java/lang/String
    //   99: invokevirtual setText : (Ljava/lang/String;)V
    //   102: aload_2
    //   103: ifnull -> 110
    //   106: aload_0
    //   107: invokevirtual ZR : ()V
    //   110: return
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    ZR();
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    Zg(paramActionEvent);
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    Zg(paramActionEvent);
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    Zg(paramActionEvent);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ãSf%"gÚö\\r\\tzÒ\\tGú%Ì¾EÅ\\t#=¿×_èèÇJUÄ è§õæõÊðQÏ¿JÎÕv¡qøJ\\nb®47¾hñ¨'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #41
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
    //   68: ldc '¦],Y7â'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #122
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
    //   128: putstatic burp/Zrv6.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrv6.b : [Ljava/lang/String;
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
    //   212: bipush #75
    //   214: goto -> 244
    //   217: bipush #101
    //   219: goto -> 244
    //   222: bipush #58
    //   224: goto -> 244
    //   227: bipush #82
    //   229: goto -> 244
    //   232: bipush #94
    //   234: goto -> 244
    //   237: bipush #72
    //   239: goto -> 244
    //   242: bipush #92
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
    int i = (paramInt1 ^ 0x288B) & 0xFFFF;
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
      byte b1 = 115;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrv6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */