package burp.theme;

import burp.Ze01;
import burp.Zed6;
import burp.Zgye;
import com.formdev.flatlaf.ui.FlatOptionPaneUI;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.HierarchyEvent;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class BurpOptionPaneUI extends FlatOptionPaneUI {
  private static final String[] a;
  
  private static final String[] b;
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (ComponentUI)new BurpOptionPaneUI();
  }
  
  protected void addButtonComponents(Container paramContainer, Object[] paramArrayOfObject, int paramInt) {
    // Byte code:
    //   0: invokestatic Zk : ()I
    //   3: istore #4
    //   5: aload_2
    //   6: ifnull -> 21
    //   9: aload_2
    //   10: arraylength
    //   11: ifne -> 26
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   20: athrow
    //   21: return
    //   22: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   25: athrow
    //   26: aload_0
    //   27: invokevirtual getSizeButtonsToSameWidth : ()Z
    //   30: istore #5
    //   32: aload_2
    //   33: arraylength
    //   34: istore #6
    //   36: iload #5
    //   38: ifeq -> 53
    //   41: iload #6
    //   43: anewarray burp/Ze01
    //   46: goto -> 54
    //   49: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   52: athrow
    //   53: aconst_null
    //   54: astore #7
    //   56: iconst_1
    //   57: istore #8
    //   59: iconst_0
    //   60: istore #9
    //   62: iconst_0
    //   63: istore #10
    //   65: iload #10
    //   67: iload #6
    //   69: if_icmpge -> 224
    //   72: aload_2
    //   73: iload #10
    //   75: aaload
    //   76: astore #11
    //   78: aload #11
    //   80: instanceof java/awt/Component
    //   83: ifeq -> 113
    //   86: iconst_0
    //   87: istore #8
    //   89: aload #11
    //   91: checkcast java/awt/Component
    //   94: astore #12
    //   96: aload_1
    //   97: aload #12
    //   99: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   102: pop
    //   103: aload_0
    //   104: iconst_1
    //   105: putfield hasCustomComponents : Z
    //   108: iload #4
    //   110: ifeq -> 173
    //   113: aload_0
    //   114: aload #11
    //   116: iload #10
    //   118: invokevirtual getCreatedButton : (Ljava/lang/Object;I)Lburp/Ze01;
    //   121: astore #13
    //   123: aload_1
    //   124: aload #13
    //   126: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   129: pop
    //   130: aload #7
    //   132: ifnull -> 169
    //   135: iload #8
    //   137: ifeq -> 169
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   146: athrow
    //   147: aload #7
    //   149: iload #10
    //   151: aload #13
    //   153: aastore
    //   154: iload #9
    //   156: aload #13
    //   158: invokevirtual getMinimumSize : ()Ljava/awt/Dimension;
    //   161: getfield width : I
    //   164: invokestatic max : (II)I
    //   167: istore #9
    //   169: aload #13
    //   171: astore #12
    //   173: iload #10
    //   175: iload_3
    //   176: if_icmpne -> 216
    //   179: aload_0
    //   180: aload #12
    //   182: putfield initialFocusComponent : Ljava/awt/Component;
    //   185: aload_0
    //   186: getfield initialFocusComponent : Ljava/awt/Component;
    //   189: astore #14
    //   191: aload #14
    //   193: instanceof burp/Ze01
    //   196: ifeq -> 216
    //   199: aload #14
    //   201: checkcast burp/Ze01
    //   204: astore #13
    //   206: aload #13
    //   208: <illegal opcode> hierarchyChanged : ()Ljava/awt/event/HierarchyListener;
    //   213: invokevirtual addHierarchyListener : (Ljava/awt/event/HierarchyListener;)V
    //   216: iinc #10, 1
    //   219: iload #4
    //   221: ifeq -> 65
    //   224: aload_1
    //   225: invokevirtual getLayout : ()Ljava/awt/LayoutManager;
    //   228: astore #11
    //   230: aload #11
    //   232: instanceof javax/swing/plaf/basic/BasicOptionPaneUI$ButtonAreaLayout
    //   235: ifeq -> 276
    //   238: aload #11
    //   240: checkcast javax/swing/plaf/basic/BasicOptionPaneUI$ButtonAreaLayout
    //   243: astore #10
    //   245: aload #10
    //   247: aload #7
    //   249: ifnull -> 272
    //   252: iload #8
    //   254: ifeq -> 272
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   263: athrow
    //   264: iconst_1
    //   265: goto -> 273
    //   268: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   271: athrow
    //   272: iconst_0
    //   273: invokevirtual setSyncAllWidths : (Z)V
    //   276: aload_0
    //   277: invokevirtual getSetButtonMargin : ()Z
    //   280: ifeq -> 371
    //   283: aload #7
    //   285: ifnull -> 371
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   294: athrow
    //   295: iload #8
    //   297: ifeq -> 371
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   306: athrow
    //   307: iload #6
    //   309: iconst_2
    //   310: if_icmpgt -> 329
    //   313: goto -> 320
    //   316: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   319: athrow
    //   320: bipush #8
    //   322: goto -> 330
    //   325: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   328: athrow
    //   329: iconst_4
    //   330: istore #10
    //   332: iconst_0
    //   333: istore #11
    //   335: iload #11
    //   337: iload #6
    //   339: if_icmpge -> 371
    //   342: aload #7
    //   344: iload #11
    //   346: aaload
    //   347: new java/awt/Insets
    //   350: dup
    //   351: iconst_2
    //   352: iload #10
    //   354: iconst_2
    //   355: iload #10
    //   357: invokespecial <init> : (IIII)V
    //   360: invokevirtual setMargin : (Ljava/awt/Insets;)V
    //   363: iinc #11, 1
    //   366: iload #4
    //   368: ifeq -> 335
    //   371: return
    // Exception table:
    //   from	to	target	type
    //   5	14	17	java/lang/NumberFormatException
    //   9	22	22	java/lang/NumberFormatException
    //   36	49	49	java/lang/NumberFormatException
    //   123	140	143	java/lang/NumberFormatException
    //   245	257	260	java/lang/NumberFormatException
    //   252	268	268	java/lang/NumberFormatException
    //   276	288	291	java/lang/NumberFormatException
    //   283	300	303	java/lang/NumberFormatException
    //   295	313	316	java/lang/NumberFormatException
    //   307	325	325	java/lang/NumberFormatException
  }
  
  protected Object[] getButtons() {
    if (this.optionPane != null) {
      Object[] arrayOfObject = this.optionPane.getOptions();
      if (arrayOfObject == null) {
        int i = getButtonMinimumWidth();
        try {
          switch (this.optionPane.getOptionType()) {
            case 0:
              (new Zgye[2])[0] = getDefaultYesOption(i);
              (new Zgye[2])[1] = getDefaultNoOption(i);
            case 1:
              (new Zgye[3])[0] = getDefaultYesOption(i);
              (new Zgye[3])[1] = getDefaultNoOption(i);
              (new Zgye[3])[2] = getDefaultCancelOption(i);
            case 2:
              (new Zgye[2])[0] = getDefaultOkOption(i);
              (new Zgye[2])[1] = getDefaultCancelOption(i);
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return (Object[])new Zgye[] { getDefaultOkOption(i) };
      } 
      return arrayOfObject;
    } 
    return null;
  }
  
  protected int getInitialValueIndex() {
    Object[] arrayOfObject = this.optionPane.getOptions();
    try {
      if (arrayOfObject == null) {
        try {
          switch (this.optionPane.getOptionType()) {
            case 0:
            case 2:
            
            case 1:
            
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return 0;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return super.getInitialValueIndex();
  }
  
  private Ze01 getCreatedButton(Object paramObject, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5: pop
    //   6: astore #4
    //   8: iconst_0
    //   9: istore #5
    //   11: aload #4
    //   13: iload #5
    //   15: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   20: lookupswitch default -> 84, 0 -> 48, 1 -> 65
    //   48: aload #4
    //   50: checkcast burp/Zgye
    //   53: astore #6
    //   55: aload #6
    //   57: invokeinterface ZX : ()Lburp/Ze01;
    //   62: goto -> 98
    //   65: aload #4
    //   67: checkcast javax/swing/Icon
    //   70: astore #7
    //   72: new burp/Ze01
    //   75: dup
    //   76: aload #7
    //   78: invokespecial <init> : (Ljavax/swing/Icon;)V
    //   81: goto -> 98
    //   84: new burp/Ze01
    //   87: dup
    //   88: aload_1
    //   89: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: invokevirtual toString : ()Ljava/lang/String;
    //   95: invokespecial <init> : (Ljava/lang/String;)V
    //   98: astore_3
    //   99: aload_0
    //   100: invokevirtual getButtonFont : ()Ljava/awt/Font;
    //   103: astore #4
    //   105: aload_0
    //   106: iload_2
    //   107: invokevirtual createButtonActionListener : (I)Ljava/awt/event/ActionListener;
    //   110: astore #5
    //   112: aload #4
    //   114: ifnull -> 130
    //   117: aload_3
    //   118: aload #4
    //   120: invokevirtual setFont : (Ljava/awt/Font;)V
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   129: athrow
    //   130: aload #5
    //   132: ifnull -> 148
    //   135: aload_3
    //   136: aload #5
    //   138: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   147: athrow
    //   148: aload_3
    //   149: sipush #-9065
    //   152: sipush #-7164
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: invokevirtual setName : (Ljava/lang/String;)V
    //   161: aload_3
    //   162: aload_0
    //   163: invokevirtual getButtonClickThreshhold : ()I
    //   166: i2l
    //   167: invokevirtual setMultiClickThreshhold : (J)V
    //   170: aload_3
    //   171: areturn
    // Exception table:
    //   from	to	target	type
    //   112	123	126	java/lang/NumberFormatException
    //   130	141	144	java/lang/NumberFormatException
  }
  
  private Font getButtonFont() {
    Object object = UIManager.get(a(-9057, -5633), this.optionPane.getLocale());
    Font font = (Font)object;
    return (object instanceof Font) ? font : null;
  }
  
  private int getButtonClickThreshhold() {
    Object object = UIManager.get(a(-9060, 15710), this.optionPane.getLocale());
    Integer integer = (Integer)object;
    return (object instanceof Integer) ? integer.intValue() : 0;
  }
  
  private boolean getSetButtonMargin() {
    Object object = UIManager.get(a(-9058, -14313), this.optionPane.getLocale());
    Boolean bool = (Boolean)object;
    return (object instanceof Boolean) ? bool.booleanValue() : true;
  }
  
  private int getButtonMinimumWidth() {
    Object object = UIManager.get(a(-9073, 20200), this.optionPane.getLocale());
    Integer integer = (Integer)object;
    return (object instanceof Integer) ? integer.intValue() : -1;
  }
  
  private Zgye getDefaultYesOption(int paramInt) {
    return getDefaultOption(getYesButtonText(), getYesButtonMnemonic(), getYesIcon(), paramInt);
  }
  
  private Zgye getDefaultNoOption(int paramInt) {
    return getDefaultOption(getNoButtonText(), getNoButtonMnemonic(), getNoIcon(), paramInt);
  }
  
  private Zgye getDefaultCancelOption(int paramInt) {
    return getDefaultOption(getCancelButtonText(), getCancelButtonMnemonic(), getCancelIcon(), paramInt);
  }
  
  private Zgye getDefaultOkOption(int paramInt) {
    return getDefaultOption(getOkButtonText(), getOkButtonMnemonic(), getOkIcon(), paramInt);
  }
  
  private Zgye getDefaultOption(String paramString, int paramInt1, Icon paramIcon, int paramInt2) {
    return (Zgye)new Zed6(paramString, paramInt1, paramIcon, paramInt2);
  }
  
  private String getYesButtonText() {
    return getButtonText(a(-9062, 28291));
  }
  
  private String getNoButtonText() {
    return getButtonText(a(-9059, 25471));
  }
  
  private String getCancelButtonText() {
    return getButtonText(a(-9069, 21963));
  }
  
  private String getOkButtonText() {
    return getButtonText(a(-9072, 6213));
  }
  
  private String getButtonText(String paramString) {
    Object object = UIManager.get(paramString, this.optionPane.getLocale());
    String str = (String)object;
    return (object instanceof String) ? str : null;
  }
  
  private int getYesButtonMnemonic() {
    return getButtonMnemonic(a(-9070, 25290));
  }
  
  private int getNoButtonMnemonic() {
    return getButtonMnemonic(a(-9068, -26719));
  }
  
  private int getCancelButtonMnemonic() {
    return getButtonMnemonic(a(-9071, 2337));
  }
  
  private int getOkButtonMnemonic() {
    return getButtonMnemonic(a(-9061, -10262));
  }
  
  private int getButtonMnemonic(String paramString) {
    Object object = UIManager.get(paramString, this.optionPane.getLocale());
    if (object instanceof String) {
      String str = (String)object;
      try {
        return Integer.parseInt(str);
      } catch (NumberFormatException numberFormatException) {
        Zah.Zl(numberFormatException, Zk_.IGNORED);
      } 
    } 
    return 0;
  }
  
  private Icon getYesIcon() {
    return getIcon(a(-9066, 4769));
  }
  
  private Icon getNoIcon() {
    return getIcon(a(-9063, -24342));
  }
  
  private Icon getCancelIcon() {
    return getIcon(a(-9067, 8063));
  }
  
  private Icon getOkIcon() {
    return getIcon(a(-9064, -12277));
  }
  
  private Icon getIcon(String paramString) {
    Object object = UIManager.get(paramString, this.optionPane.getLocale());
    Icon icon = (Icon)object;
    return (object instanceof Icon) ? icon : null;
  }
  
  private static void lambda$addButtonComponents$0(HierarchyEvent paramHierarchyEvent) {
    if ((paramHierarchyEvent.getChangeFlags() & 0x1L) != 0L) {
      Ze01 ze01 = (Ze01)paramHierarchyEvent.getComponent();
      JRootPane jRootPane = SwingUtilities.getRootPane((Component)ze01);
      try {
        if (jRootPane != null)
          jRootPane.setDefaultButton((JButton)ze01); 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'OK;JW½~K.A|&ÏØh[ZMûMb¥ØHú!æ;H$SúñotdrÏdÌ³Á¤¤ áé?ê@£=Õ²RÎ" ¯Ö.93ßï»áæ|HzcÓ¨këÅì_Ö4ÓT¿Þ%øë! íð{±ÎÈk¦vrT lm_Û%ïX#:qMW¢iÄÕë¿%ÁÌe!éþâ=Xq(ñWÂpØ\\rE,ó_ó\\r¬¥¤ hå%ªàIi%åln®ý!+Ø3)su\\r\\n\\r\\nt­BAÜÔz²öY\\fAKæN\\rîÅÁj};éi?w@'£KÕX«Êÿû±a¯'BÔ¼k E½§ãÓliîìòtõÏhjÜ¸Ããì|86!g¨b_ÅìÍ²ÔÐùíÀì%aEvÖÞÉ¸&p-¥ä{eK¼ '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #30
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
    //   68: ldc 'ûÐ^Ê\\b^fÄÞCfMõÀ|ãüø°ÏÕþÝÐ©ÁÅ\WéYZ#×Ãb{[1 Ùð¾S'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #23
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #98
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
    //   129: putstatic burp/theme/BurpOptionPaneUI.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/theme/BurpOptionPaneUI.b : [Ljava/lang/String;
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
    //   212: bipush #39
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #57
    //   224: goto -> 244
    //   227: bipush #41
    //   229: goto -> 244
    //   232: bipush #95
    //   234: goto -> 244
    //   237: bipush #38
    //   239: goto -> 244
    //   242: bipush #112
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
    int i = (paramInt1 ^ 0xFFFFDC9F) & 0xFFFF;
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
      char c = '·';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpOptionPaneUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */