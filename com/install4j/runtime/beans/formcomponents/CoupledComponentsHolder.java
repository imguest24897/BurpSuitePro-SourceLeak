package com.install4j.runtime.beans.formcomponents;

import java.util.List;

public interface CoupledComponentsHolder {
  List<String> getCoupledComponentIds();
  
  void setCoupledComponentIds(List<String> paramList);
  
  boolean isInverseCoupling();
  
  void setInverseCoupling(boolean paramBoolean);
  
  Boolean isEnableCoupledComponents();
  
  boolean isEnabled();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\CoupledComponentsHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */