package burp;

import java.util.Collections;

public class Zlb5 implements Zehc {
  private final Ze3n Zo;
  
  private static Zbqc[] ZE;
  
  public Zlb5(Ze3n paramZe3n) {
    this.Zo = paramZe3n;
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_GraphQlEndpointFound;
  }
  
  public Ztk8 Zb() {
    // Byte code:
    //   0: new burp/Zgq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Zj : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: getfield Zo : Lburp/Ze3n;
    //   15: invokestatic ZG : (Lburp/Ze3n;)Ljava/util/Optional;
    //   18: aload_0
    //   19: aload_2
    //   20: <illegal opcode> accept : (Lburp/Zlb5;Lburp/Zgq;)Ljava/util/function/Consumer;
    //   25: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   28: astore_1
    //   29: aload_2
    //   30: invokestatic Zy : (Lburp/Zgq;)Lburp/Ztk8;
    //   33: aload_1
    //   34: ifnull -> 44
    //   37: iconst_3
    //   38: anewarray burp/Zbqc
    //   41: invokestatic Zr : ([Lburp/Zbqc;)V
    //   44: areturn
  }
  
  private void lambda$doCheck$0(Zgq<Zrdb> paramZgq, Byte paramByte) {
    Zvow zvow = this.Zo.Zt().ZC(this.Zo.ZA()).Zo(this.Zo.ZL()).ZK(Zkh8.ZG(this.Zo.ZA()));
    paramZgq.Zu(Zr_5.Zq(Zzu2.GRAPHQL_ENDPOINT_FOUND, this.Zo.Za(), paramByte.byteValue(), this.Zo.ZA().ZF().Zd4(), Collections.singletonList(zvow)));
  }
  
  public static void Zn(Zbqc[] paramArrayOfZbqc) {
    ZE = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zj() {
    return ZE;
  }
  
  static {
    if (Zj() != null)
      Zn(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlb5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */