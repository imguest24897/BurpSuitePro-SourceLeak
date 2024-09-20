package burp;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Zm9r extends Zm99 {
  private final List<String> Zt;
  
  private final Zkj9 ZB;
  
  private final List<Consumer<Integer>> Z_;
  
  private int ZW = -1;
  
  public Zm9r() {
    setIcon(Zbz3.ZK(Zxpj.COMBO_OPEN));
    setHorizontalTextPosition(2);
    setIconTextGap(5);
    setFocusable(false);
    Zkrc zkrc = new Zkrc(this);
    addMouseListener(zkrc);
    this.Zt = new ArrayList<>();
    this.ZB = new Zkj9();
    this.Z_ = new ArrayList<>();
  }
  
  public void Zx(Consumer<Integer> paramConsumer) {
    this.Z_.add(paramConsumer);
  }
  
  public List<Consumer<Integer>> ZH() {
    return Zb99.ZX(this.Z_);
  }
  
  public void Zc() {
    this.Z_.clear();
  }
  
  public void Zq(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zt : Ljava/util/List;
    //   4: invokeinterface isEmpty : ()Z
    //   9: ifeq -> 22
    //   12: aload_0
    //   13: iconst_0
    //   14: putfield ZW : I
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual setText : (Ljava/lang/String;)V
    //   22: aload_0
    //   23: getfield Zt : Ljava/util/List;
    //   26: aload_1
    //   27: invokeinterface add : (Ljava/lang/Object;)Z
    //   32: pop
    //   33: aload_0
    //   34: getfield Zt : Ljava/util/List;
    //   37: invokeinterface size : ()I
    //   42: iconst_1
    //   43: isub
    //   44: istore_2
    //   45: new burp/Zepe
    //   48: dup
    //   49: aload_1
    //   50: invokespecial <init> : (Ljava/lang/String;)V
    //   53: astore_3
    //   54: aload_3
    //   55: aload_0
    //   56: iload_2
    //   57: <illegal opcode> actionPerformed : (Lburp/Zm9r;I)Ljava/awt/event/ActionListener;
    //   62: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   65: aload_0
    //   66: getfield ZB : Lburp/Zkj9;
    //   69: aload_3
    //   70: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   73: pop
    //   74: return
  }
  
  public void Zs() {
    this.ZB.removeAll();
    this.Zt.clear();
  }
  
  public void Z_(int paramInt) {
    ZX(paramInt);
  }
  
  public void Zs(int paramInt) {
    this.ZW = paramInt;
    setText(this.Zt.get(paramInt));
  }
  
  public int Zb() {
    return this.ZW;
  }
  
  private void ZX(int paramInt) {
    Zs(paramInt);
    this.Z_.forEach(paramInt::lambda$selectionChanged$1);
  }
  
  private static void lambda$selectionChanged$1(int paramInt, Consumer<Integer> paramConsumer) {
    paramConsumer.accept(Integer.valueOf(paramInt));
  }
  
  private void lambda$addItem$0(int paramInt, ActionEvent paramActionEvent) {
    ZX(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */