package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of PARTICIPATE as TABLE. <br>
 * <pre>
 * [primary key]
 *     participate_id
 *
 * [column]
 *     participate_id, scenario_id, user_id, disp_order, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     participate_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     SCENARIO, USER, PARTICIPATE_IMPRESSION(AsOne)
 *
 * [referrer table]
 *     PARTICIPATE_ROLE, PARTICIPATE_IMPRESSION
 *
 * [foreign property]
 *     scenario, user, participateImpressionAsOne
 *
 * [referrer property]
 *     participateRoleList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfParticipate {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbParticipate> _selectedList;
    protected BehaviorSelector _selector;
    protected DbParticipateBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfParticipate ready(List<DbParticipate> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbParticipateBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbParticipateBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbParticipateRole> _referrerParticipateRole;

    /**
     * Load referrer of participateRoleList by the set-upper of referrer. <br>
     * PARTICIPATE_ROLE by participate_id, named 'participateRoleList'.
     * <pre>
     * <span style="color: #0000C0">participateBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">participateList</span>, <span style="color: #553000">participateLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">participateLoader</span>.<span style="color: #CC4747">loadParticipateRole</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbParticipate participate : <span style="color: #553000">participateList</span>) {
     *     ... = participate.<span style="color: #CC4747">getParticipateRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParticipateId_InScope(pkList);
     * cb.query().addOrderBy_ParticipateId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfParticipateRole> loadParticipateRole(ReferrerConditionSetupper<DbParticipateRoleCB> refCBLambda) {
        myBhv().loadParticipateRole(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerParticipateRole = refLs);
        return hd -> hd.handle(new DbLoaderOfParticipateRole().ready(_referrerParticipateRole, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfScenario _foreignScenarioLoader;
    public DbLoaderOfScenario pulloutScenario() {
        if (_foreignScenarioLoader == null)
        { _foreignScenarioLoader = new DbLoaderOfScenario().ready(myBhv().pulloutScenario(_selectedList), _selector); }
        return _foreignScenarioLoader;
    }

    protected DbLoaderOfUser _foreignUserLoader;
    public DbLoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new DbLoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    protected DbLoaderOfParticipateImpression _foreignParticipateImpressionAsOneLoader;
    public DbLoaderOfParticipateImpression pulloutParticipateImpressionAsOne() {
        if (_foreignParticipateImpressionAsOneLoader == null)
        { _foreignParticipateImpressionAsOneLoader = new DbLoaderOfParticipateImpression().ready(myBhv().pulloutParticipateImpressionAsOne(_selectedList), _selector); }
        return _foreignParticipateImpressionAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbParticipate> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
