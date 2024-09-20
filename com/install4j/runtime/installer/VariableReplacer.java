package com.install4j.runtime.installer;

import com.install4j.api.beans.ReplacementMode;
import com.install4j.api.beans.VariableErrorHandlingDescriptor;

public interface VariableReplacer {
  Object getVariable(String paramString);
  
  String replaceVariables(String paramString, ReplacementMode paramReplacementMode, VariableErrorHandlingDescriptor paramVariableErrorHandlingDescriptor);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\VariableReplacer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */