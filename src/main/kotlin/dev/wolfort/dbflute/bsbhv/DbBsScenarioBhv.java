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
 * The behavior of SCENARIO as TABLE. <br>
 * <pre>
 * [primary key]
 *     scenario_id
 *
 * [column]
 *     scenario_id, scenario_name, scenario_type, scenario_url, game_master_requirement, player_num_min, player_num_max, required_hours, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     scenario_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     PARTICIPATE, SCENARIO_AUTHOR, SCENARIO_DICTIONARY, SCENARIO_GAME_SYSTEM, USER_SCENARIO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     participateList, scenarioAuthorList, scenarioDictionaryList, scenarioGameSystemList, userScenarioList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsScenarioBhv extends AbstractBehaviorWritable<DbScenario, DbScenarioCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DbScenarioDbm asDBMeta() { return DbScenarioDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "scenario"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public DbScenarioCB newConditionBean() { return new DbScenarioCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<DbScenarioCB> cbLambda) {
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
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">scenario</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">scenario</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">scenario</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">scenario</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbScenario> selectEntity(CBCall<DbScenarioCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<DbScenario> facadeSelectEntity(DbScenarioCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbScenario> OptionalEntity<ENTITY> doSelectOptionalEntity(DbScenarioCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * DbScenario <span style="color: #553000">scenario</span> = <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">scenario</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public DbScenario selectEntityWithDeletedCheck(CBCall<DbScenarioCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param scenarioId : PK, ID, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbScenario> selectByPK(Integer scenarioId) {
        return facadeSelectByPK(scenarioId);
    }

    protected OptionalEntity<DbScenario> facadeSelectByPK(Integer scenarioId) {
        return doSelectOptionalByPK(scenarioId, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbScenario> ENTITY doSelectByPK(Integer scenarioId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(scenarioId), tp);
    }

    protected <ENTITY extends DbScenario> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer scenarioId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(scenarioId, tp), scenarioId);
    }

    protected DbScenarioCB xprepareCBAsPK(Integer scenarioId) {
        assertObjectNotNull("scenarioId", scenarioId);
        return newConditionBean().acceptPK(scenarioId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;DbScenario&gt; <span style="color: #553000">scenarioList</span> = <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (DbScenario <span style="color: #553000">scenario</span> : <span style="color: #553000">scenarioList</span>) {
     *     ... = <span style="color: #553000">scenario</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<DbScenario> selectList(CBCall<DbScenarioCB> cbLambda) {
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
     * PagingResultBean&lt;DbScenario&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (DbScenario scenario : <span style="color: #553000">page</span>) {
     *     ... = scenario.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<DbScenario> selectPage(CBCall<DbScenarioCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @param entityLambda The handler of entity row of DbScenario. (NotNull)
     */
    public void selectCursor(CBCall<DbScenarioCB> cbLambda, EntityRowHandler<DbScenario> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<DbScenarioCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param scenarioList The entity list of scenario. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<DbScenario> scenarioList, ReferrerLoaderHandler<DbLoaderOfScenario> loaderLambda) {
        xassLRArg(scenarioList, loaderLambda);
        loaderLambda.handle(new DbLoaderOfScenario().ready(scenarioList, _behaviorSelector));
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
     * @param scenario The entity of scenario. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(DbScenario scenario, ReferrerLoaderHandler<DbLoaderOfScenario> loaderLambda) {
        xassLRArg(scenario, loaderLambda);
        loaderLambda.handle(new DbLoaderOfScenario().ready(xnewLRAryLs(scenario), _behaviorSelector));
    }

    /**
     * Load referrer of participateList by the set-upper of referrer. <br>
     * PARTICIPATE by scenario_id, named 'participateList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadParticipate</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">participateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">participateCB</span>.setupSelect...
     *     <span style="color: #553000">participateCB</span>.query().set...
     *     <span style="color: #553000">participateCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getParticipateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenarioList The entity list of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbParticipate> loadParticipate(List<DbScenario> scenarioList, ReferrerConditionSetupper<DbParticipateCB> refCBLambda) {
        xassLRArg(scenarioList, refCBLambda);
        return doLoadParticipate(scenarioList, new LoadReferrerOption<DbParticipateCB, DbParticipate>().xinit(refCBLambda));
    }

    /**
     * Load referrer of participateList by the set-upper of referrer. <br>
     * PARTICIPATE by scenario_id, named 'participateList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadParticipate</span>(<span style="color: #553000">scenario</span>, <span style="color: #553000">participateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">participateCB</span>.setupSelect...
     *     <span style="color: #553000">participateCB</span>.query().set...
     *     <span style="color: #553000">participateCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">scenario</span>.<span style="color: #CC4747">getParticipateList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenario The entity of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbParticipate> loadParticipate(DbScenario scenario, ReferrerConditionSetupper<DbParticipateCB> refCBLambda) {
        xassLRArg(scenario, refCBLambda);
        return doLoadParticipate(xnewLRLs(scenario), new LoadReferrerOption<DbParticipateCB, DbParticipate>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbParticipate> doLoadParticipate(List<DbScenario> scenarioList, LoadReferrerOption<DbParticipateCB, DbParticipate> option) {
        return helpLoadReferrerInternally(scenarioList, option, "participateList");
    }

    /**
     * Load referrer of scenarioAuthorList by the set-upper of referrer. <br>
     * SCENARIO_AUTHOR by scenario_id, named 'scenarioAuthorList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadScenarioAuthor</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">authorCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">authorCB</span>.setupSelect...
     *     <span style="color: #553000">authorCB</span>.query().set...
     *     <span style="color: #553000">authorCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getScenarioAuthorList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenarioList The entity list of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbScenarioAuthor> loadScenarioAuthor(List<DbScenario> scenarioList, ReferrerConditionSetupper<DbScenarioAuthorCB> refCBLambda) {
        xassLRArg(scenarioList, refCBLambda);
        return doLoadScenarioAuthor(scenarioList, new LoadReferrerOption<DbScenarioAuthorCB, DbScenarioAuthor>().xinit(refCBLambda));
    }

    /**
     * Load referrer of scenarioAuthorList by the set-upper of referrer. <br>
     * SCENARIO_AUTHOR by scenario_id, named 'scenarioAuthorList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadScenarioAuthor</span>(<span style="color: #553000">scenario</span>, <span style="color: #553000">authorCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">authorCB</span>.setupSelect...
     *     <span style="color: #553000">authorCB</span>.query().set...
     *     <span style="color: #553000">authorCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">scenario</span>.<span style="color: #CC4747">getScenarioAuthorList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenario The entity of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbScenarioAuthor> loadScenarioAuthor(DbScenario scenario, ReferrerConditionSetupper<DbScenarioAuthorCB> refCBLambda) {
        xassLRArg(scenario, refCBLambda);
        return doLoadScenarioAuthor(xnewLRLs(scenario), new LoadReferrerOption<DbScenarioAuthorCB, DbScenarioAuthor>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbScenarioAuthor> doLoadScenarioAuthor(List<DbScenario> scenarioList, LoadReferrerOption<DbScenarioAuthorCB, DbScenarioAuthor> option) {
        return helpLoadReferrerInternally(scenarioList, option, "scenarioAuthorList");
    }

    /**
     * Load referrer of scenarioDictionaryList by the set-upper of referrer. <br>
     * SCENARIO_DICTIONARY by scenario_id, named 'scenarioDictionaryList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadScenarioDictionary</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">dictionaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictionaryCB</span>.setupSelect...
     *     <span style="color: #553000">dictionaryCB</span>.query().set...
     *     <span style="color: #553000">dictionaryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getScenarioDictionaryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenarioList The entity list of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbScenarioDictionary> loadScenarioDictionary(List<DbScenario> scenarioList, ReferrerConditionSetupper<DbScenarioDictionaryCB> refCBLambda) {
        xassLRArg(scenarioList, refCBLambda);
        return doLoadScenarioDictionary(scenarioList, new LoadReferrerOption<DbScenarioDictionaryCB, DbScenarioDictionary>().xinit(refCBLambda));
    }

    /**
     * Load referrer of scenarioDictionaryList by the set-upper of referrer. <br>
     * SCENARIO_DICTIONARY by scenario_id, named 'scenarioDictionaryList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadScenarioDictionary</span>(<span style="color: #553000">scenario</span>, <span style="color: #553000">dictionaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictionaryCB</span>.setupSelect...
     *     <span style="color: #553000">dictionaryCB</span>.query().set...
     *     <span style="color: #553000">dictionaryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">scenario</span>.<span style="color: #CC4747">getScenarioDictionaryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenario The entity of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbScenarioDictionary> loadScenarioDictionary(DbScenario scenario, ReferrerConditionSetupper<DbScenarioDictionaryCB> refCBLambda) {
        xassLRArg(scenario, refCBLambda);
        return doLoadScenarioDictionary(xnewLRLs(scenario), new LoadReferrerOption<DbScenarioDictionaryCB, DbScenarioDictionary>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbScenarioDictionary> doLoadScenarioDictionary(List<DbScenario> scenarioList, LoadReferrerOption<DbScenarioDictionaryCB, DbScenarioDictionary> option) {
        return helpLoadReferrerInternally(scenarioList, option, "scenarioDictionaryList");
    }

    /**
     * Load referrer of scenarioGameSystemList by the set-upper of referrer. <br>
     * SCENARIO_GAME_SYSTEM by scenario_id, named 'scenarioGameSystemList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadScenarioGameSystem</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">systemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemCB</span>.setupSelect...
     *     <span style="color: #553000">systemCB</span>.query().set...
     *     <span style="color: #553000">systemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getScenarioGameSystemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenarioList The entity list of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbScenarioGameSystem> loadScenarioGameSystem(List<DbScenario> scenarioList, ReferrerConditionSetupper<DbScenarioGameSystemCB> refCBLambda) {
        xassLRArg(scenarioList, refCBLambda);
        return doLoadScenarioGameSystem(scenarioList, new LoadReferrerOption<DbScenarioGameSystemCB, DbScenarioGameSystem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of scenarioGameSystemList by the set-upper of referrer. <br>
     * SCENARIO_GAME_SYSTEM by scenario_id, named 'scenarioGameSystemList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadScenarioGameSystem</span>(<span style="color: #553000">scenario</span>, <span style="color: #553000">systemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemCB</span>.setupSelect...
     *     <span style="color: #553000">systemCB</span>.query().set...
     *     <span style="color: #553000">systemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">scenario</span>.<span style="color: #CC4747">getScenarioGameSystemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenario The entity of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbScenarioGameSystem> loadScenarioGameSystem(DbScenario scenario, ReferrerConditionSetupper<DbScenarioGameSystemCB> refCBLambda) {
        xassLRArg(scenario, refCBLambda);
        return doLoadScenarioGameSystem(xnewLRLs(scenario), new LoadReferrerOption<DbScenarioGameSystemCB, DbScenarioGameSystem>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbScenarioGameSystem> doLoadScenarioGameSystem(List<DbScenario> scenarioList, LoadReferrerOption<DbScenarioGameSystemCB, DbScenarioGameSystem> option) {
        return helpLoadReferrerInternally(scenarioList, option, "scenarioGameSystemList");
    }

    /**
     * Load referrer of userScenarioList by the set-upper of referrer. <br>
     * USER_SCENARIO by scenario_id, named 'userScenarioList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadUserScenario</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">scenarioCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">scenarioCB</span>.setupSelect...
     *     <span style="color: #553000">scenarioCB</span>.query().set...
     *     <span style="color: #553000">scenarioCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getUserScenarioList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenarioList The entity list of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbUserScenario> loadUserScenario(List<DbScenario> scenarioList, ReferrerConditionSetupper<DbUserScenarioCB> refCBLambda) {
        xassLRArg(scenarioList, refCBLambda);
        return doLoadUserScenario(scenarioList, new LoadReferrerOption<DbUserScenarioCB, DbUserScenario>().xinit(refCBLambda));
    }

    /**
     * Load referrer of userScenarioList by the set-upper of referrer. <br>
     * USER_SCENARIO by scenario_id, named 'userScenarioList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">loadUserScenario</span>(<span style="color: #553000">scenario</span>, <span style="color: #553000">scenarioCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">scenarioCB</span>.setupSelect...
     *     <span style="color: #553000">scenarioCB</span>.query().set...
     *     <span style="color: #553000">scenarioCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">scenario</span>.<span style="color: #CC4747">getUserScenarioList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param scenario The entity of scenario. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbUserScenario> loadUserScenario(DbScenario scenario, ReferrerConditionSetupper<DbUserScenarioCB> refCBLambda) {
        xassLRArg(scenario, refCBLambda);
        return doLoadUserScenario(xnewLRLs(scenario), new LoadReferrerOption<DbUserScenarioCB, DbUserScenario>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbUserScenario> doLoadUserScenario(List<DbScenario> scenarioList, LoadReferrerOption<DbUserScenarioCB, DbUserScenario> option) {
        return helpLoadReferrerInternally(scenarioList, option, "userScenarioList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key scenarioId.
     * @param scenarioList The list of scenario. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractScenarioIdList(List<DbScenario> scenarioList)
    { return helpExtractListInternally(scenarioList, "scenarioId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbScenario scenario = <span style="color: #70226C">new</span> DbScenario();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * scenario.setFoo...(value);
     * scenario.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//scenario.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//scenario.set...;</span>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">insert</span>(scenario);
     * ... = scenario.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param scenario The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(DbScenario scenario) {
        doInsert(scenario, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * DbScenario scenario = <span style="color: #70226C">new</span> DbScenario();
     * scenario.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * scenario.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//scenario.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//scenario.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * scenario.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">update</span>(scenario);
     * </pre>
     * @param scenario The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(DbScenario scenario) {
        doUpdate(scenario, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param scenario The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(DbScenario scenario) {
        doInsertOrUpdate(scenario, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * DbScenario scenario = <span style="color: #70226C">new</span> DbScenario();
     * scenario.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * scenario.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">delete</span>(scenario);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param scenario The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(DbScenario scenario) {
        doDelete(scenario, null);
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
     *     DbScenario scenario = <span style="color: #70226C">new</span> DbScenario();
     *     scenario.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         scenario.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     scenarioList.add(scenario);
     * }
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">batchInsert</span>(scenarioList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param scenarioList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<DbScenario> scenarioList) {
        return doBatchInsert(scenarioList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbScenario scenario = <span style="color: #70226C">new</span> DbScenario();
     *     scenario.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         scenario.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         scenario.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//scenario.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     scenarioList.add(scenario);
     * }
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">batchUpdate</span>(scenarioList);
     * </pre>
     * @param scenarioList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<DbScenario> scenarioList) {
        return doBatchUpdate(scenarioList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param scenarioList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<DbScenario> scenarioList) {
        return doBatchDelete(scenarioList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;DbScenario, DbScenarioCB&gt;() {
     *     public ConditionBean setup(DbScenario entity, DbScenarioCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<DbScenario, DbScenarioCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbScenario scenario = <span style="color: #70226C">new</span> DbScenario();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//scenario.setPK...(value);</span>
     * scenario.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//scenario.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//scenario.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//scenario.setVersionNo(value);</span>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">queryUpdate</span>(scenario, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param scenario The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(DbScenario scenario, CBCall<DbScenarioCB> cbLambda) {
        return doQueryUpdate(scenario, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">queryDelete</span>(scenario, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<DbScenarioCB> cbLambda) {
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
     * DbScenario scenario = <span style="color: #70226C">new</span> DbScenario();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * scenario.setFoo...(value);
     * scenario.setBar...(value);
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">varyingInsert</span>(scenario, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = scenario.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param scenario The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(DbScenario scenario, WritableOptionCall<DbScenarioCB, InsertOption<DbScenarioCB>> opLambda) {
        doInsert(scenario, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * DbScenario scenario = <span style="color: #70226C">new</span> DbScenario();
     * scenario.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * scenario.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * scenario.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(scenario, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param scenario The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(DbScenario scenario, WritableOptionCall<DbScenarioCB, UpdateOption<DbScenarioCB>> opLambda) {
        doUpdate(scenario, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param scenario The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(DbScenario scenario, WritableOptionCall<DbScenarioCB, InsertOption<DbScenarioCB>> insertOpLambda, WritableOptionCall<DbScenarioCB, UpdateOption<DbScenarioCB>> updateOpLambda) {
        doInsertOrUpdate(scenario, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param scenario The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(DbScenario scenario, WritableOptionCall<DbScenarioCB, DeleteOption<DbScenarioCB>> opLambda) {
        doDelete(scenario, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param scenarioList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<DbScenario> scenarioList, WritableOptionCall<DbScenarioCB, InsertOption<DbScenarioCB>> opLambda) {
        return doBatchInsert(scenarioList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param scenarioList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<DbScenario> scenarioList, WritableOptionCall<DbScenarioCB, UpdateOption<DbScenarioCB>> opLambda) {
        return doBatchUpdate(scenarioList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param scenarioList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<DbScenario> scenarioList, WritableOptionCall<DbScenarioCB, DeleteOption<DbScenarioCB>> opLambda) {
        return doBatchDelete(scenarioList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<DbScenario, DbScenarioCB> manyArgLambda, WritableOptionCall<DbScenarioCB, InsertOption<DbScenarioCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DbScenario scenario = <span style="color: #70226C">new</span> DbScenario();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//scenario.setPK...(value);</span>
     * scenario.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//scenario.setVersionNo(value);</span>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(scenario, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param scenario The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(DbScenario scenario, CBCall<DbScenarioCB> cbLambda, WritableOptionCall<DbScenarioCB, UpdateOption<DbScenarioCB>> opLambda) {
        return doQueryUpdate(scenario, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #CC4747">queryDelete</span>(scenario, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbScenario. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<DbScenarioCB> cbLambda, WritableOptionCall<DbScenarioCB, DeleteOption<DbScenarioCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * scenarioBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * scenarioBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * scenarioBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * scenarioBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * scenarioBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * scenarioBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * scenarioBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * scenarioBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * scenarioBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * scenarioBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * scenarioBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * scenarioBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * scenarioBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * scenarioBhv.outideSql().removeBlockComment().selectList()
     * scenarioBhv.outideSql().removeLineComment().selectList()
     * scenarioBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<DbScenarioBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends DbScenario> typeOfSelectedEntity() { return DbScenario.class; }
    protected Class<DbScenario> typeOfHandlingEntity() { return DbScenario.class; }
    protected Class<DbScenarioCB> typeOfHandlingConditionBean() { return DbScenarioCB.class; }

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
