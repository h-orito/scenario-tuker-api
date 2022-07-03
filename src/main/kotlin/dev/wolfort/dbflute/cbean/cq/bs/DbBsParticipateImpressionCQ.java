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
 * The base condition-query of participate_impression.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsParticipateImpressionCQ extends DbAbstractBsParticipateImpressionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbParticipateImpressionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsParticipateImpressionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from participate_impression) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbParticipateImpressionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbParticipateImpressionCIQ xcreateCIQ() {
        DbParticipateImpressionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbParticipateImpressionCIQ xnewCIQ() {
        return new DbParticipateImpressionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join participate_impression on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbParticipateImpressionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbParticipateImpressionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _participateImpressionId;
    public ConditionValue xdfgetParticipateImpressionId()
    { if (_participateImpressionId == null) { _participateImpressionId = nCV(); }
      return _participateImpressionId; }
    protected ConditionValue xgetCValueParticipateImpressionId() { return xdfgetParticipateImpressionId(); }

    /**
     * Add order-by as ascend. <br>
     * participate_impression_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_ParticipateImpressionId_Asc() { regOBA("participate_impression_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * participate_impression_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_ParticipateImpressionId_Desc() { regOBD("participate_impression_id"); return this; }

    protected ConditionValue _participateId;
    public ConditionValue xdfgetParticipateId()
    { if (_participateId == null) { _participateId = nCV(); }
      return _participateId; }
    protected ConditionValue xgetCValueParticipateId() { return xdfgetParticipateId(); }

    /**
     * Add order-by as ascend. <br>
     * participate_id: {UQ, NotNull, INT UNSIGNED(10), FK to participate}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_ParticipateId_Asc() { regOBA("participate_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * participate_id: {UQ, NotNull, INT UNSIGNED(10), FK to participate}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_ParticipateId_Desc() { regOBD("participate_id"); return this; }

    protected ConditionValue _hasSpoiler;
    public ConditionValue xdfgetHasSpoiler()
    { if (_hasSpoiler == null) { _hasSpoiler = nCV(); }
      return _hasSpoiler; }
    protected ConditionValue xgetCValueHasSpoiler() { return xdfgetHasSpoiler(); }

    /**
     * Add order-by as ascend. <br>
     * has_spoiler: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_HasSpoiler_Asc() { regOBA("has_spoiler"); return this; }

    /**
     * Add order-by as descend. <br>
     * has_spoiler: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_HasSpoiler_Desc() { regOBD("has_spoiler"); return this; }

    protected ConditionValue _disclosureRange;
    public ConditionValue xdfgetDisclosureRange()
    { if (_disclosureRange == null) { _disclosureRange = nCV(); }
      return _disclosureRange; }
    protected ConditionValue xgetCValueDisclosureRange() { return xdfgetDisclosureRange(); }

    /**
     * Add order-by as ascend. <br>
     * disclosure_range: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_DisclosureRange_Asc() { regOBA("disclosure_range"); return this; }

    /**
     * Add order-by as descend. <br>
     * disclosure_range: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_DisclosureRange_Desc() { regOBD("disclosure_range"); return this; }

    protected ConditionValue _impression;
    public ConditionValue xdfgetImpression()
    { if (_impression == null) { _impression = nCV(); }
      return _impression; }
    protected ConditionValue xgetCValueImpression() { return xdfgetImpression(); }

    /**
     * Add order-by as ascend. <br>
     * impression: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_Impression_Asc() { regOBA("impression"); return this; }

    /**
     * Add order-by as descend. <br>
     * impression: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_Impression_Desc() { regOBD("impression"); return this; }

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
    public DbBsParticipateImpressionCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsParticipateImpressionCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsParticipateImpressionCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsParticipateImpressionCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsParticipateImpressionCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsParticipateImpressionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsParticipateImpressionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbParticipateImpressionCQ bq = (DbParticipateImpressionCQ)bqs;
        DbParticipateImpressionCQ uq = (DbParticipateImpressionCQ)uqs;
        if (bq.hasConditionQueryParticipate()) {
            uq.queryParticipate().reflectRelationOnUnionQuery(bq.queryParticipate(), uq.queryParticipate());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * PARTICIPATE by my participate_id, named 'participate'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbParticipateCQ queryParticipate() {
        return xdfgetConditionQueryParticipate();
    }
    public DbParticipateCQ xdfgetConditionQueryParticipate() {
        String prop = "participate";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryParticipate()); xsetupOuterJoinParticipate(); }
        return xgetQueRlMap(prop);
    }
    protected DbParticipateCQ xcreateQueryParticipate() {
        String nrp = xresolveNRP("participate_impression", "participate"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbParticipateCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "participate", nrp);
    }
    protected void xsetupOuterJoinParticipate() { xregOutJo("participate"); }
    public boolean hasConditionQueryParticipate() { return xhasQueRlMap("participate"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbParticipateImpressionCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbParticipateImpressionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbParticipateImpressionCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbParticipateImpressionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbParticipateImpressionCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbParticipateImpressionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbParticipateImpressionCQ> _myselfExistsMap;
    public Map<String, DbParticipateImpressionCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbParticipateImpressionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbParticipateImpressionCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbParticipateImpressionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbParticipateImpressionCB.class.getName(); }
    protected String xCQ() { return DbParticipateImpressionCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
