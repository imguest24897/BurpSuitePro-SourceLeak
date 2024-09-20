package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.text.BadLocationException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgr7 implements PropertyChangeListener {
  private final Zmgn Zl;
  
  private final MouseAdapter Zj;
  
  private final KeyAdapter ZI;
  
  private boolean ZT = true;
  
  private boolean Zo = true;
  
  private boolean ZQ = true;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgr7(Zmgn paramZmgn) {
    this.Zl = paramZmgn;
    this.Zj = new Zmxa(this);
    this.ZI = new Zgbn(this);
    ZA();
  }
  
  private void ZC() {
    this.ZT = true;
    this.Zo = true;
    this.ZQ = true;
  }
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    boolean bool1 = a(-568, 31225).equals(this.Zl.ZV());
    boolean bool2 = this.Zl.Zb();
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    if (bool1 && bool2) {
      ZM();
      this.Zl.addKeyListener(this.ZI);
      this.Zl.addMouseListener(this.Zj);
      if (arrayOfZbqc != null) {
        ZU();
        this.Zl.removeKeyListener(this.ZI);
        this.Zl.removeMouseListener(this.Zj);
        return;
      } 
      return;
    } 
    ZU();
    this.Zl.removeKeyListener(this.ZI);
    this.Zl.removeMouseListener(this.Zj);
  }
  
  private void ZA() {
    ActionMap actionMap = this.Zl.getActionMap();
    actionMap.put(a(-567, 20734), new Zbo1(this));
    actionMap.put(a(-563, 8061), new Zbxz(this));
    actionMap.put(a(-572, -20989), new Zrrg(this));
    actionMap.put(a(-561, -18027), new Zkeh(this));
    actionMap.put(a(-566, -27971), new Zs2y(this));
    actionMap.put(a(-575, -22843), new Zrmz(this));
  }
  
  private void ZU() {
    InputMap inputMap = this.Zl.getInputMap();
    inputMap.remove(KeyStroke.getKeyStroke('{'));
    inputMap.remove(KeyStroke.getKeyStroke('}'));
    inputMap.remove(KeyStroke.getKeyStroke('['));
    inputMap.remove(KeyStroke.getKeyStroke(']'));
    inputMap.remove(KeyStroke.getKeyStroke('"'));
    inputMap.put(KeyStroke.getKeyStroke(8, 0), a(-562, -28016));
  }
  
  private void ZM() {
    InputMap inputMap = this.Zl.getInputMap();
    inputMap.put(KeyStroke.getKeyStroke('{'), a(-564, 13539));
    inputMap.put(KeyStroke.getKeyStroke('}'), a(-574, -29187));
    inputMap.put(KeyStroke.getKeyStroke('['), a(-565, -25655));
    inputMap.put(KeyStroke.getKeyStroke(']'), a(-569, -27169));
    inputMap.put(KeyStroke.getKeyStroke('"'), a(-576, -24692));
    inputMap.put(KeyStroke.getKeyStroke(8, 0), a(-570, -7591));
  }
  
  private char ZT(int paramInt) {
    try {
      try {
        if (paramInt >= 0 && paramInt < this.Zl.getText().length())
          return this.Zl.getText(paramInt, 1).charAt(0); 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
    return Character.MIN_VALUE;
  }
  
  private int ZQ(int paramInt, char paramChar1, char paramChar2, char paramChar3, char paramChar4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zl : Lburp/Zmgn;
    //   4: invokevirtual getText : ()Ljava/lang/String;
    //   7: astore #7
    //   9: invokestatic ZR : ()[Lburp/Zbqc;
    //   12: aload_0
    //   13: getfield Zl : Lburp/Zmgn;
    //   16: invokevirtual getSelectionStart : ()I
    //   19: istore #8
    //   21: aload_0
    //   22: getfield Zl : Lburp/Zmgn;
    //   25: invokevirtual getSelectionEnd : ()I
    //   28: istore #9
    //   30: aload #7
    //   32: iload_1
    //   33: iload #8
    //   35: invokestatic ZI : (Ljava/lang/String;II)Z
    //   38: istore #10
    //   40: aload #7
    //   42: iload #4
    //   44: iload #5
    //   46: iload #8
    //   48: invokestatic ZR : (Ljava/lang/String;CCI)I
    //   51: istore #11
    //   53: iload #11
    //   55: iload_1
    //   56: invokestatic max : (II)I
    //   59: istore #12
    //   61: astore #6
    //   63: iload #11
    //   65: iload #12
    //   67: if_icmpne -> 109
    //   70: aload #7
    //   72: iload_1
    //   73: iload #5
    //   75: iload #9
    //   77: iload #8
    //   79: iload #9
    //   81: invokestatic Zh : (Ljava/lang/String;ICIII)I
    //   84: istore #14
    //   86: iload #14
    //   88: iconst_m1
    //   89: if_icmpeq -> 97
    //   92: iload #14
    //   94: goto -> 102
    //   97: aload #7
    //   99: invokevirtual length : ()I
    //   102: istore #13
    //   104: aload #6
    //   106: ifnull -> 116
    //   109: aload #7
    //   111: invokevirtual length : ()I
    //   114: istore #13
    //   116: iconst_0
    //   117: istore #14
    //   119: iload #12
    //   121: istore #15
    //   123: iload #15
    //   125: iload #8
    //   127: if_icmpge -> 229
    //   130: iload #15
    //   132: ifeq -> 149
    //   135: aload #7
    //   137: iload #15
    //   139: iconst_1
    //   140: isub
    //   141: invokevirtual charAt : (I)C
    //   144: bipush #92
    //   146: if_icmpeq -> 221
    //   149: aload #7
    //   151: iload #15
    //   153: invokevirtual charAt : (I)C
    //   156: bipush #34
    //   158: if_icmpne -> 178
    //   161: iload #10
    //   163: ifne -> 170
    //   166: iconst_1
    //   167: goto -> 171
    //   170: iconst_0
    //   171: istore #10
    //   173: aload #6
    //   175: ifnull -> 221
    //   178: aload #7
    //   180: iload #15
    //   182: invokevirtual charAt : (I)C
    //   185: iload_2
    //   186: if_icmpne -> 202
    //   189: iload #10
    //   191: ifne -> 202
    //   194: iinc #14, 1
    //   197: aload #6
    //   199: ifnull -> 221
    //   202: aload #7
    //   204: iload #15
    //   206: invokevirtual charAt : (I)C
    //   209: iload_3
    //   210: if_icmpne -> 221
    //   213: iload #10
    //   215: ifne -> 221
    //   218: iinc #14, -1
    //   221: iinc #15, 1
    //   224: aload #6
    //   226: ifnull -> 123
    //   229: iload #9
    //   231: istore #15
    //   233: iload #15
    //   235: iload #13
    //   237: if_icmpge -> 339
    //   240: iload #15
    //   242: ifeq -> 259
    //   245: aload #7
    //   247: iload #15
    //   249: iconst_1
    //   250: isub
    //   251: invokevirtual charAt : (I)C
    //   254: bipush #92
    //   256: if_icmpeq -> 331
    //   259: aload #7
    //   261: iload #15
    //   263: invokevirtual charAt : (I)C
    //   266: bipush #34
    //   268: if_icmpne -> 288
    //   271: iload #10
    //   273: ifne -> 280
    //   276: iconst_1
    //   277: goto -> 281
    //   280: iconst_0
    //   281: istore #10
    //   283: aload #6
    //   285: ifnull -> 331
    //   288: aload #7
    //   290: iload #15
    //   292: invokevirtual charAt : (I)C
    //   295: iload_2
    //   296: if_icmpne -> 312
    //   299: iload #10
    //   301: ifne -> 312
    //   304: iinc #14, 1
    //   307: aload #6
    //   309: ifnull -> 331
    //   312: aload #7
    //   314: iload #15
    //   316: invokevirtual charAt : (I)C
    //   319: iload_3
    //   320: if_icmpne -> 331
    //   323: iload #10
    //   325: ifne -> 331
    //   328: iinc #14, -1
    //   331: iinc #15, 1
    //   334: aload #6
    //   336: ifnull -> 233
    //   339: iload #14
    //   341: ireturn
  }
  
  private static int ZX(String paramString) {
    String str = a(-571, 4251);
    int i = paramString.indexOf(str);
    if (i == -1) {
      str = a(-573, 28274);
      i = paramString.indexOf(str);
    } 
    return (i != -1) ? (i + str.length()) : -1;
  }
  
  private static boolean ZI(String paramString, int paramInt1, int paramInt2) {
    boolean bool = false;
    int i = paramInt1;
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    while (i < paramInt2) {
      if (i > 0 && paramString.charAt(i - 1) != '\\' && paramString.charAt(i) == '"')
        bool = !bool ? true : false; 
      i++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return bool;
  }
  
  private static int ZR(String paramString, char paramChar1, char paramChar2, int paramInt) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_0
    //   6: ifnull -> 13
    //   9: iload_3
    //   10: ifgt -> 15
    //   13: iconst_m1
    //   14: ireturn
    //   15: aload_0
    //   16: iconst_0
    //   17: iload_3
    //   18: invokestatic ZI : (Ljava/lang/String;II)Z
    //   21: istore #5
    //   23: iconst_0
    //   24: istore #6
    //   26: iload_3
    //   27: iconst_1
    //   28: isub
    //   29: istore #7
    //   31: iload #7
    //   33: iflt -> 131
    //   36: iload #7
    //   38: ifle -> 77
    //   41: aload_0
    //   42: iload #7
    //   44: iconst_1
    //   45: isub
    //   46: invokevirtual charAt : (I)C
    //   49: bipush #92
    //   51: if_icmpeq -> 77
    //   54: aload_0
    //   55: iload #7
    //   57: invokevirtual charAt : (I)C
    //   60: bipush #34
    //   62: if_icmpne -> 77
    //   65: iload #5
    //   67: ifne -> 74
    //   70: iconst_1
    //   71: goto -> 75
    //   74: iconst_0
    //   75: istore #5
    //   77: aload_0
    //   78: iload #7
    //   80: invokevirtual charAt : (I)C
    //   83: iload_2
    //   84: if_icmpne -> 100
    //   87: iload #5
    //   89: ifne -> 100
    //   92: iinc #6, 1
    //   95: aload #4
    //   97: ifnull -> 123
    //   100: aload_0
    //   101: iload #7
    //   103: invokevirtual charAt : (I)C
    //   106: iload_1
    //   107: if_icmpne -> 123
    //   110: iload #5
    //   112: ifne -> 123
    //   115: iload #6
    //   117: ifgt -> 123
    //   120: iload #7
    //   122: ireturn
    //   123: iinc #7, -1
    //   126: aload #4
    //   128: ifnull -> 31
    //   131: iconst_m1
    //   132: ireturn
  }
  
  public static int Zh(String paramString, int paramInt1, char paramChar, int paramInt2, int paramInt3, int paramInt4) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    if (paramString == null || paramInt2 >= paramString.length() - 1)
      return -1; 
    boolean bool = ZO(paramString, paramInt2, paramInt1, paramInt3, paramInt4);
    int i = paramInt2;
    while (i < paramString.length()) {
      char c = paramString.charAt(i);
      if (c == '"' && (i == 0 || paramString.charAt(i - 1) != '\\'))
        bool = !bool; 
      if (c == paramChar && !bool)
        return i; 
      i++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return -1;
  }
  
  private static boolean ZO(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_0
    //   6: ifnull -> 13
    //   9: iload_1
    //   10: ifgt -> 15
    //   13: iconst_0
    //   14: ireturn
    //   15: iconst_0
    //   16: istore #6
    //   18: iload_1
    //   19: iload #4
    //   21: if_icmpge -> 87
    //   24: iload_2
    //   25: istore #7
    //   27: iload #7
    //   29: iload_1
    //   30: if_icmpge -> 82
    //   33: iload #7
    //   35: ifle -> 74
    //   38: aload_0
    //   39: iload #7
    //   41: iconst_1
    //   42: isub
    //   43: invokevirtual charAt : (I)C
    //   46: bipush #92
    //   48: if_icmpeq -> 74
    //   51: aload_0
    //   52: iload #7
    //   54: invokevirtual charAt : (I)C
    //   57: bipush #34
    //   59: if_icmpne -> 74
    //   62: iload #6
    //   64: ifne -> 71
    //   67: iconst_1
    //   68: goto -> 72
    //   71: iconst_0
    //   72: istore #6
    //   74: iinc #7, 1
    //   77: aload #5
    //   79: ifnull -> 27
    //   82: aload #5
    //   84: ifnull -> 204
    //   87: iload_2
    //   88: istore #7
    //   90: iload #7
    //   92: iload_3
    //   93: if_icmpge -> 145
    //   96: iload #7
    //   98: ifle -> 137
    //   101: aload_0
    //   102: iload #7
    //   104: iconst_1
    //   105: isub
    //   106: invokevirtual charAt : (I)C
    //   109: bipush #92
    //   111: if_icmpeq -> 137
    //   114: aload_0
    //   115: iload #7
    //   117: invokevirtual charAt : (I)C
    //   120: bipush #34
    //   122: if_icmpne -> 137
    //   125: iload #6
    //   127: ifne -> 134
    //   130: iconst_1
    //   131: goto -> 135
    //   134: iconst_0
    //   135: istore #6
    //   137: iinc #7, 1
    //   140: aload #5
    //   142: ifnull -> 90
    //   145: iload #4
    //   147: istore #7
    //   149: iload #7
    //   151: iload_1
    //   152: if_icmpge -> 204
    //   155: iload #7
    //   157: ifle -> 196
    //   160: aload_0
    //   161: iload #7
    //   163: iconst_1
    //   164: isub
    //   165: invokevirtual charAt : (I)C
    //   168: bipush #92
    //   170: if_icmpeq -> 196
    //   173: aload_0
    //   174: iload #7
    //   176: invokevirtual charAt : (I)C
    //   179: bipush #34
    //   181: if_icmpne -> 196
    //   184: iload #6
    //   186: ifne -> 193
    //   189: iconst_1
    //   190: goto -> 194
    //   193: iconst_0
    //   194: istore #6
    //   196: iinc #7, 1
    //   199: aload #5
    //   201: ifnull -> 149
    //   204: iload #6
    //   206: ireturn
  }
  
  private static boolean Zt(char paramChar) {
    return (paramChar == '\000' || Character.isWhitespace(paramChar) || paramChar == '{' || paramChar == '}' || paramChar == '[' || paramChar == ']' || paramChar == ',');
  }
  
  private static boolean Zg(int paramInt1, int paramInt2) {
    return (paramInt1 <= 0 || paramInt2 < paramInt1);
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '5gÓ2ÿ­j{ , s$ ¾7GÿÑbå¡¬_Cº®ãªh(CC_ÛR9uªZrúÎ¥ôHÅÆcàUå¶ôB-ÝÈ*ù²6¬ý¼çÍE{^ËÛeÓjW±±ùíkFuªS\\ta½_x£Ø$Å9~°+é+{RÜ)²\\ri,/èYIGÖiåd_­<èù®@"¾þ;\\tL\\b¡0¯_:ËÍOCÓÔ@_Sà*\\n@XÀ:èÖý-¦[úËë¨I94xíN'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #77
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
    //   68: ldc 'Öå¼¿ÊÇ%;³îSñÛT¿¢Í:?ùÓ8jøìW'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #17
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #48
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
    //   129: putstatic burp/Zgr7.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgr7.b : [Ljava/lang/String;
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
    //   212: bipush #18
    //   214: goto -> 244
    //   217: bipush #95
    //   219: goto -> 244
    //   222: bipush #87
    //   224: goto -> 244
    //   227: bipush #125
    //   229: goto -> 244
    //   232: bipush #30
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #101
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
    int i = (paramInt1 ^ 0xFFFFFDCE) & 0xFFFF;
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
      char c = 'ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgr7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */