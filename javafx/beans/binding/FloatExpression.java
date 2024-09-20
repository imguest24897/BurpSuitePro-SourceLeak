/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ObservableFloatValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ObservableList;
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
/*     */ public abstract class FloatExpression
/*     */   extends NumberExpressionBase
/*     */   implements ObservableFloatValue
/*     */ {
/*     */   public int intValue() {
/*  54 */     return (int)get();
/*     */   }
/*     */ 
/*     */   
/*     */   public long longValue() {
/*  59 */     return (long)get();
/*     */   }
/*     */ 
/*     */   
/*     */   public float floatValue() {
/*  64 */     return get();
/*     */   }
/*     */ 
/*     */   
/*     */   public double doubleValue() {
/*  69 */     return get();
/*     */   }
/*     */ 
/*     */   
/*     */   public Float getValue() {
/*  74 */     return Float.valueOf(get());
/*     */   }
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
/*     */   public static FloatExpression floatExpression(final ObservableFloatValue value) {
/*  94 */     if (value == null) {
/*  95 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/*  97 */     return (value instanceof FloatExpression) ? (FloatExpression)value : 
/*  98 */       new FloatBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 105 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected float computeValue() {
/* 110 */           return value.get();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableFloatValue> getDependencies() {
/* 115 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
/*     */   }
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
/*     */   public static <T extends Number> FloatExpression floatExpression(final ObservableValue<T> value) {
/* 151 */     if (value == null) {
/* 152 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/* 154 */     return (value instanceof FloatExpression) ? (FloatExpression)value : 
/* 155 */       new FloatBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 162 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected float computeValue() {
/* 167 */           Number number = (Number)value.getValue();
/* 168 */           return (number == null) ? 0.0F : number.floatValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<T>> getDependencies() {
/* 173 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatBinding negate() {
/* 181 */     return (FloatBinding)Bindings.negate(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding add(double paramDouble) {
/* 186 */     return Bindings.add(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding add(float paramFloat) {
/* 191 */     return (FloatBinding)Bindings.add(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding add(long paramLong) {
/* 196 */     return (FloatBinding)Bindings.add(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding add(int paramInt) {
/* 201 */     return (FloatBinding)Bindings.add(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding subtract(double paramDouble) {
/* 206 */     return Bindings.subtract(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding subtract(float paramFloat) {
/* 211 */     return (FloatBinding)Bindings.subtract(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding subtract(long paramLong) {
/* 216 */     return (FloatBinding)Bindings.subtract(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding subtract(int paramInt) {
/* 221 */     return (FloatBinding)Bindings.subtract(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding multiply(double paramDouble) {
/* 226 */     return Bindings.multiply(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding multiply(float paramFloat) {
/* 231 */     return (FloatBinding)Bindings.multiply(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding multiply(long paramLong) {
/* 236 */     return (FloatBinding)Bindings.multiply(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding multiply(int paramInt) {
/* 241 */     return (FloatBinding)Bindings.multiply(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding divide(double paramDouble) {
/* 246 */     return Bindings.divide(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding divide(float paramFloat) {
/* 251 */     return (FloatBinding)Bindings.divide(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding divide(long paramLong) {
/* 256 */     return (FloatBinding)Bindings.divide(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding divide(int paramInt) {
/* 261 */     return (FloatBinding)Bindings.divide(this, paramInt);
/*     */   }
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
/*     */   public ObjectExpression<Float> asObject() {
/* 274 */     return new ObjectBinding<Float>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 281 */           unbind(new Observable[] { (Observable)this.this$0 });
/*     */         }
/*     */ 
/*     */         
/*     */         protected Float computeValue() {
/* 286 */           return FloatExpression.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\FloatExpression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */