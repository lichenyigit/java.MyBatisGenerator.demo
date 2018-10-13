package myBatisGenerator.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class FavoriteListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavoriteListExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlIsNull() {
            addCriterion("relation_model_url is null");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlIsNotNull() {
            addCriterion("relation_model_url is not null");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlEqualTo(String value) {
            addCriterion("relation_model_url =", value, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlNotEqualTo(String value) {
            addCriterion("relation_model_url <>", value, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlGreaterThan(String value) {
            addCriterion("relation_model_url >", value, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlGreaterThanOrEqualTo(String value) {
            addCriterion("relation_model_url >=", value, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlLessThan(String value) {
            addCriterion("relation_model_url <", value, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlLessThanOrEqualTo(String value) {
            addCriterion("relation_model_url <=", value, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlLike(String value) {
            addCriterion("relation_model_url like", value, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlNotLike(String value) {
            addCriterion("relation_model_url not like", value, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlIn(List<String> values) {
            addCriterion("relation_model_url in", values, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlNotIn(List<String> values) {
            addCriterion("relation_model_url not in", values, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlBetween(String value1, String value2) {
            addCriterion("relation_model_url between", value1, value2, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andRelationModelUrlNotBetween(String value1, String value2) {
            addCriterion("relation_model_url not between", value1, value2, "relationModelUrl");
            return (Criteria) this;
        }

        public Criteria andScaleXIsNull() {
            addCriterion("scale_x is null");
            return (Criteria) this;
        }

        public Criteria andScaleXIsNotNull() {
            addCriterion("scale_x is not null");
            return (Criteria) this;
        }

        public Criteria andScaleXEqualTo(Float value) {
            addCriterion("scale_x =", value, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleXNotEqualTo(Float value) {
            addCriterion("scale_x <>", value, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleXGreaterThan(Float value) {
            addCriterion("scale_x >", value, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleXGreaterThanOrEqualTo(Float value) {
            addCriterion("scale_x >=", value, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleXLessThan(Float value) {
            addCriterion("scale_x <", value, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleXLessThanOrEqualTo(Float value) {
            addCriterion("scale_x <=", value, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleXIn(List<Float> values) {
            addCriterion("scale_x in", values, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleXNotIn(List<Float> values) {
            addCriterion("scale_x not in", values, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleXBetween(Float value1, Float value2) {
            addCriterion("scale_x between", value1, value2, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleXNotBetween(Float value1, Float value2) {
            addCriterion("scale_x not between", value1, value2, "scaleX");
            return (Criteria) this;
        }

        public Criteria andScaleYIsNull() {
            addCriterion("scale_y is null");
            return (Criteria) this;
        }

        public Criteria andScaleYIsNotNull() {
            addCriterion("scale_y is not null");
            return (Criteria) this;
        }

        public Criteria andScaleYEqualTo(Float value) {
            addCriterion("scale_y =", value, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleYNotEqualTo(Float value) {
            addCriterion("scale_y <>", value, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleYGreaterThan(Float value) {
            addCriterion("scale_y >", value, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleYGreaterThanOrEqualTo(Float value) {
            addCriterion("scale_y >=", value, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleYLessThan(Float value) {
            addCriterion("scale_y <", value, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleYLessThanOrEqualTo(Float value) {
            addCriterion("scale_y <=", value, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleYIn(List<Float> values) {
            addCriterion("scale_y in", values, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleYNotIn(List<Float> values) {
            addCriterion("scale_y not in", values, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleYBetween(Float value1, Float value2) {
            addCriterion("scale_y between", value1, value2, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleYNotBetween(Float value1, Float value2) {
            addCriterion("scale_y not between", value1, value2, "scaleY");
            return (Criteria) this;
        }

        public Criteria andScaleZIsNull() {
            addCriterion("scale_z is null");
            return (Criteria) this;
        }

        public Criteria andScaleZIsNotNull() {
            addCriterion("scale_z is not null");
            return (Criteria) this;
        }

        public Criteria andScaleZEqualTo(Float value) {
            addCriterion("scale_z =", value, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andScaleZNotEqualTo(Float value) {
            addCriterion("scale_z <>", value, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andScaleZGreaterThan(Float value) {
            addCriterion("scale_z >", value, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andScaleZGreaterThanOrEqualTo(Float value) {
            addCriterion("scale_z >=", value, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andScaleZLessThan(Float value) {
            addCriterion("scale_z <", value, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andScaleZLessThanOrEqualTo(Float value) {
            addCriterion("scale_z <=", value, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andScaleZIn(List<Float> values) {
            addCriterion("scale_z in", values, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andScaleZNotIn(List<Float> values) {
            addCriterion("scale_z not in", values, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andScaleZBetween(Float value1, Float value2) {
            addCriterion("scale_z between", value1, value2, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andScaleZNotBetween(Float value1, Float value2) {
            addCriterion("scale_z not between", value1, value2, "scaleZ");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
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