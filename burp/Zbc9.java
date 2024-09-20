package burp;

import java.awt.Component;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zbc9 extends Zbqc {
  private final Component ZX = new Zbqc();
  
  private int Zh = -1;
  
  private static boolean Zo;
  
  public Zbc9() {
    this(Collections.emptyList());
  }
  
  public Zbc9(Component... paramVarArgs) {
    this(List.of(paramVarArgs));
  }
  
  public Zbc9(List<Component> paramList) {
    setLayout(new Zktj(this));
    paramList.forEach(this::add);
    if (!paramList.isEmpty())
      Zv(0); 
  }
  
  public void Zz(Zrog paramZrog) {
    ZP((paramZrog == null) ? null : paramZrog.ZO());
  }
  
  public void ZP(Component paramComponent) {
    synchronized (getTreeLock()) {
      Zv(ZV(paramComponent));
    } 
  }
  
  public void Zv(int paramInt) {
    synchronized (getTreeLock()) {
      if (paramInt >= 0 && paramInt < getComponentCount() && paramInt != this.Zh) {
        ZY().setVisible(false);
        this.Zh = paramInt;
        ZY().setVisible(true);
      } 
    } 
  }
  
  public boolean ZR(Component paramComponent) {
    synchronized (getTreeLock()) {
      return (this.Zh == ZV(paramComponent));
    } 
  }
  
  protected void addImpl(Component paramComponent, Object paramObject, int paramInt) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore #4
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: iload_3
    //   9: invokespecial addImpl : (Ljava/awt/Component;Ljava/lang/Object;I)V
    //   12: aload_0
    //   13: invokevirtual getComponentCount : ()I
    //   16: iconst_1
    //   17: if_icmpne -> 30
    //   20: aload_0
    //   21: iconst_0
    //   22: invokevirtual Zv : (I)V
    //   25: iload #4
    //   27: ifne -> 58
    //   30: aload_1
    //   31: iconst_0
    //   32: invokevirtual setVisible : (Z)V
    //   35: iload_3
    //   36: aload_0
    //   37: getfield Zh : I
    //   40: if_icmpgt -> 58
    //   43: iload_3
    //   44: iconst_m1
    //   45: if_icmpeq -> 58
    //   48: aload_0
    //   49: dup
    //   50: getfield Zh : I
    //   53: iconst_1
    //   54: iadd
    //   55: putfield Zh : I
    //   58: return
  }
  
  public void remove(Component paramComponent) {
    synchronized (getTreeLock()) {
      int i = ZV(paramComponent);
      if (i != -1)
        remove(i); 
    } 
  }
  
  public void remove(int paramInt) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: invokevirtual getTreeLock : ()Ljava/lang/Object;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: aload_0
    //   12: iload_1
    //   13: invokespecial remove : (I)V
    //   16: aload_0
    //   17: invokevirtual getComponentCount : ()I
    //   20: ifne -> 32
    //   23: aload_0
    //   24: iconst_m1
    //   25: putfield Zh : I
    //   28: iload_2
    //   29: ifne -> 58
    //   32: iload_1
    //   33: aload_0
    //   34: getfield Zh : I
    //   37: if_icmpgt -> 58
    //   40: aload_0
    //   41: dup
    //   42: getfield Zh : I
    //   45: iconst_1
    //   46: isub
    //   47: putfield Zh : I
    //   50: aload_0
    //   51: invokevirtual ZY : ()Ljava/awt/Component;
    //   54: iconst_1
    //   55: invokevirtual setVisible : (Z)V
    //   58: aload_3
    //   59: monitorexit
    //   60: goto -> 70
    //   63: astore #4
    //   65: aload_3
    //   66: monitorexit
    //   67: aload #4
    //   69: athrow
    //   70: return
    // Exception table:
    //   from	to	target	type
    //   11	60	63	finally
    //   63	67	63	finally
  }
  
  public void removeAll() {
    synchronized (getTreeLock()) {
      super.removeAll();
      this.Zh = -1;
    } 
  }
  
  public boolean ZT(Component paramComponent) {
    return (ZV(paramComponent) != -1);
  }
  
  public Component ZY() {
    int i = getComponentCount();
    if (this.Zh >= i)
      this.Zh = (i == 0) ? 0 : (i - 1); 
    return (i == 0 || this.Zh == -1) ? this.ZX : getComponent(this.Zh);
  }
  
  private int ZV(Component paramComponent) {
    return Arrays.<Component>asList(getComponents()).indexOf(paramComponent);
  }
  
  public void ZU(Zrog paramZrog) {
    add(paramZrog.ZO());
  }
  
  public static void Zv(boolean paramBoolean) {
    Zo = paramBoolean;
  }
  
  public static boolean Zn() {
    return Zo;
  }
  
  public static boolean Zu() {
    boolean bool = Zn();
    return !bool;
  }
  
  static {
    if (Zn())
      Zv(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbc9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */