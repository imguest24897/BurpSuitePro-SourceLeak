package burp;

import java.net.Socket;

class Zei5 {
  private final Zgzx Zy;
  
  private final Zrj_<String> ZU;
  
  private final Zrj_<Zmzk> ZJ;
  
  private final Zg6h Zk;
  
  Zei5(Zxdt paramZxdt, Zgzx paramZgzx, Zg6h paramZg6h) {
    this.Zy = paramZgzx;
    this.ZU = paramZxdt.ZR();
    this.ZJ = paramZxdt.ZP();
    this.Zk = paramZg6h;
  }
  
  Zb43 Zs(Socket paramSocket, Zmzk paramZmzk) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zy : Lburp/Zgzx;
    //   4: invokeinterface Zi : ()Z
    //   9: ifne -> 31
    //   12: new burp/Zb43
    //   15: dup
    //   16: aload_1
    //   17: aload_2
    //   18: aload_0
    //   19: getfield Zk : Lburp/Zg6h;
    //   22: invokeinterface Zt : ()J
    //   27: invokespecial <init> : (Ljava/net/Socket;Lburp/Zmzk;J)V
    //   30: areturn
    //   31: aload_0
    //   32: getfield Zy : Lburp/Zgzx;
    //   35: invokeinterface ZL : ()Z
    //   40: ifeq -> 52
    //   43: aload_0
    //   44: <illegal opcode> accept : (Lburp/Zei5;)Ljava/util/function/Consumer;
    //   49: goto -> 59
    //   52: aload_0
    //   53: aload_2
    //   54: <illegal opcode> accept : (Lburp/Zei5;Lburp/Zmzk;)Ljava/util/function/Consumer;
    //   59: astore_3
    //   60: new burp/Zb43
    //   63: dup
    //   64: aload_1
    //   65: aload_2
    //   66: aload_3
    //   67: aload_0
    //   68: getfield Zk : Lburp/Zg6h;
    //   71: invokeinterface Zt : ()J
    //   76: invokespecial <init> : (Ljava/net/Socket;Lburp/Zmzk;Ljava/util/function/Consumer;J)V
    //   79: areturn
  }
  
  private void lambda$from$1(Zmzk paramZmzk, Zb43 paramZb43) {
    this.ZJ.Zn(paramZmzk, paramZb43);
  }
  
  private void lambda$from$0(Zb43 paramZb43) {
    this.ZU.Zn(this.Zy.ZE(), paramZb43);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zei5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */