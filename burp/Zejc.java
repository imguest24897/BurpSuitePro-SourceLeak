package burp;

public interface Zejc<S extends Zg0z, E extends Zvb> {
  S ZH();
  
  S Zg(S paramS, E paramE);
  
  void ZJ(S paramS);
  
  static Zk2f<Zg0z, Zvb> ZM() {
    return Zb(Zg0z.class, Zvb.class);
  }
  
  static <S extends Zg0z, E extends Zvb> Zk2f<S, E> Zb(Class<S> paramClass, Class<E> paramClass1) {
    return new Zk2f<>();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zejc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */