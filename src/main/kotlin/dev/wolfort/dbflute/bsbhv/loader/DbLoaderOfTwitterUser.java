package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of TWITTER_USER as TABLE. <br>
 * <pre>
 * [primary key]
 *     twitter_user_id
 *
 * [column]
 *     twitter_user_id, user_id, twitter_id, screen_name, access_token, token_secret, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     twitter_user_id
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
 *     user
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfTwitterUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbTwitterUser> _selectedList;
    protected BehaviorSelector _selector;
    protected DbTwitterUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfTwitterUser ready(List<DbTwitterUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbTwitterUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbTwitterUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfUser _foreignUserLoader;
    public DbLoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new DbLoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbTwitterUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
