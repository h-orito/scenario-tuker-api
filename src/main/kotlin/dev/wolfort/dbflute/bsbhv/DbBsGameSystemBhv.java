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
 * The behavior of GAME_SYSTEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_system_id
 *
 * [column]
 *     game_system_id, game_system_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_system_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     GAME_SYSTEM_DICTIONARY, PARTICIPATE, RULE_BOOK, SCENARIO_GAME_SYSTEM
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     gameSystemDictionaryList, participateList, ruleBookList, scenarioGameSystemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGameSystemBhv extends AbstractBehaviorWritable<DbGameSystem, DbGameSystemCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DbGameSystemDbm asDBMeta() { return DbGameSystemDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "game_system"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public DbGameSystemCB newConditionBean() { return new DbGameSystemCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<DbGameSystemCB> cbLambda) {
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
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">gameSystem</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">gameSystem</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">gameSystem</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">gameSystem</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGameSystem> selectEntity(CBCall<DbGameSystemCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<DbGameSystem> facadeSelectEntity(DbGameSystemCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGameSystem> OptionalEntity<ENTITY> doSelectOptionalEntity(DbGameSystemCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * DbGameSystem <span style="color: #553000">gameSystem</span> = <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">gameSystem</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public DbGameSystem selectEntityWithDeletedCheck(CBCall<DbGameSystemCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param gameSystemId : PK, ID, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGameSystem> selectByPK(Integer gameSystemId) {
        return facadeSelectByPK(gameSystemId);
    }

    protected OptionalEntity<DbGameSystem> facadeSelectByPK(Integer gameSystemId) {
        return doSelectOptionalByPK(gameSystemId, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGameSystem> ENTITY doSelectByPK(Integer gameSystemId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(gameSystemId), tp);
    }

    protected <ENTITY extends DbGameSystem> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer gameSystemId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(gameSystemId, tp), gameSystemId);
    }

    protected DbGameSystemCB xprepareCBAsPK(Integer gameSystemId) {
        assertObjectNotNull("gameSystemId", gameSystemId);
        return newConditionBean().acceptPK(gameSystemId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;DbGameSystem&gt; <span style="color: #553000">gameSystemList</span> = <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (DbGameSystem <span style="color: #553000">gameSystem</span> : <span style="color: #553000">gameSystemList</span>) {
     *     ... = <span style="color: #553000">gameSystem</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<DbGameSystem> selectList(CBCall<DbGameSystemCB> cbLambda) {
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
     * PagingResultBean&lt;DbGameSystem&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (DbGameSystem gameSystem : <span style="color: #553000">page</span>) {
     *     ... = gameSystem.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<DbGameSystem> selectPage(CBCall<DbGameSystemCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @param entityLambda The handler of entity row of DbGameSystem. (NotNull)
     */
    public void selectCursor(CBCall<DbGameSystemCB> cbLambda, EntityRowHandler<DbGameSystem> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<DbGameSystemCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param gameSystemList The entity list of gameSystem. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<DbGameSystem> gameSystemList, ReferrerLoaderHandler<DbLoaderOfGameSystem> loaderLambda) {
        xassLRArg(gameSystemList, loaderLambda);
        loaderLambda.handle(new DbLoaderOfGameSystem().ready(gameSystemList, _behaviorSelector));
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
     * @param gameSystem The entity of gameSystem. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(DbGameSystem gameSystem, ReferrerLoaderHandler<DbLoaderOfGameSystem> loaderLambda) {
        xassLRArg(gameSystem, loaderLambda);
        loaderLambda.handle(new DbLoaderOfGameSystem().ready(xnewLRAryLs(gameSystem), _behaviorSelector));
    }

    /**
     * Load referrer of gameSystemDictionaryList by the set-upper of referrer. <br>
     * GAME_SYSTEM_DICTIONARY by game_system_id, named 'gameSystemDictionaryList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">loadGameSystemDictionary</span>(<span style="color: #553000">gameSystemList</span>, <span style="color: #553000">dictionaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictionaryCB</span>.setupSelect...
     *     <span style="color: #553000">dictionaryCB</span>.query().set...
     *     <span style="color: #553000">dictionaryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGameSystem gameSystem : <span style="color: #553000">gameSystemList</span>) {
     *     ... = gameSystem.<span style="color: #CC4747">getGameSystemDictionaryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param gameSystemList The entity list of gameSystem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGameSystemDictionary> loadGameSystemDictionary(List<DbGameSystem> gameSystemList, ReferrerConditionSetupper<DbGameSystemDictionaryCB> refCBLambda) {
        xassLRArg(gameSystemList, refCBLambda);
        return doLoadGameSystemDictionary(gameSystemList, new LoadReferrerOption<DbGameSystemDictionaryCB, DbGameSystemDictionary>().xinit(refCBLambda));
    }

    /**
     * Load referrer of gameSystemDictionaryList by the set-upper of referrer. <br>
     * GAME_SYSTEM_DICTIONARY by game_system_id, named 'gameSystemDictionaryList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">loadGameSystemDictionary</span>(<span style="color: #553000">gameSystem</span>, <span style="color: #553000">dictionaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictionaryCB</span>.setupSelect...
     *     <span style="color: #553000">dictionaryCB</span>.query().set...
     *     <span style="color: #553000">dictionaryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">gameSystem</span>.<span style="color: #CC4747">getGameSystemDictionaryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param gameSystem The entity of gameSystem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGameSystemDictionary> loadGameSystemDictionary(DbGameSystem gameSystem, ReferrerConditionSetupper<DbGameSystemDictionaryCB> refCBLambda) {
        xassLRArg(gameSystem, refCBLambda);
        return doLoadGameSystemDictionary(xnewLRLs(gameSystem), new LoadReferrerOption<DbGameSystemDictionaryCB, DbGameSystemDictionary>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbGameSystemDictionary> doLoadGameSystemDictionary(List<DbGameSystem> gameSystemList, LoadReferrerOption<DbGameSystemDictionaryCB, DbGameSystemDictionary> option) {
        return helpLoadReferrerInternally(gameSystemList, option, "gameSystemDictionaryList");
    }

    /**
     * Load referrer of participateList by the set-upper of referrer. <br>
     * PARTICIPATE by game_system_id, named 'participateList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">loadParticipate</span>(<span style="color: #553000">gameSystemList</span>, <span style="color: #553000">participateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">participateCB</span>.setupSelect...
     *     <span style="color: #553000">participateCB</span>.query().set...
     *     <span style="color: #553000">participateCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGameSystem gameSystem : <span style="color: #553000">gameSystemList</span>) {
     *     ... = gameSystem.<span style="color: #CC4747">getParticipateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param gameSystemList The entity list of gameSystem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbParticipate> loadParticipate(List<DbGameSystem> gameSystemList, ReferrerConditionSetupper<DbParticipateCB> refCBLambda) {
        xassLRArg(gameSystemList, refCBLambda);
        return doLoadParticipate(gameSystemList, new LoadReferrerOption<DbParticipateCB, DbParticipate>().xinit(refCBLambda));
    }

    /**
     * Load referrer of participateList by the set-upper of referrer. <br>
     * PARTICIPATE by game_system_id, named 'participateList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">loadParticipate</span>(<span style="color: #553000">gameSystem</span>, <span style="color: #553000">participateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">participateCB</span>.setupSelect...
     *     <span style="color: #553000">participateCB</span>.query().set...
     *     <span style="color: #553000">participateCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">gameSystem</span>.<span style="color: #CC4747">getParticipateList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param gameSystem The entity of gameSystem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbParticipate> loadParticipate(DbGameSystem gameSystem, ReferrerConditionSetupper<DbParticipateCB> refCBLambda) {
        xassLRArg(gameSystem, refCBLambda);
        return doLoadParticipate(xnewLRLs(gameSystem), new LoadReferrerOption<DbParticipateCB, DbParticipate>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbParticipate> doLoadParticipate(List<DbGameSystem> gameSystemList, LoadReferrerOption<DbParticipateCB, DbParticipate> option) {
        return helpLoadReferrerInternally(gameSystemList, option, "participateList");
    }

    /**
     * Load referrer of ruleBookList by the set-upper of referrer. <br>
     * RULE_BOOK by game_system_id, named 'ruleBookList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">loadRuleBook</span>(<span style="color: #553000">gameSystemList</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGameSystem gameSystem : <span style="color: #553000">gameSystemList</span>) {
     *     ... = gameSystem.<span style="color: #CC4747">getRuleBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param gameSystemList The entity list of gameSystem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbRuleBook> loadRuleBook(List<DbGameSystem> gameSystemList, ReferrerConditionSetupper<DbRuleBookCB> refCBLambda) {
        xassLRArg(gameSystemList, refCBLambda);
        return doLoadRuleBook(gameSystemList, new LoadReferrerOption<DbRuleBookCB, DbRuleBook>().xinit(refCBLambda));
    }

    /**
     * Load referrer of ruleBookList by the set-upper of referrer. <br>
     * RULE_BOOK by game_system_id, named 'ruleBookList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">loadRuleBook</span>(<span style="color: #553000">gameSystem</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">gameSystem</span>.<span style="color: #CC4747">getRuleBookList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param gameSystem The entity of gameSystem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbRuleBook> loadRuleBook(DbGameSystem gameSystem, ReferrerConditionSetupper<DbRuleBookCB> refCBLambda) {
        xassLRArg(gameSystem, refCBLambda);
        return doLoadRuleBook(xnewLRLs(gameSystem), new LoadReferrerOption<DbRuleBookCB, DbRuleBook>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbRuleBook> doLoadRuleBook(List<DbGameSystem> gameSystemList, LoadReferrerOption<DbRuleBookCB, DbRuleBook> option) {
        return helpLoadReferrerInternally(gameSystemList, option, "ruleBookList");
    }

    /**
     * Load referrer of scenarioGameSystemList by the set-upper of referrer. <br>
     * SCENARIO_GAME_SYSTEM by game_system_id, named 'scenarioGameSystemList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">loadScenarioGameSystem</span>(<span style="color: #553000">gameSystemList</span>, <span style="color: #553000">systemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemCB</span>.setupSelect...
     *     <span style="color: #553000">systemCB</span>.query().set...
     *     <span style="color: #553000">systemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGameSystem gameSystem : <span style="color: #553000">gameSystemList</span>) {
     *     ... = gameSystem.<span style="color: #CC4747">getScenarioGameSystemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param gameSystemList The entity list of gameSystem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbScenarioGameSystem> loadScenarioGameSystem(List<DbGameSystem> gameSystemList, ReferrerConditionSetupper<DbScenarioGameSystemCB> refCBLambda) {
        xassLRArg(gameSystemList, refCBLambda);
        return doLoadScenarioGameSystem(gameSystemList, new LoadReferrerOption<DbScenarioGameSystemCB, DbScenarioGameSystem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of scenarioGameSystemList by the set-upper of referrer. <br>
     * SCENARIO_GAME_SYSTEM by game_system_id, named 'scenarioGameSystemList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">loadScenarioGameSystem</span>(<span style="color: #553000">gameSystem</span>, <span style="color: #553000">systemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemCB</span>.setupSelect...
     *     <span style="color: #553000">systemCB</span>.query().set...
     *     <span style="color: #553000">systemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">gameSystem</span>.<span style="color: #CC4747">getScenarioGameSystemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param gameSystem The entity of gameSystem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbScenarioGameSystem> loadScenarioGameSystem(DbGameSystem gameSystem, ReferrerConditionSetupper<DbScenarioGameSystemCB> refCBLambda) {
        xassLRArg(gameSystem, refCBLambda);
        return doLoadScenarioGameSystem(xnewLRLs(gameSystem), new LoadReferrerOption<DbScenarioGameSystemCB, DbScenarioGameSystem>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbScenarioGameSystem> doLoadScenarioGameSystem(List<DbGameSystem> gameSystemList, LoadReferrerOption<DbScenarioGameSystemCB, DbScenarioGameSystem> option) {
        return helpLoadReferrerInternally(gameSystemList, option, "scenarioGameSystemList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key gameSystemId.
     * @param gameSystemList The list of gameSystem. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractGameSystemIdList(List<DbGameSystem> gameSystemList)
    { return helpExtractListInternally(gameSystemList, "gameSystemId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbGameSystem gameSystem = <span style="color: #70226C">new</span> DbGameSystem();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * gameSystem.setFoo...(value);
     * gameSystem.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//gameSystem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//gameSystem.set...;</span>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">insert</span>(gameSystem);
     * ... = gameSystem.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param gameSystem The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(DbGameSystem gameSystem) {
        doInsert(gameSystem, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * DbGameSystem gameSystem = <span style="color: #70226C">new</span> DbGameSystem();
     * gameSystem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * gameSystem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//gameSystem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//gameSystem.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * gameSystem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">update</span>(gameSystem);
     * </pre>
     * @param gameSystem The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(DbGameSystem gameSystem) {
        doUpdate(gameSystem, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param gameSystem The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(DbGameSystem gameSystem) {
        doInsertOrUpdate(gameSystem, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * DbGameSystem gameSystem = <span style="color: #70226C">new</span> DbGameSystem();
     * gameSystem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * gameSystem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">delete</span>(gameSystem);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param gameSystem The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(DbGameSystem gameSystem) {
        doDelete(gameSystem, null);
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
     *     DbGameSystem gameSystem = <span style="color: #70226C">new</span> DbGameSystem();
     *     gameSystem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         gameSystem.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     gameSystemList.add(gameSystem);
     * }
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">batchInsert</span>(gameSystemList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param gameSystemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<DbGameSystem> gameSystemList) {
        return doBatchInsert(gameSystemList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbGameSystem gameSystem = <span style="color: #70226C">new</span> DbGameSystem();
     *     gameSystem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         gameSystem.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         gameSystem.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//gameSystem.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     gameSystemList.add(gameSystem);
     * }
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(gameSystemList);
     * </pre>
     * @param gameSystemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<DbGameSystem> gameSystemList) {
        return doBatchUpdate(gameSystemList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param gameSystemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<DbGameSystem> gameSystemList) {
        return doBatchDelete(gameSystemList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;DbGameSystem, DbGameSystemCB&gt;() {
     *     public ConditionBean setup(DbGameSystem entity, DbGameSystemCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<DbGameSystem, DbGameSystemCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbGameSystem gameSystem = <span style="color: #70226C">new</span> DbGameSystem();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//gameSystem.setPK...(value);</span>
     * gameSystem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//gameSystem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//gameSystem.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//gameSystem.setVersionNo(value);</span>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">queryUpdate</span>(gameSystem, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param gameSystem The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(DbGameSystem gameSystem, CBCall<DbGameSystemCB> cbLambda) {
        return doQueryUpdate(gameSystem, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">queryDelete</span>(gameSystem, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<DbGameSystemCB> cbLambda) {
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
     * DbGameSystem gameSystem = <span style="color: #70226C">new</span> DbGameSystem();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * gameSystem.setFoo...(value);
     * gameSystem.setBar...(value);
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">varyingInsert</span>(gameSystem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = gameSystem.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param gameSystem The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(DbGameSystem gameSystem, WritableOptionCall<DbGameSystemCB, InsertOption<DbGameSystemCB>> opLambda) {
        doInsert(gameSystem, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * DbGameSystem gameSystem = <span style="color: #70226C">new</span> DbGameSystem();
     * gameSystem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * gameSystem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * gameSystem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(gameSystem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param gameSystem The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(DbGameSystem gameSystem, WritableOptionCall<DbGameSystemCB, UpdateOption<DbGameSystemCB>> opLambda) {
        doUpdate(gameSystem, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param gameSystem The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(DbGameSystem gameSystem, WritableOptionCall<DbGameSystemCB, InsertOption<DbGameSystemCB>> insertOpLambda, WritableOptionCall<DbGameSystemCB, UpdateOption<DbGameSystemCB>> updateOpLambda) {
        doInsertOrUpdate(gameSystem, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param gameSystem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(DbGameSystem gameSystem, WritableOptionCall<DbGameSystemCB, DeleteOption<DbGameSystemCB>> opLambda) {
        doDelete(gameSystem, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param gameSystemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<DbGameSystem> gameSystemList, WritableOptionCall<DbGameSystemCB, InsertOption<DbGameSystemCB>> opLambda) {
        return doBatchInsert(gameSystemList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param gameSystemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<DbGameSystem> gameSystemList, WritableOptionCall<DbGameSystemCB, UpdateOption<DbGameSystemCB>> opLambda) {
        return doBatchUpdate(gameSystemList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param gameSystemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<DbGameSystem> gameSystemList, WritableOptionCall<DbGameSystemCB, DeleteOption<DbGameSystemCB>> opLambda) {
        return doBatchDelete(gameSystemList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<DbGameSystem, DbGameSystemCB> manyArgLambda, WritableOptionCall<DbGameSystemCB, InsertOption<DbGameSystemCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DbGameSystem gameSystem = <span style="color: #70226C">new</span> DbGameSystem();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//gameSystem.setPK...(value);</span>
     * gameSystem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//gameSystem.setVersionNo(value);</span>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(gameSystem, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param gameSystem The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(DbGameSystem gameSystem, CBCall<DbGameSystemCB> cbLambda, WritableOptionCall<DbGameSystemCB, UpdateOption<DbGameSystemCB>> opLambda) {
        return doQueryUpdate(gameSystem, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #CC4747">queryDelete</span>(gameSystem, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGameSystem. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<DbGameSystemCB> cbLambda, WritableOptionCall<DbGameSystemCB, DeleteOption<DbGameSystemCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * gameSystemBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * gameSystemBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * gameSystemBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * gameSystemBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * gameSystemBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * gameSystemBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * gameSystemBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * gameSystemBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * gameSystemBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * gameSystemBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * gameSystemBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * gameSystemBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * gameSystemBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * gameSystemBhv.outideSql().removeBlockComment().selectList()
     * gameSystemBhv.outideSql().removeLineComment().selectList()
     * gameSystemBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<DbGameSystemBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends DbGameSystem> typeOfSelectedEntity() { return DbGameSystem.class; }
    protected Class<DbGameSystem> typeOfHandlingEntity() { return DbGameSystem.class; }
    protected Class<DbGameSystemCB> typeOfHandlingConditionBean() { return DbGameSystemCB.class; }

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
