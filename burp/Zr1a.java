package burp;

class Zr1a extends Zr1e {
  final Ztew ZF;
  
  final Zgpi ZG;
  
  final Zk8q Za;
  
  Zr1a(Zk8q paramZk8q, Ztew paramZtew, Zgpi paramZgpi) {}
  
  public boolean Zs(Zm31 paramZm31) {
    return paramZm31 instanceof Zekb;
  }
  
  public void ZN(Zekb paramZekb) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : Lburp/Ztew;
    //   4: aload_0
    //   5: aload_0
    //   6: getfield ZG : Lburp/Zgpi;
    //   9: aload_1
    //   10: <illegal opcode> accept : (Lburp/Zr1a;Lburp/Zgpi;Lburp/Zekb;)Ljava/util/function/Consumer;
    //   15: invokevirtual ZN : (Ljava/util/function/Consumer;)V
    //   18: return
  }
  
  private void lambda$visitPersistableObjectField$0(Zgpi<?> paramZgpi, Zekb<?> paramZekb, Ztew paramZtew) {
    Object object = this.Za.ZK.apply(paramZgpi, paramZekb);
    if (object instanceof Zgpi) {
      Zgpi zgpi = (Zgpi)object;
      paramZtew.Zc(zgpi);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */