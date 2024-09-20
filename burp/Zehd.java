package burp;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Optional;
import javax.swing.Icon;
import javax.swing.tree.TreePath;

class Zehd extends MouseAdapter {
  private final Ztdi Zn;
  
  private final Zs0g ZM;
  
  private final Ztwv ZK;
  
  private final Zor Zo;
  
  private final Zltk Zi;
  
  private final boolean Zm;
  
  Zehd(Ztdi paramZtdi, Zs0g paramZs0g, Ztwv paramZtwv, Zor paramZor, Zltk paramZltk, boolean paramBoolean) {
    this.Zn = paramZtdi;
    this.ZM = paramZs0g;
    this.ZK = paramZtwv;
    this.Zo = paramZor;
    this.Zi = paramZltk;
    this.Zm = paramBoolean;
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      Zn(paramMouseEvent); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      Zn(paramMouseEvent); 
  }
  
  private void Zn(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zo : Lburp/Zor;
    //   4: aload_1
    //   5: invokevirtual getX : ()I
    //   8: aload_1
    //   9: invokevirtual getY : ()I
    //   12: invokevirtual getClosestPathForLocation : (II)Ljavax/swing/tree/TreePath;
    //   15: astore_2
    //   16: aload_0
    //   17: aload_2
    //   18: invokevirtual Za : (Ljavax/swing/tree/TreePath;)Ljava/util/Optional;
    //   21: aload_0
    //   22: aload_1
    //   23: <illegal opcode> accept : (Lburp/Zehd;Ljava/awt/event/MouseEvent;)Ljava/util/function/Consumer;
    //   28: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   31: return
  }
  
  private Optional<Zkj9> Za(TreePath paramTreePath) {
    Zble zble = (Zble)paramTreePath.getLastPathComponent();
    Zn1 zn1 = new Zn1(this.Zn, this.ZM, this.ZK, this.Zo, this.Zi, paramTreePath::lambda$buildMenu$1);
    Zmnm zmnm = zble.Zg();
    boolean bool = false;
    Zkj9 zkj9 = Zm(zmnm);
    if (!zble.ZT().isEmpty()) {
      Ze(zkj9, paramTreePath, zn1);
      bool = true;
    } 
    if (!zmnm.ZO1().isEmpty()) {
      if (bool)
        Zy(zkj9); 
      Zv(zkj9, zn1);
      bool = true;
    } 
    return bool ? Optional.<Zkj9>of(zkj9) : Optional.<Zkj9>empty();
  }
  
  private Zkj9 Zm(Zmnm paramZmnm) {
    Ztpr ztpr = Zl0.ZJ(paramZmnm.ZOe());
    String str = ztpr.ZJO();
    Zlah zlah = paramZmnm.ZVZ(this.Zm);
    Icon icon = (new Zeod(ztpr.ZJC().ZB())).Zh(zlah);
    return Zsn5.Zy(str, icon);
  }
  
  private void Ze(Zkj9 paramZkj9, TreePath paramTreePath, Zn1 paramZn1) {
    int[] arrayOfInt = Ztpr.ZJx();
    if (this.Zo.isCollapsed(paramTreePath)) {
      paramZkj9.add(Ztsr.ZW(paramZn1, 525312));
      if (arrayOfInt != null) {
        paramZkj9.add(Ztsr.ZW(paramZn1, 525376));
        return;
      } 
      return;
    } 
    paramZkj9.add(Ztsr.ZW(paramZn1, 525376));
  }
  
  private void Zv(Zkj9 paramZkj9, Zn1 paramZn1) {
    if (this.ZM != null)
      paramZkj9.add(Ztsr.ZW(paramZn1, 530688)); 
    paramZkj9.add(Ztsr.ZW(paramZn1, 530944));
  }
  
  private static void Zy(Zkj9 paramZkj9) {
    paramZkj9.add(new Zem9());
  }
  
  private static TreePath lambda$buildMenu$1(TreePath paramTreePath) {
    return paramTreePath;
  }
  
  private void lambda$doPopup$0(MouseEvent paramMouseEvent, Zkj9 paramZkj9) {
    Point point = paramMouseEvent.getPoint();
    paramZkj9.show(this.Zo, point.x, point.y);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zehd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */