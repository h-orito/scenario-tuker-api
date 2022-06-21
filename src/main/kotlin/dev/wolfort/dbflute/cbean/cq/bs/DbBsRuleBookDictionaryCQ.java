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
 * The base condition-query of rule_book_dictionary.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsRuleBookDictionaryCQ extends DbAbstractBsRuleBookDictionaryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbRuleBookDictionaryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsRuleBookDictionaryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from rule_book_dictionary) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbRuleBookDictionaryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbRuleBookDictionaryCIQ xcreateCIQ() {
        DbRuleBookDictionaryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbRuleBookDictionaryCIQ xnewCIQ() {
        return new DbRuleBookDictionaryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join rule_book_dictionary on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbRuleBookDictionaryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbRuleBookDictionaryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ruleBookDictionaryId;
    public ConditionValue xdfgetRuleBookDictionaryId()
    { if (_ruleBookDictionaryId == null) { _ruleBookDictionaryId = nCV(); }
      return _ruleBookDictionaryId; }
    protected ConditionValue xgetCValueRuleBookDictionaryId() { return xdfgetRuleBookDictionaryId(); }

    /**
     * Add order-by as ascend. <br>
     * rule_book_dictionary_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookDictionaryCQ addOrderBy_RuleBookDictionaryId_Asc() { regOBA("rule_book_dictionary_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * rule_book_dictionary_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookDictionaryCQ addOrderBy_RuleBookDictionaryId_Desc() { regOBD("rule_book_dictionary_id"); return this; }

    protected ConditionValue _ruleBookId;
    public ConditionValue xdfgetRuleBookId()
    { if (_ruleBookId == null) { _ruleBookId = nCV(); }
      return _ruleBookId; }
    protected ConditionValue xgetCValueRuleBookId() { return xdfgetRuleBookId(); }

    /**
     * Add order-by as ascend. <br>
     * rule_book_id: {IX, INT UNSIGNED(10), FK to rule_book}
     * @return this. (NotNull)
     */
    public DbBsRuleBookDictionaryCQ addOrderBy_RuleBookId_Asc() { regOBA("rule_book_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * rule_book_id: {IX, INT UNSIGNED(10), FK to rule_book}
     * @return this. (NotNull)
     */
    public DbBsRuleBookDictionaryCQ addOrderBy_RuleBookId_Desc() { regOBD("rule_book_id"); return this; }

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
    public DbBsRuleBookDictionaryCQ addOrderBy_RuleBookName_Asc() { regOBA("rule_book_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookDictionaryCQ addOrderBy_RuleBookName_Desc() { regOBD("rule_book_name"); return this; }

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
    public DbBsRuleBookDictionaryCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookDictionaryCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsRuleBookDictionaryCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookDictionaryCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsRuleBookDictionaryCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookDictionaryCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsRuleBookDictionaryCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsRuleBookDictionaryCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsRuleBookDictionaryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsRuleBookDictionaryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbRuleBookDictionaryCQ bq = (DbRuleBookDictionaryCQ)bqs;
        DbRuleBookDictionaryCQ uq = (DbRuleBookDictionaryCQ)uqs;
        if (bq.hasConditionQueryRuleBook()) {
            uq.queryRuleBook().reflectRelationOnUnionQuery(bq.queryRuleBook(), uq.queryRuleBook());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * RULE_BOOK by my rule_book_id, named 'ruleBook'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbRuleBookCQ queryRuleBook() {
        return xdfgetConditionQueryRuleBook();
    }
    public DbRuleBookCQ xdfgetConditionQueryRuleBook() {
        String prop = "ruleBook";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryRuleBook()); xsetupOuterJoinRuleBook(); }
        return xgetQueRlMap(prop);
    }
    protected DbRuleBookCQ xcreateQueryRuleBook() {
        String nrp = xresolveNRP("rule_book_dictionary", "ruleBook"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbRuleBookCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "ruleBook", nrp);
    }
    protected void xsetupOuterJoinRuleBook() { xregOutJo("ruleBook"); }
    public boolean hasConditionQueryRuleBook() { return xhasQueRlMap("ruleBook"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbRuleBookDictionaryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbRuleBookDictionaryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbRuleBookDictionaryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbRuleBookDictionaryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbRuleBookDictionaryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbRuleBookDictionaryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbRuleBookDictionaryCQ> _myselfExistsMap;
    public Map<String, DbRuleBookDictionaryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbRuleBookDictionaryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbRuleBookDictionaryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbRuleBookDictionaryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbRuleBookDictionaryCB.class.getName(); }
    protected String xCQ() { return DbRuleBookDictionaryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
