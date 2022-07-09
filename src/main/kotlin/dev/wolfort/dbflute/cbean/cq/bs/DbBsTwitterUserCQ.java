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
 * The base condition-query of twitter_user.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsTwitterUserCQ extends DbAbstractBsTwitterUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbTwitterUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsTwitterUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from twitter_user) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbTwitterUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbTwitterUserCIQ xcreateCIQ() {
        DbTwitterUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbTwitterUserCIQ xnewCIQ() {
        return new DbTwitterUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join twitter_user on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbTwitterUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbTwitterUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _twitterUserId;
    public ConditionValue xdfgetTwitterUserId()
    { if (_twitterUserId == null) { _twitterUserId = nCV(); }
      return _twitterUserId; }
    protected ConditionValue xgetCValueTwitterUserId() { return xdfgetTwitterUserId(); }

    /**
     * Add order-by as ascend. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_TwitterUserId_Asc() { regOBA("twitter_user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_TwitterUserId_Desc() { regOBD("twitter_user_id"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _twitterId;
    public ConditionValue xdfgetTwitterId()
    { if (_twitterId == null) { _twitterId = nCV(); }
      return _twitterId; }
    protected ConditionValue xgetCValueTwitterId() { return xdfgetTwitterId(); }

    /**
     * Add order-by as ascend. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_TwitterId_Asc() { regOBA("twitter_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_TwitterId_Desc() { regOBD("twitter_id"); return this; }

    protected ConditionValue _screenName;
    public ConditionValue xdfgetScreenName()
    { if (_screenName == null) { _screenName = nCV(); }
      return _screenName; }
    protected ConditionValue xgetCValueScreenName() { return xdfgetScreenName(); }

    /**
     * Add order-by as ascend. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_ScreenName_Asc() { regOBA("screen_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_ScreenName_Desc() { regOBD("screen_name"); return this; }

    protected ConditionValue _accessToken;
    public ConditionValue xdfgetAccessToken()
    { if (_accessToken == null) { _accessToken = nCV(); }
      return _accessToken; }
    protected ConditionValue xgetCValueAccessToken() { return xdfgetAccessToken(); }

    /**
     * Add order-by as ascend. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_AccessToken_Asc() { regOBA("access_token"); return this; }

    /**
     * Add order-by as descend. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_AccessToken_Desc() { regOBD("access_token"); return this; }

    protected ConditionValue _tokenSecret;
    public ConditionValue xdfgetTokenSecret()
    { if (_tokenSecret == null) { _tokenSecret = nCV(); }
      return _tokenSecret; }
    protected ConditionValue xgetCValueTokenSecret() { return xdfgetTokenSecret(); }

    /**
     * Add order-by as ascend. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_TokenSecret_Asc() { regOBA("token_secret"); return this; }

    /**
     * Add order-by as descend. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_TokenSecret_Desc() { regOBD("token_secret"); return this; }

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
    public DbBsTwitterUserCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsTwitterUserCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsTwitterUserCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsTwitterUserCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsTwitterUserCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsTwitterUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsTwitterUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbTwitterUserCQ bq = (DbTwitterUserCQ)bqs;
        DbTwitterUserCQ uq = (DbTwitterUserCQ)uqs;
        if (bq.hasConditionQueryUser()) {
            uq.queryUser().reflectRelationOnUnionQuery(bq.queryUser(), uq.queryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER by my user_id, named 'user'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbUserCQ queryUser() {
        return xdfgetConditionQueryUser();
    }
    public DbUserCQ xdfgetConditionQueryUser() {
        String prop = "user";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUser()); xsetupOuterJoinUser(); }
        return xgetQueRlMap(prop);
    }
    protected DbUserCQ xcreateQueryUser() {
        String nrp = xresolveNRP("twitter_user", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "user", nrp);
    }
    protected void xsetupOuterJoinUser() { xregOutJo("user"); }
    public boolean hasConditionQueryUser() { return xhasQueRlMap("user"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbTwitterUserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbTwitterUserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbTwitterUserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbTwitterUserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbTwitterUserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbTwitterUserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbTwitterUserCQ> _myselfExistsMap;
    public Map<String, DbTwitterUserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbTwitterUserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbTwitterUserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbTwitterUserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbTwitterUserCB.class.getName(); }
    protected String xCQ() { return DbTwitterUserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
