package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of AUTHOR as TABLE. <br>
 * <pre>
 * [primary key]
 *     author_id
 *
 * [column]
 *     author_id, author_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     author_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     SCENARIO_AUTHOR
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     scenarioAuthorList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfAuthor {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbAuthor> _selectedList;
    protected BehaviorSelector _selector;
    protected DbAuthorBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfAuthor ready(List<DbAuthor> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbAuthorBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbAuthorBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbScenarioAuthor> _referrerScenarioAuthor;

    /**
     * Load referrer of scenarioAuthorList by the set-upper of referrer. <br>
     * SCENARIO_AUTHOR by author_id, named 'scenarioAuthorList'.
     * <pre>
     * <span style="color: #0000C0">authorBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">authorList</span>, <span style="color: #553000">authorLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">authorLoader</span>.<span style="color: #CC4747">loadScenarioAuthor</span>(<span style="color: #553000">authorCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">authorCB</span>.setupSelect...
     *         <span style="color: #553000">authorCB</span>.query().set...
     *         <span style="color: #553000">authorCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">authorLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    authorLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbAuthor author : <span style="color: #553000">authorList</span>) {
     *     ... = author.<span style="color: #CC4747">getScenarioAuthorList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAuthorId_InScope(pkList);
     * cb.query().addOrderBy_AuthorId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfScenarioAuthor> loadScenarioAuthor(ReferrerConditionSetupper<DbScenarioAuthorCB> refCBLambda) {
        myBhv().loadScenarioAuthor(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerScenarioAuthor = refLs);
        return hd -> hd.handle(new DbLoaderOfScenarioAuthor().ready(_referrerScenarioAuthor, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbAuthor> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
