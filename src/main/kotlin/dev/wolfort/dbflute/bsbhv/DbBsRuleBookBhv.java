package dev.wolfort.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.bsbhv.loader.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.bsentity.dbmeta.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The behavior of RULE_BOOK as TABLE. <br>
 * <pre>
 * [primary key]
 *     rule_book_id
 *
 * [column]
 *     rule_book_id, game_system_id, rule_book_name, rule_book_type, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     rule_book_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME_SYSTEM
 *
 * [referrer table]
 *     PARTICIPATE_RULE_BOOK, RULE_BOOK_DICTIONARY, USER_RULE_BOOK
 *
 * [foreign property]
 *     gameSystem
 *
 * [referrer property]
 *     participateRuleBookList, ruleBookDictionaryList, userRuleBookList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsRuleBookBhv extends AbstractBehaviorWritable<DbRuleBook, DbRuleBookCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DbRuleBookDbm asDBMeta() { return DbRuleBookDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "rule_book"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public DbRuleBookCB newConditionBean() { return new DbRuleBookCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<DbRuleBookCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">ruleBook</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">ruleBook</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">ruleBook</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">ruleBook</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbRuleBook> selectEntity(CBCall<DbRuleBookCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<DbRuleBook> facadeSelectEntity(DbRuleBookCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbRuleBook> OptionalEntity<ENTITY> doSelectOptionalEntity(DbRuleBookCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * DbRuleBook <span style="color: #553000">ruleBook</span> = <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">ruleBook</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public DbRuleBook selectEntityWithDeletedCheck(CBCall<DbRuleBookCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param ruleBookId : PK, ID, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbRuleBook> selectByPK(Integer ruleBookId) {
        return facadeSelectByPK(ruleBookId);
    }

    protected OptionalEntity<DbRuleBook> facadeSelectByPK(Integer ruleBookId) {
        return doSelectOptionalByPK(ruleBookId, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbRuleBook> ENTITY doSelectByPK(Integer ruleBookId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(ruleBookId), tp);
    }

    protected <ENTITY extends DbRuleBook> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer ruleBookId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(ruleBookId, tp), ruleBookId);
    }

    protected DbRuleBookCB xprepareCBAsPK(Integer ruleBookId) {
        assertObjectNotNull("ruleBookId", ruleBookId);
        return newConditionBean().acceptPK(ruleBookId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;DbRuleBook&gt; <span style="color: #553000">ruleBookList</span> = <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (DbRuleBook <span style="color: #553000">ruleBook</span> : <span style="color: #553000">ruleBookList</span>) {
     *     ... = <span style="color: #553000">ruleBook</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<DbRuleBook> selectList(CBCall<DbRuleBookCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;DbRuleBook&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (DbRuleBook ruleBook : <span style="color: #553000">page</span>) {
     *     ... = ruleBook.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<DbRuleBook> selectPage(CBCall<DbRuleBookCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @param entityLambda The handler of entity row of DbRuleBook. (NotNull)
     */
    public void selectCursor(CBCall<DbRuleBookCB> cbLambda, EntityRowHandler<DbRuleBook> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<DbRuleBookCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param ruleBookList The entity list of ruleBook. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<DbRuleBook> ruleBookList, ReferrerLoaderHandler<DbLoaderOfRuleBook> loaderLambda) {
        xassLRArg(ruleBookList, loaderLambda);
        loaderLambda.handle(new DbLoaderOfRuleBook().ready(ruleBookList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param ruleBook The entity of ruleBook. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(DbRuleBook ruleBook, ReferrerLoaderHandler<DbLoaderOfRuleBook> loaderLambda) {
        xassLRArg(ruleBook, loaderLambda);
        loaderLambda.handle(new DbLoaderOfRuleBook().ready(xnewLRAryLs(ruleBook), _behaviorSelector));
    }

    /**
     * Load referrer of participateRuleBookList by the set-upper of referrer. <br>
     * PARTICIPATE_RULE_BOOK by rule_book_id, named 'participateRuleBookList'.
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">loadParticipateRuleBook</span>(<span style="color: #553000">ruleBookList</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbRuleBook ruleBook : <span style="color: #553000">ruleBookList</span>) {
     *     ... = ruleBook.<span style="color: #CC4747">getParticipateRuleBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRuleBookId_InScope(pkList);
     * cb.query().addOrderBy_RuleBookId_Asc();
     * </pre>
     * @param ruleBookList The entity list of ruleBook. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbParticipateRuleBook> loadParticipateRuleBook(List<DbRuleBook> ruleBookList, ReferrerConditionSetupper<DbParticipateRuleBookCB> refCBLambda) {
        xassLRArg(ruleBookList, refCBLambda);
        return doLoadParticipateRuleBook(ruleBookList, new LoadReferrerOption<DbParticipateRuleBookCB, DbParticipateRuleBook>().xinit(refCBLambda));
    }

    /**
     * Load referrer of participateRuleBookList by the set-upper of referrer. <br>
     * PARTICIPATE_RULE_BOOK by rule_book_id, named 'participateRuleBookList'.
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">loadParticipateRuleBook</span>(<span style="color: #553000">ruleBook</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">ruleBook</span>.<span style="color: #CC4747">getParticipateRuleBookList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRuleBookId_InScope(pkList);
     * cb.query().addOrderBy_RuleBookId_Asc();
     * </pre>
     * @param ruleBook The entity of ruleBook. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbParticipateRuleBook> loadParticipateRuleBook(DbRuleBook ruleBook, ReferrerConditionSetupper<DbParticipateRuleBookCB> refCBLambda) {
        xassLRArg(ruleBook, refCBLambda);
        return doLoadParticipateRuleBook(xnewLRLs(ruleBook), new LoadReferrerOption<DbParticipateRuleBookCB, DbParticipateRuleBook>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbParticipateRuleBook> doLoadParticipateRuleBook(List<DbRuleBook> ruleBookList, LoadReferrerOption<DbParticipateRuleBookCB, DbParticipateRuleBook> option) {
        return helpLoadReferrerInternally(ruleBookList, option, "participateRuleBookList");
    }

    /**
     * Load referrer of ruleBookDictionaryList by the set-upper of referrer. <br>
     * RULE_BOOK_DICTIONARY by rule_book_id, named 'ruleBookDictionaryList'.
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">loadRuleBookDictionary</span>(<span style="color: #553000">ruleBookList</span>, <span style="color: #553000">dictionaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictionaryCB</span>.setupSelect...
     *     <span style="color: #553000">dictionaryCB</span>.query().set...
     *     <span style="color: #553000">dictionaryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbRuleBook ruleBook : <span style="color: #553000">ruleBookList</span>) {
     *     ... = ruleBook.<span style="color: #CC4747">getRuleBookDictionaryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRuleBookId_InScope(pkList);
     * cb.query().addOrderBy_RuleBookId_Asc();
     * </pre>
     * @param ruleBookList The entity list of ruleBook. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbRuleBookDictionary> loadRuleBookDictionary(List<DbRuleBook> ruleBookList, ReferrerConditionSetupper<DbRuleBookDictionaryCB> refCBLambda) {
        xassLRArg(ruleBookList, refCBLambda);
        return doLoadRuleBookDictionary(ruleBookList, new LoadReferrerOption<DbRuleBookDictionaryCB, DbRuleBookDictionary>().xinit(refCBLambda));
    }

    /**
     * Load referrer of ruleBookDictionaryList by the set-upper of referrer. <br>
     * RULE_BOOK_DICTIONARY by rule_book_id, named 'ruleBookDictionaryList'.
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">loadRuleBookDictionary</span>(<span style="color: #553000">ruleBook</span>, <span style="color: #553000">dictionaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictionaryCB</span>.setupSelect...
     *     <span style="color: #553000">dictionaryCB</span>.query().set...
     *     <span style="color: #553000">dictionaryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">ruleBook</span>.<span style="color: #CC4747">getRuleBookDictionaryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRuleBookId_InScope(pkList);
     * cb.query().addOrderBy_RuleBookId_Asc();
     * </pre>
     * @param ruleBook The entity of ruleBook. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbRuleBookDictionary> loadRuleBookDictionary(DbRuleBook ruleBook, ReferrerConditionSetupper<DbRuleBookDictionaryCB> refCBLambda) {
        xassLRArg(ruleBook, refCBLambda);
        return doLoadRuleBookDictionary(xnewLRLs(ruleBook), new LoadReferrerOption<DbRuleBookDictionaryCB, DbRuleBookDictionary>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbRuleBookDictionary> doLoadRuleBookDictionary(List<DbRuleBook> ruleBookList, LoadReferrerOption<DbRuleBookDictionaryCB, DbRuleBookDictionary> option) {
        return helpLoadReferrerInternally(ruleBookList, option, "ruleBookDictionaryList");
    }

    /**
     * Load referrer of userRuleBookList by the set-upper of referrer. <br>
     * USER_RULE_BOOK by rule_book_id, named 'userRuleBookList'.
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">loadUserRuleBook</span>(<span style="color: #553000">ruleBookList</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbRuleBook ruleBook : <span style="color: #553000">ruleBookList</span>) {
     *     ... = ruleBook.<span style="color: #CC4747">getUserRuleBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRuleBookId_InScope(pkList);
     * cb.query().addOrderBy_RuleBookId_Asc();
     * </pre>
     * @param ruleBookList The entity list of ruleBook. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbUserRuleBook> loadUserRuleBook(List<DbRuleBook> ruleBookList, ReferrerConditionSetupper<DbUserRuleBookCB> refCBLambda) {
        xassLRArg(ruleBookList, refCBLambda);
        return doLoadUserRuleBook(ruleBookList, new LoadReferrerOption<DbUserRuleBookCB, DbUserRuleBook>().xinit(refCBLambda));
    }

    /**
     * Load referrer of userRuleBookList by the set-upper of referrer. <br>
     * USER_RULE_BOOK by rule_book_id, named 'userRuleBookList'.
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">loadUserRuleBook</span>(<span style="color: #553000">ruleBook</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">ruleBook</span>.<span style="color: #CC4747">getUserRuleBookList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRuleBookId_InScope(pkList);
     * cb.query().addOrderBy_RuleBookId_Asc();
     * </pre>
     * @param ruleBook The entity of ruleBook. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbUserRuleBook> loadUserRuleBook(DbRuleBook ruleBook, ReferrerConditionSetupper<DbUserRuleBookCB> refCBLambda) {
        xassLRArg(ruleBook, refCBLambda);
        return doLoadUserRuleBook(xnewLRLs(ruleBook), new LoadReferrerOption<DbUserRuleBookCB, DbUserRuleBook>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbUserRuleBook> doLoadUserRuleBook(List<DbRuleBook> ruleBookList, LoadReferrerOption<DbUserRuleBookCB, DbUserRuleBook> option) {
        return helpLoadReferrerInternally(ruleBookList, option, "userRuleBookList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'DbGameSystem'.
     * @param ruleBookList The list of ruleBook. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<DbGameSystem> pulloutGameSystem(List<DbRuleBook> ruleBookList)
    { return helpPulloutInternally(ruleBookList, "gameSystem"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key ruleBookId.
     * @param ruleBookList The list of ruleBook. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractRuleBookIdList(List<DbRuleBook> ruleBookList)
    { return helpExtractListInternally(ruleBookList, "ruleBookId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbRuleBook ruleBook = <span style="color: #70226C">new</span> DbRuleBook();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * ruleBook.setFoo...(value);
     * ruleBook.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//ruleBook.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//ruleBook.set...;</span>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">insert</span>(ruleBook);
     * ... = ruleBook.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param ruleBook The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(DbRuleBook ruleBook) {
        doInsert(ruleBook, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * DbRuleBook ruleBook = <span style="color: #70226C">new</span> DbRuleBook();
     * ruleBook.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * ruleBook.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//ruleBook.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//ruleBook.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * ruleBook.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">update</span>(ruleBook);
     * </pre>
     * @param ruleBook The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(DbRuleBook ruleBook) {
        doUpdate(ruleBook, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param ruleBook The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(DbRuleBook ruleBook) {
        doInsertOrUpdate(ruleBook, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * DbRuleBook ruleBook = <span style="color: #70226C">new</span> DbRuleBook();
     * ruleBook.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * ruleBook.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">delete</span>(ruleBook);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param ruleBook The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(DbRuleBook ruleBook) {
        doDelete(ruleBook, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     DbRuleBook ruleBook = <span style="color: #70226C">new</span> DbRuleBook();
     *     ruleBook.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         ruleBook.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     ruleBookList.add(ruleBook);
     * }
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">batchInsert</span>(ruleBookList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param ruleBookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<DbRuleBook> ruleBookList) {
        return doBatchInsert(ruleBookList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbRuleBook ruleBook = <span style="color: #70226C">new</span> DbRuleBook();
     *     ruleBook.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         ruleBook.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         ruleBook.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//ruleBook.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     ruleBookList.add(ruleBook);
     * }
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">batchUpdate</span>(ruleBookList);
     * </pre>
     * @param ruleBookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<DbRuleBook> ruleBookList) {
        return doBatchUpdate(ruleBookList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param ruleBookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<DbRuleBook> ruleBookList) {
        return doBatchDelete(ruleBookList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;DbRuleBook, DbRuleBookCB&gt;() {
     *     public ConditionBean setup(DbRuleBook entity, DbRuleBookCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<DbRuleBook, DbRuleBookCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbRuleBook ruleBook = <span style="color: #70226C">new</span> DbRuleBook();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//ruleBook.setPK...(value);</span>
     * ruleBook.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//ruleBook.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//ruleBook.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//ruleBook.setVersionNo(value);</span>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">queryUpdate</span>(ruleBook, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param ruleBook The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(DbRuleBook ruleBook, CBCall<DbRuleBookCB> cbLambda) {
        return doQueryUpdate(ruleBook, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">queryDelete</span>(ruleBook, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<DbRuleBookCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * DbRuleBook ruleBook = <span style="color: #70226C">new</span> DbRuleBook();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * ruleBook.setFoo...(value);
     * ruleBook.setBar...(value);
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">varyingInsert</span>(ruleBook, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = ruleBook.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param ruleBook The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(DbRuleBook ruleBook, WritableOptionCall<DbRuleBookCB, InsertOption<DbRuleBookCB>> opLambda) {
        doInsert(ruleBook, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * DbRuleBook ruleBook = <span style="color: #70226C">new</span> DbRuleBook();
     * ruleBook.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * ruleBook.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * ruleBook.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(ruleBook, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param ruleBook The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(DbRuleBook ruleBook, WritableOptionCall<DbRuleBookCB, UpdateOption<DbRuleBookCB>> opLambda) {
        doUpdate(ruleBook, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param ruleBook The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(DbRuleBook ruleBook, WritableOptionCall<DbRuleBookCB, InsertOption<DbRuleBookCB>> insertOpLambda, WritableOptionCall<DbRuleBookCB, UpdateOption<DbRuleBookCB>> updateOpLambda) {
        doInsertOrUpdate(ruleBook, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param ruleBook The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(DbRuleBook ruleBook, WritableOptionCall<DbRuleBookCB, DeleteOption<DbRuleBookCB>> opLambda) {
        doDelete(ruleBook, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param ruleBookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<DbRuleBook> ruleBookList, WritableOptionCall<DbRuleBookCB, InsertOption<DbRuleBookCB>> opLambda) {
        return doBatchInsert(ruleBookList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param ruleBookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<DbRuleBook> ruleBookList, WritableOptionCall<DbRuleBookCB, UpdateOption<DbRuleBookCB>> opLambda) {
        return doBatchUpdate(ruleBookList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param ruleBookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<DbRuleBook> ruleBookList, WritableOptionCall<DbRuleBookCB, DeleteOption<DbRuleBookCB>> opLambda) {
        return doBatchDelete(ruleBookList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<DbRuleBook, DbRuleBookCB> manyArgLambda, WritableOptionCall<DbRuleBookCB, InsertOption<DbRuleBookCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DbRuleBook ruleBook = <span style="color: #70226C">new</span> DbRuleBook();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//ruleBook.setPK...(value);</span>
     * ruleBook.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//ruleBook.setVersionNo(value);</span>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(ruleBook, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param ruleBook The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(DbRuleBook ruleBook, CBCall<DbRuleBookCB> cbLambda, WritableOptionCall<DbRuleBookCB, UpdateOption<DbRuleBookCB>> opLambda) {
        return doQueryUpdate(ruleBook, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #CC4747">queryDelete</span>(ruleBook, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbRuleBook. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<DbRuleBookCB> cbLambda, WritableOptionCall<DbRuleBookCB, DeleteOption<DbRuleBookCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * ruleBookBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * ruleBookBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * ruleBookBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * ruleBookBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * ruleBookBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * ruleBookBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * ruleBookBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * ruleBookBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * ruleBookBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * ruleBookBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * ruleBookBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * ruleBookBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * ruleBookBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * ruleBookBhv.outideSql().removeBlockComment().selectList()
     * ruleBookBhv.outideSql().removeLineComment().selectList()
     * ruleBookBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<DbRuleBookBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends DbRuleBook> typeOfSelectedEntity() { return DbRuleBook.class; }
    protected Class<DbRuleBook> typeOfHandlingEntity() { return DbRuleBook.class; }
    protected Class<DbRuleBookCB> typeOfHandlingConditionBean() { return DbRuleBookCB.class; }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    @Override
    @javax.annotation.Resource(name="dbBehaviorCommandInvoker")
    public void setBehaviorCommandInvoker(BehaviorCommandInvoker behaviorCommandInvoker) {
        super.setBehaviorCommandInvoker(behaviorCommandInvoker);
    }

    @Override
    @javax.annotation.Resource(name="dbBehaviorSelector")
    public void setBehaviorSelector(BehaviorSelector behaviorSelector) {
        super.setBehaviorSelector(behaviorSelector);
    }

    @Override
    @javax.annotation.Resource(name="dbCommonColumnAutoSetupper")
    public void setCommonColumnAutoSetupper(CommonColumnAutoSetupper commonColumnAutoSetupper) {
        super.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
    }
}
