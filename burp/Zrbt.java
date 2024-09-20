package burp;

import java.awt.IllegalComponentStateException;
import java.beans.PropertyChangeListener;
import java.util.Locale;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleAction;
import javax.accessibility.AccessibleComponent;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleEditableText;
import javax.accessibility.AccessibleIcon;
import javax.accessibility.AccessibleRelationSet;
import javax.accessibility.AccessibleRole;
import javax.accessibility.AccessibleSelection;
import javax.accessibility.AccessibleStateSet;
import javax.accessibility.AccessibleTable;
import javax.accessibility.AccessibleText;
import javax.accessibility.AccessibleValue;

public class Zrbt extends AccessibleContext {
  private final AccessibleContext ZY;
  
  public Zrbt(AccessibleContext paramAccessibleContext) {
    this.ZY = paramAccessibleContext;
  }
  
  public String getAccessibleName() {
    return this.ZY.getAccessibleName();
  }
  
  public void setAccessibleName(String paramString) {
    this.ZY.setAccessibleName(paramString);
  }
  
  public String getAccessibleDescription() {
    return this.ZY.getAccessibleDescription();
  }
  
  public void setAccessibleDescription(String paramString) {
    this.ZY.setAccessibleDescription(paramString);
  }
  
  public AccessibleRole getAccessibleRole() {
    return this.ZY.getAccessibleRole();
  }
  
  public AccessibleStateSet getAccessibleStateSet() {
    return this.ZY.getAccessibleStateSet();
  }
  
  public Accessible getAccessibleParent() {
    Accessible accessible = this.ZY.getAccessibleParent();
    return accessible::lambda$getAccessibleParent$0;
  }
  
  public void setAccessibleParent(Accessible paramAccessible) {
    this.ZY.setAccessibleParent(paramAccessible);
  }
  
  public int getAccessibleIndexInParent() {
    return this.ZY.getAccessibleIndexInParent();
  }
  
  public int getAccessibleChildrenCount() {
    return Integer.min(this.ZY.getAccessibleChildrenCount(), 30);
  }
  
  public Accessible getAccessibleChild(int paramInt) {
    Accessible accessible = this.ZY.getAccessibleChild(paramInt);
    return accessible::lambda$getAccessibleParent$0;
  }
  
  public Locale getLocale() throws IllegalComponentStateException {
    return this.ZY.getLocale();
  }
  
  public void addPropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
    this.ZY.addPropertyChangeListener(paramPropertyChangeListener);
  }
  
  public void removePropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
    this.ZY.removePropertyChangeListener(paramPropertyChangeListener);
  }
  
  public AccessibleAction getAccessibleAction() {
    return this.ZY.getAccessibleAction();
  }
  
  public AccessibleComponent getAccessibleComponent() {
    return this.ZY.getAccessibleComponent();
  }
  
  public AccessibleSelection getAccessibleSelection() {
    return this.ZY.getAccessibleSelection();
  }
  
  public AccessibleText getAccessibleText() {
    return this.ZY.getAccessibleText();
  }
  
  public AccessibleEditableText getAccessibleEditableText() {
    return this.ZY.getAccessibleEditableText();
  }
  
  public AccessibleValue getAccessibleValue() {
    return this.ZY.getAccessibleValue();
  }
  
  public AccessibleIcon[] getAccessibleIcon() {
    return this.ZY.getAccessibleIcon();
  }
  
  public AccessibleRelationSet getAccessibleRelationSet() {
    return this.ZY.getAccessibleRelationSet();
  }
  
  public AccessibleTable getAccessibleTable() {
    return this.ZY.getAccessibleTable();
  }
  
  public void firePropertyChange(String paramString, Object paramObject1, Object paramObject2) {
    this.ZY.firePropertyChange(paramString, paramObject1, paramObject2);
  }
  
  private static AccessibleContext lambda$getAccessibleParent$0(Accessible paramAccessible) {
    return new Zrbt(paramAccessible.getAccessibleContext());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrbt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */