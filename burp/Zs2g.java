package burp;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zs2g implements Zgl9 {
  private final List<Zbof> Zw = new CopyOnWriteArrayList<>();
  
  private final Zr_4 ZE;
  
  private final Zrgd ZG;
  
  private final Zg0s Zq;
  
  public Zs2g(Zr_4 paramZr_4, Zrgd paramZrgd, Zg0s paramZg0s) {
    this.ZE = paramZr_4;
    this.ZG = paramZrgd;
    this.Zq = paramZg0s;
  }
  
  public void Zl(Zlli<Zt10> paramZlli) {
    paramZlli.ZE(Zt10.Zz, this::lambda$subscribeTo$0);
    paramZlli.ZE(Zt10.ZN, this::lambda$subscribeTo$1);
    paramZlli.ZE(Zt10.Zf, this::lambda$subscribeTo$2);
  }
  
  public void Zp(int paramInt, Ztbg paramZtbg) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual Z_ : ()Ljava/util/List;
    //   4: aload_0
    //   5: iload_1
    //   6: <illegal opcode> accept : (Lburp/Zs2g;I)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: aload_2
    //   17: invokevirtual ZB : ()Ljava/util/List;
    //   20: aload_0
    //   21: iload_1
    //   22: <illegal opcode> accept : (Lburp/Zs2g;I)Ljava/util/function/Consumer;
    //   27: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   32: aload_2
    //   33: invokevirtual ZE : ()Ljava/util/List;
    //   36: aload_0
    //   37: iload_1
    //   38: <illegal opcode> accept : (Lburp/Zs2g;I)Ljava/util/function/Consumer;
    //   43: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   48: aload_2
    //   49: invokevirtual Zw : ()Ljava/util/List;
    //   52: aload_0
    //   53: iload_1
    //   54: <illegal opcode> accept : (Lburp/Zs2g;I)Ljava/util/function/Consumer;
    //   59: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   64: aload_2
    //   65: invokevirtual Zq : ()Ljava/util/List;
    //   68: aload_0
    //   69: iload_1
    //   70: <illegal opcode> accept : (Lburp/Zs2g;I)Ljava/util/function/Consumer;
    //   75: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   80: aload_2
    //   81: invokevirtual Zz : ()Ljava/util/List;
    //   84: aload_0
    //   85: iload_1
    //   86: <illegal opcode> accept : (Lburp/Zs2g;I)Ljava/util/function/Consumer;
    //   91: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   96: return
  }
  
  private void Zj(Zrnp paramZrnp) {
    String[] arrayOfString = Zg0s.ZW();
    for (Zbof zbof : this.Zw) {
      zbof.Zh(paramZrnp.ZF().stream().map(Zk7x::Zxp).toList());
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void Zy(Zmdd paramZmdd) {
    String[] arrayOfString = Zg0s.ZW();
    for (Zbof zbof : this.Zw) {
      zbof.ZV(paramZmdd.Zq());
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void ZJ(Zs7k paramZs7k) {
    String[] arrayOfString = Zg0s.ZW();
    for (Zbof zbof : this.Zw) {
      zbof.ZV(Collections.singletonList(paramZs7k.Zp()));
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public void Zl(Zbof paramZbof) {
    this.Zw.add(paramZbof);
  }
  
  public void Zu(Zbof paramZbof) {
    this.Zw.remove(paramZbof);
  }
  
  private void ZK(int paramInt, Zrdb paramZrdb, Zb9y paramZb9y) {
    int i;
    String[] arrayOfString = Zg0s.ZW();
    synchronized (this.Zq) {
      i = this.Zq.size();
      this.Zq.add(this.ZE.<Zb2e>ZH(new Zmww(paramInt, this.ZG.ZX(), paramZb9y, paramZrdb, i)));
    } 
    for (Zbof zbof : this.Zw) {
      zbof.ZP(paramZrdb, paramZb9y, i);
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public void Za(List<Zb2e> paramList, int paramInt1, int paramInt2) {
    String[] arrayOfString = Zg0s.ZW();
    for (Zbof zbof : this.Zw) {
      zbof.Zl(paramList, paramInt1, paramInt2);
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void lambda$newEvents$8(int paramInt, Zrdb paramZrdb) {
    ZK(paramInt, paramZrdb, Zb9y.ISSUE_UPDATED_WITH_IN_BAND_AND_OUT_BAND_DATA);
  }
  
  private void lambda$newEvents$7(int paramInt, Zrdb paramZrdb) {
    ZK(paramInt, paramZrdb, Zb9y.ISSUE_FOUND);
  }
  
  private void lambda$newEvents$6(int paramInt, Zrdb paramZrdb) {
    ZK(paramInt, paramZrdb, Zb9y.ISSUE_DELETED);
  }
  
  private void lambda$newEvents$5(int paramInt, Zrdb paramZrdb) {
    ZK(paramInt, paramZrdb, Zb9y.ISSUE_UPDATED_WITH_INFILTRATOR_DATA);
  }
  
  private void lambda$newEvents$4(int paramInt, Zrdb paramZrdb) {
    ZK(paramInt, paramZrdb, Zb9y.ISSUE_UPDATED_WITH_IN_BAND_DATA);
  }
  
  private void lambda$newEvents$3(int paramInt, Zrdb paramZrdb) {
    ZK(paramInt, paramZrdb, Zb9y.ISSUE_UPDATED_WITH_OUT_BAND_DATA);
  }
  
  private void lambda$subscribeTo$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZJ);
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zy);
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs2g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */