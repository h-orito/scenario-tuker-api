package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of USER_FOLLOW as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_follow_id
 *
 * [column]
 *     user_follow_id, from_user_id, to_user_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_follow_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     userByFromUserId, userByToUserId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfUserFollow {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbUserFollow> _selectedList;
    protected BehaviorSelector _selector;
    protected DbUserFollowBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfUserFollow ready(List<DbUserFollow> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbUserFollowBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbUserFollowBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfUser _foreignUserByFromUserIdLoader;
    public DbLoaderOfUser pulloutUserByFromUserId() {
        if (_foreignUserByFromUserIdLoader == null)
        { _foreignUserByFromUserIdLoader = new DbLoaderOfUser().ready(myBhv().pulloutUserByFromUserId(_selectedList), _selector); }
        return _foreignUserByFromUserIdLoader;
    }

    protected DbLoaderOfUser _foreignUserByToUserIdLoader;
    public DbLoaderOfUser pulloutUserByToUserId() {
        if (_foreignUserByToUserIdLoader == null)
        { _foreignUserByToUserIdLoader = new DbLoaderOfUser().ready(myBhv().pulloutUserByToUserId(_selectedList), _selector); }
        return _foreignUserByToUserIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbUserFollow> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
