package burp;

import java.awt.KeyboardFocusManager;
import java.util.Optional;
import net.portswigger.Zm2;

class Zsxc {
  final Zsti ZN;
  
  Zsxc(Zsti paramZsti) {}
  
  void Zj(int paramInt) {
    Zg(paramInt).ifPresent(Zsxc::lambda$hideSuiteComponentAtIndex$0);
  }
  
  void Zs(int paramInt) {
    Zg(paramInt).ifPresent(this::lambda$detachSuiteComponentAtIndex$1);
  }
  
  private Optional<Zl5t> Zg(int paramInt) {
    return Optional.ofNullable(this.ZN.ZN.ZS(paramInt));
  }
  
  private void lambda$detachSuiteComponentAtIndex$1(Zl5t paramZl5t) {
    Zl0q zl0q = this.ZN.ZX.ZSO();
    paramZl5t.Zk(Integer.valueOf(this.ZN.ZX.ZST().indexOf(zl0q)));
    Zq9.Zv(paramZl5t).ifPresent(Zm2::ZC);
  }
  
  private static void lambda$hideSuiteComponentAtIndex$0(Zl5t paramZl5t) {
    paramZl5t.ZT(true);
    Zq9.Zj(paramZl5t).ifPresent(Zm2::ZC);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsxc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */