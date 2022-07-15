package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of USER_SCENARIO as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_scenario_id
 *
 * [column]
 *     user_scenario_id, user_id, scenario_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_scenario_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     SCENARIO, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     scenario, user
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfUserScenario {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbUserScenario> _selectedList;
    protected BehaviorSelector _selector;
    protected DbUserScenarioBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfUserScenario ready(List<DbUserScenario> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbUserScenarioBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbUserScenarioBhv.class); return _myBhv; } }

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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbUserScenario> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
