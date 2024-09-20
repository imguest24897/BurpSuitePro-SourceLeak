package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zc5;
import net.portswigger.browser.Zd_;

class Zsbp {
  private final Zbws ZX = new Zbwm(this, this.ZB);
  
  private final ObservableList<Zt6y> Zg = FXCollections.observableArrayList();
  
  private final Zmuk ZB = new Zmuk(this.Zg);
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsbp(Zr94 paramZr94, Zk2k paramZk2k) {
    this.ZX.setName(a(-15027, -28945));
    this.ZX.addMouseListener(new Zlst(this, paramZr94));
    this.ZX.setTableHeader((JTableHeader)null);
    this.ZX.setRowHeight((int)(Zrt.Zx() * 3.0F));
    this.ZX.setSelectionMode(0);
    KeyStroke keyStroke = KeyStroke.getKeyStroke(86, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx());
    this.ZX.getInputMap(0).put(keyStroke, a(-15037, 7689));
    this.ZX.getActionMap().put(a(-15025, 13544), new Zmvh(this, paramZk2k, paramZr94));
    this.ZX.setRowSorter(new Zm4o<>(this.ZB));
  }
  
  public void ZW(Zc5 paramZc5) {
    this.Zg.clear();
    paramZc5.forEach(this::lambda$setEvents$0);
  }
  
  public int Zm(int paramInt1, int paramInt2) {
    Point point = new Point(paramInt1, paramInt2);
    return this.ZX.convertRowIndexToModel(this.ZX.rowAtPoint(point));
  }
  
  public void ZR() {
    SwingUtilities.invokeLater(this::lambda$selectFirst$1);
  }
  
  public void ZZ() {
    this.Zg.clear();
  }
  
  private static Zt6y ZU(Zd_ paramZd_) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5: pop
    //   6: astore_1
    //   7: iconst_0
    //   8: istore_2
    //   9: aload_1
    //   10: iload_2
    //   11: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   16: tableswitch default -> 52, 0 -> 66, 1 -> 116, 2 -> 185, 3 -> 225, 4 -> 277
    //   52: new java/lang/MatchException
    //   55: dup
    //   56: aconst_null
    //   57: aconst_null
    //   58: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   61: athrow
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload_1
    //   67: checkcast net/portswigger/browser/Zj3
    //   70: astore_3
    //   71: new burp/Zt6y
    //   74: dup
    //   75: aload_0
    //   76: aload_3
    //   77: invokevirtual Zq : ()Lnet/portswigger/browser/Zjp;
    //   80: invokestatic Zw : (Lnet/portswigger/browser/Zjp;)Lnet/portswigger/browser/Zeo;
    //   83: aload_3
    //   84: invokevirtual Zq : ()Lnet/portswigger/browser/Zjp;
    //   87: invokeinterface ZG : (Lnet/portswigger/browser/Zjp;)Ljava/lang/String;
    //   92: sipush #-15030
    //   95: sipush #-24668
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: swap
    //   102: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   107: getstatic burp/Zeuf.MOUSE_POINTER : Lburp/Zeuf;
    //   110: invokespecial <init> : (Lnet/portswigger/browser/Zd_;Ljava/lang/String;Lburp/Zeuf;)V
    //   113: goto -> 327
    //   116: aload_1
    //   117: checkcast net/portswigger/browser/Zjr
    //   120: astore #4
    //   122: new burp/Zt6y
    //   125: dup
    //   126: aload_0
    //   127: aload #4
    //   129: invokevirtual Zn : ()Ljava/lang/String;
    //   132: aload #4
    //   134: invokevirtual Zq : ()Lnet/portswigger/browser/Zjp;
    //   137: invokestatic Zw : (Lnet/portswigger/browser/Zjp;)Lnet/portswigger/browser/Zeo;
    //   140: aload #4
    //   142: invokevirtual Zq : ()Lnet/portswigger/browser/Zjp;
    //   145: invokeinterface ZG : (Lnet/portswigger/browser/Zjp;)Ljava/lang/String;
    //   150: sipush #-15031
    //   153: sipush #1454
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: dup_x2
    //   160: pop
    //   161: sipush #-15026
    //   164: sipush #-14957
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: swap
    //   171: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   176: getstatic burp/Zeuf.TYPING : Lburp/Zeuf;
    //   179: invokespecial <init> : (Lnet/portswigger/browser/Zd_;Ljava/lang/String;Lburp/Zeuf;)V
    //   182: goto -> 327
    //   185: aload_1
    //   186: checkcast net/portswigger/browser/Zjx
    //   189: astore #5
    //   191: new burp/Zt6y
    //   194: dup
    //   195: aload_0
    //   196: aload #5
    //   198: invokevirtual Zj : ()Ljava/lang/String;
    //   201: sipush #-15032
    //   204: sipush #-11751
    //   207: invokestatic a : (II)Ljava/lang/String;
    //   210: swap
    //   211: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   216: getstatic burp/Zeuf.WEBSITE : Lburp/Zeuf;
    //   219: invokespecial <init> : (Lnet/portswigger/browser/Zd_;Ljava/lang/String;Lburp/Zeuf;)V
    //   222: goto -> 327
    //   225: aload_1
    //   226: checkcast net/portswigger/browser/Zjz
    //   229: astore #6
    //   231: new burp/Zt6y
    //   234: dup
    //   235: aload_0
    //   236: aload #6
    //   238: invokevirtual ZP : ()Lnet/portswigger/browser/Za;
    //   241: getfield keyString : Ljava/lang/String;
    //   244: sipush #-15040
    //   247: sipush #8014
    //   250: invokestatic a : (II)Ljava/lang/String;
    //   253: swap
    //   254: sipush #-15039
    //   257: sipush #22060
    //   260: invokestatic a : (II)Ljava/lang/String;
    //   263: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   268: getstatic burp/Zeuf.HAND_POINTER : Lburp/Zeuf;
    //   271: invokespecial <init> : (Lnet/portswigger/browser/Zd_;Ljava/lang/String;Lburp/Zeuf;)V
    //   274: goto -> 327
    //   277: aload_1
    //   278: checkcast net/portswigger/browser/Zjf
    //   281: astore #7
    //   283: new burp/Zt6y
    //   286: dup
    //   287: aload_0
    //   288: aload #7
    //   290: invokevirtual Zo : ()Ljava/time/Duration;
    //   293: invokevirtual toMillis : ()J
    //   296: sipush #-15029
    //   299: sipush #-8246
    //   302: invokestatic a : (II)Ljava/lang/String;
    //   305: dup_x2
    //   306: pop
    //   307: sipush #-15028
    //   310: sipush #30681
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;JLjava/lang/String;)Ljava/lang/String;
    //   321: getstatic burp/Zeuf.CLOCK : Lburp/Zeuf;
    //   324: invokespecial <init> : (Lnet/portswigger/browser/Zd_;Ljava/lang/String;Lburp/Zeuf;)V
    //   327: areturn
    // Exception table:
    //   from	to	target	type
    //   9	62	62	java/lang/MatchException
  }
  
  void Zl(int paramInt, Zd_ paramZd_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Ljavafx/collections/ObservableList;
    //   4: iload_1
    //   5: aload_2
    //   6: invokestatic ZU : (Lnet/portswigger/browser/Zd_;)Lburp/Zt6y;
    //   9: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   14: pop
    //   15: aload_0
    //   16: iload_1
    //   17: <illegal opcode> run : (Lburp/Zsbp;I)Ljava/lang/Runnable;
    //   22: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   25: return
  }
  
  void ZK(int paramInt, Zd_ paramZd_, boolean paramBoolean) {
    try {
      if (paramBoolean)
        this.ZX.getModel().addTableModelListener(new Zsuc(this, paramInt)); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    this.Zg.add(paramInt, ZU(paramZd_));
  }
  
  private static boolean Zb(TableModelEvent paramTableModelEvent) {
    try {
      if (paramTableModelEvent.getFirstRow() == 0)
        try {
          if (paramTableModelEvent.getLastRow() == Integer.MAX_VALUE)
            try {
              if (paramTableModelEvent.getType() == 0);
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  public void Zv(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield Zg : Ljavafx/collections/ObservableList;
    //   5: invokeinterface size : ()I
    //   10: iconst_1
    //   11: isub
    //   12: if_icmpne -> 23
    //   15: iconst_1
    //   16: goto -> 24
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: getfield Zg : Ljavafx/collections/ObservableList;
    //   29: iload_1
    //   30: invokeinterface remove : (I)Ljava/lang/Object;
    //   35: pop
    //   36: aload_0
    //   37: getfield Zg : Ljavafx/collections/ObservableList;
    //   40: invokeinterface isEmpty : ()Z
    //   45: ifne -> 81
    //   48: iload_2
    //   49: ifeq -> 69
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: iload_1
    //   60: iconst_1
    //   61: isub
    //   62: goto -> 70
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: iload_1
    //   70: istore_3
    //   71: aload_0
    //   72: iload_3
    //   73: <illegal opcode> run : (Lburp/Zsbp;I)Ljava/lang/Runnable;
    //   78: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   81: return
    // Exception table:
    //   from	to	target	type
    //   0	19	19	java/lang/MatchException
    //   25	52	55	java/lang/MatchException
    //   48	65	65	java/lang/MatchException
  }
  
  public Component ZY() {
    return this.ZX;
  }
  
  public int Zi() {
    return this.ZX.convertRowIndexToModel(this.ZX.getSelectedRow());
  }
  
  public Zt6y ZF(int paramInt) {
    return this.ZB.ZW(paramInt);
  }
  
  private static void Zn(Zk2k paramZk2k) {
    try {
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      Transferable transferable = clipboard.getContents(null);
      try {
        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
          String str = (String)transferable.getTransferData(DataFlavor.stringFlavor);
          paramZk2k.Zp(str, false);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  private void lambda$updateEntryAtIndex$2(int paramInt) {
    this.ZX.setRowSelectionInterval(paramInt, paramInt);
  }
  
  private void lambda$selectFirst$1() {
    this.ZX.getSelectionModel().setSelectionInterval(0, 0);
  }
  
  private void lambda$setEvents$0(Zd_ paramZd_) {
    this.Zg.add(ZU(paramZd_));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '%tÂ\\f6É¯b¤GA³^Sÿ>\\tæêøÑ~Á\\têÕGQéi#"?Ù%ñLo\<õ¡¼:" 9~ne{ôKÁ\>sPÍ\\b]Â=Æiå@úþ!ãI|Ë³¯¢'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #83
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
    //   68: ldc 'Ð´'<J@S#¶\\b'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #110
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
    //   129: putstatic burp/Zsbp.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zsbp.b : [Ljava/lang/String;
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
    //   212: bipush #44
    //   214: goto -> 244
    //   217: bipush #59
    //   219: goto -> 244
    //   222: bipush #36
    //   224: goto -> 244
    //   227: bipush #33
    //   229: goto -> 244
    //   232: bipush #51
    //   234: goto -> 244
    //   237: bipush #51
    //   239: goto -> 244
    //   242: bipush #117
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
    int i = (paramInt1 ^ 0xFFFFC549) & 0xFFFF;
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
      char c = 'Û';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */