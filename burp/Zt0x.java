package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zt0x extends Ztn0 implements Zku0, Zefs {
  private final Zkf3 Zi;
  
  private final boolean Zr;
  
  private final List<Zt4x> ZK;
  
  private final Set<Zrp0> Zl;
  
  private Zmnm Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zt0x(Zkf3 paramZkf3, boolean paramBoolean) {
    this.Zi = paramZkf3;
    this.Zr = paramBoolean;
    this.ZK = new ArrayList<>();
    this.Zl = new HashSet<>();
    this.Zf = new String[] { a(-13478, -31329), a(-13477, 26221), a(-13473, 19798), a(-13480, 29348), a(-13475, 9743), a(-13474, -12800), a(-13479, 10093) };
    int[] arrayOfInt = Ztpr.ZJx();
    this.ZV = new byte[] { 0, 0, 0, 100, 2, 0, 5 };
    this.Zc = new int[] { 38, 38, 20, 15, 9, 19, 18 };
    this.ZZ = 0;
    if (Zbqc.Zwu() == null)
      Ztpr.ZM(new int[5]); 
  }
  
  public void Zx(Zbws paramZbws) {
    super.Zx(paramZbws);
    paramZbws.setDefaultRenderer(Zbcj.class, new Zbcj());
  }
  
  public Class<?> getColumnClass(int paramInt) {
    return (paramInt == 3) ? Zbcj.class : super.getColumnClass(paramInt);
  }
  
  protected Comparator<?> ZS(int paramInt) {
    return (paramInt == 3) ? Comparator.naturalOrder() : super.ZS(paramInt);
  }
  
  public int getRowCount() {
    return this.ZK.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    if (paramInt1 < 0 || paramInt1 >= this.ZK.size())
      return ""; 
    Zt4x zt4x = this.ZK.get(paramInt1);
    switch (paramInt2) {
      case 0:
      
      case 1:
      
      case 2:
      
      case 3:
      
      case 4:
      
      case 5:
      
      case 6:
      
    } 
    return "";
  }
  
  public void ZC(Zmnm paramZmnm) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.Zd = paramZmnm;
    ZJ();
  }
  
  private void ZJ() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZK.clear();
    this.Zl.clear();
    if (this.Zd != null)
      this.Zd.ZOD().ZHV().forEach(this::lambda$showOutLinks$5); 
    fireTableDataChanged();
  }
  
  private void ZV(Zt4x paramZt4x, Zrp0 paramZrp0) {
    this.ZK.add(paramZt4x);
    this.Zl.add(paramZrp0);
  }
  
  public void Zx(Zrp0 paramZrp0) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zt0x;Lburp/Zrp0;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void ZD(Zl_ paramZl_, Zszw paramZszw, Zeu9 paramZeu9) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: <illegal opcode> run : (Lburp/Zt0x;Lburp/Zl_;Lburp/Zszw;Lburp/Zeu9;)Ljava/lang/Runnable;
    //   9: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   12: return
  }
  
  public void ZS(Zeu9 paramZeu9) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zt0x;Lburp/Zeu9;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  void Zp(Zmnm paramZmnm) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZOD : ()Lburp/Zeu9;
    //   6: astore_2
    //   7: aload_1
    //   8: invokeinterface ZOK : ()Lburp/Zszw;
    //   13: astore_3
    //   14: aload_0
    //   15: aload_2
    //   16: aload_3
    //   17: aload_1
    //   18: <illegal opcode> run : (Lburp/Zt0x;Lburp/Zeu9;Lburp/Zszw;Lburp/Zmnm;)Ljava/lang/Runnable;
    //   23: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   26: return
  }
  
  private Zt4x Zj(Zrp0 paramZrp0) {
    return new Zt4x(paramZrp0, null, null, Zl0.ZG(paramZrp0).ZJO(), "", "", null, 0, Zrlg.PENDING, 0L);
  }
  
  private Zt4x Zj(Zrp0 paramZrp0, Zszw paramZszw, Zeu9 paramZeu9) {
    return new Zt4x(paramZrp0, paramZeu9, paramZszw, Zl0.ZG(paramZrp0).ZJO(), paramZeu9.ZHk().<String>map(Object::toString).orElse(null), this.Zi.ZQ(paramZeu9), null, 0, Zrlg.SUPPRESSED, 0L);
  }
  
  private Zt4x Zy(Zrp0 paramZrp0, Zszw paramZszw, Zt8i paramZt8i) {
    return paramZt8i.Zsu().<Zt4x>Zc(new Zzw1(this, paramZrp0, paramZszw, paramZt8i));
  }
  
  private Zt4x ZT(Zrp0 paramZrp0, Zszw paramZszw, Zmnm paramZmnm) {
    Zeu9 zeu9 = paramZmnm.ZOD();
    List<Zgnc> list = paramZmnm.ZOQ();
    long l = list.isEmpty() ? 0L : ((Zgnc)list.getFirst()).Zz5();
    return new Zt4x(paramZrp0, zeu9, paramZszw, Zl0.ZG(paramZrp0).ZJO(), zeu9.ZHk().<String>map(Object::toString).orElse(""), paramZmnm.ZOZ(), paramZmnm.ZVj(this.Zr), list.size(), Zrlg.VISITED, l);
  }
  
  private void lambda$otherRoomIssuesChanged$12(Zeu9 paramZeu9, Zszw paramZszw, Zmnm paramZmnm) {
    // Byte code:
    //   0: invokestatic ZJx : ()[I
    //   3: astore #4
    //   5: iconst_0
    //   6: istore #5
    //   8: iload #5
    //   10: aload_0
    //   11: getfield ZK : Ljava/util/List;
    //   14: invokeinterface size : ()I
    //   19: if_icmpge -> 92
    //   22: aload_0
    //   23: getfield ZK : Ljava/util/List;
    //   26: iload #5
    //   28: invokeinterface get : (I)Ljava/lang/Object;
    //   33: checkcast burp/Zt4x
    //   36: astore #6
    //   38: aload #6
    //   40: aload_1
    //   41: aload_2
    //   42: invokevirtual Zo : (Lburp/Zeu9;Lburp/Zszw;)Z
    //   45: ifeq -> 84
    //   48: aload_0
    //   49: getfield ZK : Ljava/util/List;
    //   52: iload #5
    //   54: aload_0
    //   55: aload #6
    //   57: getfield ZA : Lburp/Zrp0;
    //   60: aload_2
    //   61: aload_3
    //   62: invokevirtual ZT : (Lburp/Zrp0;Lburp/Zszw;Lburp/Zmnm;)Lburp/Zt4x;
    //   65: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   70: pop
    //   71: aload_0
    //   72: iload #5
    //   74: iload #5
    //   76: invokevirtual fireTableRowsUpdated : (II)V
    //   79: aload #4
    //   81: ifnull -> 92
    //   84: iinc #5, 1
    //   87: aload #4
    //   89: ifnull -> 8
    //   92: return
  }
  
  private void lambda$doorwaysUpdated$11(Zeu9 paramZeu9) {
    if (this.Zd.ZOD().equals(paramZeu9))
      ZJ(); 
  }
  
  private void lambda$doorwayMatchedSignpostFingerprint$10(Zl_ paramZl_, Zszw paramZszw, Zeu9 paramZeu9) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zl : Ljava/util/Set;
    //   4: aload_1
    //   5: invokeinterface contains : (Ljava/lang/Object;)Z
    //   10: ifeq -> 60
    //   13: aload_0
    //   14: getfield ZK : Ljava/util/List;
    //   17: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   22: aload_1
    //   23: <illegal opcode> test : (Lburp/Zl_;)Ljava/util/function/Predicate;
    //   28: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   33: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   38: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   43: invokeinterface findFirst : ()Ljava/util/Optional;
    //   48: aload_0
    //   49: aload_1
    //   50: aload_2
    //   51: aload_3
    //   52: <illegal opcode> accept : (Lburp/Zt0x;Lburp/Zl_;Lburp/Zszw;Lburp/Zeu9;)Ljava/util/function/Consumer;
    //   57: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   60: return
  }
  
  private void lambda$doorwayMatchedSignpostFingerprint$9(Zl_ paramZl_, Zszw paramZszw, Zeu9 paramZeu9, Zt4x paramZt4x) {
    int i = this.ZK.indexOf(paramZt4x);
    this.ZK.set(i, Zj(paramZl_, paramZszw, paramZeu9));
    fireTableRowsUpdated(i, i);
  }
  
  private static boolean lambda$doorwayMatchedSignpostFingerprint$8(Zt4x paramZt4x) {
    return (paramZt4x.ZZ == null);
  }
  
  private static boolean lambda$doorwayMatchedSignpostFingerprint$7(Zl_ paramZl_, Zt4x paramZt4x) {
    return paramZt4x.ZA.ZF(paramZl_);
  }
  
  private void lambda$exitTraversed$6(Zrp0 paramZrp0) {
    if (this.Zl.contains(paramZrp0))
      ZJ(); 
  }
  
  private void lambda$showOutLinks$5(Zrp0 paramZrp0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zd : Lburp/Zmnm;
    //   4: invokeinterface ZOK : ()Lburp/Zszw;
    //   9: astore_3
    //   10: invokestatic ZJx : ()[I
    //   13: aload_1
    //   14: invokeinterface Znr : ()Ljava/util/Map;
    //   19: aload_3
    //   20: invokestatic emptyList : ()Ljava/util/List;
    //   23: invokeinterface getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   28: checkcast java/util/Collection
    //   31: astore #4
    //   33: astore_2
    //   34: aload #4
    //   36: invokeinterface isEmpty : ()Z
    //   41: ifeq -> 123
    //   44: aload_1
    //   45: instanceof burp/Zl_
    //   48: ifeq -> 123
    //   51: aload_1
    //   52: checkcast burp/Zl_
    //   55: astore #5
    //   57: aload #5
    //   59: invokeinterface Zfd : ()Lburp/Zzwo;
    //   64: aload_3
    //   65: invokeinterface Zd : (Ljava/lang/Object;)Lburp/Zgpi;
    //   70: checkcast burp/Zg8m
    //   73: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   76: aload #5
    //   78: <illegal opcode> apply : (Lburp/Zl_;)Ljava/util/function/Function;
    //   83: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   86: aload_0
    //   87: aload_1
    //   88: aload_3
    //   89: <illegal opcode> apply : (Lburp/Zt0x;Lburp/Zrp0;Lburp/Zszw;)Ljava/util/function/Function;
    //   94: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   97: aload_0
    //   98: aload_1
    //   99: <illegal opcode> get : (Lburp/Zt0x;Lburp/Zrp0;)Ljava/util/function/Supplier;
    //   104: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   107: checkcast burp/Zt4x
    //   110: astore #6
    //   112: aload_0
    //   113: aload #6
    //   115: aload_1
    //   116: invokevirtual ZV : (Lburp/Zt4x;Lburp/Zrp0;)V
    //   119: aload_2
    //   120: ifnull -> 165
    //   123: aload #4
    //   125: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   130: aload_0
    //   131: aload_1
    //   132: aload_3
    //   133: <illegal opcode> apply : (Lburp/Zt0x;Lburp/Zrp0;Lburp/Zszw;)Ljava/util/function/Function;
    //   138: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   143: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   148: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   153: aload_0
    //   154: aload_1
    //   155: <illegal opcode> accept : (Lburp/Zt0x;Lburp/Zrp0;)Ljava/util/function/Consumer;
    //   160: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   165: return
  }
  
  private void lambda$showOutLinks$4(Zrp0 paramZrp0, Zt4x paramZt4x) {
    ZV(paramZt4x, paramZrp0);
  }
  
  private Zt4x lambda$showOutLinks$3(Zrp0 paramZrp0, Zszw paramZszw, Zt8i paramZt8i) {
    return Zy(paramZrp0, paramZszw, paramZt8i);
  }
  
  private Zt4x lambda$showOutLinks$2(Zrp0 paramZrp0) {
    return Zj(paramZrp0);
  }
  
  private Zt4x lambda$showOutLinks$1(Zrp0 paramZrp0, Zszw paramZszw, Zeu9 paramZeu9) {
    return Zj(paramZrp0, paramZszw, paramZeu9);
  }
  
  private static Zeu9 lambda$showOutLinks$0(Zl_ paramZl_, Zg8m paramZg8m) {
    return paramZg8m.ZR(paramZl_);
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'M6Ðçús~ãWK6×\\nc%[|=4ò¯ÿ\\f%\\rÑ|S®¨ÍÈ®% ÎÔÏ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #19
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
    //   68: ldc 'êÐeÎ»h\\bVÃEm8Â'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #92
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
    //   129: putstatic burp/Zt0x.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt0x.b : [Ljava/lang/String;
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
    //   212: bipush #20
    //   214: goto -> 244
    //   217: bipush #71
    //   219: goto -> 244
    //   222: bipush #53
    //   224: goto -> 244
    //   227: bipush #101
    //   229: goto -> 244
    //   232: bipush #94
    //   234: goto -> 244
    //   237: bipush #67
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
    int i = (paramInt1 ^ 0xFFFFCB5B) & 0xFFFF;
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
      byte b1 = 67;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt0x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */