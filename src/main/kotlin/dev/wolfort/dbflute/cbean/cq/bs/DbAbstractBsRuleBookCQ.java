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
 * The abstract condition-query of rule_book.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsRuleBookCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsRuleBookCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "rule_book";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param ruleBookId The value of ruleBookId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRuleBookId_Equal(Integer ruleBookId) {
        doSetRuleBookId_Equal(ruleBookId);
    }

    protected void doSetRuleBookId_Equal(Integer ruleBookId) {
        regRuleBookId(CK_EQ, ruleBookId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param ruleBookId The value of ruleBookId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRuleBookId_NotEqual(Integer ruleBookId) {
        doSetRuleBookId_NotEqual(ruleBookId);
    }

    protected void doSetRuleBookId_NotEqual(Integer ruleBookId) {
        regRuleBookId(CK_NES, ruleBookId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param ruleBookId The value of ruleBookId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRuleBookId_GreaterThan(Integer ruleBookId) {
        regRuleBookId(CK_GT, ruleBookId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param ruleBookId The value of ruleBookId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRuleBookId_LessThan(Integer ruleBookId) {
        regRuleBookId(CK_LT, ruleBookId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param ruleBookId The value of ruleBookId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRuleBookId_GreaterEqual(Integer ruleBookId) {
        regRuleBookId(CK_GE, ruleBookId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param ruleBookId The value of ruleBookId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRuleBookId_LessEqual(Integer ruleBookId) {
        regRuleBookId(CK_LE, ruleBookId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of ruleBookId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ruleBookId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRuleBookId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRuleBookId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of ruleBookId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ruleBookId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRuleBookId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRuleBookId(), "rule_book_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param ruleBookIdList The collection of ruleBookId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookId_InScope(Collection<Integer> ruleBookIdList) {
        doSetRuleBookId_InScope(ruleBookIdList);
    }

    protected void doSetRuleBookId_InScope(Collection<Integer> ruleBookIdList) {
        regINS(CK_INS, cTL(ruleBookIdList), xgetCValueRuleBookId(), "rule_book_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param ruleBookIdList The collection of ruleBookId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookId_NotInScope(Collection<Integer> ruleBookIdList) {
        doSetRuleBookId_NotInScope(ruleBookIdList);
    }

    protected void doSetRuleBookId_NotInScope(Collection<Integer> ruleBookIdList) {
        regINS(CK_NINS, cTL(ruleBookIdList), xgetCValueRuleBookId(), "rule_book_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select rule_book_id from participate_rule_book where ...)} <br>
     * participate_rule_book by rule_book_id, named 'participateRuleBookAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRuleBookId_ExistsReferrer_ParticipateRuleBookList(cb.query());
        registerExistsReferrer(cb.query(), "rule_book_id", "rule_book_id", pp, "participateRuleBookList");
    }
    public abstract String keepRuleBookId_ExistsReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select rule_book_id from rule_book_dictionary where ...)} <br>
     * rule_book_dictionary by rule_book_id, named 'ruleBookDictionaryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsRuleBookDictionary</span>(dictionaryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dictionaryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RuleBookDictionaryList for 'exists'. (NotNull)
     */
    public void existsRuleBookDictionary(SubQuery<DbRuleBookDictionaryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbRuleBookDictionaryCB cb = new DbRuleBookDictionaryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRuleBookId_ExistsReferrer_RuleBookDictionaryList(cb.query());
        registerExistsReferrer(cb.query(), "rule_book_id", "rule_book_id", pp, "ruleBookDictionaryList");
    }
    public abstract String keepRuleBookId_ExistsReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select rule_book_id from user_rule_book where ...)} <br>
     * user_rule_book by rule_book_id, named 'userRuleBookAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRuleBookId_ExistsReferrer_UserRuleBookList(cb.query());
        registerExistsReferrer(cb.query(), "rule_book_id", "rule_book_id", pp, "userRuleBookList");
    }
    public abstract String keepRuleBookId_ExistsReferrer_UserRuleBookList(DbUserRuleBookCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select rule_book_id from participate_rule_book where ...)} <br>
     * participate_rule_book by rule_book_id, named 'participateRuleBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsParticipateRuleBook</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RuleBookId_NotExistsReferrer_ParticipateRuleBookList for 'not exists'. (NotNull)
     */
    public void notExistsParticipateRuleBook(SubQuery<DbParticipateRuleBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbParticipateRuleBookCB cb = new DbParticipateRuleBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRuleBookId_NotExistsReferrer_ParticipateRuleBookList(cb.query());
        registerNotExistsReferrer(cb.query(), "rule_book_id", "rule_book_id", pp, "participateRuleBookList");
    }
    public abstract String keepRuleBookId_NotExistsReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select rule_book_id from rule_book_dictionary where ...)} <br>
     * rule_book_dictionary by rule_book_id, named 'ruleBookDictionaryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsRuleBookDictionary</span>(dictionaryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dictionaryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RuleBookId_NotExistsReferrer_RuleBookDictionaryList for 'not exists'. (NotNull)
     */
    public void notExistsRuleBookDictionary(SubQuery<DbRuleBookDictionaryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbRuleBookDictionaryCB cb = new DbRuleBookDictionaryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRuleBookId_NotExistsReferrer_RuleBookDictionaryList(cb.query());
        registerNotExistsReferrer(cb.query(), "rule_book_id", "rule_book_id", pp, "ruleBookDictionaryList");
    }
    public abstract String keepRuleBookId_NotExistsReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select rule_book_id from user_rule_book where ...)} <br>
     * user_rule_book by rule_book_id, named 'userRuleBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserRuleBook</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RuleBookId_NotExistsReferrer_UserRuleBookList for 'not exists'. (NotNull)
     */
    public void notExistsUserRuleBook(SubQuery<DbUserRuleBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbUserRuleBookCB cb = new DbUserRuleBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRuleBookId_NotExistsReferrer_UserRuleBookList(cb.query());
        registerNotExistsReferrer(cb.query(), "rule_book_id", "rule_book_id", pp, "userRuleBookList");
    }
    public abstract String keepRuleBookId_NotExistsReferrer_UserRuleBookList(DbUserRuleBookCQ sq);

    public void xsderiveParticipateRuleBookList(String fn, SubQuery<DbParticipateRuleBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbParticipateRuleBookCB cb = new DbParticipateRuleBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRuleBookId_SpecifyDerivedReferrer_ParticipateRuleBookList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "rule_book_id", "rule_book_id", pp, "participateRuleBookList", al, op);
    }
    public abstract String keepRuleBookId_SpecifyDerivedReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq);

    public void xsderiveRuleBookDictionaryList(String fn, SubQuery<DbRuleBookDictionaryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbRuleBookDictionaryCB cb = new DbRuleBookDictionaryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRuleBookId_SpecifyDerivedReferrer_RuleBookDictionaryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "rule_book_id", "rule_book_id", pp, "ruleBookDictionaryList", al, op);
    }
    public abstract String keepRuleBookId_SpecifyDerivedReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq);

    public void xsderiveUserRuleBookList(String fn, SubQuery<DbUserRuleBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbUserRuleBookCB cb = new DbUserRuleBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRuleBookId_SpecifyDerivedReferrer_UserRuleBookList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "rule_book_id", "rule_book_id", pp, "userRuleBookList", al, op);
    }
    public abstract String keepRuleBookId_SpecifyDerivedReferrer_UserRuleBookList(DbUserRuleBookCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from participate_rule_book where ...)} <br>
     * participate_rule_book by rule_book_id, named 'participateRuleBookAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepRuleBookId_QueryDerivedReferrer_ParticipateRuleBookList(cb.query()); String prpp = keepRuleBookId_QueryDerivedReferrer_ParticipateRuleBookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "rule_book_id", "rule_book_id", sqpp, "participateRuleBookList", rd, vl, prpp, op);
    }
    public abstract String keepRuleBookId_QueryDerivedReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq);
    public abstract String keepRuleBookId_QueryDerivedReferrer_ParticipateRuleBookListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from rule_book_dictionary where ...)} <br>
     * rule_book_dictionary by rule_book_id, named 'ruleBookDictionaryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedRuleBookDictionary()</span>.<span style="color: #CC4747">max</span>(dictionaryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dictionaryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dictionaryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbRuleBookDictionaryCB> derivedRuleBookDictionary() {
        return xcreateQDRFunctionRuleBookDictionaryList();
    }
    protected HpQDRFunction<DbRuleBookDictionaryCB> xcreateQDRFunctionRuleBookDictionaryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveRuleBookDictionaryList(fn, sq, rd, vl, op));
    }
    public void xqderiveRuleBookDictionaryList(String fn, SubQuery<DbRuleBookDictionaryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbRuleBookDictionaryCB cb = new DbRuleBookDictionaryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepRuleBookId_QueryDerivedReferrer_RuleBookDictionaryList(cb.query()); String prpp = keepRuleBookId_QueryDerivedReferrer_RuleBookDictionaryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "rule_book_id", "rule_book_id", sqpp, "ruleBookDictionaryList", rd, vl, prpp, op);
    }
    public abstract String keepRuleBookId_QueryDerivedReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq);
    public abstract String keepRuleBookId_QueryDerivedReferrer_RuleBookDictionaryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from user_rule_book where ...)} <br>
     * user_rule_book by rule_book_id, named 'userRuleBookAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepRuleBookId_QueryDerivedReferrer_UserRuleBookList(cb.query()); String prpp = keepRuleBookId_QueryDerivedReferrer_UserRuleBookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "rule_book_id", "rule_book_id", sqpp, "userRuleBookList", rd, vl, prpp, op);
    }
    public abstract String keepRuleBookId_QueryDerivedReferrer_UserRuleBookList(DbUserRuleBookCQ sq);
    public abstract String keepRuleBookId_QueryDerivedReferrer_UserRuleBookListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setRuleBookId_IsNull() { regRuleBookId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setRuleBookId_IsNotNull() { regRuleBookId(CK_ISNN, DOBJ); }

    protected void regRuleBookId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRuleBookId(), "rule_book_id"); }
    protected abstract ConditionValue xgetCValueRuleBookId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
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
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
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
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_GreaterThan(Integer gameSystemId) {
        regGameSystemId(CK_GT, gameSystemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_LessThan(Integer gameSystemId) {
        regGameSystemId(CK_LT, gameSystemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_GreaterEqual(Integer gameSystemId) {
        regGameSystemId(CK_GE, gameSystemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemId The value of gameSystemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSystemId_LessEqual(Integer gameSystemId) {
        regGameSystemId(CK_LE, gameSystemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
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
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @param minNumber The min number of gameSystemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameSystemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGameSystemId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGameSystemId(), "game_system_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
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
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @param gameSystemIdList The collection of gameSystemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSystemId_NotInScope(Collection<Integer> gameSystemIdList) {
        doSetGameSystemId_NotInScope(gameSystemIdList);
    }

    protected void doSetGameSystemId_NotInScope(Collection<Integer> gameSystemIdList) {
        regINS(CK_NINS, cTL(gameSystemIdList), xgetCValueGameSystemId(), "game_system_id");
    }

    protected void regGameSystemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameSystemId(), "game_system_id"); }
    protected abstract ConditionValue xgetCValueGameSystemId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookName The value of ruleBookName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookName_Equal(String ruleBookName) {
        doSetRuleBookName_Equal(fRES(ruleBookName));
    }

    protected void doSetRuleBookName_Equal(String ruleBookName) {
        regRuleBookName(CK_EQ, ruleBookName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookName The value of ruleBookName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookName_NotEqual(String ruleBookName) {
        doSetRuleBookName_NotEqual(fRES(ruleBookName));
    }

    protected void doSetRuleBookName_NotEqual(String ruleBookName) {
        regRuleBookName(CK_NES, ruleBookName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookName The value of ruleBookName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookName_GreaterThan(String ruleBookName) {
        regRuleBookName(CK_GT, fRES(ruleBookName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookName The value of ruleBookName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookName_LessThan(String ruleBookName) {
        regRuleBookName(CK_LT, fRES(ruleBookName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookName The value of ruleBookName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookName_GreaterEqual(String ruleBookName) {
        regRuleBookName(CK_GE, fRES(ruleBookName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookName The value of ruleBookName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookName_LessEqual(String ruleBookName) {
        regRuleBookName(CK_LE, fRES(ruleBookName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookNameList The collection of ruleBookName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookName_InScope(Collection<String> ruleBookNameList) {
        doSetRuleBookName_InScope(ruleBookNameList);
    }

    protected void doSetRuleBookName_InScope(Collection<String> ruleBookNameList) {
        regINS(CK_INS, cTL(ruleBookNameList), xgetCValueRuleBookName(), "rule_book_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookNameList The collection of ruleBookName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookName_NotInScope(Collection<String> ruleBookNameList) {
        doSetRuleBookName_NotInScope(ruleBookNameList);
    }

    protected void doSetRuleBookName_NotInScope(Collection<String> ruleBookNameList) {
        regINS(CK_NINS, cTL(ruleBookNameList), xgetCValueRuleBookName(), "rule_book_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setRuleBookName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param ruleBookName The value of ruleBookName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRuleBookName_LikeSearch(String ruleBookName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRuleBookName_LikeSearch(ruleBookName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setRuleBookName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ruleBookName The value of ruleBookName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRuleBookName_LikeSearch(String ruleBookName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ruleBookName), xgetCValueRuleBookName(), "rule_book_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookName The value of ruleBookName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRuleBookName_NotLikeSearch(String ruleBookName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRuleBookName_NotLikeSearch(ruleBookName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @param ruleBookName The value of ruleBookName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRuleBookName_NotLikeSearch(String ruleBookName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ruleBookName), xgetCValueRuleBookName(), "rule_book_name", likeSearchOption);
    }

    protected void regRuleBookName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRuleBookName(), "rule_book_name"); }
    protected abstract ConditionValue xgetCValueRuleBookName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookType The value of ruleBookType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookType_Equal(String ruleBookType) {
        doSetRuleBookType_Equal(fRES(ruleBookType));
    }

    protected void doSetRuleBookType_Equal(String ruleBookType) {
        regRuleBookType(CK_EQ, ruleBookType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookType The value of ruleBookType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookType_NotEqual(String ruleBookType) {
        doSetRuleBookType_NotEqual(fRES(ruleBookType));
    }

    protected void doSetRuleBookType_NotEqual(String ruleBookType) {
        regRuleBookType(CK_NES, ruleBookType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookType The value of ruleBookType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookType_GreaterThan(String ruleBookType) {
        regRuleBookType(CK_GT, fRES(ruleBookType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookType The value of ruleBookType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookType_LessThan(String ruleBookType) {
        regRuleBookType(CK_LT, fRES(ruleBookType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookType The value of ruleBookType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookType_GreaterEqual(String ruleBookType) {
        regRuleBookType(CK_GE, fRES(ruleBookType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookType The value of ruleBookType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookType_LessEqual(String ruleBookType) {
        regRuleBookType(CK_LE, fRES(ruleBookType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookTypeList The collection of ruleBookType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookType_InScope(Collection<String> ruleBookTypeList) {
        doSetRuleBookType_InScope(ruleBookTypeList);
    }

    protected void doSetRuleBookType_InScope(Collection<String> ruleBookTypeList) {
        regINS(CK_INS, cTL(ruleBookTypeList), xgetCValueRuleBookType(), "rule_book_type");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookTypeList The collection of ruleBookType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRuleBookType_NotInScope(Collection<String> ruleBookTypeList) {
        doSetRuleBookType_NotInScope(ruleBookTypeList);
    }

    protected void doSetRuleBookType_NotInScope(Collection<String> ruleBookTypeList) {
        regINS(CK_NINS, cTL(ruleBookTypeList), xgetCValueRuleBookType(), "rule_book_type");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setRuleBookType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param ruleBookType The value of ruleBookType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRuleBookType_LikeSearch(String ruleBookType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRuleBookType_LikeSearch(ruleBookType, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setRuleBookType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ruleBookType The value of ruleBookType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRuleBookType_LikeSearch(String ruleBookType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ruleBookType), xgetCValueRuleBookType(), "rule_book_type", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookType The value of ruleBookType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRuleBookType_NotLikeSearch(String ruleBookType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRuleBookType_NotLikeSearch(ruleBookType, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @param ruleBookType The value of ruleBookType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRuleBookType_NotLikeSearch(String ruleBookType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ruleBookType), xgetCValueRuleBookType(), "rule_book_type", likeSearchOption);
    }

    protected void regRuleBookType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRuleBookType(), "rule_book_type"); }
    protected abstract ConditionValue xgetCValueRuleBookType();

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
    public HpSLCFunction<DbRuleBookCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbRuleBookCB.class);
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
    public HpSLCFunction<DbRuleBookCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbRuleBookCB.class);
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
    public HpSLCFunction<DbRuleBookCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbRuleBookCB.class);
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
    public HpSLCFunction<DbRuleBookCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbRuleBookCB.class);
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
    public HpSLCFunction<DbRuleBookCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbRuleBookCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbRuleBookCB&gt;() {
     *     public void query(DbRuleBookCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbRuleBookCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbRuleBookCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbRuleBookCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbRuleBookCQ sq);

    protected DbRuleBookCB xcreateScalarConditionCB() {
        DbRuleBookCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbRuleBookCB xcreateScalarConditionPartitionByCB() {
        DbRuleBookCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DbRuleBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbRuleBookCB cb = new DbRuleBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "rule_book_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DbRuleBookCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DbRuleBookCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DbRuleBookCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbRuleBookCB cb = new DbRuleBookCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "rule_book_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DbRuleBookCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DbRuleBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbRuleBookCB cb = new DbRuleBookCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DbRuleBookCQ sq);

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
    protected DbRuleBookCB newMyCB() {
        return new DbRuleBookCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbRuleBookCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
