package burp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.JPopupMenu;

public class Zb5p extends Zbqc {
  private static final Zb2t Zj;
  
  private static final Zk97 ZU;
  
  private final Zbcm Zm;
  
  private final Zbcm Zq;
  
  private final Zm20 ZE;
  
  private final Consumer<Zb2t> ZM;
  
  private int ZL = 0;
  
  private List<Zsuy> Zl;
  
  private List<Zb2t> ZB;
  
  private boolean ZD;
  
  private Zgsq Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb5p(Runnable paramRunnable, Consumer<Zb2t> paramConsumer, boolean paramBoolean) {
    super(new BorderLayout());
    this.ZM = paramConsumer;
    this.ZE = new Zm20(Zj.shortDescription);
    this.Zm = new Zbcm(this.ZE, Zj.actionDescription, true);
    Ze9n ze9n = Ze3m.ZC(Zeuf.CHEVRON_DOWN, Zlkk.PRIMARY_BUTTON_FOREGROUND).ZU(Zmcx.LINE_SIZE).Z_();
    this.Zq = Zgbp.Zu(ze9n, ze9n, ze9n, ze9n, Zb5p::lambda$new$0, true);
    this.Zl = new ArrayList<>();
    this.Zm.setFocusable(true);
    this.Zm.Zm(paramRunnable);
    this.Zm.setName(a(-9192, 11324));
    this.Zq.setBorder(Zbs6.ZJ());
    this.Zq.Zm(this::ZY);
    this.Zq.setName(a(-9189, 26869));
    this.Zq.setFocusable(true);
    ZT();
    add(this.Zm, a(-9185, -9315));
    add(this.Zq, a(-9187, -4650));
    int[] arrayOfInt = Zzg5.Zr();
    try {
      ZZ(paramBoolean);
      if (Zbqc.Zwu() == null)
        Zzg5.ZZ(new int[3]); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  public void ZZ(boolean paramBoolean) {
    int[] arrayOfInt = Zzg5.Zr();
    try {
      this.ZD = paramBoolean;
      if (paramBoolean) {
        try {
          this.ZB = Zb2t.Zt();
          this.Zq.setVisible(true);
          this.Zm.setBorder(Zbs6.Zj(true));
          if (arrayOfInt != null) {
            this.ZB = Collections.singletonList(Zj);
            Zv(Zj);
            this.Zq.setVisible(false);
            this.Zm.setBorder(Zbs6.Ze());
            return;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    this.ZB = Collections.singletonList(Zj);
    Zv(Zj);
    this.Zq.setVisible(false);
    this.Zm.setBorder(Zbs6.Ze());
  }
  
  public Zb2t Zl() {
    return this.ZB.get(this.ZL);
  }
  
  public void Zv(Zb2t paramZb2t) {
    try {
      if (paramZb2t != Zb2t.SEND) {
        try {
          if (this.ZD) {
            if (!this.Zl.isEmpty()) {
              Zsuy zsuy = this.Zl.get(this.ZL);
              zsuy.setSelected(false);
            } 
            this.ZL = paramZb2t.positionIndex;
            this.Zm.setToolTipText(paramZb2t.actionDescription);
            this.ZE.setText(paramZb2t.shortDescription);
            return;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    if (!this.Zl.isEmpty()) {
      Zsuy zsuy = this.Zl.get(this.ZL);
      zsuy.setSelected(false);
    } 
    this.ZL = paramZb2t.positionIndex;
    this.Zm.setToolTipText(paramZb2t.actionDescription);
    this.ZE.setText(paramZb2t.shortDescription);
  }
  
  void ZN(Zgsq paramZgsq) {
    this.Zy = paramZgsq;
  }
  
  public void setEnabled(boolean paramBoolean) {
    int[] arrayOfInt = Zzg5.Zr();
    try {
      super.setEnabled(paramBoolean);
      if (paramBoolean) {
        try {
          Zi();
          if (arrayOfInt != null) {
            ZT();
            return;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    ZT();
  }
  
  public void Zi() {
    this.Zm.ZH();
    this.Zm.setEnabled(true);
    this.Zq.ZH();
    this.Zq.setEnabled(true);
  }
  
  public void ZT() {
    this.Zm.ZV();
    this.Zm.setEnabled(false);
    this.Zq.ZV();
    this.Zq.setEnabled(false);
  }
  
  private void ZY() {
    // Byte code:
    //   0: invokestatic Zr : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZD : Z
    //   8: ifeq -> 28
    //   11: aload_0
    //   12: getfield Zq : Lburp/Zbcm;
    //   15: invokevirtual isEnabled : ()Z
    //   18: ifne -> 33
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   27: athrow
    //   28: return
    //   29: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   32: athrow
    //   33: new burp/Zkj9
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore_2
    //   41: aload_2
    //   42: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   45: invokevirtual ZE : (Lburp/Zlkk;)V
    //   48: aload_0
    //   49: aload_2
    //   50: invokevirtual Zu : (Lburp/Zkj9;)V
    //   53: aload_0
    //   54: new java/util/ArrayList
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: putfield Zl : Ljava/util/List;
    //   64: aload_0
    //   65: getfield ZB : Ljava/util/List;
    //   68: invokeinterface iterator : ()Ljava/util/Iterator;
    //   73: astore_3
    //   74: aload_3
    //   75: invokeinterface hasNext : ()Z
    //   80: ifeq -> 172
    //   83: aload_3
    //   84: invokeinterface next : ()Ljava/lang/Object;
    //   89: checkcast burp/Zb2t
    //   92: astore #4
    //   94: aload #4
    //   96: getfield longDescription : Ljava/lang/String;
    //   99: aload #4
    //   101: aload_0
    //   102: getfield Zy : Lburp/Zgsq;
    //   105: invokestatic Zg : (Lburp/Zb2t;Lburp/Zgsq;)Ljava/lang/String;
    //   108: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   113: astore #5
    //   115: new burp/Zsuy
    //   118: dup
    //   119: aload #5
    //   121: invokespecial <init> : (Ljava/lang/String;)V
    //   124: astore #6
    //   126: aload #6
    //   128: aload_0
    //   129: aload #4
    //   131: <illegal opcode> actionPerformed : (Lburp/Zb5p;Lburp/Zb2t;)Ljava/awt/event/ActionListener;
    //   136: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   139: aload #6
    //   141: aload #4
    //   143: getfield componentName : Ljava/lang/String;
    //   146: invokevirtual setName : (Ljava/lang/String;)V
    //   149: aload_2
    //   150: aload #6
    //   152: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   155: pop
    //   156: aload_0
    //   157: getfield Zl : Ljava/util/List;
    //   160: aload #6
    //   162: invokeinterface add : (Ljava/lang/Object;)Z
    //   167: pop
    //   168: aload_1
    //   169: ifnull -> 74
    //   172: aload_0
    //   173: getfield Zl : Ljava/util/List;
    //   176: aload_0
    //   177: getfield ZL : I
    //   180: invokeinterface get : (I)Ljava/lang/Object;
    //   185: checkcast burp/Zsuy
    //   188: astore_3
    //   189: aload_3
    //   190: ldc 263168
    //   192: invokestatic ZO : (I)Ljavax/swing/KeyStroke;
    //   195: invokevirtual setAccelerator : (Ljavax/swing/KeyStroke;)V
    //   198: aload_3
    //   199: iconst_1
    //   200: invokevirtual setSelected : (Z)V
    //   203: aload_2
    //   204: aload_0
    //   205: getfield Zm : Lburp/Zbcm;
    //   208: iconst_0
    //   209: aload_0
    //   210: getfield Zm : Lburp/Zbcm;
    //   213: invokevirtual getHeight : ()I
    //   216: invokevirtual show : (Ljava/awt/Component;II)V
    //   219: return
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/lang/MatchException
    //   11	29	29	java/lang/MatchException
  }
  
  private void Zu(Zkj9 paramZkj9) {
    Zbqc zbqc = new Zbqc(new FlowLayout(0, 7, 3));
    Zm2o zm2o = new Zm2o();
    zm2o.Zi(ZU);
    zm2o.addMouseListener(new Zmhl(this, paramZkj9));
    zbqc.add(zm2o);
    Zm99 zm99 = new Zm99(a(-9186, 13634));
    zbqc.add(zm99);
    paramZkj9.add(zbqc);
    paramZkj9.add(new JPopupMenu.Separator());
  }
  
  private void Zk(Zb2t paramZb2t) {
    Zv(paramZb2t);
    Zi();
    this.ZM.accept(paramZb2t);
  }
  
  private static String Zg(Zb2t paramZb2t, Zgsq paramZgsq) {
    try {
      if (paramZb2t == Zb2t.SEND_PARALLEL) {
        try {
          if (paramZgsq == null)
            return ""; 
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } else {
        return "";
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      switch (Zbzf.ZX[paramZgsq.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        case 4:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return "";
  }
  
  private void lambda$showPopup$1(Zb2t paramZb2t, ActionEvent paramActionEvent) {
    Zk(paramZb2t);
  }
  
  private static void lambda$new$0() {}
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\r/Öj/×~-÷¿»wBÉ¤ÖF,±þy|¥ìå5.}J¿tìù´À"r0\\f_ùl1¢<{Íü/¡;S\\n'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #18
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #126
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
    //   68: ldc '·6æ >-ÕÈìhoµMh¹Kâ}Dq&V«Íã]\éi?o±Á& ª'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #25
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #97
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
    //   129: putstatic burp/Zb5p.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb5p.b : [Ljava/lang/String;
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
    //   212: bipush #73
    //   214: goto -> 244
    //   217: bipush #83
    //   219: goto -> 244
    //   222: bipush #47
    //   224: goto -> 244
    //   227: bipush #29
    //   229: goto -> 244
    //   232: bipush #83
    //   234: goto -> 244
    //   237: bipush #115
    //   239: goto -> 244
    //   242: bipush #77
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
    //   300: getstatic burp/Zb2t.SEND : Lburp/Zb2t;
    //   303: putstatic burp/Zb5p.Zj : Lburp/Zb2t;
    //   306: getstatic burp/Zk97.DESKTOP_TOOLS_REPEATER_SEND_GROUP : Lburp/Zk97;
    //   309: putstatic burp/Zb5p.ZU : Lburp/Zk97;
    //   312: return
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDC1E) & 0xFFFF;
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
      char c = 'ÿ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */