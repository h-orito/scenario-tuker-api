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
 *     RULE_BOOK, SCENARIO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     ruleBookList, scenarioList
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

    protected List<DbScenario> _referrerScenario;

    /**
     * Load referrer of scenarioList by the set-upper of referrer. <br>
     * SCENARIO by game_system_id, named 'scenarioList'.
     * <pre>
     * <span style="color: #0000C0">gameSystemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameSystemList</span>, <span style="color: #553000">systemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemLoader</span>.<span style="color: #CC4747">loadScenario</span>(<span style="color: #553000">scenarioCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">scenarioCB</span>.setupSelect...
     *         <span style="color: #553000">scenarioCB</span>.query().set...
     *         <span style="color: #553000">scenarioCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">scenarioLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    scenarioLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGameSystem gameSystem : <span style="color: #553000">gameSystemList</span>) {
     *     ... = gameSystem.<span style="color: #CC4747">getScenarioList()</span>;
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
    public NestedReferrerLoaderGateway<DbLoaderOfScenario> loadScenario(ReferrerConditionSetupper<DbScenarioCB> refCBLambda) {
        myBhv().loadScenario(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerScenario = refLs);
        return hd -> hd.handle(new DbLoaderOfScenario().ready(_referrerScenario, _selector));
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
