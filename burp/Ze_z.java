package burp;

import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zto;

public class Ze_z {
  public static final Zto<Integer, Integer> ZA = Zto.ZM(Integer.valueOf(-1), Integer.valueOf(-1));
  
  private final AtomicReference<Zto<Integer, Integer>> Zk = new AtomicReference<>(ZA);
  
  public void ZI(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zk : Ljava/util/concurrent/atomic/AtomicReference;
    //   4: iload_1
    //   5: iload_2
    //   6: <illegal opcode> apply : (II)Ljava/util/function/UnaryOperator;
    //   11: invokevirtual getAndUpdate : (Ljava/util/function/UnaryOperator;)Ljava/lang/Object;
    //   14: pop
    //   15: return
  }
  
  public Zto<Integer, Integer> ZY() {
    return this.Zk.getAndSet(ZA);
  }
  
  private static Zto lambda$updateRows$0(int paramInt1, int paramInt2, Zto<Integer, Integer> paramZto) {
    if (paramZto == ZA)
      return Zto.ZM(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2)); 
    int i = ((Integer)paramZto.Zq).intValue();
    int j = ((Integer)paramZto.Zo).intValue();
    int k = Math.min(i, paramInt1);
    int m = Math.max(j, paramInt2);
    return Zto.ZM(Integer.valueOf(k), Integer.valueOf(m));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */