package dev.wolfort.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import dev.wolfort.dbflute.cbean.cq.ciq.*;
import dev.wolfort.dbflute.cbean.*;
import dev.wolfort.dbflute.cbean.cq.*;

/**
 * The base condition-query of user_follow.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsUserFollowCQ extends DbAbstractBsUserFollowCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbUserFollowCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsUserFollowCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from user_follow) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbUserFollowCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbUserFollowCIQ xcreateCIQ() {
        DbUserFollowCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbUserFollowCIQ xnewCIQ() {
        return new DbUserFollowCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join user_follow on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbUserFollowCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbUserFollowCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userFollowId;
    public ConditionValue xdfgetUserFollowId()
    { if (_userFollowId == null) { _userFollowId = nCV(); }
      return _userFollowId; }
    protected ConditionValue xgetCValueUserFollowId() { return xdfgetUserFollowId(); }

    /**
     * Add order-by as ascend. <br>
     * user_follow_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_UserFollowId_Asc() { regOBA("user_follow_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_follow_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_UserFollowId_Desc() { regOBD("user_follow_id"); return this; }

    protected ConditionValue _fromUserId;
    public ConditionValue xdfgetFromUserId()
    { if (_fromUserId == null) { _fromUserId = nCV(); }
      return _fromUserId; }
    protected ConditionValue xgetCValueFromUserId() { return xdfgetFromUserId(); }

    /**
     * Add order-by as ascend. <br>
     * from_user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_FromUserId_Asc() { regOBA("from_user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * from_user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_FromUserId_Desc() { regOBD("from_user_id"); return this; }

    protected ConditionValue _toUserId;
    public ConditionValue xdfgetToUserId()
    { if (_toUserId == null) { _toUserId = nCV(); }
      return _toUserId; }
    protected ConditionValue xgetCValueToUserId() { return xdfgetToUserId(); }

    /**
     * Add order-by as ascend. <br>
     * to_user_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_ToUserId_Asc() { regOBA("to_user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * to_user_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_ToUserId_Desc() { regOBD("to_user_id"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerTrace;
    public ConditionValue xdfgetRegisterTrace()
    { if (_registerTrace == null) { _registerTrace = nCV(); }
      return _registerTrace; }
    protected ConditionValue xgetCValueRegisterTrace() { return xdfgetRegisterTrace(); }

    /**
     * Add order-by as ascend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateTrace;
    public ConditionValue xdfgetUpdateTrace()
    { if (_updateTrace == null) { _updateTrace = nCV(); }
      return _updateTrace; }
    protected ConditionValue xgetCValueUpdateTrace() { return xdfgetUpdateTrace(); }

    /**
     * Add order-by as ascend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public DbBsUserFollowCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbUserFollowCQ bq = (DbUserFollowCQ)bqs;
        DbUserFollowCQ uq = (DbUserFollowCQ)uqs;
        if (bq.hasConditionQueryUserByFromUserId()) {
            uq.queryUserByFromUserId().reflectRelationOnUnionQuery(bq.queryUserByFromUserId(), uq.queryUserByFromUserId());
        }
        if (bq.hasConditionQueryUserByToUserId()) {
            uq.queryUserByToUserId().reflectRelationOnUnionQuery(bq.queryUserByToUserId(), uq.queryUserByToUserId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER by my from_user_id, named 'userByFromUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbUserCQ queryUserByFromUserId() {
        return xdfgetConditionQueryUserByFromUserId();
    }
    public DbUserCQ xdfgetConditionQueryUserByFromUserId() {
        String prop = "userByFromUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByFromUserId()); xsetupOuterJoinUserByFromUserId(); }
        return xgetQueRlMap(prop);
    }
    protected DbUserCQ xcreateQueryUserByFromUserId() {
        String nrp = xresolveNRP("user_follow", "userByFromUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByFromUserId", nrp);
    }
    protected void xsetupOuterJoinUserByFromUserId() { xregOutJo("userByFromUserId"); }
    public boolean hasConditionQueryUserByFromUserId() { return xhasQueRlMap("userByFromUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * USER by my to_user_id, named 'userByToUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbUserCQ queryUserByToUserId() {
        return xdfgetConditionQueryUserByToUserId();
    }
    public DbUserCQ xdfgetConditionQueryUserByToUserId() {
        String prop = "userByToUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByToUserId()); xsetupOuterJoinUserByToUserId(); }
        return xgetQueRlMap(prop);
    }
    protected DbUserCQ xcreateQueryUserByToUserId() {
        String nrp = xresolveNRP("user_follow", "userByToUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByToUserId", nrp);
    }
    protected void xsetupOuterJoinUserByToUserId() { xregOutJo("userByToUserId"); }
    public boolean hasConditionQueryUserByToUserId() { return xhasQueRlMap("userByToUserId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbUserFollowCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbUserFollowCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbUserFollowCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbUserFollowCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbUserFollowCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbUserFollowCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbUserFollowCQ> _myselfExistsMap;
    public Map<String, DbUserFollowCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbUserFollowCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbUserFollowCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbUserFollowCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbUserFollowCB.class.getName(); }
    protected String xCQ() { return DbUserFollowCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
