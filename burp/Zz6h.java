package burp;

import java.util.Iterator;
import java.util.List;

public class Zz6h<T extends Zm6k<T>> {
  private final Zxwu ZH;
  
  private final T Zi;
  
  Zz6h(Zxwu paramZxwu, T paramT) {
    this.ZH = paramZxwu;
    this.Zi = paramT;
  }
  
  public T ZD(Zm3v<String> paramZm3v) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Zm6k;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> ZB : (Lburp/Zz6h;Lburp/Zm3v;)Lburp/Zxwz;
    //   11: invokeinterface ZW : (Lburp/Zxwz;)V
    //   16: aload_0
    //   17: getfield Zi : Lburp/Zm6k;
    //   20: areturn
  }
  
  public T Z_(Zm3v<String> paramZm3v1, Zm3v<String> paramZm3v2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Zm6k;
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: <illegal opcode> ZB : (Lburp/Zz6h;Lburp/Zm3v;Lburp/Zm3v;)Lburp/Zxwz;
    //   12: invokeinterface ZW : (Lburp/Zxwz;)V
    //   17: aload_0
    //   18: getfield Zi : Lburp/Zm6k;
    //   21: areturn
  }
  
  public T ZO(Zm3v<String> paramZm3v) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Zm6k;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> ZB : (Lburp/Zz6h;Lburp/Zm3v;)Lburp/Zxwz;
    //   11: invokeinterface ZW : (Lburp/Zxwz;)V
    //   16: aload_0
    //   17: getfield Zi : Lburp/Zm6k;
    //   20: areturn
  }
  
  public T Zq(Zm3v<String> paramZm3v1, Zm3v<String> paramZm3v2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Zm6k;
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: <illegal opcode> ZB : (Lburp/Zz6h;Lburp/Zm3v;Lburp/Zm3v;)Lburp/Zxwz;
    //   12: invokeinterface ZW : (Lburp/Zxwz;)V
    //   17: aload_0
    //   18: getfield Zi : Lburp/Zm6k;
    //   21: areturn
  }
  
  public T Zl(Zm3v<String> paramZm3v) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Zm6k;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> ZB : (Lburp/Zz6h;Lburp/Zm3v;)Lburp/Zxwz;
    //   11: invokeinterface ZW : (Lburp/Zxwz;)V
    //   16: aload_0
    //   17: getfield Zi : Lburp/Zm6k;
    //   20: areturn
  }
  
  private Zefx lambda$replacing$4(Zm3v<String> paramZm3v, Zlpr paramZlpr, Zefx paramZefx, Zzvw paramZzvw) {
    String str = paramZm3v.Zm(paramZzvw);
    return this.ZH.Zg.Zs(paramZlpr, paramZefx, str);
  }
  
  private Zefx lambda$replacing$3(Zm3v<String> paramZm3v1, Zm3v<String> paramZm3v2, Zlpr paramZlpr, Zefx paramZefx, Zzvw paramZzvw) {
    return this.ZH.Zg.Zs(paramZlpr, paramZefx, this.ZH.Zd.apply(paramZm3v1.Zm(paramZzvw), paramZm3v2.Zm(paramZzvw)));
  }
  
  private Zefx lambda$adding$2(Zm3v<String> paramZm3v, Zlpr paramZlpr, Zefx paramZefx, Zzvw paramZzvw) {
    String str = paramZm3v.Zm(paramZzvw);
    List<Zex9> list = Zex9.ZQ(str.getBytes());
    Iterator<Zex9> iterator = list.iterator();
    int[] arrayOfInt = Zmgt.ZK();
    while (iterator.hasNext()) {
      Zex9 zex9 = iterator.next();
      paramZefx = this.ZH.ZD.Zs(paramZlpr, paramZefx, this.ZH.Zd.apply(zex9.ZmJ(), zex9.ZmH()));
      if (arrayOfInt == null)
        break; 
    } 
    return paramZefx;
  }
  
  private Zefx lambda$adding$1(Zm3v<String> paramZm3v1, Zm3v<String> paramZm3v2, Zlpr paramZlpr, Zefx paramZefx, Zzvw paramZzvw) {
    return this.ZH.ZD.Zs(paramZlpr, paramZefx, this.ZH.Zd.apply(paramZm3v1.Zm(paramZzvw), paramZm3v2.Zm(paramZzvw)));
  }
  
  private Zefx lambda$removing$0(Zm3v<String> paramZm3v, Zlpr paramZlpr, Zefx paramZefx, Zzvw paramZzvw) {
    return this.ZH.Zb.Zs(paramZlpr, paramZefx, paramZm3v.Zm(paramZzvw));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */