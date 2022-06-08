package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of PARTICIPATE_ROLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     participate_role_id
 *
 * [column]
 *     participate_role_id, participate_id, participate_role_type, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     participate_role_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PARTICIPATE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     participate
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfParticipateRole {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbParticipateRole> _selectedList;
    protected BehaviorSelector _selector;
    protected DbParticipateRoleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfParticipateRole ready(List<DbParticipateRole> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbParticipateRoleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbParticipateRoleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfParticipate _foreignParticipateLoader;
    public DbLoaderOfParticipate pulloutParticipate() {
        if (_foreignParticipateLoader == null)
        { _foreignParticipateLoader = new DbLoaderOfParticipate().ready(myBhv().pulloutParticipate(_selectedList), _selector); }
        return _foreignParticipateLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbParticipateRole> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
