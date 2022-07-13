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
 * The base condition-query of game_system.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsGameSystemCQ extends DbAbstractBsGameSystemCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbGameSystemCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsGameSystemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from game_system) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbGameSystemCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbGameSystemCIQ xcreateCIQ() {
        DbGameSystemCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbGameSystemCIQ xnewCIQ() {
        return new DbGameSystemCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join game_system on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbGameSystemCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbGameSystemCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _gameSystemId;
    public ConditionValue xdfgetGameSystemId()
    { if (_gameSystemId == null) { _gameSystemId = nCV(); }
      return _gameSystemId; }
    protected ConditionValue xgetCValueGameSystemId() { return xdfgetGameSystemId(); }

    public Map<String, DbRuleBookCQ> xdfgetGameSystemId_ExistsReferrer_RuleBookList() { return xgetSQueMap("gameSystemId_ExistsReferrer_RuleBookList"); }
    public String keepGameSystemId_ExistsReferrer_RuleBookList(DbRuleBookCQ sq) { return xkeepSQue("gameSystemId_ExistsReferrer_RuleBookList", sq); }

    public Map<String, DbScenarioCQ> xdfgetGameSystemId_ExistsReferrer_ScenarioList() { return xgetSQueMap("gameSystemId_ExistsReferrer_ScenarioList"); }
    public String keepGameSystemId_ExistsReferrer_ScenarioList(DbScenarioCQ sq) { return xkeepSQue("gameSystemId_ExistsReferrer_ScenarioList", sq); }

    public Map<String, DbRuleBookCQ> xdfgetGameSystemId_NotExistsReferrer_RuleBookList() { return xgetSQueMap("gameSystemId_NotExistsReferrer_RuleBookList"); }
    public String keepGameSystemId_NotExistsReferrer_RuleBookList(DbRuleBookCQ sq) { return xkeepSQue("gameSystemId_NotExistsReferrer_RuleBookList", sq); }

    public Map<String, DbScenarioCQ> xdfgetGameSystemId_NotExistsReferrer_ScenarioList() { return xgetSQueMap("gameSystemId_NotExistsReferrer_ScenarioList"); }
    public String keepGameSystemId_NotExistsReferrer_ScenarioList(DbScenarioCQ sq) { return xkeepSQue("gameSystemId_NotExistsReferrer_ScenarioList", sq); }

    public Map<String, DbRuleBookCQ> xdfgetGameSystemId_SpecifyDerivedReferrer_RuleBookList() { return xgetSQueMap("gameSystemId_SpecifyDerivedReferrer_RuleBookList"); }
    public String keepGameSystemId_SpecifyDerivedReferrer_RuleBookList(DbRuleBookCQ sq) { return xkeepSQue("gameSystemId_SpecifyDerivedReferrer_RuleBookList", sq); }

    public Map<String, DbScenarioCQ> xdfgetGameSystemId_SpecifyDerivedReferrer_ScenarioList() { return xgetSQueMap("gameSystemId_SpecifyDerivedReferrer_ScenarioList"); }
    public String keepGameSystemId_SpecifyDerivedReferrer_ScenarioList(DbScenarioCQ sq) { return xkeepSQue("gameSystemId_SpecifyDerivedReferrer_ScenarioList", sq); }

    public Map<String, DbRuleBookCQ> xdfgetGameSystemId_QueryDerivedReferrer_RuleBookList() { return xgetSQueMap("gameSystemId_QueryDerivedReferrer_RuleBookList"); }
    public String keepGameSystemId_QueryDerivedReferrer_RuleBookList(DbRuleBookCQ sq) { return xkeepSQue("gameSystemId_QueryDerivedReferrer_RuleBookList", sq); }
    public Map<String, Object> xdfgetGameSystemId_QueryDerivedReferrer_RuleBookListParameter() { return xgetSQuePmMap("gameSystemId_QueryDerivedReferrer_RuleBookList"); }
    public String keepGameSystemId_QueryDerivedReferrer_RuleBookListParameter(Object pm) { return xkeepSQuePm("gameSystemId_QueryDerivedReferrer_RuleBookList", pm); }

    public Map<String, DbScenarioCQ> xdfgetGameSystemId_QueryDerivedReferrer_ScenarioList() { return xgetSQueMap("gameSystemId_QueryDerivedReferrer_ScenarioList"); }
    public String keepGameSystemId_QueryDerivedReferrer_ScenarioList(DbScenarioCQ sq) { return xkeepSQue("gameSystemId_QueryDerivedReferrer_ScenarioList", sq); }
    public Map<String, Object> xdfgetGameSystemId_QueryDerivedReferrer_ScenarioListParameter() { return xgetSQuePmMap("gameSystemId_QueryDerivedReferrer_ScenarioList"); }
    public String keepGameSystemId_QueryDerivedReferrer_ScenarioListParameter(Object pm) { return xkeepSQuePm("gameSystemId_QueryDerivedReferrer_ScenarioList", pm); }

    /**
     * Add order-by as ascend. <br>
     * game_system_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGameSystemCQ addOrderBy_GameSystemId_Asc() { regOBA("game_system_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_system_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGameSystemCQ addOrderBy_GameSystemId_Desc() { regOBD("game_system_id"); return this; }

    protected ConditionValue _gameSystemName;
    public ConditionValue xdfgetGameSystemName()
    { if (_gameSystemName == null) { _gameSystemName = nCV(); }
      return _gameSystemName; }
    protected ConditionValue xgetCValueGameSystemName() { return xdfgetGameSystemName(); }

    /**
     * Add order-by as ascend. <br>
     * game_system_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGameSystemCQ addOrderBy_GameSystemName_Asc() { regOBA("game_system_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_system_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGameSystemCQ addOrderBy_GameSystemName_Desc() { regOBD("game_system_name"); return this; }

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
    public DbBsGameSystemCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsGameSystemCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsGameSystemCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsGameSystemCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsGameSystemCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsGameSystemCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsGameSystemCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsGameSystemCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsGameSystemCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsGameSystemCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbGameSystemCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbGameSystemCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbGameSystemCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbGameSystemCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbGameSystemCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbGameSystemCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbGameSystemCQ> _myselfExistsMap;
    public Map<String, DbGameSystemCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbGameSystemCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbGameSystemCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbGameSystemCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbGameSystemCB.class.getName(); }
    protected String xCQ() { return DbGameSystemCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
