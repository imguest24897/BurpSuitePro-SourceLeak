package burp;

import java.awt.Window;
import java.util.Objects;

public class Zt6p {
  private final Window ZY;
  
  private final Zmlq Ze;
  
  private final Zmrj Zu;
  
  private final Zm6x ZT;
  
  public Zt6p(Window paramWindow, Zmlq paramZmlq, Zmrj paramZmrj, Zm6x paramZm6x) {
    this.ZY = paramWindow;
    this.Ze = paramZmlq;
    this.Zu = paramZmrj;
    this.ZT = paramZm6x;
  }
  
  public boolean Zg(Ze3h paramZe3h) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZZ : ()Ljava/util/List;
    //   4: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   9: getstatic burp/Zv8r.TARGET_SITE_MAP_NOTES_ADDED_VIA_CONTEXT_MENU : Lburp/Zv8r;
    //   12: aload_0
    //   13: getfield ZY : Ljava/awt/Window;
    //   16: aload_0
    //   17: <illegal opcode> accept : (Lburp/Zt6p;)Ljava/util/function/Consumer;
    //   22: aload_0
    //   23: aload_1
    //   24: <illegal opcode> run : (Lburp/Zt6p;Lburp/Ze3h;)Ljava/lang/Runnable;
    //   29: invokestatic ZB : (Ljava/util/List;Ljava/util/function/Function;Lnet/portswigger/Zzr;Ljava/awt/Component;Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   32: iconst_1
    //   33: ireturn
  }
  
  private void lambda$exec$3(Ze3h paramZe3h) {
    Objects.requireNonNull(Ztzs.class);
    Objects.requireNonNull(Ztzs.class);
    this.ZT.ZB(new Zmkn(paramZe3h.ZZ().stream().map(Zt6p::lambda$exec$2).filter(Ztzs.class::isInstance).map(Ztzs.class::cast).toList()));
  }
  
  private static Zez3 lambda$exec$2(Zz_1 paramZz_1) {
    return ((Zxya)paramZz_1.Z_()).ZX;
  }
  
  private void lambda$exec$1(Zz_1 paramZz_1) {
    this.Zu.Zt(paramZz_1);
    this.Ze.ZC();
  }
  
  private static Zxya lambda$exec$0(Zz_1 paramZz_1) {
    return (Zxya)paramZz_1.Z_();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt6p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */