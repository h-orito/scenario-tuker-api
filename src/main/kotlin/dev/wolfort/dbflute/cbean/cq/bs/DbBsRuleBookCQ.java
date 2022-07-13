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
 * The base condition-query of rule_book.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsRuleBookCQ extends DbAbstractBsRuleBookCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbRuleBookCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsRuleBookCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from rule_book) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbRuleBookCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbRuleBookCIQ xcreateCIQ() {
        DbRuleBookCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbRuleBookCIQ xnewCIQ() {
        return new DbRuleBookCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join rule_book on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbRuleBookCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbRuleBookCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ruleBookId;
    public ConditionValue xdfgetRuleBookId()
    { if (_ruleBookId == null) { _ruleBookId = nCV(); }
      return _ruleBookId; }
    protected ConditionValue xgetCValueRuleBookId() { return xdfgetRuleBookId(); }

    public Map<String, DbParticipateRuleBookCQ> xdfgetRuleBookId_ExistsReferrer_ParticipateRuleBookList() { return xgetSQueMap("ruleBookId_ExistsReferrer_ParticipateRuleBookList"); }
    public String keepRuleBookId_ExistsReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq) { return xkeepSQue("ruleBookId_ExistsReferrer_ParticipateRuleBookList", sq); }

    public Map<String, DbRuleBookDictionaryCQ> xdfgetRuleBookId_ExistsReferrer_RuleBookDictionaryList() { return xgetSQueMap("ruleBookId_ExistsReferrer_RuleBookDictionaryList"); }
    public String keepRuleBookId_ExistsReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq) { return xkeepSQue("ruleBookId_ExistsReferrer_RuleBookDictionaryList", sq); }

    public Map<String, DbParticipateRuleBookCQ> xdfgetRuleBookId_NotExistsReferrer_ParticipateRuleBookList() { return xgetSQueMap("ruleBookId_NotExistsReferrer_ParticipateRuleBookList"); }
    public String keepRuleBookId_NotExistsReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq) { return xkeepSQue("ruleBookId_NotExistsReferrer_ParticipateRuleBookList", sq); }

    public Map<String, DbRuleBookDictionaryCQ> xdfgetRuleBookId_NotExistsReferrer_RuleBookDictionaryList() { return xgetSQueMap("ruleBookId_NotExistsReferrer_RuleBookDictionaryList"); }
    public String keepRuleBookId_NotExistsReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq) { return xkeepSQue("ruleBookId_NotExistsReferrer_RuleBookDictionaryList", sq); }

    public Map<String, DbParticipateRuleBookCQ> xdfgetRuleBookId_SpecifyDerivedReferrer_ParticipateRuleBookList() { return xgetSQueMap("ruleBookId_SpecifyDerivedReferrer_ParticipateRuleBookList"); }
    public String keepRuleBookId_SpecifyDerivedReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq) { return xkeepSQue("ruleBookId_SpecifyDerivedReferrer_ParticipateRuleBookList", sq); }

    public Map<String, DbRuleBookDictionaryCQ> xdfgetRuleBookId_SpecifyDerivedReferrer_RuleBookDictionaryList() { return xgetSQueMap("ruleBookId_SpecifyDerivedReferrer_RuleBookDictionaryList"); }
    public String keepRuleBookId_SpecifyDerivedReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq) { return xkeepSQue("ruleBookId_SpecifyDerivedReferrer_RuleBookDictionaryList", sq); }

    public Map<String, DbParticipateRuleBookCQ> xdfgetRuleBookId_QueryDerivedReferrer_ParticipateRuleBookList() { return xgetSQueMap("ruleBookId_QueryDerivedReferrer_ParticipateRuleBookList"); }
    public String keepRuleBookId_QueryDerivedReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq) { return xkeepSQue("ruleBookId_QueryDerivedReferrer_ParticipateRuleBookList", sq); }
    public Map<String, Object> xdfgetRuleBookId_QueryDerivedReferrer_ParticipateRuleBookListParameter() { return xgetSQuePmMap("ruleBookId_QueryDerivedReferrer_ParticipateRuleBookList"); }
    public String keepRuleBookId_QueryDerivedReferrer_ParticipateRuleBookListParameter(Object pm) { return xkeepSQuePm("ruleBookId_QueryDerivedReferrer_ParticipateRuleBookList", pm); }

    public Map<String, DbRuleBookDictionaryCQ> xdfgetRuleBookId_QueryDerivedReferrer_RuleBookDictionaryList() { return xgetSQueMap("ruleBookId_QueryDerivedReferrer_RuleBookDictionaryList"); }
    public String keepRuleBookId_QueryDerivedReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq) { return xkeepSQue("ruleBookId_QueryDerivedReferrer_RuleBookDictionaryList", sq); }
    public Map<String, Object> xdfgetRuleBookId_QueryDerivedReferrer_RuleBookDictionaryListParameter() { return xgetSQuePmMap("ruleBookId_QueryDerivedReferrer_RuleBookDictionaryList"); }
    public String keepRuleBookId_QueryDerivedReferrer_RuleBookDictionaryListParameter(Object pm) { return xkeepSQuePm("ruleBookId_QueryDerivedReferrer_RuleBookDictionaryList", pm); }

    /**
     * Add order-by as ascend. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_RuleBookId_Asc() { regOBA("rule_book_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_RuleBookId_Desc() { regOBD("rule_book_id"); return this; }

    protected ConditionValue _gameSystemId;
    public ConditionValue xdfgetGameSystemId()
    { if (_gameSystemId == null) { _gameSystemId = nCV(); }
      return _gameSystemId; }
    protected ConditionValue xgetCValueGameSystemId() { return xdfgetGameSystemId(); }

    /**
     * Add order-by as ascend. <br>
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_GameSystemId_Asc() { regOBA("game_system_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_GameSystemId_Desc() { regOBD("game_system_id"); return this; }

    protected ConditionValue _ruleBookName;
    public ConditionValue xdfgetRuleBookName()
    { if (_ruleBookName == null) { _ruleBookName = nCV(); }
      return _ruleBookName; }
    protected ConditionValue xgetCValueRuleBookName() { return xdfgetRuleBookName(); }

    /**
     * Add order-by as ascend. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_RuleBookName_Asc() { regOBA("rule_book_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_RuleBookName_Desc() { regOBD("rule_book_name"); return this; }

    protected ConditionValue _ruleBookType;
    public ConditionValue xdfgetRuleBookType()
    { if (_ruleBookType == null) { _ruleBookType = nCV(); }
      return _ruleBookType; }
    protected ConditionValue xgetCValueRuleBookType() { return xdfgetRuleBookType(); }

    /**
     * Add order-by as ascend. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_RuleBookType_Asc() { regOBA("rule_book_type"); return this; }

    /**
     * Add order-by as descend. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_RuleBookType_Desc() { regOBD("rule_book_type"); return this; }

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
    public DbBsRuleBookCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsRuleBookCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsRuleBookCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsRuleBookCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsRuleBookCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsRuleBookCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbRuleBookCQ bq = (DbRuleBookCQ)bqs;
        DbRuleBookCQ uq = (DbRuleBookCQ)uqs;
        if (bq.hasConditionQueryGameSystem()) {
            uq.queryGameSystem().reflectRelationOnUnionQuery(bq.queryGameSystem(), uq.queryGameSystem());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * GAME_SYSTEM by my game_system_id, named 'gameSystem'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbGameSystemCQ queryGameSystem() {
        return xdfgetConditionQueryGameSystem();
    }
    public DbGameSystemCQ xdfgetConditionQueryGameSystem() {
        String prop = "gameSystem";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGameSystem()); xsetupOuterJoinGameSystem(); }
        return xgetQueRlMap(prop);
    }
    protected DbGameSystemCQ xcreateQueryGameSystem() {
        String nrp = xresolveNRP("rule_book", "gameSystem"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbGameSystemCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "gameSystem", nrp);
    }
    protected void xsetupOuterJoinGameSystem() { xregOutJo("gameSystem"); }
    public boolean hasConditionQueryGameSystem() { return xhasQueRlMap("gameSystem"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbRuleBookCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbRuleBookCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbRuleBookCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbRuleBookCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbRuleBookCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbRuleBookCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbRuleBookCQ> _myselfExistsMap;
    public Map<String, DbRuleBookCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbRuleBookCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbRuleBookCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbRuleBookCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbRuleBookCB.class.getName(); }
    protected String xCQ() { return DbRuleBookCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
