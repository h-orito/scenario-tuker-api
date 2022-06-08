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
 * The base condition-query of participate_role.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsParticipateRoleCQ extends DbAbstractBsParticipateRoleCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbParticipateRoleCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsParticipateRoleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from participate_role) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbParticipateRoleCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbParticipateRoleCIQ xcreateCIQ() {
        DbParticipateRoleCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbParticipateRoleCIQ xnewCIQ() {
        return new DbParticipateRoleCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join participate_role on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbParticipateRoleCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbParticipateRoleCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _participateRoleId;
    public ConditionValue xdfgetParticipateRoleId()
    { if (_participateRoleId == null) { _participateRoleId = nCV(); }
      return _participateRoleId; }
    protected ConditionValue xgetCValueParticipateRoleId() { return xdfgetParticipateRoleId(); }

    /**
     * Add order-by as ascend. <br>
     * participate_role_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_ParticipateRoleId_Asc() { regOBA("participate_role_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * participate_role_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_ParticipateRoleId_Desc() { regOBD("participate_role_id"); return this; }

    protected ConditionValue _participateId;
    public ConditionValue xdfgetParticipateId()
    { if (_participateId == null) { _participateId = nCV(); }
      return _participateId; }
    protected ConditionValue xgetCValueParticipateId() { return xdfgetParticipateId(); }

    /**
     * Add order-by as ascend. <br>
     * participate_id: {IX, NotNull, INT UNSIGNED(10), FK to participate}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_ParticipateId_Asc() { regOBA("participate_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * participate_id: {IX, NotNull, INT UNSIGNED(10), FK to participate}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_ParticipateId_Desc() { regOBD("participate_id"); return this; }

    protected ConditionValue _participateRoleType;
    public ConditionValue xdfgetParticipateRoleType()
    { if (_participateRoleType == null) { _participateRoleType = nCV(); }
      return _participateRoleType; }
    protected ConditionValue xgetCValueParticipateRoleType() { return xdfgetParticipateRoleType(); }

    /**
     * Add order-by as ascend. <br>
     * participate_role_type: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_ParticipateRoleType_Asc() { regOBA("participate_role_type"); return this; }

    /**
     * Add order-by as descend. <br>
     * participate_role_type: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_ParticipateRoleType_Desc() { regOBD("participate_role_type"); return this; }

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
    public DbBsParticipateRoleCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsParticipateRoleCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsParticipateRoleCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsParticipateRoleCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsParticipateRoleCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsParticipateRoleCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsParticipateRoleCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbParticipateRoleCQ bq = (DbParticipateRoleCQ)bqs;
        DbParticipateRoleCQ uq = (DbParticipateRoleCQ)uqs;
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
        String nrp = xresolveNRP("participate_role", "participate"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, DbParticipateRoleCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbParticipateRoleCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbParticipateRoleCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbParticipateRoleCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbParticipateRoleCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbParticipateRoleCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbParticipateRoleCQ> _myselfExistsMap;
    public Map<String, DbParticipateRoleCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbParticipateRoleCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbParticipateRoleCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbParticipateRoleCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbParticipateRoleCB.class.getName(); }
    protected String xCQ() { return DbParticipateRoleCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
