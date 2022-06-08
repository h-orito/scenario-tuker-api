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
 * The base condition-query of participate.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsParticipateCQ extends DbAbstractBsParticipateCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbParticipateCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsParticipateCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from participate) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbParticipateCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbParticipateCIQ xcreateCIQ() {
        DbParticipateCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbParticipateCIQ xnewCIQ() {
        return new DbParticipateCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join participate on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbParticipateCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbParticipateCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _participateId;
    public ConditionValue xdfgetParticipateId()
    { if (_participateId == null) { _participateId = nCV(); }
      return _participateId; }
    protected ConditionValue xgetCValueParticipateId() { return xdfgetParticipateId(); }

    public Map<String, DbParticipateRoleCQ> xdfgetParticipateId_ExistsReferrer_ParticipateRoleList() { return xgetSQueMap("participateId_ExistsReferrer_ParticipateRoleList"); }
    public String keepParticipateId_ExistsReferrer_ParticipateRoleList(DbParticipateRoleCQ sq) { return xkeepSQue("participateId_ExistsReferrer_ParticipateRoleList", sq); }

    public Map<String, DbParticipateRoleCQ> xdfgetParticipateId_NotExistsReferrer_ParticipateRoleList() { return xgetSQueMap("participateId_NotExistsReferrer_ParticipateRoleList"); }
    public String keepParticipateId_NotExistsReferrer_ParticipateRoleList(DbParticipateRoleCQ sq) { return xkeepSQue("participateId_NotExistsReferrer_ParticipateRoleList", sq); }

    public Map<String, DbParticipateRoleCQ> xdfgetParticipateId_SpecifyDerivedReferrer_ParticipateRoleList() { return xgetSQueMap("participateId_SpecifyDerivedReferrer_ParticipateRoleList"); }
    public String keepParticipateId_SpecifyDerivedReferrer_ParticipateRoleList(DbParticipateRoleCQ sq) { return xkeepSQue("participateId_SpecifyDerivedReferrer_ParticipateRoleList", sq); }

    public Map<String, DbParticipateRoleCQ> xdfgetParticipateId_QueryDerivedReferrer_ParticipateRoleList() { return xgetSQueMap("participateId_QueryDerivedReferrer_ParticipateRoleList"); }
    public String keepParticipateId_QueryDerivedReferrer_ParticipateRoleList(DbParticipateRoleCQ sq) { return xkeepSQue("participateId_QueryDerivedReferrer_ParticipateRoleList", sq); }
    public Map<String, Object> xdfgetParticipateId_QueryDerivedReferrer_ParticipateRoleListParameter() { return xgetSQuePmMap("participateId_QueryDerivedReferrer_ParticipateRoleList"); }
    public String keepParticipateId_QueryDerivedReferrer_ParticipateRoleListParameter(Object pm) { return xkeepSQuePm("participateId_QueryDerivedReferrer_ParticipateRoleList", pm); }

    /**
     * Add order-by as ascend. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_ParticipateId_Asc() { regOBA("participate_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_ParticipateId_Desc() { regOBD("participate_id"); return this; }

    protected ConditionValue _scenarioId;
    public ConditionValue xdfgetScenarioId()
    { if (_scenarioId == null) { _scenarioId = nCV(); }
      return _scenarioId; }
    protected ConditionValue xgetCValueScenarioId() { return xdfgetScenarioId(); }

    /**
     * Add order-by as ascend. <br>
     * scenario_id: {UQ+, NotNull, INT UNSIGNED(10), FK to scenario}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_ScenarioId_Asc() { regOBA("scenario_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * scenario_id: {UQ+, NotNull, INT UNSIGNED(10), FK to scenario}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_ScenarioId_Desc() { regOBD("scenario_id"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * user_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

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
    public DbBsParticipateCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsParticipateCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsParticipateCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsParticipateCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsParticipateCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsParticipateCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsParticipateCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbParticipateCQ bq = (DbParticipateCQ)bqs;
        DbParticipateCQ uq = (DbParticipateCQ)uqs;
        if (bq.hasConditionQueryScenario()) {
            uq.queryScenario().reflectRelationOnUnionQuery(bq.queryScenario(), uq.queryScenario());
        }
        if (bq.hasConditionQueryUser()) {
            uq.queryUser().reflectRelationOnUnionQuery(bq.queryUser(), uq.queryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * SCENARIO by my scenario_id, named 'scenario'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbScenarioCQ queryScenario() {
        return xdfgetConditionQueryScenario();
    }
    public DbScenarioCQ xdfgetConditionQueryScenario() {
        String prop = "scenario";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryScenario()); xsetupOuterJoinScenario(); }
        return xgetQueRlMap(prop);
    }
    protected DbScenarioCQ xcreateQueryScenario() {
        String nrp = xresolveNRP("participate", "scenario"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbScenarioCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "scenario", nrp);
    }
    protected void xsetupOuterJoinScenario() { xregOutJo("scenario"); }
    public boolean hasConditionQueryScenario() { return xhasQueRlMap("scenario"); }

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
        String nrp = xresolveNRP("participate", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, DbParticipateCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbParticipateCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbParticipateCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbParticipateCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbParticipateCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbParticipateCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbParticipateCQ> _myselfExistsMap;
    public Map<String, DbParticipateCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbParticipateCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbParticipateCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbParticipateCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbParticipateCB.class.getName(); }
    protected String xCQ() { return DbParticipateCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
