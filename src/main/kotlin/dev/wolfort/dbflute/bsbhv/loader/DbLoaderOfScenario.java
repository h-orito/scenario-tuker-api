package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of SCENARIO as TABLE. <br>
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
public class DbLoaderOfScenario {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbScenario> _selectedList;
    protected BehaviorSelector _selector;
    protected DbScenarioBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfScenario ready(List<DbScenario> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbScenarioBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbScenarioBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbParticipate> _referrerParticipate;

    /**
     * Load referrer of participateList by the set-upper of referrer. <br>
     * PARTICIPATE by scenario_id, named 'participateList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">scenarioLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">scenarioLoader</span>.<span style="color: #CC4747">loadParticipate</span>(<span style="color: #553000">participateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">participateCB</span>.setupSelect...
     *         <span style="color: #553000">participateCB</span>.query().set...
     *         <span style="color: #553000">participateCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">participateLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    participateLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getParticipateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfParticipate> loadParticipate(ReferrerConditionSetupper<DbParticipateCB> refCBLambda) {
        myBhv().loadParticipate(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerParticipate = refLs);
        return hd -> hd.handle(new DbLoaderOfParticipate().ready(_referrerParticipate, _selector));
    }

    protected List<DbScenarioAuthor> _referrerScenarioAuthor;

    /**
     * Load referrer of scenarioAuthorList by the set-upper of referrer. <br>
     * SCENARIO_AUTHOR by scenario_id, named 'scenarioAuthorList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">scenarioLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">scenarioLoader</span>.<span style="color: #CC4747">loadScenarioAuthor</span>(<span style="color: #553000">authorCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">authorCB</span>.setupSelect...
     *         <span style="color: #553000">authorCB</span>.query().set...
     *         <span style="color: #553000">authorCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">authorLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    authorLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getScenarioAuthorList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfScenarioAuthor> loadScenarioAuthor(ReferrerConditionSetupper<DbScenarioAuthorCB> refCBLambda) {
        myBhv().loadScenarioAuthor(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerScenarioAuthor = refLs);
        return hd -> hd.handle(new DbLoaderOfScenarioAuthor().ready(_referrerScenarioAuthor, _selector));
    }

    protected List<DbScenarioDictionary> _referrerScenarioDictionary;

    /**
     * Load referrer of scenarioDictionaryList by the set-upper of referrer. <br>
     * SCENARIO_DICTIONARY by scenario_id, named 'scenarioDictionaryList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">scenarioLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">scenarioLoader</span>.<span style="color: #CC4747">loadScenarioDictionary</span>(<span style="color: #553000">dictionaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dictionaryCB</span>.setupSelect...
     *         <span style="color: #553000">dictionaryCB</span>.query().set...
     *         <span style="color: #553000">dictionaryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dictionaryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dictionaryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getScenarioDictionaryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfScenarioDictionary> loadScenarioDictionary(ReferrerConditionSetupper<DbScenarioDictionaryCB> refCBLambda) {
        myBhv().loadScenarioDictionary(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerScenarioDictionary = refLs);
        return hd -> hd.handle(new DbLoaderOfScenarioDictionary().ready(_referrerScenarioDictionary, _selector));
    }

    protected List<DbScenarioGameSystem> _referrerScenarioGameSystem;

    /**
     * Load referrer of scenarioGameSystemList by the set-upper of referrer. <br>
     * SCENARIO_GAME_SYSTEM by scenario_id, named 'scenarioGameSystemList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">scenarioLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">scenarioLoader</span>.<span style="color: #CC4747">loadScenarioGameSystem</span>(<span style="color: #553000">systemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">systemCB</span>.setupSelect...
     *         <span style="color: #553000">systemCB</span>.query().set...
     *         <span style="color: #553000">systemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">systemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    systemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getScenarioGameSystemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfScenarioGameSystem> loadScenarioGameSystem(ReferrerConditionSetupper<DbScenarioGameSystemCB> refCBLambda) {
        myBhv().loadScenarioGameSystem(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerScenarioGameSystem = refLs);
        return hd -> hd.handle(new DbLoaderOfScenarioGameSystem().ready(_referrerScenarioGameSystem, _selector));
    }

    protected List<DbUserScenario> _referrerUserScenario;

    /**
     * Load referrer of userScenarioList by the set-upper of referrer. <br>
     * USER_SCENARIO by scenario_id, named 'userScenarioList'.
     * <pre>
     * <span style="color: #0000C0">scenarioBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">scenarioList</span>, <span style="color: #553000">scenarioLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">scenarioLoader</span>.<span style="color: #CC4747">loadUserScenario</span>(<span style="color: #553000">scenarioCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">scenarioCB</span>.setupSelect...
     *         <span style="color: #553000">scenarioCB</span>.query().set...
     *         <span style="color: #553000">scenarioCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">scenarioLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    scenarioLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbScenario scenario : <span style="color: #553000">scenarioList</span>) {
     *     ... = scenario.<span style="color: #CC4747">getUserScenarioList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScenarioId_InScope(pkList);
     * cb.query().addOrderBy_ScenarioId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfUserScenario> loadUserScenario(ReferrerConditionSetupper<DbUserScenarioCB> refCBLambda) {
        myBhv().loadUserScenario(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserScenario = refLs);
        return hd -> hd.handle(new DbLoaderOfUserScenario().ready(_referrerUserScenario, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbScenario> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
