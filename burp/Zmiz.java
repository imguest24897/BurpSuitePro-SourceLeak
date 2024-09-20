package burp;

import javafx.collections.ObservableList;

class Zmiz extends Zmuc<Zll9> {
  private final ObservableList<Zll9> ZR;
  
  Zmiz(ObservableList<Zll9> paramObservableList) {
    super(new Zgq6(), paramObservableList);
    this.ZR = paramObservableList;
  }
  
  void ZO(Zll9 paramZll9) {
    String str = Zl41.ZU();
    for (Zll9 zll9 : this.ZR) {
      if (Zewd.ZI(paramZll9.ZoO(), zll9.ZoO()))
        return; 
      if (str != null)
        break; 
    } 
    this.ZR.add(paramZll9);
  }
  
  void ZZ() {
    this.ZR.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmiz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */