package burp;

import burp.api.montoya.ui.contextmenu.ContextMenuItemsProvider;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.Action;

public class Zesk {
  private final Zeu1 ZC;
  
  private final ContextMenuItemsProvider Zq;
  
  private final Zzqf ZU;
  
  private final Zskl ZW;
  
  public Zesk(Zeu1 paramZeu1, ContextMenuItemsProvider paramContextMenuItemsProvider, Zzqf paramZzqf, Zskl paramZskl) {
    this.ZC = paramZeu1;
    this.Zq = paramContextMenuItemsProvider;
    this.ZU = paramZzqf;
    this.ZW = paramZskl;
  }
  
  public String ZT() {
    return this.ZC.ZN();
  }
  
  public ContextMenuItemsProvider Zr() {
    return this.Zq;
  }
  
  public void Zv(List<Component> paramList, Zezw paramZezw) {
    // Byte code:
    //   0: new burp/Zsx
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Lburp/Zezw;)V
    //   8: astore #4
    //   10: invokestatic ZY : ()I
    //   13: new burp/Zrvy
    //   16: dup
    //   17: aload_2
    //   18: aload_0
    //   19: getfield ZU : Lburp/Zzqf;
    //   22: invokespecial <init> : (Lburp/Zezw;Lburp/Zzqf;)V
    //   25: astore #5
    //   27: new burp/Zrv5
    //   30: dup
    //   31: aload #4
    //   33: aload #5
    //   35: aload_0
    //   36: getfield ZU : Lburp/Zzqf;
    //   39: invokespecial <init> : (Lburp/Zezw;Lburp/api/montoya/ui/contextmenu/AuditIssueContextMenuEvent;Lburp/Zzqf;)V
    //   42: astore #6
    //   44: istore_3
    //   45: aload_2
    //   46: invokeinterface Zc : ()Z
    //   51: ifeq -> 99
    //   54: aload_0
    //   55: getfield Zq : Lburp/api/montoya/ui/contextmenu/ContextMenuItemsProvider;
    //   58: aload #5
    //   60: invokeinterface provideMenuItems : (Lburp/api/montoya/ui/contextmenu/AuditIssueContextMenuEvent;)Ljava/util/List;
    //   65: astore #7
    //   67: aload #7
    //   69: ifnull -> 82
    //   72: aload #7
    //   74: invokeinterface isEmpty : ()Z
    //   79: ifeq -> 152
    //   82: aload_0
    //   83: getfield Zq : Lburp/api/montoya/ui/contextmenu/ContextMenuItemsProvider;
    //   86: aload #6
    //   88: invokeinterface provideMenuItems : (Lburp/api/montoya/ui/contextmenu/ContextMenuEvent;)Ljava/util/List;
    //   93: astore #7
    //   95: iload_3
    //   96: ifne -> 152
    //   99: aload_2
    //   100: invokeinterface ZC : ()Z
    //   105: ifeq -> 139
    //   108: new burp/Zrm8
    //   111: dup
    //   112: aload_2
    //   113: aload_0
    //   114: getfield ZW : Lburp/Zskl;
    //   117: invokespecial <init> : (Lburp/Zezw;Lburp/Zskl;)V
    //   120: astore #8
    //   122: aload_0
    //   123: getfield Zq : Lburp/api/montoya/ui/contextmenu/ContextMenuItemsProvider;
    //   126: aload #8
    //   128: invokeinterface provideMenuItems : (Lburp/api/montoya/ui/contextmenu/WebSocketContextMenuEvent;)Ljava/util/List;
    //   133: astore #7
    //   135: iload_3
    //   136: ifne -> 152
    //   139: aload_0
    //   140: getfield Zq : Lburp/api/montoya/ui/contextmenu/ContextMenuItemsProvider;
    //   143: aload #6
    //   145: invokeinterface provideMenuItems : (Lburp/api/montoya/ui/contextmenu/ContextMenuEvent;)Ljava/util/List;
    //   150: astore #7
    //   152: aload #7
    //   154: ifnull -> 186
    //   157: aload #7
    //   159: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   164: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   169: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   174: aload_0
    //   175: aload_1
    //   176: <illegal opcode> accept : (Lburp/Zesk;Ljava/util/List;)Ljava/util/function/Consumer;
    //   181: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   186: return
  }
  
  private void lambda$getContextMenuItems$0(List<Component> paramList, Component paramComponent) {
    int i = Zlzj.ZY();
    if (paramComponent instanceof AbstractButton) {
      AbstractButton abstractButton = (AbstractButton)paramComponent;
      Action action = abstractButton.getAction();
      if (action != null)
        abstractButton.setAction(new Zt01(action, this.ZC.ZJ())); 
      ActionListener[] arrayOfActionListener = abstractButton.getActionListeners();
      int j = arrayOfActionListener.length;
      byte b = 0;
      while (b < j) {
        ActionListener actionListener = arrayOfActionListener[b];
        if (!(actionListener instanceof Action)) {
          abstractButton.removeActionListener(actionListener);
          abstractButton.addActionListener(new Zsx1(actionListener, this.ZC.ZJ()));
        } 
        b++;
        if (i == 0)
          break; 
      } 
    } 
    paramList.add(paramComponent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */