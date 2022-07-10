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
 * The base condition-query of scenario_author.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsScenarioAuthorCQ extends DbAbstractBsScenarioAuthorCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbScenarioAuthorCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsScenarioAuthorCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from scenario_author) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbScenarioAuthorCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbScenarioAuthorCIQ xcreateCIQ() {
        DbScenarioAuthorCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbScenarioAuthorCIQ xnewCIQ() {
        return new DbScenarioAuthorCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join scenario_author on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbScenarioAuthorCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbScenarioAuthorCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _scenarioAuthorId;
    public ConditionValue xdfgetScenarioAuthorId()
    { if (_scenarioAuthorId == null) { _scenarioAuthorId = nCV(); }
      return _scenarioAuthorId; }
    protected ConditionValue xgetCValueScenarioAuthorId() { return xdfgetScenarioAuthorId(); }

    /**
     * Add order-by as ascend. <br>
     * scenario_author_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioAuthorCQ addOrderBy_ScenarioAuthorId_Asc() { regOBA("scenario_author_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * scenario_author_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsScenarioAuthorCQ addOrderBy_ScenarioAuthorId_Desc() { regOBD("scenario_author_id"); return this; }

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
    public DbBsScenarioAuthorCQ addOrderBy_ScenarioId_Asc() { regOBA("scenario_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * scenario_id: {UQ+, NotNull, INT UNSIGNED(10), FK to scenario}
     * @return this. (NotNull)
     */
    public DbBsScenarioAuthorCQ addOrderBy_ScenarioId_Desc() { regOBD("scenario_id"); return this; }

    protected ConditionValue _authorId;
    public ConditionValue xdfgetAuthorId()
    { if (_authorId == null) { _authorId = nCV(); }
      return _authorId; }
    protected ConditionValue xgetCValueAuthorId() { return xdfgetAuthorId(); }

    /**
     * Add order-by as ascend. <br>
     * author_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to author}
     * @return this. (NotNull)
     */
    public DbBsScenarioAuthorCQ addOrderBy_AuthorId_Asc() { regOBA("author_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * author_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to author}
     * @return this. (NotNull)
     */
    public DbBsScenarioAuthorCQ addOrderBy_AuthorId_Desc() { regOBD("author_id"); return this; }

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
    public DbBsScenarioAuthorCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsScenarioAuthorCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsScenarioAuthorCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsScenarioAuthorCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsScenarioAuthorCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsScenarioAuthorCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsScenarioAuthorCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsScenarioAuthorCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsScenarioAuthorCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsScenarioAuthorCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbScenarioAuthorCQ bq = (DbScenarioAuthorCQ)bqs;
        DbScenarioAuthorCQ uq = (DbScenarioAuthorCQ)uqs;
        if (bq.hasConditionQueryAuthor()) {
            uq.queryAuthor().reflectRelationOnUnionQuery(bq.queryAuthor(), uq.queryAuthor());
        }
        if (bq.hasConditionQueryScenario()) {
            uq.queryScenario().reflectRelationOnUnionQuery(bq.queryScenario(), uq.queryScenario());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * AUTHOR by my author_id, named 'author'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbAuthorCQ queryAuthor() {
        return xdfgetConditionQueryAuthor();
    }
    public DbAuthorCQ xdfgetConditionQueryAuthor() {
        String prop = "author";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAuthor()); xsetupOuterJoinAuthor(); }
        return xgetQueRlMap(prop);
    }
    protected DbAuthorCQ xcreateQueryAuthor() {
        String nrp = xresolveNRP("scenario_author", "author"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbAuthorCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "author", nrp);
    }
    protected void xsetupOuterJoinAuthor() { xregOutJo("author"); }
    public boolean hasConditionQueryAuthor() { return xhasQueRlMap("author"); }

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
        String nrp = xresolveNRP("scenario_author", "scenario"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbScenarioCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "scenario", nrp);
    }
    protected void xsetupOuterJoinScenario() { xregOutJo("scenario"); }
    public boolean hasConditionQueryScenario() { return xhasQueRlMap("scenario"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbScenarioAuthorCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbScenarioAuthorCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbScenarioAuthorCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbScenarioAuthorCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbScenarioAuthorCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbScenarioAuthorCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbScenarioAuthorCQ> _myselfExistsMap;
    public Map<String, DbScenarioAuthorCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbScenarioAuthorCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbScenarioAuthorCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbScenarioAuthorCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbScenarioAuthorCB.class.getName(); }
    protected String xCQ() { return DbScenarioAuthorCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
