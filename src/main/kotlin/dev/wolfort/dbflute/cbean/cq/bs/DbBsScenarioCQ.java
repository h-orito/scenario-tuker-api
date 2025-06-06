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
 * The base condition-query of scenario.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsScenarioCQ extends DbAbstractBsScenarioCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbScenarioCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsScenarioCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from scenario) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbScenarioCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbScenarioCIQ xcreateCIQ() {
        DbScenarioCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbScenarioCIQ xnewCIQ() {
        return new DbScenarioCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join scenario on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbScenarioCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbScenarioCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _scenarioId;
    public ConditionValue xdfgetScenarioId()
    { if (_scenarioId == null) { _scenarioId = nCV(); }
      return _scenarioId; }
    protected ConditionValue xgetCValueScenarioId() { return xdfgetScenarioId(); }

    public Map<String, DbParticipateCQ> xdfgetScenarioId_ExistsReferrer_ParticipateList() { return xgetSQueMap("scenarioId_ExistsReferrer_ParticipateList"); }
    public String keepScenarioId_ExistsReferrer_ParticipateList(DbParticipateCQ sq) { return xkeepSQue("scenarioId_ExistsReferrer_ParticipateList", sq); }

    public Map<String, DbScenarioAuthorCQ> xdfgetScenarioId_ExistsReferrer_ScenarioAuthorList() { return xgetSQueMap("scenarioId_ExistsReferrer_ScenarioAuthorList"); }
    public String keepScenarioId_ExistsReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq) { return xkeepSQue("scenarioId_ExistsReferrer_ScenarioAuthorList", sq); }

    public Map<String, DbScenarioDictionaryCQ> xdfgetScenarioId_ExistsReferrer_ScenarioDictionaryList() { return xgetSQueMap("scenarioId_ExistsReferrer_ScenarioDictionaryList"); }
    public String keepScenarioId_ExistsReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq) { return xkeepSQue("scenarioId_ExistsReferrer_ScenarioDictionaryList", sq); }

    public Map<String, DbScenarioGameSystemCQ> xdfgetScenarioId_ExistsReferrer_ScenarioGameSystemList() { return xgetSQueMap("scenarioId_ExistsReferrer_ScenarioGameSystemList"); }
    public String keepScenarioId_ExistsReferrer_ScenarioGameSystemList(DbScenarioGameSystemCQ sq) { return xkeepSQue("scenarioId_ExistsReferrer_ScenarioGameSystemList", sq); }

    public Map<String, DbUserScenarioCQ> xdfgetScenarioId_ExistsReferrer_UserScenarioList() { return xgetSQueMap("scenarioId_ExistsReferrer_UserScenarioList"); }
    public String keepScenarioId_ExistsReferrer_UserScenarioList(DbUserScenarioCQ sq) { return xkeepSQue("scenarioId_ExistsReferrer_UserScenarioList", sq); }

    public Map<String, DbParticipateCQ> xdfgetScenarioId_NotExistsReferrer_ParticipateList() { return xgetSQueMap("scenarioId_NotExistsReferrer_ParticipateList"); }
    public String keepScenarioId_NotExistsReferrer_ParticipateList(DbParticipateCQ sq) { return xkeepSQue("scenarioId_NotExistsReferrer_ParticipateList", sq); }

    public Map<String, DbScenarioAuthorCQ> xdfgetScenarioId_NotExistsReferrer_ScenarioAuthorList() { return xgetSQueMap("scenarioId_NotExistsReferrer_ScenarioAuthorList"); }
    public String keepScenarioId_NotExistsReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq) { return xkeepSQue("scenarioId_NotExistsReferrer_ScenarioAuthorList", sq); }

    public Map<String, DbScenarioDictionaryCQ> xdfgetScenarioId_NotExistsReferrer_ScenarioDictionaryList() { return xgetSQueMap("scenarioId_NotExistsReferrer_ScenarioDictionaryList"); }
    public String keepScenarioId_NotExistsReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq) { return xkeepSQue("scenarioId_NotExistsReferrer_ScenarioDictionaryList", sq); }

    public Map<String, DbScenarioGameSystemCQ> xdfgetScenarioId_NotExistsReferrer_ScenarioGameSystemList() { return xgetSQueMap("scenarioId_NotExistsReferrer_ScenarioGameSystemList"); }
    public String keepScenarioId_NotExistsReferrer_ScenarioGameSystemList(DbScenarioGameSystemCQ sq) { return xkeepSQue("scenarioId_NotExistsReferrer_ScenarioGameSystemList", sq); }

    public Map<String, DbUserScenarioCQ> xdfgetScenarioId_NotExistsReferrer_UserScenarioList() { return xgetSQueMap("scenarioId_NotExistsReferrer_UserScenarioList"); }
    public String keepScenarioId_NotExistsReferrer_UserScenarioList(DbUserScenarioCQ sq) { return xkeepSQue("scenarioId_NotExistsReferrer_UserScenarioList", sq); }

    public Map<String, DbParticipateCQ> xdfgetScenarioId_SpecifyDerivedReferrer_ParticipateList() { return xgetSQueMap("scenarioId_SpecifyDerivedReferrer_ParticipateList"); }
    public String keepScenarioId_SpecifyDerivedReferrer_ParticipateList(DbParticipateCQ sq) { return xkeepSQue("scenarioId_SpecifyDerivedReferrer_ParticipateList", sq); }

    public Map<String, DbScenarioAuthorCQ> xdfgetScenarioId_SpecifyDerivedReferrer_ScenarioAuthorList() { return xgetSQueMap("scenarioId_SpecifyDerivedReferrer_ScenarioAuthorList"); }
    public String keepScenarioId_SpecifyDerivedReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq) { return xkeepSQue("scenarioId_SpecifyDerivedReferrer_ScenarioAuthorList", sq); }

    public Map<String, DbScenarioDictionaryCQ> xdfgetScenarioId_SpecifyDerivedReferrer_ScenarioDictionaryList() { return xgetSQueMap("scenarioId_SpecifyDerivedReferrer_ScenarioDictionaryList"); }
    public String keepScenarioId_SpecifyDerivedReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq) { return xkeepSQue("scenarioId_SpecifyDerivedReferrer_ScenarioDictionaryList", sq); }

    public Map<String, DbScenarioGameSystemCQ> xdfgetScenarioId_SpecifyDerivedReferrer_ScenarioGameSystemList() { return xgetSQueMap("scenarioId_SpecifyDerivedReferrer_ScenarioGameSystemList"); }
    public String keepScenarioId_SpecifyDerivedReferrer_ScenarioGameSystemList(DbScenarioGameSystemCQ sq) { return xkeepSQue("scenarioId_SpecifyDerivedReferrer_ScenarioGameSystemList", sq); }

    public Map<String, DbUserScenarioCQ> xdfgetScenarioId_SpecifyDerivedReferrer_UserScenarioList() { return xgetSQueMap("scenarioId_SpecifyDerivedReferrer_UserScenarioList"); }
    public String keepScenarioId_SpecifyDerivedReferrer_UserScenarioList(DbUserScenarioCQ sq) { return xkeepSQue("scenarioId_SpecifyDerivedReferrer_UserScenarioList", sq); }

    public Map<String, DbParticipateCQ> xdfgetScenarioId_QueryDerivedReferrer_ParticipateList() { return xgetSQueMap("scenarioId_QueryDerivedReferrer_ParticipateList"); }
    public String keepScenarioId_QueryDerivedReferrer_ParticipateList(DbParticipateCQ sq) { return xkeepSQue("scenarioId_QueryDerivedReferrer_ParticipateList", sq); }
    public Map<String, Object> xdfgetScenarioId_QueryDerivedReferrer_ParticipateListParameter() { return xgetSQuePmMap("scenarioId_QueryDerivedReferrer_ParticipateList"); }
    public String keepScenarioId_QueryDerivedReferrer_ParticipateListParameter(Object pm) { return xkeepSQuePm("scenarioId_QueryDerivedReferrer_ParticipateList", pm); }

    public Map<String, DbScenarioAuthorCQ> xdfgetScenarioId_QueryDerivedReferrer_ScenarioAuthorList() { return xgetSQueMap("scenarioId_QueryDerivedReferrer_ScenarioAuthorList"); }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq) { return xkeepSQue("scenarioId_QueryDerivedReferrer_ScenarioAuthorList", sq); }
    public Map<String, Object> xdfgetScenarioId_QueryDerivedReferrer_ScenarioAuthorListParameter() { return xgetSQuePmMap("scenarioId_QueryDerivedReferrer_ScenarioAuthorList"); }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioAuthorListParameter(Object pm) { return xkeepSQuePm("scenarioId_QueryDerivedReferrer_ScenarioAuthorList", pm); }

    public Map<String, DbScenarioDictionaryCQ> xdfgetScenarioId_QueryDerivedReferrer_ScenarioDictionaryList() { return xgetSQueMap("scenarioId_QueryDerivedReferrer_ScenarioDictionaryList"); }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq) { return xkeepSQue("scenarioId_QueryDerivedReferrer_ScenarioDictionaryList", sq); }
    public Map<String, Object> xdfgetScenarioId_QueryDerivedReferrer_ScenarioDictionaryListParameter() { return xgetSQuePmMap("scenarioId_QueryDerivedReferrer_ScenarioDictionaryList"); }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioDictionaryListParameter(Object pm) { return xkeepSQuePm("scenarioId_QueryDerivedReferrer_ScenarioDictionaryList", pm); }

    public Map<String, DbScenarioGameSystemCQ> xdfgetScenarioId_QueryDerivedReferrer_ScenarioGameSystemList() { return xgetSQueMap("scenarioId_QueryDerivedReferrer_ScenarioGameSystemList"); }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioGameSystemList(DbScenarioGameSystemCQ sq) { return xkeepSQue("scenarioId_QueryDerivedReferrer_ScenarioGameSystemList", sq); }
    public Map<String, Object> xdfgetScenarioId_QueryDerivedReferrer_ScenarioGameSystemListParameter() { return xgetSQuePmMap("scenarioId_QueryDerivedReferrer_ScenarioGameSystemList"); }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioGameSystemListParameter(Object pm) { return xkeepSQuePm("scenarioId_QueryDerivedReferrer_ScenarioGameSystemList", pm); }

    public Map<String, DbUserScenarioCQ> xdfgetScenarioId_QueryDerivedReferrer_UserScenarioList() { return xgetSQueMap("scenarioId_QueryDerivedReferrer_UserScenarioList"); }
    public String keepScenarioId_QueryDerivedReferrer_UserScenarioList(DbUserScenarioCQ sq) { return xkeepSQue("scenarioId_QueryDerivedReferrer_UserScenarioList", sq); }
    public Map<String, Object> xdfgetScenarioId_QueryDerivedReferrer_UserScenarioListParameter() { return xgetSQuePmMap("scenarioId_QueryDerivedReferrer_UserScenarioList"); }
    public String keepScenarioId_QueryDerivedReferrer_UserScenarioListParameter(Object pm) { return xkeepSQuePm("scenarioId_QueryDerivedReferrer_UserScenarioList", pm); }

    /**
     * Add order-by as ascend. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_ScenarioId_Asc() { regOBA("scenario_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_ScenarioId_Desc() { regOBD("scenario_id"); return this; }

    protected ConditionValue _scenarioName;
    public ConditionValue xdfgetScenarioName()
    { if (_scenarioName == null) { _scenarioName = nCV(); }
      return _scenarioName; }
    protected ConditionValue xgetCValueScenarioName() { return xdfgetScenarioName(); }

    /**
     * Add order-by as ascend. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_ScenarioName_Asc() { regOBA("scenario_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_ScenarioName_Desc() { regOBD("scenario_name"); return this; }

    protected ConditionValue _scenarioType;
    public ConditionValue xdfgetScenarioType()
    { if (_scenarioType == null) { _scenarioType = nCV(); }
      return _scenarioType; }
    protected ConditionValue xgetCValueScenarioType() { return xdfgetScenarioType(); }

    /**
     * Add order-by as ascend. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_ScenarioType_Asc() { regOBA("scenario_type"); return this; }

    /**
     * Add order-by as descend. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_ScenarioType_Desc() { regOBD("scenario_type"); return this; }

    protected ConditionValue _scenarioUrl;
    public ConditionValue xdfgetScenarioUrl()
    { if (_scenarioUrl == null) { _scenarioUrl = nCV(); }
      return _scenarioUrl; }
    protected ConditionValue xgetCValueScenarioUrl() { return xdfgetScenarioUrl(); }

    /**
     * Add order-by as ascend. <br>
     * scenario_url: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_ScenarioUrl_Asc() { regOBA("scenario_url"); return this; }

    /**
     * Add order-by as descend. <br>
     * scenario_url: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_ScenarioUrl_Desc() { regOBD("scenario_url"); return this; }

    protected ConditionValue _gameMasterRequirement;
    public ConditionValue xdfgetGameMasterRequirement()
    { if (_gameMasterRequirement == null) { _gameMasterRequirement = nCV(); }
      return _gameMasterRequirement; }
    protected ConditionValue xgetCValueGameMasterRequirement() { return xdfgetGameMasterRequirement(); }

    /**
     * Add order-by as ascend. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_GameMasterRequirement_Asc() { regOBA("game_master_requirement"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_GameMasterRequirement_Desc() { regOBD("game_master_requirement"); return this; }

    protected ConditionValue _playerNumMin;
    public ConditionValue xdfgetPlayerNumMin()
    { if (_playerNumMin == null) { _playerNumMin = nCV(); }
      return _playerNumMin; }
    protected ConditionValue xgetCValuePlayerNumMin() { return xdfgetPlayerNumMin(); }

    /**
     * Add order-by as ascend. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_PlayerNumMin_Asc() { regOBA("player_num_min"); return this; }

    /**
     * Add order-by as descend. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_PlayerNumMin_Desc() { regOBD("player_num_min"); return this; }

    protected ConditionValue _playerNumMax;
    public ConditionValue xdfgetPlayerNumMax()
    { if (_playerNumMax == null) { _playerNumMax = nCV(); }
      return _playerNumMax; }
    protected ConditionValue xgetCValuePlayerNumMax() { return xdfgetPlayerNumMax(); }

    /**
     * Add order-by as ascend. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_PlayerNumMax_Asc() { regOBA("player_num_max"); return this; }

    /**
     * Add order-by as descend. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_PlayerNumMax_Desc() { regOBD("player_num_max"); return this; }

    protected ConditionValue _requiredHours;
    public ConditionValue xdfgetRequiredHours()
    { if (_requiredHours == null) { _requiredHours = nCV(); }
      return _requiredHours; }
    protected ConditionValue xgetCValueRequiredHours() { return xdfgetRequiredHours(); }

    /**
     * Add order-by as ascend. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_RequiredHours_Asc() { regOBA("required_hours"); return this; }

    /**
     * Add order-by as descend. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_RequiredHours_Desc() { regOBD("required_hours"); return this; }

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
    public DbBsScenarioCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsScenarioCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsScenarioCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsScenarioCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsScenarioCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsScenarioCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsScenarioCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, DbScenarioCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbScenarioCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbScenarioCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbScenarioCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbScenarioCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbScenarioCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbScenarioCQ> _myselfExistsMap;
    public Map<String, DbScenarioCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbScenarioCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbScenarioCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbScenarioCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbScenarioCB.class.getName(); }
    protected String xCQ() { return DbScenarioCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
