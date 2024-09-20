package javafx.beans.binding;

import java.util.Locale;
import javafx.beans.value.ObservableNumberValue;

public interface NumberExpression extends ObservableNumberValue {
  NumberBinding negate();
  
  NumberBinding add(ObservableNumberValue paramObservableNumberValue);
  
  NumberBinding add(double paramDouble);
  
  NumberBinding add(float paramFloat);
  
  NumberBinding add(long paramLong);
  
  NumberBinding add(int paramInt);
  
  NumberBinding subtract(ObservableNumberValue paramObservableNumberValue);
  
  NumberBinding subtract(double paramDouble);
  
  NumberBinding subtract(float paramFloat);
  
  NumberBinding subtract(long paramLong);
  
  NumberBinding subtract(int paramInt);
  
  NumberBinding multiply(ObservableNumberValue paramObservableNumberValue);
  
  NumberBinding multiply(double paramDouble);
  
  NumberBinding multiply(float paramFloat);
  
  NumberBinding multiply(long paramLong);
  
  NumberBinding multiply(int paramInt);
  
  NumberBinding divide(ObservableNumberValue paramObservableNumberValue);
  
  NumberBinding divide(double paramDouble);
  
  NumberBinding divide(float paramFloat);
  
  NumberBinding divide(long paramLong);
  
  NumberBinding divide(int paramInt);
  
  BooleanBinding isEqualTo(ObservableNumberValue paramObservableNumberValue);
  
  BooleanBinding isEqualTo(ObservableNumberValue paramObservableNumberValue, double paramDouble);
  
  BooleanBinding isEqualTo(double paramDouble1, double paramDouble2);
  
  BooleanBinding isEqualTo(float paramFloat, double paramDouble);
  
  BooleanBinding isEqualTo(long paramLong);
  
  BooleanBinding isEqualTo(long paramLong, double paramDouble);
  
  BooleanBinding isEqualTo(int paramInt);
  
  BooleanBinding isEqualTo(int paramInt, double paramDouble);
  
  BooleanBinding isNotEqualTo(ObservableNumberValue paramObservableNumberValue);
  
  BooleanBinding isNotEqualTo(ObservableNumberValue paramObservableNumberValue, double paramDouble);
  
  BooleanBinding isNotEqualTo(double paramDouble1, double paramDouble2);
  
  BooleanBinding isNotEqualTo(float paramFloat, double paramDouble);
  
  BooleanBinding isNotEqualTo(long paramLong);
  
  BooleanBinding isNotEqualTo(long paramLong, double paramDouble);
  
  BooleanBinding isNotEqualTo(int paramInt);
  
  BooleanBinding isNotEqualTo(int paramInt, double paramDouble);
  
  BooleanBinding greaterThan(ObservableNumberValue paramObservableNumberValue);
  
  BooleanBinding greaterThan(double paramDouble);
  
  BooleanBinding greaterThan(float paramFloat);
  
  BooleanBinding greaterThan(long paramLong);
  
  BooleanBinding greaterThan(int paramInt);
  
  BooleanBinding lessThan(ObservableNumberValue paramObservableNumberValue);
  
  BooleanBinding lessThan(double paramDouble);
  
  BooleanBinding lessThan(float paramFloat);
  
  BooleanBinding lessThan(long paramLong);
  
  BooleanBinding lessThan(int paramInt);
  
  BooleanBinding greaterThanOrEqualTo(ObservableNumberValue paramObservableNumberValue);
  
  BooleanBinding greaterThanOrEqualTo(double paramDouble);
  
  BooleanBinding greaterThanOrEqualTo(float paramFloat);
  
  BooleanBinding greaterThanOrEqualTo(long paramLong);
  
  BooleanBinding greaterThanOrEqualTo(int paramInt);
  
  BooleanBinding lessThanOrEqualTo(ObservableNumberValue paramObservableNumberValue);
  
  BooleanBinding lessThanOrEqualTo(double paramDouble);
  
  BooleanBinding lessThanOrEqualTo(float paramFloat);
  
  BooleanBinding lessThanOrEqualTo(long paramLong);
  
  BooleanBinding lessThanOrEqualTo(int paramInt);
  
  StringBinding asString();
  
  StringBinding asString(String paramString);
  
  StringBinding asString(Locale paramLocale, String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\NumberExpression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */