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
 * The abstract condition-query of user.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "user";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select user_id from participate where ...)} <br>
     * participate by user_id, named 'participateAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_ParticipateList(cb.query());
        registerExistsReferrer(cb.query(), "user_id", "user_id", pp, "participateList");
    }
    public abstract String keepUserId_ExistsReferrer_ParticipateList(DbParticipateCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select user_id from user_rule_book where ...)} <br>
     * user_rule_book by user_id, named 'userRuleBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserRuleBook</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserRuleBookList for 'exists'. (NotNull)
     */
    public void existsUserRuleBook(SubQuery<DbUserRuleBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbUserRuleBookCB cb = new DbUserRuleBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_UserRuleBookList(cb.query());
        registerExistsReferrer(cb.query(), "user_id", "user_id", pp, "userRuleBookList");
    }
    public abstract String keepUserId_ExistsReferrer_UserRuleBookList(DbUserRuleBookCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select user_id from user_scenario where ...)} <br>
     * user_scenario by user_id, named 'userScenarioAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_UserScenarioList(cb.query());
        registerExistsReferrer(cb.query(), "user_id", "user_id", pp, "userScenarioList");
    }
    public abstract String keepUserId_ExistsReferrer_UserScenarioList(DbUserScenarioCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select user_id from participate where ...)} <br>
     * participate by user_id, named 'participateAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsParticipate</span>(participateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     participateCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_ParticipateList for 'not exists'. (NotNull)
     */
    public void notExistsParticipate(SubQuery<DbParticipateCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbParticipateCB cb = new DbParticipateCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_ParticipateList(cb.query());
        registerNotExistsReferrer(cb.query(), "user_id", "user_id", pp, "participateList");
    }
    public abstract String keepUserId_NotExistsReferrer_ParticipateList(DbParticipateCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select user_id from user_rule_book where ...)} <br>
     * user_rule_book by user_id, named 'userRuleBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserRuleBook</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_UserRuleBookList for 'not exists'. (NotNull)
     */
    public void notExistsUserRuleBook(SubQuery<DbUserRuleBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbUserRuleBookCB cb = new DbUserRuleBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_UserRuleBookList(cb.query());
        registerNotExistsReferrer(cb.query(), "user_id", "user_id", pp, "userRuleBookList");
    }
    public abstract String keepUserId_NotExistsReferrer_UserRuleBookList(DbUserRuleBookCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select user_id from user_scenario where ...)} <br>
     * user_scenario by user_id, named 'userScenarioAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserScenario</span>(scenarioCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scenarioCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_UserScenarioList for 'not exists'. (NotNull)
     */
    public void notExistsUserScenario(SubQuery<DbUserScenarioCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbUserScenarioCB cb = new DbUserScenarioCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_UserScenarioList(cb.query());
        registerNotExistsReferrer(cb.query(), "user_id", "user_id", pp, "userScenarioList");
    }
    public abstract String keepUserId_NotExistsReferrer_UserScenarioList(DbUserScenarioCQ sq);

    public void xsderiveParticipateList(String fn, SubQuery<DbParticipateCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateCB cb = new DbParticipateCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_ParticipateList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "user_id", "user_id", pp, "participateList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_ParticipateList(DbParticipateCQ sq);

    public void xsderiveUserRuleBookList(String fn, SubQuery<DbUserRuleBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbUserRuleBookCB cb = new DbUserRuleBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_UserRuleBookList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "user_id", "user_id", pp, "userRuleBookList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_UserRuleBookList(DbUserRuleBookCQ sq);

    public void xsderiveUserScenarioList(String fn, SubQuery<DbUserScenarioCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbUserScenarioCB cb = new DbUserScenarioCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_UserScenarioList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "user_id", "user_id", pp, "userScenarioList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_UserScenarioList(DbUserScenarioCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from participate where ...)} <br>
     * participate by user_id, named 'participateAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_ParticipateList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_ParticipateListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "user_id", "user_id", sqpp, "participateList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_ParticipateList(DbParticipateCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_ParticipateListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from user_rule_book where ...)} <br>
     * user_rule_book by user_id, named 'userRuleBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserRuleBook()</span>.<span style="color: #CC4747">max</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bookCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbUserRuleBookCB> derivedUserRuleBook() {
        return xcreateQDRFunctionUserRuleBookList();
    }
    protected HpQDRFunction<DbUserRuleBookCB> xcreateQDRFunctionUserRuleBookList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserRuleBookList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserRuleBookList(String fn, SubQuery<DbUserRuleBookCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbUserRuleBookCB cb = new DbUserRuleBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_UserRuleBookList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_UserRuleBookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "user_id", "user_id", sqpp, "userRuleBookList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_UserRuleBookList(DbUserRuleBookCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_UserRuleBookListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from user_scenario where ...)} <br>
     * user_scenario by user_id, named 'userScenarioAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_UserScenarioList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_UserScenarioListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "user_id", "user_id", sqpp, "userScenarioList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_UserScenarioList(DbUserScenarioCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_UserScenarioListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userName The value of userName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_Equal(String userName) {
        doSetUserName_Equal(fRES(userName));
    }

    protected void doSetUserName_Equal(String userName) {
        regUserName(CK_EQ, userName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userName The value of userName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_NotEqual(String userName) {
        doSetUserName_NotEqual(fRES(userName));
    }

    protected void doSetUserName_NotEqual(String userName) {
        regUserName(CK_NES, userName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userName The value of userName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_GreaterThan(String userName) {
        regUserName(CK_GT, fRES(userName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userName The value of userName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_LessThan(String userName) {
        regUserName(CK_LT, fRES(userName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userName The value of userName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_GreaterEqual(String userName) {
        regUserName(CK_GE, fRES(userName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userName The value of userName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_LessEqual(String userName) {
        regUserName(CK_LE, fRES(userName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userNameList The collection of userName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_InScope(Collection<String> userNameList) {
        doSetUserName_InScope(userNameList);
    }

    protected void doSetUserName_InScope(Collection<String> userNameList) {
        regINS(CK_INS, cTL(userNameList), xgetCValueUserName(), "user_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userNameList The collection of userName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_NotInScope(Collection<String> userNameList) {
        doSetUserName_NotInScope(userNameList);
    }

    protected void doSetUserName_NotInScope(Collection<String> userNameList) {
        regINS(CK_NINS, cTL(userNameList), xgetCValueUserName(), "user_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userName The value of userName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_LikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_LikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userName The value of userName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserName_LikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userName), xgetCValueUserName(), "user_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userName The value of userName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_NotLikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_NotLikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, VARCHAR(50)}
     * @param userName The value of userName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserName_NotLikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userName), xgetCValueUserName(), "user_name", likeSearchOption);
    }

    protected void regUserName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserName(), "user_name"); }
    protected abstract ConditionValue xgetCValueUserName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uid The value of uid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUid_Equal(String uid) {
        doSetUid_Equal(fRES(uid));
    }

    protected void doSetUid_Equal(String uid) {
        regUid(CK_EQ, uid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uid The value of uid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUid_NotEqual(String uid) {
        doSetUid_NotEqual(fRES(uid));
    }

    protected void doSetUid_NotEqual(String uid) {
        regUid(CK_NES, uid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uid The value of uid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUid_GreaterThan(String uid) {
        regUid(CK_GT, fRES(uid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uid The value of uid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUid_LessThan(String uid) {
        regUid(CK_LT, fRES(uid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uid The value of uid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUid_GreaterEqual(String uid) {
        regUid(CK_GE, fRES(uid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uid The value of uid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUid_LessEqual(String uid) {
        regUid(CK_LE, fRES(uid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uidList The collection of uid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUid_InScope(Collection<String> uidList) {
        doSetUid_InScope(uidList);
    }

    protected void doSetUid_InScope(Collection<String> uidList) {
        regINS(CK_INS, cTL(uidList), xgetCValueUid(), "uid");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uidList The collection of uid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUid_NotInScope(Collection<String> uidList) {
        doSetUid_NotInScope(uidList);
    }

    protected void doSetUid_NotInScope(Collection<String> uidList) {
        regINS(CK_NINS, cTL(uidList), xgetCValueUid(), "uid");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setUid_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param uid The value of uid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUid_LikeSearch(String uid, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUid_LikeSearch(uid, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setUid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uid The value of uid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUid_LikeSearch(String uid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uid), xgetCValueUid(), "uid", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uid The value of uid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUid_NotLikeSearch(String uid, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUid_NotLikeSearch(uid, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @param uid The value of uid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUid_NotLikeSearch(String uid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uid), xgetCValueUid(), "uid", likeSearchOption);
    }

    protected void regUid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUid(), "uid"); }
    protected abstract ConditionValue xgetCValueUid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authority The value of authority as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthority_Equal(String authority) {
        doSetAuthority_Equal(fRES(authority));
    }

    protected void doSetAuthority_Equal(String authority) {
        regAuthority(CK_EQ, authority);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authority The value of authority as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthority_NotEqual(String authority) {
        doSetAuthority_NotEqual(fRES(authority));
    }

    protected void doSetAuthority_NotEqual(String authority) {
        regAuthority(CK_NES, authority);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authority The value of authority as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthority_GreaterThan(String authority) {
        regAuthority(CK_GT, fRES(authority));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authority The value of authority as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthority_LessThan(String authority) {
        regAuthority(CK_LT, fRES(authority));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authority The value of authority as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthority_GreaterEqual(String authority) {
        regAuthority(CK_GE, fRES(authority));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authority The value of authority as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthority_LessEqual(String authority) {
        regAuthority(CK_LE, fRES(authority));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authorityList The collection of authority as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthority_InScope(Collection<String> authorityList) {
        doSetAuthority_InScope(authorityList);
    }

    protected void doSetAuthority_InScope(Collection<String> authorityList) {
        regINS(CK_INS, cTL(authorityList), xgetCValueAuthority(), "authority");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authorityList The collection of authority as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthority_NotInScope(Collection<String> authorityList) {
        doSetAuthority_NotInScope(authorityList);
    }

    protected void doSetAuthority_NotInScope(Collection<String> authorityList) {
        regINS(CK_NINS, cTL(authorityList), xgetCValueAuthority(), "authority");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * authority: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setAuthority_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param authority The value of authority as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAuthority_LikeSearch(String authority, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAuthority_LikeSearch(authority, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * authority: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setAuthority_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param authority The value of authority as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAuthority_LikeSearch(String authority, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(authority), xgetCValueAuthority(), "authority", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authority The value of authority as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAuthority_NotLikeSearch(String authority, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAuthority_NotLikeSearch(authority, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * authority: {NotNull, VARCHAR(50)}
     * @param authority The value of authority as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAuthority_NotLikeSearch(String authority, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(authority), xgetCValueAuthority(), "authority", likeSearchOption);
    }

    protected void regAuthority(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAuthority(), "authority"); }
    protected abstract ConditionValue xgetCValueAuthority();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introduction The value of introduction as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntroduction_Equal(String introduction) {
        doSetIntroduction_Equal(fRES(introduction));
    }

    protected void doSetIntroduction_Equal(String introduction) {
        regIntroduction(CK_EQ, introduction);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introduction The value of introduction as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntroduction_NotEqual(String introduction) {
        doSetIntroduction_NotEqual(fRES(introduction));
    }

    protected void doSetIntroduction_NotEqual(String introduction) {
        regIntroduction(CK_NES, introduction);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introduction The value of introduction as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntroduction_GreaterThan(String introduction) {
        regIntroduction(CK_GT, fRES(introduction));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introduction The value of introduction as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntroduction_LessThan(String introduction) {
        regIntroduction(CK_LT, fRES(introduction));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introduction The value of introduction as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntroduction_GreaterEqual(String introduction) {
        regIntroduction(CK_GE, fRES(introduction));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introduction The value of introduction as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntroduction_LessEqual(String introduction) {
        regIntroduction(CK_LE, fRES(introduction));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introductionList The collection of introduction as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntroduction_InScope(Collection<String> introductionList) {
        doSetIntroduction_InScope(introductionList);
    }

    protected void doSetIntroduction_InScope(Collection<String> introductionList) {
        regINS(CK_INS, cTL(introductionList), xgetCValueIntroduction(), "introduction");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introductionList The collection of introduction as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntroduction_NotInScope(Collection<String> introductionList) {
        doSetIntroduction_NotInScope(introductionList);
    }

    protected void doSetIntroduction_NotInScope(Collection<String> introductionList) {
        regINS(CK_NINS, cTL(introductionList), xgetCValueIntroduction(), "introduction");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * introduction: {TEXT(65535)} <br>
     * <pre>e.g. setIntroduction_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param introduction The value of introduction as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIntroduction_LikeSearch(String introduction, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIntroduction_LikeSearch(introduction, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * introduction: {TEXT(65535)} <br>
     * <pre>e.g. setIntroduction_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param introduction The value of introduction as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setIntroduction_LikeSearch(String introduction, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(introduction), xgetCValueIntroduction(), "introduction", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introduction The value of introduction as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIntroduction_NotLikeSearch(String introduction, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIntroduction_NotLikeSearch(introduction, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * introduction: {TEXT(65535)}
     * @param introduction The value of introduction as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setIntroduction_NotLikeSearch(String introduction, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(introduction), xgetCValueIntroduction(), "introduction", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * introduction: {TEXT(65535)}
     */
    public void setIntroduction_IsNull() { regIntroduction(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * introduction: {TEXT(65535)}
     */
    public void setIntroduction_IsNullOrEmpty() { regIntroduction(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * introduction: {TEXT(65535)}
     */
    public void setIntroduction_IsNotNull() { regIntroduction(CK_ISNN, DOBJ); }

    protected void regIntroduction(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIntroduction(), "introduction"); }
    protected abstract ConditionValue xgetCValueIntroduction();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * is_deleted: {NotNull, BIT}
     * @param isDeleted The value of isDeleted as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIsDeleted_Equal(Boolean isDeleted) {
        regIsDeleted(CK_EQ, isDeleted);
    }

    protected void regIsDeleted(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsDeleted(), "is_deleted"); }
    protected abstract ConditionValue xgetCValueIsDeleted();

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
    public HpSLCFunction<DbUserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbUserCB.class);
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
    public HpSLCFunction<DbUserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbUserCB.class);
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
    public HpSLCFunction<DbUserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbUserCB.class);
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
    public HpSLCFunction<DbUserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbUserCB.class);
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
    public HpSLCFunction<DbUserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbUserCB&gt;() {
     *     public void query(DbUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbUserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbUserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbUserCQ sq);

    protected DbUserCB xcreateScalarConditionCB() {
        DbUserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbUserCB xcreateScalarConditionPartitionByCB() {
        DbUserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DbUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbUserCB cb = new DbUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "user_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DbUserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DbUserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DbUserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbUserCB cb = new DbUserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "user_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DbUserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DbUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbUserCB cb = new DbUserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DbUserCQ sq);

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
    protected DbUserCB newMyCB() {
        return new DbUserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
