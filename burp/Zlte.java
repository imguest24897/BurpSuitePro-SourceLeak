package burp;

import java.awt.Color;
import java.awt.Component;
import java.util.Comparator;
import java.util.List;
import javax.swing.SingleSelectionModel;
import javax.swing.event.ChangeListener;

public interface Zlte extends ChangeListener, Zzyl, Zrog {
  Ztal Zj();
  
  void Zr(Ztal paramZtal);
  
  void Zt(int paramInt, Zr6e paramZr6e);
  
  void addTab(String paramString, Component paramComponent);
  
  void Zg(String paramString, Component paramComponent, Zliy<? extends Zr6e> paramZliy);
  
  void Zl(String paramString1, Component paramComponent, String paramString2, int paramInt);
  
  void Zm(String paramString1, Component paramComponent, Zliy<? extends Zr6e> paramZliy, String paramString2, int paramInt);
  
  void ZA(Zgah paramZgah, Component paramComponent, int paramInt);
  
  void ZQ(Zgah paramZgah, Component paramComponent, Zliy<? extends Zr6e> paramZliy, String paramString, int paramInt);
  
  default void Zi(int paramInt1, int paramInt2) {
    ZO(paramInt1, paramInt2, false);
  }
  
  default void ZO(int paramInt1, int paramInt2, boolean paramBoolean) {
    Zt(paramInt1, paramInt2, paramBoolean, true);
  }
  
  void Zt(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2);
  
  void ZE(int paramInt);
  
  default void Zc() {
    int i = getSelectedIndex();
    if (i != -1)
      ZE(i); 
  }
  
  void Z_(int paramInt, Color paramColor, boolean paramBoolean);
  
  void ZS(Color paramColor, boolean paramBoolean);
  
  void addChangeListener(ChangeListener paramChangeListener);
  
  SingleSelectionModel getModel();
  
  void setSelectedIndex(int paramInt);
  
  void setSelectedComponent(Component paramComponent);
  
  void setEnabledAt(int paramInt, boolean paramBoolean);
  
  boolean isEnabledAt(int paramInt);
  
  int getSelectedIndex();
  
  void setComponentAt(int paramInt, Component paramComponent);
  
  Component getSelectedComponent();
  
  int getTabCount();
  
  int indexOfComponent(Component paramComponent);
  
  int indexOfTab(String paramString);
  
  Component getComponentAt(int paramInt);
  
  void removeAll();
  
  void setTitleAt(int paramInt, String paramString);
  
  String getTitleAt(int paramInt);
  
  void Z_();
  
  void ZQ();
  
  void removeTabAt(int paramInt);
  
  void Zl(List<Integer> paramList);
  
  void Zx(int paramInt);
  
  void ZF();
  
  void Zc(Comparator<Integer> paramComparator);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlte.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */