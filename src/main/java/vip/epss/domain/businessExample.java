package vip.epss.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class businessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public businessExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBusinessidIsNull() {
            addCriterion("businessId is null");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNotNull() {
            addCriterion("businessId is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessidEqualTo(Integer value) {
            addCriterion("businessId =", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotEqualTo(Integer value) {
            addCriterion("businessId <>", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThan(Integer value) {
            addCriterion("businessId >", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessId >=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThan(Integer value) {
            addCriterion("businessId <", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThanOrEqualTo(Integer value) {
            addCriterion("businessId <=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIn(List<Integer> values) {
            addCriterion("businessId in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotIn(List<Integer> values) {
            addCriterion("businessId not in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidBetween(Integer value1, Integer value2) {
            addCriterion("businessId between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotBetween(Integer value1, Integer value2) {
            addCriterion("businessId not between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNull() {
            addCriterion("businessName is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNotNull() {
            addCriterion("businessName is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameEqualTo(String value) {
            addCriterion("businessName =", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotEqualTo(String value) {
            addCriterion("businessName <>", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThan(String value) {
            addCriterion("businessName >", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThanOrEqualTo(String value) {
            addCriterion("businessName >=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThan(String value) {
            addCriterion("businessName <", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThanOrEqualTo(String value) {
            addCriterion("businessName <=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLike(String value) {
            addCriterion("businessName like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotLike(String value) {
            addCriterion("businessName not like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIn(List<String> values) {
            addCriterion("businessName in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotIn(List<String> values) {
            addCriterion("businessName not in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameBetween(String value1, String value2) {
            addCriterion("businessName between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotBetween(String value1, String value2) {
            addCriterion("businessName not between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNull() {
            addCriterion("businessAddress is null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNotNull() {
            addCriterion("businessAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressEqualTo(String value) {
            addCriterion("businessAddress =", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotEqualTo(String value) {
            addCriterion("businessAddress <>", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThan(String value) {
            addCriterion("businessAddress >", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThanOrEqualTo(String value) {
            addCriterion("businessAddress >=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThan(String value) {
            addCriterion("businessAddress <", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThanOrEqualTo(String value) {
            addCriterion("businessAddress <=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLike(String value) {
            addCriterion("businessAddress like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotLike(String value) {
            addCriterion("businessAddress not like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIn(List<String> values) {
            addCriterion("businessAddress in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotIn(List<String> values) {
            addCriterion("businessAddress not in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressBetween(String value1, String value2) {
            addCriterion("businessAddress between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotBetween(String value1, String value2) {
            addCriterion("businessAddress not between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainIsNull() {
            addCriterion("businessExplain is null");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainIsNotNull() {
            addCriterion("businessExplain is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainEqualTo(String value) {
            addCriterion("businessExplain =", value, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainNotEqualTo(String value) {
            addCriterion("businessExplain <>", value, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainGreaterThan(String value) {
            addCriterion("businessExplain >", value, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainGreaterThanOrEqualTo(String value) {
            addCriterion("businessExplain >=", value, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainLessThan(String value) {
            addCriterion("businessExplain <", value, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainLessThanOrEqualTo(String value) {
            addCriterion("businessExplain <=", value, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainLike(String value) {
            addCriterion("businessExplain like", value, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainNotLike(String value) {
            addCriterion("businessExplain not like", value, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainIn(List<String> values) {
            addCriterion("businessExplain in", values, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainNotIn(List<String> values) {
            addCriterion("businessExplain not in", values, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainBetween(String value1, String value2) {
            addCriterion("businessExplain between", value1, value2, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andBusinessexplainNotBetween(String value1, String value2) {
            addCriterion("businessExplain not between", value1, value2, "businessexplain");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidIsNull() {
            addCriterion("orderTypeId is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidIsNotNull() {
            addCriterion("orderTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidEqualTo(Integer value) {
            addCriterion("orderTypeId =", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidNotEqualTo(Integer value) {
            addCriterion("orderTypeId <>", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidGreaterThan(Integer value) {
            addCriterion("orderTypeId >", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderTypeId >=", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidLessThan(Integer value) {
            addCriterion("orderTypeId <", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidLessThanOrEqualTo(Integer value) {
            addCriterion("orderTypeId <=", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidIn(List<Integer> values) {
            addCriterion("orderTypeId in", values, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidNotIn(List<Integer> values) {
            addCriterion("orderTypeId not in", values, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidBetween(Integer value1, Integer value2) {
            addCriterion("orderTypeId between", value1, value2, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderTypeId not between", value1, value2, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andStarpriceIsNull() {
            addCriterion("starPrice is null");
            return (Criteria) this;
        }

        public Criteria andStarpriceIsNotNull() {
            addCriterion("starPrice is not null");
            return (Criteria) this;
        }

        public Criteria andStarpriceEqualTo(BigDecimal value) {
            addCriterion("starPrice =", value, "starprice");
            return (Criteria) this;
        }

        public Criteria andStarpriceNotEqualTo(BigDecimal value) {
            addCriterion("starPrice <>", value, "starprice");
            return (Criteria) this;
        }

        public Criteria andStarpriceGreaterThan(BigDecimal value) {
            addCriterion("starPrice >", value, "starprice");
            return (Criteria) this;
        }

        public Criteria andStarpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("starPrice >=", value, "starprice");
            return (Criteria) this;
        }

        public Criteria andStarpriceLessThan(BigDecimal value) {
            addCriterion("starPrice <", value, "starprice");
            return (Criteria) this;
        }

        public Criteria andStarpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("starPrice <=", value, "starprice");
            return (Criteria) this;
        }

        public Criteria andStarpriceIn(List<BigDecimal> values) {
            addCriterion("starPrice in", values, "starprice");
            return (Criteria) this;
        }

        public Criteria andStarpriceNotIn(List<BigDecimal> values) {
            addCriterion("starPrice not in", values, "starprice");
            return (Criteria) this;
        }

        public Criteria andStarpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("starPrice between", value1, value2, "starprice");
            return (Criteria) this;
        }

        public Criteria andStarpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("starPrice not between", value1, value2, "starprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceIsNull() {
            addCriterion("deliveryPrice is null");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceIsNotNull() {
            addCriterion("deliveryPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceEqualTo(BigDecimal value) {
            addCriterion("deliveryPrice =", value, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceNotEqualTo(BigDecimal value) {
            addCriterion("deliveryPrice <>", value, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceGreaterThan(BigDecimal value) {
            addCriterion("deliveryPrice >", value, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deliveryPrice >=", value, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceLessThan(BigDecimal value) {
            addCriterion("deliveryPrice <", value, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deliveryPrice <=", value, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceIn(List<BigDecimal> values) {
            addCriterion("deliveryPrice in", values, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceNotIn(List<BigDecimal> values) {
            addCriterion("deliveryPrice not in", values, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliveryPrice between", value1, value2, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andDeliverypriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliveryPrice not between", value1, value2, "deliveryprice");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}