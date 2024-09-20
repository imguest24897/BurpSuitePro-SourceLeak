package com.install4j.api.beaninfo;

import com.install4j.api.beans.Bean;
import java.util.List;

public interface SequenceValidator {
  int getInsertIndex(Bean paramBean, List<Bean> paramList);
  
  boolean isBarrier(Bean paramBean1, Bean paramBean2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\SequenceValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */