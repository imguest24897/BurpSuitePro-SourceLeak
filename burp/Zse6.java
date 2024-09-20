package burp;

import java.util.Objects;

class Zse6 {
  static int ZP(Zk94 paramZk94) {
    return (paramZk94 == null) ? 0 : Objects.hash(new Object[] { paramZk94.ZZX(), paramZk94.ZZZ() });
  }
  
  static boolean Z_(Zk94 paramZk94, Object paramObject) {
    return (paramZk94.ZF(paramObject) || (paramObject instanceof Zk94 && Zz(paramZk94, (Zk94)paramObject)));
  }
  
  private static boolean Zz(Zk94 paramZk941, Zk94 paramZk942) {
    return (Objects.equals(paramZk941.ZZX(), paramZk942.ZZX()) && Objects.equals(paramZk941.ZZZ(), paramZk942.ZZZ()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zse6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */