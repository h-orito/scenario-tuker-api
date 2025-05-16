package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of GAME_SYSTEM as TABLE. <br>
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
public class DbLoaderOfGameSystem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbGameSystem> _selectedList;
    protected BehaviorSelector _selector;
    protected DbGameSystemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfGameSystem ready(List<DbGameSystem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbGameSystemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbGameSystemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbGameSystemDictionary> _referrerGameSystemDictionary;

    /**
     * Load referrer of gameSystemDictionaryList by the set-upper of referrer. <br>
     * GAME_SYSTEM_DICTIONARY by game_system_id, named 'gameSystemDictionaryList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameSystemList</span>, <span style="color: #553000">systemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemLoader</span>.<span style="color: #CC4747">loadGameSystemDictionary</span>(<span style="color: #553000">dictionaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dictionaryCB</span>.setupSelect...
     *         <span style="color: #553000">dictionaryCB</span>.query().set...
     *         <span style="color: #553000">dictionaryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dictionaryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dictionaryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGameSystem gameSystem : <span style="color: #553000">gameSystemList</span>) {
     *     ... = gameSystem.<span style="color: #CC4747">getGameSystemDictionaryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfGameSystemDictionary> loadGameSystemDictionary(ReferrerConditionSetupper<DbGameSystemDictionaryCB> refCBLambda) {
        myBhv().loadGameSystemDictionary(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGameSystemDictionary = refLs);
        return hd -> hd.handle(new DbLoaderOfGameSystemDictionary().ready(_referrerGameSystemDictionary, _selector));
    }

    protected List<DbParticipate> _referrerParticipate;

    /**
     * Load referrer of participateList by the set-upper of referrer. <br>
     * PARTICIPATE by game_system_id, named 'participateList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameSystemList</span>, <span style="color: #553000">systemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemLoader</span>.<span style="color: #CC4747">loadParticipate</span>(<span style="color: #553000">participateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">participateCB</span>.setupSelect...
     *         <span style="color: #553000">participateCB</span>.query().set...
     *         <span style="color: #553000">participateCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">participateLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    participateLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGameSystem gameSystem : <span style="color: #553000">gameSystemList</span>) {
     *     ... = gameSystem.<span style="color: #CC4747">getParticipateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfParticipate> loadParticipate(ReferrerConditionSetupper<DbParticipateCB> refCBLambda) {
        myBhv().loadParticipate(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerParticipate = refLs);
        return hd -> hd.handle(new DbLoaderOfParticipate().ready(_referrerParticipate, _selector));
    }

    protected List<DbRuleBook> _referrerRuleBook;

    /**
     * Load referrer of ruleBookList by the set-upper of referrer. <br>
     * RULE_BOOK by game_system_id, named 'ruleBookList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameSystemList</span>, <span style="color: #553000">systemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemLoader</span>.<span style="color: #CC4747">loadRuleBook</span>(<span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bookCB</span>.setupSelect...
     *         <span style="color: #553000">bookCB</span>.query().set...
     *         <span style="color: #553000">bookCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bookLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bookLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGameSystem gameSystem : <span style="color: #553000">gameSystemList</span>) {
     *     ... = gameSystem.<span style="color: #CC4747">getRuleBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfRuleBook> loadRuleBook(ReferrerConditionSetupper<DbRuleBookCB> refCBLambda) {
        myBhv().loadRuleBook(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRuleBook = refLs);
        return hd -> hd.handle(new DbLoaderOfRuleBook().ready(_referrerRuleBook, _selector));
    }

    protected List<DbScenarioGameSystem> _referrerScenarioGameSystem;

    /**
     * Load referrer of scenarioGameSystemList by the set-upper of referrer. <br>
     * SCENARIO_GAME_SYSTEM by game_system_id, named 'scenarioGameSystemList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameSystemList</span>, <span style="color: #553000">systemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemLoader</span>.<span style="color: #CC4747">loadScenarioGameSystem</span>(<span style="color: #553000">systemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">systemCB</span>.setupSelect...
     *         <span style="color: #553000">systemCB</span>.query().set...
     *         <span style="color: #553000">systemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">systemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    systemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGameSystem gameSystem : <span style="color: #553000">gameSystemList</span>) {
     *     ... = gameSystem.<span style="color: #CC4747">getScenarioGameSystemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameSystemId_InScope(pkList);
     * cb.query().addOrderBy_GameSystemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfScenarioGameSystem> loadScenarioGameSystem(ReferrerConditionSetupper<DbScenarioGameSystemCB> refCBLambda) {
        myBhv().loadScenarioGameSystem(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerScenarioGameSystem = refLs);
        return hd -> hd.handle(new DbLoaderOfScenarioGameSystem().ready(_referrerScenarioGameSystem, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbGameSystem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
