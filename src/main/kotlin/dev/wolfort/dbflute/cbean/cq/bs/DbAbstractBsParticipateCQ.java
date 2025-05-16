package dev.wolfort.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import dev.wolfort.dbflute.allcommon.*;
import dev.wolfort.dbflute.cbean.*;
import dev.wolfort.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of participate.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsParticipateCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsParticipateCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DbDBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "participate";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param participateId The value of participateId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateId_Equal(Integer participateId) {
        doSetParticipateId_Equal(participateId);
    }

    protected void doSetParticipateId_Equal(Integer participateId) {
        regParticipateId(CK_EQ, participateId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param participateId The value of participateId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateId_NotEqual(Integer participateId) {
        doSetParticipateId_NotEqual(participateId);
    }

    protected void doSetParticipateId_NotEqual(Integer participateId) {
        regParticipateId(CK_NES, participateId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param participateId The value of participateId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateId_GreaterThan(Integer participateId) {
        regParticipateId(CK_GT, participateId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param participateId The value of participateId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateId_LessThan(Integer participateId) {
        regParticipateId(CK_LT, participateId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param participateId The value of participateId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateId_GreaterEqual(Integer participateId) {
        regParticipateId(CK_GE, participateId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param participateId The value of participateId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateId_LessEqual(Integer participateId) {
        regParticipateId(CK_LE, participateId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of participateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of participateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setParticipateId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setParticipateId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of participateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of participateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setParticipateId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParticipateId(), "participate_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param participateIdList The collection of participateId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParticipateId_InScope(Collection<Integer> participateIdList) {
        doSetParticipateId_InScope(participateIdList);
    }

    protected void doSetParticipateId_InScope(Collection<Integer> participateIdList) {
        regINS(CK_INS, cTL(participateIdList), xgetCValueParticipateId(), "participate_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param participateIdList The collection of participateId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParticipateId_NotInScope(Collection<Integer> participateIdList) {
        doSetParticipateId_NotInScope(participateIdList);
    }

    protected void doSetParticipateId_NotInScope(Collection<Integer> participateIdList) {
        regINS(CK_NINS, cTL(participateIdList), xgetCValueParticipateId(), "participate_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select participate_id from participate_role where ...)} <br>
     * participate_role by participate_id, named 'participateRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsParticipateRole</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ParticipateRoleList for 'exists'. (NotNull)
     */
    public void existsParticipateRole(SubQuery<DbParticipateRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbParticipateRoleCB cb = new DbParticipateRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepParticipateId_ExistsReferrer_ParticipateRoleList(cb.query());
        registerExistsReferrer(cb.query(), "participate_id", "participate_id", pp, "participateRoleList");
    }
    public abstract String keepParticipateId_ExistsReferrer_ParticipateRoleList(DbParticipateRoleCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select participate_id from participate_rule_book where ...)} <br>
     * participate_rule_book by participate_id, named 'participateRuleBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsParticipateRuleBook</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ParticipateRuleBookList for 'exists'. (NotNull)
     */
    public void existsParticipateRuleBook(SubQuery<DbParticipateRuleBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbParticipateRuleBookCB cb = new DbParticipateRuleBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepParticipateId_ExistsReferrer_ParticipateRuleBookList(cb.query());
        registerExistsReferrer(cb.query(), "participate_id", "participate_id", pp, "participateRuleBookList");
    }
    public abstract String keepParticipateId_ExistsReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select participate_id from participate_role where ...)} <br>
     * participate_role by participate_id, named 'participateRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsParticipateRole</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ParticipateId_NotExistsReferrer_ParticipateRoleList for 'not exists'. (NotNull)
     */
    public void notExistsParticipateRole(SubQuery<DbParticipateRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbParticipateRoleCB cb = new DbParticipateRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepParticipateId_NotExistsReferrer_ParticipateRoleList(cb.query());
        registerNotExistsReferrer(cb.query(), "participate_id", "participate_id", pp, "participateRoleList");
    }
    public abstract String keepParticipateId_NotExistsReferrer_ParticipateRoleList(DbParticipateRoleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select participate_id from participate_rule_book where ...)} <br>
     * participate_rule_book by participate_id, named 'participateRuleBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsParticipateRuleBook</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ParticipateId_NotExistsReferrer_ParticipateRuleBookList for 'not exists'. (NotNull)
     */
    public void notExistsParticipateRuleBook(SubQuery<DbParticipateRuleBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbParticipateRuleBookCB cb = new DbParticipateRuleBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepParticipateId_NotExistsReferrer_ParticipateRuleBookList(cb.query());
        registerNotExistsReferrer(cb.query(), "participate_id", "participate_id", pp, "participateRuleBookList");
    }
    public abstract String keepParticipateId_NotExistsReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq);

    public void xsderiveParticipateRoleList(String fn, SubQuery<DbParticipateRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateRoleCB cb = new DbParticipateRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepParticipateId_SpecifyDerivedReferrer_ParticipateRoleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "participate_id", "participate_id", pp, "participateRoleList", al, op);
    }
    public abstract String keepParticipateId_SpecifyDerivedReferrer_ParticipateRoleList(DbParticipateRoleCQ sq);

    public void xsderiveParticipateRuleBookList(String fn, SubQuery<DbParticipateRuleBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateRuleBookCB cb = new DbParticipateRuleBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepParticipateId_SpecifyDerivedReferrer_ParticipateRuleBookList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "participate_id", "participate_id", pp, "participateRuleBookList", al, op);
    }
    public abstract String keepParticipateId_SpecifyDerivedReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from participate_role where ...)} <br>
     * participate_role by participate_id, named 'participateRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedParticipateRole()</span>.<span style="color: #CC4747">max</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     roleCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbParticipateRoleCB> derivedParticipateRole() {
        return xcreateQDRFunctionParticipateRoleList();
    }
    protected HpQDRFunction<DbParticipateRoleCB> xcreateQDRFunctionParticipateRoleList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveParticipateRoleList(fn, sq, rd, vl, op));
    }
    public void xqderiveParticipateRoleList(String fn, SubQuery<DbParticipateRoleCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateRoleCB cb = new DbParticipateRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepParticipateId_QueryDerivedReferrer_ParticipateRoleList(cb.query()); String prpp = keepParticipateId_QueryDerivedReferrer_ParticipateRoleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "participate_id", "participate_id", sqpp, "participateRoleList", rd, vl, prpp, op);
    }
    public abstract String keepParticipateId_QueryDerivedReferrer_ParticipateRoleList(DbParticipateRoleCQ sq);
    public abstract String keepParticipateId_QueryDerivedReferrer_ParticipateRoleListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from participate_rule_book where ...)} <br>
     * participate_rule_book by participate_id, named 'participateRuleBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedParticipateRuleBook()</span>.<span style="color: #CC4747">max</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bookCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbParticipateRuleBookCB> derivedParticipateRuleBook() {
        return xcreateQDRFunctionParticipateRuleBookList();
    }
    protected HpQDRFunction<DbParticipateRuleBookCB> xcreateQDRFunctionParticipateRuleBookList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveParticipateRuleBookList(fn, sq, rd, vl, op));
    }
    public void xqderiveParticipateRuleBookList(String fn, SubQuery<DbParticipateRuleBookCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateRuleBookCB cb = new DbParticipateRuleBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepParticipateId_QueryDerivedReferrer_ParticipateRuleBookList(cb.query()); String prpp = keepParticipateId_QueryDerivedReferrer_ParticipateRuleBookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "participate_id", "participate_id", sqpp, "participateRuleBookList", rd, vl, prpp, op);
    }
    public abstract String keepParticipateId_QueryDerivedReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq);
    public abstract String keepParticipateId_QueryDerivedReferrer_ParticipateRuleBookListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setParticipateId_IsNull() { regParticipateId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setParticipateId_IsNotNull() { regParticipateId(CK_ISNN, DOBJ); }

    protected void regParticipateId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParticipateId(), "participate_id"); }
    protected abstract ConditionValue xgetCValueParticipateId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param scenarioId The value of scenarioId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_Equal(Integer scenarioId) {
        doSetScenarioId_Equal(scenarioId);
    }

    protected void doSetScenarioId_Equal(Integer scenarioId) {
        regScenarioId(CK_EQ, scenarioId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param scenarioId The value of scenarioId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_NotEqual(Integer scenarioId) {
        doSetScenarioId_NotEqual(scenarioId);
    }

    protected void doSetScenarioId_NotEqual(Integer scenarioId) {
        regScenarioId(CK_NES, scenarioId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param scenarioId The value of scenarioId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_GreaterThan(Integer scenarioId) {
        regScenarioId(CK_GT, scenarioId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param scenarioId The value of scenarioId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_LessThan(Integer scenarioId) {
        regScenarioId(CK_LT, scenarioId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param scenarioId The value of scenarioId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_GreaterEqual(Integer scenarioId) {
        regScenarioId(CK_GE, scenarioId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param scenarioId The value of scenarioId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_LessEqual(Integer scenarioId) {
        regScenarioId(CK_LE, scenarioId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param minNumber The min number of scenarioId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of scenarioId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setScenarioId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setScenarioId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param minNumber The min number of scenarioId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of scenarioId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setScenarioId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueScenarioId(), "scenario_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param scenarioIdList The collection of scenarioId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioId_InScope(Collection<Integer> scenarioIdList) {
        doSetScenarioId_InScope(scenarioIdList);
    }

    protected void doSetScenarioId_InScope(Collection<Integer> scenarioIdList) {
        regINS(CK_INS, cTL(scenarioIdList), xgetCValueScenarioId(), "scenario_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @param scenarioIdList The collection of scenarioId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioId_NotInScope(Collection<Integer> scenarioIdList) {
        doSetScenarioId_NotInScope(scenarioIdList);
    }

    protected void doSetScenarioId_NotInScope(Collection<Integer> scenarioIdList) {
        regINS(CK_NINS, cTL(scenarioIdList), xgetCValueScenarioId(), "scenario_id");
    }

    protected void regScenarioId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScenarioId(), "scenario_id"); }
    protected abstract ConditionValue xgetCValueScenarioId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_Equal(Integer gameSystemId) {
        doSetGameSystemId_Equal(gameSystemId);
    }

    protected void doSetGameSystemId_Equal(Integer gameSystemId) {
        regGameSystemId(CK_EQ, gameSystemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_NotEqual(Integer gameSystemId) {
        doSetGameSystemId_NotEqual(gameSystemId);
    }

    protected void doSetGameSystemId_NotEqual(Integer gameSystemId) {
        regGameSystemId(CK_NES, gameSystemId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_GreaterThan(Integer gameSystemId) {
        regGameSystemId(CK_GT, gameSystemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_LessThan(Integer gameSystemId) {
        regGameSystemId(CK_LT, gameSystemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_GreaterEqual(Integer gameSystemId) {
        regGameSystemId(CK_GE, gameSystemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_LessEqual(Integer gameSystemId) {
        regGameSystemId(CK_LE, gameSystemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param minNumber The min number of gameSystemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameSystemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGameSystemId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGameSystemId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param minNumber The min number of gameSystemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameSystemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGameSystemId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGameSystemId(), "game_system_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemIdList The collection of gameSystemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSystemId_InScope(Collection<Integer> gameSystemIdList) {
        doSetGameSystemId_InScope(gameSystemIdList);
    }

    protected void doSetGameSystemId_InScope(Collection<Integer> gameSystemIdList) {
        regINS(CK_INS, cTL(gameSystemIdList), xgetCValueGameSystemId(), "game_system_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemIdList The collection of gameSystemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSystemId_NotInScope(Collection<Integer> gameSystemIdList) {
        doSetGameSystemId_NotInScope(gameSystemIdList);
    }

    protected void doSetGameSystemId_NotInScope(Collection<Integer> gameSystemIdList) {
        regINS(CK_NINS, cTL(gameSystemIdList), xgetCValueGameSystemId(), "game_system_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     */
    public void setGameSystemId_IsNull() { regGameSystemId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     */
    public void setGameSystemId_IsNotNull() { regGameSystemId(CK_ISNN, DOBJ); }

    protected void regGameSystemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameSystemId(), "game_system_id"); }
    protected abstract ConditionValue xgetCValueGameSystemId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param dispOrder The value of dispOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDispOrder_Equal(Integer dispOrder) {
        doSetDispOrder_Equal(dispOrder);
    }

    protected void doSetDispOrder_Equal(Integer dispOrder) {
        regDispOrder(CK_EQ, dispOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param dispOrder The value of dispOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDispOrder_NotEqual(Integer dispOrder) {
        doSetDispOrder_NotEqual(dispOrder);
    }

    protected void doSetDispOrder_NotEqual(Integer dispOrder) {
        regDispOrder(CK_NES, dispOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param dispOrder The value of dispOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDispOrder_GreaterThan(Integer dispOrder) {
        regDispOrder(CK_GT, dispOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param dispOrder The value of dispOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDispOrder_LessThan(Integer dispOrder) {
        regDispOrder(CK_LT, dispOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param dispOrder The value of dispOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDispOrder_GreaterEqual(Integer dispOrder) {
        regDispOrder(CK_GE, dispOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param dispOrder The value of dispOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDispOrder_LessEqual(Integer dispOrder) {
        regDispOrder(CK_LE, dispOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of dispOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dispOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDispOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDispOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of dispOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dispOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDispOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDispOrder(), "disp_order", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param dispOrderList The collection of dispOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispOrder_InScope(Collection<Integer> dispOrderList) {
        doSetDispOrder_InScope(dispOrderList);
    }

    protected void doSetDispOrder_InScope(Collection<Integer> dispOrderList) {
        regINS(CK_INS, cTL(dispOrderList), xgetCValueDispOrder(), "disp_order");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @param dispOrderList The collection of dispOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispOrder_NotInScope(Collection<Integer> dispOrderList) {
        doSetDispOrder_NotInScope(dispOrderList);
    }

    protected void doSetDispOrder_NotInScope(Collection<Integer> dispOrderList) {
        regINS(CK_NINS, cTL(dispOrderList), xgetCValueDispOrder(), "disp_order");
    }

    protected void regDispOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDispOrder(), "disp_order"); }
    protected abstract ConditionValue xgetCValueDispOrder();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_from: {DATE(10)}
     * @param participateTermFrom The value of participateTermFrom as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermFrom_Equal(java.time.LocalDate participateTermFrom) {
        regParticipateTermFrom(CK_EQ,  participateTermFrom);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_from: {DATE(10)}
     * @param participateTermFrom The value of participateTermFrom as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermFrom_GreaterThan(java.time.LocalDate participateTermFrom) {
        regParticipateTermFrom(CK_GT,  participateTermFrom);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_from: {DATE(10)}
     * @param participateTermFrom The value of participateTermFrom as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermFrom_LessThan(java.time.LocalDate participateTermFrom) {
        regParticipateTermFrom(CK_LT,  participateTermFrom);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_from: {DATE(10)}
     * @param participateTermFrom The value of participateTermFrom as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermFrom_GreaterEqual(java.time.LocalDate participateTermFrom) {
        regParticipateTermFrom(CK_GE,  participateTermFrom);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_from: {DATE(10)}
     * @param participateTermFrom The value of participateTermFrom as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermFrom_LessEqual(java.time.LocalDate participateTermFrom) {
        regParticipateTermFrom(CK_LE, participateTermFrom);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_from: {DATE(10)}
     * <pre>e.g. setParticipateTermFrom_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of participateTermFrom. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of participateTermFrom. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setParticipateTermFrom_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setParticipateTermFrom_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_from: {DATE(10)}
     * <pre>e.g. setParticipateTermFrom_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of participateTermFrom. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of participateTermFrom. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setParticipateTermFrom_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "participate_term_from"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueParticipateTermFrom(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * participate_term_from: {DATE(10)}
     */
    public void setParticipateTermFrom_IsNull() { regParticipateTermFrom(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * participate_term_from: {DATE(10)}
     */
    public void setParticipateTermFrom_IsNotNull() { regParticipateTermFrom(CK_ISNN, DOBJ); }

    protected void regParticipateTermFrom(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParticipateTermFrom(), "participate_term_from"); }
    protected abstract ConditionValue xgetCValueParticipateTermFrom();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_to: {DATE(10)}
     * @param participateTermTo The value of participateTermTo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermTo_Equal(java.time.LocalDate participateTermTo) {
        regParticipateTermTo(CK_EQ,  participateTermTo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_to: {DATE(10)}
     * @param participateTermTo The value of participateTermTo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermTo_GreaterThan(java.time.LocalDate participateTermTo) {
        regParticipateTermTo(CK_GT,  participateTermTo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_to: {DATE(10)}
     * @param participateTermTo The value of participateTermTo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermTo_LessThan(java.time.LocalDate participateTermTo) {
        regParticipateTermTo(CK_LT,  participateTermTo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_to: {DATE(10)}
     * @param participateTermTo The value of participateTermTo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermTo_GreaterEqual(java.time.LocalDate participateTermTo) {
        regParticipateTermTo(CK_GE,  participateTermTo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_to: {DATE(10)}
     * @param participateTermTo The value of participateTermTo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateTermTo_LessEqual(java.time.LocalDate participateTermTo) {
        regParticipateTermTo(CK_LE, participateTermTo);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_to: {DATE(10)}
     * <pre>e.g. setParticipateTermTo_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of participateTermTo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of participateTermTo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setParticipateTermTo_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setParticipateTermTo_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * participate_term_to: {DATE(10)}
     * <pre>e.g. setParticipateTermTo_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of participateTermTo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of participateTermTo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setParticipateTermTo_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "participate_term_to"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueParticipateTermTo(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * participate_term_to: {DATE(10)}
     */
    public void setParticipateTermTo_IsNull() { regParticipateTermTo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * participate_term_to: {DATE(10)}
     */
    public void setParticipateTermTo_IsNotNull() { regParticipateTermTo(CK_ISNN, DOBJ); }

    protected void regParticipateTermTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParticipateTermTo(), "participate_term_to"); }
    protected abstract ConditionValue xgetCValueParticipateTermTo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param playerNum The value of playerNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNum_Equal(Integer playerNum) {
        doSetPlayerNum_Equal(playerNum);
    }

    protected void doSetPlayerNum_Equal(Integer playerNum) {
        regPlayerNum(CK_EQ, playerNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param playerNum The value of playerNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNum_NotEqual(Integer playerNum) {
        doSetPlayerNum_NotEqual(playerNum);
    }

    protected void doSetPlayerNum_NotEqual(Integer playerNum) {
        regPlayerNum(CK_NES, playerNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param playerNum The value of playerNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNum_GreaterThan(Integer playerNum) {
        regPlayerNum(CK_GT, playerNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param playerNum The value of playerNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNum_LessThan(Integer playerNum) {
        regPlayerNum(CK_LT, playerNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param playerNum The value of playerNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNum_GreaterEqual(Integer playerNum) {
        regPlayerNum(CK_GE, playerNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param playerNum The value of playerNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNum_LessEqual(Integer playerNum) {
        regPlayerNum(CK_LE, playerNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param minNumber The min number of playerNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of playerNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPlayerNum_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPlayerNum_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param minNumber The min number of playerNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of playerNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPlayerNum_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlayerNum(), "player_num", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param playerNumList The collection of playerNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNum_InScope(Collection<Integer> playerNumList) {
        doSetPlayerNum_InScope(playerNumList);
    }

    protected void doSetPlayerNum_InScope(Collection<Integer> playerNumList) {
        regINS(CK_INS, cTL(playerNumList), xgetCValuePlayerNum(), "player_num");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     * @param playerNumList The collection of playerNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNum_NotInScope(Collection<Integer> playerNumList) {
        doSetPlayerNum_NotInScope(playerNumList);
    }

    protected void doSetPlayerNum_NotInScope(Collection<Integer> playerNumList) {
        regINS(CK_NINS, cTL(playerNumList), xgetCValuePlayerNum(), "player_num");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     */
    public void setPlayerNum_IsNull() { regPlayerNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * player_num: {INT UNSIGNED(10)}
     */
    public void setPlayerNum_IsNotNull() { regPlayerNum(CK_ISNN, DOBJ); }

    protected void regPlayerNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlayerNum(), "player_num"); }
    protected abstract ConditionValue xgetCValuePlayerNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMaster The value of gameMaster as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMaster_Equal(String gameMaster) {
        doSetGameMaster_Equal(fRES(gameMaster));
    }

    protected void doSetGameMaster_Equal(String gameMaster) {
        regGameMaster(CK_EQ, gameMaster);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMaster The value of gameMaster as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMaster_NotEqual(String gameMaster) {
        doSetGameMaster_NotEqual(fRES(gameMaster));
    }

    protected void doSetGameMaster_NotEqual(String gameMaster) {
        regGameMaster(CK_NES, gameMaster);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMaster The value of gameMaster as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMaster_GreaterThan(String gameMaster) {
        regGameMaster(CK_GT, fRES(gameMaster));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMaster The value of gameMaster as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMaster_LessThan(String gameMaster) {
        regGameMaster(CK_LT, fRES(gameMaster));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMaster The value of gameMaster as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMaster_GreaterEqual(String gameMaster) {
        regGameMaster(CK_GE, fRES(gameMaster));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMaster The value of gameMaster as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMaster_LessEqual(String gameMaster) {
        regGameMaster(CK_LE, fRES(gameMaster));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMasterList The collection of gameMaster as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMaster_InScope(Collection<String> gameMasterList) {
        doSetGameMaster_InScope(gameMasterList);
    }

    protected void doSetGameMaster_InScope(Collection<String> gameMasterList) {
        regINS(CK_INS, cTL(gameMasterList), xgetCValueGameMaster(), "game_master");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMasterList The collection of gameMaster as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMaster_NotInScope(Collection<String> gameMasterList) {
        doSetGameMaster_NotInScope(gameMasterList);
    }

    protected void doSetGameMaster_NotInScope(Collection<String> gameMasterList) {
        regINS(CK_NINS, cTL(gameMasterList), xgetCValueGameMaster(), "game_master");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_master: {VARCHAR(255)} <br>
     * <pre>e.g. setGameMaster_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param gameMaster The value of gameMaster as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameMaster_LikeSearch(String gameMaster, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameMaster_LikeSearch(gameMaster, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_master: {VARCHAR(255)} <br>
     * <pre>e.g. setGameMaster_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gameMaster The value of gameMaster as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGameMaster_LikeSearch(String gameMaster, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gameMaster), xgetCValueGameMaster(), "game_master", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMaster The value of gameMaster as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameMaster_NotLikeSearch(String gameMaster, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameMaster_NotLikeSearch(gameMaster, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_master: {VARCHAR(255)}
     * @param gameMaster The value of gameMaster as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGameMaster_NotLikeSearch(String gameMaster, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gameMaster), xgetCValueGameMaster(), "game_master", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * game_master: {VARCHAR(255)}
     */
    public void setGameMaster_IsNull() { regGameMaster(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * game_master: {VARCHAR(255)}
     */
    public void setGameMaster_IsNullOrEmpty() { regGameMaster(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * game_master: {VARCHAR(255)}
     */
    public void setGameMaster_IsNotNull() { regGameMaster(CK_ISNN, DOBJ); }

    protected void regGameMaster(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameMaster(), "game_master"); }
    protected abstract ConditionValue xgetCValueGameMaster();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNames The value of playerNames as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNames_Equal(String playerNames) {
        doSetPlayerNames_Equal(fRES(playerNames));
    }

    protected void doSetPlayerNames_Equal(String playerNames) {
        regPlayerNames(CK_EQ, playerNames);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNames The value of playerNames as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNames_NotEqual(String playerNames) {
        doSetPlayerNames_NotEqual(fRES(playerNames));
    }

    protected void doSetPlayerNames_NotEqual(String playerNames) {
        regPlayerNames(CK_NES, playerNames);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNames The value of playerNames as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNames_GreaterThan(String playerNames) {
        regPlayerNames(CK_GT, fRES(playerNames));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNames The value of playerNames as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNames_LessThan(String playerNames) {
        regPlayerNames(CK_LT, fRES(playerNames));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNames The value of playerNames as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNames_GreaterEqual(String playerNames) {
        regPlayerNames(CK_GE, fRES(playerNames));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNames The value of playerNames as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNames_LessEqual(String playerNames) {
        regPlayerNames(CK_LE, fRES(playerNames));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNamesList The collection of playerNames as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNames_InScope(Collection<String> playerNamesList) {
        doSetPlayerNames_InScope(playerNamesList);
    }

    protected void doSetPlayerNames_InScope(Collection<String> playerNamesList) {
        regINS(CK_INS, cTL(playerNamesList), xgetCValuePlayerNames(), "player_names");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNamesList The collection of playerNames as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNames_NotInScope(Collection<String> playerNamesList) {
        doSetPlayerNames_NotInScope(playerNamesList);
    }

    protected void doSetPlayerNames_NotInScope(Collection<String> playerNamesList) {
        regINS(CK_NINS, cTL(playerNamesList), xgetCValuePlayerNames(), "player_names");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * player_names: {VARCHAR(255)} <br>
     * <pre>e.g. setPlayerNames_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param playerNames The value of playerNames as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPlayerNames_LikeSearch(String playerNames, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPlayerNames_LikeSearch(playerNames, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * player_names: {VARCHAR(255)} <br>
     * <pre>e.g. setPlayerNames_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param playerNames The value of playerNames as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPlayerNames_LikeSearch(String playerNames, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(playerNames), xgetCValuePlayerNames(), "player_names", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNames The value of playerNames as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPlayerNames_NotLikeSearch(String playerNames, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPlayerNames_NotLikeSearch(playerNames, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * player_names: {VARCHAR(255)}
     * @param playerNames The value of playerNames as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPlayerNames_NotLikeSearch(String playerNames, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(playerNames), xgetCValuePlayerNames(), "player_names", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * player_names: {VARCHAR(255)}
     */
    public void setPlayerNames_IsNull() { regPlayerNames(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * player_names: {VARCHAR(255)}
     */
    public void setPlayerNames_IsNullOrEmpty() { regPlayerNames(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * player_names: {VARCHAR(255)}
     */
    public void setPlayerNames_IsNotNull() { regPlayerNames(CK_ISNN, DOBJ); }

    protected void regPlayerNames(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlayerNames(), "player_names"); }
    protected abstract ConditionValue xgetCValuePlayerNames();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param requiredHours The value of requiredHours as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredHours_Equal(Integer requiredHours) {
        doSetRequiredHours_Equal(requiredHours);
    }

    protected void doSetRequiredHours_Equal(Integer requiredHours) {
        regRequiredHours(CK_EQ, requiredHours);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param requiredHours The value of requiredHours as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredHours_NotEqual(Integer requiredHours) {
        doSetRequiredHours_NotEqual(requiredHours);
    }

    protected void doSetRequiredHours_NotEqual(Integer requiredHours) {
        regRequiredHours(CK_NES, requiredHours);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param requiredHours The value of requiredHours as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredHours_GreaterThan(Integer requiredHours) {
        regRequiredHours(CK_GT, requiredHours);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param requiredHours The value of requiredHours as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredHours_LessThan(Integer requiredHours) {
        regRequiredHours(CK_LT, requiredHours);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param requiredHours The value of requiredHours as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredHours_GreaterEqual(Integer requiredHours) {
        regRequiredHours(CK_GE, requiredHours);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param requiredHours The value of requiredHours as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredHours_LessEqual(Integer requiredHours) {
        regRequiredHours(CK_LE, requiredHours);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param minNumber The min number of requiredHours. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of requiredHours. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRequiredHours_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRequiredHours_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param minNumber The min number of requiredHours. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of requiredHours. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRequiredHours_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRequiredHours(), "required_hours", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param requiredHoursList The collection of requiredHours as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredHours_InScope(Collection<Integer> requiredHoursList) {
        doSetRequiredHours_InScope(requiredHoursList);
    }

    protected void doSetRequiredHours_InScope(Collection<Integer> requiredHoursList) {
        regINS(CK_INS, cTL(requiredHoursList), xgetCValueRequiredHours(), "required_hours");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     * @param requiredHoursList The collection of requiredHours as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredHours_NotInScope(Collection<Integer> requiredHoursList) {
        doSetRequiredHours_NotInScope(requiredHoursList);
    }

    protected void doSetRequiredHours_NotInScope(Collection<Integer> requiredHoursList) {
        regINS(CK_NINS, cTL(requiredHoursList), xgetCValueRequiredHours(), "required_hours");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     */
    public void setRequiredHours_IsNull() { regRequiredHours(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * required_hours: {INT UNSIGNED(10)}
     */
    public void setRequiredHours_IsNotNull() { regRequiredHours(CK_ISNN, DOBJ); }

    protected void regRequiredHours(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRequiredHours(), "required_hours"); }
    protected abstract ConditionValue xgetCValueRequiredHours();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memo The value of memo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_Equal(String memo) {
        doSetMemo_Equal(fRES(memo));
    }

    protected void doSetMemo_Equal(String memo) {
        regMemo(CK_EQ, memo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memo The value of memo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_NotEqual(String memo) {
        doSetMemo_NotEqual(fRES(memo));
    }

    protected void doSetMemo_NotEqual(String memo) {
        regMemo(CK_NES, memo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memo The value of memo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_GreaterThan(String memo) {
        regMemo(CK_GT, fRES(memo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memo The value of memo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_LessThan(String memo) {
        regMemo(CK_LT, fRES(memo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memo The value of memo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_GreaterEqual(String memo) {
        regMemo(CK_GE, fRES(memo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memo The value of memo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_LessEqual(String memo) {
        regMemo(CK_LE, fRES(memo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memoList The collection of memo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_InScope(Collection<String> memoList) {
        doSetMemo_InScope(memoList);
    }

    protected void doSetMemo_InScope(Collection<String> memoList) {
        regINS(CK_INS, cTL(memoList), xgetCValueMemo(), "memo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memoList The collection of memo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_NotInScope(Collection<String> memoList) {
        doSetMemo_NotInScope(memoList);
    }

    protected void doSetMemo_NotInScope(Collection<String> memoList) {
        regINS(CK_NINS, cTL(memoList), xgetCValueMemo(), "memo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * memo: {VARCHAR(255)} <br>
     * <pre>e.g. setMemo_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memo The value of memo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemo_LikeSearch(String memo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemo_LikeSearch(memo, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * memo: {VARCHAR(255)} <br>
     * <pre>e.g. setMemo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memo The value of memo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMemo_LikeSearch(String memo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memo), xgetCValueMemo(), "memo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memo The value of memo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemo_NotLikeSearch(String memo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemo_NotLikeSearch(memo, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * memo: {VARCHAR(255)}
     * @param memo The value of memo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMemo_NotLikeSearch(String memo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memo), xgetCValueMemo(), "memo", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * memo: {VARCHAR(255)}
     */
    public void setMemo_IsNull() { regMemo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * memo: {VARCHAR(255)}
     */
    public void setMemo_IsNullOrEmpty() { regMemo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * memo: {VARCHAR(255)}
     */
    public void setMemo_IsNotNull() { regMemo(CK_ISNN, DOBJ); }

    protected void regMemo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemo(), "memo"); }
    protected abstract ConditionValue xgetCValueMemo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_Equal(String registerTrace) {
        doSetRegisterTrace_Equal(fRES(registerTrace));
    }

    protected void doSetRegisterTrace_Equal(String registerTrace) {
        regRegisterTrace(CK_EQ, registerTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_NotEqual(String registerTrace) {
        doSetRegisterTrace_NotEqual(fRES(registerTrace));
    }

    protected void doSetRegisterTrace_NotEqual(String registerTrace) {
        regRegisterTrace(CK_NES, registerTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_GreaterThan(String registerTrace) {
        regRegisterTrace(CK_GT, fRES(registerTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_LessThan(String registerTrace) {
        regRegisterTrace(CK_LT, fRES(registerTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_GreaterEqual(String registerTrace) {
        regRegisterTrace(CK_GE, fRES(registerTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_LessEqual(String registerTrace) {
        regRegisterTrace(CK_LE, fRES(registerTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTraceList The collection of registerTrace as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_InScope(Collection<String> registerTraceList) {
        doSetRegisterTrace_InScope(registerTraceList);
    }

    protected void doSetRegisterTrace_InScope(Collection<String> registerTraceList) {
        regINS(CK_INS, cTL(registerTraceList), xgetCValueRegisterTrace(), "register_trace");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTraceList The collection of registerTrace as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_NotInScope(Collection<String> registerTraceList) {
        doSetRegisterTrace_NotInScope(registerTraceList);
    }

    protected void doSetRegisterTrace_NotInScope(Collection<String> registerTraceList) {
        regINS(CK_NINS, cTL(registerTraceList), xgetCValueRegisterTrace(), "register_trace");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setRegisterTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerTrace The value of registerTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterTrace_LikeSearch(String registerTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterTrace_LikeSearch(registerTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setRegisterTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerTrace The value of registerTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterTrace_LikeSearch(String registerTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerTrace), xgetCValueRegisterTrace(), "register_trace", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterTrace_NotLikeSearch(String registerTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterTrace_NotLikeSearch(registerTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterTrace_NotLikeSearch(String registerTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerTrace), xgetCValueRegisterTrace(), "register_trace", likeSearchOption);
    }

    protected void regRegisterTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterTrace(), "register_trace"); }
    protected abstract ConditionValue xgetCValueRegisterTrace();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_Equal(String updateTrace) {
        doSetUpdateTrace_Equal(fRES(updateTrace));
    }

    protected void doSetUpdateTrace_Equal(String updateTrace) {
        regUpdateTrace(CK_EQ, updateTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_NotEqual(String updateTrace) {
        doSetUpdateTrace_NotEqual(fRES(updateTrace));
    }

    protected void doSetUpdateTrace_NotEqual(String updateTrace) {
        regUpdateTrace(CK_NES, updateTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_GreaterThan(String updateTrace) {
        regUpdateTrace(CK_GT, fRES(updateTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_LessThan(String updateTrace) {
        regUpdateTrace(CK_LT, fRES(updateTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_GreaterEqual(String updateTrace) {
        regUpdateTrace(CK_GE, fRES(updateTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_LessEqual(String updateTrace) {
        regUpdateTrace(CK_LE, fRES(updateTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTraceList The collection of updateTrace as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_InScope(Collection<String> updateTraceList) {
        doSetUpdateTrace_InScope(updateTraceList);
    }

    protected void doSetUpdateTrace_InScope(Collection<String> updateTraceList) {
        regINS(CK_INS, cTL(updateTraceList), xgetCValueUpdateTrace(), "update_trace");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTraceList The collection of updateTrace as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_NotInScope(Collection<String> updateTraceList) {
        doSetUpdateTrace_NotInScope(updateTraceList);
    }

    protected void doSetUpdateTrace_NotInScope(Collection<String> updateTraceList) {
        regINS(CK_NINS, cTL(updateTraceList), xgetCValueUpdateTrace(), "update_trace");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUpdateTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateTrace The value of updateTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateTrace_LikeSearch(String updateTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateTrace_LikeSearch(updateTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUpdateTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateTrace The value of updateTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateTrace_LikeSearch(String updateTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateTrace), xgetCValueUpdateTrace(), "update_trace", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateTrace_NotLikeSearch(String updateTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateTrace_NotLikeSearch(updateTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateTrace_NotLikeSearch(String updateTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateTrace), xgetCValueUpdateTrace(), "update_trace", likeSearchOption);
    }

    protected void regUpdateTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateTrace(), "update_trace"); }
    protected abstract ConditionValue xgetCValueUpdateTrace();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbParticipateCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbParticipateCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbParticipateCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbParticipateCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbParticipateCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbParticipateCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbParticipateCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbParticipateCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbParticipateCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbParticipateCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbParticipateCB&gt;() {
     *     public void query(DbParticipateCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbParticipateCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbParticipateCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbParticipateCQ sq);

    protected DbParticipateCB xcreateScalarConditionCB() {
        DbParticipateCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbParticipateCB xcreateScalarConditionPartitionByCB() {
        DbParticipateCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DbParticipateCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateCB cb = new DbParticipateCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "participate_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DbParticipateCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DbParticipateCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DbParticipateCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateCB cb = new DbParticipateCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "participate_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DbParticipateCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DbParticipateCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbParticipateCB cb = new DbParticipateCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DbParticipateCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected DbParticipateCB newMyCB() {
        return new DbParticipateCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbParticipateCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
