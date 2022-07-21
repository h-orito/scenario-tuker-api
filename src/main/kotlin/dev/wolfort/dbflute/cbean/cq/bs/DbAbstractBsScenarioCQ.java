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
 * The abstract condition-query of scenario.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsScenarioCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsScenarioCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "scenario";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param scenarioId The value of scenarioId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_GreaterThan(Integer scenarioId) {
        regScenarioId(CK_GT, scenarioId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param scenarioId The value of scenarioId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_LessThan(Integer scenarioId) {
        regScenarioId(CK_LT, scenarioId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param scenarioId The value of scenarioId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_GreaterEqual(Integer scenarioId) {
        regScenarioId(CK_GE, scenarioId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param scenarioId The value of scenarioId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScenarioId_LessEqual(Integer scenarioId) {
        regScenarioId(CK_LE, scenarioId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of scenarioId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of scenarioId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setScenarioId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueScenarioId(), "scenario_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param scenarioIdList The collection of scenarioId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioId_NotInScope(Collection<Integer> scenarioIdList) {
        doSetScenarioId_NotInScope(scenarioIdList);
    }

    protected void doSetScenarioId_NotInScope(Collection<Integer> scenarioIdList) {
        regINS(CK_NINS, cTL(scenarioIdList), xgetCValueScenarioId(), "scenario_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select scenario_id from participate where ...)} <br>
     * participate by scenario_id, named 'participateAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsParticipate</span>(participateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     participateCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ParticipateList for 'exists'. (NotNull)
     */
    public void existsParticipate(SubQuery<DbParticipateCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbParticipateCB cb = new DbParticipateCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScenarioId_ExistsReferrer_ParticipateList(cb.query());
        registerExistsReferrer(cb.query(), "scenario_id", "scenario_id", pp, "participateList");
    }
    public abstract String keepScenarioId_ExistsReferrer_ParticipateList(DbParticipateCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select scenario_id from scenario_author where ...)} <br>
     * scenario_author by scenario_id, named 'scenarioAuthorAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsScenarioAuthor</span>(authorCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authorCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScenarioAuthorList for 'exists'. (NotNull)
     */
    public void existsScenarioAuthor(SubQuery<DbScenarioAuthorCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbScenarioAuthorCB cb = new DbScenarioAuthorCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScenarioId_ExistsReferrer_ScenarioAuthorList(cb.query());
        registerExistsReferrer(cb.query(), "scenario_id", "scenario_id", pp, "scenarioAuthorList");
    }
    public abstract String keepScenarioId_ExistsReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select scenario_id from scenario_dictionary where ...)} <br>
     * scenario_dictionary by scenario_id, named 'scenarioDictionaryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsScenarioDictionary</span>(dictionaryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dictionaryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScenarioDictionaryList for 'exists'. (NotNull)
     */
    public void existsScenarioDictionary(SubQuery<DbScenarioDictionaryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbScenarioDictionaryCB cb = new DbScenarioDictionaryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScenarioId_ExistsReferrer_ScenarioDictionaryList(cb.query());
        registerExistsReferrer(cb.query(), "scenario_id", "scenario_id", pp, "scenarioDictionaryList");
    }
    public abstract String keepScenarioId_ExistsReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select scenario_id from user_scenario where ...)} <br>
     * user_scenario by scenario_id, named 'userScenarioAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserScenario</span>(scenarioCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scenarioCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserScenarioList for 'exists'. (NotNull)
     */
    public void existsUserScenario(SubQuery<DbUserScenarioCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbUserScenarioCB cb = new DbUserScenarioCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScenarioId_ExistsReferrer_UserScenarioList(cb.query());
        registerExistsReferrer(cb.query(), "scenario_id", "scenario_id", pp, "userScenarioList");
    }
    public abstract String keepScenarioId_ExistsReferrer_UserScenarioList(DbUserScenarioCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select scenario_id from participate where ...)} <br>
     * participate by scenario_id, named 'participateAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsParticipate</span>(participateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     participateCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScenarioId_NotExistsReferrer_ParticipateList for 'not exists'. (NotNull)
     */
    public void notExistsParticipate(SubQuery<DbParticipateCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbParticipateCB cb = new DbParticipateCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScenarioId_NotExistsReferrer_ParticipateList(cb.query());
        registerNotExistsReferrer(cb.query(), "scenario_id", "scenario_id", pp, "participateList");
    }
    public abstract String keepScenarioId_NotExistsReferrer_ParticipateList(DbParticipateCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select scenario_id from scenario_author where ...)} <br>
     * scenario_author by scenario_id, named 'scenarioAuthorAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsScenarioAuthor</span>(authorCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authorCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScenarioId_NotExistsReferrer_ScenarioAuthorList for 'not exists'. (NotNull)
     */
    public void notExistsScenarioAuthor(SubQuery<DbScenarioAuthorCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbScenarioAuthorCB cb = new DbScenarioAuthorCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScenarioId_NotExistsReferrer_ScenarioAuthorList(cb.query());
        registerNotExistsReferrer(cb.query(), "scenario_id", "scenario_id", pp, "scenarioAuthorList");
    }
    public abstract String keepScenarioId_NotExistsReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select scenario_id from scenario_dictionary where ...)} <br>
     * scenario_dictionary by scenario_id, named 'scenarioDictionaryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsScenarioDictionary</span>(dictionaryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dictionaryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScenarioId_NotExistsReferrer_ScenarioDictionaryList for 'not exists'. (NotNull)
     */
    public void notExistsScenarioDictionary(SubQuery<DbScenarioDictionaryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbScenarioDictionaryCB cb = new DbScenarioDictionaryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScenarioId_NotExistsReferrer_ScenarioDictionaryList(cb.query());
        registerNotExistsReferrer(cb.query(), "scenario_id", "scenario_id", pp, "scenarioDictionaryList");
    }
    public abstract String keepScenarioId_NotExistsReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select scenario_id from user_scenario where ...)} <br>
     * user_scenario by scenario_id, named 'userScenarioAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserScenario</span>(scenarioCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scenarioCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScenarioId_NotExistsReferrer_UserScenarioList for 'not exists'. (NotNull)
     */
    public void notExistsUserScenario(SubQuery<DbUserScenarioCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbUserScenarioCB cb = new DbUserScenarioCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScenarioId_NotExistsReferrer_UserScenarioList(cb.query());
        registerNotExistsReferrer(cb.query(), "scenario_id", "scenario_id", pp, "userScenarioList");
    }
    public abstract String keepScenarioId_NotExistsReferrer_UserScenarioList(DbUserScenarioCQ sq);

    public void xsderiveParticipateList(String fn, SubQuery<DbParticipateCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateCB cb = new DbParticipateCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepScenarioId_SpecifyDerivedReferrer_ParticipateList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "scenario_id", "scenario_id", pp, "participateList", al, op);
    }
    public abstract String keepScenarioId_SpecifyDerivedReferrer_ParticipateList(DbParticipateCQ sq);

    public void xsderiveScenarioAuthorList(String fn, SubQuery<DbScenarioAuthorCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbScenarioAuthorCB cb = new DbScenarioAuthorCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepScenarioId_SpecifyDerivedReferrer_ScenarioAuthorList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "scenario_id", "scenario_id", pp, "scenarioAuthorList", al, op);
    }
    public abstract String keepScenarioId_SpecifyDerivedReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq);

    public void xsderiveScenarioDictionaryList(String fn, SubQuery<DbScenarioDictionaryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbScenarioDictionaryCB cb = new DbScenarioDictionaryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepScenarioId_SpecifyDerivedReferrer_ScenarioDictionaryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "scenario_id", "scenario_id", pp, "scenarioDictionaryList", al, op);
    }
    public abstract String keepScenarioId_SpecifyDerivedReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq);

    public void xsderiveUserScenarioList(String fn, SubQuery<DbUserScenarioCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbUserScenarioCB cb = new DbUserScenarioCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepScenarioId_SpecifyDerivedReferrer_UserScenarioList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "scenario_id", "scenario_id", pp, "userScenarioList", al, op);
    }
    public abstract String keepScenarioId_SpecifyDerivedReferrer_UserScenarioList(DbUserScenarioCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from participate where ...)} <br>
     * participate by scenario_id, named 'participateAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedParticipate()</span>.<span style="color: #CC4747">max</span>(participateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     participateCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     participateCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbParticipateCB> derivedParticipate() {
        return xcreateQDRFunctionParticipateList();
    }
    protected HpQDRFunction<DbParticipateCB> xcreateQDRFunctionParticipateList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveParticipateList(fn, sq, rd, vl, op));
    }
    public void xqderiveParticipateList(String fn, SubQuery<DbParticipateCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateCB cb = new DbParticipateCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepScenarioId_QueryDerivedReferrer_ParticipateList(cb.query()); String prpp = keepScenarioId_QueryDerivedReferrer_ParticipateListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "scenario_id", "scenario_id", sqpp, "participateList", rd, vl, prpp, op);
    }
    public abstract String keepScenarioId_QueryDerivedReferrer_ParticipateList(DbParticipateCQ sq);
    public abstract String keepScenarioId_QueryDerivedReferrer_ParticipateListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from scenario_author where ...)} <br>
     * scenario_author by scenario_id, named 'scenarioAuthorAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedScenarioAuthor()</span>.<span style="color: #CC4747">max</span>(authorCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authorCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     authorCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbScenarioAuthorCB> derivedScenarioAuthor() {
        return xcreateQDRFunctionScenarioAuthorList();
    }
    protected HpQDRFunction<DbScenarioAuthorCB> xcreateQDRFunctionScenarioAuthorList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveScenarioAuthorList(fn, sq, rd, vl, op));
    }
    public void xqderiveScenarioAuthorList(String fn, SubQuery<DbScenarioAuthorCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbScenarioAuthorCB cb = new DbScenarioAuthorCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepScenarioId_QueryDerivedReferrer_ScenarioAuthorList(cb.query()); String prpp = keepScenarioId_QueryDerivedReferrer_ScenarioAuthorListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "scenario_id", "scenario_id", sqpp, "scenarioAuthorList", rd, vl, prpp, op);
    }
    public abstract String keepScenarioId_QueryDerivedReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq);
    public abstract String keepScenarioId_QueryDerivedReferrer_ScenarioAuthorListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from scenario_dictionary where ...)} <br>
     * scenario_dictionary by scenario_id, named 'scenarioDictionaryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedScenarioDictionary()</span>.<span style="color: #CC4747">max</span>(dictionaryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dictionaryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dictionaryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbScenarioDictionaryCB> derivedScenarioDictionary() {
        return xcreateQDRFunctionScenarioDictionaryList();
    }
    protected HpQDRFunction<DbScenarioDictionaryCB> xcreateQDRFunctionScenarioDictionaryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveScenarioDictionaryList(fn, sq, rd, vl, op));
    }
    public void xqderiveScenarioDictionaryList(String fn, SubQuery<DbScenarioDictionaryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbScenarioDictionaryCB cb = new DbScenarioDictionaryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepScenarioId_QueryDerivedReferrer_ScenarioDictionaryList(cb.query()); String prpp = keepScenarioId_QueryDerivedReferrer_ScenarioDictionaryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "scenario_id", "scenario_id", sqpp, "scenarioDictionaryList", rd, vl, prpp, op);
    }
    public abstract String keepScenarioId_QueryDerivedReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq);
    public abstract String keepScenarioId_QueryDerivedReferrer_ScenarioDictionaryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from user_scenario where ...)} <br>
     * user_scenario by scenario_id, named 'userScenarioAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserScenario()</span>.<span style="color: #CC4747">max</span>(scenarioCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scenarioCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     scenarioCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbUserScenarioCB> derivedUserScenario() {
        return xcreateQDRFunctionUserScenarioList();
    }
    protected HpQDRFunction<DbUserScenarioCB> xcreateQDRFunctionUserScenarioList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserScenarioList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserScenarioList(String fn, SubQuery<DbUserScenarioCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbUserScenarioCB cb = new DbUserScenarioCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepScenarioId_QueryDerivedReferrer_UserScenarioList(cb.query()); String prpp = keepScenarioId_QueryDerivedReferrer_UserScenarioListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "scenario_id", "scenario_id", sqpp, "userScenarioList", rd, vl, prpp, op);
    }
    public abstract String keepScenarioId_QueryDerivedReferrer_UserScenarioList(DbUserScenarioCQ sq);
    public abstract String keepScenarioId_QueryDerivedReferrer_UserScenarioListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setScenarioId_IsNull() { regScenarioId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setScenarioId_IsNotNull() { regScenarioId(CK_ISNN, DOBJ); }

    protected void regScenarioId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScenarioId(), "scenario_id"); }
    protected abstract ConditionValue xgetCValueScenarioId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioName The value of scenarioName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioName_Equal(String scenarioName) {
        doSetScenarioName_Equal(fRES(scenarioName));
    }

    protected void doSetScenarioName_Equal(String scenarioName) {
        regScenarioName(CK_EQ, scenarioName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioName The value of scenarioName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioName_NotEqual(String scenarioName) {
        doSetScenarioName_NotEqual(fRES(scenarioName));
    }

    protected void doSetScenarioName_NotEqual(String scenarioName) {
        regScenarioName(CK_NES, scenarioName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioName The value of scenarioName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioName_GreaterThan(String scenarioName) {
        regScenarioName(CK_GT, fRES(scenarioName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioName The value of scenarioName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioName_LessThan(String scenarioName) {
        regScenarioName(CK_LT, fRES(scenarioName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioName The value of scenarioName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioName_GreaterEqual(String scenarioName) {
        regScenarioName(CK_GE, fRES(scenarioName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioName The value of scenarioName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioName_LessEqual(String scenarioName) {
        regScenarioName(CK_LE, fRES(scenarioName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioNameList The collection of scenarioName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioName_InScope(Collection<String> scenarioNameList) {
        doSetScenarioName_InScope(scenarioNameList);
    }

    protected void doSetScenarioName_InScope(Collection<String> scenarioNameList) {
        regINS(CK_INS, cTL(scenarioNameList), xgetCValueScenarioName(), "scenario_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioNameList The collection of scenarioName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioName_NotInScope(Collection<String> scenarioNameList) {
        doSetScenarioName_NotInScope(scenarioNameList);
    }

    protected void doSetScenarioName_NotInScope(Collection<String> scenarioNameList) {
        regINS(CK_NINS, cTL(scenarioNameList), xgetCValueScenarioName(), "scenario_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setScenarioName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param scenarioName The value of scenarioName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScenarioName_LikeSearch(String scenarioName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScenarioName_LikeSearch(scenarioName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setScenarioName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scenarioName The value of scenarioName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setScenarioName_LikeSearch(String scenarioName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scenarioName), xgetCValueScenarioName(), "scenario_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioName The value of scenarioName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScenarioName_NotLikeSearch(String scenarioName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScenarioName_NotLikeSearch(scenarioName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_name: {NotNull, VARCHAR(255)}
     * @param scenarioName The value of scenarioName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScenarioName_NotLikeSearch(String scenarioName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scenarioName), xgetCValueScenarioName(), "scenario_name", likeSearchOption);
    }

    protected void regScenarioName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScenarioName(), "scenario_name"); }
    protected abstract ConditionValue xgetCValueScenarioName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioType The value of scenarioType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioType_Equal(String scenarioType) {
        doSetScenarioType_Equal(fRES(scenarioType));
    }

    protected void doSetScenarioType_Equal(String scenarioType) {
        regScenarioType(CK_EQ, scenarioType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioType The value of scenarioType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioType_NotEqual(String scenarioType) {
        doSetScenarioType_NotEqual(fRES(scenarioType));
    }

    protected void doSetScenarioType_NotEqual(String scenarioType) {
        regScenarioType(CK_NES, scenarioType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioType The value of scenarioType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioType_GreaterThan(String scenarioType) {
        regScenarioType(CK_GT, fRES(scenarioType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioType The value of scenarioType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioType_LessThan(String scenarioType) {
        regScenarioType(CK_LT, fRES(scenarioType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioType The value of scenarioType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioType_GreaterEqual(String scenarioType) {
        regScenarioType(CK_GE, fRES(scenarioType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioType The value of scenarioType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioType_LessEqual(String scenarioType) {
        regScenarioType(CK_LE, fRES(scenarioType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioTypeList The collection of scenarioType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioType_InScope(Collection<String> scenarioTypeList) {
        doSetScenarioType_InScope(scenarioTypeList);
    }

    protected void doSetScenarioType_InScope(Collection<String> scenarioTypeList) {
        regINS(CK_INS, cTL(scenarioTypeList), xgetCValueScenarioType(), "scenario_type");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioTypeList The collection of scenarioType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioType_NotInScope(Collection<String> scenarioTypeList) {
        doSetScenarioType_NotInScope(scenarioTypeList);
    }

    protected void doSetScenarioType_NotInScope(Collection<String> scenarioTypeList) {
        regINS(CK_NINS, cTL(scenarioTypeList), xgetCValueScenarioType(), "scenario_type");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setScenarioType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param scenarioType The value of scenarioType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScenarioType_LikeSearch(String scenarioType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScenarioType_LikeSearch(scenarioType, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setScenarioType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scenarioType The value of scenarioType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setScenarioType_LikeSearch(String scenarioType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scenarioType), xgetCValueScenarioType(), "scenario_type", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioType The value of scenarioType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScenarioType_NotLikeSearch(String scenarioType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScenarioType_NotLikeSearch(scenarioType, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_type: {NotNull, VARCHAR(50)}
     * @param scenarioType The value of scenarioType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScenarioType_NotLikeSearch(String scenarioType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scenarioType), xgetCValueScenarioType(), "scenario_type", likeSearchOption);
    }

    protected void regScenarioType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScenarioType(), "scenario_type"); }
    protected abstract ConditionValue xgetCValueScenarioType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrl The value of scenarioUrl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioUrl_Equal(String scenarioUrl) {
        doSetScenarioUrl_Equal(fRES(scenarioUrl));
    }

    protected void doSetScenarioUrl_Equal(String scenarioUrl) {
        regScenarioUrl(CK_EQ, scenarioUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrl The value of scenarioUrl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioUrl_NotEqual(String scenarioUrl) {
        doSetScenarioUrl_NotEqual(fRES(scenarioUrl));
    }

    protected void doSetScenarioUrl_NotEqual(String scenarioUrl) {
        regScenarioUrl(CK_NES, scenarioUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrl The value of scenarioUrl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioUrl_GreaterThan(String scenarioUrl) {
        regScenarioUrl(CK_GT, fRES(scenarioUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrl The value of scenarioUrl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioUrl_LessThan(String scenarioUrl) {
        regScenarioUrl(CK_LT, fRES(scenarioUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrl The value of scenarioUrl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioUrl_GreaterEqual(String scenarioUrl) {
        regScenarioUrl(CK_GE, fRES(scenarioUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrl The value of scenarioUrl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioUrl_LessEqual(String scenarioUrl) {
        regScenarioUrl(CK_LE, fRES(scenarioUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrlList The collection of scenarioUrl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioUrl_InScope(Collection<String> scenarioUrlList) {
        doSetScenarioUrl_InScope(scenarioUrlList);
    }

    protected void doSetScenarioUrl_InScope(Collection<String> scenarioUrlList) {
        regINS(CK_INS, cTL(scenarioUrlList), xgetCValueScenarioUrl(), "scenario_url");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrlList The collection of scenarioUrl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScenarioUrl_NotInScope(Collection<String> scenarioUrlList) {
        doSetScenarioUrl_NotInScope(scenarioUrlList);
    }

    protected void doSetScenarioUrl_NotInScope(Collection<String> scenarioUrlList) {
        regINS(CK_NINS, cTL(scenarioUrlList), xgetCValueScenarioUrl(), "scenario_url");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_url: {VARCHAR(255)} <br>
     * <pre>e.g. setScenarioUrl_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param scenarioUrl The value of scenarioUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScenarioUrl_LikeSearch(String scenarioUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScenarioUrl_LikeSearch(scenarioUrl, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_url: {VARCHAR(255)} <br>
     * <pre>e.g. setScenarioUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scenarioUrl The value of scenarioUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setScenarioUrl_LikeSearch(String scenarioUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scenarioUrl), xgetCValueScenarioUrl(), "scenario_url", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrl The value of scenarioUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScenarioUrl_NotLikeSearch(String scenarioUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScenarioUrl_NotLikeSearch(scenarioUrl, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     * @param scenarioUrl The value of scenarioUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScenarioUrl_NotLikeSearch(String scenarioUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scenarioUrl), xgetCValueScenarioUrl(), "scenario_url", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     */
    public void setScenarioUrl_IsNull() { regScenarioUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     */
    public void setScenarioUrl_IsNullOrEmpty() { regScenarioUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * scenario_url: {VARCHAR(255)}
     */
    public void setScenarioUrl_IsNotNull() { regScenarioUrl(CK_ISNN, DOBJ); }

    protected void regScenarioUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScenarioUrl(), "scenario_url"); }
    protected abstract ConditionValue xgetCValueScenarioUrl();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirement The value of gameMasterRequirement as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMasterRequirement_Equal(String gameMasterRequirement) {
        doSetGameMasterRequirement_Equal(fRES(gameMasterRequirement));
    }

    protected void doSetGameMasterRequirement_Equal(String gameMasterRequirement) {
        regGameMasterRequirement(CK_EQ, gameMasterRequirement);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirement The value of gameMasterRequirement as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMasterRequirement_NotEqual(String gameMasterRequirement) {
        doSetGameMasterRequirement_NotEqual(fRES(gameMasterRequirement));
    }

    protected void doSetGameMasterRequirement_NotEqual(String gameMasterRequirement) {
        regGameMasterRequirement(CK_NES, gameMasterRequirement);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirement The value of gameMasterRequirement as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMasterRequirement_GreaterThan(String gameMasterRequirement) {
        regGameMasterRequirement(CK_GT, fRES(gameMasterRequirement));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirement The value of gameMasterRequirement as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMasterRequirement_LessThan(String gameMasterRequirement) {
        regGameMasterRequirement(CK_LT, fRES(gameMasterRequirement));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirement The value of gameMasterRequirement as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMasterRequirement_GreaterEqual(String gameMasterRequirement) {
        regGameMasterRequirement(CK_GE, fRES(gameMasterRequirement));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirement The value of gameMasterRequirement as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMasterRequirement_LessEqual(String gameMasterRequirement) {
        regGameMasterRequirement(CK_LE, fRES(gameMasterRequirement));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirementList The collection of gameMasterRequirement as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMasterRequirement_InScope(Collection<String> gameMasterRequirementList) {
        doSetGameMasterRequirement_InScope(gameMasterRequirementList);
    }

    protected void doSetGameMasterRequirement_InScope(Collection<String> gameMasterRequirementList) {
        regINS(CK_INS, cTL(gameMasterRequirementList), xgetCValueGameMasterRequirement(), "game_master_requirement");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirementList The collection of gameMasterRequirement as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameMasterRequirement_NotInScope(Collection<String> gameMasterRequirementList) {
        doSetGameMasterRequirement_NotInScope(gameMasterRequirementList);
    }

    protected void doSetGameMasterRequirement_NotInScope(Collection<String> gameMasterRequirementList) {
        regINS(CK_NINS, cTL(gameMasterRequirementList), xgetCValueGameMasterRequirement(), "game_master_requirement");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_master_requirement: {VARCHAR(50)} <br>
     * <pre>e.g. setGameMasterRequirement_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param gameMasterRequirement The value of gameMasterRequirement as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameMasterRequirement_LikeSearch(String gameMasterRequirement, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameMasterRequirement_LikeSearch(gameMasterRequirement, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_master_requirement: {VARCHAR(50)} <br>
     * <pre>e.g. setGameMasterRequirement_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gameMasterRequirement The value of gameMasterRequirement as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGameMasterRequirement_LikeSearch(String gameMasterRequirement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gameMasterRequirement), xgetCValueGameMasterRequirement(), "game_master_requirement", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirement The value of gameMasterRequirement as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameMasterRequirement_NotLikeSearch(String gameMasterRequirement, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameMasterRequirement_NotLikeSearch(gameMasterRequirement, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     * @param gameMasterRequirement The value of gameMasterRequirement as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGameMasterRequirement_NotLikeSearch(String gameMasterRequirement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gameMasterRequirement), xgetCValueGameMasterRequirement(), "game_master_requirement", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     */
    public void setGameMasterRequirement_IsNull() { regGameMasterRequirement(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     */
    public void setGameMasterRequirement_IsNullOrEmpty() { regGameMasterRequirement(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * game_master_requirement: {VARCHAR(50)}
     */
    public void setGameMasterRequirement_IsNotNull() { regGameMasterRequirement(CK_ISNN, DOBJ); }

    protected void regGameMasterRequirement(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameMasterRequirement(), "game_master_requirement"); }
    protected abstract ConditionValue xgetCValueGameMasterRequirement();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param playerNumMin The value of playerNumMin as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMin_Equal(Integer playerNumMin) {
        doSetPlayerNumMin_Equal(playerNumMin);
    }

    protected void doSetPlayerNumMin_Equal(Integer playerNumMin) {
        regPlayerNumMin(CK_EQ, playerNumMin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param playerNumMin The value of playerNumMin as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMin_NotEqual(Integer playerNumMin) {
        doSetPlayerNumMin_NotEqual(playerNumMin);
    }

    protected void doSetPlayerNumMin_NotEqual(Integer playerNumMin) {
        regPlayerNumMin(CK_NES, playerNumMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param playerNumMin The value of playerNumMin as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMin_GreaterThan(Integer playerNumMin) {
        regPlayerNumMin(CK_GT, playerNumMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param playerNumMin The value of playerNumMin as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMin_LessThan(Integer playerNumMin) {
        regPlayerNumMin(CK_LT, playerNumMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param playerNumMin The value of playerNumMin as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMin_GreaterEqual(Integer playerNumMin) {
        regPlayerNumMin(CK_GE, playerNumMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param playerNumMin The value of playerNumMin as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMin_LessEqual(Integer playerNumMin) {
        regPlayerNumMin(CK_LE, playerNumMin);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param minNumber The min number of playerNumMin. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of playerNumMin. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPlayerNumMin_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPlayerNumMin_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param minNumber The min number of playerNumMin. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of playerNumMin. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPlayerNumMin_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlayerNumMin(), "player_num_min", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param playerNumMinList The collection of playerNumMin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNumMin_InScope(Collection<Integer> playerNumMinList) {
        doSetPlayerNumMin_InScope(playerNumMinList);
    }

    protected void doSetPlayerNumMin_InScope(Collection<Integer> playerNumMinList) {
        regINS(CK_INS, cTL(playerNumMinList), xgetCValuePlayerNumMin(), "player_num_min");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     * @param playerNumMinList The collection of playerNumMin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNumMin_NotInScope(Collection<Integer> playerNumMinList) {
        doSetPlayerNumMin_NotInScope(playerNumMinList);
    }

    protected void doSetPlayerNumMin_NotInScope(Collection<Integer> playerNumMinList) {
        regINS(CK_NINS, cTL(playerNumMinList), xgetCValuePlayerNumMin(), "player_num_min");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     */
    public void setPlayerNumMin_IsNull() { regPlayerNumMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * player_num_min: {INT UNSIGNED(10)}
     */
    public void setPlayerNumMin_IsNotNull() { regPlayerNumMin(CK_ISNN, DOBJ); }

    protected void regPlayerNumMin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlayerNumMin(), "player_num_min"); }
    protected abstract ConditionValue xgetCValuePlayerNumMin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param playerNumMax The value of playerNumMax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMax_Equal(Integer playerNumMax) {
        doSetPlayerNumMax_Equal(playerNumMax);
    }

    protected void doSetPlayerNumMax_Equal(Integer playerNumMax) {
        regPlayerNumMax(CK_EQ, playerNumMax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param playerNumMax The value of playerNumMax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMax_NotEqual(Integer playerNumMax) {
        doSetPlayerNumMax_NotEqual(playerNumMax);
    }

    protected void doSetPlayerNumMax_NotEqual(Integer playerNumMax) {
        regPlayerNumMax(CK_NES, playerNumMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param playerNumMax The value of playerNumMax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMax_GreaterThan(Integer playerNumMax) {
        regPlayerNumMax(CK_GT, playerNumMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param playerNumMax The value of playerNumMax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMax_LessThan(Integer playerNumMax) {
        regPlayerNumMax(CK_LT, playerNumMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param playerNumMax The value of playerNumMax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMax_GreaterEqual(Integer playerNumMax) {
        regPlayerNumMax(CK_GE, playerNumMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param playerNumMax The value of playerNumMax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayerNumMax_LessEqual(Integer playerNumMax) {
        regPlayerNumMax(CK_LE, playerNumMax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param minNumber The min number of playerNumMax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of playerNumMax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPlayerNumMax_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPlayerNumMax_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param minNumber The min number of playerNumMax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of playerNumMax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPlayerNumMax_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlayerNumMax(), "player_num_max", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param playerNumMaxList The collection of playerNumMax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNumMax_InScope(Collection<Integer> playerNumMaxList) {
        doSetPlayerNumMax_InScope(playerNumMaxList);
    }

    protected void doSetPlayerNumMax_InScope(Collection<Integer> playerNumMaxList) {
        regINS(CK_INS, cTL(playerNumMaxList), xgetCValuePlayerNumMax(), "player_num_max");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     * @param playerNumMaxList The collection of playerNumMax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlayerNumMax_NotInScope(Collection<Integer> playerNumMaxList) {
        doSetPlayerNumMax_NotInScope(playerNumMaxList);
    }

    protected void doSetPlayerNumMax_NotInScope(Collection<Integer> playerNumMaxList) {
        regINS(CK_NINS, cTL(playerNumMaxList), xgetCValuePlayerNumMax(), "player_num_max");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     */
    public void setPlayerNumMax_IsNull() { regPlayerNumMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * player_num_max: {INT UNSIGNED(10)}
     */
    public void setPlayerNumMax_IsNotNull() { regPlayerNumMax(CK_ISNN, DOBJ); }

    protected void regPlayerNumMax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlayerNumMax(), "player_num_max"); }
    protected abstract ConditionValue xgetCValuePlayerNumMax();

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
    public HpSLCFunction<DbScenarioCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbScenarioCB.class);
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
    public HpSLCFunction<DbScenarioCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbScenarioCB.class);
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
    public HpSLCFunction<DbScenarioCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbScenarioCB.class);
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
    public HpSLCFunction<DbScenarioCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbScenarioCB.class);
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
    public HpSLCFunction<DbScenarioCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbScenarioCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbScenarioCB&gt;() {
     *     public void query(DbScenarioCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbScenarioCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbScenarioCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbScenarioCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbScenarioCQ sq);

    protected DbScenarioCB xcreateScalarConditionCB() {
        DbScenarioCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbScenarioCB xcreateScalarConditionPartitionByCB() {
        DbScenarioCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DbScenarioCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbScenarioCB cb = new DbScenarioCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "scenario_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DbScenarioCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DbScenarioCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DbScenarioCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbScenarioCB cb = new DbScenarioCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "scenario_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DbScenarioCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DbScenarioCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbScenarioCB cb = new DbScenarioCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DbScenarioCQ sq);

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
    protected DbScenarioCB newMyCB() {
        return new DbScenarioCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbScenarioCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
