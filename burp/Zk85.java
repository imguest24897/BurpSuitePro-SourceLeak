package burp;

import java.util.HashMap;
import java.util.Map;

class Zk85 {
  private final Map<Zt77, Zble> ZC = new HashMap<>();
  
  void Zw(Zble paramZble) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zg : ()Lburp/Zmnm;
    //   4: invokeinterface ZO1 : ()Ljava/util/List;
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> accept : (Lburp/Zk85;Lburp/Zble;)Ljava/util/function/Consumer;
    //   16: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   21: return
  }
  
  void ZL(Zrdb paramZrdb) {
    this.ZC.remove(new Zt77(paramZrdb));
  }
  
  public Zble ZJ(Zrdb paramZrdb) {
    return this.ZC.get(new Zt77(paramZrdb));
  }
  
  private void lambda$add$0(Zble paramZble, Zrdb paramZrdb) {
    this.ZC.putIfAbsent(new Zt77(paramZrdb), paramZble);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk85.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */