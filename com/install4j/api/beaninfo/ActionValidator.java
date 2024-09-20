package com.install4j.api.beaninfo;

import com.install4j.api.actions.Action;
import java.util.List;

public interface ActionValidator {
  void validateAction(Action paramAction, List<String> paramList) throws BeanValidationException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\ActionValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */