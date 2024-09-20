package burp;

import java.util.Arrays;
import java.util.List;

public class Zgx9 implements Zevl {
  private final List<Zevl> ZX;
  
  public Zgx9(Zevl... paramVarArgs) {
    this.ZX = Arrays.asList(paramVarArgs);
  }
  
  public void Zk(Zsu paramZsu) {
    this.ZX.forEach(paramZsu::lambda$onHeadersFrameReceived$0);
  }
  
  public void Zn(Zss paramZss) {
    this.ZX.forEach(paramZss::lambda$onContinuationFrameReceived$1);
  }
  
  public void ZZ(Zs3 paramZs3) {
    this.ZX.forEach(paramZs3::lambda$onDataFrameReceived$2);
  }
  
  public void ZL(Zsq paramZsq) {
    this.ZX.forEach(paramZsq::lambda$onResetStreamFrameReceived$3);
  }
  
  public void ZS(Zs7 paramZs7) {
    this.ZX.forEach(paramZs7::lambda$onWindowUpdateFrameReceived$4);
  }
  
  public void Zv(Zs2 paramZs2) {
    this.ZX.forEach(paramZs2::lambda$onPushPromiseFrameReceived$5);
  }
  
  public void ZS(Zs9 paramZs9) {
    this.ZX.forEach(paramZs9::lambda$onPriorityFrameReceived$6);
  }
  
  private static void lambda$onPriorityFrameReceived$6(Zs9 paramZs9, Zevl paramZevl) {
    paramZevl.ZS(paramZs9);
  }
  
  private static void lambda$onPushPromiseFrameReceived$5(Zs2 paramZs2, Zevl paramZevl) {
    paramZevl.Zv(paramZs2);
  }
  
  private static void lambda$onWindowUpdateFrameReceived$4(Zs7 paramZs7, Zevl paramZevl) {
    paramZevl.ZS(paramZs7);
  }
  
  private static void lambda$onResetStreamFrameReceived$3(Zsq paramZsq, Zevl paramZevl) {
    paramZevl.ZL(paramZsq);
  }
  
  private static void lambda$onDataFrameReceived$2(Zs3 paramZs3, Zevl paramZevl) {
    paramZevl.ZZ(paramZs3);
  }
  
  private static void lambda$onContinuationFrameReceived$1(Zss paramZss, Zevl paramZevl) {
    paramZevl.Zn(paramZss);
  }
  
  private static void lambda$onHeadersFrameReceived$0(Zsu paramZsu, Zevl paramZevl) {
    paramZevl.Zk(paramZsu);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgx9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */