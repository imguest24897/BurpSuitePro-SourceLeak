/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.StringFormatter;
/*     */ import java.util.Locale;
/*     */ import javafx.beans.value.ObservableDoubleValue;
/*     */ import javafx.beans.value.ObservableFloatValue;
/*     */ import javafx.beans.value.ObservableIntegerValue;
/*     */ import javafx.beans.value.ObservableLongValue;
/*     */ import javafx.beans.value.ObservableNumberValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class NumberExpressionBase
/*     */   implements NumberExpression
/*     */ {
/*     */   public static <S extends Number> NumberExpressionBase numberExpression(ObservableNumberValue paramObservableNumberValue) {
/*  76 */     if (paramObservableNumberValue == null) {
/*  77 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     NumberExpressionBase numberExpressionBase = (paramObservableNumberValue instanceof NumberExpressionBase) ? (NumberExpressionBase)paramObservableNumberValue : ((paramObservableNumberValue instanceof ObservableIntegerValue) ? IntegerExpression.integerExpression((ObservableIntegerValue)paramObservableNumberValue) : ((paramObservableNumberValue instanceof ObservableDoubleValue) ? DoubleExpression.doubleExpression((ObservableDoubleValue)paramObservableNumberValue) : ((paramObservableNumberValue instanceof ObservableFloatValue) ? FloatExpression.floatExpression((ObservableFloatValue)paramObservableNumberValue) : ((paramObservableNumberValue instanceof ObservableLongValue) ? LongExpression.longExpression((ObservableLongValue)paramObservableNumberValue) : null))));
/*  89 */     if (numberExpressionBase != null) {
/*  90 */       return numberExpressionBase;
/*     */     }
/*  92 */     throw new IllegalArgumentException("Unsupported Type");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberBinding add(ObservableNumberValue paramObservableNumberValue) {
/*  98 */     return Bindings.add(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public NumberBinding subtract(ObservableNumberValue paramObservableNumberValue) {
/* 103 */     return Bindings.subtract(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public NumberBinding multiply(ObservableNumberValue paramObservableNumberValue) {
/* 108 */     return Bindings.multiply(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public NumberBinding divide(ObservableNumberValue paramObservableNumberValue) {
/* 113 */     return Bindings.divide(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isEqualTo(ObservableNumberValue paramObservableNumberValue) {
/* 121 */     return Bindings.equal(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isEqualTo(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 127 */     return Bindings.equal(this, paramObservableNumberValue, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isEqualTo(double paramDouble1, double paramDouble2) {
/* 132 */     return Bindings.equal(this, paramDouble1, paramDouble2);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isEqualTo(float paramFloat, double paramDouble) {
/* 137 */     return Bindings.equal(this, paramFloat, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isEqualTo(long paramLong) {
/* 142 */     return Bindings.equal(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isEqualTo(long paramLong, double paramDouble) {
/* 147 */     return Bindings.equal(this, paramLong, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isEqualTo(int paramInt) {
/* 152 */     return Bindings.equal(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isEqualTo(int paramInt, double paramDouble) {
/* 157 */     return Bindings.equal(this, paramInt, paramDouble);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotEqualTo(ObservableNumberValue paramObservableNumberValue) {
/* 165 */     return Bindings.notEqual(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotEqualTo(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 171 */     return Bindings.notEqual(this, paramObservableNumberValue, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotEqualTo(double paramDouble1, double paramDouble2) {
/* 176 */     return Bindings.notEqual(this, paramDouble1, paramDouble2);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotEqualTo(float paramFloat, double paramDouble) {
/* 181 */     return Bindings.notEqual(this, paramFloat, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotEqualTo(long paramLong) {
/* 186 */     return Bindings.notEqual(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotEqualTo(long paramLong, double paramDouble) {
/* 191 */     return Bindings.notEqual(this, paramLong, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotEqualTo(int paramInt) {
/* 196 */     return Bindings.notEqual(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotEqualTo(int paramInt, double paramDouble) {
/* 201 */     return Bindings.notEqual(this, paramInt, paramDouble);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThan(ObservableNumberValue paramObservableNumberValue) {
/* 209 */     return Bindings.greaterThan(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThan(double paramDouble) {
/* 214 */     return Bindings.greaterThan(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThan(float paramFloat) {
/* 219 */     return Bindings.greaterThan(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThan(long paramLong) {
/* 224 */     return Bindings.greaterThan(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThan(int paramInt) {
/* 229 */     return Bindings.greaterThan(this, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThan(ObservableNumberValue paramObservableNumberValue) {
/* 237 */     return Bindings.lessThan(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThan(double paramDouble) {
/* 242 */     return Bindings.lessThan(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThan(float paramFloat) {
/* 247 */     return Bindings.lessThan(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThan(long paramLong) {
/* 252 */     return Bindings.lessThan(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThan(int paramInt) {
/* 257 */     return Bindings.lessThan(this, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThanOrEqualTo(ObservableNumberValue paramObservableNumberValue) {
/* 265 */     return Bindings.greaterThanOrEqual(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThanOrEqualTo(double paramDouble) {
/* 270 */     return Bindings.greaterThanOrEqual(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThanOrEqualTo(float paramFloat) {
/* 275 */     return Bindings.greaterThanOrEqual(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThanOrEqualTo(long paramLong) {
/* 280 */     return Bindings.greaterThanOrEqual(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding greaterThanOrEqualTo(int paramInt) {
/* 285 */     return Bindings.greaterThanOrEqual(this, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThanOrEqualTo(ObservableNumberValue paramObservableNumberValue) {
/* 293 */     return Bindings.lessThanOrEqual(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThanOrEqualTo(double paramDouble) {
/* 298 */     return Bindings.lessThanOrEqual(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThanOrEqualTo(float paramFloat) {
/* 303 */     return Bindings.lessThanOrEqual(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThanOrEqualTo(long paramLong) {
/* 308 */     return Bindings.lessThanOrEqual(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public BooleanBinding lessThanOrEqualTo(int paramInt) {
/* 313 */     return Bindings.lessThanOrEqual(this, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StringBinding asString() {
/* 321 */     return (StringBinding)StringFormatter.convert((ObservableValue)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public StringBinding asString(String paramString) {
/* 326 */     return (StringBinding)Bindings.format(paramString, new Object[] { this });
/*     */   }
/*     */ 
/*     */   
/*     */   public StringBinding asString(Locale paramLocale, String paramString) {
/* 331 */     return (StringBinding)Bindings.format(paramLocale, paramString, new Object[] { this });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\NumberExpressionBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */