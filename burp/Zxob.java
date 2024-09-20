package burp;

import java.util.List;

public class Zxob implements Zmsc {
  private final Ztai ZP;
  
  public Zxob(Ztai paramZtai) {
    this.ZP = paramZtai;
  }
  
  public List<Zrd9> ZO(Zzua paramZzua) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZA : ()Ljava/util/stream/Stream;
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: <illegal opcode> accept : (Lburp/Zxob;Lburp/Zzua;Ljava/util/List;)Ljava/util/function/Consumer;
    //   19: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   24: aload_2
    //   25: areturn
  }
  
  private void lambda$getTasksOfType$0(Zzua paramZzua, List<Zrd9> paramList, Zzu2 paramZzu2) {
    Zmx2 zmx2 = paramZzu2.Zu();
    if (paramZzu2.ZD().contains(paramZzua) && this.ZP.Zr(paramZzu2))
      paramList.addAll(zmx2.ZK()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxob.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */