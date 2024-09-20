package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.Arrays;

public class Zgoe extends Zbqc {
  public Zgoe() {
    setLayout(new Zv(this, 0));
  }
  
  protected void addImpl(Component paramComponent, Object paramObject, int paramInt) {
    super.addImpl(paramComponent, paramObject, paramInt);
    if (paramComponent instanceof Zz81)
      Zz((Zz81)paramComponent); 
  }
  
  private void Zz(Zz81 paramZz81) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZX : ()Z
    //   4: ifeq -> 28
    //   7: aload_1
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> itemStateChanged : (Lburp/Zgoe;Lburp/Zz81;)Ljava/awt/event/ItemListener;
    //   15: invokevirtual addItemListener : (Ljava/awt/event/ItemListener;)V
    //   18: aload_1
    //   19: aload_1
    //   20: <illegal opcode> actionPerformed : (Lburp/Zz81;)Ljava/awt/event/ActionListener;
    //   25: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   28: return
  }
  
  private static void lambda$addFilterButton$5(Zz81 paramZz81, ActionEvent paramActionEvent) {
    if (!paramZz81.isSelected())
      paramZz81.setSelected(true); 
  }
  
  private void lambda$addFilterButton$4(Zz81 paramZz81, ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1)
      Arrays.<Component>stream(getComponents()).filter(Zgoe::lambda$addFilterButton$0).map(Zgoe::lambda$addFilterButton$1).filter(paramZz81::lambda$addFilterButton$2).forEach(Zgoe::lambda$addFilterButton$3); 
  }
  
  private static void lambda$addFilterButton$3(Zz81 paramZz81) {
    paramZz81.setSelected(false);
  }
  
  private static boolean lambda$addFilterButton$2(Zz81 paramZz811, Zz81 paramZz812) {
    return !paramZz812.equals(paramZz811);
  }
  
  private static Zz81 lambda$addFilterButton$1(Component paramComponent) {
    return (Zz81)paramComponent;
  }
  
  private static boolean lambda$addFilterButton$0(Component paramComponent) {
    return paramComponent instanceof Zz81;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgoe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */