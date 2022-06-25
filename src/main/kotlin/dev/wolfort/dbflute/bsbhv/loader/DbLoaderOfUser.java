package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of USER as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_id
 *
 * [column]
 *     user_id, user_name, uid, twitter_user_name, authority, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     PARTICIPATE, USER_FOLLOW
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     participateList, userFollowByFromUserIdList, userFollowByToUserIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbUser> _selectedList;
    protected BehaviorSelector _selector;
    protected DbUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfUser ready(List<DbUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbParticipate> _referrerParticipate;

    /**
     * Load referrer of participateList by the set-upper of referrer. <br>
     * PARTICIPATE by user_id, named 'participateList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadParticipate</span>(<span style="color: #553000">participateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">participateCB</span>.setupSelect...
     *         <span style="color: #553000">participateCB</span>.query().set...
     *         <span style="color: #553000">participateCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">participateLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    participateLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbUser user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getParticipateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfParticipate> loadParticipate(ReferrerConditionSetupper<DbParticipateCB> refCBLambda) {
        myBhv().loadParticipate(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerParticipate = refLs);
        return hd -> hd.handle(new DbLoaderOfParticipate().ready(_referrerParticipate, _selector));
    }

    protected List<DbUserFollow> _referrerUserFollowByFromUserId;

    /**
     * Load referrer of userFollowByFromUserIdList by the set-upper of referrer. <br>
     * USER_FOLLOW by from_user_id, named 'userFollowByFromUserIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadUserFollowByFromUserId</span>(<span style="color: #553000">followCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followCB</span>.setupSelect...
     *         <span style="color: #553000">followCB</span>.query().set...
     *         <span style="color: #553000">followCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbUser user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getUserFollowByFromUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFromUserId_InScope(pkList);
     * cb.query().addOrderBy_FromUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfUserFollow> loadUserFollowByFromUserId(ReferrerConditionSetupper<DbUserFollowCB> refCBLambda) {
        myBhv().loadUserFollowByFromUserId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserFollowByFromUserId = refLs);
        return hd -> hd.handle(new DbLoaderOfUserFollow().ready(_referrerUserFollowByFromUserId, _selector));
    }

    protected List<DbUserFollow> _referrerUserFollowByToUserId;

    /**
     * Load referrer of userFollowByToUserIdList by the set-upper of referrer. <br>
     * USER_FOLLOW by to_user_id, named 'userFollowByToUserIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadUserFollowByToUserId</span>(<span style="color: #553000">followCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followCB</span>.setupSelect...
     *         <span style="color: #553000">followCB</span>.query().set...
     *         <span style="color: #553000">followCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbUser user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getUserFollowByToUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setToUserId_InScope(pkList);
     * cb.query().addOrderBy_ToUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfUserFollow> loadUserFollowByToUserId(ReferrerConditionSetupper<DbUserFollowCB> refCBLambda) {
        myBhv().loadUserFollowByToUserId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserFollowByToUserId = refLs);
        return hd -> hd.handle(new DbLoaderOfUserFollow().ready(_referrerUserFollowByToUserId, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
