package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import javax.swing.JMenuItem;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zm2j extends Zm9t {
  private static final Ze9n Zv;
  
  private final Zbws ZX;
  
  private final List<Zepe> Zy;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zm2j(Zbws paramZbws) {
    this.ZX = paramZbws;
    this.Zy = new ArrayList<>();
    ZE(Ze3m.ZC(Zeuf.OPTIONS, Zlkk.ICON_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).Z_(), b(-21439, -14139), this::lambda$new$0);
    setName(b(-21433, -3355));
    setOpaque(false);
  }
  
  public void ZY(Zepe paramZepe) {
    this.Zy.add(paramZepe);
  }
  
  public void updateUI() {
    super.updateUI();
    boolean bool = Zm99.ZQ();
    if (this.Zy != null)
      for (Zepe zepe : this.Zy) {
        zepe.updateUI();
        if (bool)
          break; 
      }  
  }
  
  private void ZK() {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: new burp/Zkj9
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_2
    //   11: istore_1
    //   12: aload_2
    //   13: sipush #-21436
    //   16: sipush #-31641
    //   19: invokestatic b : (II)Ljava/lang/String;
    //   22: invokevirtual setName : (Ljava/lang/String;)V
    //   25: aload_0
    //   26: getfield Zy : Ljava/util/List;
    //   29: invokeinterface isEmpty : ()Z
    //   34: ifeq -> 67
    //   37: aload_0
    //   38: aload_2
    //   39: dup
    //   40: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   43: pop
    //   44: <illegal opcode> accept : (Lburp/Zkj9;)Ljava/util/function/Consumer;
    //   49: aload_2
    //   50: dup
    //   51: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: pop
    //   55: <illegal opcode> accept : (Lburp/Zkj9;)Ljava/util/function/Consumer;
    //   60: invokevirtual ZP : (Ljava/util/function/Consumer;Ljava/util/function/Consumer;)V
    //   63: iload_1
    //   64: ifeq -> 167
    //   67: new burp/Zztv
    //   70: dup
    //   71: sipush #-21435
    //   74: sipush #2464
    //   77: invokestatic b : (II)Ljava/lang/String;
    //   80: invokespecial <init> : (Ljava/lang/String;)V
    //   83: astore_3
    //   84: aload_3
    //   85: getstatic burp/Zm2j.Zv : Lburp/Ze9n;
    //   88: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   91: aload_0
    //   92: aload_3
    //   93: dup
    //   94: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   97: pop
    //   98: <illegal opcode> accept : (Lburp/Zztv;)Ljava/util/function/Consumer;
    //   103: aload_3
    //   104: dup
    //   105: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   108: pop
    //   109: <illegal opcode> accept : (Lburp/Zztv;)Ljava/util/function/Consumer;
    //   114: invokevirtual ZP : (Ljava/util/function/Consumer;Ljava/util/function/Consumer;)V
    //   117: aload_2
    //   118: aload_3
    //   119: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   122: pop
    //   123: aload_0
    //   124: getfield Zy : Ljava/util/List;
    //   127: invokeinterface iterator : ()Ljava/util/Iterator;
    //   132: astore #4
    //   134: aload #4
    //   136: invokeinterface hasNext : ()Z
    //   141: ifeq -> 167
    //   144: aload #4
    //   146: invokeinterface next : ()Ljava/lang/Object;
    //   151: checkcast burp/Zepe
    //   154: astore #5
    //   156: aload_2
    //   157: aload #5
    //   159: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   162: pop
    //   163: iload_1
    //   164: ifeq -> 134
    //   167: aload_2
    //   168: aload_0
    //   169: aload_0
    //   170: invokevirtual getX : ()I
    //   173: aload_0
    //   174: invokevirtual getY : ()I
    //   177: invokevirtual show : (Ljava/awt/Component;II)V
    //   180: return
  }
  
  private void ZP(Consumer<JMenuItem> paramConsumer, Consumer<Component> paramConsumer1) {
    Zmub<?> zmub = (Zmub)this.ZX.getModel();
    boolean bool = Zm99.ZQ();
    byte b = 0;
    while (b < zmub.getColumnCount()) {
      Optional<JMenuItem> optional = zmub.Zl(b) ? Ze(zmub, b) : ZA(zmub, b);
      optional.ifPresent(paramConsumer);
      b++;
      if (bool)
        break; 
    } 
    Zem9 zem9 = new Zem9();
    paramConsumer1.accept(zem9);
    Zepe zepe = new Zepe(b(-21440, 17708));
    zepe.setIcon(Ze3m.ZC(Zeuf.RESTORE_DEFAULTS, Zlkk.ICON_NORMAL).Z_());
    zepe.addActionListener(this::lambda$populateTableLayoutMenu$1);
    paramConsumer.accept(zepe);
  }
  
  private Optional<JMenuItem> ZA(Zmub<?> paramZmub, int paramInt) {
    if (paramZmub.ZU(paramInt)) {
      String str = paramZmub.getColumnName(paramInt);
      return Optional.of(Zh(str, paramInt));
    } 
    return Optional.empty();
  }
  
  private Optional<JMenuItem> Ze(Zmub<?> paramZmub, int paramInt) {
    // Byte code:
    //   0: sipush #-21434
    //   3: sipush #25404
    //   6: invokestatic b : (II)Ljava/lang/String;
    //   9: iconst_1
    //   10: anewarray java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_1
    //   16: iload_2
    //   17: invokevirtual getColumnName : (I)Ljava/lang/String;
    //   20: aastore
    //   21: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   24: astore_3
    //   25: aload_0
    //   26: getfield ZX : Lburp/Zbws;
    //   29: invokevirtual getTableHeader : ()Ljavax/swing/table/JTableHeader;
    //   32: astore #5
    //   34: aload #5
    //   36: instanceof burp/Zmo5
    //   39: ifeq -> 128
    //   42: aload #5
    //   44: checkcast burp/Zmo5
    //   47: astore #4
    //   49: aload #4
    //   51: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   54: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   59: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   62: aload_0
    //   63: iload_2
    //   64: <illegal opcode> apply : (Lburp/Zm2j;I)Ljava/util/function/Function;
    //   69: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   72: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   77: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   80: checkcast java/util/List
    //   83: astore #5
    //   85: aload #5
    //   87: invokeinterface isEmpty : ()Z
    //   92: ifne -> 128
    //   95: aload_0
    //   96: aload_3
    //   97: iload_2
    //   98: invokevirtual Z_ : (Ljava/lang/String;I)Lburp/Zztv;
    //   101: astore #6
    //   103: aload #5
    //   105: aload #6
    //   107: dup
    //   108: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   111: pop
    //   112: <illegal opcode> accept : (Lburp/Zztv;)Ljava/util/function/Consumer;
    //   117: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   122: aload #6
    //   124: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   127: areturn
    //   128: aload_0
    //   129: aload_3
    //   130: iload_2
    //   131: invokevirtual Zh : (Ljava/lang/String;I)Lburp/Zepe;
    //   134: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   137: areturn
  }
  
  private Zepe Zh(String paramString, int paramInt) {
    Zepe zepe = new Zepe(paramString, false);
    zepe.setName(paramString);
    Zp(zepe, paramInt);
    return zepe;
  }
  
  private Zztv Z_(String paramString, int paramInt) {
    Zztv zztv = new Zztv(paramString, false);
    zztv.setName(paramString);
    Zp(zztv, paramInt);
    return zztv;
  }
  
  private void Zp(JMenuItem paramJMenuItem, int paramInt) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicBoolean
    //   3: dup
    //   4: aload_0
    //   5: getfield ZX : Lburp/Zbws;
    //   8: iload_2
    //   9: invokevirtual convertColumnIndexToView : (I)I
    //   12: iconst_m1
    //   13: if_icmpeq -> 20
    //   16: iconst_1
    //   17: goto -> 21
    //   20: iconst_0
    //   21: invokespecial <init> : (Z)V
    //   24: astore_3
    //   25: aload_1
    //   26: aload_3
    //   27: invokevirtual get : ()Z
    //   30: ifeq -> 42
    //   33: getstatic burp/Zgzq.CHECK_BOX_SELECTED : Lburp/Zgzq;
    //   36: invokevirtual ZD : ()Ljavax/swing/ImageIcon;
    //   39: goto -> 48
    //   42: getstatic burp/Zgzq.CHECK_BOX : Lburp/Zgzq;
    //   45: invokevirtual ZD : ()Ljavax/swing/ImageIcon;
    //   48: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   51: aload_1
    //   52: aload_0
    //   53: aload_3
    //   54: aload_1
    //   55: iload_2
    //   56: <illegal opcode> actionPerformed : (Lburp/Zm2j;Ljava/util/concurrent/atomic/AtomicBoolean;Ljavax/swing/JMenuItem;I)Ljava/awt/event/ActionListener;
    //   61: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   64: return
  }
  
  private void lambda$initialiseColumnMenuItem$3(AtomicBoolean paramAtomicBoolean, JMenuItem paramJMenuItem, int paramInt, ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore #5
    //   5: aload_1
    //   6: aload_1
    //   7: invokevirtual get : ()Z
    //   10: ifne -> 17
    //   13: iconst_1
    //   14: goto -> 18
    //   17: iconst_0
    //   18: invokevirtual set : (Z)V
    //   21: aload_1
    //   22: invokevirtual get : ()Z
    //   25: ifeq -> 97
    //   28: aload_2
    //   29: getstatic burp/Zgzq.CHECK_BOX_SELECTED : Lburp/Zgzq;
    //   32: invokevirtual ZD : ()Ljavax/swing/ImageIcon;
    //   35: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   38: aload_0
    //   39: getfield ZX : Lburp/Zbws;
    //   42: invokevirtual getColumnModel : ()Ljavax/swing/table/TableColumnModel;
    //   45: astore #7
    //   47: aload #7
    //   49: instanceof burp/Zrmn
    //   52: ifeq -> 92
    //   55: aload #7
    //   57: checkcast burp/Zrmn
    //   60: astore #6
    //   62: aload #6
    //   64: iload_3
    //   65: invokeinterface ZW : (I)V
    //   70: getstatic burp/Zee4.TABLE_COLUMN_SHOWN : Lburp/Zee4;
    //   73: aload_0
    //   74: getfield ZX : Lburp/Zbws;
    //   77: invokevirtual getName : ()Ljava/lang/String;
    //   80: aload_2
    //   81: invokevirtual getName : ()Ljava/lang/String;
    //   84: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   89: invokestatic ZB : (Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   92: iload #5
    //   94: ifeq -> 172
    //   97: aload_0
    //   98: getfield ZX : Lburp/Zbws;
    //   101: iload_3
    //   102: invokevirtual convertColumnIndexToView : (I)I
    //   105: istore #6
    //   107: aload_0
    //   108: getfield ZX : Lburp/Zbws;
    //   111: invokevirtual getColumnModel : ()Ljavax/swing/table/TableColumnModel;
    //   114: astore #8
    //   116: aload #8
    //   118: instanceof burp/Zrmn
    //   121: ifeq -> 162
    //   124: aload #8
    //   126: checkcast burp/Zrmn
    //   129: astore #7
    //   131: aload #7
    //   133: iload #6
    //   135: invokeinterface ZK : (I)V
    //   140: getstatic burp/Zee4.TABLE_COLUMN_HIDDEN_CONTROL_MENU : Lburp/Zee4;
    //   143: aload_0
    //   144: getfield ZX : Lburp/Zbws;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: aload_2
    //   151: invokevirtual getName : ()Ljava/lang/String;
    //   154: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   159: invokestatic ZB : (Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   162: aload_2
    //   163: getstatic burp/Zgzq.CHECK_BOX : Lburp/Zgzq;
    //   166: invokevirtual ZD : ()Ljavax/swing/ImageIcon;
    //   169: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   172: aload_2
    //   173: iconst_0
    //   174: invokevirtual setSelected : (Z)V
    //   177: return
  }
  
  private List lambda$createCustomColumnMenuItem$2(int paramInt, Zx8i paramZx8i) {
    return paramZx8i.ZI(this.ZX, paramInt);
  }
  
  private void lambda$populateTableLayoutMenu$1(ActionEvent paramActionEvent) {
    this.ZX.ZE();
    Zuh.Zb((this.ZX.getName() != null), Zqf.Zr);
    if (this.ZX.getName() != null)
      Zm2.ZB(Zee4.TABLE_RESET, this.ZX.getName()); 
  }
  
  private void lambda$new$0(MouseEvent paramMouseEvent) {
    ZK();
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' ðâÀ´Cþü!¿§7Õ8¨ó÷÷;µú\\f LÓßù¶ 5,på5÷;D8E;·!%uÏ,6.'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #100
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
    //   68: ldc 'MazØÌZeÒÈz®K¸xE_ßèk'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #55
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
    //   129: putstatic burp/Zm2j.c : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm2j.d : [Ljava/lang/String;
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
    //   212: bipush #77
    //   214: goto -> 244
    //   217: bipush #93
    //   219: goto -> 244
    //   222: bipush #25
    //   224: goto -> 244
    //   227: bipush #67
    //   229: goto -> 244
    //   232: bipush #94
    //   234: goto -> 244
    //   237: bipush #11
    //   239: goto -> 244
    //   242: bipush #42
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
    //   300: getstatic burp/Zeuf.LAYOUT : Lburp/Zeuf;
    //   303: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   306: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   309: invokevirtual Z_ : ()Lburp/Ze9n;
    //   312: putstatic burp/Zm2j.Zv : Lburp/Ze9n;
    //   315: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAC45) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 28;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */