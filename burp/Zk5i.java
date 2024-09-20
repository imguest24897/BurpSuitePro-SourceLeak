package burp;

import java.util.List;

public class Zk5i implements Zt9d {
  private final Ztww Zd;
  
  private final boolean Zy;
  
  private final Zefg<Zmy8> Zh;
  
  private final Ztn0 Zk;
  
  Zk5i(Ztww paramZtww, boolean paramBoolean) {
    this.Zd = paramZtww;
    this.Zy = paramBoolean;
    this.Zh = new Zyu<>(Zmy8.Zc);
    this.Zk = new Zt_c(this.Zh);
  }
  
  void Ze(List<Zmy8> paramList) {
    this.Zh.clear();
    this.Zh.addAll(paramList);
    this.Zk.fireTableDataChanged();
  }
  
  public void ZC(Zz28 paramZz28) {}
  
  public void ZE(Zmy8 paramZmy8) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : Lburp/Zefg;
    //   4: invokeinterface size : ()I
    //   9: istore_3
    //   10: invokestatic ZF : ()[I
    //   13: aload_0
    //   14: getfield Zh : Lburp/Zefg;
    //   17: aload_1
    //   18: invokeinterface add : (Ljava/lang/Object;)Z
    //   23: pop
    //   24: astore_2
    //   25: aload_0
    //   26: getfield Zy : Z
    //   29: ifeq -> 46
    //   32: aload_0
    //   33: getfield Zd : Lburp/Ztww;
    //   36: aload_1
    //   37: invokeinterface ZA : (Lburp/Zmy8;)V
    //   42: aload_2
    //   43: ifnonnull -> 56
    //   46: aload_0
    //   47: getfield Zd : Lburp/Ztww;
    //   50: aload_1
    //   51: invokeinterface ZY : (Lburp/Zmy8;)V
    //   56: aload_0
    //   57: getfield Zk : Lburp/Ztn0;
    //   60: iload_3
    //   61: iload_3
    //   62: invokevirtual fireTableRowsInserted : (II)V
    //   65: return
  }
  
  public void Zz(Zmy8 paramZmy8, int paramInt) {
    // Byte code:
    //   0: invokestatic ZF : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Zh : Lburp/Zefg;
    //   8: iload_2
    //   9: aload_1
    //   10: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   15: pop
    //   16: aload_0
    //   17: getfield Zy : Z
    //   20: ifeq -> 38
    //   23: aload_0
    //   24: getfield Zd : Lburp/Ztww;
    //   27: aload_1
    //   28: iload_2
    //   29: invokeinterface ZU : (Lburp/Zmy8;I)V
    //   34: aload_3
    //   35: ifnonnull -> 49
    //   38: aload_0
    //   39: getfield Zd : Lburp/Ztww;
    //   42: aload_1
    //   43: iload_2
    //   44: invokeinterface ZZ : (Lburp/Zmy8;I)V
    //   49: aload_0
    //   50: getfield Zk : Lburp/Ztn0;
    //   53: iload_2
    //   54: iload_2
    //   55: invokevirtual fireTableRowsInserted : (II)V
    //   58: return
  }
  
  public void Zqd(int paramInt) {
    // Byte code:
    //   0: invokestatic ZF : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zh : Lburp/Zefg;
    //   8: iload_1
    //   9: invokeinterface remove : (I)Ljava/lang/Object;
    //   14: pop
    //   15: aload_0
    //   16: getfield Zy : Z
    //   19: ifeq -> 36
    //   22: aload_0
    //   23: getfield Zd : Lburp/Ztww;
    //   26: iload_1
    //   27: invokeinterface Zg : (I)V
    //   32: aload_2
    //   33: ifnonnull -> 46
    //   36: aload_0
    //   37: getfield Zd : Lburp/Ztww;
    //   40: iload_1
    //   41: invokeinterface ZO : (I)V
    //   46: aload_0
    //   47: getfield Zk : Lburp/Ztn0;
    //   50: iload_1
    //   51: iload_1
    //   52: invokevirtual fireTableRowsDeleted : (II)V
    //   55: return
  }
  
  public Zmy8 Zqa(int paramInt) {
    return this.Zh.get(paramInt);
  }
  
  public int ZAg() {
    return this.Zh.size();
  }
  
  public Ztn0 ZoQ() {
    return this.Zk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */