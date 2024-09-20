package burp;

import java.util.regex.Pattern;

public class Zrjc<T extends Zm6k<T>> {
  private final Zkjb Zu;
  
  private final T Zf;
  
  Zrjc(Zkjb paramZkjb, T paramT) {
    this.Zu = paramZkjb;
    this.Zf = paramT;
  }
  
  public T Zj(Zm3v<String> paramZm3v) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zm6k;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> ZB : (Lburp/Zrjc;Lburp/Zm3v;)Lburp/Zxwz;
    //   11: invokeinterface ZW : (Lburp/Zxwz;)V
    //   16: aload_0
    //   17: getfield Zf : Lburp/Zm6k;
    //   20: areturn
  }
  
  public T Zd(Zm3v<String> paramZm3v) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zm6k;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> ZB : (Lburp/Zrjc;Lburp/Zm3v;)Lburp/Zxwz;
    //   11: invokeinterface ZW : (Lburp/Zxwz;)V
    //   16: aload_0
    //   17: getfield Zf : Lburp/Zm6k;
    //   20: areturn
  }
  
  public T Zx() {
    this.Zf.ZW(this::lambda$removing$3);
    return this.Zf;
  }
  
  private Zefx lambda$removing$3(Zlpr paramZlpr, Zefx paramZefx, Zzvw paramZzvw) {
    if (!this.Zu.empty.isEmpty())
      paramZlpr.Zw(this.Zu.empty); 
    return this.Zu.Z_.Zl(paramZlpr, paramZefx, this.Zu.empty);
  }
  
  private Zefx lambda$replacing$2(Zm3v<String> paramZm3v, Zlpr paramZlpr, Zefx paramZefx, Zzvw paramZzvw) {
    String str = paramZm3v.Zm(paramZzvw);
    paramZlpr.Zw(str);
    return this.Zu.Z_.Zl(paramZlpr, paramZefx, str);
  }
  
  private Zefx lambda$appending$1(Zm3v<String> paramZm3v, Zlpr paramZlpr, Zefx paramZefx, Zzvw paramZzvw) {
    String str1 = this.Zu.ZD.apply(paramZefx);
    String str2 = paramZm3v.Zm(paramZzvw);
    paramZlpr.Zw(str2);
    return this.Zu.Z_.Zl(paramZlpr, paramZefx, ((str1 == null) ? "" : str1) + ((str1 == null) ? "" : str1));
  }
  
  private Zefx lambda$regexReplace$0(Zm3v<String> paramZm3v, Pattern paramPattern, Zlpr paramZlpr, Zefx paramZefx, Zzvw paramZzvw) {
    String str = paramZm3v.Zm(paramZzvw);
    paramZlpr.Zn(str.getBytes());
    return this.Zu.Z_.Zl(paramZlpr, paramZefx, paramPattern.matcher(this.Zu.ZD.apply(paramZefx)).replaceAll(str));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrjc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */