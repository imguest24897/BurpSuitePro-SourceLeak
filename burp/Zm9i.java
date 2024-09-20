package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Arrays;

class Zm9i implements LayoutManager {
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    int[] arrayOfInt = Zbht.ZY();
    synchronized (paramContainer.getTreeLock()) {
      if (paramContainer.getComponentCount() == 0 || !paramContainer.isVisible())
        return new Dimension(0, 0); 
      Insets insets = paramContainer.getInsets();
      int i = paramContainer.getWidth() - insets.left - insets.right;
      if (i < 410) {
        Dimension dimension1 = ZN(paramContainer.getComponents(), i);
        if (arrayOfInt != null) {
          dimension1 = ZX(paramContainer.getComponents(), i);
          dimension1.width += insets.left + insets.right;
          dimension1.height += insets.top + insets.bottom;
          return dimension1;
        } 
        dimension1.width += insets.left + insets.right;
        dimension1.height += insets.top + insets.bottom;
        return dimension1;
      } 
      Dimension dimension = ZX(paramContainer.getComponents(), i);
      dimension.width += insets.left + insets.right;
      dimension.height += insets.top + insets.bottom;
      return dimension;
    } 
  }
  
  private Dimension ZN(Component[] paramArrayOfComponent, int paramInt) {
    int i = Math.max(paramInt, 200);
    int j = Arrays.<Component>stream(paramArrayOfComponent).mapToInt(Zm9i::lambda$oneColumnLayoutSize$0).sum() + 10 * (paramArrayOfComponent.length - 1);
    return new Dimension(i, j);
  }
  
  private Dimension ZX(Component[] paramArrayOfComponent, int paramInt) {
    int i = Math.max(paramInt, 410);
    byte b = 0;
    int[] arrayOfInt = Zbht.ZY();
    ArrayList<Integer> arrayList = new ArrayList();
    while (b + 1 < paramArrayOfComponent.length) {
      arrayList.add(Integer.valueOf(Math.max((paramArrayOfComponent[b++].getPreferredSize()).height, (paramArrayOfComponent[b++].getPreferredSize()).height)));
      if (arrayOfInt != null)
        break; 
    } 
    if (b < paramArrayOfComponent.length)
      arrayList.add(Integer.valueOf((paramArrayOfComponent[b].getPreferredSize()).height)); 
    int j = arrayList.stream().mapToInt(Integer::intValue).sum() + 10 * (arrayList.size() - 1);
    return new Dimension(i, j);
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      return new Dimension(200 + insets.left + insets.right, 50 + insets.top + insets.bottom);
    } 
  }
  
  public void layoutContainer(Container paramContainer) {
    // Byte code:
    //   0: invokestatic ZY : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getTreeLock : ()Ljava/lang/Object;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: aload_1
    //   12: invokevirtual getInsets : ()Ljava/awt/Insets;
    //   15: astore #4
    //   17: aload_1
    //   18: invokevirtual getWidth : ()I
    //   21: aload #4
    //   23: getfield left : I
    //   26: isub
    //   27: aload #4
    //   29: getfield right : I
    //   32: isub
    //   33: istore #5
    //   35: aload_1
    //   36: invokevirtual getComponents : ()[Ljava/awt/Component;
    //   39: astore #6
    //   41: iload #5
    //   43: sipush #410
    //   46: if_icmpge -> 141
    //   49: aload #4
    //   51: getfield top : I
    //   54: istore #7
    //   56: aload #6
    //   58: astore #8
    //   60: aload #8
    //   62: arraylength
    //   63: istore #9
    //   65: iconst_0
    //   66: istore #10
    //   68: iload #10
    //   70: iload #9
    //   72: if_icmpge -> 137
    //   75: aload #8
    //   77: iload #10
    //   79: aaload
    //   80: astore #11
    //   82: aload #11
    //   84: iload #5
    //   86: aload #11
    //   88: invokevirtual getHeight : ()I
    //   91: invokevirtual setSize : (II)V
    //   94: aload #11
    //   96: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   99: getfield height : I
    //   102: istore #12
    //   104: aload #11
    //   106: aload #4
    //   108: getfield left : I
    //   111: iload #7
    //   113: iload #5
    //   115: iload #12
    //   117: invokevirtual setBounds : (IIII)V
    //   120: iload #7
    //   122: iload #12
    //   124: bipush #10
    //   126: iadd
    //   127: iadd
    //   128: istore #7
    //   130: iinc #10, 1
    //   133: aload_2
    //   134: ifnull -> 68
    //   137: aload_2
    //   138: ifnull -> 346
    //   141: iload #5
    //   143: bipush #10
    //   145: isub
    //   146: iconst_2
    //   147: idiv
    //   148: istore #7
    //   150: aload #4
    //   152: getfield top : I
    //   155: istore #8
    //   157: aload #4
    //   159: getfield top : I
    //   162: istore #9
    //   164: aload #6
    //   166: arraylength
    //   167: istore #10
    //   169: iload #10
    //   171: iconst_2
    //   172: irem
    //   173: ifne -> 181
    //   176: iload #10
    //   178: goto -> 185
    //   181: iload #10
    //   183: iconst_1
    //   184: isub
    //   185: istore #11
    //   187: iconst_0
    //   188: istore #12
    //   190: iload #12
    //   192: iload #11
    //   194: if_icmpge -> 312
    //   197: aload #6
    //   199: iload #12
    //   201: aaload
    //   202: astore #13
    //   204: aload #13
    //   206: iload #7
    //   208: aload #13
    //   210: invokevirtual getHeight : ()I
    //   213: invokevirtual setSize : (II)V
    //   216: aload #13
    //   218: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   221: getfield height : I
    //   224: istore #14
    //   226: aload #13
    //   228: iconst_0
    //   229: iload #8
    //   231: iload #7
    //   233: iload #14
    //   235: invokevirtual setBounds : (IIII)V
    //   238: aload #6
    //   240: iload #12
    //   242: iconst_1
    //   243: iadd
    //   244: aaload
    //   245: astore #13
    //   247: aload #13
    //   249: iload #7
    //   251: aload #13
    //   253: invokevirtual getHeight : ()I
    //   256: invokevirtual setSize : (II)V
    //   259: aload #13
    //   261: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   264: getfield height : I
    //   267: istore #15
    //   269: aload #13
    //   271: iload #7
    //   273: bipush #10
    //   275: iadd
    //   276: iload #9
    //   278: iload #7
    //   280: iload #15
    //   282: invokevirtual setBounds : (IIII)V
    //   285: iload #8
    //   287: iload #14
    //   289: bipush #10
    //   291: iadd
    //   292: iadd
    //   293: istore #8
    //   295: iload #9
    //   297: iload #15
    //   299: bipush #10
    //   301: iadd
    //   302: iadd
    //   303: istore #9
    //   305: iinc #12, 2
    //   308: aload_2
    //   309: ifnull -> 190
    //   312: iload #11
    //   314: iload #10
    //   316: if_icmpge -> 346
    //   319: aload #6
    //   321: iload #10
    //   323: iconst_1
    //   324: isub
    //   325: aaload
    //   326: astore #12
    //   328: aload #12
    //   330: iconst_0
    //   331: iload #8
    //   333: iload #7
    //   335: aload #12
    //   337: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   340: getfield height : I
    //   343: invokevirtual setBounds : (IIII)V
    //   346: aload_3
    //   347: monitorexit
    //   348: goto -> 358
    //   351: astore #16
    //   353: aload_3
    //   354: monitorexit
    //   355: aload #16
    //   357: athrow
    //   358: return
    // Exception table:
    //   from	to	target	type
    //   11	348	351	finally
    //   351	355	351	finally
  }
  
  private static int lambda$oneColumnLayoutSize$0(Component paramComponent) {
    return (paramComponent.getPreferredSize()).height;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */