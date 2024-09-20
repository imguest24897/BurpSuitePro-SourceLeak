package burp;

import java.util.ArrayList;
import java.util.List;

public class Zten implements Zgtp {
  private final List<Zgtp> ZC = new ArrayList<>();
  
  public void Zu(Zgtp paramZgtp) {
    this.ZC.add(paramZgtp);
  }
  
  public void Zy(Zgtp paramZgtp) {
    this.ZC.remove(paramZgtp);
  }
  
  public void ZH() {
    this.ZC.clear();
  }
  
  public void Zj(int paramInt1, int paramInt2, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Ljava/util/List;
    //   4: iload_1
    //   5: iload_2
    //   6: aload_3
    //   7: <illegal opcode> accept : (IILjava/lang/String;)Ljava/util/function/Consumer;
    //   12: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   17: return
  }
  
  public void ZO(int paramInt1, int paramInt2, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Ljava/util/List;
    //   4: iload_1
    //   5: iload_2
    //   6: aload_3
    //   7: <illegal opcode> accept : (IILjava/lang/String;)Ljava/util/function/Consumer;
    //   12: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   17: return
  }
  
  public void Zz(int paramInt1, int paramInt2, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Ljava/util/List;
    //   4: iload_1
    //   5: iload_2
    //   6: aload_3
    //   7: <illegal opcode> accept : (IILjava/lang/String;)Ljava/util/function/Consumer;
    //   12: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   17: return
  }
  
  private static void lambda$webSocketMessageSelectionChanged$2(int paramInt1, int paramInt2, String paramString, Zgtp paramZgtp) {
    paramZgtp.Zz(paramInt1, paramInt2, paramString);
  }
  
  private static void lambda$responseSelectionChanged$1(int paramInt1, int paramInt2, String paramString, Zgtp paramZgtp) {
    paramZgtp.ZO(paramInt1, paramInt2, paramString);
  }
  
  private static void lambda$requestSelectionChanged$0(int paramInt1, int paramInt2, String paramString, Zgtp paramZgtp) {
    paramZgtp.Zj(paramInt1, paramInt2, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zten.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */