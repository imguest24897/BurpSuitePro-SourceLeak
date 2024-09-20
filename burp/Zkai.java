package burp;

import java.util.List;
import java.util.Objects;
import net.portswigger.Z_x;
import net.portswigger.Zal;
import net.portswigger.Zec;
import net.portswigger.Zi4;
import net.portswigger.Zko;

class Zkai implements Zko {
  final List Zi;
  
  final List Zg;
  
  final List Zk;
  
  final List ZE;
  
  final List ZH;
  
  final Zzxj ZA;
  
  Zkai(Zzxj paramZzxj, List paramList1, List paramList2, List paramList3, List paramList4, List paramList5) {}
  
  public void Zc(Z_x paramZ_x) {
    // Byte code:
    //   0: invokestatic ZV : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: getfield Zg : Ljava/util/List;
    //   8: invokeinterface isEmpty : ()Z
    //   13: ifeq -> 37
    //   16: aload_0
    //   17: getfield Zi : Ljava/util/List;
    //   20: aload_0
    //   21: getfield Zg : Ljava/util/List;
    //   24: invokestatic Zv : (Ljava/util/List;)Ljava/util/List;
    //   27: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   32: pop
    //   33: iload_2
    //   34: ifne -> 75
    //   37: aload_1
    //   38: getfield Zg : Ljava/util/List;
    //   41: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   46: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   51: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   56: aload_0
    //   57: getfield Zi : Ljava/util/List;
    //   60: dup
    //   61: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   64: pop
    //   65: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   70: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   75: aload_1
    //   76: getfield ZL : Ljava/util/List;
    //   79: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   84: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   89: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   94: aload_0
    //   95: getfield Zk : Ljava/util/List;
    //   98: dup
    //   99: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   102: pop
    //   103: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   108: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   113: return
  }
  
  public void Zn(Zal paramZal) {
    Objects.requireNonNull(this.ZE);
    paramZal.ZY.stream().map(this::lambda$visit$2).forEach(this.ZE::add);
    Objects.requireNonNull(this.ZH);
    paramZal.ZQ.stream().map(this::lambda$visit$2).forEach(this.ZH::add);
  }
  
  private Zmy8 lambda$visit$2(Zi4 paramZi4) {
    return this.ZA.Za.<Zmy8>ZH(new Zmks(true, this.ZA.Zx(paramZi4.ZN), paramZi4.ZS, paramZi4.Zz, paramZi4.ZD));
  }
  
  private static String lambda$visit$0(Zec paramZec) {
    return paramZec.ZZ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkai.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */