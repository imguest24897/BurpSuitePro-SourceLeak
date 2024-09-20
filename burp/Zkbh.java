package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.Iterator;
import java.util.List;

public class Zkbh implements LayoutManager {
  private int ZJ = 0;
  
  private int Za = 0;
  
  private Zkq3 Zq = Zkq3.CENTRE;
  
  private int ZD;
  
  private int ZF;
  
  private int ZB;
  
  public void addLayoutComponent(String paramString, Component paramComponent) {
    layoutContainer(paramComponent.getParent());
  }
  
  public void removeLayoutComponent(Component paramComponent) {
    layoutContainer(paramComponent.getParent());
  }
  
  public Zkbh ZI(int paramInt) {
    this.ZD = paramInt;
    return this;
  }
  
  public Zkbh ZG(int paramInt) {
    this.ZF = paramInt;
    return this;
  }
  
  public Zkbh ZL(Zkq3 paramZkq3) {
    this.Zq = paramZkq3;
    return this;
  }
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    int i = this.ZJ + this.Za;
    int j = 0;
    boolean bool = Zlfb.ZB();
    Component[] arrayOfComponent = paramContainer.getComponents();
    int k = arrayOfComponent.length;
    byte b = 0;
    while (b < k) {
      Component component = arrayOfComponent[b];
      i += (component.getPreferredSize()).width + this.ZD;
      j = Math.max(j, (component.getPreferredSize()).height);
      b++;
      if (bool)
        break; 
    } 
    Dimension dimension = minimumLayoutSize(paramContainer);
    return new Dimension(i, dimension.height);
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    int i = 0;
    int j = 0;
    List<List<Component>> list = ZD(paramContainer);
    Iterator<List<Component>> iterator = list.iterator();
    boolean bool = Zlfb.ZN();
    while (iterator.hasNext()) {
      List list1 = iterator.next();
      int k = 0;
      int m = 0;
      for (Component component : list1) {
        k = Math.max(k, (component.getMinimumSize()).width + this.ZJ + this.Za);
        m = Math.max(m, (component.getMinimumSize()).height);
        if (!bool)
          break; 
      } 
      if (list1.size() < 2)
        k -= this.ZD; 
      i = Math.max(i, k);
      j += m;
      if (!bool)
        break; 
    } 
    if (list.size() > 1)
      j += this.ZF * (list.size() - 1); 
    return new Dimension(i, j);
  }
  
  public void layoutContainer(Container paramContainer) {
    // Byte code:
    //   0: invokestatic ZB : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual getComponentCount : ()I
    //   8: istore_3
    //   9: iload_3
    //   10: iconst_1
    //   11: if_icmpgt -> 15
    //   14: return
    //   15: aload_1
    //   16: invokevirtual getBounds : ()Ljava/awt/Rectangle;
    //   19: getfield width : I
    //   22: istore #4
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual ZD : (Ljava/awt/Container;)Ljava/util/List;
    //   29: astore #5
    //   31: iconst_0
    //   32: istore #7
    //   34: iconst_0
    //   35: istore #8
    //   37: iconst_1
    //   38: istore #9
    //   40: aload #5
    //   42: invokeinterface iterator : ()Ljava/util/Iterator;
    //   47: astore #10
    //   49: aload #10
    //   51: invokeinterface hasNext : ()Z
    //   56: ifeq -> 463
    //   59: aload #10
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: checkcast java/util/List
    //   69: astore #11
    //   71: aload_0
    //   72: getfield ZJ : I
    //   75: istore #12
    //   77: iload #4
    //   79: aload_0
    //   80: getfield ZJ : I
    //   83: aload_0
    //   84: getfield Za : I
    //   87: iadd
    //   88: isub
    //   89: istore #6
    //   91: aload #11
    //   93: invokeinterface iterator : ()Ljava/util/Iterator;
    //   98: astore #13
    //   100: aload #13
    //   102: invokeinterface hasNext : ()Z
    //   107: ifeq -> 158
    //   110: aload #13
    //   112: invokeinterface next : ()Ljava/lang/Object;
    //   117: checkcast java/awt/Component
    //   120: astore #14
    //   122: aload #14
    //   124: invokevirtual getMinimumSize : ()Ljava/awt/Dimension;
    //   127: getfield width : I
    //   130: istore #15
    //   132: iload #6
    //   134: iload #15
    //   136: isub
    //   137: istore #6
    //   139: iload #7
    //   141: aload #14
    //   143: invokevirtual getMinimumSize : ()Ljava/awt/Dimension;
    //   146: getfield height : I
    //   149: invokestatic max : (II)I
    //   152: istore #7
    //   154: iload_2
    //   155: ifeq -> 100
    //   158: iload #8
    //   160: iload #7
    //   162: iadd
    //   163: istore #8
    //   165: iload #9
    //   167: ifne -> 179
    //   170: iload #8
    //   172: aload_0
    //   173: getfield ZF : I
    //   176: iadd
    //   177: istore #8
    //   179: aload #11
    //   181: invokeinterface size : ()I
    //   186: iconst_1
    //   187: if_icmple -> 205
    //   190: iload #6
    //   192: aload #11
    //   194: invokeinterface size : ()I
    //   199: iconst_1
    //   200: isub
    //   201: idiv
    //   202: goto -> 206
    //   205: iconst_0
    //   206: istore #13
    //   208: aload #11
    //   210: invokeinterface size : ()I
    //   215: iconst_1
    //   216: if_icmple -> 239
    //   219: iload #6
    //   221: aload_0
    //   222: getfield ZD : I
    //   225: aload #11
    //   227: invokeinterface size : ()I
    //   232: iconst_2
    //   233: isub
    //   234: imul
    //   235: isub
    //   236: goto -> 240
    //   239: iconst_0
    //   240: istore #14
    //   242: iconst_0
    //   243: istore #15
    //   245: aload #11
    //   247: invokeinterface iterator : ()Ljava/util/Iterator;
    //   252: astore #16
    //   254: aload #16
    //   256: invokeinterface hasNext : ()Z
    //   261: ifeq -> 456
    //   264: aload #16
    //   266: invokeinterface next : ()Ljava/lang/Object;
    //   271: checkcast java/awt/Component
    //   274: astore #17
    //   276: aload #17
    //   278: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   281: astore #18
    //   283: aload #18
    //   285: getfield width : I
    //   288: istore #19
    //   290: aload #18
    //   292: getfield height : I
    //   295: istore #20
    //   297: iload #12
    //   299: istore #21
    //   301: iload #8
    //   303: iload #7
    //   305: isub
    //   306: iload #7
    //   308: iload #20
    //   310: isub
    //   311: iconst_2
    //   312: idiv
    //   313: iadd
    //   314: istore #22
    //   316: aload #17
    //   318: iload #21
    //   320: iload #22
    //   322: iload #19
    //   324: iload #20
    //   326: invokevirtual setBounds : (IIII)V
    //   329: iload #12
    //   331: iload #19
    //   333: iadd
    //   334: istore #12
    //   336: getstatic burp/Zkq3.CENTRE : Lburp/Zkq3;
    //   339: aload_0
    //   340: getfield Zq : Lburp/Zkq3;
    //   343: invokevirtual equals : (Ljava/lang/Object;)Z
    //   346: ifeq -> 360
    //   349: iload #12
    //   351: iload #13
    //   353: iadd
    //   354: istore #12
    //   356: iload_2
    //   357: ifeq -> 449
    //   360: getstatic burp/Zkq3.LEFT : Lburp/Zkq3;
    //   363: aload_0
    //   364: getfield Zq : Lburp/Zkq3;
    //   367: invokevirtual equals : (Ljava/lang/Object;)Z
    //   370: ifeq -> 411
    //   373: iload #15
    //   375: aload #11
    //   377: invokeinterface size : ()I
    //   382: iconst_2
    //   383: isub
    //   384: if_icmpge -> 400
    //   387: iload #12
    //   389: aload_0
    //   390: getfield ZD : I
    //   393: iadd
    //   394: istore #12
    //   396: iload_2
    //   397: ifeq -> 449
    //   400: iload #12
    //   402: iload #14
    //   404: iadd
    //   405: istore #12
    //   407: iload_2
    //   408: ifeq -> 449
    //   411: getstatic burp/Zkq3.RIGHT : Lburp/Zkq3;
    //   414: aload_0
    //   415: getfield Zq : Lburp/Zkq3;
    //   418: invokevirtual equals : (Ljava/lang/Object;)Z
    //   421: ifeq -> 449
    //   424: iload #15
    //   426: ifne -> 440
    //   429: iload #12
    //   431: iload #14
    //   433: iadd
    //   434: istore #12
    //   436: iload_2
    //   437: ifeq -> 449
    //   440: iload #12
    //   442: aload_0
    //   443: getfield ZD : I
    //   446: iadd
    //   447: istore #12
    //   449: iinc #15, 1
    //   452: iload_2
    //   453: ifeq -> 254
    //   456: iconst_0
    //   457: istore #9
    //   459: iload_2
    //   460: ifeq -> 49
    //   463: aload_1
    //   464: new java/awt/Dimension
    //   467: dup
    //   468: iload #4
    //   470: iload #8
    //   472: invokespecial <init> : (II)V
    //   475: invokevirtual setPreferredSize : (Ljava/awt/Dimension;)V
    //   478: aload_1
    //   479: invokevirtual invalidate : ()V
    //   482: iload #8
    //   484: aload_0
    //   485: getfield ZB : I
    //   488: if_icmpeq -> 506
    //   491: aload_0
    //   492: iload #8
    //   494: putfield ZB : I
    //   497: aload_1
    //   498: <illegal opcode> run : (Ljava/awt/Container;)Ljava/lang/Runnable;
    //   503: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   506: return
  }
  
  private List<List<Component>> ZD(Container paramContainer) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getBounds : ()Ljava/awt/Rectangle;
    //   4: getfield width : I
    //   7: istore_3
    //   8: invokestatic ZN : ()Z
    //   11: new java/util/ArrayList
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #4
    //   20: new java/util/ArrayList
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #5
    //   29: aload #4
    //   31: aload #5
    //   33: invokeinterface add : (Ljava/lang/Object;)Z
    //   38: pop
    //   39: istore_2
    //   40: iload_3
    //   41: aload_0
    //   42: getfield ZJ : I
    //   45: aload_0
    //   46: getfield Za : I
    //   49: iadd
    //   50: isub
    //   51: istore #6
    //   53: aload_1
    //   54: invokevirtual getComponents : ()[Ljava/awt/Component;
    //   57: astore #7
    //   59: aload #7
    //   61: arraylength
    //   62: istore #8
    //   64: iconst_0
    //   65: istore #9
    //   67: iload #9
    //   69: iload #8
    //   71: if_icmpge -> 206
    //   74: aload #7
    //   76: iload #9
    //   78: aaload
    //   79: astore #10
    //   81: aload #10
    //   83: invokevirtual getMinimumSize : ()Ljava/awt/Dimension;
    //   86: astore #11
    //   88: aload #11
    //   90: getfield width : I
    //   93: istore #12
    //   95: iload #6
    //   97: iload #12
    //   99: isub
    //   100: istore #6
    //   102: iload_3
    //   103: ifle -> 170
    //   106: iload #6
    //   108: ifge -> 170
    //   111: aload #5
    //   113: invokeinterface isEmpty : ()Z
    //   118: ifne -> 170
    //   121: new java/util/ArrayList
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: astore #5
    //   130: aload #5
    //   132: aload #10
    //   134: invokeinterface add : (Ljava/lang/Object;)Z
    //   139: pop
    //   140: aload #4
    //   142: aload #5
    //   144: invokeinterface add : (Ljava/lang/Object;)Z
    //   149: pop
    //   150: iload_3
    //   151: aload_0
    //   152: getfield ZJ : I
    //   155: aload_0
    //   156: getfield Za : I
    //   159: iadd
    //   160: isub
    //   161: iload #12
    //   163: isub
    //   164: istore #6
    //   166: iload_2
    //   167: ifne -> 199
    //   170: aload #5
    //   172: invokeinterface isEmpty : ()Z
    //   177: ifne -> 189
    //   180: iload #6
    //   182: aload_0
    //   183: getfield ZD : I
    //   186: isub
    //   187: istore #6
    //   189: aload #5
    //   191: aload #10
    //   193: invokeinterface add : (Ljava/lang/Object;)Z
    //   198: pop
    //   199: iinc #9, 1
    //   202: iload_2
    //   203: ifne -> 67
    //   206: aload #4
    //   208: areturn
  }
  
  private static void lambda$layoutContainer$0(Container paramContainer) {
    paramContainer.revalidate();
    paramContainer.repaint();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */