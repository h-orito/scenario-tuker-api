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
 * The base condition-query of user.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsUserCQ extends DbAbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from user) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbUserCIQ xcreateCIQ() {
        DbUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbUserCIQ xnewCIQ() {
        return new DbUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join user on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    public Map<String, DbParticipateCQ> xdfgetUserId_ExistsReferrer_ParticipateList() { return xgetSQueMap("userId_ExistsReferrer_ParticipateList"); }
    public String keepUserId_ExistsReferrer_ParticipateList(DbParticipateCQ sq) { return xkeepSQue("userId_ExistsReferrer_ParticipateList", sq); }

    public Map<String, DbParticipateCQ> xdfgetUserId_NotExistsReferrer_ParticipateList() { return xgetSQueMap("userId_NotExistsReferrer_ParticipateList"); }
    public String keepUserId_NotExistsReferrer_ParticipateList(DbParticipateCQ sq) { return xkeepSQue("userId_NotExistsReferrer_ParticipateList", sq); }

    public Map<String, DbParticipateCQ> xdfgetUserId_SpecifyDerivedReferrer_ParticipateList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_ParticipateList"); }
    public String keepUserId_SpecifyDerivedReferrer_ParticipateList(DbParticipateCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_ParticipateList", sq); }

    public Map<String, DbParticipateCQ> xdfgetUserId_QueryDerivedReferrer_ParticipateList() { return xgetSQueMap("userId_QueryDerivedReferrer_ParticipateList"); }
    public String keepUserId_QueryDerivedReferrer_ParticipateList(DbParticipateCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_ParticipateList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_ParticipateListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_ParticipateList"); }
    public String keepUserId_QueryDerivedReferrer_ParticipateListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_ParticipateList", pm); }

    /**
     * Add order-by as ascend. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _userName;
    public ConditionValue xdfgetUserName()
    { if (_userName == null) { _userName = nCV(); }
      return _userName; }
    protected ConditionValue xgetCValueUserName() { return xdfgetUserName(); }

    /**
     * Add order-by as ascend. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_UserName_Asc() { regOBA("user_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_UserName_Desc() { regOBD("user_name"); return this; }

    protected ConditionValue _uid;
    public ConditionValue xdfgetUid()
    { if (_uid == null) { _uid = nCV(); }
      return _uid; }
    protected ConditionValue xgetCValueUid() { return xdfgetUid(); }

    /**
     * Add order-by as ascend. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_Uid_Asc() { regOBA("uid"); return this; }

    /**
     * Add order-by as descend. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_Uid_Desc() { regOBD("uid"); return this; }

    protected ConditionValue _authority;
    public ConditionValue xdfgetAuthority()
    { if (_authority == null) { _authority = nCV(); }
      return _authority; }
    protected ConditionValue xgetCValueAuthority() { return xdfgetAuthority(); }

    /**
     * Add order-by as ascend. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_Authority_Asc() { regOBA("authority"); return this; }

    /**
     * Add order-by as descend. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_Authority_Desc() { regOBD("authority"); return this; }

    protected ConditionValue _introduction;
    public ConditionValue xdfgetIntroduction()
    { if (_introduction == null) { _introduction = nCV(); }
      return _introduction; }
    protected ConditionValue xgetCValueIntroduction() { return xdfgetIntroduction(); }

    /**
     * Add order-by as ascend. <br>
     * introduction: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_Introduction_Asc() { regOBA("introduction"); return this; }

    /**
     * Add order-by as descend. <br>
     * introduction: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_Introduction_Desc() { regOBD("introduction"); return this; }

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
    public DbBsUserCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsUserCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsUserCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsUserCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsUserCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbUserCQ bq = (DbUserCQ)bqs;
        DbUserCQ uq = (DbUserCQ)uqs;
        if (bq.hasConditionQueryTwitterUserAsOne()) {
            uq.queryTwitterUserAsOne().reflectRelationOnUnionQuery(bq.queryTwitterUserAsOne(), uq.queryTwitterUserAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * twitter_user by user_id, named 'twitterUserAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbTwitterUserCQ queryTwitterUserAsOne() { return xdfgetConditionQueryTwitterUserAsOne(); }
    public DbTwitterUserCQ xdfgetConditionQueryTwitterUserAsOne() {
        String prop = "twitterUserAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTwitterUserAsOne()); xsetupOuterJoinTwitterUserAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected DbTwitterUserCQ xcreateQueryTwitterUserAsOne() {
        String nrp = xresolveNRP("user", "twitterUserAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbTwitterUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "twitterUserAsOne", nrp);
    }
    protected void xsetupOuterJoinTwitterUserAsOne() { xregOutJo("twitterUserAsOne"); }
    public boolean hasConditionQueryTwitterUserAsOne() { return xhasQueRlMap("twitterUserAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbUserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbUserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbUserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbUserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbUserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbUserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbUserCQ> _myselfExistsMap;
    public Map<String, DbUserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbUserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbUserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbUserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbUserCB.class.getName(); }
    protected String xCQ() { return DbUserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
