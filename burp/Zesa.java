package burp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.BiConsumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

final class Zesa<T, U> extends Record {
  private final Object Zz;
  
  private final Method Zl;
  
  private final BiConsumer<Throwable, Long> Ze;
  
  private Zesa(Object paramObject, Method paramMethod, BiConsumer<Throwable, Long> paramBiConsumer) {
    this.Zz = paramObject;
    this.Zl = paramMethod;
    this.Ze = paramBiConsumer;
  }
  
  U Zm(T paramT, long paramLong, U paramU) {
    try {
      return (U)this.Zl.invoke(this.Zz, new Object[] { paramT });
    } catch (IllegalAccessException illegalAccessException) {
      Zah.Zl(illegalAccessException, Zk_.UNEXPECTED);
    } catch (InvocationTargetException invocationTargetException) {
      this.Ze.accept(invocationTargetException.getTargetException(), Long.valueOf(paramLong));
      Zah.Zl(invocationTargetException, Zk_.USER_ERROR);
    } 
    return paramU;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zesa;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zesa;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zesa;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */