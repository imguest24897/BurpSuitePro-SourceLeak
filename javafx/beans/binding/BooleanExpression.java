/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.StringFormatter;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ObservableBooleanValue;
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
/*     */ 
/*     */ public abstract class BooleanExpression
/*     */   implements ObservableBooleanValue
/*     */ {
/*     */   public Boolean getValue() {
/*  55 */     return Boolean.valueOf(get());
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
/*     */   public static BooleanExpression booleanExpression(final ObservableBooleanValue value) {
/*  75 */     if (value == null) {
/*  76 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/*  78 */     return (value instanceof BooleanExpression) ? (BooleanExpression)value : 
/*  79 */       new BooleanBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/*  86 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected boolean computeValue() {
/*  91 */           return value.get();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableBooleanValue> getDependencies() {
/*  96 */           return FXCollections.singletonObservableList(value);
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
/*     */   public static BooleanExpression booleanExpression(final ObservableValue<Boolean> value) {
/* 120 */     if (value == null) {
/* 121 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/* 123 */     return (value instanceof BooleanExpression) ? (BooleanExpression)value : 
/* 124 */       new BooleanBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 131 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected boolean computeValue() {
/* 136 */           Boolean bool = (Boolean)value.getValue();
/* 137 */           return (bool == null) ? false : bool.booleanValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<Boolean>> getDependencies() {
/* 142 */           return FXCollections.singletonObservableList(value);
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
/*     */   public BooleanBinding and(ObservableBooleanValue paramObservableBooleanValue) {
/* 159 */     return Bindings.and(this, paramObservableBooleanValue);
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
/*     */   public BooleanBinding or(ObservableBooleanValue paramObservableBooleanValue) {
/* 174 */     return Bindings.or(this, paramObservableBooleanValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding not() {
/* 184 */     return Bindings.not(this);
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
/*     */   public BooleanBinding isEqualTo(ObservableBooleanValue paramObservableBooleanValue) {
/* 198 */     return Bindings.equal(this, paramObservableBooleanValue);
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
/*     */   public BooleanBinding isNotEqualTo(ObservableBooleanValue paramObservableBooleanValue) {
/* 212 */     return Bindings.notEqual(this, paramObservableBooleanValue);
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
/*     */   public StringBinding asString() {
/* 224 */     return (StringBinding)StringFormatter.convert((ObservableValue)this);
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
/*     */   public ObjectExpression<Boolean> asObject() {
/* 237 */     return new ObjectBinding<Boolean>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 244 */           unbind(new Observable[] { (Observable)this.this$0 });
/*     */         }
/*     */ 
/*     */         
/*     */         protected Boolean computeValue() {
/* 249 */           return BooleanExpression.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\BooleanExpression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */