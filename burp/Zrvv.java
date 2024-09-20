package burp;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class Zrvv extends Zrh7 implements ActionListener {
  private static int ZS;
  
  private static int ZW;
  
  private final JFileChooser ZK;
  
  private File ZH;
  
  private File[] ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrvv(Window paramWindow, String paramString1, int paramInt, FileFilter paramFileFilter, Zskm paramZskm, String paramString2, File paramFile, Zlfc paramZlfc) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: getstatic burp/Zzv7.FILE_CHOOSER_DIALOG : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: invokestatic Zd : ()I
    //   12: invokestatic isEventDispatchThread : ()Z
    //   15: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   18: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   21: aload_0
    //   22: invokevirtual Zv : ()V
    //   25: istore #9
    //   27: aload_0
    //   28: new javax/swing/JFileChooser
    //   31: dup
    //   32: aload #6
    //   34: invokespecial <init> : (Ljava/lang/String;)V
    //   37: putfield ZK : Ljavax/swing/JFileChooser;
    //   40: aload #7
    //   42: ifnull -> 54
    //   45: aload_0
    //   46: getfield ZK : Ljavax/swing/JFileChooser;
    //   49: aload #7
    //   51: invokevirtual setSelectedFile : (Ljava/io/File;)V
    //   54: aload_2
    //   55: ifnull -> 63
    //   58: aload_0
    //   59: aload_2
    //   60: invokevirtual setTitle : (Ljava/lang/String;)V
    //   63: iload_3
    //   64: ifne -> 87
    //   67: aload_0
    //   68: getfield ZK : Ljavax/swing/JFileChooser;
    //   71: iconst_0
    //   72: invokevirtual setDialogType : (I)V
    //   75: iload #9
    //   77: ifne -> 100
    //   80: iconst_5
    //   81: anewarray burp/Zbqc
    //   84: invokestatic Zr : ([Lburp/Zbqc;)V
    //   87: iload_3
    //   88: iconst_1
    //   89: if_icmpne -> 100
    //   92: aload_0
    //   93: getfield ZK : Ljavax/swing/JFileChooser;
    //   96: iconst_1
    //   97: invokevirtual setDialogType : (I)V
    //   100: aload #4
    //   102: ifnull -> 130
    //   105: aload_0
    //   106: getfield ZK : Ljavax/swing/JFileChooser;
    //   109: aload #4
    //   111: invokevirtual setFileFilter : (Ljavax/swing/filechooser/FileFilter;)V
    //   114: aload_0
    //   115: getfield ZK : Ljavax/swing/JFileChooser;
    //   118: iconst_1
    //   119: invokevirtual setMultiSelectionEnabled : (Z)V
    //   122: aload_0
    //   123: getfield ZK : Ljavax/swing/JFileChooser;
    //   126: iconst_0
    //   127: invokevirtual setAcceptAllFileFilterUsed : (Z)V
    //   130: aload_0
    //   131: getfield ZK : Ljavax/swing/JFileChooser;
    //   134: aload #8
    //   136: getfield Zj : I
    //   139: invokevirtual setFileSelectionMode : (I)V
    //   142: aload_0
    //   143: getfield ZK : Ljavax/swing/JFileChooser;
    //   146: aload_0
    //   147: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   150: aload_0
    //   151: aload_0
    //   152: getfield ZK : Ljavax/swing/JFileChooser;
    //   155: sipush #9059
    //   158: sipush #-8174
    //   161: invokestatic a : (II)Ljava/lang/String;
    //   164: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   167: aload #5
    //   169: ifnull -> 277
    //   172: new burp/Zbqc
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: astore #10
    //   181: aload #10
    //   183: new javax/swing/border/CompoundBorder
    //   186: dup
    //   187: new javax/swing/border/EmptyBorder
    //   190: dup
    //   191: bipush #10
    //   193: bipush #10
    //   195: bipush #10
    //   197: bipush #10
    //   199: invokespecial <init> : (IIII)V
    //   202: new javax/swing/border/CompoundBorder
    //   205: dup
    //   206: new javax/swing/border/MatteBorder
    //   209: dup
    //   210: iconst_1
    //   211: iconst_0
    //   212: iconst_0
    //   213: iconst_0
    //   214: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   217: invokespecial <init> : (IIIILjava/awt/Color;)V
    //   220: new javax/swing/border/EmptyBorder
    //   223: dup
    //   224: bipush #10
    //   226: iconst_0
    //   227: iconst_5
    //   228: iconst_0
    //   229: invokespecial <init> : (IIII)V
    //   232: invokespecial <init> : (Ljavax/swing/border/Border;Ljavax/swing/border/Border;)V
    //   235: invokespecial <init> : (Ljavax/swing/border/Border;Ljavax/swing/border/Border;)V
    //   238: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   241: aload #10
    //   243: aload #5
    //   245: invokeinterface ZA : ()Ljavax/swing/JComponent;
    //   250: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   253: pop
    //   254: aload_0
    //   255: aload #10
    //   257: sipush #9058
    //   260: sipush #-25772
    //   263: invokestatic a : (II)Ljava/lang/String;
    //   266: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   269: aload #5
    //   271: aload_0
    //   272: invokeinterface ZW : (Lburp/Zrvv;)V
    //   277: aload_0
    //   278: iconst_0
    //   279: invokevirtual setDefaultCloseOperation : (I)V
    //   282: aload_0
    //   283: new burp/Zbi3
    //   286: dup
    //   287: aload_0
    //   288: invokespecial <init> : (Lburp/Zrvv;)V
    //   291: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   294: aload_0
    //   295: new java/awt/Dimension
    //   298: dup
    //   299: getstatic burp/Zrvv.ZS : I
    //   302: getstatic burp/Zrvv.ZW : I
    //   305: invokespecial <init> : (II)V
    //   308: invokevirtual setPreferredSize : (Ljava/awt/Dimension;)V
    //   311: aload_0
    //   312: invokevirtual pack : ()V
    //   315: aload_1
    //   316: ifnull -> 324
    //   319: aload_0
    //   320: aload_1
    //   321: invokevirtual Zq : (Ljava/awt/Window;)V
    //   324: return
  }
  
  public File ZD() {
    return this.ZH;
  }
  
  public File[] ZX() {
    return this.ZL;
  }
  
  public int Zk() {
    return this.ZK.getFileSelectionMode();
  }
  
  public void Zo(int paramInt) {
    this.ZK.setFileSelectionMode(paramInt);
  }
  
  private void Zv() {
    setDefaultCloseOperation(2);
    pack();
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getActionCommand().equals(a(9056, -24831))) {
      this.ZH = this.ZK.getSelectedFile();
      this.ZL = this.ZK.getSelectedFiles();
    } 
    Zm();
  }
  
  private void Zm() {
    ZW = getHeight();
    ZS = getWidth();
    setVisible(false);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÿÔðp}z­ì°ôtkÆ"ål.£¯ªI='
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #123
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zrvv.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zrvv.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #113
    //   154: goto -> 184
    //   157: bipush #102
    //   159: goto -> 184
    //   162: bipush #65
    //   164: goto -> 184
    //   167: bipush #33
    //   169: goto -> 184
    //   172: bipush #101
    //   174: goto -> 184
    //   177: bipush #53
    //   179: goto -> 184
    //   182: bipush #98
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
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
    //   224: goto -> 38
    //   227: sipush #800
    //   230: putstatic burp/Zrvv.ZS : I
    //   233: sipush #600
    //   236: putstatic burp/Zrvv.ZW : I
    //   239: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2362) & 0xFFFF;
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
      char c = 'å';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */